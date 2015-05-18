public class Main {
	public static void main(String[] args){
		SimpleArrayList list = new SimpleArrayList();
		System.out.println(list.get(0));
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(12);
		System.out.println(list.get(2));
		System.out.println(list.get(5));
		System.out.println(list.set(2, 100));
		System.out.println(list.get(2));
		System.out.println(list.set(5, 100));
		System.out.println(list.remove(2));
		System.out.println(list.get(2));
		System.out.println(list.remove(2));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		list.clear();
		System.out.println(list.get(0));
		SimpleArrayList list2 = new SimpleArrayList(5);
		System.out.println(list2.get(3));
		System.out.println(list2.get(9));
		for(int i = 0; i < list2.size(); i++){
     		list2.set(i, i);
		}
		for(int i = 0; i < 5; i++){
    		 list.add(i);
		}
		System.out.println(list.retainAll(list2));
		for(int i = 0; i < list.size(); i++){ 
     		System.out.println(list.get(i)); 
		}
		list2.remove(0);
		list2.remove(2);
		System.out.println(list.retainAll(list2));
		for(int i = 0; i < list.size(); i++){ 
     		System.out.println(list.get(i));
		}
		
	}
}
