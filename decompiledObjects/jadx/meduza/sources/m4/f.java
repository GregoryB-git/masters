package m4;

import java.util.Arrays;
import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f9966v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9967a;

    /* renamed from: d, reason: collision with root package name */
    public final String f9970d;

    /* renamed from: e, reason: collision with root package name */
    public String f9971e;
    public c4.v f;

    /* renamed from: g, reason: collision with root package name */
    public c4.v f9972g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9977l;

    /* renamed from: o, reason: collision with root package name */
    public int f9980o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9981p;

    /* renamed from: r, reason: collision with root package name */
    public int f9983r;
    public c4.v t;

    /* renamed from: u, reason: collision with root package name */
    public long f9985u;

    /* renamed from: b, reason: collision with root package name */
    public final v5.t f9968b = new v5.t(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final v5.u f9969c = new v5.u(Arrays.copyOf(f9966v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f9973h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f9974i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f9975j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f9978m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f9979n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f9982q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f9984s = -9223372036854775807L;

    public f(String str, boolean z10) {
        this.f9967a = z10;
        this.f9970d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0290, code lost:
    
        if (r11[r15] != 51) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0273, code lost:
    
        if (((r5 & 8) >> 3) == r9) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0297 A[SYNTHETIC] */
    @Override // m4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v5.u r23) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f.a(v5.u):void");
    }

    @Override // m4.j
    public final void b() {
        this.f9984s = -9223372036854775807L;
        this.f9977l = false;
        this.f9973h = 0;
        this.f9974i = 0;
        this.f9975j = 256;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f9984s = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f9971e = dVar.f9952e;
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 1);
        this.f = r10;
        this.t = r10;
        if (!this.f9967a) {
            this.f9972g = new c4.g();
            return;
        }
        dVar.a();
        dVar.b();
        c4.v r11 = jVar.r(dVar.f9951d, 5);
        this.f9972g = r11;
        i0.a aVar = new i0.a();
        dVar.b();
        aVar.f15463a = dVar.f9952e;
        aVar.f15472k = "application/id3";
        r11.d(new i0(aVar));
    }

    public final boolean f(int i10, v5.u uVar, byte[] bArr) {
        int min = Math.min(uVar.f15976c - uVar.f15975b, i10 - this.f9974i);
        uVar.d(bArr, this.f9974i, min);
        int i11 = this.f9974i + min;
        this.f9974i = i11;
        return i11 == i10;
    }
}
