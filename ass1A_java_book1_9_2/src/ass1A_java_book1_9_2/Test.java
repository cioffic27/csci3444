package ass1A_java_book1_9_2;
import java.util.*;
public class Test {
	public static void main( String [] args) {
		System.out.println("Please enter the original String : ");
		Scanner in = new Scanner (System.in);
		String search = in.nextLine();
		System.out.println(" Please enter the Substring : ");
		String substring = in.nextLine();
		boolean found = false;
			int max = search.length()-substring.length();
				test:
					for ( int i = 0; i <=max; i++) {
						int n = substring.length();
						int j =i;
						int k = 0;
					while (n-- != 0) {
						if (search.charAt(j++)!=substring.charAt(k++)) {
							continue test;
						}
					}
					found = true;
					break test;
					}
			System.out.println(found ? "Yes its a substring": "No its not a substring");
	}
}
