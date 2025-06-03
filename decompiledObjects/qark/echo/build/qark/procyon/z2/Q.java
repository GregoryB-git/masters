// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import x2.d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import y2.a;
import com.google.android.gms.common.api.Status;
import V2.k;

public final class Q extends F
{
    public final m b;
    public final k c;
    public final l d;
    
    public Q(final int n, final m b, final k c, final l d) {
        super(n);
        this.c = c;
        this.b = b;
        this.d = d;
        if (n != 2) {
            return;
        }
        if (!b.c()) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }
    
    @Override
    public final void a(final Status status) {
        this.c.d(this.d.a(status));
    }
    
    @Override
    public final void b(final Exception ex) {
        this.c.d(ex);
    }
    
    @Override
    public final void c(final x x) {
        Label_0038: {
            try {
                this.b.b(x.t(), this.c);
                return;
            }
            catch (RuntimeException ex2) {}
            catch (RemoteException ex3) {
                break Label_0038;
            }
            catch (DeadObjectException ex) {
                throw ex;
            }
            final RuntimeException ex2;
            this.c.d(ex2);
            return;
        }
        final RemoteException ex3;
        this.a(T.e(ex3));
    }
    
    @Override
    public final void d(final o o, final boolean b) {
        o.b(this.c, b);
    }
    
    @Override
    public final boolean f(final x x) {
        return this.b.c();
    }
    
    @Override
    public final d[] g(final x x) {
        return this.b.e();
    }
}
