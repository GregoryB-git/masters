// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import kotlin.jvm.internal.Intrinsics;

public abstract class g
{
    public static final b a;
    public static final c b;
    
    static {
        a = new b(null);
        b = new c();
    }
    
    public static final /* synthetic */ c a() {
        return g.b;
    }
    
    public static Object b(final Object o) {
        return o;
    }
    
    public static final Throwable c(final Object o) {
        final boolean b = o instanceof a;
        Throwable a = null;
        a a2;
        if (b) {
            a2 = (a)o;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            a = a2.a;
        }
        return a;
    }
    
    public static final Object d(final Object o) {
        if (!(o instanceof c)) {
            return o;
        }
        return null;
    }
    
    public static final boolean e(final Object o) {
        return o instanceof a;
    }
    
    public static final boolean f(final Object o) {
        return o instanceof c ^ true;
    }
    
    public static final class a extends c
    {
        public final Throwable a;
        
        public a(final Throwable a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof a && Intrinsics.a(this.a, ((a)o).a);
        }
        
        @Override
        public int hashCode() {
            final Throwable a = this.a;
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Closed(");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final Object a(final Throwable t) {
            return g.b(new a(t));
        }
        
        public final Object b() {
            return g.b(g.a());
        }
        
        public final Object c(final Object o) {
            return g.b(o);
        }
    }
    
    public static class c
    {
        @Override
        public String toString() {
            return "Failed";
        }
    }
}
