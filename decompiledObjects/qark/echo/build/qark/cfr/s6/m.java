/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package s6;

import s6.j;
import s6.l;
import t6.h;
import u6.F;

public abstract class m {
    public static final F a = new F("NONE");
    public static final F b = new F("PENDING");

    public static final j a(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = h.a;
        }
        return new l(object2);
    }

    public static final /* synthetic */ F b() {
        return a;
    }

    public static final /* synthetic */ F c() {
        return b;
    }
}

