/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package d3;

import c3.a;
import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import d3.C;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.m;
import p3.r;
import p3.s;
import p3.y;
import q3.g;

public class z
extends d {
    public z() {
        super(r.class, new m(a.class){

            public a c(r r8) {
                return new g(r8.X().Y());
            }
        });
    }

    public static void m(boolean bl) {
        c3.x.l(new z(), bl);
        C.c();
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override
    public d.a f() {
        return new d.a(s.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"CHACHA20_POLY1305", (Object)new d.a.a(s.V(), l.b.o));
                hashMap.put((Object)"CHACHA20_POLY1305_RAW", (Object)new d.a.a(s.V(), l.b.q));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public r f(s s8) {
                return (r)r.Z().z(z.this.k()).y(h.i(q3.p.c(32))).n();
            }

            public s g(h h8) {
                return s.W(h8, p.b());
            }

            public void h(s s8) {
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

    public r l(h h8) {
        return r.a0(h8, p.b());
    }

    public void n(r r8) {
        q3.r.c(r8.Y(), this.k());
        if (r8.X().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

}

