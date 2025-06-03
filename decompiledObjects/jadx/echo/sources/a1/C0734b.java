package a1;

import F0.A;
import F0.B;
import F0.InterfaceC0373s;
import F0.M;
import F0.y;
import a1.AbstractC0741i;
import g0.AbstractC1297a;
import g0.z;
import java.util.Arrays;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734b extends AbstractC0741i {

    /* renamed from: n, reason: collision with root package name */
    public B f8016n;

    /* renamed from: o, reason: collision with root package name */
    public a f8017o;

    /* renamed from: a1.b$a */
    public static final class a implements InterfaceC0739g {

        /* renamed from: a, reason: collision with root package name */
        public B f8018a;

        /* renamed from: b, reason: collision with root package name */
        public B.a f8019b;

        /* renamed from: c, reason: collision with root package name */
        public long f8020c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f8021d = -1;

        public a(B b7, B.a aVar) {
            this.f8018a = b7;
            this.f8019b = aVar;
        }

        @Override // a1.InterfaceC0739g
        public M a() {
            AbstractC1297a.f(this.f8020c != -1);
            return new A(this.f8018a, this.f8020c);
        }

        @Override // a1.InterfaceC0739g
        public void b(long j7) {
            long[] jArr = this.f8019b.f1750a;
            this.f8021d = jArr[g0.M.h(jArr, j7, true, true)];
        }

        @Override // a1.InterfaceC0739g
        public long c(InterfaceC0373s interfaceC0373s) {
            long j7 = this.f8021d;
            if (j7 < 0) {
                return -1L;
            }
            long j8 = -(j7 + 2);
            this.f8021d = -1L;
            return j8;
        }

        public void d(long j7) {
            this.f8020c = j7;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(z zVar) {
        return zVar.a() >= 5 && zVar.G() == 127 && zVar.I() == 1179402563;
    }

    @Override // a1.AbstractC0741i
    public long f(z zVar) {
        if (o(zVar.e())) {
            return n(zVar);
        }
        return -1L;
    }

    @Override // a1.AbstractC0741i
    public boolean i(z zVar, long j7, AbstractC0741i.b bVar) {
        byte[] e7 = zVar.e();
        B b7 = this.f8016n;
        if (b7 == null) {
            B b8 = new B(e7, 17);
            this.f8016n = b8;
            bVar.f8058a = b8.g(Arrays.copyOfRange(e7, 9, zVar.g()), null);
            return true;
        }
        if ((e7[0] & Byte.MAX_VALUE) == 3) {
            B.a g7 = F0.z.g(zVar);
            B b9 = b7.b(g7);
            this.f8016n = b9;
            this.f8017o = new a(b9, g7);
            return true;
        }
        if (!o(e7)) {
            return true;
        }
        a aVar = this.f8017o;
        if (aVar != null) {
            aVar.d(j7);
            bVar.f8059b = this.f8017o;
        }
        AbstractC1297a.e(bVar.f8058a);
        return false;
    }

    @Override // a1.AbstractC0741i
    public void l(boolean z7) {
        super.l(z7);
        if (z7) {
            this.f8016n = null;
            this.f8017o = null;
        }
    }

    public final int n(z zVar) {
        int i7 = (zVar.e()[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            zVar.U(4);
            zVar.N();
        }
        int j7 = y.j(zVar, i7);
        zVar.T(0);
        return j7;
    }
}
