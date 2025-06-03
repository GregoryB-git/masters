package m4;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class w implements c4.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f10185e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10186g;

    /* renamed from: h, reason: collision with root package name */
    public long f10187h;

    /* renamed from: i, reason: collision with root package name */
    public u f10188i;

    /* renamed from: j, reason: collision with root package name */
    public c4.j f10189j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10190k;

    /* renamed from: a, reason: collision with root package name */
    public final v5.c0 f10181a = new v5.c0(0);

    /* renamed from: c, reason: collision with root package name */
    public final v5.u f10183c = new v5.u(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f10182b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public final v f10184d = new v();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f10191a;

        /* renamed from: b, reason: collision with root package name */
        public final v5.c0 f10192b;

        /* renamed from: c, reason: collision with root package name */
        public final v5.t f10193c = new v5.t(new byte[64], 64);

        /* renamed from: d, reason: collision with root package name */
        public boolean f10194d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f10195e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public long f10196g;

        public a(j jVar, v5.c0 c0Var) {
            this.f10191a = jVar;
            this.f10192b = c0Var;
        }
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f10189j = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0214  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r16, c4.s r17) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.w.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        long j12;
        v5.c0 c0Var = this.f10181a;
        synchronized (c0Var) {
            j12 = c0Var.f15874b;
        }
        boolean z10 = j12 == -9223372036854775807L;
        if (!z10) {
            long c10 = this.f10181a.c();
            z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
        }
        if (z10) {
            this.f10181a.d(j11);
        }
        u uVar = this.f10188i;
        if (uVar != null) {
            uVar.c(j11);
        }
        for (int i10 = 0; i10 < this.f10182b.size(); i10++) {
            a valueAt = this.f10182b.valueAt(i10);
            valueAt.f = false;
            valueAt.f10191a.b();
        }
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        byte[] bArr = new byte[14];
        c4.e eVar = (c4.e) iVar;
        eVar.c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        eVar.k(bArr[13] & 7, false);
        eVar.c(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // c4.h
    public final void release() {
    }
}
