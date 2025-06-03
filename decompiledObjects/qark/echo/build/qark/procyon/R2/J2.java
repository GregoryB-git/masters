// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;

public final class J2 implements UncaughtExceptionHandler
{
    public final String a;
    public final /* synthetic */ G2 b;
    
    public J2(final G2 b, final String a) {
        this.b = b;
        n.i(a);
        this.a = a;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        synchronized (this) {
            this.b.j().G().b(this.a, t);
        }
    }
}
