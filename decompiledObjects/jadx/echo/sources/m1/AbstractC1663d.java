package m1;

import F0.InterfaceC0373s;
import android.util.Pair;
import d0.C1162A;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import g0.z;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1663d {

    /* renamed from: m1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17662a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17663b;

        public a(int i7, long j7) {
            this.f17662a = i7;
            this.f17663b = j7;
        }

        public static a a(InterfaceC0373s interfaceC0373s, z zVar) {
            interfaceC0373s.n(zVar.e(), 0, 8);
            zVar.T(0);
            return new a(zVar.p(), zVar.w());
        }
    }

    public static boolean a(InterfaceC0373s interfaceC0373s) {
        z zVar = new z(8);
        int i7 = a.a(interfaceC0373s, zVar).f17662a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        interfaceC0373s.n(zVar.e(), 0, 4);
        zVar.T(0);
        int p7 = zVar.p();
        if (p7 == 1463899717) {
            return true;
        }
        o.c("WavHeaderReader", "Unsupported form type: " + p7);
        return false;
    }

    public static C1662c b(InterfaceC0373s interfaceC0373s) {
        byte[] bArr;
        z zVar = new z(16);
        a d7 = d(1718449184, interfaceC0373s, zVar);
        AbstractC1297a.f(d7.f17663b >= 16);
        interfaceC0373s.n(zVar.e(), 0, 16);
        zVar.T(0);
        int y7 = zVar.y();
        int y8 = zVar.y();
        int x7 = zVar.x();
        int x8 = zVar.x();
        int y9 = zVar.y();
        int y10 = zVar.y();
        int i7 = ((int) d7.f17663b) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            interfaceC0373s.n(bArr2, 0, i7);
            bArr = bArr2;
        } else {
            bArr = M.f14266f;
        }
        interfaceC0373s.i((int) (interfaceC0373s.m() - interfaceC0373s.p()));
        return new C1662c(y7, y8, x7, x8, y9, y10, bArr);
    }

    public static long c(InterfaceC0373s interfaceC0373s) {
        z zVar = new z(8);
        a a7 = a.a(interfaceC0373s, zVar);
        if (a7.f17662a != 1685272116) {
            interfaceC0373s.h();
            return -1L;
        }
        interfaceC0373s.o(8);
        zVar.T(0);
        interfaceC0373s.n(zVar.e(), 0, 8);
        long u7 = zVar.u();
        interfaceC0373s.i(((int) a7.f17663b) + 8);
        return u7;
    }

    public static a d(int i7, InterfaceC0373s interfaceC0373s, z zVar) {
        while (true) {
            a a7 = a.a(interfaceC0373s, zVar);
            if (a7.f17662a == i7) {
                return a7;
            }
            o.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a7.f17662a);
            long j7 = a7.f17663b;
            long j8 = 8 + j7;
            if (j7 % 2 != 0) {
                j8 = 9 + j7;
            }
            if (j8 > 2147483647L) {
                throw C1162A.d("Chunk is too large (~2GB+) to skip; id: " + a7.f17662a);
            }
            interfaceC0373s.i((int) j8);
        }
    }

    public static Pair e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.h();
        a d7 = d(1684108385, interfaceC0373s, new z(8));
        interfaceC0373s.i(8);
        return Pair.create(Long.valueOf(interfaceC0373s.p()), Long.valueOf(d7.f17663b));
    }
}
