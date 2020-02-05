import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}
		
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n <= 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> combined = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			combined.add(values.get(i));
		}

		for (int i = values.size() - n; i < values.size(); i++) {
			combined.add(values.get(i));
		}

		return combined;

	}
	
	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int largest = numbers.get(0);
		int smallest = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}
			if (numbers.get(i) < smallest) {
				smallest = numbers.get(i);
			}
		}
	   int difference = largest - smallest;
		return difference;

	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
