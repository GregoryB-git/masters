/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package androidx.datastore.preferences.protobuf;

public abstract class d {
    public static final Class a = d.a("libcore.io.Memory");
    public static final boolean b;

    static {
        boolean bl = d.a("org.robolectric.Robolectric") != null;
        b = bl;
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
        return a;
    }

    public static boolean c() {
        if (a != null && !b) {
            return true;
        }
        return false;
    }
}

