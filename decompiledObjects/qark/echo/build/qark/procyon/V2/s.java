// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

public final class s implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ t p;
    
    public s(final t p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        if (this.o.l()) {
            t.b(this.p).s();
            return;
        }
        Label_0059: {
            try {
                t.b(this.p).r(t.a(this.p).a(this.o));
            }
            catch (Exception ex) {
                break Label_0059;
            }
            catch (h h) {
                if (h.getCause() instanceof Exception) {
                    t.b(this.p).q((Exception)h.getCause());
                    return;
                }
                t.b(this.p).q(h);
                return;
                final Exception ex;
                t.b(this.p).q(ex);
            }
        }
    }
}
