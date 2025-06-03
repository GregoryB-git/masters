// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import W2.k;
import java.util.List;
import g0.M;

public interface D
{
    void A(final d0.b p0, final boolean p1);
    
    boolean B();
    
    int C();
    
    int D();
    
    int E();
    
    void F(final K p0);
    
    boolean G();
    
    int H();
    
    boolean I();
    
    int J();
    
    long K();
    
    I L();
    
    int M();
    
    boolean N();
    
    K O();
    
    long P();
    
    boolean Q();
    
    int f();
    
    void g();
    
    C h();
    
    void i(final int p0);
    
    void k(final C p0);
    
    void l(final float p0);
    
    B m();
    
    void n(final boolean p0);
    
    boolean o();
    
    long p();
    
    int q();
    
    long r();
    
    void s(final int p0, final long p1);
    
    void stop();
    
    long t();
    
    boolean u();
    
    void v(final d p0);
    
    boolean w();
    
    void x(final boolean p0);
    
    void y();
    
    L z();
    
    public static final class b
    {
        public static final b b;
        public static final String c;
        public final p a;
        
        static {
            b = new a().e();
            c = M.w0(0);
        }
        
        public b(final p a) {
            this.a = a;
        }
        
        public static /* synthetic */ p a(final b b) {
            return b.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a.equals(((b)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        public static final class a
        {
            public static final int[] b;
            public final p.b a;
            
            static {
                b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32 };
            }
            
            public a() {
                this.a = new p.b();
            }
            
            public a a(final int n) {
                this.a.a(n);
                return this;
            }
            
            public a b(final b b) {
                this.a.b(D.b.a(b));
                return this;
            }
            
            public a c(final int... array) {
                this.a.c(array);
                return this;
            }
            
            public a d(final int n, final boolean b) {
                this.a.d(n, b);
                return this;
            }
            
            public b e() {
                return new b(this.a.e(), null);
            }
        }
    }
    
    public static final class c
    {
        public final p a;
        
        public c(final p a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof c && this.a.equals(((c)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public interface d
    {
        void B(final int p0);
        
        void C(final boolean p0, final int p1);
        
        void D(final K p0);
        
        void E(final B p0);
        
        void F(final d0.b p0);
        
        void G(final boolean p0);
        
        void H(final int p0);
        
        void I(final w p0);
        
        void J(final L p0);
        
        void O(final u p0, final int p1);
        
        void P(final I p0, final int p1);
        
        void Q(final boolean p0);
        
        void R();
        
        void U(final float p0);
        
        void V(final l p0);
        
        void X(final int p0);
        
        void Y(final boolean p0, final int p1);
        
        void b(final P p0);
        
        void c(final boolean p0);
        
        void e0(final B p0);
        
        void h0(final boolean p0);
        
        void i0(final int p0, final int p1);
        
        void j(final C p0);
        
        void j0(final b p0);
        
        void k(final List p0);
        
        void k0(final e p0, final e p1, final int p2);
        
        void m(final int p0);
        
        void n0(final D p0, final c p1);
        
        void q0(final int p0, final boolean p1);
        
        void r(final f0.b p0);
        
        void r0(final boolean p0);
        
        void x(final x p0);
    }
    
    public static final class e
    {
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public final Object a;
        public final int b;
        public final int c;
        public final u d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;
        
        static {
            k = M.w0(0);
            l = M.w0(1);
            m = M.w0(2);
            n = M.w0(3);
            o = M.w0(4);
            p = M.w0(5);
            q = M.w0(6);
        }
        
        public e(final Object a, final int n, final u d, final Object e, final int f, final long g, final long h, final int i, final int j) {
            this.a = a;
            this.b = n;
            this.c = n;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        public boolean a(final e e) {
            return this.c == e.c && this.f == e.f && this.g == e.g && this.h == e.h && this.i == e.i && this.j == e.j && W2.k.a(this.d, e.d);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (e.class != o.getClass()) {
                return false;
            }
            final e e = (e)o;
            return this.a(e) && W2.k.a(this.a, e.a) && W2.k.a(this.e, e.e);
        }
        
        @Override
        public int hashCode() {
            return W2.k.b(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}
