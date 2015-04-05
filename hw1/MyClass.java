/*
FILE NAME: MyClass.java
AUTHUR NAME:CHIH FANG TAN
SCHOOL ID:B00404017
LAST MODIFY DATE:2015/3/28
THIS IS HOMEWORK 1 OF OBJECT ORIENT PROGRAMMING COURSE
*/
public class MyClass {
	public String isLeapYear(int i){
  		//we calculate i whether i can divide by 400 of i can divide by 4 and not divide by 100
		if((i%400 == 0  || (i%4==0 &&i%100!=0) ))   
		{
			return "Y";//if yes, return Y
		}else
		{
			return "N";//if no, return N
		}			
		
		
  		
  	}
}