// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;

public final class E implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ F p;
    
    public E(final F p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        while (true) {
            while (true) {
                Label_0084: {
                    try {
                        final j a = F.e(this.p).a(this.o.j());
                        if (a == null) {
                            this.p.d(new NullPointerException("Continuation returned null"));
                            return;
                        }
                        final Executor b = l.b;
                        a.e(b, this.p);
                        a.d(b, this.p);
                        a.a(b, this.p);
                        return;
                    }
                    catch (Exception ex) {
                        break Label_0084;
                    }
                    catch (h h) {
                        if (h.getCause() instanceof Exception) {
                            this.p.d((Exception)h.getCause());
                            return;
                        }
                        this.p.d(h);
                        return;
                        this.p.b();
                        return;
                        final Exception ex;
                        this.p.d(ex);
                        return;
                    }
                    catch (CancellationException ex2) {}
                }
                continue;
            }
        }
    }
}
