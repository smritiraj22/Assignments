
package com.iit.ssa.state;

import com.iit.ssa.MDAEFSM.OutputProcessor;

/**
 * 
 * @author Smriti
 * 
 * 
 * List of states present
 * @param idle
 * @param checkPin
 * @param checkMinBal
 * @param ready
 * @param locked
 * @param overdrawn
 * @param suspended
 */

public abstract class State {
	int id;

	OutputProcessor outputProcessor;

	public int getStateId() {
		return id;
	}

	public void setStateId(int x) {
		id = x;
	}

	public void setOutProcessor(OutputProcessor o) {
		outputProcessor = o;
	}

	public void datastore() {
	}

	public void open() {
	}

	public void login() {
	}

	public void inCorrectLogin() {
	}

	public void logout() {
	}

	public void balance() {
	}

	public void deposit() {
	}

	public void withdraw() {
	}

	public void activate() {
	}

	public void suspend() {
	}

	public void belowMinBalWithPanelty(int penalty) {
	}

	public void belowMinBal() {
	}

	public void aboveMinBal() {
	}

	public void lock() {
	}

	public void unlock() {
	}

	public void unlockUnsuccesful() {
	}

	public void lockUnsuccesful() {
	}

	public void correctPin() {
	}

	public void close() {
	}

	public void incorrectPin(int max) {
	}

	public void incorrectPinMaxAttempts() {
	}

}
