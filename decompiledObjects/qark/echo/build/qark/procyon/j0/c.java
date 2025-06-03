// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j0;

import android.media.MediaCodec$CryptoInfo$Pattern;
import g0.a;
import g0.M;
import android.media.MediaCodec$CryptoInfo;

public final class c
{
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec$CryptoInfo i;
    public final b j;
    
    public c() {
        final MediaCodec$CryptoInfo i = new MediaCodec$CryptoInfo();
        this.i = i;
        final int a = M.a;
        b j = null;
        if (a >= 24) {
            j = new b(i, null);
        }
        this.j = j;
    }
    
    public MediaCodec$CryptoInfo a() {
        return this.i;
    }
    
    public void b(final int n) {
        if (n == 0) {
            return;
        }
        if (this.d == null) {
            final int[] array = { 0 };
            this.d = array;
            this.i.numBytesOfClearData = array;
        }
        final int[] d = this.d;
        d[0] += n;
    }
    
    public void c(final int n, final int[] array, final int[] array2, final byte[] array3, final byte[] array4, final int n2, final int g, final int h) {
        this.f = n;
        this.d = array;
        this.e = array2;
        this.b = array3;
        this.a = array4;
        this.c = n2;
        this.g = g;
        this.h = h;
        final MediaCodec$CryptoInfo i = this.i;
        i.numSubSamples = n;
        i.numBytesOfClearData = array;
        i.numBytesOfEncryptedData = array2;
        i.key = array3;
        i.iv = array4;
        i.mode = n2;
        if (M.a >= 24) {
            ((b)g0.a.e(this.j)).b(g, h);
        }
    }
    
    public static final class b
    {
        public final MediaCodec$CryptoInfo a;
        public final MediaCodec$CryptoInfo$Pattern b;
        
        public b(final MediaCodec$CryptoInfo a) {
            this.a = a;
            this.b = d.a(0, 0);
        }
        
        public final void b(final int n, final int n2) {
            j0.e.a(this.b, n, n2);
            j0.f.a(this.a, this.b);
        }
    }
}
