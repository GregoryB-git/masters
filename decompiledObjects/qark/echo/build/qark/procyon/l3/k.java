// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import q3.r;
import p3.y;
import q3.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import h3.b;
import k3.h;
import p3.w;
import p3.x;
import p3.u;
import java.security.GeneralSecurityException;
import o3.a;
import q3.o;
import java.security.Key;
import q3.n;
import javax.crypto.spec.SecretKeySpec;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.t;
import k3.m;
import p3.v;
import k3.l;
import k3.d;

public final class k extends d
{
    public static final l d;
    
    static {
        d = l.b((l.b)new j(), i.class, g.class);
    }
    
    public k() {
        super(v.class, new m[] { new m(t.class) {
                public t c(final v v) {
                    final u y = v.a0().Y();
                    final SecretKeySpec secretKeySpec = new SecretKeySpec(v.Z().Y(), "HMAC");
                    final int z = v.a0().Z();
                    final int n = k$c.a[y.ordinal()];
                    if (n == 1) {
                        return new o(new n("HMACSHA1", secretKeySpec), z);
                    }
                    if (n == 2) {
                        return new o(new n("HMACSHA224", secretKeySpec), z);
                    }
                    if (n == 3) {
                        return new o(new n("HMACSHA256", secretKeySpec), z);
                    }
                    if (n == 4) {
                        return new o(new n("HMACSHA384", secretKeySpec), z);
                    }
                    if (n == 5) {
                        return new o(new n("HMACSHA512", secretKeySpec), z);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
            } });
    }
    
    public static d.a.a m(final int n, final int n2, final u u, final c3.l.b b) {
        return new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)w.a0().z((x)((com.google.crypto.tink.shaded.protobuf.x.a)x.a0().y(u).z(n2)).n()).y(n)).n(), b);
    }
    
    public static void p(final boolean b) {
        c3.x.l(new k(), b);
        l3.n.c();
        h.c().d(k.d);
    }
    
    public static void r(final x x) {
        if (x.Z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        final int n = k$c.a[x.Y().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (x.Z() <= 64) {
                            return;
                        }
                        throw new GeneralSecurityException("tag size too big");
                    }
                    else {
                        if (x.Z() <= 48) {
                            return;
                        }
                        throw new GeneralSecurityException("tag size too big");
                    }
                }
                else {
                    if (x.Z() <= 32) {
                        return;
                    }
                    throw new GeneralSecurityException("tag size too big");
                }
            }
            else {
                if (x.Z() <= 28) {
                    return;
                }
                throw new GeneralSecurityException("tag size too big");
            }
        }
        else {
            if (x.Z() <= 20) {
                return;
            }
            throw new GeneralSecurityException("tag size too big");
        }
    }
    
    @Override
    public b.b a() {
        return h3.b.b.p;
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(w.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final u s = u.s;
                final c3.l.b o = c3.l.b.o;
                m.put("HMAC_SHA256_128BITTAG", m(32, 16, s, o));
                final c3.l.b q = c3.l.b.q;
                m.put("HMAC_SHA256_128BITTAG_RAW", m(32, 16, s, q));
                m.put("HMAC_SHA256_256BITTAG", m(32, 32, s, o));
                m.put("HMAC_SHA256_256BITTAG_RAW", m(32, 32, s, q));
                final u t = u.t;
                m.put("HMAC_SHA512_128BITTAG", m(64, 16, t, o));
                m.put("HMAC_SHA512_128BITTAG_RAW", m(64, 16, t, q));
                m.put("HMAC_SHA512_256BITTAG", m(64, 32, t, o));
                m.put("HMAC_SHA512_256BITTAG_RAW", m(64, 32, t, q));
                m.put("HMAC_SHA512_512BITTAG", m(64, 64, t, o));
                m.put("HMAC_SHA512_512BITTAG_RAW", m(64, 64, t, q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public v f(final w w) {
                return (v)((com.google.crypto.tink.shaded.protobuf.x.a)v.c0().A(k.this.n()).z(w.Z()).y(com.google.crypto.tink.shaded.protobuf.h.i(p.c(w.Y())))).n();
            }
            
            public w g(final com.google.crypto.tink.shaded.protobuf.h h) {
                return w.b0(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final w w) {
                if (w.Y() >= 16) {
                    r(w.Z());
                    return;
                }
                throw new GeneralSecurityException("key too short");
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
    
    public v o(final com.google.crypto.tink.shaded.protobuf.h h) {
        return v.d0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void q(final v v) {
        r.c(v.b0(), this.n());
        if (v.Z().size() >= 16) {
            r(v.a0());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
