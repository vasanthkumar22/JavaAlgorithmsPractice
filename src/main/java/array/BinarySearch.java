package array;

public class BinarySearch {
    public static void main(String[] args) {
        //int a[] = {6,7,9,0,1,2,4,5};
        //int a[] = {7,8,9,0,1,2,4,5,6};
        //int a[] = {4,5,6,7,0,1,2};
        //int a[] = {4,5,6,7,8,1,2,3};
        int a[] = {1,1};


        System.out.println(binarySearch2(a, 0, a.length-1, 2));

    }

    public static int binarySearch(int[] a, int start, int end, int target){
        if(start == end){
            if(a[start] == target){
                return start;
            }
            return -1;
        }


        int mid = (start+end)/2;
        if(a[mid] == target){
            return mid;
        }
        else if(a[mid] < target)
            return binarySearch(a, mid+1, end, target);
        else
            return binarySearch(a, start, mid-1, target);


    }

    public static int binarySearch1(int[] a, int start, int end, int target){
        if(end<start) return -1;
        if(start == end){
            if(a[start] == target){
                return start;
            }
            return -1;
        }


        int mid = (start+end)/2;
        if(a[mid] == target){
            return mid;
        }


        if(a[mid] < target && a[end] > target)
            return binarySearch1(a, mid+1, end, target);
        else
            if(a[mid] < target && a[end] < target)
        {
            if(a[mid] > a[end]){
                return binarySearch1(a, mid+1, end, target);
            }
            else{
                return binarySearch1(a, start, mid-1, target);
            }
        }
        else if(a[mid] > target && a[end] > target)
        {
            if(a[mid] > a[end]){
                return binarySearch1(a, mid+1, end, target);
            }
            else{
                return binarySearch1(a, start, mid-1, target);
            }
        }
        else if(a[mid] > target && a[end] < target)
        {
            return binarySearch1(a, start, mid-1, target);
        }
        else
            return binarySearch1(a, mid+1, end, target);


    }


    public static boolean binarySearch2(int[] a, int start, int end, int target){
        if(end<start) return false;
        if(start == end){
            if(a[start] == target){
                return true;
            }
            return false;
        }


        int mid = (start+end)/2;
        if(a[mid] == target){
            return true;
        }


        if(a[mid] < target && a[end] > target)
            return binarySearch2(a, mid+1, end, target);
        else
        if(a[mid] < target && a[end] < target)
        {
            if(a[mid] > a[end]){
                return binarySearch2(a, mid+1, end, target);
            }
            else{
                return binarySearch2(a, start, mid-1, target);
            }
        }
        else if(a[mid] > target && a[end] > target)
        {
            if(a[mid] > a[end]){
                return binarySearch2(a, mid+1, end, target);
            }
            else{
                return binarySearch2(a, start, mid-1, target);
            }
        }
        else if(a[mid] > target && a[end] < target)
        {
            return binarySearch2(a, start, mid-1, target);
        }
        else
            return binarySearch2(a, mid+1, end, target);


    }
}
