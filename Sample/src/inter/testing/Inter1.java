package inter.testing;

public class Inter1 implements Printable,Showable

{
public void print()
{
	System.out.println("Print");
}

public void show()
{
	System.out.println("Show");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter1 ob = new Inter1();
ob.print();
ob.show();
	}

}
