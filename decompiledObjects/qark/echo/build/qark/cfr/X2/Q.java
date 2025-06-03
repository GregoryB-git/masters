/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Map
 */
package X2;

import X2.k;
import java.util.Arrays;
import java.util.Map;

public abstract class Q {
    public static Object[] a(Object[] arrobject, int n8, int n9, Object[] arrobject2) {
        return Arrays.copyOfRange((Object[])arrobject, (int)n8, (int)n9, (Class)arrobject2.getClass());
    }

    public static Object[] b(Object[] arrobject, int n8) {
        if (arrobject.length != 0) {
            arrobject = Arrays.copyOf((Object[])arrobject, (int)0);
        }
        return Arrays.copyOf((Object[])arrobject, (int)n8);
    }

    public static Map c() {
        return k.r();
    }
}

