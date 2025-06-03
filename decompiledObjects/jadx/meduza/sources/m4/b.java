package m4;

import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v5.t f9885a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f9886b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9887c;

    /* renamed from: d, reason: collision with root package name */
    public String f9888d;

    /* renamed from: e, reason: collision with root package name */
    public c4.v f9889e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f9890g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9891h;

    /* renamed from: i, reason: collision with root package name */
    public long f9892i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f9893j;

    /* renamed from: k, reason: collision with root package name */
    public int f9894k;

    /* renamed from: l, reason: collision with root package name */
    public long f9895l;

    public b(String str) {
        v5.t tVar = new v5.t(new byte[128], 128);
        this.f9885a = tVar;
        this.f9886b = new v5.u(tVar.f15968a);
        this.f = 0;
        this.f9895l = -9223372036854775807L;
        this.f9887c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x037d, code lost:
    
        if (r26.v() == 11) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x038f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x038d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x038b, code lost:
    
        if (r2 == 11) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r26) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        this.f = 0;
        this.f9890g = 0;
        this.f9891h = false;
        this.f9895l = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f9895l = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f9888d = dVar.f9952e;
        dVar.b();
        this.f9889e = jVar.r(dVar.f9951d, 1);
    }
}
