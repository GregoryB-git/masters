package X2;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: X2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0693k extends AbstractMap implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f7153x = new Object();

    /* renamed from: o, reason: collision with root package name */
    public transient Object f7154o;

    /* renamed from: p, reason: collision with root package name */
    public transient int[] f7155p;

    /* renamed from: q, reason: collision with root package name */
    public transient Object[] f7156q;

    /* renamed from: r, reason: collision with root package name */
    public transient Object[] f7157r;

    /* renamed from: s, reason: collision with root package name */
    public transient int f7158s;

    /* renamed from: t, reason: collision with root package name */
    public transient int f7159t;

    /* renamed from: u, reason: collision with root package name */
    public transient Set f7160u;

    /* renamed from: v, reason: collision with root package name */
    public transient Set f7161v;

    /* renamed from: w, reason: collision with root package name */
    public transient Collection f7162w;

    /* renamed from: X2.k$a */
    public class a extends e {
        public a() {
            super(C0693k.this, null);
        }

        @Override // X2.C0693k.e
        public Object d(int i7) {
            return C0693k.this.G(i7);
        }
    }

    /* renamed from: X2.k$b */
    public class b extends e {
        public b() {
            super(C0693k.this, null);
        }

        @Override // X2.C0693k.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry d(int i7) {
            return C0693k.this.new g(i7);
        }
    }

    /* renamed from: X2.k$c */
    public class c extends e {
        public c() {
            super(C0693k.this, null);
        }

        @Override // X2.C0693k.e
        public Object d(int i7) {
            return C0693k.this.W(i7);
        }
    }

    /* renamed from: X2.k$d */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0693k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map w7 = C0693k.this.w();
            if (w7 != null) {
                return w7.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int D7 = C0693k.this.D(entry.getKey());
            return D7 != -1 && W2.k.a(C0693k.this.W(D7), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0693k.this.y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map w7 = C0693k.this.w();
            if (w7 != null) {
                return w7.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C0693k.this.J()) {
                return false;
            }
            int B7 = C0693k.this.B();
            int f7 = AbstractC0694l.f(entry.getKey(), entry.getValue(), B7, C0693k.this.N(), C0693k.this.L(), C0693k.this.M(), C0693k.this.O());
            if (f7 == -1) {
                return false;
            }
            C0693k.this.I(f7, B7);
            C0693k.e(C0693k.this);
            C0693k.this.C();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0693k.this.size();
        }
    }

    /* renamed from: X2.k$e */
    public abstract class e implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f7167o;

        /* renamed from: p, reason: collision with root package name */
        public int f7168p;

        /* renamed from: q, reason: collision with root package name */
        public int f7169q;

        public e() {
            this.f7167o = C0693k.this.f7158s;
            this.f7168p = C0693k.this.z();
            this.f7169q = -1;
        }

        public final void b() {
            if (C0693k.this.f7158s != this.f7167o) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object d(int i7);

        public void e() {
            this.f7167o += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7168p >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = this.f7168p;
            this.f7169q = i7;
            Object d7 = d(i7);
            this.f7168p = C0693k.this.A(this.f7168p);
            return d7;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            AbstractC0691i.c(this.f7169q >= 0);
            e();
            C0693k c0693k = C0693k.this;
            c0693k.remove(c0693k.G(this.f7169q));
            this.f7168p = C0693k.this.o(this.f7168p, this.f7169q);
            this.f7169q = -1;
        }

        public /* synthetic */ e(C0693k c0693k, a aVar) {
            this();
        }
    }

    /* renamed from: X2.k$f */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0693k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0693k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0693k.this.H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map w7 = C0693k.this.w();
            return w7 != null ? w7.keySet().remove(obj) : C0693k.this.K(obj) != C0693k.f7153x;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0693k.this.size();
        }
    }

    /* renamed from: X2.k$g */
    public final class g extends AbstractC0687e {

        /* renamed from: o, reason: collision with root package name */
        public final Object f7172o;

        /* renamed from: p, reason: collision with root package name */
        public int f7173p;

        public g(int i7) {
            this.f7172o = C0693k.this.G(i7);
            this.f7173p = i7;
        }

        public final void a() {
            int i7 = this.f7173p;
            if (i7 == -1 || i7 >= C0693k.this.size() || !W2.k.a(this.f7172o, C0693k.this.G(this.f7173p))) {
                this.f7173p = C0693k.this.D(this.f7172o);
            }
        }

        @Override // X2.AbstractC0687e, java.util.Map.Entry
        public Object getKey() {
            return this.f7172o;
        }

        @Override // X2.AbstractC0687e, java.util.Map.Entry
        public Object getValue() {
            Map w7 = C0693k.this.w();
            if (w7 != null) {
                return N.a(w7.get(this.f7172o));
            }
            a();
            int i7 = this.f7173p;
            return i7 == -1 ? N.b() : C0693k.this.W(i7);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map w7 = C0693k.this.w();
            if (w7 != null) {
                return N.a(w7.put(this.f7172o, obj));
            }
            a();
            int i7 = this.f7173p;
            if (i7 == -1) {
                C0693k.this.put(this.f7172o, obj);
                return N.b();
            }
            Object W6 = C0693k.this.W(i7);
            C0693k.this.V(this.f7173p, obj);
            return W6;
        }
    }

    /* renamed from: X2.k$h */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C0693k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C0693k.this.X();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C0693k.this.size();
        }
    }

    public C0693k() {
        E(3);
    }

    public static /* synthetic */ int e(C0693k c0693k) {
        int i7 = c0693k.f7159t;
        c0693k.f7159t = i7 - 1;
        return i7;
    }

    public static C0693k r() {
        return new C0693k();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        E(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator y7 = y();
        while (y7.hasNext()) {
            Map.Entry entry = (Map.Entry) y7.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public int A(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f7159t) {
            return i8;
        }
        return -1;
    }

    public final int B() {
        return (1 << (this.f7158s & 31)) - 1;
    }

    public void C() {
        this.f7158s += 32;
    }

    public final int D(Object obj) {
        if (J()) {
            return -1;
        }
        int c7 = AbstractC0700s.c(obj);
        int B7 = B();
        int h7 = AbstractC0694l.h(N(), c7 & B7);
        if (h7 == 0) {
            return -1;
        }
        int b7 = AbstractC0694l.b(c7, B7);
        do {
            int i7 = h7 - 1;
            int x7 = x(i7);
            if (AbstractC0694l.b(x7, B7) == b7 && W2.k.a(obj, G(i7))) {
                return i7;
            }
            h7 = AbstractC0694l.c(x7, B7);
        } while (h7 != 0);
        return -1;
    }

    public void E(int i7) {
        W2.m.e(i7 >= 0, "Expected size must be >= 0");
        this.f7158s = a3.f.f(i7, 1, 1073741823);
    }

    public void F(int i7, Object obj, Object obj2, int i8, int i9) {
        S(i7, AbstractC0694l.d(i8, 0, i9));
        U(i7, obj);
        V(i7, obj2);
    }

    public final Object G(int i7) {
        return M()[i7];
    }

    public Iterator H() {
        Map w7 = w();
        return w7 != null ? w7.keySet().iterator() : new a();
    }

    public void I(int i7, int i8) {
        Object N6 = N();
        int[] L6 = L();
        Object[] M6 = M();
        Object[] O6 = O();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            M6[i7] = null;
            O6[i7] = null;
            L6[i7] = 0;
            return;
        }
        Object obj = M6[i9];
        M6[i7] = obj;
        O6[i7] = O6[i9];
        M6[i9] = null;
        O6[i9] = null;
        L6[i7] = L6[i9];
        L6[i9] = 0;
        int c7 = AbstractC0700s.c(obj) & i8;
        int h7 = AbstractC0694l.h(N6, c7);
        if (h7 == size) {
            AbstractC0694l.i(N6, c7, i7 + 1);
            return;
        }
        while (true) {
            int i10 = h7 - 1;
            int i11 = L6[i10];
            int c8 = AbstractC0694l.c(i11, i8);
            if (c8 == size) {
                L6[i10] = AbstractC0694l.d(i11, i7 + 1, i8);
                return;
            }
            h7 = c8;
        }
    }

    public boolean J() {
        return this.f7154o == null;
    }

    public final Object K(Object obj) {
        if (J()) {
            return f7153x;
        }
        int B7 = B();
        int f7 = AbstractC0694l.f(obj, null, B7, N(), L(), M(), null);
        if (f7 == -1) {
            return f7153x;
        }
        Object W6 = W(f7);
        I(f7, B7);
        this.f7159t--;
        C();
        return W6;
    }

    public final int[] L() {
        int[] iArr = this.f7155p;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] M() {
        Object[] objArr = this.f7156q;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object N() {
        Object obj = this.f7154o;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] O() {
        Object[] objArr = this.f7157r;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void P(int i7) {
        this.f7155p = Arrays.copyOf(L(), i7);
        this.f7156q = Arrays.copyOf(M(), i7);
        this.f7157r = Arrays.copyOf(O(), i7);
    }

    public final void Q(int i7) {
        int min;
        int length = L().length;
        if (i7 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        P(min);
    }

    public final int R(int i7, int i8, int i9, int i10) {
        Object a7 = AbstractC0694l.a(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC0694l.i(a7, i9 & i11, i10 + 1);
        }
        Object N6 = N();
        int[] L6 = L();
        for (int i12 = 0; i12 <= i7; i12++) {
            int h7 = AbstractC0694l.h(N6, i12);
            while (h7 != 0) {
                int i13 = h7 - 1;
                int i14 = L6[i13];
                int b7 = AbstractC0694l.b(i14, i7) | i12;
                int i15 = b7 & i11;
                int h8 = AbstractC0694l.h(a7, i15);
                AbstractC0694l.i(a7, i15, h7);
                L6[i13] = AbstractC0694l.d(b7, h8, i11);
                h7 = AbstractC0694l.c(i14, i7);
            }
        }
        this.f7154o = a7;
        T(i11);
        return i11;
    }

    public final void S(int i7, int i8) {
        L()[i7] = i8;
    }

    public final void T(int i7) {
        this.f7158s = AbstractC0694l.d(this.f7158s, 32 - Integer.numberOfLeadingZeros(i7), 31);
    }

    public final void U(int i7, Object obj) {
        M()[i7] = obj;
    }

    public final void V(int i7, Object obj) {
        O()[i7] = obj;
    }

    public final Object W(int i7) {
        return O()[i7];
    }

    public Iterator X() {
        Map w7 = w();
        return w7 != null ? w7.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (J()) {
            return;
        }
        C();
        Map w7 = w();
        if (w7 != null) {
            this.f7158s = a3.f.f(size(), 3, 1073741823);
            w7.clear();
            this.f7154o = null;
        } else {
            Arrays.fill(M(), 0, this.f7159t, (Object) null);
            Arrays.fill(O(), 0, this.f7159t, (Object) null);
            AbstractC0694l.g(N());
            Arrays.fill(L(), 0, this.f7159t, 0);
        }
        this.f7159t = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map w7 = w();
        return w7 != null ? w7.containsKey(obj) : D(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map w7 = w();
        if (w7 != null) {
            return w7.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f7159t; i7++) {
            if (W2.k.a(obj, W(i7))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f7161v;
        if (set != null) {
            return set;
        }
        Set s7 = s();
        this.f7161v = s7;
        return s7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map w7 = w();
        if (w7 != null) {
            return w7.get(obj);
        }
        int D7 = D(obj);
        if (D7 == -1) {
            return null;
        }
        n(D7);
        return W(D7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f7160u;
        if (set != null) {
            return set;
        }
        Set u7 = u();
        this.f7160u = u7;
        return u7;
    }

    public int o(int i7, int i8) {
        return i7 - 1;
    }

    public int p() {
        W2.m.p(J(), "Arrays already allocated");
        int i7 = this.f7158s;
        int j7 = AbstractC0694l.j(i7);
        this.f7154o = AbstractC0694l.a(j7);
        T(j7 - 1);
        this.f7155p = new int[i7];
        this.f7156q = new Object[i7];
        this.f7157r = new Object[i7];
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int i7;
        if (J()) {
            p();
        }
        Map w7 = w();
        if (w7 != null) {
            return w7.put(obj, obj2);
        }
        int[] L6 = L();
        Object[] M6 = M();
        Object[] O6 = O();
        int i8 = this.f7159t;
        int i9 = i8 + 1;
        int c7 = AbstractC0700s.c(obj);
        int B7 = B();
        int i10 = c7 & B7;
        int h7 = AbstractC0694l.h(N(), i10);
        if (h7 == 0) {
            if (i9 <= B7) {
                AbstractC0694l.i(N(), i10, i9);
                i7 = B7;
            }
            i7 = R(B7, AbstractC0694l.e(B7), c7, i8);
        } else {
            int b7 = AbstractC0694l.b(c7, B7);
            int i11 = 0;
            while (true) {
                int i12 = h7 - 1;
                int i13 = L6[i12];
                if (AbstractC0694l.b(i13, B7) == b7 && W2.k.a(obj, M6[i12])) {
                    Object obj3 = O6[i12];
                    O6[i12] = obj2;
                    n(i12);
                    return obj3;
                }
                int c8 = AbstractC0694l.c(i13, B7);
                i11++;
                if (c8 != 0) {
                    h7 = c8;
                } else {
                    if (i11 >= 9) {
                        return q().put(obj, obj2);
                    }
                    if (i9 <= B7) {
                        L6[i12] = AbstractC0694l.d(i13, i9, B7);
                    }
                }
            }
        }
        Q(i9);
        F(i8, obj, obj2, c7, i7);
        this.f7159t = i9;
        C();
        return null;
    }

    public Map q() {
        Map t7 = t(B() + 1);
        int z7 = z();
        while (z7 >= 0) {
            t7.put(G(z7), W(z7));
            z7 = A(z7);
        }
        this.f7154o = t7;
        this.f7155p = null;
        this.f7156q = null;
        this.f7157r = null;
        C();
        return t7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map w7 = w();
        if (w7 != null) {
            return w7.remove(obj);
        }
        Object K6 = K(obj);
        if (K6 == f7153x) {
            return null;
        }
        return K6;
    }

    public Set s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map w7 = w();
        return w7 != null ? w7.size() : this.f7159t;
    }

    public Map t(int i7) {
        return new LinkedHashMap(i7, 1.0f);
    }

    public Set u() {
        return new f();
    }

    public Collection v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f7162w;
        if (collection != null) {
            return collection;
        }
        Collection v7 = v();
        this.f7162w = v7;
        return v7;
    }

    public Map w() {
        Object obj = this.f7154o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int x(int i7) {
        return L()[i7];
    }

    public Iterator y() {
        Map w7 = w();
        return w7 != null ? w7.entrySet().iterator() : new b();
    }

    public int z() {
        return isEmpty() ? -1 : 0;
    }

    public void n(int i7) {
    }
}
