// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

import java.util.NoSuchElementException;
import java.util.Iterator;

public abstract class e implements Iterator
{
    public int o;
    public int p;
    public boolean q;
    
    public e(final int o) {
        this.o = o;
    }
    
    public abstract Object b(final int p0);
    
    public abstract void d(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.p < this.o;
    }
    
    @Override
    public Object next() {
        if (this.hasNext()) {
            final Object b = this.b(this.p);
            ++this.p;
            this.q = true;
            return b;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        if (this.q) {
            this.d(--this.p);
            --this.o;
            this.q = false;
            return;
        }
        throw new IllegalStateException();
    }
}
