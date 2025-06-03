// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.AbstractSet;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Objects;
import a3.f;
import W2.m;
import java.util.Iterator;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

public class k extends AbstractMap implements Serializable
{
    public static final Object x;
    public transient Object o;
    public transient int[] p;
    public transient Object[] q;
    public transient Object[] r;
    public transient int s;
    public transient int t;
    public transient Set u;
    public transient Set v;
    public transient Collection w;
    
    static {
        x = new Object();
    }
    
    public k() {
        this.E(3);
    }
    
    public static /* synthetic */ int a(final k k) {
        return k.s;
    }
    
    public static /* synthetic */ int e(final k k) {
        return k.t--;
    }
    
    public static /* synthetic */ Object h() {
        return k.x;
    }
    
    public static k r() {
        return new k();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            this.E(int1);
            for (int i = 0; i < int1; ++i) {
                this.put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid size: ");
        sb.append(int1);
        throw new InvalidObjectException(sb.toString());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        final Iterator y = this.y();
        while (y.hasNext()) {
            final Map.Entry<Object, V> entry = y.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
    
    public int A(int n) {
        ++n;
        if (n < this.t) {
            return n;
        }
        return -1;
    }
    
    public final int B() {
        return (1 << (this.s & 0x1F)) - 1;
    }
    
    public void C() {
        this.s += 32;
    }
    
    public final int D(final Object o) {
        if (this.J()) {
            return -1;
        }
        final int c = X2.s.c(o);
        final int b = this.B();
        int n = l.h(this.N(), c & b);
        if (n == 0) {
            return -1;
        }
        final int b2 = l.b(c, b);
        int x;
        do {
            final int n2 = n - 1;
            x = this.x(n2);
            if (l.b(x, b) == b2 && W2.k.a(o, this.G(n2))) {
                return n2;
            }
        } while ((n = l.c(x, b)) != 0);
        return -1;
    }
    
    public void E(final int n) {
        m.e(n >= 0, "Expected size must be >= 0");
        this.s = a3.f.f(n, 1, 1073741823);
    }
    
    public void F(final int n, final Object o, final Object o2, final int n2, final int n3) {
        this.S(n, l.d(n2, 0, n3));
        this.U(n, o);
        this.V(n, o2);
    }
    
    public final Object G(final int n) {
        return this.M()[n];
    }
    
    public Iterator H() {
        final Map w = this.w();
        if (w != null) {
            return w.keySet().iterator();
        }
        return new e() {
            @Override
            public Object d(final int n) {
                return k.this.G(n);
            }
        };
    }
    
    public void I(final int n, final int n2) {
        final Object n3 = this.N();
        final int[] l = this.L();
        final Object[] m = this.M();
        final Object[] o = this.O();
        final int size = this.size();
        final int n4 = size - 1;
        if (n >= n4) {
            o[n] = (m[n] = null);
            l[n] = 0;
            return;
        }
        final Object o2 = m[n4];
        m[n] = o2;
        o[n] = o[n4];
        o[n4] = (m[n4] = null);
        l[n] = l[n4];
        l[n4] = 0;
        final int n5 = X2.s.c(o2) & n2;
        int n6;
        if ((n6 = X2.l.h(n3, n5)) == size) {
            X2.l.i(n3, n5, n + 1);
            return;
        }
        int n7;
        int n8;
        do {
            n7 = n6 - 1;
            n8 = l[n7];
            n6 = X2.l.c(n8, n2);
        } while (n6 != size);
        l[n7] = X2.l.d(n8, n + 1, n2);
    }
    
    public boolean J() {
        return this.o == null;
    }
    
    public final Object K(Object w) {
        if (this.J()) {
            return k.x;
        }
        final int b = this.B();
        final int f = l.f(w, null, b, this.N(), this.L(), this.M(), null);
        if (f == -1) {
            return k.x;
        }
        w = this.W(f);
        this.I(f, b);
        --this.t;
        this.C();
        return w;
    }
    
    public final int[] L() {
        final int[] p = this.p;
        Objects.requireNonNull(p);
        return p;
    }
    
    public final Object[] M() {
        final Object[] q = this.q;
        Objects.requireNonNull(q);
        return q;
    }
    
    public final Object N() {
        final Object o = this.o;
        Objects.requireNonNull(o);
        return o;
    }
    
    public final Object[] O() {
        final Object[] r = this.r;
        Objects.requireNonNull(r);
        return r;
    }
    
    public void P(final int newLength) {
        this.p = Arrays.copyOf(this.L(), newLength);
        this.q = Arrays.copyOf(this.M(), newLength);
        this.r = Arrays.copyOf(this.O(), newLength);
    }
    
    public final void Q(int min) {
        final int length = this.L().length;
        if (min > length) {
            min = Math.min(1073741823, Math.max(1, length >>> 1) + length | 0x1);
            if (min != length) {
                this.P(min);
            }
        }
    }
    
    public final int R(final int n, int i, int j, int n2) {
        final Object a = l.a(i);
        final int n3 = i - 1;
        if (n2 != 0) {
            l.i(a, j & n3, n2 + 1);
        }
        final Object n4 = this.N();
        final int[] l = this.L();
        int n5;
        int n6;
        int n7;
        int h;
        for (i = 0; i <= n; ++i) {
            for (j = X2.l.h(n4, i); j != 0; j = X2.l.c(n5, n)) {
                n2 = j - 1;
                n5 = l[n2];
                n6 = (X2.l.b(n5, n) | i);
                n7 = (n6 & n3);
                h = X2.l.h(a, n7);
                X2.l.i(a, n7, j);
                l[n2] = X2.l.d(n6, h, n3);
            }
        }
        this.o = a;
        this.T(n3);
        return n3;
    }
    
    public final void S(final int n, final int n2) {
        this.L()[n] = n2;
    }
    
    public final void T(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.s = l.d(this.s, 32 - numberOfLeadingZeros, 31);
    }
    
    public final void U(final int n, final Object o) {
        this.M()[n] = o;
    }
    
    public final void V(final int n, final Object o) {
        this.O()[n] = o;
    }
    
    public final Object W(final int n) {
        return this.O()[n];
    }
    
    public Iterator X() {
        final Map w = this.w();
        if (w != null) {
            return w.values().iterator();
        }
        return new e() {
            @Override
            public Object d(final int n) {
                return k.this.W(n);
            }
        };
    }
    
    @Override
    public void clear() {
        if (this.J()) {
            return;
        }
        this.C();
        final Map w = this.w();
        if (w != null) {
            this.s = a3.f.f(this.size(), 3, 1073741823);
            w.clear();
            this.o = null;
        }
        else {
            Arrays.fill(this.M(), 0, this.t, null);
            Arrays.fill(this.O(), 0, this.t, null);
            l.g(this.N());
            Arrays.fill(this.L(), 0, this.t, 0);
        }
        this.t = 0;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        final Map w = this.w();
        if (w != null) {
            return w.containsKey(o);
        }
        return this.D(o) != -1;
    }
    
    @Override
    public boolean containsValue(final Object o) {
        final Map w = this.w();
        if (w != null) {
            return w.containsValue(o);
        }
        for (int i = 0; i < this.t; ++i) {
            if (W2.k.a(o, this.W(i))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Set entrySet() {
        Set v;
        if ((v = this.v) == null) {
            v = this.s();
            this.v = v;
        }
        return v;
    }
    
    @Override
    public Object get(final Object o) {
        final Map w = this.w();
        if (w != null) {
            return w.get(o);
        }
        final int d = this.D(o);
        if (d == -1) {
            return null;
        }
        this.n(d);
        return this.W(d);
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public Set keySet() {
        Set u;
        if ((u = this.u) == null) {
            u = this.u();
            this.u = u;
        }
        return u;
    }
    
    public void n(final int n) {
    }
    
    public int o(final int n, final int n2) {
        return n - 1;
    }
    
    public int p() {
        m.p(this.J(), "Arrays already allocated");
        final int s = this.s;
        final int j = l.j(s);
        this.o = l.a(j);
        this.T(j - 1);
        this.p = new int[s];
        this.q = new Object[s];
        this.r = new Object[s];
        return s;
    }
    
    @Override
    public Object put(Object o, final Object o2) {
        if (this.J()) {
            this.p();
        }
        final Map w = this.w();
        if (w != null) {
            return w.put(o, o2);
        }
        final int[] l = this.L();
        final Object[] m = this.M();
        final Object[] o3 = this.O();
        final int t = this.t;
        final int t2 = t + 1;
        final int c = X2.s.c(o);
        final int b = this.B();
        final int n = c & b;
        int n2 = X2.l.h(this.N(), n);
        int r = 0;
        Label_0266: {
            Label_0263: {
                if (n2 == 0) {
                    if (t2 <= b) {
                        X2.l.i(this.N(), n, t2);
                        break Label_0263;
                    }
                }
                else {
                    final int b2 = X2.l.b(c, b);
                    int n3 = 0;
                    while (true) {
                        final int n4 = n2 - 1;
                        final int n5 = l[n4];
                        if (X2.l.b(n5, b) == b2 && W2.k.a(o, m[n4])) {
                            o = o3[n4];
                            o3[n4] = o2;
                            this.n(n4);
                            return o;
                        }
                        n2 = X2.l.c(n5, b);
                        ++n3;
                        if (n2 != 0) {
                            continue;
                        }
                        if (n3 >= 9) {
                            return this.q().put(o, o2);
                        }
                        if (t2 > b) {
                            break;
                        }
                        l[n4] = X2.l.d(n5, t2, b);
                        break Label_0263;
                    }
                }
                r = this.R(b, X2.l.e(b), c, t);
                break Label_0266;
            }
            r = b;
        }
        this.Q(t2);
        this.F(t, o, o2, c, r);
        this.t = t2;
        this.C();
        return null;
    }
    
    public Map q() {
        final Map t = this.t(this.B() + 1);
        for (int i = this.z(); i >= 0; i = this.A(i)) {
            t.put(this.G(i), this.W(i));
        }
        this.o = t;
        this.p = null;
        this.q = null;
        this.r = null;
        this.C();
        return t;
    }
    
    @Override
    public Object remove(Object k) {
        final Map w = this.w();
        if (w != null) {
            return w.remove(k);
        }
        if ((k = this.K(k)) == k.x) {
            k = null;
        }
        return k;
    }
    
    public Set s() {
        return new d();
    }
    
    @Override
    public int size() {
        final Map w = this.w();
        if (w != null) {
            return w.size();
        }
        return this.t;
    }
    
    public Map t(final int initialCapacity) {
        return new LinkedHashMap(initialCapacity, 1.0f);
    }
    
    public Set u() {
        return new f();
    }
    
    public Collection v() {
        return new h();
    }
    
    @Override
    public Collection values() {
        Collection w;
        if ((w = this.w) == null) {
            w = this.v();
            this.w = w;
        }
        return w;
    }
    
    public Map w() {
        final Object o = this.o;
        if (o instanceof Map) {
            return (Map)o;
        }
        return null;
    }
    
    public final int x(final int n) {
        return this.L()[n];
    }
    
    public Iterator y() {
        final Map w = this.w();
        if (w != null) {
            return w.entrySet().iterator();
        }
        return new e() {
            public Entry f(final int n) {
                return new g(n);
            }
        };
    }
    
    public int z() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    public class d extends AbstractSet
    {
        @Override
        public void clear() {
            k.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            final Map w = k.this.w();
            if (w != null) {
                return w.entrySet().contains(o);
            }
            final boolean b = o instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)o;
                final int i = k.this.D(entry.getKey());
                b3 = b2;
                if (i != -1) {
                    b3 = b2;
                    if (W2.k.a(k.this.W(i), entry.getValue())) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public Iterator iterator() {
            return k.this.y();
        }
        
        @Override
        public boolean remove(final Object o) {
            final Map w = k.this.w();
            if (w != null) {
                return w.entrySet().remove(o);
            }
            if (!(o instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)o;
            if (k.this.J()) {
                return false;
            }
            final int k = X2.k.this.B();
            final int f = l.f(entry.getKey(), entry.getValue(), k, X2.k.this.N(), X2.k.this.L(), X2.k.this.M(), X2.k.this.O());
            if (f == -1) {
                return false;
            }
            X2.k.this.I(f, k);
            X2.k.e(X2.k.this);
            X2.k.this.C();
            return true;
        }
        
        @Override
        public int size() {
            return k.this.size();
        }
    }
    
    public abstract class e implements Iterator
    {
        public int o;
        public int p;
        public int q;
        
        public e() {
            this.o = k.a(k.this);
            this.p = k.this.z();
            this.q = -1;
        }
        
        public final void b() {
            if (k.a(k.this) == this.o) {
                return;
            }
            throw new ConcurrentModificationException();
        }
        
        public abstract Object d(final int p0);
        
        public void e() {
            this.o += 32;
        }
        
        @Override
        public boolean hasNext() {
            return this.p >= 0;
        }
        
        @Override
        public Object next() {
            this.b();
            if (this.hasNext()) {
                final int p = this.p;
                this.q = p;
                final Object d = this.d(p);
                this.p = k.this.A(this.p);
                return d;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            this.b();
            i.c(this.q >= 0);
            this.e();
            final k r = k.this;
            r.remove(r.G(this.q));
            this.p = k.this.o(this.p, this.q);
            this.q = -1;
        }
    }
    
    public class f extends AbstractSet
    {
        @Override
        public void clear() {
            k.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return k.this.containsKey(o);
        }
        
        @Override
        public Iterator iterator() {
            return k.this.H();
        }
        
        @Override
        public boolean remove(final Object o) {
            final Map w = k.this.w();
            if (w != null) {
                return w.keySet().remove(o);
            }
            return k.this.K(o) != k.h();
        }
        
        @Override
        public int size() {
            return k.this.size();
        }
    }
    
    public final class g extends e
    {
        public final Object o;
        public int p;
        
        public g(final int p2) {
            this.o = k.this.G(p2);
            this.p = p2;
        }
        
        public final void a() {
            final int p = this.p;
            if (p == -1 || p >= k.this.size() || !W2.k.a(this.o, k.this.G(this.p))) {
                this.p = k.this.D(this.o);
            }
        }
        
        @Override
        public Object getKey() {
            return this.o;
        }
        
        @Override
        public Object getValue() {
            final Map w = k.this.w();
            if (w != null) {
                return N.a(w.get(this.o));
            }
            this.a();
            final int p = this.p;
            if (p == -1) {
                return N.b();
            }
            return k.this.W(p);
        }
        
        @Override
        public Object setValue(final Object o) {
            final Map w = k.this.w();
            if (w != null) {
                return N.a(w.put(this.o, o));
            }
            this.a();
            final int p = this.p;
            if (p == -1) {
                k.this.put(this.o, o);
                return N.b();
            }
            final Object j = k.this.W(p);
            k.this.V(this.p, o);
            return j;
        }
    }
    
    public class h extends AbstractCollection
    {
        @Override
        public void clear() {
            k.this.clear();
        }
        
        @Override
        public Iterator iterator() {
            return k.this.X();
        }
        
        @Override
        public int size() {
            return k.this.size();
        }
    }
}
