// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y6;

import u6.F;

public abstract class c
{
    public static final F a;
    public static final F b;
    
    static {
        a = new F("NO_OWNER");
        b = new F("ALREADY_LOCKED_BY_OWNER");
    }
    
    public static final a a(final boolean b) {
        return new b(b);
    }
}
