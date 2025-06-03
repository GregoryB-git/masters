// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.os.Looper;
import android.os.Bundle;
import java.util.Arrays;
import j0.d;
import g0.M;
import g0.a;
import android.media.MediaCodec$CryptoInfo;
import j0.c;
import android.os.Message;
import g0.f;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec;
import java.util.ArrayDeque;

public class g implements n
{
    public static final ArrayDeque g;
    public static final Object h;
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final f e;
    public boolean f;
    
    static {
        g = new ArrayDeque();
        h = new Object();
    }
    
    public g(final MediaCodec mediaCodec, final HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new f());
    }
    
    public g(final MediaCodec a, final HandlerThread b, final f e) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = new AtomicReference();
    }
    
    public static void g(final c c, final MediaCodec$CryptoInfo mediaCodec$CryptoInfo) {
        mediaCodec$CryptoInfo.numSubSamples = c.f;
        mediaCodec$CryptoInfo.numBytesOfClearData = i(c.d, mediaCodec$CryptoInfo.numBytesOfClearData);
        mediaCodec$CryptoInfo.numBytesOfEncryptedData = i(c.e, mediaCodec$CryptoInfo.numBytesOfEncryptedData);
        mediaCodec$CryptoInfo.key = (byte[])a.e(h(c.b, mediaCodec$CryptoInfo.key));
        mediaCodec$CryptoInfo.iv = (byte[])a.e(h(c.a, mediaCodec$CryptoInfo.iv));
        mediaCodec$CryptoInfo.mode = c.c;
        if (M.a >= 24) {
            e.a();
            j0.f.a(mediaCodec$CryptoInfo, d.a(c.g, c.h));
        }
    }
    
    public static byte[] h(final byte[] original, final byte[] array) {
        if (original == null) {
            return array;
        }
        if (array != null && array.length >= original.length) {
            System.arraycopy(original, 0, array, 0, original.length);
            return array;
        }
        return Arrays.copyOf(original, original.length);
    }
    
    public static int[] i(final int[] original, final int[] array) {
        if (original == null) {
            return array;
        }
        if (array != null && array.length >= original.length) {
            System.arraycopy(original, 0, array, 0, original.length);
            return array;
        }
        return Arrays.copyOf(original, original.length);
    }
    
    public static b o() {
        final ArrayDeque g = t0.g.g;
        // monitorenter(g)
        while (true) {
            try {
                if (g.isEmpty()) {
                    // monitorexit(g)
                    return new b();
                }
                // monitorexit(g)
                return g.removeFirst();
                // monitorexit(g)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void p(final b e) {
        final ArrayDeque g = t0.g.g;
        synchronized (g) {
            g.add(e);
        }
    }
    
    @Override
    public void a(final int n, final int n2, final c c, final long n3, final int n4) {
        this.d();
        final b o = o();
        o.a(n, n2, 0, n3, n4);
        g(c, o.d);
        ((Handler)M.i(this.c)).obtainMessage(2, (Object)o).sendToTarget();
    }
    
    @Override
    public void b(final int n, final int n2, final int n3, final long n4, final int n5) {
        this.d();
        final b o = o();
        o.a(n, n2, n3, n4, n5);
        ((Handler)M.i(this.c)).obtainMessage(1, (Object)o).sendToTarget();
    }
    
    @Override
    public void c(final Bundle bundle) {
        this.d();
        ((Handler)M.i(this.c)).obtainMessage(4, (Object)bundle).sendToTarget();
    }
    
    @Override
    public void d() {
        final RuntimeException ex = this.d.getAndSet(null);
        if (ex == null) {
            return;
        }
        throw ex;
    }
    
    public final void f() {
        this.e.c();
        ((Handler)g0.a.e(this.c)).obtainMessage(3).sendToTarget();
        this.e.a();
    }
    
    @Override
    public void flush() {
        if (this.f) {
            try {
                this.n();
            }
            catch (InterruptedException cause) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(cause);
            }
        }
    }
    
    public final void j(final Message message) {
        final int what = message.what;
        b b2;
        if (what != 1) {
            if (what != 2) {
                final b b = null;
                if (what != 3) {
                    if (what != 4) {
                        t0.f.a(this.d, null, new IllegalStateException(String.valueOf(message.what)));
                        b2 = b;
                    }
                    else {
                        this.m((Bundle)message.obj);
                        b2 = b;
                    }
                }
                else {
                    this.e.e();
                    b2 = b;
                }
            }
            else {
                b2 = (b)message.obj;
                this.l(b2.a, b2.b, b2.d, b2.e, b2.f);
            }
        }
        else {
            b2 = (b)message.obj;
            this.k(b2.a, b2.b, b2.c, b2.e, b2.f);
        }
        if (b2 != null) {
            p(b2);
        }
    }
    
    public final void k(final int n, final int n2, final int n3, final long n4, final int n5) {
        try {
            this.a.queueInputBuffer(n, n2, n3, n4, n5);
        }
        catch (RuntimeException ex) {
            t0.f.a(this.d, null, ex);
        }
    }
    
    public final void l(final int n, final int n2, final MediaCodec$CryptoInfo mediaCodec$CryptoInfo, final long n3, final int n4) {
        try {
            synchronized (t0.g.h) {
                this.a.queueSecureInputBuffer(n, n2, mediaCodec$CryptoInfo, n3, n4);
            }
        }
        catch (RuntimeException ex) {
            t0.f.a(this.d, null, ex);
        }
    }
    
    public final void m(final Bundle parameters) {
        try {
            this.a.setParameters(parameters);
        }
        catch (RuntimeException ex) {
            t0.f.a(this.d, null, ex);
        }
    }
    
    public final void n() {
        ((Handler)g0.a.e(this.c)).removeCallbacksAndMessages((Object)null);
        this.f();
    }
    
    @Override
    public void shutdown() {
        if (this.f) {
            this.flush();
            this.b.quit();
        }
        this.f = false;
    }
    
    @Override
    public void start() {
        if (!this.f) {
            ((Thread)this.b).start();
            this.c = new Handler(this.b.getLooper()) {
                public void handleMessage(final Message message) {
                    t0.g.this.j(message);
                }
            };
            this.f = true;
        }
    }
    
    public static class b
    {
        public int a;
        public int b;
        public int c;
        public final MediaCodec$CryptoInfo d;
        public long e;
        public int f;
        
        public b() {
            this.d = new MediaCodec$CryptoInfo();
        }
        
        public void a(final int a, final int b, final int c, final long e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.e = e;
            this.f = f;
        }
    }
}
