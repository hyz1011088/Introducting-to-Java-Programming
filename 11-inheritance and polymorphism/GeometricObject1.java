
public class GeometricObject1 {
	private String color="white";
	private boolean filled;
	private java.util.Date dataCreated;
	
	public GeometricObject1(){           //空构造函数非常重要，一定要有，不然会报错：Implicit super constructor xx() is undefined for default constructor. Must define an explicit constructor  
		
	}
	
	public GeometricObject1(String color,boolean filled){
		dataCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	
	public java.util.Date getDateCreated(){
		return dataCreated;
	}
	
	public String toString(){
		return "created on "+dataCreated+"\ncolor: "+color+" and filled: "+filled;
	}

}




