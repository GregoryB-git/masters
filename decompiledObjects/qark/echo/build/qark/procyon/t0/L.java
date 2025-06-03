// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.os.Bundle;
import j0.c;
import android.media.MediaCodec;

public class L implements n
{
    public final MediaCodec a;
    
    public L(final MediaCodec a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n, final int n2, final c c, final long n3, final int n4) {
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
    public void d() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void shutdown() {
    }
    
    @Override
    public void start() {
    }
}
