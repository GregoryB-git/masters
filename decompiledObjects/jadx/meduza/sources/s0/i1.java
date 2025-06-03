package s0;

import java.util.Arrays;
import s0.y;

/* loaded from: classes.dex */
public final class i1 {
    public static final i1 f = new i1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f14019a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14020b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f14021c;

    /* renamed from: d, reason: collision with root package name */
    public int f14022d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14023e;

    public i1() {
        this(0, new int[8], new Object[8], true);
    }

    public i1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f14022d = -1;
        this.f14019a = i10;
        this.f14020b = iArr;
        this.f14021c = objArr;
        this.f14023e = z10;
    }

    public final int a() {
        int Q;
        int i10 = this.f14022d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14019a; i12++) {
            int i13 = this.f14020b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                Q = j.Q(i14, ((Long) this.f14021c[i12]).longValue());
            } else if (i15 == 1) {
                ((Long) this.f14021c[i12]).longValue();
                Q = j.A(i14);
            } else if (i15 == 2) {
                Q = j.w(i14, (g) this.f14021c[i12]);
            } else if (i15 == 3) {
                i11 = ((i1) this.f14021c[i12]).a() + (j.N(i14) * 2) + i11;
            } else {
                if (i15 != 5) {
                    int i16 = y.f14121a;
                    throw new IllegalStateException(new y.a());
                }
                ((Integer) this.f14021c[i12]).intValue();
                Q = j.z(i14);
            }
            i11 = Q + i11;
        }
        this.f14022d = i11;
        return i11;
    }

    public final void b(int i10, Object obj) {
        if (!this.f14023e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f14019a;
        int[] iArr = this.f14020b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f14020b = Arrays.copyOf(iArr, i12);
            this.f14021c = Arrays.copyOf(this.f14021c, i12);
        }
        int[] iArr2 = this.f14020b;
        int i13 = this.f14019a;
        iArr2[i13] = i10;
        this.f14021c[i13] = obj;
        this.f14019a = i13 + 1;
    }

    public final void c(k kVar) {
        if (this.f14019a == 0) {
            return;
        }
        kVar.getClass();
        for (int i10 = 0; i10 < this.f14019a; i10++) {
            int i11 = this.f14020b[i10];
            Object obj = this.f14021c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                kVar.j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                kVar.f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                kVar.b(i12, (g) obj);
            } else if (i13 == 3) {
                kVar.f14032a.k0(i12, 3);
                ((i1) obj).c(kVar);
                kVar.f14032a.k0(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = y.f14121a;
                    throw new RuntimeException(new y.a());
                }
                kVar.e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i10 = this.f14019a;
        if (i10 == i1Var.f14019a) {
            int[] iArr = this.f14020b;
            int[] iArr2 = i1Var.f14020b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                }
                if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                Object[] objArr = this.f14021c;
                Object[] objArr2 = i1Var.f14021c;
                int i12 = this.f14019a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    }
                    if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    }
                    i13++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14019a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f14020b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f14021c;
        int i16 = this.f14019a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
