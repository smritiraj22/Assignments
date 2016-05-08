
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *
 */
public class Deposit1 extends Deposit {
	/**
	 * actual deposit implemented for account 1
	 */
	public void deposit() {

		float a = ds.getTempFloatDepositAmt();
		float b = ds.getFloatBal();
		
		float bal = a + b;
		ds.setFloatBal(bal);
	}

}
