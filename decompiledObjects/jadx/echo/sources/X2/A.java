package X2;

import X2.AbstractC0706y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes.dex */
public abstract class A extends AbstractC0706y implements NavigableSet, c0 {
    private static final long serialVersionUID = 912559;

    /* renamed from: q, reason: collision with root package name */
    public final transient Comparator f7036q;

    /* renamed from: r, reason: collision with root package name */
    public transient A f7037r;

    public static final class a extends AbstractC0706y.a {

        /* renamed from: f, reason: collision with root package name */
        public final Comparator f7038f;

        public a(Comparator comparator) {
            this.f7038f = (Comparator) W2.m.j(comparator);
        }

        @Override // X2.AbstractC0706y.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // X2.AbstractC0706y.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a i(Object... objArr) {
            super.i(objArr);
            return this;
        }

        @Override // X2.AbstractC0706y.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a j(Iterable iterable) {
            super.j(iterable);
            return this;
        }

        @Override // X2.AbstractC0706y.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public A l() {
            A e02 = A.e0(this.f7038f, this.f7185b, this.f7184a);
            this.f7185b = e02.size();
            this.f7186c = true;
            return e02;
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final Comparator f7039o;

        /* renamed from: p, reason: collision with root package name */
        public final Object[] f7040p;

        public b(Comparator comparator, Object[] objArr) {
            this.f7039o = comparator;
            this.f7040p = objArr;
        }

        public Object readResolve() {
            return new a(this.f7039o).i(this.f7040p).l();
        }
    }

    public A(Comparator comparator) {
        this.f7036q = comparator;
    }

    public static A e0(Comparator comparator, int i7, Object... objArr) {
        if (i7 == 0) {
            return j0(comparator);
        }
        O.c(objArr, i7);
        Arrays.sort(objArr, 0, i7, comparator);
        int i8 = 1;
        for (int i9 = 1; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (comparator.compare(obj, objArr[i8 - 1]) != 0) {
                objArr[i8] = obj;
                i8++;
            }
        }
        Arrays.fill(objArr, i8, i7, (Object) null);
        if (i8 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new V(AbstractC0703v.D(objArr, i8), comparator);
    }

    public static A f0(Comparator comparator, Iterable iterable) {
        W2.m.j(comparator);
        if (d0.b(comparator, iterable) && (iterable instanceof A)) {
            A a7 = (A) iterable;
            if (!a7.k()) {
                return a7;
            }
        }
        Object[] k7 = B.k(iterable);
        return e0(comparator, k7.length, k7);
    }

    public static A g0(Comparator comparator, Collection collection) {
        return f0(comparator, collection);
    }

    public static V j0(Comparator comparator) {
        return P.d().equals(comparator) ? V.f7092t : new V(AbstractC0703v.Y(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int u0(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedSet, X2.c0
    public Comparator comparator() {
        return this.f7036q;
    }

    public abstract A h0();

    @Override // java.util.NavigableSet
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public A descendingSet() {
        A a7 = this.f7037r;
        if (a7 != null) {
            return a7;
        }
        A h02 = h0();
        this.f7037r = h02;
        h02.f7037r = this;
        return h02;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public A headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public A headSet(Object obj, boolean z7) {
        return m0(W2.m.j(obj), z7);
    }

    public abstract A m0(Object obj, boolean z7);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public A subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public A subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        W2.m.j(obj);
        W2.m.j(obj2);
        W2.m.d(this.f7036q.compare(obj, obj2) <= 0);
        return p0(obj, z7, obj2, z8);
    }

    public abstract A p0(Object obj, boolean z7, Object obj2, boolean z8);

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public A tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public A tailSet(Object obj, boolean z7) {
        return s0(W2.m.j(obj), z7);
    }

    public abstract A s0(Object obj, boolean z7);

    public int t0(Object obj, Object obj2) {
        return u0(this.f7036q, obj, obj2);
    }

    @Override // X2.AbstractC0706y, X2.AbstractC0701t
    public Object writeReplace() {
        return new b(this.f7036q, toArray());
    }
}
