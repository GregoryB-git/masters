package r;

import b.a0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f13495d;

    /* renamed from: e, reason: collision with root package name */
    public static int f13496e;
    public static Object[] f;

    /* renamed from: o, reason: collision with root package name */
    public static int f13497o;

    /* renamed from: a, reason: collision with root package name */
    public int[] f13498a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13499b;

    /* renamed from: c, reason: collision with root package name */
    public int f13500c;

    public h() {
        this.f13498a = a0.T;
        this.f13499b = a0.U;
        this.f13500c = 0;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f13498a = a0.T;
            this.f13499b = a0.U;
        } else {
            b(i10);
        }
        this.f13500c = 0;
    }

    private void b(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f13499b = objArr;
                    f = (Object[]) objArr[0];
                    this.f13498a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f13497o--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f13495d;
                if (objArr2 != null) {
                    this.f13499b = objArr2;
                    f13495d = (Object[]) objArr2[0];
                    this.f13498a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f13496e--;
                    return;
                }
            }
        }
        this.f13498a = new int[i10];
        this.f13499b = new Object[i10 << 1];
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f13497o < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f = objArr;
                    f13497o++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f13496e < 10) {
                    objArr[0] = f13495d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f13495d = objArr;
                    f13496e++;
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f13500c;
        int[] iArr = this.f13498a;
        if (iArr.length < i10) {
            Object[] objArr = this.f13499b;
            b(i10);
            if (this.f13500c > 0) {
                System.arraycopy(iArr, 0, this.f13498a, 0, i11);
                System.arraycopy(objArr, 0, this.f13499b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f13500c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i10 = this.f13500c;
        if (i10 > 0) {
            int[] iArr = this.f13498a;
            Object[] objArr = this.f13499b;
            this.f13498a = a0.T;
            this.f13499b = a0.U;
            this.f13500c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f13500c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int e(int i10, Object obj) {
        int i11 = this.f13500c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int j10 = a0.j(i11, i10, this.f13498a);
            if (j10 < 0) {
                return j10;
            }
            if (obj.equals(this.f13499b[j10 << 1])) {
                return j10;
            }
            int i12 = j10 + 1;
            while (i12 < i11 && this.f13498a[i12] == i10) {
                if (obj.equals(this.f13499b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = j10 - 1; i13 >= 0 && this.f13498a[i13] == i10; i13--) {
                if (obj.equals(this.f13499b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f13500c != hVar.f13500c) {
                return false;
            }
            for (int i10 = 0; i10 < this.f13500c; i10++) {
                try {
                    K i11 = i(i10);
                    V k10 = k(i10);
                    Object orDefault = hVar.getOrDefault(i11, null);
                    if (k10 == null) {
                        if (orDefault != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!k10.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f13500c != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f13500c; i12++) {
                try {
                    K i13 = i(i12);
                    V k11 = k(i12);
                    Object obj2 = map.get(i13);
                    if (k11 == null) {
                        if (obj2 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!k11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : e(obj.hashCode(), obj);
    }

    public final int g() {
        int i10 = this.f13500c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int j10 = a0.j(i10, 0, this.f13498a);
            if (j10 < 0) {
                return j10;
            }
            if (this.f13499b[j10 << 1] == null) {
                return j10;
            }
            int i11 = j10 + 1;
            while (i11 < i10 && this.f13498a[i11] == 0) {
                if (this.f13499b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = j10 - 1; i12 >= 0 && this.f13498a[i12] == 0; i12--) {
                if (this.f13499b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? (V) this.f13499b[(f10 << 1) + 1] : v10;
    }

    public final int h(Object obj) {
        int i10 = this.f13500c * 2;
        Object[] objArr = this.f13499b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int[] iArr = this.f13498a;
        Object[] objArr = this.f13499b;
        int i10 = this.f13500c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final K i(int i10) {
        return (K) this.f13499b[i10 << 1];
    }

    public final boolean isEmpty() {
        return this.f13500c <= 0;
    }

    public final V j(int i10) {
        Object[] objArr = this.f13499b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f13500c;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f13498a, objArr, i12);
            this.f13498a = a0.T;
            this.f13499b = a0.U;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f13498a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f13499b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f13499b;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                b(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f13500c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f13498a, 0, i10);
                    System.arraycopy(objArr, 0, this.f13499b, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f13498a, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f13499b, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f13500c) {
            throw new ConcurrentModificationException();
        }
        this.f13500c = i13;
        return v10;
    }

    public final V k(int i10) {
        return (V) this.f13499b[(i10 << 1) + 1];
    }

    public final V put(K k10, V v10) {
        int i10;
        int e10;
        int i11 = this.f13500c;
        if (k10 == null) {
            e10 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            e10 = e(hashCode, k10);
        }
        if (e10 >= 0) {
            int i12 = (e10 << 1) + 1;
            Object[] objArr = this.f13499b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~e10;
        int[] iArr = this.f13498a;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f13499b;
            b(i14);
            if (i11 != this.f13500c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f13498a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f13499b, 0, objArr2.length);
            }
            d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f13498a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f13499b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f13500c - i13) << 1);
        }
        int i16 = this.f13500c;
        if (i11 == i16) {
            int[] iArr4 = this.f13498a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f13499b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f13500c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        return orDefault == null ? put(k10, v10) : orDefault;
    }

    public final V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return j(f10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        V k10 = k(f10);
        if (obj2 != k10 && (obj2 == null || !obj2.equals(k10))) {
            return false;
        }
        j(f10);
        return true;
    }

    public final V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 < 0) {
            return null;
        }
        int i10 = (f10 << 1) + 1;
        Object[] objArr = this.f13499b;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }

    public final int size() {
        return this.f13500c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13500c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13500c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V k11 = k(f10);
        if (k11 != v10 && (v10 == null || !v10.equals(k11))) {
            return false;
        }
        int i10 = (f10 << 1) + 1;
        Object[] objArr = this.f13499b;
        Object obj = objArr[i10];
        objArr[i10] = v11;
        return true;
    }
}
