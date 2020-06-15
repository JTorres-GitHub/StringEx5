import java.util.Scanner;

public class StringEx5 {
	public static String extraEnd(String str){
		String end;
		end = (str.substring(str.length() -2, str.length()));
		
		return str + end + end;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter a string: ");
		inputStr = input.nextLine();
		
		System.out.println(extraEnd(inputStr));
		
		input.close();
	}
}
