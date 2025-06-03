/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package y6;

import u6.F;
import y6.a;
import y6.b;

public abstract class c {
    public static final F a = new F("NO_OWNER");
    public static final F b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean bl) {
        return new b(bl);
    }

    public static /* synthetic */ a b(boolean bl, int n8, Object object) {
        if ((n8 & 1) != 0) {
            bl = false;
        }
        return c.a(bl);
    }

    public static final /* synthetic */ F c() {
        return a;
    }
}

