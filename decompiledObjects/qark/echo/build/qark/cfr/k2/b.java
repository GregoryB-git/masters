/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k2;

import k2.a;
import k2.c;

public abstract class b {
    public static Object a(int n8, Object object, a a8, c c8) {
        int n9 = n8;
        Object object2 = object;
        if (n8 < 1) {
            return a8.apply(object);
        }
        do {
            object = a8.apply(object2);
            if ((object2 = c8.a(object2, object)) == null) break;
            n9 = n8 = n9 - 1;
        } while (n8 >= 1);
        return object;
    }
}

