/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package p4;

import android.content.Context;
import android.util.Log;

public class s {
    public static s c;
    public Boolean a = null;
    public Boolean b = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static s a() {
        synchronized (s.class) {
            try {
                if (c != null) return c;
                c = new s();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean b(Context context) {
        if (this.b == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
            this.b = bl;
        }
        if (!this.a.booleanValue() && Log.isLoggable((String)"FirebaseInstanceId", (int)3)) {
            Log.d((String)"FirebaseInstanceId", (String)"Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }

    public boolean c(Context context) {
        if (this.a == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
            this.a = bl;
        }
        if (!this.a.booleanValue() && Log.isLoggable((String)"FirebaseInstanceId", (int)3)) {
            Log.d((String)"FirebaseInstanceId", (String)"Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a;
    }
}

