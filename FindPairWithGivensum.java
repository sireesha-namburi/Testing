package topcrowd;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FindPairWithGivensum {
	
	 class Pair<U, V> {

	    private final U first;
	    private final V second;

	    private Pair(U first, V second) {
	        this.first = first;
	        this.second = second;
	    }

	 //   public static <U, V> Pair<U, V> of(U first, V second) {
	   // 	return new Pair<>(first, second);}

	    public U getFirst() {
	        return first;
	    }

	    public V getSecond() {
	        return second;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (!(obj instanceof Pair)) {
	            return false;
	        }
	        Pair<?, ?> other = (Pair<?, ?>) obj;
	        return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(first, second);
	    }
	}
	 
	  public static Pair<Integer, Integer> findPair(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return Pair.of(complement, nums[i]);
	            }
	            map.put(nums[i], i);
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 5, 2, -4, 8, 11};
	        int target = 7;
	        Pair<Integer, Integer> pair = findPair(nums, target);
	        if (pair == null) {
	            System.out.println("No pair found with sum equal to " + target);
	        } else {
	            System.out.println("Pair found: " + pair.getFirst() + ", " + pair.getSecond());
	        }
	    }

}
