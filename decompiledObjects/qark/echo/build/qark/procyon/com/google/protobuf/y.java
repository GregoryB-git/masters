// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class y extends c implements z, RandomAccess
{
    public static final y q;
    public static final z r;
    public final List p;
    
    static {
        final y y = new y();
        (q = y).j();
        r = y;
    }
    
    public y() {
        this(10);
    }
    
    public y(final int initialCapacity) {
        this(new ArrayList(initialCapacity));
    }
    
    public y(final ArrayList p) {
        this.p = p;
    }
    
    public static String f(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof f) {
            return ((f)o).Y();
        }
        return t.i((byte[])o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        this.a();
        List o = (List)collection;
        if (collection instanceof z) {
            o = ((z)collection).o();
        }
        final boolean addAll = this.p.addAll(n, o);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public void clear() {
        this.a();
        this.p.clear();
        ++super.modCount;
    }
    
    public void d(final int n, final String s) {
        this.a();
        this.p.add(n, s);
        ++super.modCount;
    }
    
    public String g(final int n) {
        final byte[] value = this.p.get(n);
        if (value instanceof String) {
            return (String)(Object)value;
        }
        if (value instanceof f) {
            final f f = (Object)value;
            final String y = f.Y();
            if (f.s()) {
                this.p.set(n, y);
            }
            return y;
        }
        final byte[] array = value;
        final String i = t.i(array);
        if (t.g(array)) {
            this.p.set(n, i);
        }
        return i;
    }
    
    public y i(final int initialCapacity) {
        if (initialCapacity >= this.size()) {
            final ArrayList list = new ArrayList(initialCapacity);
            list.addAll(this.p);
            return new y(list);
        }
        throw new IllegalArgumentException();
    }
    
    public String k(final int n) {
        this.a();
        final Object remove = this.p.remove(n);
        ++super.modCount;
        return f(remove);
    }
    
    @Override
    public z m() {
        if (this.p()) {
            return new j0(this);
        }
        return this;
    }
    
    @Override
    public Object n(final int n) {
        return this.p.get(n);
    }
    
    @Override
    public List o() {
        return Collections.unmodifiableList((List<?>)this.p);
    }
    
    public String q(final int n, final String s) {
        this.a();
        return f(this.p.set(n, s));
    }
    
    @Override
    public int size() {
        return this.p.size();
    }
    
    @Override
    public void x(final f f) {
        this.a();
        this.p.add(f);
        ++super.modCount;
    }
}
