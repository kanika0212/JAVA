

//A Grand parent class in diamond 
class GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Grandparent"); 
 } 
} 

//First Parent class 
class Parent1 extends GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Parent1"); 
 } 
} 

//Second Parent Class 
class Parent2 extends GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Parent2"); 
 } 
} 


//Error : Test is inheriting from multiple 
//classes 
public class Multiple_inheritance_Classes extends Parent1, Parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test t = new Test(); 
		    t.fun(); 
	}

}
 