// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

public final class B5 implements ListIterator
{
    public ListIterator o;
    public final /* synthetic */ int p;
    public final /* synthetic */ y5 q;
    
    public B5(final y5 q, final int p2) {
        this.q = q;
        this.p = p2;
        this.o = y5.a(q).listIterator(p2);
    }
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.o.hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.o.nextIndex();
    }
    
    @Override
    public final int previousIndex() {
        return this.o.previousIndex();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
