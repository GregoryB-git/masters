package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1959b implements Collection, Set {

    /* renamed from: r, reason: collision with root package name */
    public static Object[] f19363r;

    /* renamed from: s, reason: collision with root package name */
    public static int f19364s;

    /* renamed from: t, reason: collision with root package name */
    public static Object[] f19365t;

    /* renamed from: u, reason: collision with root package name */
    public static int f19366u;

    /* renamed from: v, reason: collision with root package name */
    public static final Object f19367v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final Object f19368w = new Object();

    /* renamed from: o, reason: collision with root package name */
    public int[] f19369o;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f19370p;

    /* renamed from: q, reason: collision with root package name */
    public int f19371q;

    /* renamed from: t.b$a */
    public class a extends e {
        public a() {
            super(C1959b.this.f19371q);
        }

        @Override // t.e
        public Object b(int i7) {
            return C1959b.this.s(i7);
        }

        @Override // t.e
        public void d(int i7) {
            C1959b.this.q(i7);
        }
    }

    public C1959b() {
        this(0);
    }

    public static void g(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (f19368w) {
                try {
                    if (f19366u < 10) {
                        objArr[0] = f19365t;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f19365t = objArr;
                        f19366u++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f19367v) {
                try {
                    if (f19364s < 10) {
                        objArr[0] = f19363r;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f19363r = objArr;
                        f19364s++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (f19368w) {
                try {
                    Object[] objArr = f19365t;
                    if (objArr != null) {
                        try {
                            this.f19370p = objArr;
                            f19365t = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f19369o = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f19366u--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f19365t = null;
                        f19366u = 0;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (f19367v) {
                try {
                    Object[] objArr2 = f19363r;
                    if (objArr2 != null) {
                        try {
                            this.f19370p = objArr2;
                            f19363r = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f19369o = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f19364s--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f19363r = null;
                        f19364s = 0;
                    }
                } finally {
                }
            }
        }
        this.f19369o = new int[i7];
        this.f19370p = new Object[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i7;
        int i8;
        int i9 = this.f19371q;
        if (obj == null) {
            i8 = k();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            i8 = i(obj, hashCode);
        }
        if (i8 >= 0) {
            return false;
        }
        int i10 = ~i8;
        int[] iArr = this.f19369o;
        if (i9 >= iArr.length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f19370p;
            a(i11);
            if (i9 != this.f19371q) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f19369o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f19370p, 0, objArr.length);
            }
            g(iArr, objArr, i9);
        }
        if (i10 < i9) {
            int[] iArr3 = this.f19369o;
            int i12 = i10 + 1;
            int i13 = i9 - i10;
            System.arraycopy(iArr3, i10, iArr3, i12, i13);
            Object[] objArr2 = this.f19370p;
            System.arraycopy(objArr2, i10, objArr2, i12, i13);
        }
        int i14 = this.f19371q;
        if (i9 == i14) {
            int[] iArr4 = this.f19369o;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                this.f19370p[i10] = obj;
                this.f19371q = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        f(this.f19371q + collection.size());
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= add(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i7 = this.f19371q;
        if (i7 != 0) {
            int[] iArr = this.f19369o;
            Object[] objArr = this.f19370p;
            this.f19369o = d.f19377a;
            this.f19370p = d.f19379c;
            this.f19371q = 0;
            g(iArr, objArr, i7);
        }
        if (this.f19371q != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(int i7) {
        try {
            return d.a(this.f19369o, this.f19371q, i7);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f19371q; i7++) {
                try {
                    if (!set.contains(s(i7))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i7) {
        int i8 = this.f19371q;
        int[] iArr = this.f19369o;
        if (iArr.length < i7) {
            Object[] objArr = this.f19370p;
            a(i7);
            int i9 = this.f19371q;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.f19369o, 0, i9);
                System.arraycopy(objArr, 0, this.f19370p, 0, this.f19371q);
            }
            g(iArr, objArr, this.f19371q);
        }
        if (this.f19371q != i8) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f19369o;
        int i7 = this.f19371q;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public final int i(Object obj, int i7) {
        int i8 = this.f19371q;
        if (i8 == 0) {
            return -1;
        }
        int d7 = d(i7);
        if (d7 < 0) {
            return d7;
        }
        if (obj.equals(this.f19370p[d7])) {
            return d7;
        }
        int i9 = d7 + 1;
        while (i9 < i8 && this.f19369o[i9] == i7) {
            if (obj.equals(this.f19370p[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = d7 - 1; i10 >= 0 && this.f19369o[i10] == i7; i10--) {
            if (obj.equals(this.f19370p[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f19371q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final int k() {
        int i7 = this.f19371q;
        if (i7 == 0) {
            return -1;
        }
        int d7 = d(0);
        if (d7 < 0) {
            return d7;
        }
        if (this.f19370p[d7] == null) {
            return d7;
        }
        int i8 = d7 + 1;
        while (i8 < i7 && this.f19369o[i8] == 0) {
            if (this.f19370p[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = d7 - 1; i9 >= 0 && this.f19369o[i9] == 0; i9--) {
            if (this.f19370p[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public Object q(int i7) {
        int i8 = this.f19371q;
        Object[] objArr = this.f19370p;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
        } else {
            int i9 = i8 - 1;
            int[] iArr = this.f19369o;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i7 < i9) {
                    int i10 = i7 + 1;
                    int i11 = i9 - i7;
                    System.arraycopy(iArr, i10, iArr, i7, i11);
                    Object[] objArr2 = this.f19370p;
                    System.arraycopy(objArr2, i10, objArr2, i7, i11);
                }
                this.f19370p[i9] = null;
            } else {
                a(i8 > 8 ? i8 + (i8 >> 1) : 8);
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f19369o, 0, i7);
                    System.arraycopy(objArr, 0, this.f19370p, 0, i7);
                }
                if (i7 < i9) {
                    int i12 = i7 + 1;
                    int i13 = i9 - i7;
                    System.arraycopy(iArr, i12, this.f19369o, i7, i13);
                    System.arraycopy(objArr, i12, this.f19370p, i7, i13);
                }
            }
            if (i8 != this.f19371q) {
                throw new ConcurrentModificationException();
            }
            this.f19371q = i9;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        q(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= remove(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z7 = false;
        for (int i7 = this.f19371q - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f19370p[i7])) {
                q(i7);
                z7 = true;
            }
        }
        return z7;
    }

    public Object s(int i7) {
        return this.f19370p[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f19371q;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i7 = this.f19371q;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f19370p, 0, objArr, 0, i7);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19371q * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f19371q; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object s7 = s(i7);
            if (s7 != this) {
                sb.append(s7);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1959b(int i7) {
        if (i7 == 0) {
            this.f19369o = d.f19377a;
            this.f19370p = d.f19379c;
        } else {
            a(i7);
        }
        this.f19371q = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f19371q) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f19371q);
        }
        System.arraycopy(this.f19370p, 0, objArr, 0, this.f19371q);
        int length = objArr.length;
        int i7 = this.f19371q;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
