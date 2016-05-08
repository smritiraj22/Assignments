package com.iit.ssa.state;

/**
 * 
 * @author Smriti
 *state reached when balance is below stipulated minimum for account 1
 */
public class Overdrawn extends State {
	/**
	 * withdraws from accout
	 */
	public void withdraw() {
		outputProcessor.noFundsMsg();
	}
	/**
	 * displays the account has below minimum balance
	 */
	public void belowMinBal() {
		outputProcessor.displayBalance();
		outputProcessor.noFundsMsg();
	}
	/**
	 * displays balance
	 */
	public void balance() {
		outputProcessor.displayBalance();
	}
	/**
	 * displays unlock unsuccessful as pin is incorrect
	 */
	public void lockUnsuccesful() {
		outputProcessor.displayIncorrectPin();
	}
	/**
	 * deposits into account
	 */
	public void deposit() {
		outputProcessor.makeDeposit();
	}
	/**
	 * locks the account
	 */
	public void lock() {
		outputProcessor.displayLocked();
	}
	/**
	 * logsout from the account
	 */
	public void logout() {
		outputProcessor.displayLoggedOut();
	}

}
