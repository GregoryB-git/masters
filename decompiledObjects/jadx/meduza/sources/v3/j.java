package v3;

/* loaded from: classes.dex */
public final class j implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final t5.o f15489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15491c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15492d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15493e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15494g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15495h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15496i;

    /* renamed from: j, reason: collision with root package name */
    public int f15497j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15498k;

    public j(t5.o oVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j("bufferForPlaybackMs", i12, 0, "0");
        j("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        j("minBufferMs", i10, i12, "bufferForPlaybackMs");
        j("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        j("maxBufferMs", i11, i10, "minBufferMs");
        j("backBufferDurationMs", i15, 0, "0");
        this.f15489a = oVar;
        this.f15490b = v5.e0.I(i10);
        this.f15491c = v5.e0.I(i11);
        this.f15492d = v5.e0.I(i12);
        this.f15493e = v5.e0.I(i13);
        this.f = i14;
        this.f15497j = i14 == -1 ? 13107200 : i14;
        this.f15494g = z10;
        this.f15495h = v5.e0.I(i15);
        this.f15496i = z11;
    }

    public static void j(String str, int i10, int i11, String str2) {
        x6.b.o(str + " cannot be less than " + str2, i10 >= i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // v3.n0
    public final void a(j1[] j1VarArr, r5.h[] hVarArr) {
        int i10 = this.f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < j1VarArr.length) {
                    if (hVarArr[i11] != null) {
                        switch (j1VarArr[i11].x()) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        this.f15497j = i10;
        t5.o oVar = this.f15489a;
        synchronized (oVar) {
            boolean z10 = i10 < oVar.f14558c;
            oVar.f14558c = i10;
            if (z10) {
                oVar.a();
            }
        }
    }

    @Override // v3.n0
    public final boolean b() {
        return this.f15496i;
    }

    @Override // v3.n0
    public final long c() {
        return this.f15495h;
    }

    @Override // v3.n0
    public final void d() {
        k(false);
    }

    @Override // v3.n0
    public final boolean e(long j10, float f) {
        int i10;
        t5.o oVar = this.f15489a;
        synchronized (oVar) {
            i10 = oVar.f14559d * oVar.f14557b;
        }
        boolean z10 = true;
        boolean z11 = i10 >= this.f15497j;
        long j11 = this.f15490b;
        if (f > 1.0f) {
            j11 = Math.min(v5.e0.t(j11, f), this.f15491c);
        }
        if (j10 < Math.max(j11, 500000L)) {
            if (!this.f15494g && z11) {
                z10 = false;
            }
            this.f15498k = z10;
            if (!z10 && j10 < 500000) {
                v5.m.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f15491c || z11) {
            this.f15498k = false;
        }
        return this.f15498k;
    }

    @Override // v3.n0
    public final void f() {
        k(true);
    }

    @Override // v3.n0
    public final boolean g(long j10, float f, boolean z10, long j11) {
        int i10;
        long x10 = v5.e0.x(j10, f);
        long j12 = z10 ? this.f15493e : this.f15492d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 > 0 && x10 < j12) {
            if (!this.f15494g) {
                t5.o oVar = this.f15489a;
                synchronized (oVar) {
                    i10 = oVar.f14559d * oVar.f14557b;
                }
                if (i10 >= this.f15497j) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // v3.n0
    public final t5.o h() {
        return this.f15489a;
    }

    @Override // v3.n0
    public final void i() {
        k(true);
    }

    public final void k(boolean z10) {
        int i10 = this.f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f15497j = i10;
        this.f15498k = false;
        if (z10) {
            t5.o oVar = this.f15489a;
            synchronized (oVar) {
                if (oVar.f14556a) {
                    synchronized (oVar) {
                        boolean z11 = oVar.f14558c > 0;
                        oVar.f14558c = 0;
                        if (z11) {
                            oVar.a();
                        }
                    }
                }
            }
        }
    }
}
