package X2;

import X2.AbstractC0701t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* renamed from: X2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0704w implements Map, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final Map.Entry[] f7196r = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: o, reason: collision with root package name */
    public transient AbstractC0706y f7197o;

    /* renamed from: p, reason: collision with root package name */
    public transient AbstractC0706y f7198p;

    /* renamed from: q, reason: collision with root package name */
    public transient AbstractC0701t f7199q;

    /* renamed from: X2.w$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Comparator f7200a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f7201b;

        /* renamed from: c, reason: collision with root package name */
        public int f7202c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7203d;

        /* renamed from: e, reason: collision with root package name */
        public C0127a f7204e;

        /* renamed from: X2.w$a$a, reason: collision with other inner class name */
        public static final class C0127a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f7205a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f7206b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f7207c;

            public C0127a(Object obj, Object obj2, Object obj3) {
                this.f7205a = obj;
                this.f7206b = obj2;
                this.f7207c = obj3;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f7205a + "=" + this.f7206b + " and " + this.f7205a + "=" + this.f7207c);
            }
        }

        public a() {
            this(4);
        }

        public static void i(Object[] objArr, int i7, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, P.b(comparator).f(G.l()));
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }

        public AbstractC0704w a() {
            return c();
        }

        public final AbstractC0704w b(boolean z7) {
            Object[] objArr;
            C0127a c0127a;
            C0127a c0127a2;
            if (z7 && (c0127a2 = this.f7204e) != null) {
                throw c0127a2.a();
            }
            int i7 = this.f7202c;
            if (this.f7200a == null) {
                objArr = this.f7201b;
            } else {
                if (this.f7203d) {
                    this.f7201b = Arrays.copyOf(this.f7201b, i7 * 2);
                }
                objArr = this.f7201b;
                if (!z7) {
                    objArr = e(objArr, this.f7202c);
                    if (objArr.length < this.f7201b.length) {
                        i7 = objArr.length >>> 1;
                    }
                }
                i(objArr, i7, this.f7200a);
            }
            this.f7203d = true;
            T l7 = T.l(i7, objArr, this);
            if (!z7 || (c0127a = this.f7204e) == null) {
                return l7;
            }
            throw c0127a.a();
        }

        public AbstractC0704w c() {
            return b(true);
        }

        public final void d(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f7201b;
            if (i8 > objArr.length) {
                this.f7201b = Arrays.copyOf(objArr, AbstractC0701t.b.c(objArr.length, i8));
                this.f7203d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                Object obj = objArr[i8 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i8);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7 * 2) {
                if (bitSet.get(i9 >>> 1)) {
                    i9 += 2;
                } else {
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    Object obj2 = objArr[i9];
                    Objects.requireNonNull(obj2);
                    objArr2[i10] = obj2;
                    i10 += 2;
                    i9 += 2;
                    Object obj3 = objArr[i12];
                    Objects.requireNonNull(obj3);
                    objArr2[i11] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.f7202c + 1);
            AbstractC0691i.a(obj, obj2);
            Object[] objArr = this.f7201b;
            int i7 = this.f7202c;
            objArr[i7 * 2] = obj;
            objArr[(i7 * 2) + 1] = obj2;
            this.f7202c = i7 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f7202c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a(int i7) {
            this.f7201b = new Object[i7 * 2];
            this.f7202c = 0;
            this.f7203d = false;
        }
    }

    /* renamed from: X2.w$b */
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final Object f7208o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f7209p;

        public b(AbstractC0704w abstractC0704w) {
            Object[] objArr = new Object[abstractC0704w.size()];
            Object[] objArr2 = new Object[abstractC0704w.size()];
            g0 it = abstractC0704w.entrySet().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i7] = entry.getKey();
                objArr2[i7] = entry.getValue();
                i7++;
            }
            this.f7208o = objArr;
            this.f7209p = objArr2;
        }

        public final Object a() {
            Object[] objArr = (Object[]) this.f7208o;
            Object[] objArr2 = (Object[]) this.f7209p;
            a b7 = b(objArr.length);
            for (int i7 = 0; i7 < objArr.length; i7++) {
                b7.f(objArr[i7], objArr2[i7]);
            }
            return b7.c();
        }

        public a b(int i7) {
            return new a(i7);
        }

        public final Object readResolve() {
            Object obj = this.f7208o;
            if (!(obj instanceof AbstractC0706y)) {
                return a();
            }
            AbstractC0706y abstractC0706y = (AbstractC0706y) obj;
            AbstractC0701t abstractC0701t = (AbstractC0701t) this.f7209p;
            a b7 = b(abstractC0706y.size());
            g0 it = abstractC0706y.iterator();
            g0 it2 = abstractC0701t.iterator();
            while (it.hasNext()) {
                b7.f(it.next(), it2.next());
            }
            return b7.c();
        }
    }

    public static a a() {
        return new a();
    }

    public static AbstractC0704w b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC0704w c(Map map) {
        if ((map instanceof AbstractC0704w) && !(map instanceof SortedMap)) {
            AbstractC0704w abstractC0704w = (AbstractC0704w) map;
            if (!abstractC0704w.h()) {
                return abstractC0704w;
            }
        }
        return b(map.entrySet());
    }

    public static AbstractC0704w j() {
        return T.f7071v;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC0706y d();

    public abstract AbstractC0706y e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return G.c(this, obj);
    }

    public abstract AbstractC0701t f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC0706y entrySet() {
        AbstractC0706y abstractC0706y = this.f7197o;
        if (abstractC0706y != null) {
            return abstractC0706y;
        }
        AbstractC0706y d7 = d();
        this.f7197o = d7;
        return d7;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return a0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC0706y keySet() {
        AbstractC0706y abstractC0706y = this.f7198p;
        if (abstractC0706y != null) {
            return abstractC0706y;
        }
        AbstractC0706y e7 = e();
        this.f7198p = e7;
        return e7;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC0701t values() {
        AbstractC0701t abstractC0701t = this.f7199q;
        if (abstractC0701t != null) {
            return abstractC0701t;
        }
        AbstractC0701t f7 = f();
        this.f7199q = f7;
        return f7;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return G.k(this);
    }

    public Object writeReplace() {
        return new b(this);
    }
}
