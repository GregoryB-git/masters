package a1;

import F0.W;
import X2.AbstractC0703v;
import a1.AbstractC0741i;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742j extends AbstractC0741i {

    /* renamed from: n, reason: collision with root package name */
    public a f8060n;

    /* renamed from: o, reason: collision with root package name */
    public int f8061o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8062p;

    /* renamed from: q, reason: collision with root package name */
    public W.c f8063q;

    /* renamed from: r, reason: collision with root package name */
    public W.a f8064r;

    /* renamed from: a1.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final W.c f8065a;

        /* renamed from: b, reason: collision with root package name */
        public final W.a f8066b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f8067c;

        /* renamed from: d, reason: collision with root package name */
        public final W.b[] f8068d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8069e;

        public a(W.c cVar, W.a aVar, byte[] bArr, W.b[] bVarArr, int i7) {
            this.f8065a = cVar;
            this.f8066b = aVar;
            this.f8067c = bArr;
            this.f8068d = bVarArr;
            this.f8069e = i7;
        }
    }

    public static void n(z zVar, long j7) {
        if (zVar.b() < zVar.g() + 4) {
            zVar.Q(Arrays.copyOf(zVar.e(), zVar.g() + 4));
        } else {
            zVar.S(zVar.g() + 4);
        }
        byte[] e7 = zVar.e();
        e7[zVar.g() - 4] = (byte) (j7 & 255);
        e7[zVar.g() - 3] = (byte) ((j7 >>> 8) & 255);
        e7[zVar.g() - 2] = (byte) ((j7 >>> 16) & 255);
        e7[zVar.g() - 1] = (byte) ((j7 >>> 24) & 255);
    }

    public static int o(byte b7, a aVar) {
        return !aVar.f8068d[p(b7, aVar.f8069e, 1)].f1823a ? aVar.f8065a.f1833g : aVar.f8065a.f1834h;
    }

    public static int p(byte b7, int i7, int i8) {
        return (b7 >> i8) & (255 >>> (8 - i7));
    }

    public static boolean r(z zVar) {
        try {
            return W.o(1, zVar, true);
        } catch (C1162A unused) {
            return false;
        }
    }

    @Override // a1.AbstractC0741i
    public void e(long j7) {
        super.e(j7);
        this.f8062p = j7 != 0;
        W.c cVar = this.f8063q;
        this.f8061o = cVar != null ? cVar.f1833g : 0;
    }

    @Override // a1.AbstractC0741i
    public long f(z zVar) {
        if ((zVar.e()[0] & 1) == 1) {
            return -1L;
        }
        int o7 = o(zVar.e()[0], (a) AbstractC1297a.h(this.f8060n));
        long j7 = this.f8062p ? (this.f8061o + o7) / 4 : 0;
        n(zVar, j7);
        this.f8062p = true;
        this.f8061o = o7;
        return j7;
    }

    @Override // a1.AbstractC0741i
    public boolean i(z zVar, long j7, AbstractC0741i.b bVar) {
        if (this.f8060n != null) {
            AbstractC1297a.e(bVar.f8058a);
            return false;
        }
        a q7 = q(zVar);
        this.f8060n = q7;
        if (q7 == null) {
            return true;
        }
        W.c cVar = q7.f8065a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f1836j);
        arrayList.add(q7.f8067c);
        bVar.f8058a = new C1194q.b().o0("audio/vorbis").M(cVar.f1831e).j0(cVar.f1830d).N(cVar.f1828b).p0(cVar.f1829c).b0(arrayList).h0(W.d(AbstractC0703v.V(q7.f8066b.f1821b))).K();
        return true;
    }

    @Override // a1.AbstractC0741i
    public void l(boolean z7) {
        super.l(z7);
        if (z7) {
            this.f8060n = null;
            this.f8063q = null;
            this.f8064r = null;
        }
        this.f8061o = 0;
        this.f8062p = false;
    }

    public a q(z zVar) {
        W.c cVar = this.f8063q;
        if (cVar == null) {
            this.f8063q = W.l(zVar);
            return null;
        }
        W.a aVar = this.f8064r;
        if (aVar == null) {
            this.f8064r = W.j(zVar);
            return null;
        }
        byte[] bArr = new byte[zVar.g()];
        System.arraycopy(zVar.e(), 0, bArr, 0, zVar.g());
        return new a(cVar, aVar, bArr, W.m(zVar, cVar.f1828b), W.b(r4.length - 1));
    }
}
