// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.y;
import q3.r;
import com.google.crypto.tink.shaded.protobuf.p;
import p3.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import h3.b;
import p3.x;
import p3.w;
import p3.g;
import p3.u;
import q3.h;
import l3.k;
import c3.t;
import q3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import k3.d;

public final class e extends d
{
    public e() {
        super(p3.d.class, new m[] { new m(a.class) {
                public a c(final p3.d d) {
                    return new h((l)new f().e(d.Y(), l.class), (t)new k().e(d.Z(), t.class), d.Z().a0().Z());
                }
            } });
    }
    
    public static d.a.a l(final int n, final int n2, final int n3, final int n4, final u u, final c3.l.b b) {
        return new d.a.a(m(n, n2, n3, n4, u), b);
    }
    
    public static p3.e m(final int n, final int n2, final int n3, final int n4, final u u) {
        return (p3.e)((com.google.crypto.tink.shaded.protobuf.x.a)p3.e.Z().y((g)((com.google.crypto.tink.shaded.protobuf.x.a)g.a0().z((p3.h)((com.google.crypto.tink.shaded.protobuf.x.a)p3.h.Y().y(n2)).n()).y(n)).n()).z((w)((com.google.crypto.tink.shaded.protobuf.x.a)w.a0().z((x)((com.google.crypto.tink.shaded.protobuf.x.a)x.a0().y(u).z(n4)).n()).y(n3)).n())).n();
    }
    
    public static void p(final boolean b) {
        c3.x.l(new e(), b);
    }
    
    @Override
    public b.b a() {
        return h3.b.b.p;
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(p3.e.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final u s = u.s;
                final c3.l.b o = c3.l.b.o;
                m.put("AES128_CTR_HMAC_SHA256", l(16, 16, 32, 16, s, o));
                final c3.l.b q = c3.l.b.q;
                m.put("AES128_CTR_HMAC_SHA256_RAW", l(16, 16, 32, 16, s, q));
                m.put("AES256_CTR_HMAC_SHA256", l(32, 16, 32, 32, s, o));
                m.put("AES256_CTR_HMAC_SHA256_RAW", l(32, 16, 32, 32, s, q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public p3.d f(final p3.e e) {
                return (p3.d)((com.google.crypto.tink.shaded.protobuf.x.a)p3.d.b0().y((p3.f)new f().f().a(e.X())).z((v)new k().f().a(e.Y())).A(e.this.n())).n();
            }
            
            public p3.e g(final com.google.crypto.tink.shaded.protobuf.h h) {
                return p3.e.a0(h, p.b());
            }
            
            public void h(final p3.e e) {
                new f().f().e(e.X());
                new k().f().e(e.Y());
                r.a(e.X().Y());
            }
        };
    }
    
    @Override
    public y.c g() {
        return y.c.q;
    }
    
    public int n() {
        return 0;
    }
    
    public p3.d o(final com.google.crypto.tink.shaded.protobuf.h h) {
        return p3.d.c0(h, p.b());
    }
    
    public void q(final p3.d d) {
        r.c(d.a0(), this.n());
        new f().n(d.Y());
        new k().q(d.Z());
    }
}
