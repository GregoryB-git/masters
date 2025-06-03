// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.util.Log;
import A2.i;
import x2.b;

public final class A implements Runnable
{
    public final /* synthetic */ b o;
    public final /* synthetic */ B p;
    
    public A(final B p2, final b o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final B p = this.p;
        final x x = e.A(p.f).get(B.e(p));
        if (x == null) {
            return;
        }
        if (this.o.i()) {
            B.f(this.p, true);
            if (B.d(this.p).m()) {
                B.g(this.p);
                return;
            }
            try {
                final B p2 = this.p;
                B.d(p2).o(null, B.d(p2).e());
                return;
            }
            catch (SecurityException ex) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", (Throwable)ex);
                B.d(this.p).f("Failed to get service from broker.");
                x.G(new b(10), null);
                return;
            }
        }
        x.G(this.o, null);
    }
}
