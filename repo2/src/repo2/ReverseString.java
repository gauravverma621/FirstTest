package repo2;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter The String");
		String str=input.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i-=1)
		rev=rev+str.charAt(i);
		System.out.print(rev.toUpperCase());
		input.close();
		
	}

}
