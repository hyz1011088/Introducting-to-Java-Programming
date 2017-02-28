
public class TestCircle1 {
	public static void main(String [] args){
		Circle1 circle1=new Circle1();
		System.out.println("this area of the circle of radius "+ circle1.radius+ "is "+circle1.getArea());
		
	}
	
	public static class Circle1{     //the definition of the class Circle is "static"
		double radius;
		Circle1(){
			radius=1.0;
		}
		Circle1(double newRadius){
			radius=newRadius;
		}
		double getArea(){
			return radius*radius*Math.PI;
		}
		
	}

}
