// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;
import java.util.ListIterator;

public abstract class f0 extends e0 implements ListIterator
{
    public f0(final ListIterator listIterator) {
        super(listIterator);
    }
    
    @Override
    public void add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final ListIterator d() {
        return (ListIterator)super.o;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.d().hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.d().nextIndex();
    }
    
    @Override
    public final Object previous() {
        return this.b(this.d().previous());
    }
    
    @Override
    public final int previousIndex() {
        return this.d().previousIndex();
    }
    
    @Override
    public void set(final Object o) {
        throw new UnsupportedOperationException();
    }
}
