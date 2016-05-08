
package com.iit.ssa.state;
/**
 * 
 * @author Smriti
 * Checkpin state that checks pin and moves to ready or remains in idle if pin is incorrect
 *
 */
public class CheckPin extends State {
	
	/**
	 * checks if pin is correct
	 */
	public void correctPin() {
		outputProcessor.displayMenu();
	}
	/**
	 * displays too many attempts wrong pin is entered
	 */
	public void incorrectPinMaxAttempts() {
		outputProcessor.tooManyAttemptsMsg();
	}
	/**
	 * user can logout from this state
	 */
	public void logout() {
		outputProcessor.displayLoggedOut();
	}

	public void incorrectPin(int a) {
		outputProcessor.displayIncorrectPin();
	}

}
