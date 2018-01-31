package Inheritance_bicycle;

public class TestBicycle 
{

	public static void main(String[] args)
	{
      MountainBike M = new MountainBike(.3,50,4,1);
      M.calculateCurrentSpeed(M.getDiameterOfWheel(), M.getCurrentPedalCadence(),M.currentGear);
      M.info(M.getCurrentPedalCadence(), M.currentGear);
	}
}
