// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import g0.a;
import java.io.IOException;
import g0.F;
import android.media.MediaCodec$OnFrameRenderedListener;
import android.os.Handler;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.os.Bundle;
import j0.c;
import g0.M;
import java.nio.ByteBuffer;
import android.media.MediaCodec;

public final class K implements m
{
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;
    
    public K(final MediaCodec a) {
        this.a = a;
        if (M.a < 21) {
            this.b = a.getInputBuffers();
            this.c = a.getOutputBuffers();
        }
    }
    
    @Override
    public void a(final int n, final int n2, final j0.c c, final long n3, final int n4) {
        this.a.queueSecureInputBuffer(n, n2, c.a(), n3, n4);
    }
    
    @Override
    public void b(final int n, final int n2, final int n3, final long n4, final int n5) {
        this.a.queueInputBuffer(n, n2, n3, n4, n5);
    }
    
    @Override
    public void c(final Bundle parameters) {
        this.a.setParameters(parameters);
    }
    
    @Override
    public int d(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        int i;
        do {
            i = this.a.dequeueOutputBuffer(mediaCodec$BufferInfo, 0L);
            if (i == -3 && M.a < 21) {
                this.c = this.a.getOutputBuffers();
            }
        } while (i == -3);
        return i;
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public void f(final int n, final boolean b) {
        this.a.releaseOutputBuffer(n, b);
    }
    
    @Override
    public void flush() {
        this.a.flush();
    }
    
    @Override
    public void g(final int videoScalingMode) {
        this.a.setVideoScalingMode(videoScalingMode);
    }
    
    @Override
    public MediaFormat h() {
        return this.a.getOutputFormat();
    }
    
    @Override
    public ByteBuffer i(final int n) {
        if (M.a >= 21) {
            return this.a.getInputBuffer(n);
        }
        return ((ByteBuffer[])M.i(this.b))[n];
    }
    
    @Override
    public void j(final Surface outputSurface) {
        this.a.setOutputSurface(outputSurface);
    }
    
    @Override
    public ByteBuffer k(final int n) {
        if (M.a >= 21) {
            return this.a.getOutputBuffer(n);
        }
        return ((ByteBuffer[])M.i(this.c))[n];
    }
    
    @Override
    public void m(final int n, final long n2) {
        this.a.releaseOutputBuffer(n, n2);
    }
    
    @Override
    public int n() {
        return this.a.dequeueInputBuffer(0L);
    }
    
    @Override
    public void o(final d d, final Handler handler) {
        this.a.setOnFrameRenderedListener((MediaCodec$OnFrameRenderedListener)new J(this, d), handler);
    }
    
    @Override
    public void release() {
        this.b = null;
        this.c = null;
        Label_0048: {
            try {
                final int a = M.a;
                if (a >= 30 && a < 33) {
                    this.a.stop();
                }
            }
            finally {
                break Label_0048;
            }
            this.a.release();
            return;
        }
        this.a.release();
    }
    
    public static class b implements m.b
    {
        @Override
        public m a(a ex) {
            final MediaCodec mediaCodec = null;
            MediaCodec b;
            try {
                b = this.b((a)ex);
                try {
                    F.a("configureCodec");
                    b.configure(((a)ex).b, ((a)ex).d, ((a)ex).e, ((a)ex).f);
                    F.b();
                    F.a("startCodec");
                    b.start();
                    F.b();
                    ex = (IOException)new K(b, null);
                    return (m)ex;
                }
                catch (RuntimeException ex2) {}
                catch (IOException ex) {}
            }
            catch (RuntimeException ex) {
                b = mediaCodec;
            }
            catch (IOException ex) {
                b = mediaCodec;
            }
            if (b != null) {
                b.release();
            }
            throw ex;
        }
        
        public MediaCodec b(final a a) {
            a.e(a.a);
            final String a2 = a.a.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("createCodec:");
            sb.append(a2);
            F.a(sb.toString());
            final MediaCodec byCodecName = MediaCodec.createByCodecName(a2);
            F.b();
            return byCodecName;
        }
    }
}
