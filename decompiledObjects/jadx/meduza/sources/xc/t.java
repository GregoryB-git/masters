package xc;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17286a;

    /* renamed from: b, reason: collision with root package name */
    public int f17287b;

    /* renamed from: c, reason: collision with root package name */
    public int f17288c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17289d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17290e;
    public t f;

    /* renamed from: g, reason: collision with root package name */
    public t f17291g;

    public t() {
        this.f17286a = new byte[8192];
        this.f17290e = true;
        this.f17289d = false;
    }

    public t(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        ec.i.e(bArr, "data");
        this.f17286a = bArr;
        this.f17287b = i10;
        this.f17288c = i11;
        this.f17289d = z10;
        this.f17290e = z11;
    }

    public final t a() {
        t tVar = this.f;
        if (tVar == this) {
            tVar = null;
        }
        t tVar2 = this.f17291g;
        ec.i.b(tVar2);
        tVar2.f = this.f;
        t tVar3 = this.f;
        ec.i.b(tVar3);
        tVar3.f17291g = this.f17291g;
        this.f = null;
        this.f17291g = null;
        return tVar;
    }

    public final void b(t tVar) {
        tVar.f17291g = this;
        tVar.f = this.f;
        t tVar2 = this.f;
        ec.i.b(tVar2);
        tVar2.f17291g = tVar;
        this.f = tVar;
    }

    public final t c() {
        this.f17289d = true;
        return new t(this.f17286a, this.f17287b, this.f17288c, true, false);
    }

    public final void d(t tVar, int i10) {
        if (!tVar.f17290e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = tVar.f17288c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (tVar.f17289d) {
                throw new IllegalArgumentException();
            }
            int i13 = tVar.f17287b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = tVar.f17286a;
            sb.j.k(bArr, 0, bArr, i13, i11);
            tVar.f17288c -= tVar.f17287b;
            tVar.f17287b = 0;
        }
        byte[] bArr2 = this.f17286a;
        byte[] bArr3 = tVar.f17286a;
        int i14 = tVar.f17288c;
        int i15 = this.f17287b;
        sb.j.k(bArr2, i14, bArr3, i15, i15 + i10);
        tVar.f17288c += i10;
        this.f17287b += i10;
    }
}
