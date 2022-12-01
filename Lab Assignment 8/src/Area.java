class Circle
{
	static final double pi=Math.PI;
	public void Area (double r,double r1)
	{
		double area=pi*r*r;
		System.out.println("Area of a first circle "+area);
		
		double area1=pi*r1*r1;
		System.out.println("Area of a second circle "+area1);
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle A=new Circle();
		A.Area(4, 20);
		
	}

}
