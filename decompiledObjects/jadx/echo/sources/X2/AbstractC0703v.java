package X2;

import X2.AbstractC0701t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0703v extends AbstractC0701t implements List, RandomAccess {

    /* renamed from: p, reason: collision with root package name */
    public static final h0 f7189p = new b(S.f7068s, 0);
    private static final long serialVersionUID = -889275714;

    /* renamed from: X2.v$a */
    public static final class a extends AbstractC0701t.a {
        public a() {
            this(4);
        }

        @Override // X2.AbstractC0701t.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC0703v k() {
            this.f7186c = true;
            return AbstractC0703v.D(this.f7184a, this.f7185b);
        }

        public a(int i7) {
            super(i7);
        }
    }

    /* renamed from: X2.v$b */
    public static class b extends AbstractC0683a {

        /* renamed from: q, reason: collision with root package name */
        public final AbstractC0703v f7190q;

        public b(AbstractC0703v abstractC0703v, int i7) {
            super(abstractC0703v.size(), i7);
            this.f7190q = abstractC0703v;
        }

        @Override // X2.AbstractC0683a
        public Object b(int i7) {
            return this.f7190q.get(i7);
        }
    }

    /* renamed from: X2.v$c */
    public static class c extends AbstractC0703v {

        /* renamed from: q, reason: collision with root package name */
        public final transient AbstractC0703v f7191q;

        public c(AbstractC0703v abstractC0703v) {
            this.f7191q = abstractC0703v;
        }

        @Override // X2.AbstractC0703v, X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7191q.contains(obj);
        }

        @Override // X2.AbstractC0703v
        public AbstractC0703v f0() {
            return this.f7191q;
        }

        @Override // java.util.List
        public Object get(int i7) {
            W2.m.h(i7, size());
            return this.f7191q.get(j0(i7));
        }

        @Override // X2.AbstractC0703v, java.util.List
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public AbstractC0703v subList(int i7, int i8) {
            W2.m.n(i7, i8, size());
            return this.f7191q.subList(k0(i8), k0(i7)).f0();
        }

        @Override // X2.AbstractC0703v, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f7191q.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return j0(lastIndexOf);
            }
            return -1;
        }

        @Override // X2.AbstractC0703v, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public final int j0(int i7) {
            return (size() - 1) - i7;
        }

        @Override // X2.AbstractC0701t
        public boolean k() {
            return this.f7191q.k();
        }

        public final int k0(int i7) {
            return size() - i7;
        }

        @Override // X2.AbstractC0703v, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f7191q.indexOf(obj);
            if (indexOf >= 0) {
                return j0(indexOf);
            }
            return -1;
        }

        @Override // X2.AbstractC0703v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7191q.size();
        }

        @Override // X2.AbstractC0703v, X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // X2.AbstractC0703v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    /* renamed from: X2.v$d */
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final Object[] f7192o;

        public d(Object[] objArr) {
            this.f7192o = objArr;
        }

        public Object readResolve() {
            return AbstractC0703v.V(this.f7192o);
        }
    }

    /* renamed from: X2.v$e */
    public class e extends AbstractC0703v {

        /* renamed from: q, reason: collision with root package name */
        public final transient int f7193q;

        /* renamed from: r, reason: collision with root package name */
        public final transient int f7194r;

        public e(int i7, int i8) {
            this.f7193q = i7;
            this.f7194r = i8;
        }

        @Override // X2.AbstractC0701t
        public Object[] f() {
            return AbstractC0703v.this.f();
        }

        @Override // X2.AbstractC0701t
        public int g() {
            return AbstractC0703v.this.i() + this.f7193q + this.f7194r;
        }

        @Override // java.util.List
        public Object get(int i7) {
            W2.m.h(i7, this.f7194r);
            return AbstractC0703v.this.get(i7 + this.f7193q);
        }

        @Override // X2.AbstractC0703v, java.util.List
        /* renamed from: h0 */
        public AbstractC0703v subList(int i7, int i8) {
            W2.m.n(i7, i8, this.f7194r);
            AbstractC0703v abstractC0703v = AbstractC0703v.this;
            int i9 = this.f7193q;
            return abstractC0703v.subList(i7 + i9, i8 + i9);
        }

        @Override // X2.AbstractC0701t
        public int i() {
            return AbstractC0703v.this.i() + this.f7193q;
        }

        @Override // X2.AbstractC0703v, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // X2.AbstractC0701t
        public boolean k() {
            return true;
        }

        @Override // X2.AbstractC0703v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7194r;
        }

        @Override // X2.AbstractC0703v, X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // X2.AbstractC0703v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    public static AbstractC0703v D(Object[] objArr, int i7) {
        return i7 == 0 ? Y() : new S(objArr, i7);
    }

    public static a M() {
        return new a();
    }

    public static a S(int i7) {
        AbstractC0691i.b(i7, "expectedSize");
        return new a(i7);
    }

    public static AbstractC0703v T(Object... objArr) {
        return s(O.b(objArr));
    }

    public static AbstractC0703v U(Collection collection) {
        if (!(collection instanceof AbstractC0701t)) {
            return T(collection.toArray());
        }
        AbstractC0703v a7 = ((AbstractC0701t) collection).a();
        return a7.k() ? s(a7.toArray()) : a7;
    }

    public static AbstractC0703v V(Object[] objArr) {
        return objArr.length == 0 ? Y() : T((Object[]) objArr.clone());
    }

    public static AbstractC0703v Y() {
        return S.f7068s;
    }

    public static AbstractC0703v Z(Object obj) {
        return T(obj);
    }

    public static AbstractC0703v a0(Object obj, Object obj2) {
        return T(obj, obj2);
    }

    public static AbstractC0703v b0(Object obj, Object obj2, Object obj3) {
        return T(obj, obj2, obj3);
    }

    public static AbstractC0703v c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return T(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC0703v d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return T(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC0703v e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        W2.m.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return T(objArr2);
    }

    public static AbstractC0703v g0(Comparator comparator, Iterable iterable) {
        W2.m.j(comparator);
        Object[] k7 = B.k(iterable);
        O.b(k7);
        Arrays.sort(k7, comparator);
        return s(k7);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static AbstractC0703v s(Object[] objArr) {
        return D(objArr, objArr.length);
    }

    @Override // java.util.List
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public h0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public h0 listIterator(int i7) {
        W2.m.l(i7, size());
        return isEmpty() ? f7189p : new b(this, i7);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // X2.AbstractC0701t
    public int d(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return E.c(this, obj);
    }

    public AbstractC0703v f0() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: h0 */
    public AbstractC0703v subList(int i7, int i8) {
        W2.m.n(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? Y() : i0(i7, i8);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    public AbstractC0703v i0(int i7, int i8) {
        return new e(i7, i8 - i7);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return E.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return E.f(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g0 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // X2.AbstractC0701t
    public Object writeReplace() {
        return new d(toArray());
    }

    @Override // X2.AbstractC0701t
    public final AbstractC0703v a() {
        return this;
    }
}
