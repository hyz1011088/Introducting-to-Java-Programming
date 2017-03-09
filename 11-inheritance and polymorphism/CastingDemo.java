
public class CastingDemo {
	public static void main(String [] args){
		Object object1=new Circle4(1);               //将子类实例转换成父类实例
		Object object2=new Rectangle1(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object){    //由于调用的是Object对象，object对象没有getArea和getColor方法，所以需要进行object instanceof Circle4和object instanceof Rectangle1转换
		if(object instanceof Circle4){             //
			System.out.println("the circle area is "+(((Circle4)object).getArea()));    //将父类object实例转换为子类Circle变量，显式转换Explicit casting
		}
		else if(object instanceof Rectangle1){
			System.out.println("the rectangle area is "+((Rectangle1)object).getColor());
		}
	}

}
