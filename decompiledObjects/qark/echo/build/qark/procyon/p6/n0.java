// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.t;
import g6.l;

public final class n0 extends j
{
    public final l o;
    
    public n0(final l o) {
        this.o = o;
    }
    
    @Override
    public void a(final Throwable t) {
        this.o.invoke(t);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(M.a(this.o));
        sb.append('@');
        sb.append(M.b(this));
        sb.append(']');
        return sb.toString();
    }
}
