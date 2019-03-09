/**
 * 
 */

/**
 * @author Kanika
 *
 */
class CLASS_ONE{
	
	public void printOne(){
		
		System.out.println("Class One");
	}
}

class CLASS_TWO extends CLASS_ONE{
	
	public void printTwo(){
		
		System.out.println("Class Two");
	}
}

class CLASS_THREE extends CLASS_ONE{
	
	public void printThree(){
		
		System.out.println("Class Three");
	}
}
public class Hirarchical_Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLASS_THREE object3 = new CLASS_THREE();
		CLASS_TWO object2 = new CLASS_TWO();
		// Reading Class one via classtwo
		System.out.println("Reading via class Two");
		object2.printOne();
		object2.printTwo();
		//Reading Class one via classThree
		System.out.println("Reading via class Three");
		object3.printOne();
		object3.printThree();
		
		
	}

}
