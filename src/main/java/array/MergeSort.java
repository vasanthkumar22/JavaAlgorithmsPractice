package array;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {4, 10, 3, 5, 1, -1,11,15,8,6};
        //int[] a = {1,-1,11,15,8,6};
        sort(a, 0, a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2;
            sort(a, start, mid);
            sort(a, mid + 1, end);
            merge(a, start, mid, end);
        }

    }

    private static void merge(int[] a, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        //create temp arrays
        int t1[] = new int[n1];
        int t2[] = new int[n2];

        for(int i=0; i < n1; i++){
            t1[i] = a[start+i];
        }

        for(int j=0; j < n2; j++){
            t2[j] = a[mid+1+j];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while(i < n1 && j < n2){

            if(t1[i]<t2[j]){
                a[k++] = t1[i++];
            }
            else
                a[k++] = t2[j++];
        }

        while(i< n1){
            a[k++] = t1[i++];
        }

        while(j<n2){
            a[k++] = t2[j++];
        }

    }
}


