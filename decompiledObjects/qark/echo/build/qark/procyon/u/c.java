// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import b3.e;

public abstract class c
{
    public static e a(final c c) {
        final a a = new a();
        final d b = new d(a);
        a.b = b;
        a.a = c.getClass();
        try {
            final Object a2 = c.a(a);
            if (a2 != null) {
                a.a = a2;
                return b;
            }
        }
        catch (Exception ex) {
            b.d(ex);
        }
        return b;
    }
    
    public static final class a
    {
        public Object a;
        public d b;
        public u.d c;
        public boolean d;
        
        public a() {
            this.c = u.d.G();
        }
        
        public void a() {
            this.a = null;
            this.b = null;
            this.c.z(null);
        }
        
        public boolean b(final Object o) {
            boolean b = true;
            this.d = true;
            final d b2 = this.b;
            if (b2 == null || !b2.b(o)) {
                b = false;
            }
            if (b) {
                this.d();
            }
            return b;
        }
        
        public boolean c() {
            boolean b = true;
            this.d = true;
            final d b2 = this.b;
            if (b2 == null || !b2.a(true)) {
                b = false;
            }
            if (b) {
                this.d();
            }
            return b;
        }
        
        public final void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        public boolean e(final Throwable t) {
            boolean b = true;
            this.d = true;
            final d b2 = this.b;
            if (b2 == null || !b2.d(t)) {
                b = false;
            }
            if (b) {
                this.d();
            }
            return b;
        }
        
        public void finalize() {
            final d b = this.b;
            if (b != null && !b.isDone()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                sb.append(this.a);
                b.d(new b(sb.toString()));
            }
            if (!this.d) {
                final u.d c = this.c;
                if (c != null) {
                    c.z(null);
                }
            }
        }
    }
    
    public static final class b extends Throwable
    {
        public b(final String message) {
            super(message);
        }
        
        @Override
        public Throwable fillInStackTrace() {
            // monitorenter(this)
            // monitorexit(this)
            return this;
        }
    }
    
    public interface c
    {
        Object a(final a p0);
    }
    
    public static final class d implements e
    {
        public final WeakReference o;
        public final u.a p;
        
        public d(final a referent) {
            this.p = new u.a() {
                @Override
                public String u() {
                    final a a = (a)d.this.o.get();
                    if (a == null) {
                        return "Completer object has been garbage collected, future will fail soon";
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("tag=[");
                    sb.append(a.a);
                    sb.append("]");
                    return sb.toString();
                }
            };
            this.o = new WeakReference((T)referent);
        }
        
        public boolean a(final boolean b) {
            return this.p.cancel(b);
        }
        
        public boolean b(final Object o) {
            return this.p.z(o);
        }
        
        @Override
        public void c(final Runnable runnable, final Executor executor) {
            this.p.c(runnable, executor);
        }
        
        @Override
        public boolean cancel(final boolean b) {
            final a a = (a)this.o.get();
            final boolean cancel = this.p.cancel(b);
            if (cancel && a != null) {
                a.a();
            }
            return cancel;
        }
        
        public boolean d(final Throwable t) {
            return this.p.C(t);
        }
        
        @Override
        public Object get() {
            return this.p.get();
        }
        
        @Override
        public Object get(final long n, final TimeUnit timeUnit) {
            return this.p.get(n, timeUnit);
        }
        
        @Override
        public boolean isCancelled() {
            return this.p.isCancelled();
        }
        
        @Override
        public boolean isDone() {
            return this.p.isDone();
        }
        
        @Override
        public String toString() {
            return this.p.toString();
        }
    }
}
