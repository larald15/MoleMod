package com.mod.molemod.utilities.custom;

import net.minecraft.entity.player.EntityPlayer;

public class CustomTimer {

    public boolean checkTime(long startTime, long endTime, EntityPlayer player) {
        if(endTime > (startTime + player.getCooldownPeriod())) {
            return true;
        } else {
            return false;
        }
    }

}
