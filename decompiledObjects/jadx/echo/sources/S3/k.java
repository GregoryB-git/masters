package S3;

import S3.c;
import S3.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: o, reason: collision with root package name */
    public h f5874o;

    /* renamed from: p, reason: collision with root package name */
    public Comparator f5875p;

    public k(h hVar, Comparator comparator) {
        this.f5874o = hVar;
        this.f5875p = comparator;
    }

    public static k M(List list, Map map, c.a.InterfaceC0091a interfaceC0091a, Comparator comparator) {
        return b.b(list, map, interfaceC0091a, comparator);
    }

    public static k S(Map map, Comparator comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }

    @Override // S3.c
    public c D(Object obj) {
        return !a(obj) ? this : new k(this.f5874o.g(obj, this.f5875p).c(null, null, h.a.BLACK, null, null), this.f5875p);
    }

    @Override // S3.c
    public Iterator P() {
        return new d(this.f5874o, null, this.f5875p, true);
    }

    public final h T(Object obj) {
        h hVar = this.f5874o;
        while (!hVar.isEmpty()) {
            int compare = this.f5875p.compare(obj, hVar.getKey());
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

    @Override // S3.c
    public boolean a(Object obj) {
        return T(obj) != null;
    }

    @Override // S3.c
    public Object d(Object obj) {
        h T6 = T(obj);
        if (T6 != null) {
            return T6.getValue();
        }
        return null;
    }

    @Override // S3.c
    public Comparator f() {
        return this.f5875p;
    }

    @Override // S3.c
    public Object g() {
        return this.f5874o.i().getKey();
    }

    @Override // S3.c
    public Object i() {
        return this.f5874o.h().getKey();
    }

    @Override // S3.c
    public boolean isEmpty() {
        return this.f5874o.isEmpty();
    }

    @Override // S3.c, java.lang.Iterable
    public Iterator iterator() {
        return new d(this.f5874o, null, this.f5875p, false);
    }

    @Override // S3.c
    public Object k(Object obj) {
        h hVar = this.f5874o;
        h hVar2 = null;
        while (!hVar.isEmpty()) {
            int compare = this.f5875p.compare(obj, hVar.getKey());
            if (compare == 0) {
                if (hVar.a().isEmpty()) {
                    if (hVar2 != null) {
                        return hVar2.getKey();
                    }
                    return null;
                }
                h a7 = hVar.a();
                while (!a7.f().isEmpty()) {
                    a7 = a7.f();
                }
                return a7.getKey();
            }
            if (compare < 0) {
                hVar = hVar.a();
            } else {
                hVar2 = hVar;
                hVar = hVar.f();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // S3.c
    public void q(h.b bVar) {
        this.f5874o.e(bVar);
    }

    @Override // S3.c
    public c s(Object obj, Object obj2) {
        return new k(this.f5874o.b(obj, obj2, this.f5875p).c(null, null, h.a.BLACK, null, null), this.f5875p);
    }

    @Override // S3.c
    public int size() {
        return this.f5874o.size();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f5876a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f5877b;

        /* renamed from: c, reason: collision with root package name */
        public final c.a.InterfaceC0091a f5878c;

        /* renamed from: d, reason: collision with root package name */
        public j f5879d;

        /* renamed from: e, reason: collision with root package name */
        public j f5880e;

        /* renamed from: S3.k$b$b, reason: collision with other inner class name */
        public static class C0093b {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5885a;

            /* renamed from: b, reason: collision with root package name */
            public int f5886b;
        }

        public b(List list, Map map, c.a.InterfaceC0091a interfaceC0091a) {
            this.f5876a = list;
            this.f5877b = map;
            this.f5878c = interfaceC0091a;
        }

        public static k b(List list, Map map, c.a.InterfaceC0091a interfaceC0091a, Comparator comparator) {
            b bVar = new b(list, map, interfaceC0091a);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0093b c0093b = (C0093b) it.next();
                int i7 = c0093b.f5886b;
                size -= i7;
                if (c0093b.f5885a) {
                    bVar.c(h.a.BLACK, i7, size);
                } else {
                    bVar.c(h.a.BLACK, i7, size);
                    int i8 = c0093b.f5886b;
                    size -= i8;
                    bVar.c(h.a.RED, i8, size);
                }
            }
            h hVar = bVar.f5879d;
            if (hVar == null) {
                hVar = g.j();
            }
            return new k(hVar, comparator);
        }

        public final h a(int i7, int i8) {
            if (i8 == 0) {
                return g.j();
            }
            if (i8 == 1) {
                Object obj = this.f5876a.get(i7);
                return new f(obj, d(obj), null, null);
            }
            int i9 = i8 / 2;
            int i10 = i7 + i9;
            h a7 = a(i7, i9);
            h a8 = a(i10 + 1, i9);
            Object obj2 = this.f5876a.get(i10);
            return new f(obj2, d(obj2), a7, a8);
        }

        public final void c(h.a aVar, int i7, int i8) {
            h a7 = a(i8 + 1, i7 - 1);
            Object obj = this.f5876a.get(i8);
            j iVar = aVar == h.a.RED ? new i(obj, d(obj), null, a7) : new f(obj, d(obj), null, a7);
            if (this.f5879d == null) {
                this.f5879d = iVar;
            } else {
                this.f5880e.u(iVar);
            }
            this.f5880e = iVar;
        }

        public final Object d(Object obj) {
            return this.f5877b.get(this.f5878c.a(obj));
        }

        public static class a implements Iterable {

            /* renamed from: o, reason: collision with root package name */
            public long f5881o;

            /* renamed from: p, reason: collision with root package name */
            public final int f5882p;

            public a(int i7) {
                int i8 = i7 + 1;
                int floor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
                this.f5882p = floor;
                this.f5881o = (((long) Math.pow(2.0d, floor)) - 1) & i8;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C0092a();
            }

            /* renamed from: S3.k$b$a$a, reason: collision with other inner class name */
            public class C0092a implements Iterator {

                /* renamed from: o, reason: collision with root package name */
                public int f5883o;

                public C0092a() {
                    this.f5883o = a.this.f5882p - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C0093b next() {
                    long j7 = a.this.f5881o & (1 << this.f5883o);
                    C0093b c0093b = new C0093b();
                    c0093b.f5885a = j7 == 0;
                    c0093b.f5886b = (int) Math.pow(2.0d, this.f5883o);
                    this.f5883o--;
                    return c0093b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f5883o >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }
        }
    }
}
