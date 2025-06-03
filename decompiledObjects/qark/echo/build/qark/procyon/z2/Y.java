// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public final class Y implements Runnable
{
    public final /* synthetic */ LifecycleCallback o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Z q;
    
    public Y(final Z q, final LifecycleCallback o, final String p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final Z q = this.q;
        if (Z.d(q) > 0) {
            final LifecycleCallback o = this.o;
            Bundle bundle;
            if (Z.e(q) != null) {
                bundle = Z.e(q).getBundle(this.p);
            }
            else {
                bundle = null;
            }
            o.f(bundle);
        }
        if (Z.d(this.q) >= 2) {
            this.o.j();
        }
        if (Z.d(this.q) >= 3) {
            this.o.h();
        }
        if (Z.d(this.q) >= 4) {
            this.o.k();
        }
        if (Z.d(this.q) >= 5) {
            this.o.g();
        }
    }
}
