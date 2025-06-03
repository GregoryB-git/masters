// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.y;
import q3.r;
import q3.p;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import c3.x;
import p3.o;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.a;
import k3.m;
import p3.n;
import k3.d;

public final class u extends d
{
    public u() {
        super(n.class, new m[] { new m(a.class) {
                public a c(final n n) {
                    return new f3.a(n.X().Y());
                }
            } });
    }
    
    public static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException ex) {
            return false;
        }
    }
    
    private static d.a.a m(final int n, final l.b b) {
        return new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)o.X().y(n)).n(), b);
    }
    
    public static void p(final boolean b) {
        if (l()) {
            x.l(new u(), b);
            d3.x.c();
        }
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(o.class) {
            @Override
            public Map c() {
                final HashMap<String, d.a.a> m = new HashMap<String, d.a.a>();
                final l.b o = l.b.o;
                m.put("AES128_GCM_SIV", m(16, o));
                final l.b q = l.b.q;
                m.put("AES128_GCM_SIV_RAW", m(16, q));
                m.put("AES256_GCM_SIV", m(32, o));
                m.put("AES256_GCM_SIV_RAW", m(32, q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public n f(final o o) {
                return (n)((com.google.crypto.tink.shaded.protobuf.x.a)n.Z().y(h.i(p.c(o.W()))).z(u.this.n())).n();
            }
            
            public o g(final h h) {
                return o.Y(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final o o) {
                r.a(o.W());
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
    
    public n o(final h h) {
        return n.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void q(final n n) {
        r.c(n.Y(), this.n());
        r.a(n.X().size());
    }
}
