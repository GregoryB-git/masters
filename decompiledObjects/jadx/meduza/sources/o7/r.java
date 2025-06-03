package o7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import o7.t;

/* loaded from: classes.dex */
public abstract class r<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f12040a = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f12041a;

        /* renamed from: b, reason: collision with root package name */
        public int f12042b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12043c;

        public a() {
            p2.m0.o(4, "initialCapacity");
            this.f12041a = new Object[4];
            this.f12042b = 0;
        }

        public final void b(int i10) {
            Object[] objArr = this.f12041a;
            if (objArr.length < i10) {
                this.f12041a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
            } else if (!this.f12043c) {
                return;
            } else {
                this.f12041a = (Object[]) objArr.clone();
            }
            this.f12043c = false;
        }
    }

    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
    }

    public t<E> a() {
        if (isEmpty()) {
            t.b bVar = t.f12050b;
            return l0.f12009e;
        }
        Object[] array = toArray();
        t.b bVar2 = t.f12050b;
        return t.o(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int h(int i10, Object[] objArr) {
        x0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] i() {
        return null;
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public int l() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean m();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract x0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f12040a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] i10 = i();
            if (i10 != null) {
                return (T[]) Arrays.copyOfRange(i10, l(), k(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        h(0, tArr);
        return tArr;
    }
}
