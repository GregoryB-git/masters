// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public final class a0 implements Runnable
{
    public final /* synthetic */ LifecycleCallback o;
    public final /* synthetic */ String p;
    public final /* synthetic */ b0 q;
    
    public a0(final b0 q, final LifecycleCallback o, final String p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final b0 q = this.q;
        if (b0.H1(q) > 0) {
            final LifecycleCallback o = this.o;
            Bundle bundle;
            if (b0.I1(q) != null) {
                bundle = b0.I1(q).getBundle(this.p);
            }
            else {
                bundle = null;
            }
            o.f(bundle);
        }
        if (b0.H1(this.q) >= 2) {
            this.o.j();
        }
        if (b0.H1(this.q) >= 3) {
            this.o.h();
        }
        if (b0.H1(this.q) >= 4) {
            this.o.k();
        }
        if (b0.H1(this.q) >= 5) {
            this.o.g();
        }
    }
}
