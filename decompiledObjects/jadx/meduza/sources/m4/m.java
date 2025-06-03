package m4;

import android.util.SparseArray;
import m4.d0;
import v5.q;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f10047a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10048b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10049c;

    /* renamed from: g, reason: collision with root package name */
    public long f10052g;

    /* renamed from: i, reason: collision with root package name */
    public String f10054i;

    /* renamed from: j, reason: collision with root package name */
    public c4.v f10055j;

    /* renamed from: k, reason: collision with root package name */
    public a f10056k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10057l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10059n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f10053h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final r f10050d = new r(7);

    /* renamed from: e, reason: collision with root package name */
    public final r f10051e = new r(8);
    public final r f = new r(6);

    /* renamed from: m, reason: collision with root package name */
    public long f10058m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final v5.u f10060o = new v5.u();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c4.v f10061a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10062b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10063c;
        public final v5.v f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f10066g;

        /* renamed from: h, reason: collision with root package name */
        public int f10067h;

        /* renamed from: i, reason: collision with root package name */
        public int f10068i;

        /* renamed from: j, reason: collision with root package name */
        public long f10069j;

        /* renamed from: l, reason: collision with root package name */
        public long f10071l;

        /* renamed from: p, reason: collision with root package name */
        public long f10075p;

        /* renamed from: q, reason: collision with root package name */
        public long f10076q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f10077r;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<q.c> f10064d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<q.b> f10065e = new SparseArray<>();

        /* renamed from: m, reason: collision with root package name */
        public C0147a f10072m = new C0147a();

        /* renamed from: n, reason: collision with root package name */
        public C0147a f10073n = new C0147a();

        /* renamed from: k, reason: collision with root package name */
        public boolean f10070k = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f10074o = false;

        /* renamed from: m4.m$a$a, reason: collision with other inner class name */
        public static final class C0147a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f10078a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f10079b;

            /* renamed from: c, reason: collision with root package name */
            public q.c f10080c;

            /* renamed from: d, reason: collision with root package name */
            public int f10081d;

            /* renamed from: e, reason: collision with root package name */
            public int f10082e;
            public int f;

            /* renamed from: g, reason: collision with root package name */
            public int f10083g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f10084h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f10085i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f10086j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f10087k;

            /* renamed from: l, reason: collision with root package name */
            public int f10088l;

            /* renamed from: m, reason: collision with root package name */
            public int f10089m;

            /* renamed from: n, reason: collision with root package name */
            public int f10090n;

            /* renamed from: o, reason: collision with root package name */
            public int f10091o;

            /* renamed from: p, reason: collision with root package name */
            public int f10092p;
        }

        public a(c4.v vVar, boolean z10, boolean z11) {
            this.f10061a = vVar;
            this.f10062b = z10;
            this.f10063c = z11;
            byte[] bArr = new byte[128];
            this.f10066g = bArr;
            this.f = new v5.v(bArr, 0, 0);
            C0147a c0147a = this.f10073n;
            c0147a.f10079b = false;
            c0147a.f10078a = false;
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f10047a = zVar;
        this.f10048b = z10;
        this.f10049c = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01cd, code lost:
    
        if (r5.f10086j == r7.f10086j) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d7, code lost:
    
        if (r13 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01eb, code lost:
    
        if (r5.f10090n == r7.f10090n) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fe, code lost:
    
        if (r5.f10092p == r7.f10092p) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020c, code lost:
    
        if (r5.f10088l == r7.f10088l) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0212, code lost:
    
        if (r5 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a5, code lost:
    
        if (r6 != 1) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ad  */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r27) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.m.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        this.f10052g = 0L;
        this.f10059n = false;
        this.f10058m = -9223372036854775807L;
        v5.q.a(this.f10053h);
        this.f10050d.c();
        this.f10051e.c();
        this.f.c();
        a aVar = this.f10056k;
        if (aVar != null) {
            aVar.f10070k = false;
            aVar.f10074o = false;
            a.C0147a c0147a = aVar.f10073n;
            c0147a.f10079b = false;
            c0147a.f10078a = false;
        }
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f10058m = j10;
        }
        this.f10059n = ((i10 & 2) != 0) | this.f10059n;
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f10054i = dVar.f9952e;
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 2);
        this.f10055j = r10;
        this.f10056k = new a(r10, this.f10048b, this.f10049c);
        this.f10047a.a(jVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.m.f(byte[], int, int):void");
    }
}
