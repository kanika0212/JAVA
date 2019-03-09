class ClassOne{
	
	public void printOne(){
		System.out.println("Class ONE");
	}
}

class ClassTwo extends ClassOne{
	
	public void printTwo(){
		System.out.println("class Two");
	}
	
}

class ClassThree extends ClassTwo{
	
	public void printThree(){
		System.out.println("class THREE");
	}
	
}
public class MultiLevel_Inheritance {

	public static void main(String[] args){
		
		ClassThree object = new ClassThree();
		object.printOne();
		object.printTwo();
		object.printThree();
	}
	
}
