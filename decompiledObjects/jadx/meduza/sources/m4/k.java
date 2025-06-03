package m4;

import java.util.Arrays;
import m4.d0;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f10003q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f10004a;

    /* renamed from: b, reason: collision with root package name */
    public c4.v f10005b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f10006c;

    /* renamed from: d, reason: collision with root package name */
    public final v5.u f10007d;

    /* renamed from: e, reason: collision with root package name */
    public final r f10008e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final a f10009g = new a();

    /* renamed from: h, reason: collision with root package name */
    public long f10010h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10011i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10012j;

    /* renamed from: k, reason: collision with root package name */
    public long f10013k;

    /* renamed from: l, reason: collision with root package name */
    public long f10014l;

    /* renamed from: m, reason: collision with root package name */
    public long f10015m;

    /* renamed from: n, reason: collision with root package name */
    public long f10016n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10017o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10018p;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f10019e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f10020a;

        /* renamed from: b, reason: collision with root package name */
        public int f10021b;

        /* renamed from: c, reason: collision with root package name */
        public int f10022c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f10023d = new byte[128];

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f10020a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f10023d;
                int length = bArr2.length;
                int i13 = this.f10021b;
                if (length < i13 + i12) {
                    this.f10023d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f10023d, this.f10021b, i12);
                this.f10021b += i12;
            }
        }
    }

    public k(e0 e0Var) {
        v5.u uVar;
        this.f10006c = e0Var;
        if (e0Var != null) {
            this.f10008e = new r(178);
            uVar = new v5.u();
        } else {
            uVar = null;
            this.f10008e = null;
        }
        this.f10007d = uVar;
        this.f10014l = -9223372036854775807L;
        this.f10016n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r25) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.k.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        v5.q.a(this.f);
        a aVar = this.f10009g;
        aVar.f10020a = false;
        aVar.f10021b = 0;
        aVar.f10022c = 0;
        r rVar = this.f10008e;
        if (rVar != null) {
            rVar.c();
        }
        this.f10010h = 0L;
        this.f10011i = false;
        this.f10014l = -9223372036854775807L;
        this.f10016n = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        this.f10014l = j10;
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f10004a = dVar.f9952e;
        dVar.b();
        this.f10005b = jVar.r(dVar.f9951d, 2);
        e0 e0Var = this.f10006c;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }
}
