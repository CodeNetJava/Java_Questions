/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String str = "ag36vgh387";
		String str1 = str.replaceAll("[0-9]",""); //remove numbers
		String str2 = str.replaceAll("[^0-9]",""); //remove alphabets
		String str3 = str1 + str2; 
		System.out.println(str3);
// 		System.out.print(str.replaceAll("[0-9]",""));
// 		System.out.print(str.replaceAll("[^0-9]",""));
		
	}
}
