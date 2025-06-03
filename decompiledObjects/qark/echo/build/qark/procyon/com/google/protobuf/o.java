// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Collection;
import java.util.ArrayList;
import android.support.v4.media.a;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

public final class o
{
    public static final o d;
    public final c0 a;
    public boolean b;
    public boolean c;
    
    static {
        d = new o(true);
    }
    
    public o() {
        this.a = c0.q(16);
    }
    
    public o(final c0 a) {
        this.a = a;
        this.o();
    }
    
    public o(final boolean b) {
        this(c0.q(0));
        this.o();
    }
    
    public static int b(final m0.b b, int o, final Object o2) {
        final int n = o = h.O(o);
        if (b == m0.b.z) {
            o = n * 2;
        }
        return o + c(b, o2);
    }
    
    public static int c(final m0.b b, final Object o) {
        switch (o$a.b[b.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof t.a) {
                    return h.l(((t.a)o).g());
                }
                return h.l((int)o);
            }
            case 17: {
                return h.L((long)o);
            }
            case 16: {
                return h.J((int)o);
            }
            case 15: {
                return h.H((long)o);
            }
            case 14: {
                return h.F((int)o);
            }
            case 13: {
                return h.Q((int)o);
            }
            case 12: {
                if (o instanceof f) {
                    return h.h((f)o);
                }
                return h.f((byte[])o);
            }
            case 11: {
                if (o instanceof f) {
                    return h.h((f)o);
                }
                return h.N((String)o);
            }
            case 10: {
                return h.B((K)o);
            }
            case 9: {
                return h.t((K)o);
            }
            case 8: {
                return h.e((boolean)o);
            }
            case 7: {
                return h.n((int)o);
            }
            case 6: {
                return h.p((long)o);
            }
            case 5: {
                return h.w((int)o);
            }
            case 4: {
                return h.S((long)o);
            }
            case 3: {
                return h.y((long)o);
            }
            case 2: {
                return h.r((float)o);
            }
            case 1: {
                return h.j((double)o);
            }
        }
    }
    
    public static int d(final b b, final Object o) {
        final m0.b k = b.k();
        final int g = b.g();
        if (!b.i()) {
            return b(k, g, o);
        }
        final boolean q = b.q();
        final int n = 0;
        int n2 = 0;
        final List list = (List)o;
        if (q) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                n2 += c(k, iterator.next());
            }
            return h.O(g) + n2 + h.Q(n2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            n3 += b(k, g, iterator2.next());
        }
        return n3;
    }
    
    public static int i(final m0.b b, final boolean b2) {
        if (b2) {
            return 2;
        }
        return b.h();
    }
    
    public static boolean l(final Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }
    
    public static boolean m(final m0.b b, final Object o) {
        t.a(o);
        final int n = o$a.a[b.e().ordinal()];
        final boolean b2 = true;
        boolean b3 = true;
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                return o instanceof K;
            }
            case 8: {
                if (!(o instanceof Integer)) {
                    if (o instanceof t.a) {
                        return true;
                    }
                    b3 = false;
                }
                return b3;
            }
            case 7: {
                boolean b4 = b2;
                if (!(o instanceof f)) {
                    if (o instanceof byte[]) {
                        return true;
                    }
                    b4 = false;
                }
                return b4;
            }
            case 6: {
                return o instanceof String;
            }
            case 5: {
                return o instanceof Boolean;
            }
            case 4: {
                return o instanceof Double;
            }
            case 3: {
                return o instanceof Float;
            }
            case 2: {
                return o instanceof Long;
            }
            case 1: {
                return o instanceof Integer;
            }
        }
    }
    
    public static o r() {
        return new o();
    }
    
    public static void u(final h h, final m0.b b, final int n, final Object o) {
        if (b == m0.b.z) {
            h.r0(n, (K)o);
            return;
        }
        h.N0(n, i(b, false));
        v(h, b, o);
    }
    
    public static void v(final h h, final m0.b b, final Object o) {
        switch (o$a.b[b.ordinal()]) {
            default: {
                return;
            }
            case 18: {
                int n;
                if (o instanceof t.a) {
                    n = ((t.a)o).g();
                }
                else {
                    n = (int)o;
                }
                h.k0(n);
                return;
            }
            case 17: {
                h.K0((long)o);
                return;
            }
            case 16: {
                h.I0((int)o);
                return;
            }
            case 15: {
                h.G0((long)o);
                return;
            }
            case 14: {
                h.E0((int)o);
                return;
            }
            case 13: {
                h.P0((int)o);
                return;
            }
            case 12: {
                if (o instanceof f) {
                    break;
                }
                h.d0((byte[])o);
                return;
            }
            case 11: {
                if (o instanceof f) {
                    break;
                }
                h.M0((String)o);
                return;
            }
            case 10: {
                h.A0((K)o);
                return;
            }
            case 9: {
                h.t0((K)o);
                return;
            }
            case 8: {
                h.c0((boolean)o);
                return;
            }
            case 7: {
                h.m0((int)o);
                return;
            }
            case 6: {
                h.o0((long)o);
                return;
            }
            case 5: {
                h.w0((int)o);
                return;
            }
            case 4: {
                h.R0((long)o);
                return;
            }
            case 3: {
                h.y0((long)o);
                return;
            }
            case 2: {
                h.q0((float)o);
                return;
            }
            case 1: {
                h.i0((double)o);
                return;
            }
        }
        h.g0((f)o);
    }
    
    public o a() {
        final o r = r();
        for (int i = 0; i < this.a.k(); ++i) {
            final Map.Entry j = this.a.j(i);
            android.support.v4.media.a.a(j.getKey());
            r.s(null, j.getValue());
        }
        for (final Map.Entry<Object, V> entry : this.a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            r.s(null, entry.getValue());
        }
        r.c = this.c;
        return r;
    }
    
    public Iterator e() {
        if (this.c) {
            return new x(this.a.h().iterator());
        }
        return this.a.h().iterator();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof o && this.a.equals(((o)o).a));
    }
    
    public int f() {
        int i = 0;
        int n = 0;
        while (i < this.a.k()) {
            n += this.g(this.a.j(i));
            ++i;
        }
        final Iterator<Map.Entry> iterator = this.a.m().iterator();
        while (iterator.hasNext()) {
            n += this.g((Map.Entry)iterator.next());
        }
        return n;
    }
    
    public final int g(final Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }
    
    public int h() {
        int i = 0;
        int n = 0;
        while (i < this.a.k()) {
            final Map.Entry j = this.a.j(i);
            android.support.v4.media.a.a(j.getKey());
            n += d(null, j.getValue());
            ++i;
        }
        for (final Map.Entry<Object, V> entry : this.a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            n += d(null, entry.getValue());
        }
        return n;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean j() {
        return this.a.isEmpty();
    }
    
    public boolean k() {
        for (int i = 0; i < this.a.k(); ++i) {
            if (!l(this.a.j(i))) {
                return false;
            }
        }
        final Iterator<Map.Entry> iterator = this.a.m().iterator();
        while (iterator.hasNext()) {
            if (!l((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public Iterator n() {
        if (this.c) {
            return new x(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    public void o() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.k(); ++i) {
            final Map.Entry j = this.a.j(i);
            if (j.getValue() instanceof r) {
                j.getValue().J();
            }
        }
        this.a.p();
        this.b = true;
    }
    
    public void p(final o o) {
        for (int i = 0; i < o.a.k(); ++i) {
            this.q(o.a.j(i));
        }
        final Iterator<Map.Entry> iterator = o.a.m().iterator();
        while (iterator.hasNext()) {
            this.q((Map.Entry)iterator.next());
        }
    }
    
    public final void q(final Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }
    
    public void s(final b b, Object o) {
        if (b.i()) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList<Object> list = new ArrayList<Object>();
            list.addAll((Collection<?>)o);
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.t(b, iterator.next());
            }
            o = list;
        }
        else {
            this.t(b, o);
        }
        this.a.r(b, o);
    }
    
    public final void t(final b b, final Object o) {
        if (m(b.k(), o)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", b.g(), b.k().e(), o.getClass().getName()));
    }
    
    public interface b extends Comparable
    {
        int g();
        
        boolean i();
        
        m0.b k();
        
        boolean q();
    }
}
