// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.NoSuchElementException;
import h6.a;
import java.util.ListIterator;

public final class x implements ListIterator, a
{
    public static final x o;
    
    static {
        o = new x();
    }
    
    public Void b() {
        throw new NoSuchElementException();
    }
    
    public Void d() {
        throw new NoSuchElementException();
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public boolean hasPrevious() {
        return false;
    }
    
    @Override
    public int nextIndex() {
        return 0;
    }
    
    @Override
    public int previousIndex() {
        return -1;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
