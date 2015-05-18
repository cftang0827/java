public class SimpleArrayList {
	private Integer[] array;
	private Integer[] temp;
	// optional variables here
	
	//default constructor
	public SimpleArrayList(){
		this(0);
	}
	
	//constructor
	public SimpleArrayList(int initialSize){
		array = new Integer[initialSize];
		for(int i = 0; i < initialSize; i++)
		{
			array[i] = 0;
		}
	}
	
	//function add an integer to the end of the list
	public void add(int a){
		temp = new Integer[array.length+1];
		for(int i = 0; i < array.length; i++)
		{
			temp[i] = array[i];
		}
		temp[array.length] = a;

		array = new Integer[temp.length];

		for(int i = 0; i < temp.length; i++)
		{
			array[i] = temp[i];
		}
		
	}
	
	//accessor
	public Integer get(int index){
		if(index < array.length )//check if over the index
		{
			return array[index];
		}else {
			return null;
		}
	}
	
	//set function
	public Integer set(int index, Integer element){
		Integer temp1 = get(index);
		if(index < array.length)
		{
			array[index] = element;
			return temp1;
		}else
		{
			return null;
		}
	}
	
	public boolean remove(int index){
		
		if(index < array.length)//check whether over the index
		{
			temp = new Integer[array.length - 1];
			for(int i = index ; i < array.length-1; i++)
			{
				array[i] = array[i + 1];
			}

			for(int i = 0 ; i < temp.length; i++)
			{
				temp[i] = array[i];
			}

			array = new Integer[temp.length];
			for(int i = 0; i< temp.length; i++)
			{
				array[i] = temp[i];
			}
			return true;
		}else 
		{
			return false;
		}
	}
	//clear all 
	public void clear(){
		array = new Integer[0];
		
		
	}
	//return size
	public int size(){
		return array.length;
	}
	
	public boolean retainAll(SimpleArrayList l){
		boolean flag = true;
		SimpleArrayList temp2 = new SimpleArrayList();
		Integer originSize = array.length;
		for(int i = 0; i<array.length; i++)
		{
			for(int j = 0; j<l.size();j++)
			{
				if(array[i] == l.get(j))
				{
					temp2.add(array[i]);
				}
				else{
					continue;
				}
			}

		}
		array = new Integer[temp2.size()];
		for(int i = 0; i < temp2.size(); i++)
		{
			array[i] = temp2.get(i);
		}

		if(temp2.size() == originSize)
		{
			return false;
		}else
		{
			return true;
		}

		
		
	}
	
	// optional methods here
}
