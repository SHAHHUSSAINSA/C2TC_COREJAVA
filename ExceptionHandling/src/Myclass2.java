
public class Myclass2 {

	public static void main(String[] args) {
		Myclass2 ob = new Myclass2();

		try

		{

		ob.meth1();

		}

		catch(ArithmeticException e)

		{

		System.out.println("ArithmaticExceptionthrown by meth1() method is caught inmain()method");

		}

		}

		public void meth1()

		{

		try

		{

		System.out.println(100/0);

		}

		catch(NullPointerException nullExp)

		{

		System.out.println("We have an Exception- "+nullExp);

		}

		System.out.println("Outside try-catchblock");

		}
}
