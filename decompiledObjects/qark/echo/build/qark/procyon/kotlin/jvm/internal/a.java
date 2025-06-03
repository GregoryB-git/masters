// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class a implements Iterator, h6.a
{
    public final Object[] o;
    public int p;
    
    public a(final Object[] o) {
        Intrinsics.checkNotNullParameter(o, "array");
        this.o = o;
    }
    
    @Override
    public boolean hasNext() {
        return this.p < this.o.length;
    }
    
    @Override
    public Object next() {
        try {
            return this.o[this.p++];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            --this.p;
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
