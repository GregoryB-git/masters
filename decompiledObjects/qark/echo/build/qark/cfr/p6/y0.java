/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package p6;

import p6.Z;
import p6.l0;
import p6.m0;
import u6.F;

public abstract class y0 {
    public static final F a = new F("COMPLETING_ALREADY");
    public static final F b = new F("COMPLETING_WAITING_CHILDREN");
    public static final F c = new F("COMPLETING_RETRY");
    public static final F d = new F("TOO_LATE_TO_CANCEL");
    public static final F e = new F("SEALED");
    public static final Z f = new Z(false);
    public static final Z g = new Z(true);

    public static final /* synthetic */ F a() {
        return a;
    }

    public static final /* synthetic */ F b() {
        return c;
    }

    public static final /* synthetic */ Z c() {
        return g;
    }

    public static final /* synthetic */ Z d() {
        return f;
    }

    public static final /* synthetic */ F e() {
        return e;
    }

    public static final /* synthetic */ F f() {
        return d;
    }

    public static final Object g(Object object) {
        Object object2 = object;
        if (object instanceof l0) {
            object2 = new m0((l0)object);
        }
        return object2;
    }

    public static final Object h(Object object) {
        m0 m02 = object instanceof m0 ? (m0)object : null;
        Object object2 = object;
        if (m02 != null && (object2 = m02.a) == null) {
            return object;
        }
        return object2;
    }
}

