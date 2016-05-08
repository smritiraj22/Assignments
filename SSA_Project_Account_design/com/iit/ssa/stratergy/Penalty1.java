
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *class penalty applied on account 1
 */
public class Penalty1 extends Penalty {
	public void penalty(float p) {
		float bal = 0;
		float amt = 0;
		bal = ds.getFloatBal();
		amt = bal - p;
		ds.setFloatBal(amt);
	}
}
