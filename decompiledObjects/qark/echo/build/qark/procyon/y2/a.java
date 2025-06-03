// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y2;

import A2.i;
import java.util.Set;
import A2.c;
import z2.j;
import A2.d;
import android.os.Looper;
import android.content.Context;
import A2.n;

public final class a
{
    public final a a;
    public final g b;
    public final String c;
    
    public a(final String c, final a a, final g b) {
        n.j(a, "Cannot construct an Api with a null ClientBuilder");
        n.j(b, "Cannot construct an Api with a null ClientKey");
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final a a() {
        return this.a;
    }
    
    public final String b() {
        return this.c;
    }
    
    public abstract static class a extends e
    {
        public f a(final Context context, final Looper looper, final A2.d d, final Object o, final y2.e.a a, final y2.e.b b) {
            return this.b(context, looper, d, o, a, b);
        }
        
        public f b(final Context context, final Looper looper, final A2.d d, final Object o, final z2.d d2, final j j) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
    
    public interface b
    {
    }
    
    public abstract static class c
    {
    }
    
    public interface d
    {
    }
    
    public abstract static class e
    {
    }
    
    public interface f extends b
    {
        boolean a();
        
        void b(final A2.c.e p0);
        
        void c();
        
        Set e();
        
        void f(final String p0);
        
        boolean g();
        
        int h();
        
        boolean i();
        
        x2.d[] j();
        
        String k();
        
        String l();
        
        boolean m();
        
        void o(final i p0, final Set p1);
        
        void p(final A2.c.c p0);
    }
    
    public static final class g extends c
    {
    }
}
