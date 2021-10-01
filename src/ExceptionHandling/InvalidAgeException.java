package ExceptionHandling;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */


	public InvalidAgeException()
	{
		System.out.println("Age can not be less then 18");
	}

}
