// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.t;

public final class Y extends j
{
    public final X o;
    
    public Y(final X o) {
        this.o = o;
    }
    
    @Override
    public void a(final Throwable t) {
        this.o.b();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCancel[");
        sb.append(this.o);
        sb.append(']');
        return sb.toString();
    }
}
