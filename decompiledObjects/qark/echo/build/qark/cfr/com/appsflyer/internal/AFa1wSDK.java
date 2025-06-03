/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1eSDK;

public final class AFa1wSDK
implements AFb1eSDK {
    private static IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFb1eSDK.AFa1ySDK AFInAppEventType(@NonNull Context object) {
        int n8;
        float f8;
        Intent intent;
        Object object2;
        float f9;
        block5 : {
            block2 : {
                block3 : {
                    block4 : {
                        Object object3 = null;
                        Object object4 = null;
                        f9 = 0.0f;
                        object2 = object3;
                        try {
                            intent = object.registerReceiver(null, AFInAppEventParameterName);
                            object2 = object4;
                            f8 = f9;
                            if (intent == null) return new AFb1eSDK.AFa1ySDK(f8, (String)object2);
                            object2 = object3;
                            if (2 != intent.getIntExtra("status", -1)) break block2;
                            object2 = object3;
                            n8 = intent.getIntExtra("plugged", -1);
                            if (n8 == 1) break block3;
                            if (n8 == 2) break block4;
                            object = n8 != 4 ? "other" : "wireless";
                            break block5;
                        }
                        catch (Throwable throwable) {}
                        AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", throwable);
                        f8 = f9;
                        return new AFb1eSDK.AFa1ySDK(f8, (String)object2);
                    }
                    object = "usb";
                    break block5;
                }
                object = "ac";
                break block5;
            }
            object = "no";
        }
        object2 = object;
        n8 = intent.getIntExtra("level", -1);
        object2 = object;
        int n9 = intent.getIntExtra("scale", -1);
        object2 = object;
        f8 = f9;
        if (-1 == n8) return new AFb1eSDK.AFa1ySDK(f8, (String)object2);
        object2 = object;
        f8 = f9;
        if (-1 == n9) return new AFb1eSDK.AFa1ySDK(f8, (String)object2);
        f8 = (float)n8 * 100.0f / (float)n9;
        object2 = object;
        return new AFb1eSDK.AFa1ySDK(f8, (String)object2);
    }
}

