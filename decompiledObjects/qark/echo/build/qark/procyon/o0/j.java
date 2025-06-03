// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import android.net.Uri;
import n0.g;
import java.util.Collections;
import java.util.Collection;
import g0.a;
import java.util.List;
import X2.v;
import d0.q;

public abstract class j
{
    public final long a;
    public final q b;
    public final v c;
    public final long d;
    public final List e;
    public final List f;
    public final List g;
    public final i h;
    
    public j(final long a, final q b, final List list, final k k, final List list2, final List f, final List g) {
        g0.a.a(list.isEmpty() ^ true);
        this.a = a;
        this.b = b;
        this.c = v.U(list);
        List<Object> e;
        if (list2 == null) {
            e = Collections.emptyList();
        }
        else {
            e = Collections.unmodifiableList((List<?>)list2);
        }
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = k.a(this);
        this.d = k.b();
    }
    
    public static j o(final long n, final q q, final List list, final k k, final List list2, final List list3, final List list4, final String s) {
        if (k instanceof k.e) {
            return new c(n, q, list, (k.e)k, list2, list3, list4, s, -1L);
        }
        if (k instanceof k.a) {
            return new b(n, q, list, (k.a)k, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
    
    public abstract String k();
    
    public abstract g l();
    
    public abstract i m();
    
    public i n() {
        return this.h;
    }
    
    public static class b extends j implements g
    {
        public final k.a i;
        
        public b(final long n, final q q, final List list, final k.a i, final List list2, final List list3, final List list4) {
            super(n, q, list, i, list2, list3, list4, null);
            this.i = i;
        }
        
        @Override
        public long a(final long n, final long n2) {
            return this.i.i(n, n2);
        }
        
        @Override
        public long b(final long n, final long n2) {
            return this.i.h(n, n2);
        }
        
        @Override
        public long c(final long n) {
            return this.i.j(n);
        }
        
        @Override
        public long d(final long n, final long n2) {
            return this.i.d(n, n2);
        }
        
        @Override
        public long e(final long n, final long n2) {
            return this.i.f(n, n2);
        }
        
        @Override
        public i f(final long n) {
            return this.i.k(this, n);
        }
        
        @Override
        public boolean g() {
            return this.i.l();
        }
        
        @Override
        public long h() {
            return this.i.e();
        }
        
        @Override
        public long i(final long n) {
            return this.i.g(n);
        }
        
        @Override
        public long j(final long n, final long n2) {
            return this.i.c(n, n2);
        }
        
        @Override
        public String k() {
            return null;
        }
        
        @Override
        public g l() {
            return this;
        }
        
        @Override
        public i m() {
            return null;
        }
    }
    
    public static class c extends j
    {
        public final Uri i;
        public final long j;
        public final String k;
        public final i l;
        public final m m;
        
        public c(final long n, final q q, final List list, final k.e e, final List list2, final List list3, final List list4, final String k, final long j) {
            super(n, q, list, e, list2, list3, list4, null);
            this.i = Uri.parse(list.get(0).a);
            final i c = e.c();
            this.l = c;
            this.k = k;
            this.j = j;
            m m;
            if (c != null) {
                m = null;
            }
            else {
                m = new m(new i(null, 0L, j));
            }
            this.m = m;
        }
        
        @Override
        public String k() {
            return this.k;
        }
        
        @Override
        public g l() {
            return this.m;
        }
        
        @Override
        public i m() {
            return this.l;
        }
    }
}
