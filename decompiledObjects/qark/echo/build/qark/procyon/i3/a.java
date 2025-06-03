// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i3;

import java.security.InvalidKeyException;
import q3.r;
import p3.y;
import java.security.InvalidAlgorithmParameterException;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import c3.l;
import java.util.HashMap;
import java.util.Map;
import p3.q;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.O;
import c3.e;
import k3.m;
import p3.p;
import k3.d;

public final class a extends d
{
    public a() {
        super(p.class, new m[] { new m(e.class) {
                public e c(final p p) {
                    return new q3.d(p.X().Y());
                }
            } });
    }
    
    public static void m(final boolean b) {
        x.l(new a(), b);
    }
    
    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }
    
    @Override
    public d.a f() {
        return new d.a(q.class) {
            @Override
            public Map c() {
                final HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("AES256_SIV", new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)q.X().y(64)).n(), l.b.o));
                m.put("AES256_SIV_RAW", new d.a.a(((com.google.crypto.tink.shaded.protobuf.x.a)q.X().y(64)).n(), l.b.q));
                return Collections.unmodifiableMap((Map<?, ?>)m);
            }
            
            public p f(final q q) {
                return (p)((com.google.crypto.tink.shaded.protobuf.x.a)p.Z().y(h.i(q3.p.c(q.W()))).z(a.this.k())).n();
            }
            
            public q g(final h h) {
                return q.Y(h, com.google.crypto.tink.shaded.protobuf.p.b());
            }
            
            public void h(final q q) {
                if (q.W() == 64) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("invalid key size: ");
                sb.append(q.W());
                sb.append(". Valid keys must have ");
                sb.append(64);
                sb.append(" bytes.");
                throw new InvalidAlgorithmParameterException(sb.toString());
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
    
    public p l(final h h) {
        return p.a0(h, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void n(final p p) {
        r.c(p.Y(), this.k());
        if (p.X().size() == 64) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("invalid key size: ");
        sb.append(p.X().size());
        sb.append(". Valid keys must have ");
        sb.append(64);
        sb.append(" bytes.");
        throw new InvalidKeyException(sb.toString());
    }
}
