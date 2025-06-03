// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCodec;
import g0.M;
import g0.a;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec$CryptoException;
import android.media.MediaCodec$CodecException;
import android.media.MediaFormat;
import java.util.ArrayDeque;
import t.c;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec$Callback;

public final class i extends MediaCodec$Callback
{
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final c d;
    public final c e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec$CodecException j;
    public MediaCodec$CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public m.c o;
    
    public i(final HandlerThread b) {
        this.a = new Object();
        this.b = b;
        this.d = new c();
        this.e = new c();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }
    
    public final void b(final MediaFormat e) {
        this.e.a(-2);
        this.g.add(e);
    }
    
    public int c() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.j();
                final boolean i = this.i();
                int e = -1;
                if (i) {
                    // monitorexit(a)
                    return -1;
                }
                if (!this.d.d()) {
                    e = this.d.e();
                }
                // monitorexit(a)
                return e;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public int d(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.j();
                if (this.i()) {
                    // monitorexit(a)
                    return -1;
                }
                if (this.e.d()) {
                    // monitorexit(a)
                    return -1;
                }
                final int e = this.e.e();
                if (e >= 0) {
                    g0.a.h(this.h);
                    final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = this.f.remove();
                    mediaCodec$BufferInfo.set(mediaCodec$BufferInfo2.offset, mediaCodec$BufferInfo2.size, mediaCodec$BufferInfo2.presentationTimeUs, mediaCodec$BufferInfo2.flags);
                }
                else if (e == -2) {
                    this.h = this.g.remove();
                }
                // monitorexit(a)
                return e;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void e() {
        synchronized (this.a) {
            ++this.l;
            ((Handler)M.i(this.c)).post((Runnable)new h(this));
        }
    }
    
    public final void f() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }
    
    public MediaFormat g() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final MediaFormat h = this.h;
                if (h != null) {
                    // monitorexit(a)
                    return h;
                }
                throw new IllegalStateException();
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void h(final MediaCodec mediaCodec) {
        g0.a.f(this.c == null);
        ((Thread)this.b).start();
        final Handler c = new Handler(this.b.getLooper());
        mediaCodec.setCallback((MediaCodec$Callback)this, c);
        this.c = c;
    }
    
    public final boolean i() {
        return this.l > 0L || this.m;
    }
    
    public final void j() {
        this.k();
        this.m();
        this.l();
    }
    
    public final void k() {
        final IllegalStateException n = this.n;
        if (n == null) {
            return;
        }
        this.n = null;
        throw n;
    }
    
    public final void l() {
        final MediaCodec$CryptoException k = this.k;
        if (k == null) {
            return;
        }
        this.k = null;
        throw k;
    }
    
    public final void m() {
        final MediaCodec$CodecException j = this.j;
        if (j == null) {
            return;
        }
        this.j = null;
        throw j;
    }
    
    public final void n() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.m) {
                    // monitorexit(a)
                    return;
                }
                final long l = this.l - 1L;
                this.l = l;
                if (l > 0L) {
                    // monitorexit(a)
                    return;
                }
                if (l < 0L) {
                    this.o(new IllegalStateException());
                    // monitorexit(a)
                    return;
                }
                this.f();
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void o(final IllegalStateException n) {
        synchronized (this.a) {
            this.n = n;
        }
    }
    
    public void onCryptoError(final MediaCodec mediaCodec, final MediaCodec$CryptoException k) {
        synchronized (this.a) {
            this.k = k;
        }
    }
    
    public void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException j) {
        synchronized (this.a) {
            this.j = j;
        }
    }
    
    public void onInputBufferAvailable(MediaCodec a, final int n) {
        a = (MediaCodec)this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.d.a(n);
                final m.c o = this.o;
                if (o != null) {
                    o.b();
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void onOutputBufferAvailable(MediaCodec a, final int n, final MediaCodec$BufferInfo e) {
        a = (MediaCodec)this.a;
        // monitorenter(a)
        while (true) {
            try {
                final MediaFormat i = this.i;
                if (i != null) {
                    this.b(i);
                    this.i = null;
                }
                this.e.a(n);
                this.f.add(e);
                final m.c o = this.o;
                if (o != null) {
                    o.a();
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.b(mediaFormat);
            this.i = null;
        }
    }
    
    public void p(final m.c o) {
        synchronized (this.a) {
            this.o = o;
        }
    }
    
    public void q() {
        synchronized (this.a) {
            this.m = true;
            this.b.quit();
            this.f();
        }
    }
}
