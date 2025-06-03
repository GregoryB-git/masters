// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import java.util.concurrent.CountDownLatch;
import V2.i;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import V2.d;
import V2.f;
import V2.g;
import java.util.concurrent.TimeUnit;
import com.google.firebase.remoteconfig.internal.b;
import r1.m;
import java.util.HashMap;
import V2.j;
import java.util.concurrent.Executor;
import java.util.Map;

public class e
{
    public static final Map d;
    public static final Executor e;
    public final Executor a;
    public final p b;
    public j c;
    
    static {
        d = new HashMap();
        e = new m();
    }
    
    public e(final Executor a, final p b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public static Object c(final j j, final long n, final TimeUnit timeUnit) {
        final b b = new b(null);
        final Executor e = Q4.e.e;
        j.e(e, b);
        j.d(e, b);
        j.a(e, b);
        if (!b.c(n, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (j.n()) {
            return j.j();
        }
        throw new ExecutionException(j.i());
    }
    
    public static e h(final Executor executor, final p p2) {
        // monitorenter(e.class)
        while (true) {
            try {
                final String b = p2.b();
                final Map d = Q4.e.d;
                if (!d.containsKey(b)) {
                    d.put(b, new e(executor, p2));
                }
                // monitorexit(e.class)
                return d.get(b);
                // monitorexit(e.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void d() {
        synchronized (this) {
            this.c = V2.m.e(null);
            // monitorexit(this)
            this.b.a();
        }
    }
    
    public j e() {
        // monitorenter(this)
        while (true) {
            try {
                final j c = this.c;
                if (c == null || (c.m() && !this.c.n())) {
                    final Executor a = this.a;
                    final p b = this.b;
                    Objects.requireNonNull(b);
                    this.c = V2.m.c(a, new Q4.b(b));
                }
                // monitorexit(this)
                return this.c;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public com.google.firebase.remoteconfig.internal.b f() {
        return this.g(5L);
    }
    
    public com.google.firebase.remoteconfig.internal.b g(final long n) {
        // monitorenter(this)
        while (true) {
            try {
                Object c = this.c;
                if (c != null && ((j)c).n()) {
                    // monitorexit(this)
                    return (com.google.firebase.remoteconfig.internal.b)this.c.j();
                }
                // monitorexit(this)
                try {
                    c = c(this.e(), n, TimeUnit.SECONDS);
                    return (com.google.firebase.remoteconfig.internal.b)c;
                }
                catch (TimeoutException c) {}
                catch (ExecutionException c) {}
                catch (InterruptedException ex) {}
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", (Throwable)c);
                return null;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public j k(final com.google.firebase.remoteconfig.internal.b b) {
        return this.l(b, true);
    }
    
    public j l(final com.google.firebase.remoteconfig.internal.b b, final boolean b2) {
        return V2.m.c(this.a, new c(this, b)).p(this.a, new Q4.d(this, b2, b));
    }
    
    public final void m(final com.google.firebase.remoteconfig.internal.b b) {
        synchronized (this) {
            this.c = V2.m.e(b);
        }
    }
    
    public static class b implements g, f, d
    {
        public final CountDownLatch a;
        
        public b() {
            this.a = new CountDownLatch(1);
        }
        
        @Override
        public void a(final Object o) {
            this.a.countDown();
        }
        
        @Override
        public void b() {
            this.a.countDown();
        }
        
        public boolean c(final long timeout, final TimeUnit unit) {
            return this.a.await(timeout, unit);
        }
        
        @Override
        public void d(final Exception ex) {
            this.a.countDown();
        }
    }
}
