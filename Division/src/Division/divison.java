package Division;

public class divison {
	public static int dvd(int number1, int number2) throws MyException{
		if (number2<0) {
			throw new MyException("�������ø���");
		}
		return (number1/number2);
	}
	
	public static void main(String[] args) {
		try {
			int result = dvd(5, 5);
			System.out.println(result);
		}
		catch (MyException e ) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e ) {
			System.out.println("��������0");
		}
		catch (Exception e) {
			System.out.println("��������");
		}
	}

}
