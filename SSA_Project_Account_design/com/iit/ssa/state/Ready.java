
package com.iit.ssa.state;

/**
 * 
 * @author Smriti Ready state allows the following operations
 *
 */
public class Ready extends State {
	/**
	 * diplays balance
	 */
	public void balance() {
		outputProcessor.displayBalance();
	}

	/**
	 * withdraws from account
	 */
	public void withdraw() {
		outputProcessor.makeWithdraw();
	}

	/**
	 * displays lock unsuccessful as pin is incorrect
	 */
	public void lockUnsuccesful() {
		outputProcessor.displayIncorrectPin();
	}

	/**
	 * displays above minimum balance
	 */
	public void aboveMinBal() {
		outputProcessor.displayBalance();
	}

	/**
	 * deposits into account
	 */
	public void deposit() {
		outputProcessor.makeDeposit();
	}

	/**
	 * suspends the account
	 */
	public void suspend() {
		outputProcessor.suspend();
	}

	/**
	 * locks the account
	 */
	public void lock() {
		outputProcessor.displayLocked();
		;
	}

	/**
	 * logsout from account
	 */
	public void logout() {
		outputProcessor.displayLoggedOut();
	}

	/**
	 * displays balance below minimum
	 */
	public void belowMinBal() {
		outputProcessor.displayBalance();
		outputProcessor.noFundsMsg();
	}
}
