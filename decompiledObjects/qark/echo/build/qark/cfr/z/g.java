/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.reflect.Array
 */
package z;

import java.lang.reflect.Array;

public abstract class g {
    public static int[] a(int[] arrn, int n8, int n9) {
        int[] arrn2 = arrn;
        if (n8 + 1 > arrn.length) {
            arrn2 = new int[g.c(n8)];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n8);
        }
        arrn2[n8] = n9;
        return arrn2;
    }

    public static Object[] b(Object[] arrobject, int n8, Object object) {
        Object[] arrobject2 = arrobject;
        if (n8 + 1 > arrobject.length) {
            arrobject2 = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)g.c(n8));
            System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n8);
        }
        arrobject2[n8] = object;
        return arrobject2;
    }

    public static int c(int n8) {
        if (n8 <= 4) {
            return 8;
        }
        return n8 * 2;
    }
}

