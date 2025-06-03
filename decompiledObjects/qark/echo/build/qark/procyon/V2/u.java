// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class u implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ v p;
    
    public u(final v p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        Label_0084: {
            try {
                final j j = (j)v.e(this.p).a(this.o);
                if (j == null) {
                    this.p.d(new NullPointerException("Continuation returned null"));
                    return;
                }
                final Executor b = l.b;
                j.e(b, this.p);
                j.d(b, this.p);
                j.a(b, this.p);
            }
            catch (Exception ex) {
                break Label_0084;
            }
            catch (h h) {
                if (h.getCause() instanceof Exception) {
                    v.f(this.p).q((Exception)h.getCause());
                    return;
                }
                v.f(this.p).q(h);
                return;
                final Exception ex;
                v.f(this.p).q(ex);
            }
        }
    }
}
