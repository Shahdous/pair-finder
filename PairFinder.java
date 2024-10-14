public class PairFinder {

    public static int[] findPair(int[] arr, int target) 
    {
    
        return findPairHelper(arr, target, 0);
    }

    private static int[] findPairHelper(int[] arr, int target, int idx) 
    {
    
        if (idx >= arr.length) {
            return null;
        }
        
        int[] res = findMatch(arr, target, idx, idx + 1);
        
        if (res != null) {
            return res;
        }
        
        return findPairHelper(arr, target, idx + 1);
    }

    private static int[] findMatch(int[] arr, int target, int idx, int curr) 
    {
    
        if (curr >= arr.length) {
            return null;
        }
        
        if (arr[idx] + arr[curr] == target) 
        {
            return new int[]{idx, curr};
        }
        return findMatch(arr, target, idx, curr + 1);
    }
}
