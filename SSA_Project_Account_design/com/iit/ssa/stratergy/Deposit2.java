
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *
 */
public class Deposit2 extends Deposit {
	/**
	 * actual deposit implemented for account 1
	 */
	public void deposit() {
		int a = ds.getTempIntDepositAmt();

		int b = ds.getIntBal();
		int bal = a + b;
		ds.setIntBal(bal);
	}
}