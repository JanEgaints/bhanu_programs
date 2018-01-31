package Inheritance_bicycle;

public class Bicycle 
{
	private double currentSpeed;
	private double diameterOfWheel;
	private double currentPedalCadence;
	public int currentGear;
	public Bicycle(double diameterOfWheel, double currentPedalCadence, int currentGear)
	{
		super();
		this.diameterOfWheel = diameterOfWheel;
		this.currentPedalCadence = currentPedalCadence;
		this.currentGear = currentGear;
	}
	public double getDiameterOfWheel()
	{
		return diameterOfWheel;
	}
	public void setDiameterOfWheel(double diameterOfWheel) 
	{
		this.diameterOfWheel = diameterOfWheel;
	}
	public double getCurrentPedalCadence() 
	{
		return currentPedalCadence;
	}
	public void setCurrentPedalCadence(double currentPedalCadence) 
	{
		this.currentPedalCadence = currentPedalCadence;
	}
	public int getCurrentGear()
	{
		return currentGear;
	}
	public void setCurrentGear(int currentGear) 
	{
		this.currentGear = currentGear;
	}
	public void info(double cadence, int gear)
	{
		System.out.println("cadence= " + cadence);
		System.out.println("currentGear is "+gear);
	}
	public void calculateCurrentSpeed(double wheelDiameter, double cadence, int gear)
	{
		 currentSpeed= (cadence*gear*6.28*wheelDiameter*3)/50;
		 System.out.println("currentSpeed="+ currentSpeed);
	}
	
}
