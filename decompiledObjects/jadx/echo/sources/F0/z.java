package F0;

import F0.B;
import X2.AbstractC0703v;
import d0.C1162A;
import d0.C1201x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public B f1960a;

        public a(B b7) {
            this.f1960a = b7;
        }
    }

    public static boolean a(InterfaceC0373s interfaceC0373s) {
        g0.z zVar = new g0.z(4);
        interfaceC0373s.n(zVar.e(), 0, 4);
        return zVar.I() == 1716281667;
    }

    public static int b(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.h();
        g0.z zVar = new g0.z(2);
        interfaceC0373s.n(zVar.e(), 0, 2);
        int M6 = zVar.M();
        int i7 = M6 >> 2;
        interfaceC0373s.h();
        if (i7 == 16382) {
            return M6;
        }
        throw C1162A.a("First frame does not start with sync code.", null);
    }

    public static C1201x c(InterfaceC0373s interfaceC0373s, boolean z7) {
        C1201x a7 = new G().a(interfaceC0373s, z7 ? null : T0.h.f6037b);
        if (a7 == null || a7.e() == 0) {
            return null;
        }
        return a7;
    }

    public static C1201x d(InterfaceC0373s interfaceC0373s, boolean z7) {
        interfaceC0373s.h();
        long m7 = interfaceC0373s.m();
        C1201x c7 = c(interfaceC0373s, z7);
        interfaceC0373s.i((int) (interfaceC0373s.m() - m7));
        return c7;
    }

    public static boolean e(InterfaceC0373s interfaceC0373s, a aVar) {
        B a7;
        interfaceC0373s.h();
        g0.y yVar = new g0.y(new byte[4]);
        interfaceC0373s.n(yVar.f14341a, 0, 4);
        boolean g7 = yVar.g();
        int h7 = yVar.h(7);
        int h8 = yVar.h(24) + 4;
        if (h7 == 0) {
            a7 = h(interfaceC0373s);
        } else {
            B b7 = aVar.f1960a;
            if (b7 == null) {
                throw new IllegalArgumentException();
            }
            if (h7 == 3) {
                a7 = b7.b(f(interfaceC0373s, h8));
            } else if (h7 == 4) {
                a7 = b7.c(j(interfaceC0373s, h8));
            } else {
                if (h7 != 6) {
                    interfaceC0373s.i(h8);
                    return g7;
                }
                g0.z zVar = new g0.z(h8);
                interfaceC0373s.readFully(zVar.e(), 0, h8);
                zVar.U(4);
                a7 = b7.a(AbstractC0703v.Z(R0.a.a(zVar)));
            }
        }
        aVar.f1960a = a7;
        return g7;
    }

    public static B.a f(InterfaceC0373s interfaceC0373s, int i7) {
        g0.z zVar = new g0.z(i7);
        interfaceC0373s.readFully(zVar.e(), 0, i7);
        return g(zVar);
    }

    public static B.a g(g0.z zVar) {
        zVar.U(1);
        int J6 = zVar.J();
        long f7 = zVar.f() + J6;
        int i7 = J6 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long z7 = zVar.z();
            if (z7 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = z7;
            jArr2[i8] = zVar.z();
            zVar.U(2);
            i8++;
        }
        zVar.U((int) (f7 - zVar.f()));
        return new B.a(jArr, jArr2);
    }

    public static B h(InterfaceC0373s interfaceC0373s) {
        byte[] bArr = new byte[38];
        interfaceC0373s.readFully(bArr, 0, 38);
        return new B(bArr, 4);
    }

    public static void i(InterfaceC0373s interfaceC0373s) {
        g0.z zVar = new g0.z(4);
        interfaceC0373s.readFully(zVar.e(), 0, 4);
        if (zVar.I() != 1716281667) {
            throw C1162A.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(InterfaceC0373s interfaceC0373s, int i7) {
        g0.z zVar = new g0.z(i7);
        interfaceC0373s.readFully(zVar.e(), 0, i7);
        zVar.U(4);
        return Arrays.asList(W.k(zVar, false, false).f1821b);
    }
}
