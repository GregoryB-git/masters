package xc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final y f17283a;

    /* renamed from: b, reason: collision with root package name */
    public final f f17284b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17285c;

    public s(y yVar) {
        ec.i.e(yVar, "source");
        this.f17283a = yVar;
        this.f17284b = new f();
    }

    public final int C() {
        u0(4L);
        int readInt = this.f17284b.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // xc.h
    public final String E(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long f = f((byte) 10, 0L, j11);
        if (f != -1) {
            return yc.a.a(this.f17284b, f);
        }
        if (j11 < Long.MAX_VALUE && H(j11) && this.f17284b.I(j11 - 1) == 13 && H(1 + j11) && this.f17284b.I(j11) == 10) {
            return yc.a.a(this.f17284b, j11);
        }
        f fVar = new f();
        f fVar2 = this.f17284b;
        fVar2.H(0L, Math.min(32, fVar2.f17252b), fVar);
        StringBuilder l10 = defpackage.f.l("\\n not found: limit=");
        l10.append(Math.min(this.f17284b.f17252b, j10));
        l10.append(" content=");
        l10.append(fVar.c0().l());
        l10.append((char) 8230);
        throw new EOFException(l10.toString());
    }

    public final boolean H(long j10) {
        f fVar;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f17285c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            fVar = this.f17284b;
            if (fVar.f17252b >= j10) {
                return true;
            }
        } while (this.f17283a.e0(fVar, 8192L) != -1);
        return false;
    }

    @Override // xc.h
    public final boolean K(i iVar) {
        ec.i.e(iVar, "bytes");
        byte[] bArr = iVar.f17260a;
        int length = bArr.length;
        if (!(!this.f17285c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (length >= 0 && bArr.length - 0 >= length) {
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = i10 + 0;
                if (H(1 + j10)) {
                    if (this.f17284b.I(j10) == iVar.f17260a[0 + i10]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xc.h
    public final String S(Charset charset) {
        ec.i.e(charset, "charset");
        this.f17284b.A0(this.f17283a);
        return this.f17284b.S(charset);
    }

    @Override // xc.y
    public final z c() {
        return this.f17283a.c();
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17285c) {
            return;
        }
        this.f17285c = true;
        this.f17283a.close();
        this.f17284b.f();
    }

    @Override // xc.y
    public final long e0(f fVar, long j10) {
        ec.i.e(fVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f17285c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar2 = this.f17284b;
        if (fVar2.f17252b == 0 && this.f17283a.e0(fVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f17284b.e0(fVar, Math.min(j10, this.f17284b.f17252b));
    }

    public final long f(byte b10, long j10, long j11) {
        if (!(!this.f17285c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j12 = 0;
        if (!(0 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j11).toString());
        }
        while (j12 < j11) {
            long M = this.f17284b.M(b10, j12, j11);
            if (M != -1) {
                return M;
            }
            f fVar = this.f17284b;
            long j13 = fVar.f17252b;
            if (j13 >= j11 || this.f17283a.e0(fVar, 8192L) == -1) {
                return -1L;
            }
            j12 = Math.max(j12, j13);
        }
        return -1L;
    }

    @Override // xc.h
    public final String f0() {
        return E(Long.MAX_VALUE);
    }

    public final void g(byte[] bArr) {
        ec.i.e(bArr, "sink");
        try {
            u0(bArr.length);
            this.f17284b.h0(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                f fVar = this.f17284b;
                long j10 = fVar.f17252b;
                if (j10 <= 0) {
                    throw e10;
                }
                int read = fVar.read(bArr, i10, (int) j10);
                if (read == -1) {
                    throw new AssertionError();
                }
                i10 += read;
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17285c;
    }

    @Override // xc.h
    public final i l(long j10) {
        u0(j10);
        return this.f17284b.l(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ec.i.e(byteBuffer, "sink");
        f fVar = this.f17284b;
        if (fVar.f17252b == 0 && this.f17283a.e0(fVar, 8192L) == -1) {
            return -1;
        }
        return this.f17284b.read(byteBuffer);
    }

    @Override // xc.h
    public final byte readByte() {
        u0(1L);
        return this.f17284b.readByte();
    }

    @Override // xc.h
    public final int readInt() {
        u0(4L);
        return this.f17284b.readInt();
    }

    @Override // xc.h
    public final short readShort() {
        u0(2L);
        return this.f17284b.readShort();
    }

    @Override // xc.h
    public final void skip(long j10) {
        if (!(!this.f17285c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            f fVar = this.f17284b;
            if (fVar.f17252b == 0 && this.f17283a.e0(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f17284b.f17252b);
            this.f17284b.skip(min);
            j10 -= min;
        }
    }

    @Override // xc.h
    public final f t() {
        return this.f17284b;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("buffer(");
        l10.append(this.f17283a);
        l10.append(')');
        return l10.toString();
    }

    @Override // xc.h
    public final void u0(long j10) {
        if (!H(j10)) {
            throw new EOFException();
        }
    }

    @Override // xc.h
    public final boolean v() {
        if (!this.f17285c) {
            return this.f17284b.v() && this.f17283a.e0(this.f17284b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        p2.m0.q(16);
        p2.m0.q(16);
        r2 = java.lang.Integer.toString(r2, 16);
        ec.i.d(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // xc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x0() {
        /*
            r5 = this;
            r0 = 1
            r5.u0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.H(r2)
            if (r2 == 0) goto L5c
            xc.f r2 = r5.f17284b
            long r3 = (long) r0
            byte r2 = r2.I(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5c
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            p2.m0.q(r3)
            p2.m0.q(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            ec.i.d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            xc.f r0 = r5.f17284b
            long r0 = r0.x0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.s.x0():long");
    }
}
