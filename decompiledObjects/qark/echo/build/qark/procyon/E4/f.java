// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import q5.b;
import com.google.firebase.perf.config.RemoteConfigManager;
import U5.a;

public final class f implements a
{
    public final E4.a a;
    
    public f(final E4.a a) {
        this.a = a;
    }
    
    public static f a(final E4.a a) {
        return new f(a);
    }
    
    public static RemoteConfigManager c(final E4.a a) {
        return (RemoteConfigManager)b.c(a.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public RemoteConfigManager b() {
        return c(this.a);
    }
}
