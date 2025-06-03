/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package V;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

public abstract class a
extends BroadcastReceiver {
    public static final SparseArray o = new SparseArray();
    public static int p = 1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Intent intent) {
        int n8 = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (n8 == 0) {
            return false;
        }
        intent = o;
        synchronized (intent) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock)intent.get(n8);
                if (wakeLock != null) {
                    wakeLock.release();
                    intent.remove(n8);
                    return true;
                }
                wakeLock = new StringBuilder();
                wakeLock.append("No active wake lock id #");
                wakeLock.append(n8);
                Log.w((String)"WakefulBroadcastReceiv.", (String)wakeLock.toString());
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName c(Context context, Intent intent) {
        SparseArray sparseArray = o;
        synchronized (sparseArray) {
            int n8;
            try {
                n8 = p;
            }
            catch (Throwable throwable) {}
            int n9 = n8 + 1;
            p = n9;
            if (n9 <= 0) {
                p = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", n8);
            intent = context.startService(intent);
            if (intent == null) {
                return null;
            }
            context = (PowerManager)context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.core:wake:");
            stringBuilder.append(intent.flattenToShortString());
            context = context.newWakeLock(1, stringBuilder.toString());
            context.setReferenceCounted(false);
            context.acquire(60000L);
            sparseArray.put(n8, (Object)context);
            return intent;
            throw throwable;
        }
    }
}

