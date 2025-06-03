// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.NoSuchElementException;
import h6.a;
import java.util.Iterator;

public abstract class b implements Iterator, a
{
    public int o;
    public Object p;
    
    public abstract void b();
    
    public final void d() {
        this.o = 2;
    }
    
    public final void e(final Object p) {
        this.p = p;
        this.o = 1;
    }
    
    public final boolean f() {
        this.o = 3;
        this.b();
        return this.o == 1;
    }
    
    @Override
    public boolean hasNext() {
        final int o = this.o;
        boolean f;
        if (o != 0) {
            f = true;
            if (o != 1) {
                if (o == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        }
        else {
            f = this.f();
        }
        return f;
    }
    
    @Override
    public Object next() {
        final int o = this.o;
        if (o != 1 && (o == 2 || !this.f())) {
            throw new NoSuchElementException();
        }
        this.o = 0;
        return this.p;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
