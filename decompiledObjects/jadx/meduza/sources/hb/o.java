package hb;

import gb.s3;

/* loaded from: classes.dex */
public final class o implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public final xc.f f7333a;

    /* renamed from: b, reason: collision with root package name */
    public int f7334b;

    /* renamed from: c, reason: collision with root package name */
    public int f7335c;

    public o(xc.f fVar, int i10) {
        this.f7333a = fVar;
        this.f7334b = i10;
    }

    @Override // gb.s3
    public final int a() {
        return this.f7334b;
    }

    @Override // gb.s3
    public final int b() {
        return this.f7335c;
    }

    @Override // gb.s3
    public final void c(byte b10) {
        this.f7333a.B0(b10);
        this.f7334b--;
        this.f7335c++;
    }

    @Override // gb.s3
    public final void release() {
    }

    @Override // gb.s3
    public final void write(byte[] bArr, int i10, int i11) {
        this.f7333a.write(bArr, i10, i11);
        this.f7334b -= i11;
        this.f7335c += i11;
    }
}
