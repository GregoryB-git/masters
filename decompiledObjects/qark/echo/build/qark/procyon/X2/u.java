// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.io.Serializable;

public class u extends e implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final Object o;
    public final Object p;
    
    public u(final Object o, final Object p2) {
        this.o = o;
        this.p = p2;
    }
    
    @Override
    public final Object getKey() {
        return this.o;
    }
    
    @Override
    public final Object getValue() {
        return this.p;
    }
    
    @Override
    public final Object setValue(final Object o) {
        throw new UnsupportedOperationException();
    }
}
