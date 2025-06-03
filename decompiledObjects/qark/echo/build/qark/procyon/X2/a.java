// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.NoSuchElementException;
import W2.m;

public abstract class a extends h0
{
    public final int o;
    public int p;
    
    public a(final int o, final int p2) {
        m.l(p2, o);
        this.o = o;
        this.p = p2;
    }
    
    public abstract Object b(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.p < this.o;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.p > 0;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            return this.b(this.p++);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        return this.p;
    }
    
    @Override
    public final Object previous() {
        if (this.hasPrevious()) {
            final int p = this.p - 1;
            this.p = p;
            return this.b(p);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        return this.p - 1;
    }
}
