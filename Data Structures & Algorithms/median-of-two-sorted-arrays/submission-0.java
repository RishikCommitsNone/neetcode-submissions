class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int s = nums1.length + nums2.length;

        int l = 0;
        int r = 0;
        int size = 0;

        if (s % 2 == 0) {

            int index1 = s / 2;
            int index2 = (s / 2) + 1;

            double curr1 = 0;
            double curr2 = 0;

            while (l < nums1.length || r < nums2.length) {

                double curr_value;

                if (l == nums1.length) {
                    curr_value = nums2[r];
                    r++;
                }
                else if (r == nums2.length) {
                    curr_value = nums1[l];
                    l++;
                }
                else {
                    if (nums1[l] <= nums2[r]) {
                        curr_value = nums1[l];
                        l++;
                    }
                    else {
                        curr_value = nums2[r];
                        r++;
                    }
                }

                size++;

                if (size == index1) {
                    curr1 = curr_value;
                }

                if (size == index2) {
                    curr2 = curr_value;
                    return (curr1 + curr2) / 2.0;
                }
            }

        } else {

            int index = (s + 1) / 2;

            while (l < nums1.length || r < nums2.length) {

                double curr_value;

                if (l == nums1.length) {
                    curr_value = nums2[r];
                    r++;
                }
                else if (r == nums2.length) {
                    curr_value = nums1[l];
                    l++;
                }
                else {
                    if (nums1[l] <= nums2[r]) {
                        curr_value = nums1[l];
                        l++;
                    }
                    else {
                        curr_value = nums2[r];
                        r++;
                    }
                }

                size++;

                if (size == index) {
                    return curr_value;
                }
            }
        }

        return 0.0;
    }
}