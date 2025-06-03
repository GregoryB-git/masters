// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.ArrayList;
import android.support.v4.media.a;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

public final class S3
{
    public static final S3 d;
    public final d5 a;
    public boolean b;
    public boolean c;
    
    static {
        d = new S3(true);
    }
    
    public S3() {
        this.a = d5.b(16);
    }
    
    public S3(final d5 a) {
        this.a = a;
        this.m();
    }
    
    public S3(final boolean b) {
        this(d5.b(0));
        this.m();
    }
    
    public static int b(final U3 u3, final Object o) {
        final K5 b = u3.b();
        final int a = u3.a();
        if (!u3.f()) {
            return c(b, a, o);
        }
        final List list = (List)o;
        final boolean d = u3.d();
        final int n = 0;
        int n2 = 0;
        if (!d) {
            final Iterator<Object> iterator = list.iterator();
            int n3 = n;
            while (iterator.hasNext()) {
                n3 += c(b, a, iterator.next());
            }
            return n3;
        }
        if (list.isEmpty()) {
            return 0;
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            n2 += d(b, iterator2.next());
        }
        return J3.s0(a) + n2 + J3.v0(n2);
    }
    
    public static int c(final K5 k5, int s0, final Object o) {
        final int n = s0 = J3.s0(s0);
        if (k5 == K5.z) {
            a4.g((I4)o);
            s0 = n << 1;
        }
        return s0 + d(k5, o);
    }
    
    public static int d(final K5 k5, final Object o) {
        switch (R3.b[k5.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof e4) {
                    return J3.X(((e4)o).a());
                }
                return J3.X((int)o);
            }
            case 17: {
                return J3.j0((long)o);
            }
            case 16: {
                return J3.o0((int)o);
            }
            case 15: {
                return J3.f0((long)o);
            }
            case 14: {
                return J3.k0((int)o);
            }
            case 13: {
                return J3.v0((int)o);
            }
            case 12: {
                if (o instanceof q3) {
                    return J3.A((q3)o);
                }
                return J3.i((byte[])o);
            }
            case 11: {
                if (o instanceof q3) {
                    return J3.A((q3)o);
                }
                return J3.C((String)o);
            }
            case 10: {
                return J3.T((I4)o);
            }
            case 9: {
                return J3.B((I4)o);
            }
            case 8: {
                return J3.h((boolean)o);
            }
            case 7: {
                return J3.c0((int)o);
            }
            case 6: {
                return J3.S((long)o);
            }
            case 5: {
                return J3.g0((int)o);
            }
            case 4: {
                return J3.n0((long)o);
            }
            case 3: {
                return J3.a0((long)o);
            }
            case 2: {
                return J3.d((float)o);
            }
            case 1: {
                return J3.c((double)o);
            }
        }
    }
    
    public static int e(final Map.Entry entry) {
        a.a(entry.getKey());
        entry.getValue();
        throw null;
    }
    
    public static void j(final U3 u3, final Object o) {
        final K5 b = u3.b();
        a4.e(o);
        boolean b2 = false;
        switch (R3.a[b.c().ordinal()]) {
            default: {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", u3.a(), u3.b().c(), o.getClass().getName()));
            }
            case 9: {
                if (o instanceof I4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", u3.a(), u3.b().c(), o.getClass().getName()));
            }
            case 8: {
                if (o instanceof Integer) {
                    return;
                }
                if (o instanceof e4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", u3.a(), u3.b().c(), o.getClass().getName()));
            }
            case 7: {
                if (o instanceof q3) {
                    return;
                }
                if (o instanceof byte[]) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", u3.a(), u3.b().c(), o.getClass().getName()));
            }
            case 6: {
                b2 = (o instanceof String);
                break;
            }
            case 5: {
                b2 = (o instanceof Boolean);
                break;
            }
            case 4: {
                b2 = (o instanceof Double);
                break;
            }
            case 3: {
                b2 = (o instanceof Float);
                break;
            }
            case 2: {
                b2 = (o instanceof Long);
                break;
            }
            case 1: {
                b2 = (o instanceof Integer);
                break;
            }
        }
        if (!b2) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", u3.a(), u3.b().c(), o.getClass().getName()));
        }
    }
    
    public static boolean k(final Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }
    
    public final int a() {
        int i = 0;
        int n = 0;
        while (i < this.a.g()) {
            n += e(this.a.h(i));
            ++i;
        }
        final Iterator<Map.Entry> iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            n += e((Map.Entry)iterator.next());
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof S3 && this.a.equals(((S3)o).a));
    }
    
    public final void f(final S3 s3) {
        for (int i = 0; i < s3.a.g(); ++i) {
            this.h(s3.a.h(i));
        }
        final Iterator<Map.Entry> iterator = s3.a.j().iterator();
        while (iterator.hasNext()) {
            this.h((Map.Entry)iterator.next());
        }
    }
    
    public final void g(final U3 u3, Object value) {
        if (u3.f()) {
            if (!(value instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList<Object> list = new ArrayList<Object>();
            list.addAll((Collection<?>)value);
            final int size = list.size();
            int i = 0;
            while (i < size) {
                value = list.get(i);
                ++i;
                j(u3, value);
            }
            value = list;
        }
        else {
            j(u3, value);
        }
        this.a.d(u3, value);
    }
    
    public final void h(final Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final Iterator i() {
        if (this.c) {
            return new m4(this.a.m().iterator());
        }
        return this.a.m().iterator();
    }
    
    public final Iterator l() {
        if (this.c) {
            return new m4(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    public final void m() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.g(); ++i) {
            final Map.Entry h = this.a.h(i);
            if (h.getValue() instanceof Y3) {
                h.getValue().C();
            }
        }
        this.a.f();
        this.b = true;
    }
    
    public final boolean n() {
        for (int i = 0; i < this.a.g(); ++i) {
            if (!k(this.a.h(i))) {
                return false;
            }
        }
        final Iterator<Map.Entry> iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            if (!k((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
}
