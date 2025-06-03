/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  java.lang.Object
 *  java.lang.String
 */
package U4;

import android.os.Trace;

public abstract class c {
    public static void a() {
        Trace.endSection();
    }

    public static void b(String string2) {
        Trace.beginSection((String)string2);
    }
}

