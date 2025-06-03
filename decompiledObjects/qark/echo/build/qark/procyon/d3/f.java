// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import com.google.crypto.tink.shaded.protobuf.x;
import java.security.GeneralSecurityException;
import p3.y;
import q3.r;
import q3.p;
import p3.g;
import p3.h;
import q3.a;
import com.google.crypto.tink.shaded.protobuf.O;
import q3.l;
import k3.m;
import k3.d;

public class f extends d
{
    public f() {
        super(p3.f.class, new m[] { new m(l.class) {
                public l c(final p3.f f) {
                    return new a(f.Z().Y(), f.a0().X());
                }
            } });
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(g.class) {
            public p3.f f(final g g) {
                return (p3.f)((x.a)p3.f.c0().z(g.Z()).y(com.google.crypto.tink.shaded.protobuf.h.i(p.c(g.Y()))).A(f.this.l())).n();
            }
            
            public g g(final com.google.crypto.tink.shaded.protobuf.h h) {
                return g.b0(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final g g) {
                r.a(g.Y());
                f.this.o(g.Z());
            }
        };
    }
    
    @Override
    public y.c g() {
        return y.c.q;
    }
    
    public int l() {
        return 0;
    }
    
    public p3.f m(final com.google.crypto.tink.shaded.protobuf.h h) {
        return p3.f.d0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void n(final p3.f f) {
        r.c(f.b0(), this.l());
        r.a(f.Z().size());
        this.o(f.a0());
    }
    
    public final void o(final h h) {
        if (h.X() >= 12 && h.X() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
