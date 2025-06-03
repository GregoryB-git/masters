package F0;

import g0.AbstractC1297a;

/* renamed from: F0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0362g {
    public static void a(long j7, g0.z zVar, T[] tArr) {
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int c7 = c(zVar);
            int c8 = c(zVar);
            int f7 = zVar.f() + c8;
            if (c8 == -1 || c8 > zVar.a()) {
                g0.o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f7 = zVar.g();
            } else if (c7 == 4 && c8 >= 8) {
                int G6 = zVar.G();
                int M6 = zVar.M();
                int p7 = M6 == 49 ? zVar.p() : 0;
                int G7 = zVar.G();
                if (M6 == 47) {
                    zVar.U(1);
                }
                boolean z7 = G6 == 181 && (M6 == 49 || M6 == 47) && G7 == 3;
                if (M6 == 49) {
                    z7 &= p7 == 1195456820;
                }
                if (z7) {
                    b(j7, zVar, tArr);
                }
            }
            zVar.T(f7);
        }
    }

    public static void b(long j7, g0.z zVar, T[] tArr) {
        int G6 = zVar.G();
        if ((G6 & 64) != 0) {
            zVar.U(1);
            int i7 = (G6 & 31) * 3;
            int f7 = zVar.f();
            for (T t7 : tArr) {
                zVar.T(f7);
                t7.e(zVar, i7);
                AbstractC1297a.f(j7 != -9223372036854775807L);
                t7.b(j7, 1, i7, 0, null);
            }
        }
    }

    public static int c(g0.z zVar) {
        int i7 = 0;
        while (zVar.a() != 0) {
            int G6 = zVar.G();
            i7 += G6;
            if (G6 != 255) {
                return i7;
            }
        }
        return -1;
    }
}
