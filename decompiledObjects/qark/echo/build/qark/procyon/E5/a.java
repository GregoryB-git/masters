// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import t5.b;
import java.nio.ByteBuffer;

public final class a
{
    public final E5.c a;
    public final String b;
    public final i c;
    public final E5.c.c d;
    
    public a(final E5.c c, final String s, final i i) {
        this(c, s, i, null);
    }
    
    public a(final E5.c a, final String b, final i c, final E5.c.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static /* synthetic */ i a(final a a) {
        return a.c;
    }
    
    public static /* synthetic */ String b(final a a) {
        return a.b;
    }
    
    public void c(final Object o) {
        this.d(o, null);
    }
    
    public void d(final Object o, final e e) {
        final E5.c a = this.a;
        final String b = this.b;
        final ByteBuffer a2 = this.c.a(o);
        Object o2 = null;
        if (e != null) {
            o2 = new c(e, null);
        }
        a.f(b, a2, (E5.c.b)o2);
    }
    
    public void e(final d d) {
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
                o = new b(d, null);
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
            o2 = new b(d, null);
        }
        a4.c(b2, (E5.c.a)o2);
    }
    
    public final class b implements c.a
    {
        public final d a;
        
        public b(final d a) {
            this.a = a;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer, final E5.c.b b) {
            try {
                this.a.a(E5.a.a(E5.a.this).b(byteBuffer), new e() {
                    @Override
                    public void a(final Object o) {
                        b.a(E5.a.a(E5.a.this).a(o));
                    }
                });
            }
            catch (RuntimeException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("BasicMessageChannel#");
                sb.append(E5.a.b(E5.a.this));
                b.c(sb.toString(), "Failed to handle message", ex);
                b.a(null);
            }
        }
    }
    
    public final class c implements E5.c.b
    {
        public final e a;
        
        public c(final e a) {
            this.a = a;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer) {
            try {
                this.a.a(E5.a.a(E5.a.this).b(byteBuffer));
            }
            catch (RuntimeException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("BasicMessageChannel#");
                sb.append(E5.a.b(E5.a.this));
                t5.b.c(sb.toString(), "Failed to handle message reply", ex);
            }
        }
    }
    
    public interface d
    {
        void a(final Object p0, final e p1);
    }
    
    public interface e
    {
        void a(final Object p0);
    }
}
