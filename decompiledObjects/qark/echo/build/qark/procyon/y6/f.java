// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y6;

import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import u6.C;

public final class f extends C
{
    public final AtomicReferenceArray s;
    
    public f(final long n, final f f, final int n2) {
        super(n, f, n2);
        this.s = new AtomicReferenceArray(y6.e.f());
    }
    
    @Override
    public int n() {
        return y6.e.f();
    }
    
    @Override
    public void o(final int i, final Throwable t, final g g) {
        this.r().set(i, y6.e.c());
        this.p();
    }
    
    public final AtomicReferenceArray r() {
        return this.s;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SemaphoreSegment[id=");
        sb.append(super.q);
        sb.append(", hashCode=");
        sb.append(this.hashCode());
        sb.append(']');
        return sb.toString();
    }
}
