import java.util.ArrayList;
import java.util.List;

/**
 * This class can test whether an integer is a prime number or not. It can also
 * give a list of all prime numbers up to a given upper limit.
 * 
 * @author Zhen Chen
 *
 */

public class PrimeNumber {
	public static boolean TestPrimeNumber(int a) {
		int stop = (int) Math.sqrt(a);
		boolean result = true;

		if (a < 2) {
			result = false;
		} else if (a > 2) {
			for (int i = 2; i <= stop; i++) {
				if (a % i == 0) {
					result = false;
					break;
				}
			}
		}

		return result;
	}

	public static boolean TestPrimeNumber(int a, List<Integer> known) {
		int stop = (int) Math.sqrt(a);
		boolean result = true;

		if (a < 2) {
			result = false;
		} else if (a > 2) {
			for (Integer i : known) {
				if (i > stop) {
					break;
				}
				if (a % i == 0) {
					result = false;
					break;
				}
			}
		}

		return result;
	}

	public static List<Integer> ListPrimeNumbers(int upper) {
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 2; i <= upper; i++) {
			if (TestPrimeNumber(i)) {
				result.add((Integer) i);
			}
		}

		return result;
	}

}
