// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import y2.b;
import com.google.android.gms.common.api.Status;
import V2.k;

public abstract class P extends F
{
    public final k b;
    
    public P(final int n, final k b) {
        super(n);
        this.b = b;
    }
    
    @Override
    public final void a(final Status status) {
        this.b.d(new b(status));
    }
    
    @Override
    public final void b(final Exception ex) {
        this.b.d(ex);
    }
    
    @Override
    public final void c(final x x) {
        try {
            this.h(x);
        }
        catch (RuntimeException ex) {
            this.b.d(ex);
        }
        catch (RemoteException ex2) {
            this.a(T.e(ex2));
        }
        catch (DeadObjectException ex3) {
            this.a(T.e((RemoteException)ex3));
            throw ex3;
        }
    }
    
    public abstract void h(final x p0);
}
