package Z0;

import d0.C1201x;
import g0.z;

/* loaded from: classes.dex */
public abstract class q {
    public static int a(int i7, z zVar, int i8) {
        if (i7 == 12) {
            return 240;
        }
        if (i7 == 13) {
            return 120;
        }
        if (i7 == 21 && zVar.a() >= 8 && zVar.f() + 8 <= i8) {
            int p7 = zVar.p();
            int p8 = zVar.p();
            if (p7 >= 12 && p8 == 1936877170) {
                return zVar.H();
            }
        }
        return -2147483647;
    }

    public static C1201x b(z zVar, int i7) {
        zVar.U(12);
        while (zVar.f() < i7) {
            int f7 = zVar.f();
            int p7 = zVar.p();
            if (zVar.p() == 1935766900) {
                if (p7 < 16) {
                    return null;
                }
                zVar.U(4);
                int i8 = -1;
                int i9 = 0;
                for (int i10 = 0; i10 < 2; i10++) {
                    int G6 = zVar.G();
                    int G7 = zVar.G();
                    if (G6 == 0) {
                        i8 = G7;
                    } else if (G6 == 1) {
                        i9 = G7;
                    }
                }
                int a7 = a(i8, zVar, i7);
                if (a7 == -2147483647) {
                    return null;
                }
                return new C1201x(new U0.d(a7, i9));
            }
            zVar.T(f7 + p7);
        }
        return null;
    }
}
