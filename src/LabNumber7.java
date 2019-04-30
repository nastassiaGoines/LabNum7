
import java.util.Scanner;
import java.util.regex.Pattern;

public class LabNumber7 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println(getName(scnr, "Enter your name: "));
		System.out.println(getEmail(scnr, "Enter your Email: "));
		System.out.println(getPhone(scnr, "Enter your phone number(in this format: xxx-xxx-xxxx): "));
		System.out.println(getDate(scnr, "Enter the date(in this format(dd/mm/yyyy): "));
	}

	public static String getName(Scanner scnr, String prompt) {
		String name = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			name = scnr.next();
			if (Pattern.matches("^[A-Z][a-z]{1,30}", name)) {
				isValid = true;
			} else {

				System.out.println("Error! Invalid integer value. Try again.");
			}
			scnr.nextLine(); // discard any other data entered on the line
		}
		return name;
	}

	public static String getEmail(Scanner scnr, String prompt) {
		String mail = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			mail = scnr.next();
			if (Pattern.matches("[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}.[A-Za-z0-9]{2,3}", mail)) {
				isValid = true;
			} else {

				System.out.println("Error! Invalid integer value. Try again.");
			}
			scnr.nextLine(); // discard any other data entered on the line
		}
		return mail;

	}

	public static String getPhone(Scanner scnr, String prompt) {
		String phoneNum = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			phoneNum = scnr.next();
			if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNum)) {
				isValid = true;
			} else {

				System.out.println("Error! Invalid integer value. Try again.");
			}
			scnr.nextLine(); // discard any other data entered on the line
		}
		return phoneNum;

	}

	public static String getDate(Scanner scnr, String prompt) {
		String date = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			date = scnr.next();
			if (Pattern.matches("(([1-2][0-9])|([1-9])|(3[0-1]))/((1[0-2])|([1-9]))/[0-9]{4}", date)) {
				isValid = true;
			} else {

				System.out.println("Error! Invalid integer value. Try again.");
			}
			scnr.nextLine(); // discard any other data entered on the line
		}
		return date;

	}
}