
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int N = lee.nextInt();
        int[] pd = new int[N];

        for (int i = 0; i < N; i++) {
            pd[i] = lee.nextInt();
        }
        mergeSort(pd, 0, N - 1);

        int[] ac = new int[N];
        ac[0] = pd[0];
        for (int i = 1; i < N; i++) {
            ac[i] = ac[i - 1] + pd[i];
        }

        int Q = lee.nextInt();
        for (int i = 1; i <= Q; i++) {
            int pm = lee.nextInt();
            int cd = binarySearch(pd, pm);
            System.out.println((cd + 1) + " " + (cd == -1 ? 0 : ac[cd]));
        }
    }

    static void mergeSort(int[] v, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(v, l, mid);
            mergeSort(v, mid + 1, r);
            merge(v, l, mid, r);
        }
    }

    static void merge(int[] v, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = v[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = v[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                v[k] = L[i];
                i++;
            } else {
                v[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            v[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            v[k] = R[j];
            j++;
            k++;
        }
    }

    static int binarySearch(int[] v, int pm) {
        int left = 0;
        int right = v.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (v[mid] <= pm) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }
}

