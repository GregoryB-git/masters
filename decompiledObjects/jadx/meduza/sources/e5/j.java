package e5;

import android.net.Uri;
import b.z;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o7.l0;
import o7.t;
import v3.i0;
import v5.c0;
import v5.u;
import w3.a0;

/* loaded from: classes.dex */
public final class j extends b5.m {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public k C;
    public n D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public t<Integer> I;
    public boolean J;
    public boolean K;

    /* renamed from: k, reason: collision with root package name */
    public final int f3974k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3975l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f3976m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3977n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3978o;

    /* renamed from: p, reason: collision with root package name */
    public final t5.k f3979p;

    /* renamed from: q, reason: collision with root package name */
    public final t5.n f3980q;

    /* renamed from: r, reason: collision with root package name */
    public final k f3981r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3982s;
    public final boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f3983u;

    /* renamed from: v, reason: collision with root package name */
    public final i f3984v;

    /* renamed from: w, reason: collision with root package name */
    public final List<i0> f3985w;

    /* renamed from: x, reason: collision with root package name */
    public final a4.d f3986x;

    /* renamed from: y, reason: collision with root package name */
    public final u4.g f3987y;

    /* renamed from: z, reason: collision with root package name */
    public final u f3988z;

    public j(i iVar, t5.k kVar, t5.n nVar, i0 i0Var, boolean z10, t5.k kVar2, t5.n nVar2, boolean z11, Uri uri, List<i0> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, c0 c0Var, a4.d dVar, k kVar3, u4.g gVar, u uVar, boolean z15, a0 a0Var) {
        super(kVar, nVar, i0Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f3978o = i11;
        this.K = z12;
        this.f3975l = i12;
        this.f3980q = nVar2;
        this.f3979p = kVar2;
        this.F = nVar2 != null;
        this.B = z11;
        this.f3976m = uri;
        this.f3982s = z14;
        this.f3983u = c0Var;
        this.t = z13;
        this.f3984v = iVar;
        this.f3985w = list;
        this.f3986x = dVar;
        this.f3981r = kVar3;
        this.f3987y = gVar;
        this.f3988z = uVar;
        this.f3977n = z15;
        t.b bVar = t.f12050b;
        this.I = l0.f12009e;
        this.f3974k = L.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (x6.b.x0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // t5.d0.d
    public final void a() {
        k kVar;
        this.D.getClass();
        if (this.C == null && (kVar = this.f3981r) != null) {
            c4.h hVar = ((b) kVar).f3938a;
            if ((hVar instanceof m4.c0) || (hVar instanceof k4.e)) {
                this.C = kVar;
                this.F = false;
            }
        }
        if (this.F) {
            this.f3979p.getClass();
            this.f3980q.getClass();
            e(this.f3979p, this.f3980q, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            e(this.f1868i, this.f1862b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // t5.d0.d
    public final void b() {
        this.G = true;
    }

    @Override // b5.m
    public final boolean d() {
        throw null;
    }

    public final void e(t5.k kVar, t5.n nVar, boolean z10, boolean z11) {
        t5.n a10;
        boolean z12;
        long j10;
        long j11;
        if (z10) {
            z12 = this.E != 0;
            a10 = nVar;
        } else {
            a10 = nVar.a(this.E);
            z12 = false;
        }
        try {
            c4.e h10 = h(kVar, a10, z11);
            if (z12) {
                h10.j(this.E);
            }
            while (!this.G) {
                try {
                    try {
                        if (!(((b) this.C).f3938a.d(h10, b.f3937d) == 0)) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f1864d.f15451e & 16384) == 0) {
                            throw e10;
                        }
                        ((b) this.C).f3938a.f(0L, 0L);
                        j10 = h10.f2276d;
                        j11 = nVar.f;
                    }
                } catch (Throwable th) {
                    this.E = (int) (h10.f2276d - nVar.f);
                    throw th;
                }
            }
            j10 = h10.f2276d;
            j11 = nVar.f;
            this.E = (int) (j10 - j11);
        } finally {
            z.d(kVar);
        }
    }

    public final int g(int i10) {
        x6.b.H(!this.f3977n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i10).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c4.e h(t5.k r20, t5.n r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.j.h(t5.k, t5.n, boolean):c4.e");
    }
}
