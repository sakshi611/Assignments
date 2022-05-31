package assignment_day10.Question4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int reatangleArea = 2*(length+breadth);
		return reatangleArea;
	}

	@Override
	public int squareArea(int side) {
		int squareArea = side*side;
		return squareArea;
	}

	@Override
	public int circleArea(int radius) {
		int circleArea = (4/3)*(22/7)*(radius*radius);
		return circleArea;
	}
	
}
