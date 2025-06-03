// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import java.security.GeneralSecurityException;
import c3.g;
import c3.y;
import java.util.concurrent.atomic.AtomicReference;

public final class i
{
    public static final i b;
    public final AtomicReference a;
    
    static {
        b = new i();
    }
    
    public i() {
        this.a = new AtomicReference((V)new r.b().e());
    }
    
    public static i a() {
        return i.b;
    }
    
    public boolean b(final q q) {
        return this.a.get().e(q);
    }
    
    public g c(final q q, final y y) {
        return this.a.get().f(q, y);
    }
    
    public g d(final o o, final y y) {
        if (y != null) {
            if (!this.b(o)) {
                try {
                    return new e(o, y);
                }
                catch (GeneralSecurityException ex) {
                    throw new s("Creating a LegacyProtoKey failed", ex);
                }
            }
            return this.c(o, y);
        }
        throw new NullPointerException("access cannot be null");
    }
    
    public void e(final b b) {
        synchronized (this) {
            this.a.set(new r.b(this.a.get()).f(b).e());
        }
    }
    
    public void f(final c c) {
        synchronized (this) {
            this.a.set(new r.b(this.a.get()).g(c).e());
        }
    }
    
    public void g(final j j) {
        synchronized (this) {
            this.a.set(new r.b(this.a.get()).h(j).e());
        }
    }
    
    public void h(final k k) {
        synchronized (this) {
            this.a.set(new r.b(this.a.get()).i(k).e());
        }
    }
}
