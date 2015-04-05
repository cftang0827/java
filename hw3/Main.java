public class Main {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		String inputText  = "Hello Hello World, I love love the World";		
		
		String replacedText = myClass.removeDuplicateWords(inputText);
		System.out.println(replacedText);
	}
}