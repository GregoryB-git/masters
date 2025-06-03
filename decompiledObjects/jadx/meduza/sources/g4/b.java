package g4;

import c4.h;
import c4.i;
import c4.j;
import v5.u;

/* loaded from: classes.dex */
public final class b implements h {
    public j f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5826h;

    /* renamed from: i, reason: collision with root package name */
    public long f5827i;

    /* renamed from: j, reason: collision with root package name */
    public int f5828j;

    /* renamed from: k, reason: collision with root package name */
    public int f5829k;

    /* renamed from: l, reason: collision with root package name */
    public int f5830l;

    /* renamed from: m, reason: collision with root package name */
    public long f5831m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5832n;

    /* renamed from: o, reason: collision with root package name */
    public a f5833o;

    /* renamed from: p, reason: collision with root package name */
    public e f5834p;

    /* renamed from: a, reason: collision with root package name */
    public final u f5820a = new u(4);

    /* renamed from: b, reason: collision with root package name */
    public final u f5821b = new u(9);

    /* renamed from: c, reason: collision with root package name */
    public final u f5822c = new u(11);

    /* renamed from: d, reason: collision with root package name */
    public final u f5823d = new u();

    /* renamed from: e, reason: collision with root package name */
    public final c f5824e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f5825g = 1;

    public final u a(i iVar) {
        int i10 = this.f5830l;
        u uVar = this.f5823d;
        byte[] bArr = uVar.f15974a;
        if (i10 > bArr.length) {
            uVar.E(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            uVar.G(0);
        }
        this.f5823d.F(this.f5830l);
        iVar.readFully(this.f5823d.f15974a, 0, this.f5830l);
        return this.f5823d;
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0009 A[SYNTHETIC] */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r17, c4.s r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.b.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f5825g = 1;
            this.f5826h = false;
        } else {
            this.f5825g = 3;
        }
        this.f5828j = 0;
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        c4.e eVar = (c4.e) iVar;
        eVar.c(this.f5820a.f15974a, 0, 3, false);
        this.f5820a.G(0);
        if (this.f5820a.x() != 4607062) {
            return false;
        }
        eVar.c(this.f5820a.f15974a, 0, 2, false);
        this.f5820a.G(0);
        if ((this.f5820a.A() & 250) != 0) {
            return false;
        }
        eVar.c(this.f5820a.f15974a, 0, 4, false);
        this.f5820a.G(0);
        int f = this.f5820a.f();
        eVar.f = 0;
        eVar.k(f, false);
        eVar.c(this.f5820a.f15974a, 0, 4, false);
        this.f5820a.G(0);
        return this.f5820a.f() == 0;
    }

    @Override // c4.h
    public final void release() {
    }
}
