public class Load {
	private double annualInterestRate;
	private int numberOfYears;
	private double loadAmount;
	private java.util.Date loadDate;
	
	public Load(){
		this(2.5,1,1000);
	}
	
	public Load(double annualInterestRate,int numberOfYears,double loadAmount){
		this.annualInterestRate=annualInterestRate;
		this.numberOfYears=numberOfYears;
		this.loadAmount=loadAmount;
		loadDate=new java.util.Date();
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;	
	}
	
	
	public int getNumberOfYears(){
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears=numberOfYears;
	}
	
	public double getLoadAmount(){
		return loadAmount;
	}
	
	public void setLoadAmount(double loadAmount){
		this.loadAmount=loadAmount;
	}
	
	public double getMonthlyPayment(){
		double monthlyInterestRate=annualInterestRate/1200;
		double monthlyPayment=loadAmount*monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate), numberOfYears*12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment(){
		double totalPayment=getMonthlyPayment()*numberOfYears*12;
		return totalPayment;
	}
	
	public java.util.Date getLoadDate(){
		return loadDate;
	}

}
