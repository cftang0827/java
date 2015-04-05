/*
FILE NAME: MyClass.java
AUTHUR NAME:CHIH FANG TAN
SCHOOL ID:B00404017
LAST MODIFY DATE:2015/4/6
THIS IS HOMEWORK 3 OF OBJECT ORIENT PROGRAMMING COURSE
*/

public class MyClass {
	public String removeDuplicateWords(String inputText){
		String output = new String();//declare new string to store output
		String[] sub_string = inputText.split(" ");//split original string to small piece
		
		output = sub_string[0];//initialize output with first element
		for(int j=0;j<sub_string.length;j++)
		{
		 	if(! output.contains(sub_string[j]))
			{
				output = output + " "+sub_string[j];
			}
		}
		//find whether there are same substring in the output, if so do not add in the output string
		return output;
	}
	
	
}
