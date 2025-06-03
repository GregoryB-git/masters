package c4;

/* loaded from: classes.dex */
public final class b {
    public static void a(long j10, v5.u uVar, v[] vVarArr) {
        int i10;
        while (true) {
            if (uVar.f15976c - uVar.f15975b <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (uVar.f15976c - uVar.f15975b == 0) {
                    i10 = -1;
                    break;
                }
                int v10 = uVar.v();
                i11 += v10;
                if (v10 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (uVar.f15976c - uVar.f15975b == 0) {
                    i12 = -1;
                    break;
                }
                int v11 = uVar.v();
                i12 += v11;
                if (v11 != 255) {
                    break;
                }
            }
            int i13 = uVar.f15975b;
            int i14 = i13 + i12;
            if (i12 == -1 || i12 > uVar.f15976c - i13) {
                v5.m.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i14 = uVar.f15976c;
            } else if (i10 == 4 && i12 >= 8) {
                int v12 = uVar.v();
                int A = uVar.A();
                int f = A == 49 ? uVar.f() : 0;
                int v13 = uVar.v();
                if (A == 47) {
                    uVar.H(1);
                }
                boolean z10 = v12 == 181 && (A == 49 || A == 47) && v13 == 3;
                if (A == 49) {
                    z10 &= f == 1195456820;
                }
                if (z10) {
                    b(j10, uVar, vVarArr);
                }
            }
            uVar.G(i14);
        }
    }

    public static void b(long j10, v5.u uVar, v[] vVarArr) {
        int v10 = uVar.v();
        if ((v10 & 64) != 0) {
            uVar.H(1);
            int i10 = (v10 & 31) * 3;
            int i11 = uVar.f15975b;
            for (v vVar : vVarArr) {
                uVar.G(i11);
                vVar.b(i10, uVar);
                if (j10 != -9223372036854775807L) {
                    vVar.c(j10, 1, i10, 0, null);
                }
            }
        }
    }
}
