
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *class withdraw from account 1
 */
public class Withdraw2 extends Withdraw {
	public void withdraw() {
		
		int w = ds.getTempIntWithdrawAmt();
		int b = ds.getIntBal();
		int bal = b - w;
		ds.setIntBal(bal);
		ds.setTempIntBal(bal);
	}
}