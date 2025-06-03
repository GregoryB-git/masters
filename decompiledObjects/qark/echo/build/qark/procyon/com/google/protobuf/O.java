// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Iterator;
import android.support.v4.media.a;
import java.util.Map;

public final class O implements Z
{
    public final K a;
    public final g0 b;
    public final boolean c;
    public final l d;
    
    public O(final g0 b, final l d, final K a) {
        this.b = b;
        this.c = d.d(a);
        this.d = d;
        this.a = a;
    }
    
    private int i(final g0 g0, final Object o) {
        return g0.c(g0.a(o));
    }
    
    public static O j(final g0 g0, final l l, final K k) {
        return new O(g0, l, k);
    }
    
    @Override
    public void a(final Object o, final Object o2) {
        b0.E(this.b, o, o2);
        if (this.c) {
            b0.C(this.d, o, o2);
        }
    }
    
    @Override
    public void b(final Object o) {
        this.b.d(o);
        this.d.e(o);
    }
    
    @Override
    public final boolean c(final Object o) {
        return this.d.b(o).k();
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        return this.b.a(o).equals(this.b.a(o2)) && (!this.c || this.d.b(o).equals(this.d.b(o2)));
    }
    
    @Override
    public int e(final Object o) {
        int i = this.i(this.b, o);
        if (this.c) {
            i += this.d.b(o).f();
        }
        return i;
    }
    
    @Override
    public Object f() {
        final K a = this.a;
        if (a instanceof r) {
            return ((r)a).P();
        }
        return a.d().c();
    }
    
    @Override
    public int g(final Object o) {
        int hashCode = this.b.a(o).hashCode();
        if (this.c) {
            hashCode = hashCode * 53 + this.d.b(o).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public void h(final Object o, final n0 n0) {
        final Iterator n2 = this.d.b(o).n();
        if (!n2.hasNext()) {
            this.k(this.b, o, n0);
            return;
        }
        android.support.v4.media.a.a(n2.next().getKey());
        throw null;
    }
    
    public final void k(final g0 g0, final Object o, final n0 n0) {
        g0.g(g0.a(o), n0);
    }
}
