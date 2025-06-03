package t0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayDeque;
import t0.InterfaceC1984m;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1980i extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f19453b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f19454c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f19459h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f19460i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f19461j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f19462k;

    /* renamed from: l, reason: collision with root package name */
    public long f19463l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19464m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f19465n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1984m.c f19466o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19452a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final t.c f19455d = new t.c();

    /* renamed from: e, reason: collision with root package name */
    public final t.c f19456e = new t.c();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f19457f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f19458g = new ArrayDeque();

    public C1980i(HandlerThread handlerThread) {
        this.f19453b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f19456e.a(-2);
        this.f19458g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f19452a) {
            try {
                j();
                int i7 = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f19455d.d()) {
                    i7 = this.f19455d.e();
                }
                return i7;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19452a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f19456e.d()) {
                    return -1;
                }
                int e7 = this.f19456e.e();
                if (e7 >= 0) {
                    AbstractC1297a.h(this.f19459h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f19457f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e7 == -2) {
                    this.f19459h = (MediaFormat) this.f19458g.remove();
                }
                return e7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f19452a) {
            this.f19463l++;
            ((Handler) M.i(this.f19454c)).post(new Runnable() { // from class: t0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1980i.this.n();
                }
            });
        }
    }

    public final void f() {
        if (!this.f19458g.isEmpty()) {
            this.f19460i = (MediaFormat) this.f19458g.getLast();
        }
        this.f19455d.b();
        this.f19456e.b();
        this.f19457f.clear();
        this.f19458g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f19452a) {
            try {
                mediaFormat = this.f19459h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC1297a.f(this.f19454c == null);
        this.f19453b.start();
        Handler handler = new Handler(this.f19453b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f19454c = handler;
    }

    public final boolean i() {
        return this.f19463l > 0 || this.f19464m;
    }

    public final void j() {
        k();
        m();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.f19465n;
        if (illegalStateException == null) {
            return;
        }
        this.f19465n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.f19462k;
        if (cryptoException == null) {
            return;
        }
        this.f19462k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f19461j;
        if (codecException == null) {
            return;
        }
        this.f19461j = null;
        throw codecException;
    }

    public final void n() {
        synchronized (this.f19452a) {
            try {
                if (this.f19464m) {
                    return;
                }
                long j7 = this.f19463l - 1;
                this.f19463l = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.f19452a) {
            this.f19465n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f19452a) {
            this.f19462k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f19452a) {
            this.f19461j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f19452a) {
            try {
                this.f19455d.a(i7);
                InterfaceC1984m.c cVar = this.f19466o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19452a) {
            try {
                MediaFormat mediaFormat = this.f19460i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f19460i = null;
                }
                this.f19456e.a(i7);
                this.f19457f.add(bufferInfo);
                InterfaceC1984m.c cVar = this.f19466o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f19452a) {
            b(mediaFormat);
            this.f19460i = null;
        }
    }

    public void p(InterfaceC1984m.c cVar) {
        synchronized (this.f19452a) {
            this.f19466o = cVar;
        }
    }

    public void q() {
        synchronized (this.f19452a) {
            this.f19464m = true;
            this.f19453b.quit();
            f();
        }
    }
}
