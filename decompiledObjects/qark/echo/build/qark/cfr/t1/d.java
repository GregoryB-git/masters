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

public abstract class d {
    public static void a(String string2, int n8) {
        Trace.beginAsyncSection((String)string2, (int)n8);
    }

    public static void b(String string2, int n8) {
        Trace.endAsyncSection((String)string2, (int)n8);
    }
}

