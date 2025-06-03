// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import t5.b;
import java.nio.ByteBuffer;

public class k
{
    public final E5.c a;
    public final String b;
    public final l c;
    public final E5.c.c d;
    
    public k(final E5.c c, final String s) {
        this(c, s, q.b);
    }
    
    public k(final E5.c c, final String s, final l l) {
        this(c, s, l, null);
    }
    
    public k(final E5.c a, final String b, final l c, final E5.c.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static /* synthetic */ l a(final k k) {
        return k.c;
    }
    
    public static /* synthetic */ String b(final k k) {
        return k.b;
    }
    
    public void c(final String s, final Object o) {
        this.d(s, o, null);
    }
    
    public void d(final String s, final Object o, final d d) {
        final E5.c a = this.a;
        final String b = this.b;
        final ByteBuffer c = this.c.c(new j(s, o));
        Object o2;
        if (d == null) {
            o2 = null;
        }
        else {
            o2 = new b(d);
        }
        a.f(b, c, (E5.c.b)o2);
    }
    
    public void e(final c c) {
        final E5.c.c d = this.d;
        final E5.c.a a = null;
        final E5.c.a a2 = null;
        if (d != null) {
            final E5.c a3 = this.a;
            final String b = this.b;
            Object o;
            if (c == null) {
                o = a2;
            }
            else {
                o = new a(c);
            }
            a3.h(b, (E5.c.a)o, this.d);
            return;
        }
        final E5.c a4 = this.a;
        final String b2 = this.b;
        Object o2;
        if (c == null) {
            o2 = a;
        }
        else {
            o2 = new a(c);
        }
        a4.c(b2, (E5.c.a)o2);
    }
    
    public final class a implements E5.c.a
    {
        public final k.c a;
        
        public a(final k.c a) {
            this.a = a;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer, final c.b b) {
            final j e = k.a(k.this).e(byteBuffer);
            try {
                this.a.onMethodCall(e, new k.d() {
                    @Override
                    public void a(final Object o) {
                        b.a(k.a(k.this).a(o));
                    }
                    
                    @Override
                    public void b(final String s, final String s2, final Object o) {
                        b.a(k.a(k.this).d(s, s2, o));
                    }
                    
                    @Override
                    public void c() {
                        b.a(null);
                    }
                });
            }
            catch (RuntimeException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("MethodChannel#");
                sb.append(k.b(k.this));
                b.c(sb.toString(), "Failed to handle method call", ex);
                b.a(k.a(k.this).b("error", ex.getMessage(), null, b.d(ex)));
            }
        }
    }
    
    public final class b implements E5.c.b
    {
        public final k.d a;
        
        public b(final k.d a) {
            this.a = a;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer) {
            Label_0064: {
                if (byteBuffer == null) {
                    try {
                        this.a.c();
                        return;
                    }
                    catch (RuntimeException ex) {
                        break Label_0064;
                    }
                }
                try {
                    this.a.a(k.a(k.this).f(byteBuffer));
                    return;
                }
                catch (e e) {
                    this.a.b(e.o, e.getMessage(), e.p);
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("MethodChannel#");
            sb.append(k.b(k.this));
            final RuntimeException ex;
            t5.b.c(sb.toString(), "Failed to handle method call result", ex);
        }
    }
    
    public interface c
    {
        void onMethodCall(final j p0, final d p1);
    }
    
    public interface d
    {
        void a(final Object p0);
        
        void b(final String p0, final String p1, final Object p2);
        
        void c();
    }
}
