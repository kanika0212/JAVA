
class ONE{
	
	public void printOne(){
		System.out.println("Class ONE");
	}
}

class TWO extends ONE{
	
	public void printTwo(){
		System.out.println("class Two");
	}
	
}

public class Simple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TWO object = new TWO();
		object.printOne();
		object.printTwo();
	}

}
