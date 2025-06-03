// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o6;

import kotlin.jvm.internal.Intrinsics;
import l6.d;

public abstract class c
{
    public static final long h(final long n, final int n2) {
        return a.m((n << 1) + n2);
    }
    
    public static final long i(final long n) {
        return a.m((n << 1) + 1L);
    }
    
    public static final long j(final long n) {
        if (-4611686018426L <= n && n < 4611686018427L) {
            return k(m(n));
        }
        return i(d.e(n, -4611686018427387903L, 4611686018427387903L));
    }
    
    public static final long k(final long n) {
        return a.m(n << 1);
    }
    
    public static final long l(final long n) {
        if (-4611686018426999999L <= n && n < 4611686018427000000L) {
            return k(n);
        }
        return i(n(n));
    }
    
    public static final long m(final long n) {
        return n * 1000000;
    }
    
    public static final long n(final long n) {
        return n / 1000000;
    }
    
    public static final long o(final int n, final o6.d d) {
        Intrinsics.checkNotNullParameter(d, "unit");
        if (d.compareTo(d.s) <= 0) {
            return k(e.b(n, d, d.p));
        }
        return p(n, d);
    }
    
    public static final long p(final long n, final o6.d d) {
        Intrinsics.checkNotNullParameter(d, "unit");
        final o6.d p2 = d.p;
        final long b = e.b(4611686018426999999L, p2, d);
        if (-b <= n && n <= b) {
            return k(e.b(n, d, p2));
        }
        return i(d.e(e.a(n, d, d.r), -4611686018427387903L, 4611686018427387903L));
    }
}
