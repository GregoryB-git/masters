// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.y;
import q3.r;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import h3.b;
import c3.x;
import q3.c;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.l;
import k3.d;

public final class p extends d
{
    public p() {
        super(l.class, new m[] { new m(a.class) {
                public a c(final l l) {
                    return new c(l.X().Y());
                }
            } });
    }
    
    public static d.a.a l(final int n, final c3.l.b b) {
        return new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)p3.m.X().y(n)).n(), b);
    }
    
    public static void o(final boolean b) {
        x.l(new p(), b);
        s.c();
    }
    
    @Override
    public b.b a() {
        return h3.b.b.p;
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(p3.m.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final c3.l.b o = c3.l.b.o;
                m.put("AES128_GCM", l(16, o));
                final c3.l.b q = c3.l.b.q;
                m.put("AES128_GCM_RAW", l(16, q));
                m.put("AES256_GCM", l(32, o));
                m.put("AES256_GCM_RAW", l(32, q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public l f(final p3.m m) {
                return (l)((com.google.crypto.tink.shaded.protobuf.x.a)l.Z().y(h.i(q3.p.c(m.W()))).z(p.this.m())).n();
            }
            
            public p3.m g(final h h) {
                return p3.m.Y(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final p3.m m) {
                r.a(m.W());
            }
        };
    }
    
    @Override
    public y.c g() {
        return y.c.q;
    }
    
    public int m() {
        return 0;
    }
    
    public l n(final h h) {
        return l.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void p(final l l) {
        r.c(l.Y(), this.m());
        r.a(l.X().size());
    }
}
