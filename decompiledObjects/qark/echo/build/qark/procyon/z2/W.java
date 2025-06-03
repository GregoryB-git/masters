// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.app.Dialog;
import x2.b;
import android.content.DialogInterface$OnCancelListener;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiActivity;
import A2.n;
import android.app.PendingIntent;

public final class W implements Runnable
{
    public final U o;
    public final /* synthetic */ X p;
    
    public W(final X p2, final U o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        if (!this.p.p) {
            return;
        }
        final b b = this.o.b();
        if (b.g()) {
            final X p = this.p;
            p.o.startActivityForResult(GoogleApiActivity.a((Context)p.b(), (PendingIntent)n.i(b.f()), this.o.a(), false), 1);
            return;
        }
        final X p2 = this.p;
        if (p2.s.b((Context)p2.b(), b.a(), null) != null) {
            final X p3 = this.p;
            p3.s.v(p3.b(), this.p.o, b.a(), 2, (DialogInterface$OnCancelListener)this.p);
            return;
        }
        if (b.a() == 18) {
            final X p4 = this.p;
            final Dialog q = p4.s.q(p4.b(), (DialogInterface$OnCancelListener)this.p);
            final X p5 = this.p;
            p5.s.r(((Context)p5.b()).getApplicationContext(), new V(this, q));
            return;
        }
        X.q(this.p, b, this.o.a());
    }
}
