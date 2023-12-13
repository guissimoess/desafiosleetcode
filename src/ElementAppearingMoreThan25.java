public class ElementAppearingMoreThan25 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));

    }

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quarter = n / 4;

        for (int i = 0; i < n - quarter; i++) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i];
            }
        }
        return -1;
    }
}
