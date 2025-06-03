package o7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f11990r = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f11991a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f11992b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f11993c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f11994d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f11995e = r7.a.D(3, 1);
    public transient int f;

    /* renamed from: o, reason: collision with root package name */
    public transient c f11996o;

    /* renamed from: p, reason: collision with root package name */
    public transient a f11997p;

    /* renamed from: q, reason: collision with root package name */
    public transient e f11998q;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map<K, V> b10 = l.this.b();
            if (b10 != null) {
                return b10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int c10 = l.this.c(entry.getKey());
            return c10 != -1 && x6.b.Q(l.this.l(c10), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            l lVar = l.this;
            Map<K, V> b10 = lVar.b();
            return b10 != null ? b10.entrySet().iterator() : new j(lVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map<K, V> b10 = l.this.b();
            if (b10 != null) {
                return b10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (l.this.f()) {
                return false;
            }
            int i10 = (1 << (l.this.f11995e & 31)) - 1;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = l.this.f11991a;
            Objects.requireNonNull(obj2);
            int e10 = c0.e(key, value, i10, obj2, l.this.h(), l.this.i(), l.this.j());
            if (e10 == -1) {
                return false;
            }
            l.this.e(e10, i10);
            r11.f--;
            l.this.f11995e += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.size();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f12000a;

        /* renamed from: b, reason: collision with root package name */
        public int f12001b;

        /* renamed from: c, reason: collision with root package name */
        public int f12002c;

        public b() {
            this.f12000a = l.this.f11995e;
            this.f12001b = l.this.isEmpty() ? -1 : 0;
            this.f12002c = -1;
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12001b >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (l.this.f11995e != this.f12000a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f12001b;
            this.f12002c = i10;
            T a10 = a(i10);
            l lVar = l.this;
            int i11 = this.f12001b + 1;
            if (i11 >= lVar.f) {
                i11 = -1;
            }
            this.f12001b = i11;
            return a10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (l.this.f11995e != this.f12000a) {
                throw new ConcurrentModificationException();
            }
            x6.b.I(this.f12002c >= 0, "no calls to next() since the last call to remove()");
            this.f12000a += 32;
            l lVar = l.this;
            lVar.remove(lVar.d(this.f12002c));
            l lVar2 = l.this;
            int i10 = this.f12001b;
            lVar2.getClass();
            this.f12001b = i10 - 1;
            this.f12002c = -1;
        }
    }

    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            l lVar = l.this;
            Map<K, V> b10 = lVar.b();
            return b10 != null ? b10.keySet().iterator() : new i(lVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map<K, V> b10 = l.this.b();
            return b10 != null ? b10.keySet().remove(obj) : l.this.g(obj) != l.f11990r;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.size();
        }
    }

    public final class d extends o7.e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f12005a;

        /* renamed from: b, reason: collision with root package name */
        public int f12006b;

        public d(int i10) {
            Object obj = l.f11990r;
            this.f12005a = (K) l.this.d(i10);
            this.f12006b = i10;
        }

        public final void a() {
            int i10 = this.f12006b;
            if (i10 == -1 || i10 >= l.this.size() || !x6.b.Q(this.f12005a, l.this.d(this.f12006b))) {
                l lVar = l.this;
                K k10 = this.f12005a;
                Object obj = l.f11990r;
                this.f12006b = lVar.c(k10);
            }
        }

        @Override // o7.e, java.util.Map.Entry
        public final K getKey() {
            return this.f12005a;
        }

        @Override // o7.e, java.util.Map.Entry
        public final V getValue() {
            Map<K, V> b10 = l.this.b();
            if (b10 != null) {
                return b10.get(this.f12005a);
            }
            a();
            int i10 = this.f12006b;
            if (i10 == -1) {
                return null;
            }
            return (V) l.this.l(i10);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            Map<K, V> b10 = l.this.b();
            if (b10 != null) {
                return b10.put(this.f12005a, v10);
            }
            a();
            int i10 = this.f12006b;
            if (i10 == -1) {
                l.this.put(this.f12005a, v10);
                return null;
            }
            V v11 = (V) l.this.l(i10);
            l lVar = l.this;
            lVar.j()[this.f12006b] = v10;
            return v11;
        }
    }

    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            l lVar = l.this;
            Map<K, V> b10 = lVar.b();
            return b10 != null ? b10.values().iterator() : new k(lVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return l.this.size();
        }
    }

    public final Map<K, V> b() {
        Object obj = this.f11991a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c(Object obj) {
        if (f()) {
            return -1;
        }
        int s02 = x6.b.s0(obj);
        int i10 = (1 << (this.f11995e & 31)) - 1;
        Object obj2 = this.f11991a;
        Objects.requireNonNull(obj2);
        int f = c0.f(s02 & i10, obj2);
        if (f == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = s02 & i11;
        do {
            int i13 = f - 1;
            int i14 = h()[i13];
            if ((i14 & i11) == i12 && x6.b.Q(obj, d(i13))) {
                return i13;
            }
            f = i14 & i10;
        } while (f != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f11995e += 32;
        Map<K, V> b10 = b();
        if (b10 != null) {
            this.f11995e = r7.a.D(size(), 3);
            b10.clear();
            this.f11991a = null;
        } else {
            Arrays.fill(i(), 0, this.f, (Object) null);
            Arrays.fill(j(), 0, this.f, (Object) null);
            Object obj = this.f11991a;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(h(), 0, this.f, 0);
        }
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> b10 = b();
        return b10 != null ? b10.containsKey(obj) : c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f; i10++) {
            if (x6.b.Q(obj, l(i10))) {
                return true;
            }
        }
        return false;
    }

    public final K d(int i10) {
        return (K) i()[i10];
    }

    public final void e(int i10, int i11) {
        Object obj = this.f11991a;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int size = size() - 1;
        if (i10 >= size) {
            i12[i10] = null;
            j10[i10] = null;
            h10[i10] = 0;
            return;
        }
        Object obj2 = i12[size];
        i12[i10] = obj2;
        j10[i10] = j10[size];
        i12[size] = null;
        j10[size] = null;
        h10[i10] = h10[size];
        h10[size] = 0;
        int s02 = x6.b.s0(obj2) & i11;
        int f = c0.f(s02, obj);
        int i13 = size + 1;
        if (f == i13) {
            c0.g(obj, s02, i10 + 1);
            return;
        }
        while (true) {
            int i14 = f - 1;
            int i15 = h10[i14];
            int i16 = i15 & i11;
            if (i16 == i13) {
                h10[i14] = ((i10 + 1) & i11) | (i15 & (~i11));
                return;
            }
            f = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.f11997p;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f11997p = aVar2;
        return aVar2;
    }

    public final boolean f() {
        return this.f11991a == null;
    }

    public final Object g(Object obj) {
        if (f()) {
            return f11990r;
        }
        int i10 = (1 << (this.f11995e & 31)) - 1;
        Object obj2 = this.f11991a;
        Objects.requireNonNull(obj2);
        int e10 = c0.e(obj, null, i10, obj2, h(), i(), null);
        if (e10 == -1) {
            return f11990r;
        }
        V l10 = l(e10);
        e(e10, i10);
        this.f--;
        this.f11995e += 32;
        return l10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int c10 = c(obj);
        if (c10 == -1) {
            return null;
        }
        return l(c10);
    }

    public final int[] h() {
        int[] iArr = this.f11992b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f11993c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f11994d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object a10 = c0.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            c0.g(a10, i12 & i14, i13 + 1);
        }
        Object obj = this.f11991a;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int f = c0.f(i15, obj);
            while (f != 0) {
                int i16 = f - 1;
                int i17 = h10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int f10 = c0.f(i19, a10);
                c0.g(a10, i19, f);
                h10[i16] = ((~i14) & i18) | (f10 & i14);
                f = i17 & i10;
            }
        }
        this.f11991a = a10;
        this.f11995e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f11995e & (-32));
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.f11996o;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f11996o = cVar2;
        return cVar2;
    }

    public final V l(int i10) {
        return (V) j()[i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e9 -> B:40:0x00d5). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V put(K r19, V r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.l.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        V v10 = (V) g(obj);
        if (v10 == f11990r) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> b10 = b();
        return b10 != null ? b10.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.f11998q;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f11998q = eVar2;
        return eVar2;
    }
}
