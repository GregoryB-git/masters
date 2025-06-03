// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public abstract class j
{
    public j a(final Executor executor, final d d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }
    
    public j b(final e e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    public j c(final Executor executor, final e e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    public abstract j d(final Executor p0, final f p1);
    
    public abstract j e(final Executor p0, final g p1);
    
    public j f(final b b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public j g(final Executor executor, final b b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public j h(final Executor executor, final b b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    public abstract Exception i();
    
    public abstract Object j();
    
    public abstract Object k(final Class p0);
    
    public abstract boolean l();
    
    public abstract boolean m();
    
    public abstract boolean n();
    
    public j o(final i i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
    
    public j p(final Executor executor, final i i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
