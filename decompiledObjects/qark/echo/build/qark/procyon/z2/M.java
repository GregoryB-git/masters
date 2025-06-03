// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import T2.f;
import android.os.Bundle;
import android.os.Looper;
import x2.b;
import android.util.Log;
import A2.I;
import T2.l;
import A2.n;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import y2.a;
import y2.e;
import T2.d;

public final class M extends d implements a, e.b
{
    public static final y2.a.a i;
    public final Context b;
    public final Handler c;
    public final y2.a.a d;
    public final Set e;
    public final A2.d f;
    public S2.e g;
    public L h;
    
    static {
        i = S2.d.c;
    }
    
    public M(final Context b, final Handler c, final A2.d d) {
        final y2.a.a i = M.i;
        this.b = b;
        this.c = c;
        this.f = (A2.d)n.j(d, "ClientSettings must not be null");
        this.e = d.e();
        this.d = i;
    }
    
    @Override
    public final void K(final l l) {
        this.c.post((Runnable)new K(this, l));
    }
    
    public final void c1(final L h) {
        final S2.e g = this.g;
        if (g != null) {
            ((y2.a.f)g).c();
        }
        this.f.i(System.identityHashCode(this));
        final y2.a.a d = this.d;
        final Context b = this.b;
        final Looper looper = this.c.getLooper();
        final A2.d f = this.f;
        this.g = (S2.e)d.a(b, looper, f, f.f(), this, this);
        this.h = h;
        final Set e = this.e;
        if (e != null && !e.isEmpty()) {
            this.g.n();
            return;
        }
        this.c.post((Runnable)new J(this));
    }
    
    public final void d1() {
        final S2.e g = this.g;
        if (g != null) {
            ((y2.a.f)g).c();
        }
    }
    
    @Override
    public final void n(final int n) {
        ((y2.a.f)this.g).c();
    }
    
    @Override
    public final void o(final b b) {
        this.h.a(b);
    }
    
    @Override
    public final void v(final Bundle bundle) {
        this.g.d(this);
    }
}
