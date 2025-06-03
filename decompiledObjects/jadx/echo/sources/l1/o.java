package l1;

import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import h0.AbstractC1329d;
import java.util.Arrays;
import java.util.Collections;
import l1.K;

/* loaded from: classes.dex */
public final class o implements InterfaceC1597m {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f16943l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final M f16944a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16945b;

    /* renamed from: e, reason: collision with root package name */
    public final w f16948e;

    /* renamed from: f, reason: collision with root package name */
    public b f16949f;

    /* renamed from: g, reason: collision with root package name */
    public long f16950g;

    /* renamed from: h, reason: collision with root package name */
    public String f16951h;

    /* renamed from: i, reason: collision with root package name */
    public T f16952i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16953j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f16946c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final a f16947d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    public long f16954k = -9223372036854775807L;

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f16955f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f16956a;

        /* renamed from: b, reason: collision with root package name */
        public int f16957b;

        /* renamed from: c, reason: collision with root package name */
        public int f16958c;

        /* renamed from: d, reason: collision with root package name */
        public int f16959d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f16960e;

        public a(int i7) {
            this.f16960e = new byte[i7];
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16956a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f16960e;
                int length = bArr2.length;
                int i10 = this.f16958c;
                if (length < i10 + i9) {
                    this.f16960e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f16960e, this.f16958c, i9);
                this.f16958c += i9;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r9 != 181) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f16957b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4a
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L47
                r7 = 3
                if (r0 == r4) goto L3f
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L52
            L1d:
                int r9 = r8.f16958c
                int r9 = r9 - r10
                r8.f16958c = r9
                r8.f16956a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L38
            L31:
                g0.o.h(r6, r5)
                r8.c()
                goto L52
            L38:
                int r9 = r8.f16958c
                r8.f16959d = r9
            L3c:
                r8.f16957b = r4
                goto L52
            L3f:
                r10 = 31
                if (r9 <= r10) goto L44
                goto L31
            L44:
                r8.f16957b = r7
                goto L52
            L47:
                if (r9 == r3) goto L3c
                goto L31
            L4a:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L52
                r8.f16957b = r2
                r8.f16956a = r2
            L52:
                byte[] r9 = l1.o.a.f16955f
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.o.a.b(int, int):boolean");
        }

        public void c() {
            this.f16956a = false;
            this.f16958c = 0;
            this.f16957b = 0;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final T f16961a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16962b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16963c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16964d;

        /* renamed from: e, reason: collision with root package name */
        public int f16965e;

        /* renamed from: f, reason: collision with root package name */
        public int f16966f;

        /* renamed from: g, reason: collision with root package name */
        public long f16967g;

        /* renamed from: h, reason: collision with root package name */
        public long f16968h;

        public b(T t7) {
            this.f16961a = t7;
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16963c) {
                int i9 = this.f16966f;
                int i10 = (i7 + 1) - i9;
                if (i10 >= i8) {
                    this.f16966f = i9 + (i8 - i7);
                } else {
                    this.f16964d = ((bArr[i10] & 192) >> 6) == 0;
                    this.f16963c = false;
                }
            }
        }

        public void b(long j7, int i7, boolean z7) {
            AbstractC1297a.f(this.f16968h != -9223372036854775807L);
            if (this.f16965e == 182 && z7 && this.f16962b) {
                this.f16961a.b(this.f16968h, this.f16964d ? 1 : 0, (int) (j7 - this.f16967g), i7, null);
            }
            if (this.f16965e != 179) {
                this.f16967g = j7;
            }
        }

        public void c(int i7, long j7) {
            this.f16965e = i7;
            this.f16964d = false;
            this.f16962b = i7 == 182 || i7 == 179;
            this.f16963c = i7 == 182;
            this.f16966f = 0;
            this.f16968h = j7;
        }

        public void d() {
            this.f16962b = false;
            this.f16963c = false;
            this.f16964d = false;
            this.f16965e = -1;
        }
    }

    public o(M m7) {
        g0.z zVar;
        this.f16944a = m7;
        if (m7 != null) {
            this.f16948e = new w(178, 128);
            zVar = new g0.z();
        } else {
            zVar = null;
            this.f16948e = null;
        }
        this.f16945b = zVar;
    }

    public static C1194q f(a aVar, int i7, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f16960e, aVar.f16958c);
        g0.y yVar = new g0.y(copyOf);
        yVar.s(i7);
        yVar.s(4);
        yVar.q();
        yVar.r(8);
        if (yVar.g()) {
            yVar.r(4);
            yVar.r(3);
        }
        int h7 = yVar.h(4);
        float f7 = 1.0f;
        if (h7 == 15) {
            int h8 = yVar.h(8);
            int h9 = yVar.h(8);
            if (h9 != 0) {
                f7 = h8 / h9;
            }
            g0.o.h("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f16943l;
            if (h7 < fArr.length) {
                f7 = fArr[h7];
            }
            g0.o.h("H263Reader", "Invalid aspect ratio");
        }
        if (yVar.g()) {
            yVar.r(2);
            yVar.r(1);
            if (yVar.g()) {
                yVar.r(15);
                yVar.q();
                yVar.r(15);
                yVar.q();
                yVar.r(15);
                yVar.q();
                yVar.r(3);
                yVar.r(11);
                yVar.q();
                yVar.r(15);
                yVar.q();
            }
        }
        if (yVar.h(2) != 0) {
            g0.o.h("H263Reader", "Unhandled video object layer shape");
        }
        yVar.q();
        int h10 = yVar.h(16);
        yVar.q();
        if (yVar.g()) {
            if (h10 == 0) {
                g0.o.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i8 = 0;
                for (int i9 = h10 - 1; i9 > 0; i9 >>= 1) {
                    i8++;
                }
                yVar.r(i8);
            }
        }
        yVar.q();
        int h11 = yVar.h(13);
        yVar.q();
        int h12 = yVar.h(13);
        yVar.q();
        yVar.q();
        return new C1194q.b().a0(str).o0("video/mp4v-es").v0(h11).Y(h12).k0(f7).b0(Collections.singletonList(copyOf)).K();
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f16949f);
        AbstractC1297a.h(this.f16952i);
        int f7 = zVar.f();
        int g7 = zVar.g();
        byte[] e7 = zVar.e();
        this.f16950g += zVar.a();
        this.f16952i.e(zVar, zVar.a());
        while (true) {
            int c7 = AbstractC1329d.c(e7, f7, g7, this.f16946c);
            if (c7 == g7) {
                break;
            }
            int i7 = c7 + 3;
            int i8 = zVar.e()[i7] & 255;
            int i9 = c7 - f7;
            int i10 = 0;
            if (!this.f16953j) {
                if (i9 > 0) {
                    this.f16947d.a(e7, f7, c7);
                }
                if (this.f16947d.b(i8, i9 < 0 ? -i9 : 0)) {
                    T t7 = this.f16952i;
                    a aVar = this.f16947d;
                    t7.d(f(aVar, aVar.f16959d, (String) AbstractC1297a.e(this.f16951h)));
                    this.f16953j = true;
                }
            }
            this.f16949f.a(e7, f7, c7);
            w wVar = this.f16948e;
            if (wVar != null) {
                if (i9 > 0) {
                    wVar.a(e7, f7, c7);
                } else {
                    i10 = -i9;
                }
                if (this.f16948e.b(i10)) {
                    w wVar2 = this.f16948e;
                    ((g0.z) g0.M.i(this.f16945b)).R(this.f16948e.f17118d, AbstractC1329d.r(wVar2.f17118d, wVar2.f17119e));
                    ((M) g0.M.i(this.f16944a)).a(this.f16954k, this.f16945b);
                }
                if (i8 == 178 && zVar.e()[c7 + 2] == 1) {
                    this.f16948e.e(i8);
                }
            }
            int i11 = g7 - c7;
            this.f16949f.b(this.f16950g - i11, i11, this.f16953j);
            this.f16949f.c(i8, this.f16954k);
            f7 = i7;
        }
        if (!this.f16953j) {
            this.f16947d.a(e7, f7, g7);
        }
        this.f16949f.a(e7, f7, g7);
        w wVar3 = this.f16948e;
        if (wVar3 != null) {
            wVar3.a(e7, f7, g7);
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        AbstractC1329d.a(this.f16946c);
        this.f16947d.c();
        b bVar = this.f16949f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f16948e;
        if (wVar != null) {
            wVar.d();
        }
        this.f16950g = 0L;
        this.f16954k = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        AbstractC1297a.h(this.f16949f);
        if (z7) {
            this.f16949f.b(this.f16950g, 0, this.f16953j);
            this.f16949f.d();
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16954k = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16951h = dVar.b();
        T a7 = interfaceC0374t.a(dVar.c(), 2);
        this.f16952i = a7;
        this.f16949f = new b(a7);
        M m7 = this.f16944a;
        if (m7 != null) {
            m7.b(interfaceC0374t, dVar);
        }
    }
}
