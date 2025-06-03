package a3;

import W2.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class f extends g {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final int[] f8075o;

        /* renamed from: p, reason: collision with root package name */
        public final int f8076p;

        /* renamed from: q, reason: collision with root package name */
        public final int f8077q;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i7) {
            m.h(i7, size());
            return Integer.valueOf(this.f8075o[this.f8076p + i7]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.k(this.f8075o, ((Integer) obj).intValue(), this.f8076p, this.f8077q) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer set(int i7, Integer num) {
            m.h(i7, size());
            int[] iArr = this.f8075o;
            int i8 = this.f8076p;
            int i9 = iArr[i8 + i7];
            iArr[i8 + i7] = ((Integer) m.j(num)).intValue();
            return Integer.valueOf(i9);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f8075o[this.f8076p + i7] != aVar.f8075o[aVar.f8076p + i7]) {
                    return false;
                }
            }
            return true;
        }

        public int[] f() {
            return Arrays.copyOfRange(this.f8075o, this.f8076p, this.f8077q);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i7 = 1;
            for (int i8 = this.f8076p; i8 < this.f8077q; i8++) {
                i7 = (i7 * 31) + f.i(this.f8075o[i8]);
            }
            return i7;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int k7;
            if (!(obj instanceof Integer) || (k7 = f.k(this.f8075o, ((Integer) obj).intValue(), this.f8076p, this.f8077q)) < 0) {
                return -1;
            }
            return k7 - this.f8076p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int l7;
            if (!(obj instanceof Integer) || (l7 = f.l(this.f8075o, ((Integer) obj).intValue(), this.f8076p, this.f8077q)) < 0) {
                return -1;
            }
            return l7 - this.f8076p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f8077q - this.f8076p;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i7, int i8) {
            m.n(i7, i8, size());
            if (i7 == i8) {
                return Collections.emptyList();
            }
            int[] iArr = this.f8075o;
            int i9 = this.f8076p;
            return new a(iArr, i7 + i9, i9 + i8);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f8075o[this.f8076p]);
            int i7 = this.f8076p;
            while (true) {
                i7++;
                if (i7 >= this.f8077q) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f8075o[i7]);
            }
        }

        public a(int[] iArr, int i7, int i8) {
            this.f8075o = iArr;
            this.f8076p = i7;
            this.f8077q = i8;
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j7) {
        int i7 = (int) j7;
        m.g(((long) i7) == j7, "Out of range: %s", j7);
        return i7;
    }

    public static int e(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    public static int f(int i7, int i8, int i9) {
        m.f(i8 <= i9, "min (%s) must be less than or equal to max (%s)", i8, i9);
        return Math.min(Math.max(i7, i8), i9);
    }

    public static int g(byte[] bArr) {
        m.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return h(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int h(byte b7, byte b8, byte b9, byte b10) {
        return (b7 << 24) | ((b8 & 255) << 16) | ((b9 & 255) << 8) | (b10 & 255);
    }

    public static int j(int[] iArr, int i7) {
        return k(iArr, i7, 0, iArr.length);
    }

    public static int k(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int l(int[] iArr, int i7, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (iArr[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    public static int m(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static int[] n(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = ((Number) m.j(array[i7])).intValue();
        }
        return iArr;
    }

    public static Integer o(String str) {
        return p(str, 10);
    }

    public static Integer p(String str, int i7) {
        Long d7 = h.d(str, i7);
        if (d7 == null || d7.longValue() != d7.intValue()) {
            return null;
        }
        return Integer.valueOf(d7.intValue());
    }

    public static int i(int i7) {
        return i7;
    }
}
