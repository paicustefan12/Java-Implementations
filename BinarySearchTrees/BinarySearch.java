/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class BinarySearch {


    public int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid])
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch a = new BinarySearch();
        int[] b = { 3, 4, 10, 20, 50, 60, 70 };
        System.out.println(a.binarySearch(b, 5));

    }

}

