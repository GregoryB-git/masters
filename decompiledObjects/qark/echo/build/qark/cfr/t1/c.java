/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  java.lang.Object
 *  java.lang.String
 */
package t1;

import android.os.Trace;

public abstract class c {
    public static void a(String string2) {
        Trace.beginSection((String)string2);
    }

    public static void b() {
        Trace.endSection();
    }
}

