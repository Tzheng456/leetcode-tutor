package Advanced.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
//        int[] arr = {1,0};
        int[] arr = {1,2,3,0};
        solve(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // {2, 1, 0, 3}
        }
    }

    public static void solve(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int newVal = arr[arr[i]];
            int encoded = curr * n + newVal;
            arr[arr[i]] = encoded / n;
            arr[i] = encoded % n;
        }
    }
}
// 0 1 2 3 - index
// 1 2 3 0 - original
// 2 3 0 1 - a[a[i]]
// 2 1 0 3 - != ??? why...