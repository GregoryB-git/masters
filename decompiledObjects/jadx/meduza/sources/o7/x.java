package o7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import o7.t;

/* loaded from: classes.dex */
public abstract class x<E> extends r<E> implements Set<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12072c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient t<E> f12073b;

    public static int o(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            x6.b.s("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static <E> x<E> p(int i10, Object... objArr) {
        if (i10 == 0) {
            return n0.f12030r;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new v0(obj);
        }
        int o10 = o(i10);
        Object[] objArr2 = new Object[o10];
        int i11 = o10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(defpackage.f.h("at index ", i14));
            }
            int hashCode = obj2.hashCode();
            int r02 = x6.b.r0(hashCode);
            while (true) {
                int i15 = r02 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                r02++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new v0(obj4);
        }
        if (o(i13) < o10 / 2) {
            return p(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new n0(objArr, i12, objArr2, i11, i13);
    }

    public static <E> x<E> q(Collection<? extends E> collection) {
        if ((collection instanceof x) && !(collection instanceof SortedSet)) {
            x<E> xVar = (x) collection;
            if (!xVar.m()) {
                return xVar;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    public static x s(String str, String str2, String str3) {
        return p(3, str, str2, str3);
    }

    @Override // o7.r
    public t<E> a() {
        t<E> tVar = this.f12073b;
        if (tVar != null) {
            return tVar;
        }
        t<E> r10 = r();
        this.f12073b = r10;
        return r10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x) && (this instanceof n0)) {
            x xVar = (x) obj;
            xVar.getClass();
            if ((xVar instanceof n0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return u0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return u0.c(this);
    }

    @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public t<E> r() {
        Object[] array = toArray();
        t.b bVar = t.f12050b;
        return t.o(array.length, array);
    }
}
