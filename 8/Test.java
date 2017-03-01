
public class Test {
	public static void main(String [] args){
		Circle3 myCircle=new Circle3(5.0);
		printCircle(myCircle);
	}
	
	public static void printCircle(Circle3 c){
		System.out.println("the area of the circle of radius "+c.getRadius()+ " is "+c.getArea());
	}

}
