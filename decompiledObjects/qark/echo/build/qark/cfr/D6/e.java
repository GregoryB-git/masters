/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package D6;

import D6.d;

public abstract class e {
    public static d a;
    public static long b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void a(d d8) {
        if (d8.f != null) throw new IllegalArgumentException();
        if (d8.g != null) throw new IllegalArgumentException();
        if (d8.d) {
            return;
        }
        // MONITORENTER : D6.e.class
        long l8 = b;
        if (l8 + 8192L > 65536L) {
            // MONITOREXIT : D6.e.class
            return;
        }
        b = l8 + 8192L;
        d8.f = a;
        d8.c = 0;
        d8.b = 0;
        a = d8;
        // MONITOREXIT : D6.e.class
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static d b() {
        // MONITORENTER : D6.e.class
        d d8 = a;
        if (d8 != null) {
            a = d8.f;
            d8.f = null;
            b -= 8192L;
            // MONITOREXIT : D6.e.class
            return d8;
        }
        // MONITOREXIT : D6.e.class
        return new d();
    }
}

