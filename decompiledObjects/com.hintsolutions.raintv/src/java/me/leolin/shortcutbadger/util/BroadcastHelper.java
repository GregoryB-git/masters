/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 */
package me.leolin.shortcutbadger.util;

import android.content.Context;
import android.content.Intent;

public class BroadcastHelper {
    public static boolean canResolveBroadcast(Context context, Intent intent) {
        context = context.getPackageManager();
        boolean bl = false;
        context = context.queryBroadcastReceivers(intent, 0);
        boolean bl2 = bl;
        if (context != null) {
            bl2 = bl;
            if (context.size() > 0) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

