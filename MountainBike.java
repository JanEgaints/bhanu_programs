package Inheritance_bicycle;

class MountainBike extends Bicycle 
{
	public int chainRings;
	
	public MountainBike(double diameterOfWheel, double currentPedalCadence, int currentGear, int chainRings)
	{
		super(diameterOfWheel, currentPedalCadence, currentGear);
		this.chainRings = chainRings;
	}


	public void calculateCurrentSpeed(double wheelDiameter, double cadence, int gear)
	{
		 double currentSpeed= (cadence*(gear/1.2)*6.28*wheelDiameter*3)/50;
		 System.out.println("currentSpeed="+ currentSpeed);
		 System.out.println("MountainBike");
	}
}
