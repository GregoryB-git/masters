// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.ArrayList;
import android.support.v4.media.a;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

public final class s
{
    public static final s d;
    public final h0 a;
    public boolean b;
    public boolean c;
    
    static {
        d = new s(true);
    }
    
    public s() {
        this.a = h0.q(16);
    }
    
    public s(final h0 a) {
        this.a = a;
        this.o();
    }
    
    public s(final boolean b) {
        this(h0.q(0));
        this.o();
    }
    
    public static int b(final r0.b b, int p3, final Object o) {
        final int n = p3 = j.P(p3);
        if (b == r0.b.z) {
            p3 = n * 2;
        }
        return p3 + c(b, o);
    }
    
    public static int c(final r0.b b, final Object o) {
        switch (s$a.b[b.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                return j.k((int)o);
            }
            case 17: {
                return j.M((long)o);
            }
            case 16: {
                return j.K((int)o);
            }
            case 15: {
                return j.I((long)o);
            }
            case 14: {
                return j.G((int)o);
            }
            case 13: {
                return j.R((int)o);
            }
            case 12: {
                if (o instanceof g) {
                    return j.g((g)o);
                }
                return j.e((byte[])o);
            }
            case 11: {
                if (o instanceof g) {
                    return j.g((g)o);
                }
                return j.O((String)o);
            }
            case 10: {
                return j.A((O)o);
            }
            case 9: {
                return j.s((O)o);
            }
            case 8: {
                return j.d((boolean)o);
            }
            case 7: {
                return j.m((int)o);
            }
            case 6: {
                return j.o((long)o);
            }
            case 5: {
                return j.v((int)o);
            }
            case 4: {
                return j.T((long)o);
            }
            case 3: {
                return j.x((long)o);
            }
            case 2: {
                return j.q((float)o);
            }
            case 1: {
                return j.i((double)o);
            }
        }
    }
    
    public static int d(final b b, final Object o) {
        final r0.b k = b.k();
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
            return j.P(g) + n2 + j.E(n2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            n3 += b(k, g, iterator2.next());
        }
        return n3;
    }
    
    public static int i(final r0.b b, final boolean b2) {
        if (b2) {
            return 2;
        }
        return b.e();
    }
    
    public static boolean l(final Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }
    
    public static boolean m(final r0.b b, final Object o) {
        y.a(o);
        final int n = s$a.a[b.c().ordinal()];
        boolean b2 = true;
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                return o instanceof O;
            }
            case 8: {
                return o instanceof Integer;
            }
            case 7: {
                if (!(o instanceof g)) {
                    if (o instanceof byte[]) {
                        return true;
                    }
                    b2 = false;
                }
                return b2;
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
    
    public static s r() {
        return new s();
    }
    
    public static void u(final j j, final r0.b b, final int n, final Object o) {
        if (b == r0.b.z) {
            j.r0(n, (O)o);
            return;
        }
        j.N0(n, i(b, false));
        v(j, b, o);
    }
    
    public static void v(final j j, final r0.b b, final Object o) {
        switch (s$a.b[b.ordinal()]) {
            default: {
                return;
            }
            case 18: {
                j.k0((int)o);
                return;
            }
            case 17: {
                j.K0((long)o);
                return;
            }
            case 16: {
                j.I0((int)o);
                return;
            }
            case 15: {
                j.G0((long)o);
                return;
            }
            case 14: {
                j.E0((int)o);
                return;
            }
            case 13: {
                j.P0((int)o);
                return;
            }
            case 12: {
                if (o instanceof g) {
                    break;
                }
                j.d0((byte[])o);
                return;
            }
            case 11: {
                if (o instanceof g) {
                    break;
                }
                j.M0((String)o);
                return;
            }
            case 10: {
                j.A0((O)o);
                return;
            }
            case 9: {
                j.t0((O)o);
                return;
            }
            case 8: {
                j.c0((boolean)o);
                return;
            }
            case 7: {
                j.m0((int)o);
                return;
            }
            case 6: {
                j.o0((long)o);
                return;
            }
            case 5: {
                j.w0((int)o);
                return;
            }
            case 4: {
                j.R0((long)o);
                return;
            }
            case 3: {
                j.y0((long)o);
                return;
            }
            case 2: {
                j.q0((float)o);
                return;
            }
            case 1: {
                j.i0((double)o);
                return;
            }
        }
        j.g0((g)o);
    }
    
    public s a() {
        final s r = r();
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
            return new B(this.a.h().iterator());
        }
        return this.a.h().iterator();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof s && this.a.equals(((s)o).a));
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
            return new B(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    public void o() {
        if (this.b) {
            return;
        }
        this.a.p();
        this.b = true;
    }
    
    public void p(final s s) {
        for (int i = 0; i < s.a.k(); ++i) {
            this.q(s.a.j(i));
        }
        final Iterator<Map.Entry> iterator = s.a.m().iterator();
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
                this.t(b.k(), iterator.next());
            }
            o = list;
        }
        else {
            this.t(b.k(), o);
        }
        this.a.r(b, o);
    }
    
    public final void t(final r0.b b, final Object o) {
        if (m(b, o)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    
    public interface b extends Comparable
    {
        int g();
        
        boolean i();
        
        r0.b k();
        
        boolean q();
    }
}
