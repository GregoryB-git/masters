// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import q3.r;
import p3.y;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.h;
import p3.F;
import c3.x;
import c3.s;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.E;
import k3.d;

public class D extends d
{
    public D() {
        super(E.class, new m[] { new m(a.class) {
                public a c(final E e) {
                    final String w = e.X().W();
                    return s.a(w).a(w);
                }
            } });
    }
    
    public static void m(final boolean b) {
        x.l(new D(), b);
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(F.class) {
            public E f(final F f) {
                return (E)((com.google.crypto.tink.shaded.protobuf.x.a)E.Z().y(f).z(D.this.k())).n();
            }
            
            public F g(final h h) {
                return F.X(h, p.b());
            }
            
            public void h(final F f) {
            }
        };
    }
    
    @Override
    public y.c g() {
        return y.c.t;
    }
    
    public int k() {
        return 0;
    }
    
    public E l(final h h) {
        return E.a0(h, p.b());
    }
    
    public void n(final E e) {
        r.c(e.Y(), this.k());
    }
}
