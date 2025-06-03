// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.util.concurrent.atomic.AtomicBoolean;
import t5.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class d
{
    public final E5.c a;
    public final String b;
    public final l c;
    public final E5.c.c d;
    
    public d(final E5.c c, final String s) {
        this(c, s, q.b);
    }
    
    public d(final E5.c c, final String s, final l l) {
        this(c, s, l, null);
    }
    
    public d(final E5.c a, final String b, final l c, final E5.c.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static /* synthetic */ l a(final d d) {
        return d.c;
    }
    
    public static /* synthetic */ String b(final d d) {
        return d.b;
    }
    
    public static /* synthetic */ E5.c c(final d d) {
        return d.a;
    }
    
    public void d(final d d) {
        final E5.c.c d2 = this.d;
        final E5.c.a a = null;
        final E5.c.a a2 = null;
        if (d2 != null) {
            final E5.c a3 = this.a;
            final String b = this.b;
            Object o;
            if (d == null) {
                o = a2;
            }
            else {
                o = new c(d);
            }
            a3.h(b, (E5.c.a)o, this.d);
            return;
        }
        final E5.c a4 = this.a;
        final String b2 = this.b;
        Object o2;
        if (d == null) {
            o2 = a;
        }
        else {
            o2 = new c(d);
        }
        a4.c(b2, (E5.c.a)o2);
    }
    
    public interface b
    {
        void a(final Object p0);
        
        void b(final String p0, final String p1, final Object p2);
        
        void c();
    }
    
    public final class c implements E5.c.a
    {
        public final d a;
        public final AtomicReference b;
        
        public c(final d a) {
            this.b = new AtomicReference(null);
            this.a = a;
        }
        
        public static /* synthetic */ AtomicReference b(final c c) {
            return c.b;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer, final E5.c.b b) {
            final j e = d.a(d.this).e(byteBuffer);
            if (e.a.equals("listen")) {
                this.d(e.b, b);
                return;
            }
            if (e.a.equals("cancel")) {
                this.c(e.b, b);
                return;
            }
            b.a(null);
        }
        
        public final void c(final Object o, final E5.c.b b) {
            ByteBuffer byteBuffer;
            if (this.b.getAndSet(null) != null) {
                try {
                    this.a.a(o);
                    b.a(d.a(d.this).a(null));
                    return;
                }
                catch (RuntimeException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("EventChannel#");
                    sb.append(d.b(d.this));
                    b.c(sb.toString(), "Failed to close event stream", ex);
                    byteBuffer = d.a(d.this).d("error", ex.getMessage(), null);
                }
            }
            else {
                byteBuffer = d.a(d.this).d("error", "No active stream to cancel", null);
            }
            b.a(byteBuffer);
        }
        
        public final void d(final Object o, final E5.c.b b) {
            final a newValue = new a(null);
            if (this.b.getAndSet(newValue) != null) {
                try {
                    this.a.a(null);
                }
                catch (RuntimeException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("EventChannel#");
                    sb.append(d.b(d.this));
                    b.c(sb.toString(), "Failed to close existing event stream", ex);
                }
            }
            try {
                this.a.b(o, newValue);
                b.a(d.a(d.this).a(null));
            }
            catch (RuntimeException ex2) {
                this.b.set(null);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("EventChannel#");
                sb2.append(d.b(d.this));
                b.c(sb2.toString(), "Failed to open event stream", ex2);
                b.a(d.a(d.this).d("error", ex2.getMessage(), null));
            }
        }
        
        public final class a implements b
        {
            public final AtomicBoolean a;
            
            public a() {
                this.a = new AtomicBoolean(false);
            }
            
            @Override
            public void a(final Object o) {
                if (!this.a.get()) {
                    if (c.b(c.this).get() != this) {
                        return;
                    }
                    d.c(d.this).d(d.b(d.this), d.a(d.this).a(o));
                }
            }
            
            @Override
            public void b(final String s, final String s2, final Object o) {
                if (!this.a.get()) {
                    if (c.b(c.this).get() != this) {
                        return;
                    }
                    d.c(d.this).d(d.b(d.this), d.a(d.this).d(s, s2, o));
                }
            }
            
            @Override
            public void c() {
                if (!this.a.getAndSet(true)) {
                    if (c.b(c.this).get() != this) {
                        return;
                    }
                    d.c(d.this).d(d.b(d.this), null);
                }
            }
        }
    }
    
    public interface d
    {
        void a(final Object p0);
        
        void b(final Object p0, final b p1);
    }
}
