// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import q5.b;
import com.google.firebase.perf.session.SessionManager;
import U5.a;

public final class g implements a
{
    public final E4.a a;
    
    public g(final E4.a a) {
        this.a = a;
    }
    
    public static g a(final E4.a a) {
        return new g(a);
    }
    
    public static SessionManager c(final E4.a a) {
        return (SessionManager)b.c(a.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public SessionManager b() {
        return c(this.a);
    }
}
