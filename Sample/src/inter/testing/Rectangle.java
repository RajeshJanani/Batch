package inter.testing;

public class Rectangle implements Polygon
{
	public void getarea(int length, int breadth)
	{
		System.out.println("The Area of a Rectangle is" + (length*breadth));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle re = new Rectangle();
re.getarea(5, 6);

	}

}
