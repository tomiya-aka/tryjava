package lesson5;

public class Q4 {
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2.0;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(3.0, 2.0);
		double circleArea = calcCircleArea(1.0);

		System.out.println(triangleArea);
		System.out.println(circleArea);

	}
}
