package ma;

import java.util.Arrays;
import ma.b0;

/* loaded from: classes.dex */
public final class q1 {
    public static final q1 f = new q1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11065a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11066b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11067c;

    /* renamed from: d, reason: collision with root package name */
    public int f11068d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11069e;

    public q1() {
        this(0, new int[8], new Object[8], true);
    }

    public q1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f11068d = -1;
        this.f11065a = i10;
        this.f11066b = iArr;
        this.f11067c = objArr;
        this.f11069e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f11066b;
        if (i10 > iArr.length) {
            int i11 = this.f11065a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f11066b = Arrays.copyOf(iArr, i10);
            this.f11067c = Arrays.copyOf(this.f11067c, i10);
        }
    }

    public final int b() {
        int Q;
        int i10 = this.f11068d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11065a; i12++) {
            int i13 = this.f11066b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                Q = k.Q(i14, ((Long) this.f11067c[i12]).longValue());
            } else if (i15 == 1) {
                ((Long) this.f11067c[i12]).longValue();
                Q = k.A(i14);
            } else if (i15 == 2) {
                Q = k.w(i14, (h) this.f11067c[i12]);
            } else if (i15 == 3) {
                i11 = ((q1) this.f11067c[i12]).b() + (k.N(i14) * 2) + i11;
            } else {
                if (i15 != 5) {
                    int i16 = b0.f10916c;
                    throw new IllegalStateException(new b0.a());
                }
                ((Integer) this.f11067c[i12]).intValue();
                Q = k.z(i14);
            }
            i11 = Q + i11;
        }
        this.f11068d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f11069e) {
            throw new UnsupportedOperationException();
        }
        a(this.f11065a + 1);
        int[] iArr = this.f11066b;
        int i11 = this.f11065a;
        iArr[i11] = i10;
        this.f11067c[i11] = obj;
        this.f11065a = i11 + 1;
    }

    public final void d(l lVar) {
        if (this.f11065a == 0) {
            return;
        }
        lVar.getClass();
        for (int i10 = 0; i10 < this.f11065a; i10++) {
            int i11 = this.f11066b[i10];
            Object obj = this.f11067c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                lVar.j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                lVar.f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                lVar.b(i12, (h) obj);
            } else if (i13 == 3) {
                lVar.f11029a.k0(i12, 3);
                ((q1) obj).d(lVar);
                lVar.f11029a.k0(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = b0.f10916c;
                    throw new RuntimeException(new b0.a());
                }
                lVar.e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        int i10 = this.f11065a;
        if (i10 == q1Var.f11065a) {
            int[] iArr = this.f11066b;
            int[] iArr2 = q1Var.f11066b;
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
                Object[] objArr = this.f11067c;
                Object[] objArr2 = q1Var.f11067c;
                int i12 = this.f11065a;
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
        int i10 = this.f11065a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f11066b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f11067c;
        int i16 = this.f11065a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
