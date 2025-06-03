// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class A5 implements Iterator
{
    public Iterator o;
    public final /* synthetic */ y5 p;
    
    public A5(final y5 p) {
        this.p = p;
        this.o = y5.a(p).iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
