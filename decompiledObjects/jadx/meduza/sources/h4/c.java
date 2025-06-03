package h4;

import c4.i;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f7085a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7086b;

    public c(i iVar, long j10) {
        this.f7085a = iVar;
        x6.b.q(iVar.getPosition() >= j10);
        this.f7086b = j10;
    }

    @Override // c4.i
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f7085a.b(bArr, i10, i11, z10);
    }

    @Override // c4.i
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f7085a.c(bArr, i10, i11, z10);
    }

    @Override // c4.i
    public final long d() {
        return this.f7085a.d() - this.f7086b;
    }

    @Override // c4.i
    public final void e(int i10) {
        this.f7085a.e(i10);
    }

    @Override // c4.i
    public final int g(byte[] bArr, int i10, int i11) {
        return this.f7085a.g(bArr, i10, i11);
    }

    @Override // c4.i
    public final long getLength() {
        return this.f7085a.getLength() - this.f7086b;
    }

    @Override // c4.i
    public final long getPosition() {
        return this.f7085a.getPosition() - this.f7086b;
    }

    @Override // c4.i
    public final void i() {
        this.f7085a.i();
    }

    @Override // c4.i
    public final void j(int i10) {
        this.f7085a.j(i10);
    }

    @Override // c4.i
    public final boolean k(int i10, boolean z10) {
        return this.f7085a.k(i10, z10);
    }

    @Override // c4.i
    public final void m(byte[] bArr, int i10, int i11) {
        this.f7085a.m(bArr, i10, i11);
    }

    @Override // c4.i
    public final int n() {
        return this.f7085a.n();
    }

    @Override // c4.i, t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f7085a.read(bArr, i10, i11);
    }

    @Override // c4.i
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f7085a.readFully(bArr, i10, i11);
    }
}
