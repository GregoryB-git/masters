/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.media3.exoplayer.smoothstreaming;

import B0.k;
import g0.a;
import i0.g;
import p0.A;
import p0.l;
import w0.b;
import x0.j;
import x0.m;
import x0.x;

public final class SsMediaSource$Factory
implements x.a {
    public final b a;
    public final g.a b;
    public j c;
    public A d;
    public B0.m e;
    public long f;

    public SsMediaSource$Factory(g.a a8) {
        this(new w0.a(a8), a8);
    }

    public SsMediaSource$Factory(b b8, g.a a8) {
        this.a = (b)a.e(b8);
        this.b = a8;
        this.d = new l();
        this.e = new k();
        this.f = 30000L;
        this.c = new m();
        this.a(true);
    }

    public SsMediaSource$Factory a(boolean bl) {
        this.a.a(bl);
        return this;
    }
}

