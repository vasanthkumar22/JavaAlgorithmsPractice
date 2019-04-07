package array;

public class MergeTwoSortedInPlace {
    public static void main(String[] args) {

        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        merge(nums1, 3, nums2, 3);
        for(int k: nums1){
            System.out.println(nums1[k]);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n;

        if(m == 0){
            for(int l=0; l<n; l++)
                nums1[l] = nums2[l];
        }

        while(i >= 0 && j >= 0){
            if(nums1[i]> nums2[j])
                nums1[--k] = nums1[i--];
            else
                nums1[--k] = nums2[j--];
        }

        while(j>=0){
            nums1[--k]=nums2[j--];
        }

    }
}
