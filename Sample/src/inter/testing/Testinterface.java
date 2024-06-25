package inter.testing;

class rect implements Drawable
{
	public void draw()
	{
		System.out.println(" Drawing Rectangle ");
	}
}

class circle implements Drawable
{
public void draw()
{
	System.out.println(" Drawing Circle");
}
}
public class Testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rect d = new rect();
d.draw();
circle c = new circle();
c.draw();
	}

}
