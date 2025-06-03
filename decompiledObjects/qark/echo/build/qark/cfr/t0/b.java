/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.view.Surface
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package t0;

import W2.s;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d0.q;
import d0.z;
import g0.F;
import g0.M;
import java.nio.ByteBuffer;
import t0.L;
import t0.a;
import t0.c;
import t0.d;
import t0.g;
import t0.i;
import t0.m;
import t0.n;
import t0.p;

public final class b
implements m {
    public final MediaCodec a;
    public final i b;
    public final n c;
    public boolean d;
    public int e;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, n n8) {
        this.a = mediaCodec;
        this.b = new i(handlerThread);
        this.c = n8;
        this.e = 0;
    }

    public /* synthetic */ b(MediaCodec mediaCodec, HandlerThread handlerThread, n n8,  a8) {
        this(mediaCodec, handlerThread, n8);
    }

    public static /* synthetic */ void p(b b8, m.d d8, MediaCodec mediaCodec, long l8, long l9) {
        b8.x(d8, mediaCodec, l8, l9);
    }

    public static String t(int n8) {
        return b.v(n8, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int n8) {
        return b.v(n8, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String v(int n8, String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        if (n8 == 1) {
            string2 = "Audio";
        } else if (n8 == 2) {
            string2 = "Video";
        } else {
            stringBuilder.append("Unknown(");
            stringBuilder.append(n8);
            string2 = ")";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public void a(int n8, int n9, j0.c c8, long l8, int n10) {
        this.c.a(n8, n9, c8, l8, n10);
    }

    @Override
    public void b(int n8, int n9, int n10, long l8, int n11) {
        this.c.b(n8, n9, n10, l8, n11);
    }

    @Override
    public void c(Bundle bundle) {
        this.c.c(bundle);
    }

    @Override
    public int d(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        return this.b.d(bufferInfo);
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
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override
    public void g(int n8) {
        this.a.setVideoScalingMode(n8);
    }

    @Override
    public MediaFormat h() {
        return this.b.g();
    }

    @Override
    public ByteBuffer i(int n8) {
        return this.a.getInputBuffer(n8);
    }

    @Override
    public void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override
    public ByteBuffer k(int n8) {
        return this.a.getOutputBuffer(n8);
    }

    @Override
    public boolean l(m.c c8) {
        this.b.p(c8);
        return true;
    }

    @Override
    public void m(int n8, long l8) {
        this.a.releaseOutputBuffer(n8, l8);
    }

    @Override
    public int n() {
        this.c.d();
        return this.b.c();
    }

    @Override
    public void o(m.d d8, Handler handler) {
        this.a.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)new a(this, d8), handler);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void release() {
        Throwable throwable4;
        block12 : {
            Throwable throwable22;
            block11 : {
                Throwable throwable32;
                block10 : {
                    block9 : {
                        try {
                            if (this.e == 1) {
                                this.c.shutdown();
                                this.b.q();
                            }
                            this.e = 2;
                            if (this.d) return;
                        }
                        catch (Throwable throwable22) {}
                        try {
                            int n8 = M.a;
                            if (n8 < 30 || n8 >= 33) break block9;
                            this.a.stop();
                        }
                        catch (Throwable throwable32) {
                            break block10;
                        }
                    }
                    this.a.release();
                    this.d = true;
                    return;
                }
                this.a.release();
                this.d = true;
                throw throwable32;
                if (this.d) throw throwable22;
                try {
                    int n9 = M.a;
                    if (n9 < 30 || n9 >= 33) break block11;
                    this.a.stop();
                }
                catch (Throwable throwable4) {
                    break block12;
                }
            }
            this.a.release();
            this.d = true;
            throw throwable22;
        }
        this.a.release();
        this.d = true;
        throw throwable4;
    }

    public final void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int n8) {
        this.b.h(this.a);
        F.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, n8);
        F.b();
        this.c.start();
        F.a("startCodec");
        this.a.start();
        F.b();
        this.e = 1;
    }

    public final /* synthetic */ void x(m.d d8, MediaCodec mediaCodec, long l8, long l9) {
        d8.a(this, l8, l9);
    }

    public static final class b
    implements m.b {
        public final s a;
        public final s b;
        public boolean c;

        public b(int n8) {
            this(new c(n8), new d(n8));
        }

        public b(s s8, s s9) {
            this.a = s8;
            this.b = s9;
            this.c = true;
        }

        public static /* synthetic */ HandlerThread b(int n8) {
            return b.g(n8);
        }

        public static /* synthetic */ HandlerThread c(int n8) {
            return b.f(n8);
        }

        public static /* synthetic */ HandlerThread f(int n8) {
            return new HandlerThread(b.t(n8));
        }

        public static /* synthetic */ HandlerThread g(int n8) {
            return new HandlerThread(b.u(n8));
        }

        public static boolean h(q q8) {
            int n8 = M.a;
            boolean bl = false;
            if (n8 < 34) {
                return false;
            }
            if (n8 >= 35 || z.s(q8.n)) {
                bl = true;
            }
            return bl;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public b d(m.a a8) {
            Object object2;
            Object object;
            void var1_4;
            block10 : {
                object = a8.a.a;
                object2 = null;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("createCodec:");
                stringBuilder.append((String)object);
                F.a(stringBuilder.toString());
                stringBuilder = MediaCodec.createByCodecName((String)object);
                int n8 = a8.f;
                if (this.c && b.h(a8.c)) {
                    object = new L((MediaCodec)stringBuilder);
                    n8 |= 4;
                } else {
                    object = new g((MediaCodec)stringBuilder, (HandlerThread)this.b.get());
                }
                object = new b((MediaCodec)stringBuilder, (HandlerThread)this.a.get(), (n)object, null);
                try {
                    F.b();
                    ((b)object).w(a8.b, a8.d, a8.e, n8);
                    return object;
                }
                catch (Exception exception) {
                    object2 = object;
                    object = stringBuilder;
                }
                break block10;
                catch (Exception exception) {
                    object = null;
                }
                break block10;
                catch (Exception exception) {
                    object = stringBuilder;
                }
            }
            if (object2 == null) {
                if (object == null) throw var1_4;
                object.release();
                throw var1_4;
            }
            object2.release();
            throw var1_4;
        }

        public void e(boolean bl) {
            this.c = bl;
        }
    }

}

