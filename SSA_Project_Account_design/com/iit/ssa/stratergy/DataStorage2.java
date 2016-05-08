
package com.iit.ssa.stratergy;
/**
 * Stores all the data for account 2
 * @author Smriti
 *
 */
public class DataStorage2 extends DataStorage
{
    public void storeData()
    {       
        int pin=ds.getTempIntPin();
        int userId=ds.getTempIntUserID();
        int b=ds.getTempIntBal();
        ds.setIntPin(pin);
        ds.setIntUserID(userId);
        ds.setIntBal(b);
    }
}
