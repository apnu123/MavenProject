package loginPractice;


import java.util.Arrays;
import java.util.List;

public class ArryaAndArrayList {

	public static void main(String[] args) {
		int a[]=new int[5];
		 a[0]=1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 a[4]=5;
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println("@@@@@@@@@@@@");
		 for(int i=a.length-1;i>=0;i--)
		 {
			 System.out.println(a[i]);
		 }
		
System.out.println("+++++++++++++++++++++++++++");
int[]a1={11,12,13,14,15,16};
for(int i=0;i<a1.length;i++)
{
	System.out.println(a1[i]);
}
System.out.println("++++++++++++++++++++");
for(int i=a1.length-1;i>=0;i--)
{
	System.out.println(a1[i]);
}
System.out.println("*************************");
String[] name={"Anagha","Shiv","Ranjit","Shubham"};
List<String> arrayNames=Arrays.asList(name);
for(String i:arrayNames)
{
	System.out.println(i);
}
System.out.println(arrayNames.contains("Anagha"));



	}
}
