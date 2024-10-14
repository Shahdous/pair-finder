public class SortedPairFinder {

    public static int[] findPairSorted(int[] arr, int target) 
    {
    
        return findPairSortedHelper(arr, target, 0, arr.length - 1);
    }

    private static int[] findPairSortedHelper(int[] arr, int target, int left, int right) 
    {
    
        if (left >= right) 
        {
            return null;
        }
        
        int sum = arr[left] + arr[right];
        
        if (sum == target) 
        {
            int[] result = new int[2];
            result[0] = left;
            result[1] = right;

            return result;

        } else if (sum < target) 
        {
            return findPairSortedHelper(arr, target, left + 1, right);
        } else 
        {
            return findPairSortedHelper(arr, target, left, right - 1);
        }
    }
}
