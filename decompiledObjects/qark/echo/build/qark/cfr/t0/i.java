/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$Callback
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 */
package t0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import g0.M;
import g0.a;
import java.util.ArrayDeque;
import t.c;
import t0.h;
import t0.m;

public final class i
extends MediaCodec.Callback {
    public final Object a = new Object();
    public final HandlerThread b;
    public Handler c;
    public final c d;
    public final c e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public m.c o;

    public i(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.d = new c();
        this.e = new c();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public static /* synthetic */ void a(i i8) {
        i8.n();
    }

    public final void b(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add((Object)mediaFormat);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int c() {
        Object object = this.a;
        synchronized (object) {
            try {
                this.j();
                boolean bl = this.i();
                int n8 = -1;
                if (bl) {
                    return -1;
                }
                if (!this.d.d()) return this.d.e();
                return n8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int d(MediaCodec.BufferInfo bufferInfo) {
        Object object = this.a;
        synchronized (object) {
            try {
                this.j();
                if (this.i()) {
                    return -1;
                }
                if (this.e.d()) {
                    return -1;
                }
                int n8 = this.e.e();
                if (n8 >= 0) {
                    a.h((Object)this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo)this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (n8 == -2) {
                    this.h = (MediaFormat)this.g.remove();
                }
                return n8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        Object object = this.a;
        synchronized (object) {
            ++this.l;
            ((Handler)M.i((Object)this.c)).post((Runnable)new h(this));
            return;
        }
    }

    public final void f() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat)this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaFormat g() {
        Object object = this.a;
        synchronized (object) {
            try {
                MediaFormat mediaFormat = this.h;
                if (mediaFormat != null) {
                    return mediaFormat;
                }
                throw new IllegalStateException();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void h(MediaCodec mediaCodec) {
        boolean bl = this.c == null;
        a.f(bl);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback((MediaCodec.Callback)this, handler);
        this.c = handler;
    }

    public final boolean i() {
        if (this.l <= 0L && !this.m) {
            return false;
        }
        return true;
    }

    public final void j() {
        this.k();
        this.m();
        this.l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException == null) {
            return;
        }
        this.n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n() {
        Object object = this.a;
        synchronized (object) {
            try {
                long l8;
                if (this.m) {
                    return;
                }
                this.l = l8 = this.l - 1L;
                if (l8 > 0L) {
                    return;
                }
                if (l8 < 0L) {
                    this.o(new IllegalStateException());
                    return;
                }
                this.f();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(IllegalStateException illegalStateException) {
        Object object = this.a;
        synchronized (object) {
            this.n = illegalStateException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCryptoError(MediaCodec object, MediaCodec.CryptoException cryptoException) {
        object = this.a;
        synchronized (object) {
            this.k = cryptoException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onError(MediaCodec object, MediaCodec.CodecException codecException) {
        object = this.a;
        synchronized (object) {
            this.j = codecException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onInputBufferAvailable(MediaCodec object, int n8) {
        object = this.a;
        synchronized (object) {
            try {
                this.d.a(n8);
                m.c c8 = this.o;
                if (c8 != null) {
                    c8.b();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onOutputBufferAvailable(MediaCodec object, int n8, MediaCodec.BufferInfo object2) {
        object = this.a;
        synchronized (object) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.b(mediaFormat);
                    this.i = null;
                }
                this.e.a(n8);
                this.f.add(object2);
                object2 = this.o;
                if (object2 != null) {
                    object2.a();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onOutputFormatChanged(MediaCodec object, MediaFormat mediaFormat) {
        object = this.a;
        synchronized (object) {
            this.b(mediaFormat);
            this.i = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(m.c c8) {
        Object object = this.a;
        synchronized (object) {
            this.o = c8;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q() {
        Object object = this.a;
        synchronized (object) {
            this.m = true;
            this.b.quit();
            this.f();
            return;
        }
    }
}

