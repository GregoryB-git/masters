package b9;

/* loaded from: classes.dex */
public final class h implements y8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2161a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2162b = false;

    /* renamed from: c, reason: collision with root package name */
    public y8.c f2163c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2164d;

    public h(e eVar) {
        this.f2164d = eVar;
    }

    @Override // y8.g
    public final y8.g f(String str) {
        if (this.f2161a) {
            throw new y8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2161a = true;
        this.f2164d.f(this.f2163c, str, this.f2162b);
        return this;
    }

    @Override // y8.g
    public final y8.g g(boolean z10) {
        if (this.f2161a) {
            throw new y8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2161a = true;
        this.f2164d.h(this.f2163c, z10 ? 1 : 0, this.f2162b);
        return this;
    }
}
