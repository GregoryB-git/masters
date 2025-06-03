/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 */
package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.Intent;

public class IntentUtils {
    public static boolean isActivityAvailable(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }

    public static boolean safeStartActivity(Context context, Intent intent) {
        if (IntentUtils.isActivityAvailable(context, intent)) {
            context.startActivity(intent);
            return true;
        }
        return false;
    }
}

