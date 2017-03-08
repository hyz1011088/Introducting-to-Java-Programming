
public class Faculy extends Employee {
	public static void main(String [] args){
		new Faculy();
	}
	
	public Faculy(){
		System.out.println("(4) Performs Faculy's tasks");
	}
}

class Employee extends Person{
	public Employee(){
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks");
	}
	
	 public Employee(String s) {  
	        System.out.println(s);  
	        } 
}
	
class Person{
	public Person(){
		System.out.println("(1) Performs Person's tasks");		
	}
}

//构造方法链：任何情况下，构造一个类的实例时，将会调用沿着继承链的所有父类的构造方法；
