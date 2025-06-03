// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s6;

import t6.h;
import u6.F;

public abstract class m
{
    public static final F a;
    public static final F b;
    
    static {
        a = new F("NONE");
        b = new F("PENDING");
    }
    
    public static final j a(final Object o) {
        Object a = o;
        if (o == null) {
            a = h.a;
        }
        return new l(a);
    }
}
