package tb;

import ec.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<K, V> implements Map<K, V>, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final c f14718v;

    /* renamed from: a, reason: collision with root package name */
    public K[] f14719a;

    /* renamed from: b, reason: collision with root package name */
    public V[] f14720b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f14721c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14722d;

    /* renamed from: e, reason: collision with root package name */
    public int f14723e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public int f14724o;

    /* renamed from: p, reason: collision with root package name */
    public int f14725p;

    /* renamed from: q, reason: collision with root package name */
    public int f14726q;

    /* renamed from: r, reason: collision with root package name */
    public tb.e<K> f14727r;

    /* renamed from: s, reason: collision with root package name */
    public tb.f<V> f14728s;
    public tb.d<K, V> t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14729u;

    public static final class a {
    }

    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<K, V> cVar) {
            super(cVar);
            i.e(cVar, "map");
        }

        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i10 = this.f14734b;
            c<K, V> cVar = this.f14733a;
            if (i10 >= cVar.f) {
                throw new NoSuchElementException();
            }
            this.f14734b = i10 + 1;
            this.f14735c = i10;
            C0237c c0237c = new C0237c(cVar, i10);
            b();
            return c0237c;
        }
    }

    /* renamed from: tb.c$c, reason: collision with other inner class name */
    public static final class C0237c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final c<K, V> f14730a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14731b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14732c;

        public C0237c(c<K, V> cVar, int i10) {
            i.e(cVar, "map");
            this.f14730a = cVar;
            this.f14731b = i10;
            this.f14732c = cVar.f14725p;
        }

        public final void a() {
            if (this.f14730a.f14725p != this.f14732c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return this.f14730a.f14719a[this.f14731b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            V[] vArr = this.f14730a.f14720b;
            i.b(vArr);
            return vArr[this.f14731b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            a();
            this.f14730a.c();
            c<K, V> cVar = this.f14730a;
            V[] vArr = cVar.f14720b;
            if (vArr == null) {
                vArr = (V[]) x6.b.g(cVar.f14719a.length);
                cVar.f14720b = vArr;
            }
            int i10 = this.f14731b;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    public static class d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final c<K, V> f14733a;

        /* renamed from: b, reason: collision with root package name */
        public int f14734b;

        /* renamed from: c, reason: collision with root package name */
        public int f14735c;

        /* renamed from: d, reason: collision with root package name */
        public int f14736d;

        public d(c<K, V> cVar) {
            i.e(cVar, "map");
            this.f14733a = cVar;
            this.f14735c = -1;
            this.f14736d = cVar.f14725p;
            b();
        }

        public final void a() {
            if (this.f14733a.f14725p != this.f14736d) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i10 = this.f14734b;
                c<K, V> cVar = this.f14733a;
                if (i10 >= cVar.f || cVar.f14721c[i10] >= 0) {
                    return;
                } else {
                    this.f14734b = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f14734b < this.f14733a.f;
        }

        public final void remove() {
            a();
            if (!(this.f14735c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f14733a.c();
            this.f14733a.k(this.f14735c);
            this.f14735c = -1;
            this.f14736d = this.f14733a.f14725p;
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K> {
        public e(c<K, V> cVar) {
            super(cVar);
        }

        @Override // java.util.Iterator
        public final K next() {
            a();
            int i10 = this.f14734b;
            c<K, V> cVar = this.f14733a;
            if (i10 >= cVar.f) {
                throw new NoSuchElementException();
            }
            this.f14734b = i10 + 1;
            this.f14735c = i10;
            K k10 = cVar.f14719a[i10];
            b();
            return k10;
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V> {
        public f(c<K, V> cVar) {
            super(cVar);
        }

        @Override // java.util.Iterator
        public final V next() {
            a();
            int i10 = this.f14734b;
            c<K, V> cVar = this.f14733a;
            if (i10 >= cVar.f) {
                throw new NoSuchElementException();
            }
            this.f14734b = i10 + 1;
            this.f14735c = i10;
            V[] vArr = cVar.f14720b;
            i.b(vArr);
            V v10 = vArr[this.f14735c];
            b();
            return v10;
        }
    }

    static {
        new a();
        c cVar = new c(0);
        cVar.f14729u = true;
        f14718v = cVar;
    }

    public c() {
        this(8);
    }

    public c(int i10) {
        K[] kArr = (K[]) x6.b.g(i10);
        int[] iArr = new int[i10];
        int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f14719a = kArr;
        this.f14720b = null;
        this.f14721c = iArr;
        this.f14722d = new int[highestOneBit];
        this.f14723e = 2;
        this.f = 0;
        this.f14724o = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int b(K k10) {
        c();
        while (true) {
            int i10 = i(k10);
            int i11 = this.f14723e * 2;
            int length = this.f14722d.length / 2;
            if (i11 > length) {
                i11 = length;
            }
            int i12 = 0;
            while (true) {
                int[] iArr = this.f14722d;
                int i13 = iArr[i10];
                if (i13 <= 0) {
                    int i14 = this.f;
                    K[] kArr = this.f14719a;
                    if (i14 < kArr.length) {
                        int i15 = i14 + 1;
                        this.f = i15;
                        kArr[i14] = k10;
                        this.f14721c[i14] = i10;
                        iArr[i10] = i15;
                        this.f14726q++;
                        this.f14725p++;
                        if (i12 > this.f14723e) {
                            this.f14723e = i12;
                        }
                        return i14;
                    }
                    g(1);
                } else {
                    if (i.a(this.f14719a[i13 - 1], k10)) {
                        return -i13;
                    }
                    i12++;
                    if (i12 > i11) {
                        j(this.f14722d.length * 2);
                        break;
                    }
                    i10 = i10 == 0 ? this.f14722d.length - 1 : i10 - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f14729u) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f14721c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f14722d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        x6.b.o0(this.f14719a, 0, this.f);
        V[] vArr = this.f14720b;
        if (vArr != null) {
            x6.b.o0(vArr, 0, this.f);
        }
        this.f14726q = 0;
        this.f = 0;
        this.f14725p++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i10;
        int i11 = this.f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            }
            if (this.f14721c[i11] >= 0) {
                V[] vArr = this.f14720b;
                i.b(vArr);
                if (i.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        return i10 >= 0;
    }

    public final void d(boolean z10) {
        int i10;
        V[] vArr = this.f14720b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f14721c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f14719a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f14722d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        x6.b.o0(this.f14719a, i12, i10);
        if (vArr != null) {
            x6.b.o0(vArr, i12, this.f);
        }
        this.f = i12;
    }

    public final boolean e(Collection<?> collection) {
        i.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        tb.d<K, V> dVar = this.t;
        if (dVar != null) {
            return dVar;
        }
        tb.d<K, V> dVar2 = new tb.d<>(this);
        this.t = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (!(this.f14726q == map.size() && e(map.entrySet()))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(Map.Entry<? extends K, ? extends V> entry) {
        i.e(entry, "entry");
        int h10 = h(entry.getKey());
        if (h10 < 0) {
            return false;
        }
        V[] vArr = this.f14720b;
        i.b(vArr);
        return i.a(vArr[h10], entry.getValue());
    }

    public final void g(int i10) {
        V[] vArr;
        K[] kArr = this.f14719a;
        int length = kArr.length;
        int i11 = this.f;
        int i12 = length - i11;
        int i13 = i11 - this.f14726q;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= kArr.length / 4) {
            d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > kArr.length) {
            int length2 = kArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i15);
            i.d(kArr2, "copyOf(...)");
            this.f14719a = kArr2;
            V[] vArr2 = this.f14720b;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i15);
                i.d(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.f14720b = vArr;
            int[] copyOf = Arrays.copyOf(this.f14721c, i15);
            i.d(copyOf, "copyOf(...)");
            this.f14721c = copyOf;
            int highestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (highestOneBit > this.f14722d.length) {
                j(highestOneBit);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int h10 = h(obj);
        if (h10 < 0) {
            return null;
        }
        V[] vArr = this.f14720b;
        i.b(vArr);
        return vArr[h10];
    }

    public final int h(K k10) {
        int i10 = i(k10);
        int i11 = this.f14723e;
        while (true) {
            int i12 = this.f14722d[i10];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (i.a(this.f14719a[i13], k10)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            i10 = i10 == 0 ? this.f14722d.length - 1 : i10 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            int i11 = bVar.f14734b;
            c<K, V> cVar = bVar.f14733a;
            if (i11 >= cVar.f) {
                throw new NoSuchElementException();
            }
            bVar.f14734b = i11 + 1;
            bVar.f14735c = i11;
            K k10 = cVar.f14719a[i11];
            int hashCode = k10 != null ? k10.hashCode() : 0;
            V[] vArr = bVar.f14733a.f14720b;
            i.b(vArr);
            V v10 = vArr[bVar.f14735c];
            int hashCode2 = v10 != null ? v10.hashCode() : 0;
            bVar.b();
            i10 += hashCode ^ hashCode2;
        }
        return i10;
    }

    public final int i(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f14724o;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14726q == 0;
    }

    public final void j(int i10) {
        boolean z10;
        this.f14725p++;
        if (this.f > this.f14726q) {
            d(false);
        }
        this.f14722d = new int[i10];
        this.f14724o = Integer.numberOfLeadingZeros(i10) + 1;
        int i11 = 0;
        while (i11 < this.f) {
            int i12 = i11 + 1;
            int i13 = i(this.f14719a[i11]);
            int i14 = this.f14723e;
            while (true) {
                int[] iArr = this.f14722d;
                if (iArr[i13] == 0) {
                    iArr[i13] = i12;
                    this.f14721c[i11] = i13;
                    z10 = true;
                    break;
                } else {
                    i14--;
                    if (i14 < 0) {
                        z10 = false;
                        break;
                    }
                    i13 = i13 == 0 ? iArr.length - 1 : i13 - 1;
                }
            }
            if (!z10) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f14719a
            java.lang.String r1 = "<this>"
            ec.i.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.f14720b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f14721c
            r0 = r0[r12]
            int r1 = r11.f14723e
            int r1 = r1 * 2
            int[] r2 = r11.f14722d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L2e
            int[] r0 = r11.f14722d
            int r0 = r0.length
            int r0 = r0 + r6
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f14723e
            if (r4 <= r5) goto L3a
            int[] r0 = r11.f14722d
            r0[r1] = r2
            goto L69
        L3a:
            int[] r5 = r11.f14722d
            r7 = r5[r0]
            if (r7 != 0) goto L43
            r5[r1] = r2
            goto L69
        L43:
            if (r7 >= 0) goto L48
            r5[r1] = r6
            goto L60
        L48:
            K[] r5 = r11.f14719a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f14722d
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L62
            r9[r1] = r7
            int[] r4 = r11.f14721c
            r4[r8] = r1
        L60:
            r1 = r0
            r4 = r2
        L62:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f14722d
            r0[r1] = r6
        L69:
            int[] r0 = r11.f14721c
            r0[r12] = r6
            int r12 = r11.f14726q
            int r12 = r12 + r6
            r11.f14726q = r12
            int r12 = r11.f14725p
            int r12 = r12 + 1
            r11.f14725p = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c.k(int):void");
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        tb.e<K> eVar = this.f14727r;
        if (eVar != null) {
            return eVar;
        }
        tb.e<K> eVar2 = new tb.e<>(this);
        this.f14727r = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        c();
        int b10 = b(k10);
        V[] vArr = this.f14720b;
        if (vArr == null) {
            vArr = (V[]) x6.b.g(this.f14719a.length);
            this.f14720b = vArr;
        }
        if (b10 >= 0) {
            vArr[b10] = v10;
            return null;
        }
        int i10 = (-b10) - 1;
        V v11 = vArr[i10];
        vArr[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i.e(map, "from");
        c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int b10 = b(entry.getKey());
            V[] vArr = this.f14720b;
            if (vArr == null) {
                vArr = (V[]) x6.b.g(this.f14719a.length);
                this.f14720b = vArr;
            }
            if (b10 >= 0) {
                vArr[b10] = entry.getValue();
            } else {
                int i10 = (-b10) - 1;
                if (!i.a(entry.getValue(), vArr[i10])) {
                    vArr[i10] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        c();
        int h10 = h(obj);
        if (h10 < 0) {
            return null;
        }
        V[] vArr = this.f14720b;
        i.b(vArr);
        V v10 = vArr[h10];
        k(h10);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14726q;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f14726q * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        b bVar = new b(this);
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = bVar.f14734b;
            c<K, V> cVar = bVar.f14733a;
            if (i11 >= cVar.f) {
                throw new NoSuchElementException();
            }
            bVar.f14734b = i11 + 1;
            bVar.f14735c = i11;
            K k10 = cVar.f14719a[i11];
            if (k10 == cVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k10);
            }
            sb2.append('=');
            V[] vArr = bVar.f14733a.f14720b;
            i.b(vArr);
            V v10 = vArr[bVar.f14735c];
            if (v10 == bVar.f14733a) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v10);
            }
            bVar.b();
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        i.d(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        tb.f<V> fVar = this.f14728s;
        if (fVar != null) {
            return fVar;
        }
        tb.f<V> fVar2 = new tb.f<>(this);
        this.f14728s = fVar2;
        return fVar2;
    }
}
