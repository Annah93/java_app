/* This is where packages and imports should go if needed*/

//creating the outer class that is public and can be used by other classes
public class MainClass{

	//Creating the main method where execuition begins
	public static void main(String args[])
	{
		//we are creating a char a and assigned a value of capital A to it.
		char a = 'A';
		//here we are incrementing the A value
		a++;
		//here we are printing the integer value of the a that is 'A'
		System.out.println((int)a);
//*********************************************************************************************************
		int x = 3;
        //int y = ++x * 5 / x-- + --x;
        int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		//System.out.println("y is " + y);
//*********************************************************************************************************
		String reference = "hello";
		int lent = reference.length();
		System.out.println(lent);

//**********************************************************************************************************
		//class JustAnnahThings{
			//public static void main(String args[]){
		System.out.println("Moon" + 10 + 20);
		System.out.println(1 + 2 + "Moon");
//*********************************************************************************************************
		String s1 = "Java"; //we are creating a variable s1 of that type String and  assigning java to it
		String s2 = new String("Java"); // we are creating a object of string s2 and using a new operator to create String s2 and assign java also to it
		System.out.println(s1==s2);
//***************************************************************************************************************
		final String w;
		w = "Moon";                 //explain 
      		//w = "Sky";
      	System.out.println(w);
  //******************************************************************************************************
      	int score = 180;
      	String grade;
      	if(score >= 90) grade = "A";
		if(score >= 80) grade = "B";
		if(score >= 70) grade = "C";   //why D
		if(score >= 60) grade = "D";
		else grade = "E";
		System.out.println(grade);
/**********************************************************************************************************
		int num = 100;
		if(num>0){
			if(num>10){
					SOP("Hie");
			}else{
					SOP("Hello");
        }else{SOP("BYE");}}

*/
        int oneNumber = 1;
	System.out.println(oneNumber--);
//*****************************************************************************************************************
	int v, i, z , t;
	v =4; i = 8;
	//z * = --i - i-- + ++i + v++ - ++v;
	System.out.println(v+ "" + i);
//*********************************************************************************
	int hourOfDay = 9;
	int morningGreetingCount = 0;
	if(hourOfDay < 11) {
 	   System.out.println("Good Morning");
           morningGreetingCount++;
}
	int hourDay = 9;
	int morningGreetCount = 0;
	if(hourDay < 11) 
 	   System.out.println("Good Morning");
           morningGreetCount++;

}	
}