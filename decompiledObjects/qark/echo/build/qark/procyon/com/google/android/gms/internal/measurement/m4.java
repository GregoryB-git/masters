// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Iterator;

public final class m4 implements Iterator
{
    public Iterator o;
    
    public m4(final Iterator o) {
        this.o = o;
    }
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public final void remove() {
        this.o.remove();
    }
}
