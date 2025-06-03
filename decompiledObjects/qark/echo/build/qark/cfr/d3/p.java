/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package d3;

import c3.a;
import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;
import d3.s;
import h3.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import p3.l;
import p3.m;
import p3.y;
import q3.c;
import q3.r;

public final class p
extends d {
    public p() {
        super(l.class, new k3.m(a.class){

            public a c(l l8) {
                return new c(l8.X().Y());
            }
        });
    }

    public static d.a.a l(int n8, l.b b8) {
        return new d.a.a((m)m.X().y(n8).n(), b8);
    }

    public static void o(boolean bl) {
        c3.x.l(new p(), bl);
        s.c();
    }

    @Override
    public b.b a() {
        return b.b.p;
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override
    public d.a f() {
        return new d.a(m.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                l.b b8 = l.b.o;
                hashMap.put((Object)"AES128_GCM", (Object)p.l(16, b8));
                l.b b9 = l.b.q;
                hashMap.put((Object)"AES128_GCM_RAW", (Object)p.l(16, b9));
                hashMap.put((Object)"AES256_GCM", (Object)p.l(32, b8));
                hashMap.put((Object)"AES256_GCM_RAW", (Object)p.l(32, b9));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public l f(m m8) {
                return (l)l.Z().y(h.i(q3.p.c(m8.W()))).z(p.this.m()).n();
            }

            public m g(h h8) {
                return m.Y(h8, com.google.crypto.tink.shaded.protobuf.p.b());
            }

            public void h(m m8) {
                r.a(m8.W());
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

    public l n(h h8) {
        return l.a0(h8, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    public void p(l l8) {
        r.c(l8.Y(), this.m());
        r.a(l8.X().size());
    }

}

