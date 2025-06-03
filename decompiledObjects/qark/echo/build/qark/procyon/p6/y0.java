// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import u6.F;

public abstract class y0
{
    public static final F a;
    public static final F b;
    public static final F c;
    public static final F d;
    public static final F e;
    public static final Z f;
    public static final Z g;
    
    static {
        a = new F("COMPLETING_ALREADY");
        b = new F("COMPLETING_WAITING_CHILDREN");
        c = new F("COMPLETING_RETRY");
        d = new F("TOO_LATE_TO_CANCEL");
        e = new F("SEALED");
        f = new Z(false);
        g = new Z(true);
    }
    
    public static final Object g(final Object o) {
        Object o2 = o;
        if (o instanceof l0) {
            o2 = new m0((l0)o);
        }
        return o2;
    }
    
    public static final Object h(final Object o) {
        m0 m0;
        if (o instanceof m0) {
            m0 = (m0)o;
        }
        else {
            m0 = null;
        }
        Object a = o;
        if (m0 != null) {
            a = m0.a;
            if (a == null) {
                return o;
            }
        }
        return a;
    }
}
