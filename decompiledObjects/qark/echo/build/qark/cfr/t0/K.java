/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Surface
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package t0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import g0.F;
import g0.M;
import g0.a;
import j0.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import t0.J;
import t0.l;
import t0.m;
import t0.p;

public final class K
implements m {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public K(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (M.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    public /* synthetic */ K(MediaCodec mediaCodec,  a8) {
        this(mediaCodec);
    }

    public static /* synthetic */ void p(K k8, m.d d8, MediaCodec mediaCodec, long l8, long l9) {
        k8.q(d8, mediaCodec, l8, l9);
    }

    private /* synthetic */ void q(m.d d8, MediaCodec mediaCodec, long l8, long l9) {
        d8.a(this, l8, l9);
    }

    @Override
    public void a(int n8, int n9, c c8, long l8, int n10) {
        this.a.queueSecureInputBuffer(n8, n9, c8.a(), l8, n10);
    }

    @Override
    public void b(int n8, int n9, int n10, long l8, int n11) {
        this.a.queueInputBuffer(n8, n9, n10, l8, n11);
    }

    @Override
    public void c(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int n8;
        do {
            if ((n8 = this.a.dequeueOutputBuffer(bufferInfo, 0L)) != -3 || M.a >= 21) continue;
            this.c = this.a.getOutputBuffers();
        } while (n8 == -3);
        return n8;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void f(int n8, boolean bl) {
        this.a.releaseOutputBuffer(n8, bl);
    }

    @Override
    public void flush() {
        this.a.flush();
    }

    @Override
    public void g(int n8) {
        this.a.setVideoScalingMode(n8);
    }

    @Override
    public MediaFormat h() {
        return this.a.getOutputFormat();
    }

    @Override
    public ByteBuffer i(int n8) {
        if (M.a >= 21) {
            return this.a.getInputBuffer(n8);
        }
        return ((ByteBuffer[])M.i(this.b))[n8];
    }

    @Override
    public void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override
    public ByteBuffer k(int n8) {
        if (M.a >= 21) {
            return this.a.getOutputBuffer(n8);
        }
        return ((ByteBuffer[])M.i(this.c))[n8];
    }

    @Override
    public /* synthetic */ boolean l(m.c c8) {
        return l.a(this, c8);
    }

    @Override
    public void m(int n8, long l8) {
        this.a.releaseOutputBuffer(n8, l8);
    }

    @Override
    public int n() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override
    public void o(m.d d8, Handler handler) {
        this.a.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)new J(this, d8), handler);
    }

    @Override
    public void release() {
        Throwable throwable2;
        block4 : {
            block3 : {
                this.b = null;
                this.c = null;
                try {
                    int n8 = M.a;
                    if (n8 < 30 || n8 >= 33) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.a.stop();
            }
            this.a.release();
            return;
        }
        this.a.release();
        throw throwable2;
    }

    public static class b
    implements m.b {
        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public m a(m.a object) {
            void var1_3;
            MediaCodec mediaCodec;
            block6 : {
                Object var3_7 = null;
                mediaCodec = this.b((m.a)object);
                try {
                    F.a("configureCodec");
                    mediaCodec.configure(object.b, object.d, object.e, object.f);
                    F.b();
                    F.a("startCodec");
                    mediaCodec.start();
                    F.b();
                    return new K(mediaCodec, null);
                }
                catch (RuntimeException runtimeException) {
                }
                catch (IOException iOException) {}
                break block6;
                catch (RuntimeException runtimeException) {
                    mediaCodec = var3_7;
                }
                catch (IOException iOException) {
                    mediaCodec = var3_7;
                }
            }
            if (mediaCodec == null) throw var1_3;
            mediaCodec.release();
            throw var1_3;
        }

        public MediaCodec b(m.a object) {
            a.e(object.a);
            object = object.a.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createCodec:");
            stringBuilder.append((String)object);
            F.a(stringBuilder.toString());
            object = MediaCodec.createByCodecName((String)object);
            F.b();
            return object;
        }
    }

}

