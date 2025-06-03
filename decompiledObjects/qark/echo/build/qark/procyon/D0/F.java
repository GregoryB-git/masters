// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import d0.P;
import g0.A;
import android.view.Surface;
import d0.q;
import java.util.concurrent.Executor;
import java.util.List;

public interface F
{
    void A(final boolean p0);
    
    void B();
    
    void C(final List p0);
    
    void D(final long p0, final long p1);
    
    boolean E();
    
    void F(final a p0, final Executor p1);
    
    void G(final int p0, final q p1);
    
    void H(final q p0);
    
    void I(final Surface p0, final A p1);
    
    boolean J();
    
    void K(final boolean p0);
    
    void L();
    
    boolean c();
    
    boolean e();
    
    void f(final long p0, final long p1);
    
    void j();
    
    void release();
    
    void u(final float p0);
    
    void v();
    
    long w(final long p0, final boolean p1);
    
    Surface x();
    
    void y();
    
    void z(final p p0);
    
    public interface a
    {
        public static final a a = new a() {
            @Override
            public void a(final F f) {
            }
            
            @Override
            public void b(final F f) {
            }
            
            @Override
            public void c(final F f, final P p2) {
            }
        };
        
        void a(final F p0);
        
        void b(final F p0);
        
        void c(final F p0, final P p1);
    }
    
    public static final class b extends Exception
    {
        public final q o;
        
        public b(final Throwable cause, final q o) {
            super(cause);
            this.o = o;
        }
    }
}
