package l1;

import F0.InterfaceC0374t;
import F0.T;
import g0.AbstractC1297a;
import h0.AbstractC1329d;
import java.util.Arrays;
import l1.K;

/* loaded from: classes.dex */
public final class n implements InterfaceC1597m {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f16921q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f16922a;

    /* renamed from: b, reason: collision with root package name */
    public T f16923b;

    /* renamed from: c, reason: collision with root package name */
    public final M f16924c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.z f16925d;

    /* renamed from: e, reason: collision with root package name */
    public final w f16926e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16927f;

    /* renamed from: g, reason: collision with root package name */
    public final a f16928g;

    /* renamed from: h, reason: collision with root package name */
    public long f16929h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16930i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16931j;

    /* renamed from: k, reason: collision with root package name */
    public long f16932k;

    /* renamed from: l, reason: collision with root package name */
    public long f16933l;

    /* renamed from: m, reason: collision with root package name */
    public long f16934m;

    /* renamed from: n, reason: collision with root package name */
    public long f16935n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16936o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16937p;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f16938e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f16939a;

        /* renamed from: b, reason: collision with root package name */
        public int f16940b;

        /* renamed from: c, reason: collision with root package name */
        public int f16941c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16942d;

        public a(int i7) {
            this.f16942d = new byte[i7];
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16939a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f16942d;
                int length = bArr2.length;
                int i10 = this.f16940b;
                if (length < i10 + i9) {
                    this.f16942d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f16942d, this.f16940b, i9);
                this.f16940b += i9;
            }
        }

        public boolean b(int i7, int i8) {
            if (this.f16939a) {
                int i9 = this.f16940b - i8;
                this.f16940b = i9;
                if (this.f16941c != 0 || i7 != 181) {
                    this.f16939a = false;
                    return true;
                }
                this.f16941c = i9;
            } else if (i7 == 179) {
                this.f16939a = true;
            }
            byte[] bArr = f16938e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f16939a = false;
            this.f16940b = 0;
            this.f16941c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(l1.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f16942d
            int r1 = r8.f16940b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            d0.q$b r6 = new d0.q$b
            r6.<init>()
            d0.q$b r9 = r6.a0(r9)
            java.lang.String r6 = "video/mpeg2"
            d0.q$b r9 = r9.o0(r6)
            d0.q$b r9 = r9.v0(r2)
            d0.q$b r9 = r9.Y(r4)
            d0.q$b r9 = r9.k0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            d0.q$b r9 = r9.b0(r1)
            d0.q r9 = r9.K()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = l1.n.f16921q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f16941c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.n.f(l1.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // l1.InterfaceC1597m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(g0.z r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.n.a(g0.z):void");
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        AbstractC1329d.a(this.f16927f);
        this.f16928g.c();
        w wVar = this.f16926e;
        if (wVar != null) {
            wVar.d();
        }
        this.f16929h = 0L;
        this.f16930i = false;
        this.f16933l = -9223372036854775807L;
        this.f16935n = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        AbstractC1297a.h(this.f16923b);
        if (z7) {
            boolean z8 = this.f16936o;
            this.f16923b.b(this.f16935n, z8 ? 1 : 0, (int) (this.f16929h - this.f16934m), 0, null);
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16933l = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16922a = dVar.b();
        this.f16923b = interfaceC0374t.a(dVar.c(), 2);
        M m7 = this.f16924c;
        if (m7 != null) {
            m7.b(interfaceC0374t, dVar);
        }
    }

    public n(M m7) {
        g0.z zVar;
        this.f16924c = m7;
        this.f16927f = new boolean[4];
        this.f16928g = new a(128);
        if (m7 != null) {
            this.f16926e = new w(178, 128);
            zVar = new g0.z();
        } else {
            zVar = null;
            this.f16926e = null;
        }
        this.f16925d = zVar;
        this.f16933l = -9223372036854775807L;
        this.f16935n = -9223372036854775807L;
    }
}
