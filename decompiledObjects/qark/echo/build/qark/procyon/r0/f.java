// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import java.util.ArrayList;
import android.net.Uri;
import X2.B;
import X2.w;
import java.util.Collection;
import X2.v;
import java.util.Map;
import java.util.List;
import d0.m;

public final class f extends h
{
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final m q;
    public final List r;
    public final List s;
    public final Map t;
    public final long u;
    public final f v;
    
    public f(final int d, final String s, final List list, final long b, final boolean g, long e, final boolean i, final int j, final long k, final int l, final long m, final long n, final boolean b2, final boolean o, final boolean p20, final m q, final List list2, final List list3, final f v, final Map map) {
        super(s, list, b2);
        this.d = d;
        this.h = e;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p20;
        this.q = q;
        this.r = X2.v.U(list2);
        this.s = X2.v.U(list3);
        this.t = w.c(map);
        Label_0168: {
            e e2;
            if (!list3.isEmpty()) {
                e2 = (b)B.d(list3);
            }
            else {
                if (list2.isEmpty()) {
                    this.u = 0L;
                    break Label_0168;
                }
                e2 = (d)B.d(list2);
            }
            this.u = e2.s + e2.q;
        }
        e = -9223372036854775807L;
        if (b != -9223372036854775807L) {
            e = this.u;
            if (b >= 0L) {
                e = Math.min(e, b);
            }
            else {
                e = Math.max(0L, e + b);
            }
        }
        this.e = e;
        this.f = (b >= 0L);
        this.v = v;
    }
    
    public f b(final List list) {
        return this;
    }
    
    public f c(final long n, final int n2) {
        return new f(this.d, super.a, super.b, this.e, this.g, n, true, n2, this.k, this.l, this.m, this.n, super.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t);
    }
    
    public f d() {
        if (this.o) {
            return this;
        }
        return new f(this.d, super.a, super.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, super.c, true, this.p, this.q, this.r, this.s, this.v, this.t);
    }
    
    public long e() {
        return this.h + this.u;
    }
    
    public boolean f(final f f) {
        boolean b = true;
        if (f != null) {
            final long k = this.k;
            final long i = f.k;
            if (k > i) {
                return true;
            }
            if (k < i) {
                return false;
            }
            final int n = this.r.size() - f.r.size();
            if (n != 0) {
                return n > 0;
            }
            final int size = this.s.size();
            final int size2 = f.s.size();
            b = b;
            if (size <= size2) {
                if (size == size2 && this.o && !f.o) {
                    return true;
                }
                b = false;
            }
        }
        return b;
    }
    
    public static final class b extends e
    {
        public final boolean A;
        public final boolean z;
        
        public b(final String s, final d d, final long n, final int n2, final long n3, final m m, final String s2, final String s3, final long n4, final long n5, final boolean b, final boolean z, final boolean a) {
            super(s, d, n, n2, n3, m, s2, s3, n4, n5, b, null);
            this.z = z;
            this.A = a;
        }
        
        public b e(final long n, final int n2) {
            return new b(super.o, super.p, super.q, n2, n, super.t, super.u, super.v, super.w, super.x, super.y, this.z, this.A);
        }
    }
    
    public static final class c
    {
        public final Uri a;
        public final long b;
        public final int c;
        
        public c(final Uri a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class d extends e
    {
        public final List A;
        public final String z;
        
        public d(final String s, final long n, final long n2, final String s2, final String s3) {
            this(s, null, "", 0L, -1, -9223372036854775807L, null, s2, s3, n, n2, false, v.Y());
        }
        
        public d(final String s, final d d, final String z, final long n, final int n2, final long n3, final m m, final String s2, final String s3, final long n4, final long n5, final boolean b, final List list) {
            super(s, d, n, n2, n3, m, s2, s3, n4, n5, b, null);
            this.z = z;
            this.A = v.U(list);
        }
        
        public d e(final long n, final int n2) {
            final ArrayList<b> list = new ArrayList<b>();
            int i = 0;
            long n3 = n;
            while (i < this.A.size()) {
                final b b = this.A.get(i);
                list.add(b.e(n3, n2));
                n3 += b.q;
                ++i;
            }
            return new d(super.o, super.p, this.z, super.q, n2, n, super.t, super.u, super.v, super.w, super.x, super.y, list);
        }
    }
    
    public abstract static class e implements Comparable
    {
        public final String o;
        public final d p;
        public final long q;
        public final int r;
        public final long s;
        public final m t;
        public final String u;
        public final String v;
        public final long w;
        public final long x;
        public final boolean y;
        
        public e(final String o, final d p11, final long q, final int r, final long s, final m t, final String u, final String v, final long w, final long x, final boolean y) {
            this.o = o;
            this.p = p11;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
            this.w = w;
            this.x = x;
            this.y = y;
        }
        
        public int c(final Long n) {
            if (this.s > n) {
                return 1;
            }
            if (this.s < n) {
                return -1;
            }
            return 0;
        }
    }
    
    public static final class f
    {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;
        
        public f(final long a, final boolean b, final long c, final long d, final boolean e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
