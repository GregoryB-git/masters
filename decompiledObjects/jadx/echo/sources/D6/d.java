package D6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1497a;

    /* renamed from: b, reason: collision with root package name */
    public int f1498b;

    /* renamed from: c, reason: collision with root package name */
    public int f1499c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1500d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1501e;

    /* renamed from: f, reason: collision with root package name */
    public d f1502f;

    /* renamed from: g, reason: collision with root package name */
    public d f1503g;

    public d() {
        this.f1497a = new byte[8192];
        this.f1501e = true;
        this.f1500d = false;
    }

    public final d a() {
        d dVar = this.f1502f;
        d dVar2 = dVar != this ? dVar : null;
        d dVar3 = this.f1503g;
        dVar3.f1502f = dVar;
        this.f1502f.f1503g = dVar3;
        this.f1502f = null;
        this.f1503g = null;
        return dVar2;
    }

    public final d b(d dVar) {
        dVar.f1503g = this;
        dVar.f1502f = this.f1502f;
        this.f1502f.f1503g = dVar;
        this.f1502f = dVar;
        return dVar;
    }

    public final d c() {
        this.f1500d = true;
        return new d(this.f1497a, this.f1498b, this.f1499c, true, false);
    }

    public d(byte[] bArr, int i7, int i8, boolean z7, boolean z8) {
        this.f1497a = bArr;
        this.f1498b = i7;
        this.f1499c = i8;
        this.f1500d = z7;
        this.f1501e = z8;
    }
}
