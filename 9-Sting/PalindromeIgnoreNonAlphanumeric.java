import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=input.nextLine();
		System.out.println("ignoring nonalphanumeric characters, \n is "+s+" a palindrome? " + isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s){
		String s1=filter(s);
		String s2=reverse(s1);
		return s2.equals(s1);
	}
	
	public static String filter(String s){
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	
	public static String reverse(String s){
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(s);  //注意一点要有这个赋值，否则下个语句会返回空值
		stringBuilder.reverse();
		return stringBuilder.toString();
	}

}
