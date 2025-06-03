package t;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: r, reason: collision with root package name */
    public static Object[] f19396r;

    /* renamed from: s, reason: collision with root package name */
    public static int f19397s;

    /* renamed from: t, reason: collision with root package name */
    public static Object[] f19398t;

    /* renamed from: u, reason: collision with root package name */
    public static int f19399u;

    /* renamed from: o, reason: collision with root package name */
    public int[] f19400o;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f19401p;

    /* renamed from: q, reason: collision with root package name */
    public int f19402q;

    public h() {
        this.f19400o = d.f19377a;
        this.f19401p = d.f19379c;
        this.f19402q = 0;
    }

    public static int b(int[] iArr, int i7, int i8) {
        try {
            return d.a(iArr, i7, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                try {
                    if (f19399u < 10) {
                        objArr[0] = f19398t;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f19398t = objArr;
                        f19399u++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                try {
                    if (f19397s < 10) {
                        objArr[0] = f19396r;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f19396r = objArr;
                        f19397s++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (h.class) {
                try {
                    Object[] objArr = f19398t;
                    if (objArr != null) {
                        this.f19401p = objArr;
                        f19398t = (Object[]) objArr[0];
                        this.f19400o = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f19399u--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (h.class) {
                try {
                    Object[] objArr2 = f19396r;
                    if (objArr2 != null) {
                        this.f19401p = objArr2;
                        f19396r = (Object[]) objArr2[0];
                        this.f19400o = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f19397s--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f19400o = new int[i7];
        this.f19401p = new Object[i7 << 1];
    }

    public void c(int i7) {
        int i8 = this.f19402q;
        int[] iArr = this.f19400o;
        if (iArr.length < i7) {
            Object[] objArr = this.f19401p;
            a(i7);
            if (this.f19402q > 0) {
                System.arraycopy(iArr, 0, this.f19400o, 0, i8);
                System.arraycopy(objArr, 0, this.f19401p, 0, i8 << 1);
            }
            d(iArr, objArr, i8);
        }
        if (this.f19402q != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i7 = this.f19402q;
        if (i7 > 0) {
            int[] iArr = this.f19400o;
            Object[] objArr = this.f19401p;
            this.f19400o = d.f19377a;
            this.f19401p = d.f19379c;
            this.f19402q = 0;
            d(iArr, objArr, i7);
        }
        if (this.f19402q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i7) {
        int i8 = this.f19402q;
        if (i8 == 0) {
            return -1;
        }
        int b7 = b(this.f19400o, i8, i7);
        if (b7 < 0) {
            return b7;
        }
        if (obj.equals(this.f19401p[b7 << 1])) {
            return b7;
        }
        int i9 = b7 + 1;
        while (i9 < i8 && this.f19400o[i9] == i7) {
            if (obj.equals(this.f19401p[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = b7 - 1; i10 >= 0 && this.f19400o[i10] == i7; i10--) {
            if (obj.equals(this.f19401p[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f19402q; i7++) {
                Object i8 = i(i7);
                Object l7 = l(i7);
                Object obj2 = hVar.get(i8);
                if (l7 == null) {
                    if (obj2 != null || !hVar.containsKey(i8)) {
                        return false;
                    }
                } else if (!l7.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f19402q; i9++) {
                Object i10 = i(i9);
                Object l8 = l(i9);
                Object obj3 = map.get(i10);
                if (l8 == null) {
                    if (obj3 != null || !map.containsKey(i10)) {
                        return false;
                    }
                } else if (!l8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i7 = this.f19402q;
        if (i7 == 0) {
            return -1;
        }
        int b7 = b(this.f19400o, i7, 0);
        if (b7 < 0) {
            return b7;
        }
        if (this.f19401p[b7 << 1] == null) {
            return b7;
        }
        int i8 = b7 + 1;
        while (i8 < i7 && this.f19400o[i8] == 0) {
            if (this.f19401p[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = b7 - 1; i9 >= 0 && this.f19400o[i9] == 0; i9--) {
            if (this.f19401p[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f7 = f(obj);
        return f7 >= 0 ? this.f19401p[(f7 << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i7 = this.f19402q * 2;
        Object[] objArr = this.f19401p;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f19400o;
        Object[] objArr = this.f19401p;
        int i7 = this.f19402q;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public Object i(int i7) {
        return this.f19401p[i7 << 1];
    }

    public boolean isEmpty() {
        return this.f19402q <= 0;
    }

    public Object j(int i7) {
        Object[] objArr = this.f19401p;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f19402q;
        if (i9 <= 1) {
            clear();
        } else {
            int i10 = i9 - 1;
            int[] iArr = this.f19400o;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i10) {
                    int i11 = i7 + 1;
                    int i12 = i10 - i7;
                    System.arraycopy(iArr, i11, iArr, i7, i12);
                    Object[] objArr2 = this.f19401p;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i8, i12 << 1);
                }
                Object[] objArr3 = this.f19401p;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f19402q) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f19400o, 0, i7);
                    System.arraycopy(objArr, 0, this.f19401p, 0, i8);
                }
                if (i7 < i10) {
                    int i14 = i7 + 1;
                    int i15 = i10 - i7;
                    System.arraycopy(iArr, i14, this.f19400o, i7, i15);
                    System.arraycopy(objArr, i14 << 1, this.f19401p, i8, i15 << 1);
                }
            }
            if (i9 != this.f19402q) {
                throw new ConcurrentModificationException();
            }
            this.f19402q = i10;
        }
        return obj;
    }

    public Object k(int i7, Object obj) {
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f19401p;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public Object l(int i7) {
        return this.f19401p[(i7 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i7;
        int e7;
        int i8 = this.f19402q;
        if (obj == null) {
            e7 = g();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            e7 = e(obj, hashCode);
        }
        if (e7 >= 0) {
            int i9 = (e7 << 1) + 1;
            Object[] objArr = this.f19401p;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~e7;
        int[] iArr = this.f19400o;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f19401p;
            a(i11);
            if (i8 != this.f19402q) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f19400o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f19401p, 0, objArr2.length);
            }
            d(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f19400o;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f19401p;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f19402q - i10) << 1);
        }
        int i13 = this.f19402q;
        if (i8 == i13) {
            int[] iArr4 = this.f19400o;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f19401p;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f19402q = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f7 = f(obj);
        if (f7 >= 0) {
            return j(f7);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f7 = f(obj);
        if (f7 >= 0) {
            return k(f7, obj2);
        }
        return null;
    }

    public int size() {
        return this.f19402q;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19402q * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f19402q; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object i8 = i(i7);
            if (i8 != this) {
                sb.append(i8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l7 = l(i7);
            if (l7 != this) {
                sb.append(l7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i7) {
        if (i7 == 0) {
            this.f19400o = d.f19377a;
            this.f19401p = d.f19379c;
        } else {
            a(i7);
        }
        this.f19402q = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int f7 = f(obj);
        if (f7 < 0) {
            return false;
        }
        Object l7 = l(f7);
        if (obj2 != l7 && (obj2 == null || !obj2.equals(l7))) {
            return false;
        }
        j(f7);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f7 = f(obj);
        if (f7 < 0) {
            return false;
        }
        Object l7 = l(f7);
        if (l7 != obj2 && (obj2 == null || !obj2.equals(l7))) {
            return false;
        }
        k(f7, obj3);
        return true;
    }
}
