package array;

public class TwoSortedArrayMedian {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int count;
        double m1 = -1, m2 =-1;
        int i=0,j=0;

        if((m+n) % 2 == 1){
            for(count =0; count <= (m+n)/2; count++){
                if(i != m && j != n){
                    m1 = nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
                }
                else if(i < m){
                    m1 = nums1[i++];
                }
                else {
                    m1 = nums2[j++];
                }
            }
            return m1;

        }else{
            for(count = 0; count <= (m+n)/2; count++){
                m2 = m1;
                if(i != m && j != n){
                    m1 = nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
                }
                else if(i < m){
                    m1 = nums1[i++];
                }
                else {
                    m1 = nums2[j++];
                }
            }
            return (m1+m2)/2;
        }

    }
}
