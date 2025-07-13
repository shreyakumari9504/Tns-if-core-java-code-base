package tnsif.synchronization;

public interface Bank {

	static final int MINBAl=5000;
	static final int DAILY_LIMIT=25000;
	void deposit (int amt) throws DepositLimtException;
	void withdraw(int amt) throws InsufficientBalanceException;

}
