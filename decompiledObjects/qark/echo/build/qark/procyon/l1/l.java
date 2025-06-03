// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import java.util.Collections;
import d0.q;
import F0.t;
import g0.a;
import g0.z;
import F0.T;
import java.util.List;

public final class l implements m
{
    public final List a;
    public final T[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    
    public l(final List a) {
        this.a = a;
        this.b = new T[a.size()];
        this.f = -9223372036854775807L;
    }
    
    @Override
    public void a(final z z) {
        if (this.c) {
            if (this.d == 2 && !this.f(z, 32)) {
                return;
            }
            final int d = this.d;
            int i = 0;
            if (d == 1 && !this.f(z, 0)) {
                return;
            }
            final int f = z.f();
            final int a = z.a();
            for (T[] b = this.b; i < b.length; ++i) {
                final T t = b[i];
                z.T(f);
                t.e(z, a);
            }
            this.e += a;
        }
    }
    
    @Override
    public void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
        if (this.c) {
            g0.a.f(this.f != -9223372036854775807L);
            final T[] b2 = this.b;
            for (int length = b2.length, i = 0; i < length; ++i) {
                b2[i].b(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }
    
    @Override
    public void d(final long f, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        this.f = f;
        this.e = 0;
        this.d = 2;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        for (int i = 0; i < this.b.length; ++i) {
            final K.a a = this.a.get(i);
            d.a();
            final T a2 = t.a(d.c(), 3);
            a2.d(new q.b().a0(d.b()).o0("application/dvbsubs").b0(Collections.singletonList(a.c)).e0(a.a).K());
            this.b[i] = a2;
        }
    }
    
    public final boolean f(final z z, final int n) {
        if (z.a() == 0) {
            return false;
        }
        if (z.G() != n) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
}
