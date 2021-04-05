/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

// class Element implements Comparable<Element> {
//     public Integer x;
//
//     public Element() {
//         x = 0;
//     }
//
//     public int compareTo(Element other) {
//         return x.compareTo(other.x);
//     }
// }

public class Selection {

    public static <Key extends Comparable<Key>> void sort(Key[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }

    private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
        return v.compareTo(w) < 0;
    }

    private static <Key extends Comparable<Key>> void exch(Key[] a, int i, int j) {
        Key swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        a[0] = 10;
        a[1] = 5;
        a[2] = 20;
        a[3] = 1;
        a[4] = 2;
        Selection.sort(a);
        for (int i = 0; i < 5; i++)
            System.out.println(a[i]);
    }
}
