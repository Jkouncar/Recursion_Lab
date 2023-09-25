public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
        if (index < 0) {
            return 0; // Base case: If the index is negative, return 0.
        } else {
            // Recursive case: Add the current element at 'index' to the sum of the rest of the array.
            return a[index] + sumOfArray(a, index - 1);
        }
    }
}
