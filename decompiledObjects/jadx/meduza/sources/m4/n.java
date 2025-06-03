package m4;

import m4.d0;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f10093a;

    /* renamed from: b, reason: collision with root package name */
    public String f10094b;

    /* renamed from: c, reason: collision with root package name */
    public c4.v f10095c;

    /* renamed from: d, reason: collision with root package name */
    public a f10096d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10097e;

    /* renamed from: l, reason: collision with root package name */
    public long f10103l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f10098g = new r(32);

    /* renamed from: h, reason: collision with root package name */
    public final r f10099h = new r(33);

    /* renamed from: i, reason: collision with root package name */
    public final r f10100i = new r(34);

    /* renamed from: j, reason: collision with root package name */
    public final r f10101j = new r(39);

    /* renamed from: k, reason: collision with root package name */
    public final r f10102k = new r(40);

    /* renamed from: m, reason: collision with root package name */
    public long f10104m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final v5.u f10105n = new v5.u();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c4.v f10106a;

        /* renamed from: b, reason: collision with root package name */
        public long f10107b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10108c;

        /* renamed from: d, reason: collision with root package name */
        public int f10109d;

        /* renamed from: e, reason: collision with root package name */
        public long f10110e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f10111g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f10112h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f10113i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f10114j;

        /* renamed from: k, reason: collision with root package name */
        public long f10115k;

        /* renamed from: l, reason: collision with root package name */
        public long f10116l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f10117m;

        public a(c4.v vVar) {
            this.f10106a = vVar;
        }
    }

    public n(z zVar) {
        this.f10093a = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218  */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r36) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.n.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        this.f10103l = 0L;
        this.f10104m = -9223372036854775807L;
        v5.q.a(this.f);
        this.f10098g.c();
        this.f10099h.c();
        this.f10100i.c();
        this.f10101j.c();
        this.f10102k.c();
        a aVar = this.f10096d;
        if (aVar != null) {
            aVar.f = false;
            aVar.f10111g = false;
            aVar.f10112h = false;
            aVar.f10113i = false;
            aVar.f10114j = false;
        }
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f10104m = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f10094b = dVar.f9952e;
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 2);
        this.f10095c = r10;
        this.f10096d = new a(r10);
        this.f10093a.a(jVar, dVar);
    }

    public final void f(byte[] bArr, int i10, int i11) {
        a aVar = this.f10096d;
        if (aVar.f) {
            int i12 = aVar.f10109d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                aVar.f10111g = (bArr[i13] & 128) != 0;
                aVar.f = false;
            } else {
                aVar.f10109d = (i11 - i10) + i12;
            }
        }
        if (!this.f10097e) {
            this.f10098g.a(bArr, i10, i11);
            this.f10099h.a(bArr, i10, i11);
            this.f10100i.a(bArr, i10, i11);
        }
        this.f10101j.a(bArr, i10, i11);
        this.f10102k.a(bArr, i10, i11);
    }
}
