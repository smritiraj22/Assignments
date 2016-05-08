package com.iit.ssa.MDAEFSM;

import com.iit.ssa.state.State;

/**
 * 
 * @author Smriti
 *
 */

public class MDA {
	State presentState;
	State[] listOfStates = new State[10];
	int attempts;

	public void setStates(State a) {
		presentState = a;
	}
	/**
	 * List of states is set
	 * @param idle
	 * @param checkPin
	 * @param checkMinBal
	 * @param ready
	 * @param locked
	 * @param overdrawn
	 * @param suspended
	 */
	public void setStatesList(State idle, State checkPin, State checkMinBal, State ready, State locked, State overdrawn,
			State suspended) {
		listOfStates[0] = idle;
		listOfStates[1] = checkPin;
		listOfStates[2] = checkMinBal;
		listOfStates[3] = ready;
		listOfStates[4] = locked;
		listOfStates[5] = overdrawn;
		listOfStates[6] = suspended;
	}
	/**
	 * opens an account sets state to idle
	 */
	public void open() {
		presentState = listOfStates[0];
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			presentState.open();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;

		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	
	/**
	 * logins if pin is correcct and sets state to check pin
	 */
	public void login() {
		presentState = listOfStates[0];
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			presentState.login();
			presentState.datastore();
			presentState = listOfStates[1];
			attempts = 0;

			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * remains in idle state if pin is incorrect
	 */
	public void incorrectLogin() {
		presentState = listOfStates[0];
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			presentState.inCorrectLogin();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * logs out and goes to idle state from
	 * 
	 *1.checkpin
	 *2.ready
	 *3.overdrawn
	 */
	public void logout() {
		presentState = listOfStates[0];
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			presentState.logout();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;
		}
		case 1: {
			presentState.logout();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.logout();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState.logout();
			presentState.datastore();
			presentState = listOfStates[0];
			attempts = 0;
			break;
		}
		case 6: {
			break;
		}
		}
	}
	/**
	 * core function of deposit allows deposit from ready and overdrawn state
	 * can stay in ready state if deposit done in  ready state
	 * moves to overdrawn from ready state for a stipulated balance amount
	 */
	public void deposit() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.deposit();
			presentState = listOfStates[2];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState.deposit();
			presentState = listOfStates[2];
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}

		}
	}
	/**
	 * displays the balance from states
	 * 1.ready
	 * 2.overdrawn
	 * 3.suspended
	 */
	public void balance() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.balance();

			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			presentState.balance();
			break;
		}
		case 5: {
			presentState.balance();
			break;
		}
		case 6: {
			presentState.balance();
			break;
		}

		}
	}
	/**
	 * if balance is above min then changes state to ready if pin is correct and balance above minimum
	 */
	public void correctpinabovemin() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			presentState.correctPin();
			presentState = listOfStates[3];

			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 *  * if balance is below min then changes state to overdrawn if pin is correct and balance below minimum
	 * 
	 */
	public void correctpinbelowmin() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			presentState.correctPin();
			presentState = listOfStates[5];

			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 *  * if balance is above min then changes state to ready 
	 *  operations that use it 
	 *  1.are deposit from overdrwan state
	 *  2.withdraw from ready state
	 *  
	 * 
	 */
	public void aboveminbal() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			presentState = listOfStates[3];
			presentState.aboveMinBal();
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState = listOfStates[3];
			presentState.aboveMinBal();
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 *  * if balance is below min then changes state to overdrawn 
	 *  operations that use it 
	 *  1.are deposit from overdrawn state
	 *  2.withdraw from ready state
	 *  
	 * 
	 */
	public void belowminbal() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			presentState = listOfStates[5];		
			presentState.belowMinBal();
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState = listOfStates[5];
			presentState.belowMinBal();
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * checks maximum number of attempts to enter correct pin
	 * @param max
	 */
	public void incorrectpin(int max) {
		int currentState = presentState.getStateId();
		switch (currentState) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			attempts++;
			if (attempts < max) {
				presentState.incorrectPin(max);
				break;
			}
			if (attempts == max) {
				presentState.incorrectPinMaxAttempts();
				presentState = listOfStates[0];
				break;
			}

			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * diaplay that there are no funds in account to withdraw
	 */
	public void noFunds() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.belowMinBal();
			presentState=listOfStates[3];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState.belowMinBal();
			presentState=listOfStates[5];
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * Allows withdrawal of a certain amount from only ready state
	 */
	public void withdraw() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.withdraw();
			presentState = listOfStates[2];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState.withdraw();
			presentState = listOfStates[2];
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}

		}
	}
	/**
	 * when withdrawal is made and state goes to overdrawn then applies a penalty only once
	 * @param penalty
	 */
	public void belowminbalwithpanelty(int penalty) {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			presentState.belowMinBalWithPanelty(penalty);
			presentState = listOfStates[5];			
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * locks the account if pin is correct
	 */
	public void lock() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.lock();
			presentState = listOfStates[4];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			presentState.lock();
			presentState = listOfStates[4];
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}

		}

	}
	/**
	 * cant lock the account as pin is incorrect
	 */
	public void incorrectLock() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.lockUnsuccesful();
			presentState = listOfStates[3];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * unlocks the account if pin is correct
	 */
	public void unlock() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			presentState.unlock();
			presentState = listOfStates[2];
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * doesn't unlock the account if pin is incorrect
	 */
	public void incorrectUnlock() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			presentState.unlockUnsuccesful();
			presentState = listOfStates[4];
			break;
		}

		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		}
	}
	/**
	 * suspends the account
	 */
	public void suspend() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			presentState.suspend();
			presentState = listOfStates[6];
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}

		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}

		}
	}
	/**
	 * activates the suspended account
	 */
	public void activate() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			presentState.activate();
			presentState = listOfStates[3];
			break;
		}

		}
	}
	/**
	 * permanantly closes the account
	 */
	public void close() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 1: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 2: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 3: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 4: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 5: {
			System.out.println(" Operations not possible in current state "+presentState.getClass().toString());
			break;
		}
		case 6: {
			presentState.close();
			presentState = null;
			break;
		}

		}
	}
	/**
	 * displays the lis of states
	 */
	public void displaystate() {
		int currentSt = presentState.getStateId();
		switch (currentSt) {
		case 0: {
			System.out.println("Start state : ");
			break;
		}
		case 1: {
			System.out.println("Idle state : ");
			break;
		}
		case 2: {
			System.out.println("Check Pin state : ");
			break;
		}
		case 3: {
			System.out.println("Check Min balance state : ");
			break;
		}
		case 4: {
			System.out.println("Ready state : ");
			break;
		}
		case 5: {
			System.out.println("Locked state : ");
			break;
		}
		case 6: {
			System.out.println("Overdrawn state : ");
			break;
		}
		}

	}

}
