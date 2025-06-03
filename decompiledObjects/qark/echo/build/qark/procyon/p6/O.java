// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import u6.v;
import u6.G;

public abstract class O
{
    public static final boolean a;
    public static final S b;
    
    static {
        a = G.f("kotlinx.coroutines.main.delay", false);
        b = b();
    }
    
    public static final S a() {
        return O.b;
    }
    
    public static final S b() {
        if (!O.a) {
            return N.w;
        }
        final B0 c = W.c();
        if (!v.c(c) && c instanceof S) {
            return (S)c;
        }
        return N.w;
    }
}
