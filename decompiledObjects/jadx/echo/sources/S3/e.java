package S3;

import S3.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public final c f5863o;

    public static class a implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public final Iterator f5864o;

        public a(Iterator it) {
            this.f5864o = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5864o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f5864o.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f5864o.remove();
        }
    }

    public e(c cVar) {
        this.f5863o = cVar;
    }

    public Iterator P() {
        return new a(this.f5863o.P());
    }

    public Object a() {
        return this.f5863o.g();
    }

    public Object d() {
        return this.f5863o.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f5863o.equals(((e) obj).f5863o);
        }
        return false;
    }

    public Object f(Object obj) {
        return this.f5863o.k(obj);
    }

    public e g(Object obj) {
        return new e(this.f5863o.s(obj, null));
    }

    public int hashCode() {
        return this.f5863o.hashCode();
    }

    public e i(Object obj) {
        c D7 = this.f5863o.D(obj);
        return D7 == this.f5863o ? this : new e(D7);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f5863o.iterator());
    }

    public e(List list, Comparator comparator) {
        this.f5863o = c.a.b(list, Collections.emptyMap(), c.a.e(), comparator);
    }
}
