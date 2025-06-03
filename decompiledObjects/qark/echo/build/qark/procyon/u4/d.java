// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u4;

public abstract class d
{
    public static d a;
    
    static {
        d.a = a().a();
    }
    
    public static a a() {
        return new u4.a.b().h(0L).g(c.a.o).c(0L);
    }
    
    public abstract String b();
    
    public abstract long c();
    
    public abstract String d();
    
    public abstract String e();
    
    public abstract String f();
    
    public abstract c.a g();
    
    public abstract long h();
    
    public boolean i() {
        return this.g() == c.a.s;
    }
    
    public boolean j() {
        return this.g() == c.a.p || this.g() == c.a.o;
    }
    
    public boolean k() {
        return this.g() == c.a.r;
    }
    
    public boolean l() {
        return this.g() == c.a.q;
    }
    
    public boolean m() {
        return this.g() == c.a.o;
    }
    
    public abstract a n();
    
    public d o(final String s, final long n, final long n2) {
        return this.n().b(s).c(n).h(n2).a();
    }
    
    public d p() {
        return this.n().b(null).a();
    }
    
    public d q(final String s) {
        return this.n().e(s).g(c.a.s).a();
    }
    
    public d r() {
        return this.n().g(c.a.p).a();
    }
    
    public d s(final String s, final String s2, final long n, final String s3, final long n2) {
        return this.n().d(s).g(c.a.r).b(s3).f(s2).c(n2).h(n).a();
    }
    
    public d t(final String s) {
        return this.n().d(s).g(c.a.q).a();
    }
    
    public abstract static class a
    {
        public abstract d a();
        
        public abstract a b(final String p0);
        
        public abstract a c(final long p0);
        
        public abstract a d(final String p0);
        
        public abstract a e(final String p0);
        
        public abstract a f(final String p0);
        
        public abstract a g(final c.a p0);
        
        public abstract a h(final long p0);
    }
}
