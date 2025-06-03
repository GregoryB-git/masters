package t8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t8.c;
import t8.h;

/* loaded from: classes.dex */
public final class k<K, V> extends c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public h<K, V> f14663a;

    /* renamed from: b, reason: collision with root package name */
    public Comparator<K> f14664b;

    public static class a<A, B, C> {

        /* renamed from: a, reason: collision with root package name */
        public final List<A> f14665a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<B, C> f14666b;

        /* renamed from: c, reason: collision with root package name */
        public final c.a.InterfaceC0231a<A, B> f14667c;

        /* renamed from: d, reason: collision with root package name */
        public j<A, C> f14668d;

        /* renamed from: e, reason: collision with root package name */
        public j<A, C> f14669e;

        /* renamed from: t8.k$a$a, reason: collision with other inner class name */
        public static class C0232a implements Iterable<b> {

            /* renamed from: a, reason: collision with root package name */
            public long f14670a;

            /* renamed from: b, reason: collision with root package name */
            public final int f14671b;

            /* renamed from: t8.k$a$a$a, reason: collision with other inner class name */
            public class C0233a implements Iterator<b> {

                /* renamed from: a, reason: collision with root package name */
                public int f14672a;

                public C0233a() {
                    this.f14672a = C0232a.this.f14671b - 1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f14672a >= 0;
                }

                @Override // java.util.Iterator
                public final b next() {
                    long j10 = C0232a.this.f14670a & (1 << this.f14672a);
                    b bVar = new b();
                    bVar.f14674a = j10 == 0;
                    bVar.f14675b = (int) Math.pow(2.0d, this.f14672a);
                    this.f14672a--;
                    return bVar;
                }

                @Override // java.util.Iterator
                public final void remove() {
                }
            }

            public C0232a(int i10) {
                int i11 = i10 + 1;
                int floor = (int) Math.floor(Math.log(i11) / Math.log(2.0d));
                this.f14671b = floor;
                this.f14670a = (((long) Math.pow(2.0d, floor)) - 1) & i11;
            }

            @Override // java.lang.Iterable
            public final Iterator<b> iterator() {
                return new C0233a();
            }
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public boolean f14674a;

            /* renamed from: b, reason: collision with root package name */
            public int f14675b;
        }

        public a(List list, Map map) {
            e0.e eVar = c.a.f14649a;
            this.f14665a = list;
            this.f14666b = map;
            this.f14667c = eVar;
        }

        public static k b(List list, Map map, Comparator comparator) {
            h.a aVar = h.a.BLACK;
            a aVar2 = new a(list, map);
            Collections.sort(list, comparator);
            C0232a c0232a = new C0232a(list.size());
            int i10 = c0232a.f14671b - 1;
            int size = list.size();
            while (true) {
                if (!(i10 >= 0)) {
                    break;
                }
                long j10 = c0232a.f14670a & (1 << i10);
                b bVar = new b();
                bVar.f14674a = j10 == 0;
                int pow = (int) Math.pow(2.0d, i10);
                bVar.f14675b = pow;
                i10--;
                size -= pow;
                boolean z10 = bVar.f14674a;
                aVar2.c(aVar, pow, size);
                if (!z10) {
                    int i11 = bVar.f14675b;
                    size -= i11;
                    aVar2.c(h.a.RED, i11, size);
                }
            }
            h hVar = aVar2.f14668d;
            if (hVar == null) {
                hVar = g.f14655a;
            }
            return new k(hVar, comparator);
        }

        public final h<A, C> a(int i10, int i11) {
            if (i11 == 0) {
                return g.f14655a;
            }
            if (i11 == 1) {
                A a10 = this.f14665a.get(i10);
                return new f(a10, d(a10), null, null);
            }
            int i12 = i11 / 2;
            int i13 = i10 + i12;
            h<A, C> a11 = a(i10, i12);
            h<A, C> a12 = a(i13 + 1, i12);
            A a13 = this.f14665a.get(i13);
            return new f(a13, d(a13), a11, a12);
        }

        public final void c(h.a aVar, int i10, int i11) {
            h<A, C> a10 = a(i11 + 1, i10 - 1);
            A a11 = this.f14665a.get(i11);
            j<A, C> iVar = aVar == h.a.RED ? new i<>(a11, d(a11), null, a10) : new f<>(a11, d(a11), null, a10);
            if (this.f14668d == null) {
                this.f14668d = iVar;
            } else {
                this.f14669e.r(iVar);
            }
            this.f14669e = iVar;
        }

        public final C d(A a10) {
            Map<B, C> map = this.f14666b;
            ((e0.e) this.f14667c).getClass();
            return map.get(a10);
        }
    }

    public k(h<K, V> hVar, Comparator<K> comparator) {
        this.f14663a = hVar;
        this.f14664b = comparator;
    }

    @Override // t8.c
    public final boolean a(K k10) {
        return q(k10) != null;
    }

    @Override // t8.c
    public final V h(K k10) {
        h<K, V> q10 = q(k10);
        if (q10 != null) {
            return q10.getValue();
        }
        return null;
    }

    @Override // t8.c
    public final Comparator<K> i() {
        return this.f14664b;
    }

    @Override // t8.c
    public final boolean isEmpty() {
        return this.f14663a.isEmpty();
    }

    @Override // t8.c, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new d(this.f14663a, null, this.f14664b);
    }

    @Override // t8.c
    public final K k() {
        return this.f14663a.h().getKey();
    }

    @Override // t8.c
    public final K l() {
        return this.f14663a.g().getKey();
    }

    @Override // t8.c
    public final int m(j9.g gVar) {
        h<K, V> hVar = this.f14663a;
        int i10 = 0;
        while (!hVar.isEmpty()) {
            int compare = this.f14664b.compare(gVar, hVar.getKey());
            if (compare == 0) {
                return hVar.a().size() + i10;
            }
            if (compare < 0) {
                hVar = hVar.a();
            } else {
                i10 += hVar.a().size() + 1;
                hVar = hVar.f();
            }
        }
        return -1;
    }

    @Override // t8.c
    public final c<K, V> n(K k10, V v10) {
        return new k(this.f14663a.b(k10, v10, this.f14664b).d(h.a.BLACK, null, null), this.f14664b);
    }

    @Override // t8.c
    public final Iterator<Map.Entry<K, V>> o(K k10) {
        return new d(this.f14663a, k10, this.f14664b);
    }

    @Override // t8.c
    public final c<K, V> p(K k10) {
        return !a(k10) ? this : new k(this.f14663a.c(k10, this.f14664b).d(h.a.BLACK, null, null), this.f14664b);
    }

    public final h<K, V> q(K k10) {
        h<K, V> hVar = this.f14663a;
        while (!hVar.isEmpty()) {
            int compare = this.f14664b.compare(k10, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.a();
            } else {
                if (compare == 0) {
                    return hVar;
                }
                hVar = hVar.f();
            }
        }
        return null;
    }

    @Override // t8.c
    public final int size() {
        return this.f14663a.size();
    }
}
