package r;

import b.a0;

/* loaded from: classes.dex */
public final class e<E> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f13475e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f13476a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f13477b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f13478c;

    /* renamed from: d, reason: collision with root package name */
    public int f13479d;

    public e() {
        int i10 = 80;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f13477b = new long[i13];
        this.f13478c = new Object[i13];
    }

    public final void a(Long l10, long j10) {
        int i10 = this.f13479d;
        if (i10 != 0 && j10 <= this.f13477b[i10 - 1]) {
            e(l10, j10);
            return;
        }
        if (this.f13476a && i10 >= this.f13477b.length) {
            c();
        }
        int i11 = this.f13479d;
        if (i11 >= this.f13477b.length) {
            int i12 = (i11 + 1) * 8;
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
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f13477b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f13478c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f13477b = jArr;
            this.f13478c = objArr;
        }
        this.f13477b[i11] = j10;
        this.f13478c[i11] = l10;
        this.f13479d = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f13477b = (long[]) this.f13477b.clone();
            eVar.f13478c = (Object[]) this.f13478c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i10 = this.f13479d;
        long[] jArr = this.f13477b;
        Object[] objArr = this.f13478c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f13475e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f13476a = false;
        this.f13479d = i11;
    }

    public final Object d(Long l10, long j10) {
        Object obj;
        int k10 = a0.k(this.f13477b, this.f13479d, j10);
        return (k10 < 0 || (obj = this.f13478c[k10]) == f13475e) ? l10 : obj;
    }

    public final void e(Object obj, long j10) {
        int k10 = a0.k(this.f13477b, this.f13479d, j10);
        if (k10 >= 0) {
            this.f13478c[k10] = obj;
            return;
        }
        int i10 = ~k10;
        int i11 = this.f13479d;
        if (i10 < i11) {
            Object[] objArr = this.f13478c;
            if (objArr[i10] == f13475e) {
                this.f13477b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f13476a && i11 >= this.f13477b.length) {
            c();
            i10 = ~a0.k(this.f13477b, this.f13479d, j10);
        }
        int i12 = this.f13479d;
        if (i12 >= this.f13477b.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f13477b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f13478c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f13477b = jArr;
            this.f13478c = objArr2;
        }
        int i17 = this.f13479d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f13477b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f13478c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f13479d - i10);
        }
        this.f13477b[i10] = j10;
        this.f13478c[i10] = obj;
        this.f13479d++;
    }

    public final String toString() {
        if (this.f13476a) {
            c();
        }
        int i10 = this.f13479d;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f13479d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            if (this.f13476a) {
                c();
            }
            sb2.append(this.f13477b[i11]);
            sb2.append('=');
            if (this.f13476a) {
                c();
            }
            Object obj = this.f13478c[i11];
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
