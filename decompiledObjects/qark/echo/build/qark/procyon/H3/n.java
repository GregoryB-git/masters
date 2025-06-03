// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.concurrent.Callable;
import V2.b;
import V2.m;
import V2.j;
import java.util.concurrent.Executor;

public class n
{
    public final Executor a;
    public j b;
    public final Object c;
    public final ThreadLocal d;
    
    public n(final Executor a) {
        this.b = m.e(null);
        this.c = new Object();
        this.d = new ThreadLocal();
        (this.a = a).execute(new Runnable() {
            @Override
            public void run() {
                n.a(n.this).set(Boolean.TRUE);
            }
        });
    }
    
    public static /* synthetic */ ThreadLocal a(final n n) {
        return n.d;
    }
    
    public void b() {
        if (this.e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }
    
    public Executor c() {
        return this.a;
    }
    
    public final j d(final j j) {
        return j.g(this.a, new b() {
            public Void b(final j j) {
                return null;
            }
        });
    }
    
    public final boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }
    
    public final b f(final Callable callable) {
        return new b() {
            @Override
            public Object a(final j j) {
                return callable.call();
            }
        };
    }
    
    public j g(final Runnable runnable) {
        return this.h(new Callable() {
            public Void a() {
                runnable.run();
                return null;
            }
        });
    }
    
    public j h(final Callable callable) {
        synchronized (this.c) {
            final j g = this.b.g(this.a, this.f(callable));
            this.b = this.d(g);
            return g;
        }
    }
    
    public j i(final Callable callable) {
        synchronized (this.c) {
            final j h = this.b.h(this.a, this.f(callable));
            this.b = this.d(h);
            return h;
        }
    }
}
