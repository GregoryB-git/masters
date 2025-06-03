// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import android.support.v4.media.a;

public final class O4 implements Z4
{
    public final I4 a;
    public final x5 b;
    public final boolean c;
    public final O3 d;
    
    public O4(final x5 b, final O3 d, final I4 a) {
        this.b = b;
        this.c = d.d(a);
        this.d = d;
        this.a = a;
    }
    
    public static O4 j(final x5 x5, final O3 o3, final I4 i4) {
        return new O4(x5, o3, i4);
    }
    
    @Override
    public final Object a() {
        final I4 a = this.a;
        if (a instanceof Y3) {
            return ((Y3)a).y();
        }
        return a.d().i();
    }
    
    @Override
    public final int b(final Object o) {
        final x5 b = this.b;
        int e = b.e(b.k(o));
        if (this.c) {
            e += this.d.b(o).a();
        }
        return e;
    }
    
    @Override
    public final boolean c(final Object o) {
        return this.d.b(o).n();
    }
    
    @Override
    public final void d(final Object o, final Object o2) {
        a5.n(this.b, o, o2);
        if (this.c) {
            a5.l(this.d, o, o2);
        }
    }
    
    @Override
    public final void e(final Object o) {
        this.b.l(o);
        this.d.f(o);
    }
    
    @Override
    public final int f(final Object o) {
        int hashCode = this.b.k(o).hashCode();
        if (this.c) {
            hashCode = hashCode * 53 + this.d.b(o).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final void g(final Object o, final byte[] array, final int n, final int n2, final p3 p5) {
        final Y3 y3 = (Y3)o;
        if (y3.zzb == v5.k()) {
            y3.zzb = v5.l();
        }
        android.support.v4.media.a.a(o);
        throw null;
    }
    
    @Override
    public final boolean h(final Object o, final Object o2) {
        return this.b.k(o).equals(this.b.k(o2)) && (!this.c || this.d.b(o).equals(this.d.b(o2)));
    }
    
    @Override
    public final void i(final Object o, final T5 t5) {
        final Iterator l = this.d.b(o).l();
        if (!l.hasNext()) {
            final x5 b = this.b;
            b.d(b.k(o), t5);
            return;
        }
        android.support.v4.media.a.a(l.next().getKey());
        throw null;
    }
}
