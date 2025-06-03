// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.util.Log;
import java.util.Set;
import A2.i;
import y2.a;
import A2.c;

public final class B implements c, L
{
    public final y2.a.f a;
    public final z2.b b;
    public i c;
    public Set d;
    public boolean e;
    public final /* synthetic */ z2.e f;
    
    public B(final z2.e f, final y2.a.f a, final z2.b b) {
        this.f = f;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final x2.b b) {
        final x x = z2.e.A(this.f).get(this.b);
        if (x != null) {
            x.H(b);
        }
    }
    
    @Override
    public final void b(final x2.b b) {
        z2.e.r(this.f).post((Runnable)new A(this, b));
    }
    
    @Override
    public final void c(final i c, final Set d) {
        if (c != null && d != null) {
            this.c = c;
            this.d = d;
            this.h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", (Throwable)new Exception());
        this.a(new x2.b(4));
    }
    
    public final void h() {
        if (this.e) {
            final i c = this.c;
            if (c != null) {
                this.a.o(c, this.d);
            }
        }
    }
}
