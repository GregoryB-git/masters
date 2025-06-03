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
import java.security.GeneralSecurityException;
import k3.h;
import c3.x;
import q3.o;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.t;
import k3.m;
import k3.l;
import k3.d;

public final class c extends d
{
    public static final l d;
    
    static {
        d = l.b((l.b)new b(), a.class, g.class);
    }
    
    public c() {
        super(p3.a.class, new m[] { new m(t.class) {
                public t c(final p3.a a) {
                    return new o(new q3.m(a.Y().Y()), a.Z().X());
                }
            } });
    }
    
    public static void o(final boolean b) {
        x.l(new c(), b);
        f.c();
        h.c().d(c.d);
    }
    
    public static void q(final p3.c c) {
        if (c.X() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c.X() <= 16) {
            return;
        }
        throw new GeneralSecurityException("tag size too long");
    }
    
    public static void r(final int n) {
        if (n == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(p3.b.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final p3.b b = (p3.b)((com.google.crypto.tink.shaded.protobuf.x.a)p3.b.Z().y(32).z((p3.c)((com.google.crypto.tink.shaded.protobuf.x.a)c.Y().y(16)).n())).n();
                final c3.l.b o = c3.l.b.o;
                m.put("AES_CMAC", new d.a.a(b, o));
                m.put("AES256_CMAC", new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)p3.b.Z().y(32).z((p3.c)((com.google.crypto.tink.shaded.protobuf.x.a)c.Y().y(16)).n())).n(), o));
                m.put("AES256_CMAC_RAW", new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)p3.b.Z().y(32).z((p3.c)((com.google.crypto.tink.shaded.protobuf.x.a)c.Y().y(16)).n())).n(), c3.l.b.q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public p3.a f(final p3.b b) {
                return (p3.a)((com.google.crypto.tink.shaded.protobuf.x.a)p3.a.b0().A(0).y(com.google.crypto.tink.shaded.protobuf.h.i(p.c(b.X()))).z(b.Y())).n();
            }
            
            public p3.b g(final com.google.crypto.tink.shaded.protobuf.h h) {
                return p3.b.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final p3.b b) {
                q(b.Y());
                r(b.X());
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
    
    public p3.a n(final com.google.crypto.tink.shaded.protobuf.h h) {
        return p3.a.c0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void p(final p3.a a) {
        r.c(a.a0(), this.m());
        r(a.Y().size());
        q(a.Z());
    }
}
