package l4;

import c4.l;
import c4.m;
import c4.n;
import c4.o;
import c4.t;
import java.util.Arrays;
import l4.h;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    public o f9573n;

    /* renamed from: o, reason: collision with root package name */
    public a f9574o;

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public o f9575a;

        /* renamed from: b, reason: collision with root package name */
        public o.a f9576b;

        /* renamed from: c, reason: collision with root package name */
        public long f9577c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f9578d = -1;

        public a(o oVar, o.a aVar) {
            this.f9575a = oVar;
            this.f9576b = aVar;
        }

        @Override // l4.f
        public final t a() {
            x6.b.H(this.f9577c != -1);
            return new n(this.f9575a, this.f9577c);
        }

        @Override // l4.f
        public final long b(c4.i iVar) {
            long j10 = this.f9578d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f9578d = -1L;
            return j11;
        }

        @Override // l4.f
        public final void c(long j10) {
            long[] jArr = this.f9576b.f2303a;
            this.f9578d = jArr[e0.f(jArr, j10, true)];
        }
    }

    @Override // l4.h
    public final long b(u uVar) {
        byte[] bArr = uVar.f15974a;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            uVar.H(4);
            uVar.B();
        }
        int b10 = l.b(i10, uVar);
        uVar.G(0);
        return b10;
    }

    @Override // l4.h
    public final boolean c(u uVar, long j10, h.a aVar) {
        byte[] bArr = uVar.f15974a;
        o oVar = this.f9573n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f9573n = oVar2;
            aVar.f9608a = oVar2.c(Arrays.copyOfRange(bArr, 9, uVar.f15976c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            o.a a10 = m.a(uVar);
            o oVar3 = new o(oVar.f2292a, oVar.f2293b, oVar.f2294c, oVar.f2295d, oVar.f2296e, oVar.f2297g, oVar.f2298h, oVar.f2300j, a10, oVar.f2302l);
            this.f9573n = oVar3;
            this.f9574o = new a(oVar3, a10);
            return true;
        }
        if (!(b10 == -1)) {
            return true;
        }
        a aVar2 = this.f9574o;
        if (aVar2 != null) {
            aVar2.f9577c = j10;
            aVar.f9609b = aVar2;
        }
        aVar.f9608a.getClass();
        return false;
    }

    @Override // l4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f9573n = null;
            this.f9574o = null;
        }
    }
}
