/*
FILE NAME: MyClass.java
AUTHUR NAME:CHIH FANG TAN
SCHOOL ID:B00404017
LAST MODIFY DATE:2015/4/6
THIS IS HOMEWORK 3 OF OBJECT ORIENT PROGRAMMING COURSE
*/


public class MyClass {
	public int calPopulation(int initialSize, int day){
		int time = day / 5;
		
		if(time ==1)
		{
			return initialSize*time;
		}
		else if(time ==0)
		{
			return initialSize;
		}
		else
		{
			int a = 0;
			int b = 1;
			for(int i = 2;i<=time+1;i++)
			{
				int temp = b;
				b = a + b;
				a = temp;
			}
			return b*initialSize;
		}
		
		//return 0;
	}
}

