/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package w4;

import w4.a;

public class b
implements a {
    public static b a;

    public static b b() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}

