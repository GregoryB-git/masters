/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E2;

import A2.m;

public abstract class b {
    public static boolean a(int[] arrn, int n8) {
        if (arrn == null) {
            return false;
        }
        int n9 = arrn.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (arrn[i8] != n8) continue;
            return true;
        }
        return false;
    }

    public static boolean b(Object[] arrobject, Object object) {
        int n8 = arrobject != null ? arrobject.length : 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!m.a(arrobject[i8], object)) continue;
            if (i8 < 0) break;
            return true;
        }
        return false;
    }
}

