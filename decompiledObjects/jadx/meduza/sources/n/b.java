package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public c<K, V> f11164a;

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f11165b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f11166c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public int f11167d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f11171d;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f11170c;
        }
    }

    /* renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0167b<K, V> extends e<K, V> {
        public C0167b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f11170c;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f11171d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f11168a;

        /* renamed from: b, reason: collision with root package name */
        public final V f11169b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f11170c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f11171d;

        public c(K k10, V v10) {
            this.f11168a = k10;
            this.f11169b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11168a.equals(cVar.f11168a) && this.f11169b.equals(cVar.f11169b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f11168a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f11169b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f11168a.hashCode() ^ this.f11169b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f11168a + "=" + this.f11169b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f11172a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11173b = true;

        public d() {
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f11172a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f11171d;
                this.f11172a = cVar3;
                this.f11173b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f11173b) {
                return b.this.f11164a != null;
            }
            c<K, V> cVar = this.f11172a;
            return (cVar == null || cVar.f11170c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f11173b) {
                this.f11173b = false;
                cVar = b.this.f11164a;
            } else {
                c<K, V> cVar2 = this.f11172a;
                cVar = cVar2 != null ? cVar2.f11170c : null;
            }
            this.f11172a = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f11175a;

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f11176b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f11175a = cVar2;
            this.f11176b = cVar;
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f11175a == cVar && cVar == this.f11176b) {
                this.f11176b = null;
                this.f11175a = null;
            }
            c<K, V> cVar3 = this.f11175a;
            if (cVar3 == cVar) {
                this.f11175a = b(cVar3);
            }
            c<K, V> cVar4 = this.f11176b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f11175a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f11176b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f11176b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f11176b;
            c<K, V> cVar2 = this.f11175a;
            this.f11176b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f11164a;
        while (cVar != null && !cVar.f11168a.equals(k10)) {
            cVar = cVar.f11170c;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof n.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.b r7 = (n.b) r7
            int r1 = r6.f11167d
            int r3 = r7.f11167d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b$e r3 = (n.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b$e r4 = (n.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b$e r7 = (n.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.equals(java.lang.Object):boolean");
    }

    public V h(K k10, V v10) {
        c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f11169b;
        }
        c<K, V> cVar = new c<>(k10, v10);
        this.f11167d++;
        c<K, V> cVar2 = this.f11165b;
        if (cVar2 == null) {
            this.f11164a = cVar;
        } else {
            cVar2.f11170c = cVar;
            cVar.f11171d = cVar2;
        }
        this.f11165b = cVar;
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public V i(K k10) {
        c<K, V> a10 = a(k10);
        if (a10 == null) {
            return null;
        }
        this.f11167d--;
        if (!this.f11166c.isEmpty()) {
            Iterator<f<K, V>> it = this.f11166c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a10);
            }
        }
        c<K, V> cVar = a10.f11171d;
        c<K, V> cVar2 = a10.f11170c;
        if (cVar != null) {
            cVar.f11170c = cVar2;
        } else {
            this.f11164a = cVar2;
        }
        c<K, V> cVar3 = a10.f11170c;
        if (cVar3 != null) {
            cVar3.f11171d = cVar;
        } else {
            this.f11165b = cVar;
        }
        a10.f11170c = null;
        a10.f11171d = null;
        return a10.f11169b;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f11164a, this.f11165b);
        this.f11166c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                l10.append("]");
                return l10.toString();
            }
            l10.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                l10.append(", ");
            }
        }
    }
}
