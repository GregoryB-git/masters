package xc;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w f17280a;

    /* renamed from: b, reason: collision with root package name */
    public final f f17281b = new f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17282c;

    public r(w wVar) {
        this.f17280a = wVar;
    }

    @Override // xc.g
    public final g D() {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        long g10 = this.f17281b.g();
        if (g10 > 0) {
            this.f17280a.g0(this.f17281b, g10);
        }
        return this;
    }

    @Override // xc.g
    public final g O(String str) {
        ec.i.e(str, "string");
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.H0(str);
        D();
        return this;
    }

    @Override // xc.g
    public final g Y(long j10) {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.C0(j10);
        D();
        return this;
    }

    @Override // xc.w
    public final z c() {
        return this.f17280a.c();
    }

    @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17282c) {
            return;
        }
        Throwable th = null;
        try {
            f fVar = this.f17281b;
            long j10 = fVar.f17252b;
            if (j10 > 0) {
                this.f17280a.g0(fVar, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f17280a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f17282c = true;
        if (th != null) {
            throw th;
        }
    }

    public final g f() {
        ec.i.e(null, "byteString");
        throw null;
    }

    @Override // xc.g, xc.w, java.io.Flushable
    public final void flush() {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f17281b;
        long j10 = fVar.f17252b;
        if (j10 > 0) {
            this.f17280a.g0(fVar, j10);
        }
        this.f17280a.flush();
    }

    public final g g(byte[] bArr, int i10, int i11) {
        ec.i.e(bArr, "source");
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.write(bArr, i10, i11);
        D();
        return this;
    }

    @Override // xc.w
    public final void g0(f fVar, long j10) {
        ec.i.e(fVar, "source");
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.g0(fVar, j10);
        D();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17282c;
    }

    @Override // xc.g
    public final f k() {
        return this.f17281b;
    }

    @Override // xc.g
    public final g o() {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f17281b;
        long j10 = fVar.f17252b;
        if (j10 > 0) {
            this.f17280a.g0(fVar, j10);
        }
        return this;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("buffer(");
        l10.append(this.f17280a);
        l10.append(')');
        return l10.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ec.i.e(byteBuffer, "source");
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f17281b.write(byteBuffer);
        D();
        return write;
    }

    @Override // xc.g
    public final g write(byte[] bArr) {
        ec.i.e(bArr, "source");
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.m5write(bArr);
        D();
        return this;
    }

    @Override // xc.g
    public final g writeByte(int i10) {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.B0(i10);
        D();
        return this;
    }

    @Override // xc.g
    public final g writeInt(int i10) {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.D0(i10);
        D();
        return this;
    }

    @Override // xc.g
    public final g writeShort(int i10) {
        if (!(!this.f17282c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f17281b.F0(i10);
        D();
        return this;
    }
}
