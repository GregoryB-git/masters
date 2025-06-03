package o7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import o7.m0;
import o7.r;

/* loaded from: classes.dex */
public abstract class u<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient x<Map.Entry<K, V>> f12057a;

    /* renamed from: b, reason: collision with root package name */
    public transient x<K> f12058b;

    /* renamed from: c, reason: collision with root package name */
    public transient r<V> f12059c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f12060a;

        /* renamed from: b, reason: collision with root package name */
        public int f12061b = 0;

        /* renamed from: c, reason: collision with root package name */
        public C0189a f12062c;

        /* renamed from: o7.u$a$a, reason: collision with other inner class name */
        public static final class C0189a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f12063a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f12064b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f12065c;

            public C0189a(Object obj, Object obj2, Object obj3) {
                this.f12063a = obj;
                this.f12064b = obj2;
                this.f12065c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder l10 = defpackage.f.l("Multiple entries with same key: ");
                l10.append(this.f12063a);
                l10.append("=");
                l10.append(this.f12064b);
                l10.append(" and ");
                l10.append(this.f12063a);
                l10.append("=");
                l10.append(this.f12065c);
                return new IllegalArgumentException(l10.toString());
            }
        }

        public a(int i10) {
            this.f12060a = new Object[i10 * 2];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o7.m0 a() {
            /*
                Method dump skipped, instructions count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.u.a.a():o7.m0");
        }

        public final void b(Object obj, Object obj2) {
            int i10 = (this.f12061b + 1) * 2;
            Object[] objArr = this.f12060a;
            if (i10 > objArr.length) {
                this.f12060a = Arrays.copyOf(objArr, r.b.a(objArr.length, i10));
            }
            if (obj == null) {
                throw new NullPointerException("null key in entry: null=" + obj2);
            }
            if (obj2 == null) {
                throw new NullPointerException("null value in entry: " + obj + "=null");
            }
            Object[] objArr2 = this.f12060a;
            int i11 = this.f12061b;
            int i12 = i11 * 2;
            objArr2[i12] = obj;
            objArr2[i12 + 1] = obj2;
            this.f12061b = i11 + 1;
        }
    }

    public static <K, V> u<K, V> b(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            uVar.f();
            return uVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        a aVar = new a(z10 ? entrySet.size() : 4);
        if (z10) {
            int size = (entrySet.size() + aVar.f12061b) * 2;
            Object[] objArr = aVar.f12060a;
            if (size > objArr.length) {
                aVar.f12060a = Arrays.copyOf(objArr, r.b.a(objArr.length, size));
            }
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public abstract m0.a c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        r rVar = this.f12059c;
        if (rVar == null) {
            rVar = e();
            this.f12059c = rVar;
        }
        return rVar.contains(obj);
    }

    public abstract m0.b d();

    public abstract m0.c e();

    @Override // java.util.Map
    public final Set entrySet() {
        x<Map.Entry<K, V>> xVar = this.f12057a;
        if (xVar != null) {
            return xVar;
        }
        m0.a c10 = c();
        this.f12057a = c10;
        return c10;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return e0.a(this, obj);
    }

    public abstract void f();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public final int hashCode() {
        m0.a aVar = this.f12057a;
        if (aVar == null) {
            aVar = c();
            this.f12057a = aVar;
        }
        return u0.c(aVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        x<K> xVar = this.f12058b;
        if (xVar != null) {
            return xVar;
        }
        m0.b d10 = d();
        this.f12058b = d10;
        return d10;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        p2.m0.o(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r<V> rVar = this.f12059c;
        if (rVar != null) {
            return rVar;
        }
        m0.c e10 = e();
        this.f12059c = e10;
        return e10;
    }
}
