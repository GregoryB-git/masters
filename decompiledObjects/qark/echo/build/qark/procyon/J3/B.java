// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

import java.nio.charset.Charset;

public abstract class B
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static /* synthetic */ Charset a() {
        return B.a;
    }
    
    public static b b() {
        return (b)new J3.b.b();
    }
    
    public abstract a c();
    
    public abstract String d();
    
    public abstract String e();
    
    public abstract String f();
    
    public abstract String g();
    
    public abstract String h();
    
    public abstract String i();
    
    public abstract d j();
    
    public abstract int k();
    
    public abstract String l();
    
    public abstract e m();
    
    public abstract b n();
    
    public B o(final String s) {
        final b c = this.n().c(s);
        if (this.m() != null) {
            c.l(this.m().p(s));
        }
        return c.a();
    }
    
    public B p(final a a) {
        if (a == null) {
            return this;
        }
        return this.n().b(a).a();
    }
    
    public B q(final C c) {
        if (this.m() != null) {
            return this.n().l(this.m().q(c)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }
    
    public B r(final String s) {
        return this.n().f(s).a();
    }
    
    public B s(final d d) {
        return this.n().l(null).i(d).a();
    }
    
    public B t(final long n, final boolean b, final String s) {
        final b n2 = this.n();
        if (this.m() != null) {
            n2.l(this.m().r(n, b, s));
        }
        return n2.a();
    }
    
    public abstract static class a
    {
        public static b a() {
            return (b)new J3.c.b();
        }
        
        public abstract C b();
        
        public abstract int c();
        
        public abstract int d();
        
        public abstract String e();
        
        public abstract long f();
        
        public abstract int g();
        
        public abstract long h();
        
        public abstract long i();
        
        public abstract String j();
        
        public abstract static class a
        {
            public static B.a.a.a a() {
                return (B.a.a.a)new J3.d.b();
            }
            
            public abstract String b();
            
            public abstract String c();
            
            public abstract String d();
            
            public abstract static class a
            {
                public abstract B.a.a a();
                
                public abstract a b(final String p0);
                
                public abstract a c(final String p0);
                
                public abstract a d(final String p0);
            }
        }
        
        public abstract static class b
        {
            public abstract B.a a();
            
            public abstract b b(final C p0);
            
            public abstract b c(final int p0);
            
            public abstract b d(final int p0);
            
            public abstract b e(final String p0);
            
            public abstract b f(final long p0);
            
            public abstract b g(final int p0);
            
            public abstract b h(final long p0);
            
            public abstract b i(final long p0);
            
            public abstract b j(final String p0);
        }
    }
    
    public abstract static class b
    {
        public abstract B a();
        
        public abstract b b(final B.a p0);
        
        public abstract b c(final String p0);
        
        public abstract b d(final String p0);
        
        public abstract b e(final String p0);
        
        public abstract b f(final String p0);
        
        public abstract b g(final String p0);
        
        public abstract b h(final String p0);
        
        public abstract b i(final B.d p0);
        
        public abstract b j(final int p0);
        
        public abstract b k(final String p0);
        
        public abstract b l(final B.e p0);
    }
    
    public abstract static class c
    {
        public static a a() {
            return (a)new e.b();
        }
        
        public abstract String b();
        
        public abstract String c();
        
        public abstract static class a
        {
            public abstract c a();
            
            public abstract a b(final String p0);
            
            public abstract a c(final String p0);
        }
    }
    
    public abstract static class d
    {
        public static a a() {
            return (a)new J3.f.b();
        }
        
        public abstract C b();
        
        public abstract String c();
        
        public abstract static class a
        {
            public abstract d a();
            
            public abstract a b(final C p0);
            
            public abstract a c(final String p0);
        }
        
        public abstract static class b
        {
            public static a a() {
                return (a)new g.b();
            }
            
            public abstract byte[] b();
            
            public abstract String c();
            
            public abstract static class a
            {
                public abstract b a();
                
                public abstract a b(final byte[] p0);
                
                public abstract a c(final String p0);
            }
        }
    }
    
    public abstract static class e
    {
        public static b a() {
            return new h.b().d(false);
        }
        
        public abstract a b();
        
        public abstract String c();
        
        public abstract c d();
        
        public abstract Long e();
        
        public abstract C f();
        
        public abstract String g();
        
        public abstract int h();
        
        public abstract String i();
        
        public byte[] j() {
            return this.i().getBytes(B.a());
        }
        
        public abstract B.e.e k();
        
        public abstract long l();
        
        public abstract f m();
        
        public abstract boolean n();
        
        public abstract b o();
        
        public B.e p(final String s) {
            return this.o().c(s).a();
        }
        
        public B.e q(final C c) {
            return this.o().g(c).a();
        }
        
        public B.e r(final long l, final boolean b, final String s) {
            final b o = this.o();
            o.f(l);
            o.d(b);
            if (s != null) {
                o.n(f.a().b(s).a());
            }
            return o.a();
        }
        
        public abstract static class a
        {
            public static B.e.a.a a() {
                return (B.e.a.a)new i.b();
            }
            
            public abstract String b();
            
            public abstract String c();
            
            public abstract String d();
            
            public abstract String e();
            
            public abstract String f();
            
            public abstract b g();
            
            public abstract String h();
            
            public abstract static class a
            {
                public abstract B.e.a a();
                
                public abstract a b(final String p0);
                
                public abstract a c(final String p0);
                
                public abstract a d(final String p0);
                
                public abstract a e(final String p0);
                
                public abstract a f(final String p0);
                
                public abstract a g(final String p0);
            }
            
            public abstract static class b
            {
            }
        }
        
        public abstract static class b
        {
            public abstract B.e a();
            
            public abstract b b(final B.e.a p0);
            
            public abstract b c(final String p0);
            
            public abstract b d(final boolean p0);
            
            public abstract b e(final B.e.c p0);
            
            public abstract b f(final Long p0);
            
            public abstract b g(final C p0);
            
            public abstract b h(final String p0);
            
            public abstract b i(final int p0);
            
            public abstract b j(final String p0);
            
            public b k(final byte[] bytes) {
                return this.j(new String(bytes, B.a()));
            }
            
            public abstract b l(final B.e.e p0);
            
            public abstract b m(final long p0);
            
            public abstract b n(final f p0);
        }
        
        public abstract static class c
        {
            public static a a() {
                return (a)new k.b();
            }
            
            public abstract int b();
            
            public abstract int c();
            
            public abstract long d();
            
            public abstract String e();
            
            public abstract String f();
            
            public abstract String g();
            
            public abstract long h();
            
            public abstract int i();
            
            public abstract boolean j();
            
            public abstract static class a
            {
                public abstract c a();
                
                public abstract a b(final int p0);
                
                public abstract a c(final int p0);
                
                public abstract a d(final long p0);
                
                public abstract a e(final String p0);
                
                public abstract a f(final String p0);
                
                public abstract a g(final String p0);
                
                public abstract a h(final long p0);
                
                public abstract a i(final boolean p0);
                
                public abstract a j(final int p0);
            }
        }
        
        public abstract static class d
        {
            public static b a() {
                return (b)new l.b();
            }
            
            public abstract a b();
            
            public abstract c c();
            
            public abstract B.e.d.d d();
            
            public abstract long e();
            
            public abstract String f();
            
            public abstract b g();
            
            public abstract static class a
            {
                public static B.e.d.a.a a() {
                    return (B.e.d.a.a)new m.b();
                }
                
                public abstract Boolean b();
                
                public abstract C c();
                
                public abstract b d();
                
                public abstract C e();
                
                public abstract int f();
                
                public abstract B.e.d.a.a g();
                
                public abstract static class a
                {
                    public abstract B.e.d.a a();
                    
                    public abstract a b(final Boolean p0);
                    
                    public abstract a c(final C p0);
                    
                    public abstract a d(final B.e.d.a.b p0);
                    
                    public abstract a e(final C p0);
                    
                    public abstract a f(final int p0);
                }
                
                public abstract static class b
                {
                    public static B.e.d.a.b.b a() {
                        return (B.e.d.a.b.b)new n.b();
                    }
                    
                    public abstract B.a b();
                    
                    public abstract C c();
                    
                    public abstract c d();
                    
                    public abstract d e();
                    
                    public abstract C f();
                    
                    public abstract static class a
                    {
                        public static B.e.d.a.b.a.a a() {
                            return (B.e.d.a.b.a.a)new o.b();
                        }
                        
                        public abstract long b();
                        
                        public abstract String c();
                        
                        public abstract long d();
                        
                        public abstract String e();
                        
                        public byte[] f() {
                            final String e = this.e();
                            if (e != null) {
                                return e.getBytes(B.a());
                            }
                            return null;
                        }
                        
                        public abstract static class a
                        {
                            public abstract B.e.d.a.b.a a();
                            
                            public abstract a b(final long p0);
                            
                            public abstract a c(final String p0);
                            
                            public abstract a d(final long p0);
                            
                            public abstract a e(final String p0);
                            
                            public a f(final byte[] bytes) {
                                return this.e(new String(bytes, B.a()));
                            }
                        }
                    }
                    
                    public abstract static class b
                    {
                        public abstract B.e.d.a.b a();
                        
                        public abstract b b(final B.a p0);
                        
                        public abstract b c(final C p0);
                        
                        public abstract b d(final c p0);
                        
                        public abstract b e(final d p0);
                        
                        public abstract b f(final C p0);
                    }
                    
                    public abstract static class c
                    {
                        public static a a() {
                            return (a)new p.b();
                        }
                        
                        public abstract c b();
                        
                        public abstract C c();
                        
                        public abstract int d();
                        
                        public abstract String e();
                        
                        public abstract String f();
                        
                        public abstract static class a
                        {
                            public abstract c a();
                            
                            public abstract a b(final c p0);
                            
                            public abstract a c(final C p0);
                            
                            public abstract a d(final int p0);
                            
                            public abstract a e(final String p0);
                            
                            public abstract a f(final String p0);
                        }
                    }
                    
                    public abstract static class d
                    {
                        public static a a() {
                            return (a)new q.b();
                        }
                        
                        public abstract long b();
                        
                        public abstract String c();
                        
                        public abstract String d();
                        
                        public abstract static class a
                        {
                            public abstract d a();
                            
                            public abstract a b(final long p0);
                            
                            public abstract a c(final String p0);
                            
                            public abstract a d(final String p0);
                        }
                    }
                    
                    public abstract static class e
                    {
                        public static a a() {
                            return (a)new r.b();
                        }
                        
                        public abstract C b();
                        
                        public abstract int c();
                        
                        public abstract String d();
                        
                        public abstract static class a
                        {
                            public abstract e a();
                            
                            public abstract a b(final C p0);
                            
                            public abstract a c(final int p0);
                            
                            public abstract a d(final String p0);
                        }
                        
                        public abstract static class b
                        {
                            public static a a() {
                                return (a)new s.b();
                            }
                            
                            public abstract String b();
                            
                            public abstract int c();
                            
                            public abstract long d();
                            
                            public abstract long e();
                            
                            public abstract String f();
                            
                            public abstract static class a
                            {
                                public abstract b a();
                                
                                public abstract a b(final String p0);
                                
                                public abstract a c(final int p0);
                                
                                public abstract a d(final long p0);
                                
                                public abstract a e(final long p0);
                                
                                public abstract a f(final String p0);
                            }
                        }
                    }
                }
            }
            
            public abstract static class b
            {
                public abstract B.e.d a();
                
                public abstract b b(final B.e.d.a p0);
                
                public abstract b c(final B.e.d.c p0);
                
                public abstract b d(final B.e.d.d p0);
                
                public abstract b e(final long p0);
                
                public abstract b f(final String p0);
            }
            
            public abstract static class c
            {
                public static a a() {
                    return (a)new t.b();
                }
                
                public abstract Double b();
                
                public abstract int c();
                
                public abstract long d();
                
                public abstract int e();
                
                public abstract long f();
                
                public abstract boolean g();
                
                public abstract static class a
                {
                    public abstract c a();
                    
                    public abstract a b(final Double p0);
                    
                    public abstract a c(final int p0);
                    
                    public abstract a d(final long p0);
                    
                    public abstract a e(final int p0);
                    
                    public abstract a f(final boolean p0);
                    
                    public abstract a g(final long p0);
                }
            }
            
            public abstract static class d
            {
                public static a a() {
                    return (a)new u.b();
                }
                
                public abstract String b();
                
                public abstract static class a
                {
                    public abstract d a();
                    
                    public abstract a b(final String p0);
                }
            }
        }
        
        public abstract static class e
        {
            public static a a() {
                return (a)new v.b();
            }
            
            public abstract String b();
            
            public abstract int c();
            
            public abstract String d();
            
            public abstract boolean e();
            
            public abstract static class a
            {
                public abstract e a();
                
                public abstract a b(final String p0);
                
                public abstract a c(final boolean p0);
                
                public abstract a d(final int p0);
                
                public abstract a e(final String p0);
            }
        }
        
        public abstract static class f
        {
            public static a a() {
                return (a)new w.b();
            }
            
            public abstract String b();
            
            public abstract static class a
            {
                public abstract f a();
                
                public abstract a b(final String p0);
            }
        }
    }
}
