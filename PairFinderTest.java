import java.util.Arrays;

public class PairFinderTest {

    public static void main(String[] args) {
        // Test Case 1: Pair exists
        int[] array1 = {3, 5, 2, 7, 9, 11, 6, 4, 1, 8};
        int target1 = 10;
        int[] result1 = PairFinder.findPair(array1, target1);
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Target 1: " + target1);
        System.out.println("Result 1: " + Arrays.toString(result1));

        // Test Case 2: Pair does not exist
        int[] array2 = {3, 5, 2, 7, 9, 11, 6, 4, 1, 8};
        int target2 = 20;
        int[] result2 = PairFinder.findPair(array2, target2);
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Target 2: " + target2);
        System.out.println("Result 2: " + Arrays.toString(result2));
    }
}
