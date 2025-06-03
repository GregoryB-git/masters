// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.security.GeneralSecurityException;
import q3.r;
import p3.y;
import q3.p;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import c3.l;
import java.util.HashMap;
import java.util.Map;
import p3.L;
import c3.x;
import q3.s;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.K;
import k3.d;

public class H extends d
{
    public H() {
        super(K.class, new m[] { new m(a.class) {
                public a c(final K k) {
                    return new s(k.X().Y());
                }
            } });
    }
    
    public static void m(final boolean b) {
        x.l(new H(), b);
        d3.K.c();
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
    
    @Override
    public d.a f() {
        return new d.a(L.class) {
            @Override
            public Map c() {
                final HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("XCHACHA20_POLY1305", new d.a.a(L.V(), l.b.o));
                m.put("XCHACHA20_POLY1305_RAW", new d.a.a(L.V(), l.b.q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public K f(final L l) {
                return (K)((com.google.crypto.tink.shaded.protobuf.x.a)K.Z().z(H.this.k()).y(h.i(p.c(32)))).n();
            }
            
            public L g(final h h) {
                return L.W(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final L l) {
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
    
    public K l(final h h) {
        return K.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void n(final K k) {
        r.c(k.Y(), this.k());
        if (k.X().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
