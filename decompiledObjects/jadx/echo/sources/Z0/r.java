package Z0;

import F0.InterfaceC0373s;
import F0.Q;
import g0.z;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7784a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i7, boolean z7) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z7) {
            return true;
        }
        for (int i8 : f7784a) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static Q b(InterfaceC0373s interfaceC0373s) {
        return c(interfaceC0373s, true, false);
    }

    public static Q c(InterfaceC0373s interfaceC0373s, boolean z7, boolean z8) {
        int i7;
        int i8;
        int i9;
        boolean z9;
        int[] iArr;
        long a7 = interfaceC0373s.a();
        long j7 = -1;
        long j8 = 4096;
        if (a7 != -1 && a7 <= 4096) {
            j8 = a7;
        }
        int i10 = (int) j8;
        z zVar = new z(64);
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < i10) {
            zVar.P(8);
            if (!interfaceC0373s.l(zVar.e(), i11, 8, true)) {
                break;
            }
            long I6 = zVar.I();
            int p7 = zVar.p();
            if (I6 == 1) {
                interfaceC0373s.n(zVar.e(), 8, 8);
                i8 = 16;
                zVar.S(16);
                I6 = zVar.z();
            } else {
                if (I6 == 0) {
                    long a8 = interfaceC0373s.a();
                    if (a8 != j7) {
                        I6 = (a8 - interfaceC0373s.m()) + 8;
                    }
                }
                i8 = 8;
            }
            long j9 = I6;
            long j10 = i8;
            if (j9 < j10) {
                return new c(p7, j9, i8);
            }
            i12 += i8;
            if (p7 == 1836019574) {
                i10 += (int) j9;
                if (a7 != -1 && i10 > a7) {
                    i10 = (int) a7;
                }
            } else {
                if (p7 == 1836019558 || p7 == 1836475768) {
                    i7 = 1;
                    break;
                }
                long j11 = a7;
                if (p7 == 1835295092) {
                    z10 = true;
                }
                if ((i12 + j9) - j10 >= i10) {
                    i7 = 0;
                    break;
                }
                int i13 = (int) (j9 - j10);
                i12 += i13;
                if (p7 != 1718909296) {
                    i9 = 0;
                    if (i13 != 0) {
                        interfaceC0373s.o(i13);
                    }
                } else {
                    if (i13 < 8) {
                        return new c(p7, i13, 8);
                    }
                    zVar.P(i13);
                    i9 = 0;
                    interfaceC0373s.n(zVar.e(), 0, i13);
                    int p8 = zVar.p();
                    if (a(p8, z8)) {
                        z10 = true;
                    }
                    zVar.U(4);
                    int a9 = zVar.a() / 4;
                    if (!z10 && a9 > 0) {
                        iArr = new int[a9];
                        int i14 = 0;
                        while (true) {
                            if (i14 >= a9) {
                                z9 = z10;
                                break;
                            }
                            int p9 = zVar.p();
                            iArr[i14] = p9;
                            if (a(p9, z8)) {
                                z9 = true;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        z9 = z10;
                        iArr = null;
                    }
                    if (!z9) {
                        return new w(p8, iArr);
                    }
                    z10 = z9;
                }
                i11 = i9;
                a7 = j11;
            }
            j7 = -1;
        }
        i7 = i11;
        if (!z10) {
            return n.f7771a;
        }
        if (z7 != i7) {
            return i7 != 0 ? i.f7735b : i.f7736c;
        }
        return null;
    }

    public static Q d(InterfaceC0373s interfaceC0373s, boolean z7) {
        return c(interfaceC0373s, false, z7);
    }
}
