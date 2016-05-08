
package com.iit.ssa.stratergy;
/**
 * 
 * abstract class Stores all the data for account
 * @author Smriti
 *
 */
public abstract class DataStorage {
    DataStore ds;
    
    public abstract void storeData();
    
    public void setdata(DataStore dt)
    {
        ds=dt;
    }
}
