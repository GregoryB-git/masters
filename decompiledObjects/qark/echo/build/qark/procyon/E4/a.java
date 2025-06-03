// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E4;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.config.RemoteConfigManager;
import r4.b;
import s4.i;
import s3.e;

public class a
{
    public final e a;
    public final i b;
    public final b c;
    public final b d;
    
    public a(final e a, final i b, final b c, final b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public C4.a a() {
        return C4.a.g();
    }
    
    public e b() {
        return this.a;
    }
    
    public i c() {
        return this.b;
    }
    
    public b d() {
        return this.c;
    }
    
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }
    
    public SessionManager f() {
        return SessionManager.getInstance();
    }
    
    public b g() {
        return this.d;
    }
}
