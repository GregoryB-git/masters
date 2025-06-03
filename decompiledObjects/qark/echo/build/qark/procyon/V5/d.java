// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import java.io.Serializable;

public final class d implements h, Serializable
{
    public final Object o;
    
    public d(final Object o) {
        this.o = o;
    }
    
    @Override
    public Object getValue() {
        return this.o;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
}
