// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import c3.v;
import c3.w;
import c3.g;
import java.util.concurrent.atomic.AtomicReference;

public final class h
{
    public static h b;
    public final AtomicReference a;
    
    static {
        h.b = new h();
    }
    
    public h() {
        this.a = new AtomicReference((V)new n.b().c());
    }
    
    public static h c() {
        return h.b;
    }
    
    public Class a(final Class clazz) {
        return this.a.get().c(clazz);
    }
    
    public Object b(final g g, final Class clazz) {
        return this.a.get().d(g, clazz);
    }
    
    public void d(final l l) {
        synchronized (this) {
            this.a.set(new n.b(this.a.get()).d(l).c());
        }
    }
    
    public void e(final w w) {
        synchronized (this) {
            this.a.set(new n.b(this.a.get()).e(w).c());
        }
    }
    
    public Object f(final v v, final Class clazz) {
        return this.a.get().e(v, clazz);
    }
}
