// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import h6.a;
import java.util.Iterator;

public abstract class B implements Iterator, a
{
    public abstract int b();
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
