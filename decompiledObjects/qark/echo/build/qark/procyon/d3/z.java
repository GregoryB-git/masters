// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.security.GeneralSecurityException;
import p3.y;
import q3.p;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import c3.l;
import java.util.HashMap;
import java.util.Map;
import p3.s;
import c3.x;
import q3.g;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.r;
import k3.d;

public class z extends d
{
    public z() {
        super(r.class, new m[] { new m(a.class) {
                public a c(final r r) {
                    return new g(r.X().Y());
                }
            } });
    }
    
    public static void m(final boolean b) {
        x.l(new z(), b);
        C.c();
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
    
    @Override
    public d.a f() {
        return new d.a(s.class) {
            @Override
            public Map c() {
                final HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("CHACHA20_POLY1305", new d.a.a(s.V(), l.b.o));
                m.put("CHACHA20_POLY1305_RAW", new d.a.a(s.V(), l.b.q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public r f(final s s) {
                return (r)((com.google.crypto.tink.shaded.protobuf.x.a)r.Z().z(z.this.k()).y(h.i(p.c(32)))).n();
            }
            
            public s g(final h h) {
                return s.W(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final s s) {
            }
        };
    }
    
    @Override
    public y.c g() {
        return y.c.q;
    }
    
    public int k() {
        return 0;
    }
    
    public r l(final h h) {
        return r.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void n(final r r) {
        q3.r.c(r.Y(), this.k());
        if (r.X().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
