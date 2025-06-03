// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import A2.n;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import x2.j;
import t.b;

public final class p extends X
{
    public final b t;
    public final e u;
    
    public p(final g g, final e u, final j j) {
        super(g, j);
        this.t = new b();
        this.u = u;
        super.o.a("ConnectionlessLifecycleHelper", this);
    }
    
    public static void u(final Activity activity, final e e, final z2.b b) {
        final g c = LifecycleCallback.c(activity);
        p p3;
        if ((p3 = (p)c.b("ConnectionlessLifecycleHelper", p.class)) == null) {
            p3 = new p(c, e, j.m());
        }
        n.j(b, "ApiKey cannot be null");
        p3.t.add(b);
        e.c(p3);
    }
    
    @Override
    public final void h() {
        super.h();
        this.v();
    }
    
    @Override
    public final void j() {
        super.j();
        this.v();
    }
    
    @Override
    public final void k() {
        super.k();
        this.u.d(this);
    }
    
    @Override
    public final void m(final x2.b b, final int n) {
        this.u.F(b, n);
    }
    
    @Override
    public final void n() {
        this.u.a();
    }
    
    public final b t() {
        return this.t;
    }
    
    public final void v() {
        if (!this.t.isEmpty()) {
            this.u.c(this);
        }
    }
}
