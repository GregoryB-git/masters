// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public abstract class i
{
    public static a a() {
        return new b.b().f(new HashMap());
    }
    
    public final String b(String s) {
        if ((s = this.c().get(s)) == null) {
            s = "";
        }
        return s;
    }
    
    public abstract Map c();
    
    public abstract Integer d();
    
    public abstract h e();
    
    public abstract long f();
    
    public final int g(String s) {
        s = this.c().get(s);
        if (s == null) {
            return 0;
        }
        return Integer.valueOf(s);
    }
    
    public final long h(String s) {
        s = this.c().get(s);
        if (s == null) {
            return 0L;
        }
        return Long.valueOf(s);
    }
    
    public final Map i() {
        return Collections.unmodifiableMap((Map<?, ?>)this.c());
    }
    
    public abstract String j();
    
    public abstract long k();
    
    public a l() {
        return new b.b().j(this.j()).g(this.d()).h(this.e()).i(this.f()).k(this.k()).f(new HashMap(this.c()));
    }
    
    public abstract static class a
    {
        public final a a(final String s, final int i) {
            this.e().put(s, String.valueOf(i));
            return this;
        }
        
        public final a b(final String s, final long l) {
            this.e().put(s, String.valueOf(l));
            return this;
        }
        
        public final a c(final String s, final String s2) {
            this.e().put(s, s2);
            return this;
        }
        
        public abstract i d();
        
        public abstract Map e();
        
        public abstract a f(final Map p0);
        
        public abstract a g(final Integer p0);
        
        public abstract a h(final h p0);
        
        public abstract a i(final long p0);
        
        public abstract a j(final String p0);
        
        public abstract a k(final long p0);
    }
}
