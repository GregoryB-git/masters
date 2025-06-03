/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Surface
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package t0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d0.q;
import java.nio.ByteBuffer;
import t0.p;

public interface m {
    public void a(int var1, int var2, j0.c var3, long var4, int var6);

    public void b(int var1, int var2, int var3, long var4, int var6);

    public void c(Bundle var1);

    public int d(MediaCodec.BufferInfo var1);

    public boolean e();

    public void f(int var1, boolean var2);

    public void flush();

    public void g(int var1);

    public MediaFormat h();

    public ByteBuffer i(int var1);

    public void j(Surface var1);

    public ByteBuffer k(int var1);

    public boolean l(c var1);

    public void m(int var1, long var2);

    public int n();

    public void o(d var1, Handler var2);

    public void release();

    public static final class a {
        public final p a;
        public final MediaFormat b;
        public final q c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;

        public a(p p8, MediaFormat mediaFormat, q q8, Surface surface, MediaCrypto mediaCrypto, int n8) {
            this.a = p8;
            this.b = mediaFormat;
            this.c = q8;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = n8;
        }

        public static a a(p p8, MediaFormat mediaFormat, q q8, MediaCrypto mediaCrypto) {
            return new a(p8, mediaFormat, q8, null, mediaCrypto, 0);
        }

        public static a b(p p8, MediaFormat mediaFormat, q q8, Surface surface, MediaCrypto mediaCrypto) {
            return new a(p8, mediaFormat, q8, surface, mediaCrypto, 0);
        }
    }

    public static interface b {
        public m a(a var1);
    }

    public static interface c {
        public void a();

        public void b();
    }

    public static interface d {
        public void a(m var1, long var2, long var4);
    }

}

