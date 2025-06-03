package X2;

import X2.AbstractC0703v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0701t extends AbstractCollection implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final Object[] f7183o = new Object[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: X2.t$a */
    public static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f7184a;

        /* renamed from: b, reason: collision with root package name */
        public int f7185b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7186c;

        public a(int i7) {
            AbstractC0691i.b(i7, "initialCapacity");
            this.f7184a = new Object[i7];
            this.f7185b = 0;
        }

        @Override // X2.AbstractC0701t.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(this.f7185b + collection.size());
                if (collection instanceof AbstractC0701t) {
                    this.f7185b = ((AbstractC0701t) collection).d(this.f7184a, this.f7185b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            W2.m.j(obj);
            g(this.f7185b + 1);
            Object[] objArr = this.f7184a;
            int i7 = this.f7185b;
            this.f7185b = i7 + 1;
            objArr[i7] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        public final void f(Object[] objArr, int i7) {
            O.c(objArr, i7);
            g(this.f7185b + i7);
            System.arraycopy(objArr, 0, this.f7184a, this.f7185b, i7);
            this.f7185b += i7;
        }

        public final void g(int i7) {
            Object[] objArr = this.f7184a;
            if (objArr.length < i7) {
                this.f7184a = Arrays.copyOf(objArr, b.c(objArr.length, i7));
            } else if (!this.f7186c) {
                return;
            } else {
                this.f7184a = (Object[]) objArr.clone();
            }
            this.f7186c = false;
        }
    }

    /* renamed from: X2.t$b */
    public static abstract class b {
        public static int c(int i7, int i8) {
            if (i8 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return Integer.MAX_VALUE;
            }
            return i9;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AbstractC0703v a() {
        return isEmpty() ? AbstractC0703v.Y() : AbstractC0703v.s(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public abstract int d(Object[] objArr, int i7);

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean k();

    /* renamed from: q */
    public abstract g0 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f7183o);
    }

    public Object writeReplace() {
        return new AbstractC0703v.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        W2.m.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] f7 = f();
            if (f7 != null) {
                return Q.a(f7, i(), g(), objArr);
            }
            objArr = O.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
