package I4;

import M4.l;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    public final InputStream f2559o;

    /* renamed from: p, reason: collision with root package name */
    public final G4.j f2560p;

    /* renamed from: q, reason: collision with root package name */
    public final l f2561q;

    /* renamed from: s, reason: collision with root package name */
    public long f2563s;

    /* renamed from: r, reason: collision with root package name */
    public long f2562r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f2564t = -1;

    public a(InputStream inputStream, G4.j jVar, l lVar) {
        this.f2561q = lVar;
        this.f2559o = inputStream;
        this.f2560p = jVar;
        this.f2563s = jVar.j();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f2559o.available();
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long c7 = this.f2561q.c();
        if (this.f2564t == -1) {
            this.f2564t = c7;
        }
        try {
            this.f2559o.close();
            long j7 = this.f2562r;
            if (j7 != -1) {
                this.f2560p.y(j7);
            }
            long j8 = this.f2563s;
            if (j8 != -1) {
                this.f2560p.B(j8);
            }
            this.f2560p.A(this.f2564t);
            this.f2560p.g();
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f2559o.mark(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f2559o.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f2559o.read();
            long c7 = this.f2561q.c();
            if (this.f2563s == -1) {
                this.f2563s = c7;
            }
            if (read == -1 && this.f2564t == -1) {
                this.f2564t = c7;
                this.f2560p.A(c7);
                this.f2560p.g();
            } else {
                long j7 = this.f2562r + 1;
                this.f2562r = j7;
                this.f2560p.y(j7);
            }
            return read;
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f2559o.reset();
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        try {
            long skip = this.f2559o.skip(j7);
            long c7 = this.f2561q.c();
            if (this.f2563s == -1) {
                this.f2563s = c7;
            }
            if (skip == -1 && this.f2564t == -1) {
                this.f2564t = c7;
                this.f2560p.A(c7);
            } else {
                long j8 = this.f2562r + skip;
                this.f2562r = j8;
                this.f2560p.y(j8);
            }
            return skip;
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f2559o.read(bArr);
            long c7 = this.f2561q.c();
            if (this.f2563s == -1) {
                this.f2563s = c7;
            }
            if (read == -1 && this.f2564t == -1) {
                this.f2564t = c7;
                this.f2560p.A(c7);
                this.f2560p.g();
            } else {
                long j7 = this.f2562r + read;
                this.f2562r = j7;
                this.f2560p.y(j7);
            }
            return read;
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        try {
            int read = this.f2559o.read(bArr, i7, i8);
            long c7 = this.f2561q.c();
            if (this.f2563s == -1) {
                this.f2563s = c7;
            }
            if (read == -1 && this.f2564t == -1) {
                this.f2564t = c7;
                this.f2560p.A(c7);
                this.f2560p.g();
            } else {
                long j7 = this.f2562r + read;
                this.f2562r = j7;
                this.f2560p.y(j7);
            }
            return read;
        } catch (IOException e7) {
            this.f2560p.A(this.f2561q.c());
            j.d(this.f2560p);
            throw e7;
        }
    }
}
