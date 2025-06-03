// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCrypto;
import d0.q;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.os.Bundle;
import j0.c;

public interface m
{
    void a(final int p0, final int p1, final j0.c p2, final long p3, final int p4);
    
    void b(final int p0, final int p1, final int p2, final long p3, final int p4);
    
    void c(final Bundle p0);
    
    int d(final MediaCodec$BufferInfo p0);
    
    boolean e();
    
    void f(final int p0, final boolean p1);
    
    void flush();
    
    void g(final int p0);
    
    MediaFormat h();
    
    ByteBuffer i(final int p0);
    
    void j(final Surface p0);
    
    ByteBuffer k(final int p0);
    
    boolean l(final c p0);
    
    void m(final int p0, final long p1);
    
    int n();
    
    void o(final d p0, final Handler p1);
    
    void release();
    
    public static final class a
    {
        public final p a;
        public final MediaFormat b;
        public final q c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;
        
        public a(final p a, final MediaFormat b, final q c, final Surface d, final MediaCrypto e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        public static a a(final p p4, final MediaFormat mediaFormat, final q q, final MediaCrypto mediaCrypto) {
            return new a(p4, mediaFormat, q, null, mediaCrypto, 0);
        }
        
        public static a b(final p p5, final MediaFormat mediaFormat, final q q, final Surface surface, final MediaCrypto mediaCrypto) {
            return new a(p5, mediaFormat, q, surface, mediaCrypto, 0);
        }
    }
    
    public interface b
    {
        m a(final a p0);
    }
    
    public interface c
    {
        void a();
        
        void b();
    }
    
    public interface d
    {
        void a(final m p0, final long p1, final long p2);
    }
}
