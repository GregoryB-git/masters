// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.smoothstreaming;

import B0.k;
import p0.l;
import w0.a;
import B0.m;
import p0.A;
import x0.j;
import i0.g;
import w0.b;
import x0.x;

public final class SsMediaSource$Factory implements a
{
    public final w0.b a;
    public final g.a b;
    public j c;
    public A d;
    public m e;
    public long f;
    
    public SsMediaSource$Factory(final g.a a) {
        this(new w0.a(a), a);
    }
    
    public SsMediaSource$Factory(final w0.b b, final g.a b2) {
        this.a = (w0.b)g0.a.e(b);
        this.b = b2;
        this.d = new l();
        this.e = new k();
        this.f = 30000L;
        this.c = new x0.m();
        this.a(true);
    }
    
    public SsMediaSource$Factory a(final boolean b) {
        this.a.a(b);
        return this;
    }
}
