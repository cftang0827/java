public class Main {
	public static void main(String[] args){
		MyClass myClass = new MyClass();
		//String target = "tall";
		//String replacement = "short";
		//String sentense = "i am tall";
		String target = "How";
		String replacement = "love";
		String sentense = "How I hate to get up in the morning!";
		
		
		System.out.println(myClass.replaceWord(target, replacement, sentense));
	}
}
