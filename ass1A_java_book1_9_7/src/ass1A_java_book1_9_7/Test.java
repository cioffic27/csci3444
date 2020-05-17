package ass1A_java_book1_9_7;
import java.util.*;
public class Test {
	public static void main (String[] args) {
		System.out.println("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String pNum = in.next();
		String output ="";
		for (int i =0; i<pNum.length();i++) {
			char ch = Character.toUpperCase(pNum.charAt(i));
			if(Character.isLetter(ch)) {
				int digit =getNumber(ch);
				output =output + digit;
			}else {
				output = output+ch;
			}
		}
		System.out.println(output);
	}
	public static int getNumber(char upperCaseLetter) {
		if (upperCaseLetter == 'A' || upperCaseLetter =='B'|| upperCaseLetter =='C')
			return 2;
		else if (upperCaseLetter == 'D' || upperCaseLetter =='E'|| upperCaseLetter =='F')
			return 3;
		else if (upperCaseLetter == 'G' || upperCaseLetter =='H'|| upperCaseLetter =='I')
			return 4;
		else if (upperCaseLetter == 'J' || upperCaseLetter =='K'|| upperCaseLetter =='L')
			return 5;
		else if (upperCaseLetter == 'M' || upperCaseLetter =='N'|| upperCaseLetter =='O')
			return 6;
		else if (upperCaseLetter == 'P' || upperCaseLetter =='Q'|| upperCaseLetter =='R'|| upperCaseLetter =='S')
			return 7;
		else if (upperCaseLetter == 'T' || upperCaseLetter =='U'|| upperCaseLetter =='V')
			return 8;
		else if (upperCaseLetter == 'W' || upperCaseLetter =='X'|| upperCaseLetter =='Y'|| upperCaseLetter =='Z')
			return 9;
		else
			return 0;
	}
}
