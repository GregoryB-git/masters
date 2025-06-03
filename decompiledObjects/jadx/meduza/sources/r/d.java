package r;

import b.a0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import r.g;

/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13466e = new int[0];
    public static final Object[] f = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    public static Object[] f13467o;

    /* renamed from: p, reason: collision with root package name */
    public static int f13468p;

    /* renamed from: q, reason: collision with root package name */
    public static Object[] f13469q;

    /* renamed from: r, reason: collision with root package name */
    public static int f13470r;

    /* renamed from: a, reason: collision with root package name */
    public int[] f13471a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13472b;

    /* renamed from: c, reason: collision with root package name */
    public int f13473c;

    /* renamed from: d, reason: collision with root package name */
    public c f13474d;

    public d() {
        this(0);
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f13471a = f13466e;
            this.f13472b = f;
        } else {
            a(i10);
        }
        this.f13473c = 0;
    }

    public static void h(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f13470r < 10) {
                    objArr[0] = f13469q;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f13469q = objArr;
                    f13470r++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (d.class) {
                if (f13468p < 10) {
                    objArr[0] = f13467o;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f13467o = objArr;
                    f13468p++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f13469q;
                if (objArr != null) {
                    this.f13472b = objArr;
                    f13469q = (Object[]) objArr[0];
                    this.f13471a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f13470r--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f13467o;
                if (objArr2 != null) {
                    this.f13472b = objArr2;
                    f13467o = (Object[]) objArr2[0];
                    this.f13471a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f13468p--;
                    return;
                }
            }
        }
        this.f13471a = new int[i10];
        this.f13472b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = k();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = i(hashCode, e10);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f13473c;
        int[] iArr = this.f13471a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f13472b;
            a(i14);
            int[] iArr2 = this.f13471a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f13472b, 0, objArr.length);
            }
            h(iArr, objArr, this.f13473c);
        }
        int i15 = this.f13473c;
        if (i12 < i15) {
            int[] iArr3 = this.f13471a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f13472b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f13473c - i12);
        }
        this.f13471a[i12] = i10;
        this.f13472b[i12] = e10;
        this.f13473c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f13473c;
        int[] iArr = this.f13471a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f13472b;
            a(size);
            int i10 = this.f13473c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f13471a, 0, i10);
                System.arraycopy(objArr, 0, this.f13472b, 0, this.f13473c);
            }
            h(iArr, objArr, this.f13473c);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f13473c;
        if (i10 != 0) {
            h(this.f13471a, this.f13472b, i10);
            this.f13471a = f13466e;
            this.f13472b = f;
            this.f13473c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f13473c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f13473c; i10++) {
                try {
                    if (!set.contains(this.f13472b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f13471a;
        int i10 = this.f13473c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int i(int i10, Object obj) {
        int i11 = this.f13473c;
        if (i11 == 0) {
            return -1;
        }
        int j10 = a0.j(i11, i10, this.f13471a);
        if (j10 < 0 || obj.equals(this.f13472b[j10])) {
            return j10;
        }
        int i12 = j10 + 1;
        while (i12 < i11 && this.f13471a[i12] == i10) {
            if (obj.equals(this.f13472b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = j10 - 1; i13 >= 0 && this.f13471a[i13] == i10; i13--) {
            if (obj.equals(this.f13472b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int indexOf(Object obj) {
        return obj == null ? k() : i(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13473c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f13474d == null) {
            this.f13474d = new c(this);
        }
        c cVar = this.f13474d;
        if (cVar.f13481b == null) {
            cVar.f13481b = new g.c();
        }
        return (Iterator<E>) cVar.f13481b.iterator();
    }

    public final int k() {
        int i10 = this.f13473c;
        if (i10 == 0) {
            return -1;
        }
        int j10 = a0.j(i10, 0, this.f13471a);
        if (j10 < 0 || this.f13472b[j10] == null) {
            return j10;
        }
        int i11 = j10 + 1;
        while (i11 < i10 && this.f13471a[i11] == 0) {
            if (this.f13472b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = j10 - 1; i12 >= 0 && this.f13471a[i12] == 0; i12--) {
            if (this.f13472b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void l(int i10) {
        Object[] objArr = this.f13472b;
        Object obj = objArr[i10];
        int i11 = this.f13473c;
        if (i11 <= 1) {
            h(this.f13471a, objArr, i11);
            this.f13471a = f13466e;
            this.f13472b = f;
            this.f13473c = 0;
            return;
        }
        int[] iArr = this.f13471a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f13473c = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f13472b;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f13473c - i10);
            }
            this.f13472b[this.f13473c] = null;
            return;
        }
        a(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f13473c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f13471a, 0, i10);
            System.arraycopy(objArr, 0, this.f13472b, 0, i10);
        }
        int i14 = this.f13473c;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f13471a, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f13472b, i10, this.f13473c - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        l(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f13473c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f13472b[i10])) {
                l(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f13473c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f13473c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f13472b, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f13473c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f13473c));
        }
        System.arraycopy(this.f13472b, 0, tArr, 0, this.f13473c);
        int length = tArr.length;
        int i10 = this.f13473c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13473c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13473c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f13472b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
