package r;

import b.a0;

/* loaded from: classes.dex */
public final class i<E> implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f13501d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f13502a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13503b;

    /* renamed from: c, reason: collision with root package name */
    public int f13504c;

    public i() {
        int i10 = 40;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f13502a = new int[i13];
        this.f13503b = new Object[i13];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f13504c;
        if (i11 != 0 && i10 <= this.f13502a[i11 - 1]) {
            d(i10, e10);
            return;
        }
        if (i11 >= this.f13502a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f13502a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f13503b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f13502a = iArr;
            this.f13503b = objArr;
        }
        this.f13502a[i11] = i10;
        this.f13503b[i11] = e10;
        this.f13504c = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f13502a = (int[]) this.f13502a.clone();
            iVar.f13503b = (Object[]) this.f13503b.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object c(int i10, Integer num) {
        Object obj;
        int j10 = a0.j(this.f13504c, i10, this.f13502a);
        return (j10 < 0 || (obj = this.f13503b[j10]) == f13501d) ? num : obj;
    }

    public final void d(int i10, E e10) {
        int j10 = a0.j(this.f13504c, i10, this.f13502a);
        if (j10 >= 0) {
            this.f13503b[j10] = e10;
            return;
        }
        int i11 = ~j10;
        int i12 = this.f13504c;
        if (i11 < i12) {
            Object[] objArr = this.f13503b;
            if (objArr[i11] == f13501d) {
                this.f13502a[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (i12 >= this.f13502a.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f13502a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f13503b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f13502a = iArr;
            this.f13503b = objArr2;
        }
        int i17 = this.f13504c - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f13502a;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f13503b;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f13504c - i11);
        }
        this.f13502a[i11] = i10;
        this.f13503b[i11] = e10;
        this.f13504c++;
    }

    public final String toString() {
        int i10 = this.f13504c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f13504c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f13502a[i11]);
            sb2.append('=');
            Object obj = this.f13503b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
