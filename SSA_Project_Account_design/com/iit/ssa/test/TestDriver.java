
package com.iit.ssa.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.iit.ssa.MDAEFSM.MDA;
import com.iit.ssa.MDAEFSM.OutputProcessor;
import com.iit.ssa.accounts.Account1;
import com.iit.ssa.accounts.Account2;
import com.iit.ssa.factory.ConcreteFactory1;
import com.iit.ssa.factory.ConcreteFactory2;
import com.iit.ssa.state.CheckMinBalance;
import com.iit.ssa.state.CheckPin;
import com.iit.ssa.state.Idle;
import com.iit.ssa.state.Locked;
import com.iit.ssa.state.Overdrawn;
import com.iit.ssa.state.Ready;
import com.iit.ssa.state.Suspended;
import com.iit.ssa.stratergy.DataStore;
/**
 * My test Driver class to perform MDA EFSM operations
 * @author Smriti
 *
 */
public class TestDriver {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		try {

			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			//Enter type of account to perform operations
			System.out.println("Select Type of Account:");
			System.out.println("1. Account 1 :");
			System.out.println("2. Account 2 :");

			int ch = (int) Float.parseFloat(buf.readLine());

			switch (ch) {
			case 1: {
				//creates respective Account objects
				//creates respective Factory objects
				//creates respective State objects
				Account1 account1 = new Account1();

				Idle idle = new Idle();				
				Locked lock = new Locked();				
				CheckMinBalance checkminbal = new CheckMinBalance();				
				CheckPin checkpin = new CheckPin();				
				Ready ready = new Ready();				
				Overdrawn overdrawn = new Overdrawn();				
				Suspended sus=new Suspended();

				MDA mdaobj = new MDA();
				OutputProcessor op = new OutputProcessor();
				ConcreteFactory1 cf1 = new ConcreteFactory1();

				DataStore objdata;
				objdata = cf1.getAllData();
				account1.setMDA(mdaobj);
				account1.setFactory(cf1);
				account1.setData(objdata);

				idle.setOutProcessor(op); 
				idle.setStateId(0);

				checkpin.setOutProcessor(op); 
				checkpin.setStateId(1);

				checkminbal.setOutProcessor(op); 
				checkminbal.setStateId(2);

				ready.setOutProcessor(op);
				ready.setStateId(3);

				lock.setOutProcessor(op); 
				lock.setStateId(4);

				overdrawn.setOutProcessor(op); 
				overdrawn.setStateId(5);
				
				sus.setOutProcessor(op); 
				sus.setStateId(6);

				mdaobj.setStates(idle); 
				mdaobj.setStatesList(idle, checkpin, checkminbal, ready, lock, overdrawn,sus); 

				op.setData(objdata);
				op.setfactory(cf1);

				String input = null;
				int i;
				//Provide choice of operations
				while (true) {
					System.out.println(
							"Enter operation:  \n 1:Open \n 2:Login \n 3:Pin \n 4:Balance \n 5:Deposit \n 6:Withdraw \n 7:Lock \n 8:Unlock \n 9:Logout \n 10:Checkstate ");

					input = buf.readLine();
					i = Integer.parseInt(input);

					switch (i) {
					case 1:
						System.out.println("enter pin");
						String pin = buf.readLine();
						System.out.println("enter userId");
						String uid = buf.readLine();
						System.out.println("enter balance");
						float bal = Float.parseFloat(buf.readLine());
						account1.open(pin, uid, bal); 

						break;

					case 3:
						System.out.println("enter pin");
						pin = buf.readLine();
						account1.pin(pin); 
						break;
					
					case 2:
						System.out.println("enter user id");
						uid = buf.readLine();
						account1.login(uid);

						break;

					case 4:
						account1.balance();

						break;

					case 5:
						System.out.println("enter the amount to deposit");
						float depositamount =  Float.parseFloat(buf.readLine());
						account1.deposit(depositamount);
						break;

					case 6:
						System.out.println("enter the amount to withdraw");
						float withdrawamtamount =  Float.parseFloat(buf.readLine());
						account1.withdraw(withdrawamtamount);
						break;

					case 7:
						System.out.println("Enter pin");
						pin = buf.readLine();
						account1.lock(pin);
						break;

					case 8:
						System.out.println("Enter pin");
						pin = buf.readLine();
						account1.unlock(pin);
						break;

					case 9:
						mdaobj.logout();
						break;

					case 10:
						mdaobj.displaystate();
						break;
					
					default:
						System.out.println("incorrect choice");
					}
				}
			}
			case 2: {
				//creates respective Account objects
				//creates respective Factory objects
				//creates respective State objects
				Account2 account2 = new Account2();
				Idle idle = new Idle();
				Locked locked = new Locked();
				CheckMinBalance checkminbal = new CheckMinBalance();
				CheckPin checkpin = new CheckPin();
				Ready ready = new Ready();
				Overdrawn overdrawn = new Overdrawn();
				Suspended sus=new Suspended();
				
				MDA mdaobj = new MDA();
				OutputProcessor op = new OutputProcessor();
				ConcreteFactory2 cf2 = new ConcreteFactory2();
				DataStore objdata;
				objdata = cf2.getAllData();
				account2.setMDA(mdaobj);
				account2.setfactory(cf2);
				account2.setdata(objdata);

				idle.setOutProcessor(op);
				idle.setStateId(0);

				checkpin.setOutProcessor(op);
				checkpin.setStateId(1);

				checkminbal.setOutProcessor(op);
				checkminbal.setStateId(2);

				ready.setOutProcessor(op);
				ready.setStateId(3);

				locked.setOutProcessor(op);
				locked.setStateId(4);

				overdrawn.setOutProcessor(op);
				overdrawn.setStateId(5);

				sus.setOutProcessor(op); 
				sus.setStateId(6);
				
				mdaobj.setStates(idle);
				mdaobj.setStatesList(idle, checkpin, checkminbal, ready, locked, overdrawn,sus);

				op.setData(objdata);
				op.setfactory(cf2);

				String input = null;
				int i;
				//Provide choice of operations
				while (true) {
					System.out.println(
							"Enter operation:  \n 1:Open \n 2:Login \n 3:Pin \n 4:Balance \n 5:Deposit \n 6:Withdraw \n 7:suspend \n 8:activate \n 9:Logout \n 10:Close \n");

					input = buf.readLine();
					i = Integer.parseInt(input);

					switch (i) {
					case 1:
						System.out.println("enter pin");
						int pin = (int) Float.parseFloat(buf.readLine());
						System.out.println("enter user id");
						int userId = (int) Float.parseFloat(buf.readLine());
						System.out.println("enter balance");
						int bal = (int)Float.parseFloat(buf.readLine());
						account2.OPEN(pin, userId,bal);
						break;
					
					case 2:
						System.out.println("enter user id");
						int uid = Integer.parseInt(buf.readLine());
						account2.LOGIN(uid);
						break;

					case 3:
						System.out.println("enter pin");
						pin = Integer.parseInt(buf.readLine());
						account2.PIN(pin);
						break;

					case 4:
						account2.BALANCE();
						break;

					case 5:
						System.out.println("enter the amount to deposit");
						int deposit = (int)Float.parseFloat(buf.readLine());
						account2.DEPOSIT(deposit);
						break;

					case 6:
						System.out.println("enter the amount to withdraw");
						int with = (int)Float.parseFloat(buf.readLine());
						account2.WITHDRAW(with);
						break;				

					case 7:
						mdaobj.suspend();
						break;
					case 8:
						mdaobj.activate();						
						break;
					case 9:
						mdaobj.logout();
						break;
					case 10:
						mdaobj.close();


					default:
						System.out.println("incorrect choice");
					}
				}
			}

			}

		} catch (Exception ex) {
			System.out.println("Incorrect Format entered please eneter digits");
			
		}

	}

}
