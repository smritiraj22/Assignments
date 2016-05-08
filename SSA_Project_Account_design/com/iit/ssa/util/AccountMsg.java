
package com.iit.ssa.util;

/**
 * 
 * @author Smriti This is a utility class provided for printing appropriate
 *         messages for the flow of the accounts.
 *         
 *
 */
public class AccountMsg {

	public void accountOpenMsg() {
		System.out.println("ACCOUNT OPENED SUCCESSFULLY PLEASE LOGIN");
	}

	public void promptPin() {
		System.out.println("ENTER PIN");
	}

	public void displayIncorrectPinMsg() {
		System.out.println(" INCORRECT PIN ENTERED");
	}

	public void displayIncorrectIDMsg() {
		System.out.println(" INCORRECT USER ID ENTERED");
	}

	public void displayLoggedInMsg() {
		System.out.println(" USER LOGGEDIN SELECT PIN TO PROCEED");
	}

	public void tooManyAttemptsMsg() {
		System.out.println(" EXCEEDED MAXIMUM ATTEMPTS TO ENTER PIN");
	}

	public void noFundsMsg() {
		System.out.println(" INSUFFICIENTS IN ACCOUNT ");
	}

	public void incorrectLockMsg() {
		System.out.println("ACCOUNT CANT BE LOCKED INCORRECT PIN");
	}

	public void incorrectUnLockMsg() {
		System.out.println("ACCOUNT CANT BE UNLOCKED INCORRECT PIN");
	}

	public void accountLocked() {
		System.out.println("ACCOUNT LOCKED");
	}

	public void accountUnLocked() {
		System.out.println("ACCOUNT UNLOCKED");
	}

	public void logoutMsg() {
		System.out.println("LOGGED OUT");
	}

	public void activate() {
		System.out.println("ACCOUNT ACTIVATED");
	}

	public void suspend() {
		System.out.println("ACCOUNT SUSPENDED");
	}

	public void closeMsg() {
		System.out.println("ACCOUNT CLOSED");
	}

}
