package X2;

import X2.AbstractC0701t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0706y extends AbstractC0701t implements Set {
    private static final long serialVersionUID = 912559;

    /* renamed from: p, reason: collision with root package name */
    public transient AbstractC0703v f7221p;

    /* renamed from: X2.y$a */
    public static class a extends AbstractC0701t.a {

        /* renamed from: d, reason: collision with root package name */
        public Object[] f7222d;

        /* renamed from: e, reason: collision with root package name */
        public int f7223e;

        public a() {
            super(4);
        }

        @Override // X2.AbstractC0701t.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            W2.m.j(obj);
            if (this.f7222d != null && AbstractC0706y.M(this.f7185b) <= this.f7222d.length) {
                k(obj);
                return this;
            }
            this.f7222d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f7222d != null) {
                for (Object obj : objArr) {
                    a(obj);
                }
            } else {
                super.e(objArr);
            }
            return this;
        }

        public a j(Iterable iterable) {
            W2.m.j(iterable);
            if (this.f7222d != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public final void k(Object obj) {
            Objects.requireNonNull(this.f7222d);
            int length = this.f7222d.length - 1;
            int hashCode = obj.hashCode();
            int b7 = AbstractC0700s.b(hashCode);
            while (true) {
                int i7 = b7 & length;
                Object[] objArr = this.f7222d;
                Object obj2 = objArr[i7];
                if (obj2 == null) {
                    objArr[i7] = obj;
                    this.f7223e += hashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    b7 = i7 + 1;
                }
            }
        }

        public AbstractC0706y l() {
            AbstractC0706y S6;
            int i7 = this.f7185b;
            if (i7 == 0) {
                return AbstractC0706y.X();
            }
            if (i7 == 1) {
                Object obj = this.f7184a[0];
                Objects.requireNonNull(obj);
                return AbstractC0706y.Y(obj);
            }
            if (this.f7222d == null || AbstractC0706y.M(i7) != this.f7222d.length) {
                S6 = AbstractC0706y.S(this.f7185b, this.f7184a);
                this.f7185b = S6.size();
            } else {
                Object[] copyOf = AbstractC0706y.d0(this.f7185b, this.f7184a.length) ? Arrays.copyOf(this.f7184a, this.f7185b) : this.f7184a;
                S6 = new U(copyOf, this.f7223e, this.f7222d, r5.length - 1, this.f7185b);
            }
            this.f7186c = true;
            this.f7222d = null;
            return S6;
        }
    }

    /* renamed from: X2.y$b */
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final Object[] f7224o;

        public b(Object[] objArr) {
            this.f7224o = objArr;
        }

        public Object readResolve() {
            return AbstractC0706y.U(this.f7224o);
        }
    }

    public static int M(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            W2.m.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static AbstractC0706y S(int i7, Object... objArr) {
        if (i7 == 0) {
            return X();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return Y(obj);
        }
        int M6 = M(i7);
        Object[] objArr2 = new Object[M6];
        int i8 = M6 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object a7 = O.a(objArr[i11], i11);
            int hashCode = a7.hashCode();
            int b7 = AbstractC0700s.b(hashCode);
            while (true) {
                int i12 = b7 & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = a7;
                    objArr2[i12] = a7;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(a7)) {
                    break;
                }
                b7++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new b0(obj3);
        }
        if (M(i10) < M6 / 2) {
            return S(i10, objArr);
        }
        if (d0(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new U(objArr, i9, objArr2, i8, i10);
    }

    public static AbstractC0706y T(Collection collection) {
        if ((collection instanceof AbstractC0706y) && !(collection instanceof SortedSet)) {
            AbstractC0706y abstractC0706y = (AbstractC0706y) collection;
            if (!abstractC0706y.k()) {
                return abstractC0706y;
            }
        }
        Object[] array = collection.toArray();
        return S(array.length, array);
    }

    public static AbstractC0706y U(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? S(objArr.length, (Object[]) objArr.clone()) : Y(objArr[0]) : X();
    }

    public static AbstractC0706y X() {
        return U.f7086w;
    }

    public static AbstractC0706y Y(Object obj) {
        return new b0(obj);
    }

    public static AbstractC0706y Z(Object obj, Object obj2) {
        return S(2, obj, obj2);
    }

    public static AbstractC0706y a0(Object obj, Object obj2, Object obj3) {
        return S(3, obj, obj2, obj3);
    }

    public static AbstractC0706y b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return S(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC0706y c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        W2.m.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return S(length, objArr2);
    }

    public static boolean d0(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AbstractC0703v V() {
        return AbstractC0703v.s(toArray());
    }

    public boolean W() {
        return false;
    }

    @Override // X2.AbstractC0701t
    public AbstractC0703v a() {
        AbstractC0703v abstractC0703v = this.f7221p;
        if (abstractC0703v != null) {
            return abstractC0703v;
        }
        AbstractC0703v V6 = V();
        this.f7221p = V6;
        return V6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0706y) && W() && ((AbstractC0706y) obj).W() && hashCode() != obj.hashCode()) {
            return false;
        }
        return a0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a0.d(this);
    }

    @Override // X2.AbstractC0701t
    /* renamed from: q */
    public abstract g0 iterator();

    @Override // X2.AbstractC0701t
    public Object writeReplace() {
        return new b(toArray());
    }
}
