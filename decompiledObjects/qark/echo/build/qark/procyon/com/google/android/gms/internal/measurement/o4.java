// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class o4 extends l3 implements n4, RandomAccess
{
    public static final o4 q;
    public static final n4 r;
    public final List p;
    
    static {
        r = (q = new o4(false));
    }
    
    public o4(final int initialCapacity) {
        this(new ArrayList(initialCapacity));
    }
    
    public o4(final ArrayList p) {
        this.p = p;
    }
    
    public o4(final boolean b) {
        super(false);
        this.p = Collections.emptyList();
    }
    
    public static String d(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof q3) {
            return ((q3)o).V();
        }
        return a4.h((byte[])o);
    }
    
    @Override
    public final void K(final q3 q3) {
        this.a();
        this.p.add(q3);
        ++super.modCount;
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        this.a();
        List b = (List)collection;
        if (collection instanceof n4) {
            b = ((n4)collection).b();
        }
        final boolean addAll = this.p.addAll(n, b);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final List b() {
        return Collections.unmodifiableList((List<?>)this.p);
    }
    
    @Override
    public final void clear() {
        this.a();
        this.p.clear();
        ++super.modCount;
    }
    
    @Override
    public final Object l(final int n) {
        return this.p.get(n);
    }
    
    @Override
    public final int size() {
        return this.p.size();
    }
    
    @Override
    public final n4 w() {
        if (this.c()) {
            return new y5(this);
        }
        return this;
    }
}
