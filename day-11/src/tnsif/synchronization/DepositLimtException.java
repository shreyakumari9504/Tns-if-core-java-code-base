package tnsif.synchronization;

public class DepositLimtException extends Exception {

	public DepositLimtException()
	{
		super("Daily Limit of deposit is exceed.....");
	}
	public DepositLimtException(String message )
	{
		super (message);
	}
}
