package array;

public class HeapSort {
    public static void main(String[] args) {

        int[] a = {4, 10, 3, 5, 1, -1,11,15,8,6};
        //int[] a = {1,-1,11,15,8,6};
        heapSort(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }


    }

    public static void heapSort(int[] a){

        int n = a.length;
        int temp;

         //construct a maxheap
        for(int i=n/2-1; i >=0; i--){
            heapify(a, n, i);
        }

        for(int i= n-1; i > 0; i--){
            temp = a[i];
            a[i]=a[0];
            a[0] = temp;

            heapify(a,i,0);

        }
    }


    public static void heapify(int[] a, int n, int pos){

        int leftPos = 2*pos+1;
        int rightPos = 2*pos+2;
        int maxPos = pos;


        if(leftPos< n && a[leftPos] > a[pos]){
            maxPos = leftPos;
        }


        if(rightPos < n && a[rightPos] > a[maxPos]){
            maxPos = rightPos;
        }

        if(maxPos != pos){
            int temp = a[maxPos];
            a[maxPos]=a[pos];
            a[pos] = temp;
        }
        else {
            return;
        }

        heapify(a, n, maxPos);

    }
}
