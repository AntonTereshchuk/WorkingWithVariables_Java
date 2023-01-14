package travelcost;

public class TravelCost {

	public static void main(String[] args) {
	
		double fuelCostPerLiter = 1.2;
		double fuelConsumptionPer100Km = 8.0;
		
		double travelCost = fuelConsumptionPer100Km / 100 * 120 * fuelCostPerLiter;
		
		System.out.println("Travel cost: " + travelCost + " $");
		

	}

}
