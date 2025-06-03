// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public abstract class n implements m, s
{
    public final String o;
    public final Map p;
    
    public n(final String o) {
        this.p = new HashMap();
        this.o = o;
    }
    
    @Override
    public final void a(final String s, final s s2) {
        if (s2 == null) {
            this.p.remove(s);
            return;
        }
        this.p.put(s, s2);
    }
    
    public abstract s b(final f3 p0, final List p1);
    
    @Override
    public s c() {
        return this;
    }
    
    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }
    
    public final String e() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        final String o2 = this.o;
        return o2 != null && o2.equals(n.o);
    }
    
    @Override
    public final Double f() {
        return Double.NaN;
    }
    
    @Override
    public final String g() {
        return this.o;
    }
    
    @Override
    public int hashCode() {
        final String o = this.o;
        if (o != null) {
            return o.hashCode();
        }
        return 0;
    }
    
    @Override
    public final s i(final String s) {
        if (this.p.containsKey(s)) {
            return this.p.get(s);
        }
        return s.d;
    }
    
    @Override
    public final Iterator k() {
        return com.google.android.gms.internal.measurement.p.b(this.p);
    }
    
    @Override
    public final boolean q(final String s) {
        return this.p.containsKey(s);
    }
    
    @Override
    public final s s(final String anObject, final f3 f3, final List list) {
        if ("toString".equals(anObject)) {
            return new u(this.o);
        }
        return com.google.android.gms.internal.measurement.p.a(this, new u(anObject), f3, list);
    }
}
