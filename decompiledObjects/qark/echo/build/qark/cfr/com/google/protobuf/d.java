/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.protobuf;

public abstract class d {
    public static boolean a;
    public static final Class b;
    public static final boolean c;

    static {
        b = d.a("libcore.io.Memory");
        boolean bl = !a && d.a("org.robolectric.Robolectric") != null;
        c = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class a(String string2) {
        try {
            return Class.forName((String)string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Class b() {
        return b;
    }

    public static boolean c() {
        if (!a && (b == null || c)) {
            return false;
        }
        return true;
    }
}

