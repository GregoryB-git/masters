// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import h6.b;
import java.util.List;
import java.util.AbstractList;

public abstract class d extends AbstractList implements List, b
{
    public abstract int a();
    
    public abstract Object d(final int p0);
    
    @Override
    public final /* bridge */ Object remove(final int n) {
        return this.d(n);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.a();
    }
}
