
package com.iit.ssa.state;

/**
 * 
 * @author Smriti
 * Intermediate that checks balance and changes state to ready or overdrawn
 *
 */
public class CheckMinBalance extends State {
	/**
	 * checks balance and applies penalty 
	 */
	public void belowMinBalWithPanelty(int penalty) {
		outputProcessor.penalty(penalty);
	}
	/**
	 * displays balance below minimum
	 */
	public void belowMinBal() {
		outputProcessor.displayBalance();
		outputProcessor.noFundsMsg();
	}
	
	/**
	 * displays balance above minimum
	 */
	public void aboveMinBal() {
		outputProcessor.displayBalance();
	}
}
