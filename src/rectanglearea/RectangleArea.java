package rectanglearea;

public class RectangleArea {

	public static void main(String[] args) {
		
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		System.out.println("Side a: " + sideA + " m");
		System.out.println("Side a: " + sideB + " m");
		System.out.println("Side a: " + sideC + " m");
			
		double semiPerimetr = (sideA + sideB + sideC) / 2;
		System.out.println("Semi perimetr: " + semiPerimetr + " m");
		
		double rectangleArea = Math.sqrt(semiPerimetr*(semiPerimetr-sideA)*(semiPerimetr-sideB)*(semiPerimetr-sideC));
		String result = String.format("%.2f", rectangleArea);
		System.out.println("Rectangle area: " + result + " m2");
		
	}

}
