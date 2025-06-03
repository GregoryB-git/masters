// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.y;
import java.security.GeneralSecurityException;
import q3.r;
import q3.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import c3.x;
import p3.k;
import p3.j;
import c3.l;
import q3.b;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.i;
import k3.d;

public final class h extends d
{
    public h() {
        super(i.class, new m[] { new m(a.class) {
                public a c(final i i) {
                    return new b(i.Y().Y(), i.Z().X());
                }
            } });
    }
    
    public static d.a.a l(final int n, final int n2, final l.b b) {
        return new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)j.Z().y(n).z((k)((com.google.crypto.tink.shaded.protobuf.x.a)k.Y().y(n2)).n())).n(), b);
    }
    
    public static void o(final boolean b) {
        x.l(new h(), b);
        n.c();
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(j.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final l.b o = l.b.o;
                m.put("AES128_EAX", l(16, 16, o));
                final l.b q = l.b.q;
                m.put("AES128_EAX_RAW", l(16, 16, q));
                m.put("AES256_EAX", l(32, 16, o));
                m.put("AES256_EAX_RAW", l(32, 16, q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public i f(final j j) {
                return (i)((com.google.crypto.tink.shaded.protobuf.x.a)i.b0().y(com.google.crypto.tink.shaded.protobuf.h.i(p.c(j.X()))).z(j.Y()).A(h.this.m())).n();
            }
            
            public j g(final com.google.crypto.tink.shaded.protobuf.h h) {
                return j.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final j j) {
                r.a(j.X());
                if (j.Y().X() == 12) {
                    return;
                }
                if (j.Y().X() == 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
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
    
    public i n(final com.google.crypto.tink.shaded.protobuf.h h) {
        return i.c0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void p(final i i) {
        r.c(i.a0(), this.m());
        r.a(i.Y().size());
        if (i.Z().X() == 12) {
            return;
        }
        if (i.Z().X() == 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
