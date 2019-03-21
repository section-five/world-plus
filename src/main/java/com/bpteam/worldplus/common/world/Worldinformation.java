package com.bpteam.worldplus.common.world;

public class Worldinformation {
// This file is of temporary state and resets upon world leave

    public static boolean wind_state;
    public static int wind_level;
    public static int storm_amount;

    public static void setWind_state(boolean wind) {
        wind_state = wind;
    }

    public static void setWind_level(int wind_levels) {
        wind_level = wind_levels;
    }

    public static int getWind_level() {
        return wind_level;
    }

    public static boolean getWind_state() {
        return wind_state;
    }
    
    public static void setStorm_Amount(int stormamount) {
         storm_amount = stormamount;
        }
    
    public static int getStorm_Amount() {
        return storm_amount;
    }
     
}
