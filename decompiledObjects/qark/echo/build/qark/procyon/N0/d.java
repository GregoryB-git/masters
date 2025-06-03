// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import g0.a;
import F0.s;
import F0.C;

public final class d extends C
{
    public final long b;
    
    public d(final s s, final long b) {
        super(s);
        g0.a.a(s.p() >= b);
        this.b = b;
    }
    
    @Override
    public long a() {
        return super.a() - this.b;
    }
    
    @Override
    public long m() {
        return super.m() - this.b;
    }
    
    @Override
    public long p() {
        return super.p() - this.b;
    }
}
