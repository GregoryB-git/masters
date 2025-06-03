package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o7.r;

/* loaded from: classes.dex */
public abstract class t<E> extends r<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final b f12050b = new b(0, l0.f12009e);

    public static final class a<E> extends r.a<E> {
        public final void c(Object obj) {
            obj.getClass();
            b(this.f12042b + 1);
            Object[] objArr = this.f12041a;
            int i10 = this.f12042b;
            this.f12042b = i10 + 1;
            objArr[i10] = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(List list) {
            if (list instanceof Collection) {
                b(list.size() + this.f12042b);
                if (list instanceof r) {
                    this.f12042b = ((r) list).h(this.f12042b, this.f12041a);
                    return;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public final l0 e() {
            this.f12043c = true;
            return t.o(this.f12042b, this.f12041a);
        }
    }

    public static class b<E> extends o7.a<E> {

        /* renamed from: c, reason: collision with root package name */
        public final t<E> f12051c;

        public b(int i10, t tVar) {
            super(tVar.size(), i10);
            this.f12051c = tVar;
        }

        @Override // o7.a
        public final E b(int i10) {
            return this.f12051c.get(i10);
        }
    }

    public class c extends t<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient int f12052c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f12053d;

        public c(int i10, int i11) {
            this.f12052c = i10;
            this.f12053d = i11;
        }

        @Override // java.util.List
        public final E get(int i10) {
            x6.b.v(i10, this.f12053d);
            return t.this.get(i10 + this.f12052c);
        }

        @Override // o7.r
        public final Object[] i() {
            return t.this.i();
        }

        @Override // o7.t, o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // o7.r
        public final int k() {
            return t.this.l() + this.f12052c + this.f12053d;
        }

        @Override // o7.r
        public final int l() {
            return t.this.l() + this.f12052c;
        }

        @Override // o7.t, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // o7.t, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }

        @Override // o7.r
        public final boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f12053d;
        }

        @Override // o7.t, java.util.List
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public final t<E> subList(int i10, int i11) {
            x6.b.E(i10, i11, this.f12053d);
            t tVar = t.this;
            int i12 = this.f12052c;
            return tVar.subList(i10 + i12, i11 + i12);
        }
    }

    public static l0 o(int i10, Object[] objArr) {
        return i10 == 0 ? l0.f12009e : new l0(objArr, i10);
    }

    public static <E> t<E> p(Collection<? extends E> collection) {
        if (!(collection instanceof r)) {
            Object[] array = collection.toArray();
            x6.b.w(array.length, array);
            return o(array.length, array);
        }
        t<E> a10 = ((r) collection).a();
        if (!a10.m()) {
            return a10;
        }
        Object[] array2 = a10.toArray();
        return o(array2.length, array2);
    }

    public static l0 q(Object[] objArr) {
        if (objArr.length == 0) {
            return l0.f12009e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        x6.b.w(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static l0 s(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        x6.b.w(5, objArr);
        return o(5, objArr);
    }

    public static l0 t(Object obj) {
        Object[] objArr = {obj};
        x6.b.w(1, objArr);
        return o(1, objArr);
    }

    public static l0 u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        x6.b.w(2, objArr);
        return o(2, objArr);
    }

    @Override // o7.r
    @Deprecated
    public final t<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (x6.b.Q(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && x6.b.Q(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // o7.r
    public int h(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o7.r
    /* renamed from: n */
    public final x0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i10) {
        x6.b.D(i10, size());
        return isEmpty() ? f12050b : new b(i10, this);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: x */
    public t<E> subList(int i10, int i11) {
        x6.b.E(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? l0.f12009e : new c(i10, i12);
    }
}
