package xc;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: a, reason: collision with root package name */
    public byte f17266a;

    /* renamed from: b, reason: collision with root package name */
    public final s f17267b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f17268c;

    /* renamed from: d, reason: collision with root package name */
    public final n f17269d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f17270e;

    public m(y yVar) {
        ec.i.e(yVar, "source");
        s sVar = new s(yVar);
        this.f17267b = sVar;
        Inflater inflater = new Inflater(true);
        this.f17268c = inflater;
        this.f17269d = new n(sVar, inflater);
        this.f17270e = new CRC32();
    }

    public static void f(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        ec.i.d(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // xc.y
    public final z c() {
        return this.f17267b.c();
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17269d.close();
    }

    @Override // xc.y
    public final long e0(f fVar, long j10) {
        long j11;
        ec.i.e(fVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f17266a == 0) {
            this.f17267b.u0(10L);
            byte I = this.f17267b.f17284b.I(3L);
            boolean z10 = ((I >> 1) & 1) == 1;
            if (z10) {
                g(0L, 10L, this.f17267b.f17284b);
            }
            f(8075, this.f17267b.readShort(), "ID1ID2");
            this.f17267b.skip(8L);
            if (((I >> 2) & 1) == 1) {
                this.f17267b.u0(2L);
                if (z10) {
                    g(0L, 2L, this.f17267b.f17284b);
                }
                int readShort = this.f17267b.f17284b.readShort() & 65535;
                long j12 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                this.f17267b.u0(j12);
                if (z10) {
                    j11 = j12;
                    g(0L, j12, this.f17267b.f17284b);
                } else {
                    j11 = j12;
                }
                this.f17267b.skip(j11);
            }
            if (((I >> 3) & 1) == 1) {
                long f = this.f17267b.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    g(0L, f + 1, this.f17267b.f17284b);
                }
                this.f17267b.skip(f + 1);
            }
            if (((I >> 4) & 1) == 1) {
                long f10 = this.f17267b.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f10 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    g(0L, f10 + 1, this.f17267b.f17284b);
                }
                this.f17267b.skip(f10 + 1);
            }
            if (z10) {
                s sVar = this.f17267b;
                sVar.u0(2L);
                int readShort2 = sVar.f17284b.readShort() & 65535;
                f((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) this.f17270e.getValue(), "FHCRC");
                this.f17270e.reset();
            }
            this.f17266a = (byte) 1;
        }
        if (this.f17266a == 1) {
            long j13 = fVar.f17252b;
            long e02 = this.f17269d.e0(fVar, j10);
            if (e02 != -1) {
                g(j13, e02, fVar);
                return e02;
            }
            this.f17266a = (byte) 2;
        }
        if (this.f17266a == 2) {
            f(this.f17267b.C(), (int) this.f17270e.getValue(), "CRC");
            f(this.f17267b.C(), (int) this.f17268c.getBytesWritten(), "ISIZE");
            this.f17266a = (byte) 3;
            if (!this.f17267b.v()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void g(long j10, long j11, f fVar) {
        t tVar = fVar.f17251a;
        while (true) {
            ec.i.b(tVar);
            int i10 = tVar.f17288c;
            int i11 = tVar.f17287b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            tVar = tVar.f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(tVar.f17288c - r5, j11);
            this.f17270e.update(tVar.f17286a, (int) (tVar.f17287b + j10), min);
            j11 -= min;
            tVar = tVar.f;
            ec.i.b(tVar);
            j10 = 0;
        }
    }
}
