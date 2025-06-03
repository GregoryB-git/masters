// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import d0.p;
import java.util.Collection;
import java.util.Iterator;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class n
{
    public final g0.c a;
    public final k b;
    public final b c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;
    
    public n(final Looper looper, final g0.c c, final b b) {
        this(new CopyOnWriteArraySet(), looper, c, b, true);
    }
    
    public n(final CopyOnWriteArraySet d, final Looper looper, final g0.c a, final b c, final boolean i) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = a.e(looper, (Handler$Callback)new l(this));
        this.i = i;
    }
    
    public void c(final Object o) {
        g0.a.e(o);
        final Object g = this.g;
        // monitorenter(g)
        while (true) {
            try {
                if (this.h) {
                    // monitorexit(g)
                    return;
                }
                this.d.add(new c(o));
                // monitorexit(g)
                return;
                // monitorexit(g)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public n d(final Looper looper, final g0.c c, final b b) {
        return new n(this.d, looper, c, b, this.i);
    }
    
    public n e(final Looper looper, final b b) {
        return this.d(looper, this.a, b);
    }
    
    public void f() {
        this.l();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(1)) {
            final k b = this.b;
            b.d(b.k(1));
        }
        final boolean empty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (empty ^ true) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }
    
    public final boolean g(final Message message) {
        final Iterator<c> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(this.c);
            if (this.b.a(1)) {
                break;
            }
        }
        return true;
    }
    
    public void i(final int n, final a a) {
        this.l();
        this.f.add(new m(new CopyOnWriteArraySet(this.d), n, a));
    }
    
    public void j() {
        this.l();
        Object o = this.g;
        synchronized (o) {
            this.h = true;
            // monitorexit(o)
            o = this.d.iterator();
            while (((Iterator)o).hasNext()) {
                ((Iterator<c>)o).next().c(this.c);
            }
            this.d.clear();
        }
    }
    
    public void k(final int n, final a a) {
        this.i(n, a);
        this.f();
    }
    
    public final void l() {
        if (!this.i) {
            return;
        }
        g0.a.f(Thread.currentThread() == this.b.i().getThread());
    }
    
    public interface a
    {
        void invoke(final Object p0);
    }
    
    public interface b
    {
        void a(final Object p0, final p p1);
    }
    
    public static final class c
    {
        public final Object a;
        public p.b b;
        public boolean c;
        public boolean d;
        
        public c(final Object a) {
            this.a = a;
            this.b = new p.b();
        }
        
        public void a(final int n, final a a) {
            if (!this.d) {
                if (n != -1) {
                    this.b.a(n);
                }
                this.c = true;
                a.invoke(this.a);
            }
        }
        
        public void b(final b b) {
            if (!this.d && this.c) {
                final p e = this.b.e();
                this.b = new p.b();
                this.c = false;
                b.a(this.a, e);
            }
        }
        
        public void c(final b b) {
            this.d = true;
            if (this.c) {
                this.c = false;
                b.a(this.a, this.b.e());
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && c.class == o.getClass() && this.a.equals(((c)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
