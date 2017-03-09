
public class PolymorphismDemo {
	public static void main(String [] args){
		displayObject(new Circle4(1,"red",false));
		displayObject(new Rectangle1(1,1,"black",true));
	}
	
	
	public static void displayObject(GeometricObject1 object){
		System.out.println("Created on "+object.getDateCreated()+" . Color is"+ object.getColor());
	}

}


//circle4类和rectang1均为GometricObject1类的子类，所以在displayobject调用的时候，即进行了对象geometricobject1的多态处理
