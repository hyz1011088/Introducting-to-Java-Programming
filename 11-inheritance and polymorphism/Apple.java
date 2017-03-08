
public class Apple extends Fruit {
	
	public static void main(String [] args){
		new Apple();
	}
	
}


class Fruit{
	
	//下面代码段如果注释掉会报错，因为Apple中没有显示的构造方法，Apple的默认无参构造方法被隐式调用，因为Apple是Fruitd的子类，所以apple的默认构造方法会自动调用
	//fruit的无参数构造方法，注释掉之后会没有无参数构造方法，因为Fruit显式地定义了构造方法，故程序无法编译，所以才会报错
	public Fruit(){
		System.out.println("Fruit's");
	}
	public Fruit(String name){
		System.out.println("Fruit's constructor is invoked");
	}
}



//Tag：最好为每一个类提供一个无参数构造方法，以避免对该类进行扩展时出现错误
