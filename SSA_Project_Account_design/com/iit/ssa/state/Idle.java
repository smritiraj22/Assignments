
package com.iit.ssa.state;

public class Idle extends State {
	/**
	 * opns the account
	 */
	public void open() {
		outputProcessor.displayAccountOpened();
	}
	/**
	 * displays login is correct
	 */
	public void login() {
		outputProcessor.login();
	}
	/**
	 * displays if user id is in correct
	 */
	public void inCorrectLogin() {
		outputProcessor.inCorrectLogin();
	}
	/**
	 * user can logout from this state
	 */
	public void logout() {
		outputProcessor.displayLoggedOut();
	}
	/**
	 * stores data successfully
	 */
	public void datastore() {
		outputProcessor.storeData();
	}
}
