// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import u6.K;
import u6.F;

public final class L0
{
    public static final L0 a;
    public static final ThreadLocal b;
    
    static {
        a = new L0();
        b = K.a(new F("ThreadLocalEventLoop"));
    }
    
    public final a0 a() {
        return L0.b.get();
    }
    
    public final a0 b() {
        final ThreadLocal b = L0.b;
        a0 a;
        if ((a = b.get()) == null) {
            a = d0.a();
            b.set(a);
        }
        return a;
    }
    
    public final void c() {
        L0.b.set(null);
    }
    
    public final void d(final a0 value) {
        L0.b.set(value);
    }
}
