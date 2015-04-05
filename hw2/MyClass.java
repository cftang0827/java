/*
FILE NAME: MyClass.java
AUTHUR NAME:CHIH FANG TAN
SCHOOL ID:B00404017
LAST MODIFY DATE:2015/3/28
THIS IS HOMEWORK 2 OF OBJECT ORIENT PROGRAMMING COURSE
*/

public class MyClass {
  	public String replaceWord(String target, String replacement, String sentense){
  		int index = sentense.indexOf(target, 0);//this is the index of target first character
		if(index == -1)
		{
			return sentense;//if we cannot find the same string in the sentence, then we return original sentence
		}else{
		String sub1 = sentense.substring(0,index);	
		String sub2 = sentense.substring(index+target.length(), sentense.length());
		//we split sentence into two subsentence without target sentence
		String output = sub1 + replacement  + sub2;//and we merge two subsentence with replacement string
		
		return output;
		}
  	}
}



