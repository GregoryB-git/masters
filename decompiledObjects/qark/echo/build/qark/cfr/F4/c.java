/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package F4;

import android.util.Log;

public class c {
    public static c a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c c() {
        synchronized (c.class) {
            try {
                if (a != null) return a;
                a = new c();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void a(String string2) {
        Log.d((String)"FirebasePerformance", (String)string2);
    }

    public void b(String string2) {
        Log.e((String)"FirebasePerformance", (String)string2);
    }

    public void d(String string2) {
        Log.i((String)"FirebasePerformance", (String)string2);
    }

    public void e(String string2) {
        Log.w((String)"FirebasePerformance", (String)string2);
    }
}

