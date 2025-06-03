package F0;

import d0.C1162A;

/* loaded from: classes.dex */
public abstract class y {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1959a;
    }

    public static boolean a(g0.z zVar, B b7, int i7) {
        int j7 = j(zVar, i7);
        return j7 != -1 && j7 <= b7.f1739b;
    }

    public static boolean b(g0.z zVar, int i7) {
        return zVar.G() == g0.M.y(zVar.e(), i7, zVar.f() - 1, 0);
    }

    public static boolean c(g0.z zVar, B b7, boolean z7, a aVar) {
        try {
            long N6 = zVar.N();
            if (!z7) {
                N6 *= b7.f1739b;
            }
            aVar.f1959a = N6;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(g0.z zVar, B b7, int i7, a aVar) {
        int f7 = zVar.f();
        long I6 = zVar.I();
        long j7 = I6 >>> 16;
        if (j7 != i7) {
            return false;
        }
        return g((int) ((I6 >> 4) & 15), b7) && f((int) ((I6 >> 1) & 7), b7) && !(((I6 & 1) > 1L ? 1 : ((I6 & 1) == 1L ? 0 : -1)) == 0) && c(zVar, b7, ((j7 & 1) > 1L ? 1 : ((j7 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(zVar, b7, (int) ((I6 >> 12) & 15)) && e(zVar, b7, (int) ((I6 >> 8) & 15)) && b(zVar, f7);
    }

    public static boolean e(g0.z zVar, B b7, int i7) {
        int i8 = b7.f1742e;
        if (i7 == 0) {
            return true;
        }
        if (i7 <= 11) {
            return i7 == b7.f1743f;
        }
        if (i7 == 12) {
            return zVar.G() * 1000 == i8;
        }
        if (i7 > 14) {
            return false;
        }
        int M6 = zVar.M();
        if (i7 == 14) {
            M6 *= 10;
        }
        return M6 == i8;
    }

    public static boolean f(int i7, B b7) {
        return i7 == 0 || i7 == b7.f1746i;
    }

    public static boolean g(int i7, B b7) {
        return i7 <= 7 ? i7 == b7.f1744g - 1 : i7 <= 10 && b7.f1744g == 2;
    }

    public static boolean h(InterfaceC0373s interfaceC0373s, B b7, int i7, a aVar) {
        long m7 = interfaceC0373s.m();
        byte[] bArr = new byte[2];
        interfaceC0373s.n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i7) {
            interfaceC0373s.h();
            interfaceC0373s.o((int) (m7 - interfaceC0373s.p()));
            return false;
        }
        g0.z zVar = new g0.z(16);
        System.arraycopy(bArr, 0, zVar.e(), 0, 2);
        zVar.S(AbstractC0375u.c(interfaceC0373s, zVar.e(), 2, 14));
        interfaceC0373s.h();
        interfaceC0373s.o((int) (m7 - interfaceC0373s.p()));
        return d(zVar, b7, i7, aVar);
    }

    public static long i(InterfaceC0373s interfaceC0373s, B b7) {
        interfaceC0373s.h();
        interfaceC0373s.o(1);
        byte[] bArr = new byte[1];
        interfaceC0373s.n(bArr, 0, 1);
        boolean z7 = (bArr[0] & 1) == 1;
        interfaceC0373s.o(2);
        int i7 = z7 ? 7 : 6;
        g0.z zVar = new g0.z(i7);
        zVar.S(AbstractC0375u.c(interfaceC0373s, zVar.e(), 0, i7));
        interfaceC0373s.h();
        a aVar = new a();
        if (c(zVar, b7, z7, aVar)) {
            return aVar.f1959a;
        }
        throw C1162A.a(null, null);
    }

    public static int j(g0.z zVar, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return zVar.G() + 1;
            case 7:
                return zVar.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }
}
