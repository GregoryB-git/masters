package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import xc.f;
import xc.g;
import xc.i;

/* loaded from: classes.dex */
final class Http2Writer implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f12629o = Logger.getLogger(Http2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final g f12630a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12631b;

    /* renamed from: c, reason: collision with root package name */
    public final f f12632c;

    /* renamed from: d, reason: collision with root package name */
    public int f12633d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12634e;
    public final Hpack.Writer f;

    public Http2Writer(g gVar, boolean z10) {
        this.f12630a = gVar;
        this.f12631b = z10;
        f fVar = new f();
        this.f12632c = fVar;
        this.f = new Hpack.Writer(fVar);
        this.f12633d = 16384;
    }

    public final synchronized void C(int i10, ErrorCode errorCode, byte[] bArr) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        if (errorCode.f12504a == -1) {
            i iVar = Http2.f12530a;
            throw new IllegalArgumentException(Util.l("errorCode.httpCode == -1", new Object[0]));
        }
        g(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f12630a.writeInt(i10);
        this.f12630a.writeInt(errorCode.f12504a);
        if (bArr.length > 0) {
            this.f12630a.write(bArr);
        }
        this.f12630a.flush();
    }

    public final void H(int i10, ArrayList arrayList, boolean z10) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        this.f.d(arrayList);
        long j10 = this.f12632c.f17252b;
        int min = (int) Math.min(this.f12633d, j10);
        long j11 = min;
        byte b10 = j10 == j11 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        g(i10, min, (byte) 1, b10);
        this.f12630a.g0(this.f12632c, j11);
        if (j10 > j11) {
            M(i10, j10 - j11);
        }
    }

    public final synchronized void I(int i10, ErrorCode errorCode) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        if (errorCode.f12504a == -1) {
            throw new IllegalArgumentException();
        }
        g(i10, 4, (byte) 3, (byte) 0);
        this.f12630a.writeInt(errorCode.f12504a);
        this.f12630a.flush();
    }

    public final void M(int i10, long j10) {
        while (j10 > 0) {
            int min = (int) Math.min(this.f12633d, j10);
            long j11 = min;
            j10 -= j11;
            g(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f12630a.g0(this.f12632c, j11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f12634e = true;
        this.f12630a.close();
    }

    public final synchronized void d(int i10, long j10) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            Object[] objArr = {Long.valueOf(j10)};
            i iVar = Http2.f12530a;
            throw new IllegalArgumentException(Util.l("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        }
        g(i10, 4, (byte) 8, (byte) 0);
        this.f12630a.writeInt((int) j10);
        this.f12630a.flush();
    }

    public final synchronized void e(int i10, int i11, boolean z10) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        g(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f12630a.writeInt(i10);
        this.f12630a.writeInt(i11);
        this.f12630a.flush();
    }

    public final synchronized void f(Settings settings) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        int i10 = this.f12633d;
        int i11 = settings.f12643a;
        if ((i11 & 32) != 0) {
            i10 = settings.f12644b[5];
        }
        this.f12633d = i10;
        if (((i11 & 2) != 0 ? settings.f12644b[1] : -1) != -1) {
            Hpack.Writer writer = this.f;
            int i12 = (i11 & 2) != 0 ? settings.f12644b[1] : -1;
            writer.getClass();
            int min = Math.min(i12, 16384);
            int i13 = writer.f12526e;
            if (i13 != min) {
                if (min < i13) {
                    writer.f12524c = Math.min(writer.f12524c, min);
                }
                writer.f12525d = true;
                writer.f12526e = min;
                int i14 = writer.f12529i;
                if (min < i14) {
                    if (min == 0) {
                        Arrays.fill(writer.f, (Object) null);
                        writer.f12527g = writer.f.length - 1;
                        writer.f12528h = 0;
                        writer.f12529i = 0;
                    } else {
                        writer.a(i14 - min);
                    }
                }
            }
        }
        g(0, 0, (byte) 4, (byte) 1);
        this.f12630a.flush();
    }

    public final void g(int i10, int i11, byte b10, byte b11) {
        Logger logger = f12629o;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f12633d;
        if (i11 > i12) {
            Object[] objArr = {Integer.valueOf(i12), Integer.valueOf(i11)};
            i iVar = Http2.f12530a;
            throw new IllegalArgumentException(Util.l("FRAME_SIZE_ERROR length > %d: %d", objArr));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            Object[] objArr2 = {Integer.valueOf(i10)};
            i iVar2 = Http2.f12530a;
            throw new IllegalArgumentException(Util.l("reserved bit set: %s", objArr2));
        }
        g gVar = this.f12630a;
        gVar.writeByte((i11 >>> 16) & 255);
        gVar.writeByte((i11 >>> 8) & 255);
        gVar.writeByte(i11 & 255);
        this.f12630a.writeByte(b10 & 255);
        this.f12630a.writeByte(b11 & 255);
        this.f12630a.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void u(boolean z10, int i10, f fVar, int i11) {
        if (this.f12634e) {
            throw new IOException("closed");
        }
        g(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f12630a.g0(fVar, i11);
        }
    }
}
