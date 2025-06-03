// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class f implements Iterator
{
    public final /* synthetic */ Iterator o;
    public final /* synthetic */ Iterator p;
    
    public f(final g g, final Iterator o, final Iterator p3) {
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext() || this.p.hasNext();
    }
}
