
public class car {

	//name
	private String name;
	
	//5 instance variables
	private String carMake;
	private String carModel;
	private int carMilage;
	private String carColor;
	private String newOrUsed;
		
	public void setcarMake(String carMake)
	{
		this.carMake = carMake;
	}
	
	public void setcarModel(String carModel)
	{
		this.carModel = carModel;
	}
	
	public void setcarMilage(int carMilage)
	{
		this.carMilage = carMilage;
	}
	
	public void setcarColor(String carColor)
	{
		this.carColor = carColor;
	}
	
	public void setnewOrUsed(String newOrUsed)
	{
		this.newOrUsed = newOrUsed;
	}
	//3 member function methods below
	//How many miles on this car?
	public void getMilage()
	{
		System.out.println("This car has "+carMilage+" miles on it.");
	}
	
	//What color is this car?
	public void getCarColor()
	{
		System.out.println("This car color is "+carColor+".");
	}
	
	//Is this car new or used?
	public void getNewOrUsed()
	{
		System.out.println("This car is "+newOrUsed+".");
	}
}
