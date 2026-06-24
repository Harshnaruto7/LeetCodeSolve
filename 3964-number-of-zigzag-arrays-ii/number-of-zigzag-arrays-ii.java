class Solution {

    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;
        int states = 2 * m;

        long[][] transition = buildTransition(m);

        long[] initial = buildInitialVector(m);

        long[][] powerMatrix = matrixPower(transition, n - 2);

        long[] result = multiply(powerMatrix, initial);

        long ans = 0;

        for (long x : result) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }

    private long[][] buildTransition(int m) {

        int states = 2 * m;

        long[][] t = new long[states][states];

        // DOWN(y) -> UP(x)
        for (int y = 0; y < m; y++) {

            int from = m + y;

            for (int x = y + 1; x < m; x++) {

                int to = x;

                t[to][from] = 1;
            }
        }

        // UP(y) -> DOWN(x)
        for (int y = 0; y < m; y++) {

            int from = y;

            for (int x = 0; x < y; x++) {

                int to = m + x;

                t[to][from] = 1;
            }
        }

        return t;
    }

    private long[] buildInitialVector(int m) {

        int states = 2 * m;

        long[] v = new long[states];

        for (int a = 0; a < m; a++) {

            for (int b = 0; b < m; b++) {

                if (a < b) {

                    v[b]++;

                } else if (a > b) {

                    v[m + b]++;
                }
            }
        }

        return v;
    }

    private long[][] matrixPower(long[][] matrix, long power) {

        int n = matrix.length;

        long[][] result = identity(n);

        while (power > 0) {

            if ((power & 1) == 1) {
                result = multiply(result, matrix);
            }

            matrix = multiply(matrix, matrix);

            power >>= 1;
        }

        return result;
    }

    private long[][] identity(int n) {

        long[][] id = new long[n][n];

        for (int i = 0; i < n; i++) {
            id[i][i] = 1;
        }

        return id;
    }

    private long[][] multiply(long[][] a, long[][] b) {

        int n = a.length;

        long[][] c = new long[n][n];

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {

                if (a[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {

                    c[i][j] =
                        (c[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }

        return c;
    }

    private long[] multiply(long[][] matrix, long[] vector) {

        int n = matrix.length;

        long[] result = new long[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                result[i] =
                    (result[i] + matrix[i][j] * vector[j]) % MOD;
            }
        }

        return result;
    }
}