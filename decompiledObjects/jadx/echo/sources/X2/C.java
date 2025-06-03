package X2;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class C {

    public class a extends AbstractC0684b {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Iterator f7041q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ W2.n f7042r;

        public a(Iterator it, W2.n nVar) {
            this.f7041q = it;
            this.f7042r = nVar;
        }

        @Override // X2.AbstractC0684b
        public Object b() {
            while (this.f7041q.hasNext()) {
                Object next = this.f7041q.next();
                if (this.f7042r.apply(next)) {
                    return next;
                }
            }
            return d();
        }
    }

    public static final class b extends AbstractC0683a {

        /* renamed from: r, reason: collision with root package name */
        public static final h0 f7043r = new b(new Object[0], 0);

        /* renamed from: q, reason: collision with root package name */
        public final Object[] f7044q;

        public b(Object[] objArr, int i7) {
            super(objArr.length, i7);
            this.f7044q = objArr;
        }

        @Override // X2.AbstractC0683a
        public Object b(int i7) {
            return this.f7044q[i7];
        }
    }

    public enum c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC0691i.c(false);
        }
    }

    public static final class d extends g0 {

        /* renamed from: p, reason: collision with root package name */
        public static final Object f7047p = new Object();

        /* renamed from: o, reason: collision with root package name */
        public Object f7048o;

        public d(Object obj) {
            this.f7048o = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7048o != f7047p;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f7048o;
            Object obj2 = f7047p;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.f7048o = obj2;
            return obj;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        W2.m.j(collection);
        W2.m.j(it);
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= collection.add(it.next());
        }
        return z7;
    }

    public static boolean b(Iterator it, W2.n nVar) {
        return o(it, nVar) != -1;
    }

    public static void c(Iterator it) {
        W2.m.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !W2.k.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static g0 f() {
        return g();
    }

    public static h0 g() {
        return b.f7043r;
    }

    public static Iterator h() {
        return c.INSTANCE;
    }

    public static g0 i(Iterator it, W2.n nVar) {
        W2.m.j(it);
        W2.m.j(nVar);
        return new a(it, nVar);
    }

    public static Object j(Iterator it, W2.n nVar) {
        W2.m.j(it);
        W2.m.j(nVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterator it, Object obj) {
        return it.hasNext() ? k(it) : obj;
    }

    public static Object m(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object n(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i7 = 0; i7 < 4 && it.hasNext(); i7++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static int o(Iterator it, W2.n nVar) {
        W2.m.k(nVar, "predicate");
        int i7 = 0;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static Object p(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean q(Iterator it, Collection collection) {
        W2.m.j(collection);
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static boolean r(Iterator it, W2.n nVar) {
        W2.m.j(nVar);
        boolean z7 = false;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static g0 s(Object obj) {
        return new d(obj);
    }
}
