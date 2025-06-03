package I4;

import M4.l;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    public final OutputStream f2565o;

    /* renamed from: p, reason: collision with root package name */
    public final l f2566p;

    /* renamed from: q, reason: collision with root package name */
    public G4.j f2567q;

    /* renamed from: r, reason: collision with root package name */
    public long f2568r = -1;

    public b(OutputStream outputStream, G4.j jVar, l lVar) {
        this.f2565o = outputStream;
        this.f2567q = jVar;
        this.f2566p = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j7 = this.f2568r;
        if (j7 != -1) {
            this.f2567q.v(j7);
        }
        this.f2567q.z(this.f2566p.c());
        try {
            this.f2565o.close();
        } catch (IOException e7) {
            this.f2567q.A(this.f2566p.c());
            j.d(this.f2567q);
            throw e7;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f2565o.flush();
        } catch (IOException e7) {
            this.f2567q.A(this.f2566p.c());
            j.d(this.f2567q);
            throw e7;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        try {
            this.f2565o.write(i7);
            long j7 = this.f2568r + 1;
            this.f2568r = j7;
            this.f2567q.v(j7);
        } catch (IOException e7) {
            this.f2567q.A(this.f2566p.c());
            j.d(this.f2567q);
            throw e7;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f2565o.write(bArr);
            long length = this.f2568r + bArr.length;
            this.f2568r = length;
            this.f2567q.v(length);
        } catch (IOException e7) {
            this.f2567q.A(this.f2566p.c());
            j.d(this.f2567q);
            throw e7;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        try {
            this.f2565o.write(bArr, i7, i8);
            long j7 = this.f2568r + i8;
            this.f2568r = j7;
            this.f2567q.v(j7);
        } catch (IOException e7) {
            this.f2567q.A(this.f2566p.c());
            j.d(this.f2567q);
            throw e7;
        }
    }
}
