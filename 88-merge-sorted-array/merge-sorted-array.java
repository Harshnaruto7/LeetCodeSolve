class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

                int ans[] = new int[m+n];


        for (int i = 0; i < m; i++) {

            ans[i] = nums1[i];

          


        }


        for (int j = 0; j < n; j++) {

                ans[j+m] = nums2[j];

        }


        Arrays.sort(ans);

        for (int i = 0; i < ans.length; i++) {

            nums1[i] = ans[i];



        }

   

       


        



    }
}