// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m;

import java.util.concurrent.Executor;

public class a extends d
{
    public static volatile a c;
    public static final Executor d;
    public static final Executor e;
    public d a;
    public d b;
    
    static {
        d = new Executor() {
            @Override
            public void execute(final Runnable runnable) {
                m.a.d().c(runnable);
            }
        };
        e = new Executor() {
            @Override
            public void execute(final Runnable runnable) {
                m.a.d().a(runnable);
            }
        };
    }
    
    public a() {
        final c c = new c();
        this.b = c;
        this.a = c;
    }
    
    public static a d() {
        if (a.c != null) {
            return a.c;
        }
        // monitorenter(a.class)
        while (true) {
            try {
                if (a.c == null) {
                    a.c = new a();
                }
                // monitorexit(a.class)
                return a.c;
                // monitorexit(a.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.a.a(runnable);
    }
    
    @Override
    public boolean b() {
        return this.a.b();
    }
    
    @Override
    public void c(final Runnable runnable) {
        this.a.c(runnable);
    }
}
