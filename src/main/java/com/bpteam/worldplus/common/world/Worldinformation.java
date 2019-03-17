package com.bpteam.worldplus.common.world;

public class Worldinformation {

    public static boolean wind_state;
    public static int wind_level;

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
}
