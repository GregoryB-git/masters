package r7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p2.m0;
import x6.b;

/* loaded from: classes.dex */
public final class a extends e9.a {

    /* renamed from: r7.a$a, reason: collision with other inner class name */
    public static class C0210a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f13780a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13781b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13782c;

        public C0210a(int i10, int i11, int[] iArr) {
            this.f13780a = iArr;
            this.f13781b = i10;
            this.f13782c = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13780a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13781b;
                int i11 = this.f13782c;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == intValue) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0210a)) {
                return super.equals(obj);
            }
            C0210a c0210a = (C0210a) obj;
            int i10 = this.f13782c - this.f13781b;
            if (c0210a.f13782c - c0210a.f13781b != i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f13780a[this.f13781b + i11] != c0210a.f13780a[c0210a.f13781b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            b.v(i10, this.f13782c - this.f13781b);
            return Integer.valueOf(this.f13780a[this.f13781b + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i10 = 1;
            for (int i11 = this.f13781b; i11 < this.f13782c; i11++) {
                i10 = (i10 * 31) + this.f13780a[i11];
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13780a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13781b;
                int i11 = this.f13782c;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == intValue) {
                        break;
                    }
                    i10++;
                }
                if (i10 >= 0) {
                    return i10 - this.f13781b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f13780a;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f13781b;
                int i11 = this.f13782c - 1;
                while (true) {
                    if (i11 < i10) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == intValue) {
                        break;
                    }
                    i11--;
                }
                if (i11 >= 0) {
                    return i11 - this.f13781b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            b.v(i10, this.f13782c - this.f13781b);
            int[] iArr = this.f13780a;
            int i11 = this.f13781b + i10;
            int i12 = iArr[i11];
            num.getClass();
            iArr[i11] = num.intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f13782c - this.f13781b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i10, int i11) {
            b.E(i10, i11, this.f13782c - this.f13781b);
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f13780a;
            int i12 = this.f13781b;
            return new C0210a(i10 + i12, i12 + i11, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder((this.f13782c - this.f13781b) * 5);
            sb2.append('[');
            sb2.append(this.f13780a[this.f13781b]);
            int i10 = this.f13781b;
            while (true) {
                i10++;
                if (i10 >= this.f13782c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f13780a[i10]);
            }
        }
    }

    public static int C(long j10) {
        int i10 = (int) j10;
        b.m(j10, "Out of range: %s", ((long) i10) == j10);
        return i10;
    }

    public static int D(int i10, int i11) {
        if (i11 <= 1073741823) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(m0.X("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    public static int E(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] F(Collection<? extends Number> collection) {
        if (collection instanceof C0210a) {
            C0210a c0210a = (C0210a) collection;
            return Arrays.copyOfRange(c0210a.f13780a, c0210a.f13781b, c0210a.f13782c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
