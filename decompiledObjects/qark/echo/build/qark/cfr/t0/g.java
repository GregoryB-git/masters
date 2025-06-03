/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Arrays
 *  java.util.concurrent.atomic.AtomicReference
 */
package t0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import g0.M;
import g0.a;
import j0.c;
import j0.d;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import t0.e;
import t0.f;
import t0.n;

public class g
implements n {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final g0.f e;
    public boolean f;

    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new g0.f());
    }

    public g(MediaCodec mediaCodec, HandlerThread handlerThread, g0.f f8) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = f8;
        this.d = new AtomicReference();
    }

    public static void g(c c8, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c8.f;
        cryptoInfo.numBytesOfClearData = g.i(c8.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g.i(c8.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[])a.e(g.h(c8.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[])a.e(g.h(c8.a, cryptoInfo.iv));
        cryptoInfo.mode = c8.c;
        if (M.a >= 24) {
            e.a();
            j0.f.a(cryptoInfo, d.a(c8.g, c8.h));
        }
    }

    public static byte[] h(byte[] arrby, byte[] arrby2) {
        if (arrby == null) {
            return arrby2;
        }
        if (arrby2 != null && arrby2.length >= arrby.length) {
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)arrby.length);
            return arrby2;
        }
        return Arrays.copyOf((byte[])arrby, (int)arrby.length);
    }

    public static int[] i(int[] arrn, int[] arrn2) {
        if (arrn == null) {
            return arrn2;
        }
        if (arrn2 != null && arrn2.length >= arrn.length) {
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)arrn.length);
            return arrn2;
        }
        return Arrays.copyOf((int[])arrn, (int)arrn.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b o() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (!arrayDeque.isEmpty()) return (b)arrayDeque.removeFirst();
                return new b();
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
    public static void p(b b8) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add((Object)b8);
            return;
        }
    }

    @Override
    public void a(int n8, int n9, c c8, long l8, int n10) {
        this.d();
        b b8 = g.o();
        b8.a(n8, n9, 0, l8, n10);
        g.g(c8, b8.d);
        ((Handler)M.i((Object)this.c)).obtainMessage(2, (Object)b8).sendToTarget();
    }

    @Override
    public void b(int n8, int n9, int n10, long l8, int n11) {
        this.d();
        b b8 = g.o();
        b8.a(n8, n9, n10, l8, n11);
        ((Handler)M.i((Object)this.c)).obtainMessage(1, (Object)b8).sendToTarget();
    }

    @Override
    public void c(Bundle bundle) {
        this.d();
        ((Handler)M.i((Object)this.c)).obtainMessage(4, (Object)bundle).sendToTarget();
    }

    @Override
    public void d() {
        RuntimeException runtimeException = (RuntimeException)this.d.getAndSet((Object)null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    public final void f() {
        this.e.c();
        ((Handler)a.e((Object)this.c)).obtainMessage(3).sendToTarget();
        this.e.a();
    }

    @Override
    public void flush() {
        if (this.f) {
            try {
                this.n();
                return;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException((Throwable)interruptedException);
            }
        }
    }

    public final void j(Message object) {
        int n8 = object.what;
        if (n8 != 1) {
            if (n8 != 2) {
                Object var3_3 = null;
                if (n8 != 3) {
                    if (n8 != 4) {
                        f.a(this.d, null, (Object)new IllegalStateException(String.valueOf((int)object.what)));
                        object = var3_3;
                    } else {
                        this.m((Bundle)object.obj);
                        object = var3_3;
                    }
                } else {
                    this.e.e();
                    object = var3_3;
                }
            } else {
                object = (b)object.obj;
                this.l(object.a, object.b, object.d, object.e, object.f);
            }
        } else {
            object = (b)object.obj;
            this.k(object.a, object.b, object.c, object.e, object.f);
        }
        if (object != null) {
            g.p((b)object);
        }
    }

    public final void k(int n8, int n9, int n10, long l8, int n11) {
        try {
            this.a.queueInputBuffer(n8, n9, n10, l8, n11);
            return;
        }
        catch (RuntimeException runtimeException) {
            f.a(this.d, null, (Object)runtimeException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void l(int n8, int n9, MediaCodec.CryptoInfo cryptoInfo, long l8, int n10) {
        try {
            Object object = h;
            // MONITORENTER : object
        }
        catch (RuntimeException runtimeException) {
            f.a(this.d, null, (Object)runtimeException);
            return;
        }
        this.a.queueSecureInputBuffer(n8, n9, cryptoInfo, l8, n10);
        // MONITOREXIT : object
    }

    public final void m(Bundle bundle) {
        try {
            this.a.setParameters(bundle);
            return;
        }
        catch (RuntimeException runtimeException) {
            f.a(this.d, null, (Object)runtimeException);
            return;
        }
    }

    public final void n() {
        ((Handler)a.e((Object)this.c)).removeCallbacksAndMessages((Object)null);
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
            this.b.start();
            this.c = new Handler(this.b.getLooper()){

                public void handleMessage(Message message) {
                    g.this.j(message);
                }
            };
            this.f = true;
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int n8, int n9, int n10, long l8, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.e = l8;
            this.f = n11;
        }
    }

}

