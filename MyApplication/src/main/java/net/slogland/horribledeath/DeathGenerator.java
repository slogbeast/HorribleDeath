package net.slogland.horribledeath;

import android.*;
import android.R;

/**
 * Created by root on 7/5/13.
 * tproy
 *
 * inteded for use with a toy app for android
 * gives a random death that may kill you today
 * based on CDC gross death rate tables
 */
public class DeathGenerator {

    public DeathGenerator()
    {}

    private int GetDeath()
    {
        return 0;
    }

    public int AddDeath(R.string name, R.string desc)
    {
        int index = UpdateDeathList(name, desc);
        return index;
    }

    private int UpdateDeathList(R.string n, R.string desc)
    {
        int i = 0;
        // add database update code here
        // return index, nonzero indicates success
        return i;
    }
}
