package Q3;

import java.util.Iterator;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final d4.i f4346a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4347b;

    public class a implements Iterable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Iterator f4348o;

        /* renamed from: Q3.b$a$a, reason: collision with other inner class name */
        public class C0083a implements Iterator {
            public C0083a() {
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b next() {
                d4.m mVar = (d4.m) a.this.f4348o.next();
                return new b(b.this.f4347b.W(mVar.c().e()), d4.i.d(mVar.d()));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return a.this.f4348o.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        public a(Iterator it) {
            this.f4348o = it;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0083a();
        }
    }

    public b(e eVar, d4.i iVar) {
        this.f4346a = iVar;
        this.f4347b = eVar;
    }

    public boolean b() {
        return !this.f4346a.k().isEmpty();
    }

    public Iterable c() {
        return new a(this.f4346a.iterator());
    }

    public long d() {
        return this.f4346a.k().E();
    }

    public String e() {
        return this.f4347b.X();
    }

    public Object f() {
        Object value = this.f4346a.k().t().getValue();
        return value instanceof Long ? Double.valueOf(((Long) value).longValue()) : value;
    }

    public e g() {
        return this.f4347b;
    }

    public Object h() {
        return this.f4346a.k().getValue();
    }

    public Object i(boolean z7) {
        return this.f4346a.k().L(z7);
    }

    public String toString() {
        return "DataSnapshot { key = " + this.f4347b.X() + ", value = " + this.f4346a.k().L(true) + " }";
    }
}
