package m4;

import java.util.Arrays;
import m4.d0;

/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f10024l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final e0 f10025a;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public long f10030g;

    /* renamed from: h, reason: collision with root package name */
    public String f10031h;

    /* renamed from: i, reason: collision with root package name */
    public c4.v f10032i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10033j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f10027c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final a f10028d = new a();

    /* renamed from: k, reason: collision with root package name */
    public long f10034k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final r f10029e = new r(178);

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f10026b = new v5.u();

    public static final class a {
        public static final byte[] f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f10035a;

        /* renamed from: b, reason: collision with root package name */
        public int f10036b;

        /* renamed from: c, reason: collision with root package name */
        public int f10037c;

        /* renamed from: d, reason: collision with root package name */
        public int f10038d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f10039e = new byte[128];

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f10035a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f10039e;
                int length = bArr2.length;
                int i13 = this.f10037c;
                if (length < i13 + i12) {
                    this.f10039e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f10039e, this.f10037c, i12);
                this.f10037c += i12;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c4.v f10040a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10041b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10042c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10043d;

        /* renamed from: e, reason: collision with root package name */
        public int f10044e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public long f10045g;

        /* renamed from: h, reason: collision with root package name */
        public long f10046h;

        public b(c4.v vVar) {
            this.f10040a = vVar;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f10042c) {
                int i12 = this.f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f = (i11 - i10) + i12;
                } else {
                    this.f10043d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f10042c = false;
                }
            }
        }
    }

    public l(e0 e0Var) {
        this.f10025a = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026f  */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r20) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.l.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        v5.q.a(this.f10027c);
        a aVar = this.f10028d;
        aVar.f10035a = false;
        aVar.f10037c = 0;
        aVar.f10036b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.f10041b = false;
            bVar.f10042c = false;
            bVar.f10043d = false;
            bVar.f10044e = -1;
        }
        r rVar = this.f10029e;
        if (rVar != null) {
            rVar.c();
        }
        this.f10030g = 0L;
        this.f10034k = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f10034k = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f10031h = dVar.f9952e;
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 2);
        this.f10032i = r10;
        this.f = new b(r10);
        e0 e0Var = this.f10025a;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }
}
