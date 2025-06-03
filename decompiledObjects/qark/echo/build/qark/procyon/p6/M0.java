// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import android.support.v4.media.a;
import X5.g;

public final class M0 extends F
{
    public static final M0 q;
    
    static {
        q = new M0();
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        android.support.v4.media.a.a(g.b((g.c)Q0.p));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
    
    @Override
    public boolean F(final g g) {
        return false;
    }
    
    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
