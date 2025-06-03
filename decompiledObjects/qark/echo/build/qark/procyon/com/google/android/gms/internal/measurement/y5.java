// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class y5 extends AbstractList implements n4, RandomAccess
{
    public final n4 o;
    
    public y5(final n4 o) {
        this.o = o;
    }
    
    @Override
    public final void K(final q3 q3) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final List b() {
        return this.o.b();
    }
    
    @Override
    public final Iterator iterator() {
        return new A5(this);
    }
    
    @Override
    public final Object l(final int n) {
        return this.o.l(n);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return new B5(this, n);
    }
    
    @Override
    public final int size() {
        return this.o.size();
    }
    
    @Override
    public final n4 w() {
        return this;
    }
}
