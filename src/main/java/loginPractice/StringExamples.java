package loginPractice;

public class StringExamples {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2);
		String s=("Anagha Pravin Patil");
	String[] splittedString=s.split(" ");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	System.out.println(splittedString[1].trim());
	System.out.println("********************");
	for(String i:splittedString)
	{
		System.out.println(i);
	}
	
	String s4="Rahul Shetty Academy";
	for(int i=0;i<s4.length();i++)
	{
		System.out.println(s4.charAt(i));
	}
	System.out.println("#######################");
	for(int i=s4.length()-1;i>=0;i--)
	{
		System.out.println(s4.charAt(i));
	}
	

}
}