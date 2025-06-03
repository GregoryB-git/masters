package t5;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final k f14533a;

    /* renamed from: b, reason: collision with root package name */
    public final n f14534b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14536d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14537e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14535c = new byte[1];

    public m(k kVar, n nVar) {
        this.f14533a = kVar;
        this.f14534b = nVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14537e) {
            return;
        }
        this.f14533a.close();
        this.f14537e = true;
    }

    public final void f() {
        if (this.f14536d) {
            return;
        }
        this.f14533a.a(this.f14534b);
        this.f14536d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f14535c) == -1) {
            return -1;
        }
        return this.f14535c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        x6.b.H(!this.f14537e);
        f();
        int read = this.f14533a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
