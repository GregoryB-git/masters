// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import q3.r;
import p3.y;
import java.security.GeneralSecurityException;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.h;
import p3.H;
import c3.x;
import c3.s;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.G;
import k3.d;

public class F extends d
{
    public F() {
        super(G.class, new m[] { new m(a.class) {
                public a c(final G g) {
                    final String x = g.X().X();
                    return new E(g.X().W(), s.a(x).a(x));
                }
            } });
    }
    
    public static void m(final boolean b) {
        x.l(new F(), b);
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(H.class) {
            public G f(final H h) {
                return (G)((com.google.crypto.tink.shaded.protobuf.x.a)G.Z().y(h).z(F.this.k())).n();
            }
            
            public H g(final h h) {
                return H.Z(h, p.b());
            }
            
            public void h(final H h) {
                if (!h.X().isEmpty() && h.Y()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
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
    
    public G l(final h h) {
        return G.a0(h, p.b());
    }
    
    public void n(final G g) {
        r.c(g.Y(), this.k());
    }
}
