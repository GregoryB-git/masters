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
import d3.K;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.m;
import p3.K;
import p3.L;
import p3.y;
import q3.r;
import q3.s;

public class H
extends d {
    public H() {
        super(p3.K.class, new m(a.class){

            public a c(p3.K k8) {
                return new s(k8.X().Y());
            }
        });
    }

    public static void m(boolean bl) {
        c3.x.l(new H(), bl);
        K.c();
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override
    public d.a f() {
        return new d.a(L.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"XCHACHA20_POLY1305", (Object)new d.a.a(L.V(), l.b.o));
                hashMap.put((Object)"XCHACHA20_POLY1305_RAW", (Object)new d.a.a(L.V(), l.b.q));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public p3.K f(L l8) {
                return (p3.K)p3.K.Z().z(H.this.k()).y(h.i(q3.p.c(32))).n();
            }

            public L g(h h8) {
                return L.W(h8, p.b());
            }

            public void h(L l8) {
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

    public p3.K l(h h8) {
        return p3.K.a0(h8, p.b());
    }

    public void n(p3.K k8) {
        r.c(k8.Y(), this.k());
        if (k8.X().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }

}

