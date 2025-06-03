// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A4;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.config.RemoteConfigManager;
import s4.i;
import r4.b;
import s3.e;
import U5.a;

public final class g implements a
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    
    public g(final a a, final a b, final a c, final a d, final a e, final a f, final a g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static g a(final a a, final a a2, final a a3, final a a4, final a a5, final a a6, final a a7) {
        return new g(a, a2, a3, a4, a5, a6, a7);
    }
    
    public static A4.e c(final e e, final b b, final i i, final b b2, final RemoteConfigManager remoteConfigManager, final C4.a a, final SessionManager sessionManager) {
        return new A4.e(e, b, i, b2, remoteConfigManager, a, sessionManager);
    }
    
    public A4.e b() {
        return c((e)this.a.get(), (b)this.b.get(), (i)this.c.get(), (b)this.d.get(), (RemoteConfigManager)this.e.get(), (C4.a)this.f.get(), (SessionManager)this.g.get());
    }
}
