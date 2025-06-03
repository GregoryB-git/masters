/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package q3;

import k3.t;

public abstract class q {
    public static int a() {
        Integer n8 = t.a();
        if (n8 != null) {
            return n8;
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals((Object)System.getProperty((String)"java.vendor"));
    }
}

