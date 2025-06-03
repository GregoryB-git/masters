package i0;

import g0.AbstractC1297a;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    public final g f14646o;

    /* renamed from: p, reason: collision with root package name */
    public final k f14647p;

    /* renamed from: t, reason: collision with root package name */
    public long f14651t;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14649r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14650s = false;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f14648q = new byte[1];

    public i(g gVar, k kVar) {
        this.f14646o = gVar;
        this.f14647p = kVar;
    }

    public final void a() {
        if (this.f14649r) {
            return;
        }
        this.f14646o.e(this.f14647p);
        this.f14649r = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14650s) {
            return;
        }
        this.f14646o.close();
        this.f14650s = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f14648q) == -1) {
            return -1;
        }
        return this.f14648q[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        AbstractC1297a.f(!this.f14650s);
        a();
        int read = this.f14646o.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f14651t += read;
        return read;
    }
}
