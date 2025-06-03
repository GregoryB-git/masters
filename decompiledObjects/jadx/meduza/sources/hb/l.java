package hb;

import gb.u2;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import xc.t;
import xc.u;

/* loaded from: classes.dex */
public final class l extends gb.b {

    /* renamed from: a, reason: collision with root package name */
    public final xc.f f7331a;

    public l(xc.f fVar) {
        this.f7331a = fVar;
    }

    @Override // gb.u2
    public final void U(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f7331a.read(bArr, i10, i11);
            if (read == -1) {
                throw new IndexOutOfBoundsException(a0.j.h("EOF trying to read ", i11, " bytes"));
            }
            i11 -= read;
            i10 += read;
        }
    }

    @Override // gb.u2
    public final int b() {
        return (int) this.f7331a.f17252b;
    }

    @Override // gb.b, gb.u2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7331a.f();
    }

    @Override // gb.u2
    public final void m0(OutputStream outputStream, int i10) {
        xc.f fVar = this.f7331a;
        long j10 = i10;
        fVar.getClass();
        ec.i.e(outputStream, "out");
        xc.b.b(fVar.f17252b, 0L, j10);
        t tVar = fVar.f17251a;
        while (j10 > 0) {
            ec.i.b(tVar);
            int min = (int) Math.min(j10, tVar.f17288c - tVar.f17287b);
            outputStream.write(tVar.f17286a, tVar.f17287b, min);
            int i11 = tVar.f17287b + min;
            tVar.f17287b = i11;
            long j11 = min;
            fVar.f17252b -= j11;
            j10 -= j11;
            if (i11 == tVar.f17288c) {
                t a10 = tVar.a();
                fVar.f17251a = a10;
                u.a(tVar);
                tVar = a10;
            }
        }
    }

    @Override // gb.u2
    public final u2 r(int i10) {
        xc.f fVar = new xc.f();
        fVar.g0(this.f7331a, i10);
        return new l(fVar);
    }

    @Override // gb.u2
    public final int readUnsignedByte() {
        try {
            return this.f7331a.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // gb.u2
    public final void skipBytes(int i10) {
        try {
            this.f7331a.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // gb.u2
    public final void v0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }
}
