// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.util.Iterator;

public abstract class e0 implements Iterator
{
    public final Iterator o;
    
    public e0(final Iterator iterator) {
        this.o = (Iterator)m.j(iterator);
    }
    
    public abstract Object b(final Object p0);
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.b(this.o.next());
    }
    
    @Override
    public final void remove() {
        this.o.remove();
    }
}
