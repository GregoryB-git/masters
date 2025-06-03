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
import c3.t;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import d3.f;
import h3.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.m;
import l3.k;
import p3.d;
import p3.e;
import p3.g;
import p3.h;
import p3.u;
import p3.v;
import p3.w;
import p3.x;
import p3.y;
import q3.l;
import q3.r;

public final class e
extends d {
    public e() {
        super(p3.d.class, new m(a.class){

            public a c(p3.d d8) {
                return new q3.h((l)new f().e(d8.Y(), l.class), (t)new k().e(d8.Z(), t.class), d8.Z().a0().Z());
            }
        });
    }

    public static d.a.a l(int n8, int n9, int n10, int n11, u u8, l.b b8) {
        return new d.a.a(e.m(n8, n9, n10, n11, u8), b8);
    }

    public static p3.e m(int n8, int n9, int n10, int n11, u object) {
        g g8 = (g)g.a0().z((p3.h)p3.h.Y().y(n9).n()).y(n8).n();
        object = (w)w.a0().z((p3.x)p3.x.a0().y((u)object).z(n11).n()).y(n10).n();
        return (p3.e)p3.e.Z().y(g8).z((w)object).n();
    }

    public static void p(boolean bl) {
        c3.x.l(new e(), bl);
    }

    @Override
    public b.b a() {
        return b.b.p;
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override
    public d.a f() {
        return new d.a(p3.e.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                u u8 = u.s;
                l.b b8 = l.b.o;
                hashMap.put((Object)"AES128_CTR_HMAC_SHA256", (Object)e.l(16, 16, 32, 16, u8, b8));
                l.b b9 = l.b.q;
                hashMap.put((Object)"AES128_CTR_HMAC_SHA256_RAW", (Object)e.l(16, 16, 32, 16, u8, b9));
                hashMap.put((Object)"AES256_CTR_HMAC_SHA256", (Object)e.l(32, 16, 32, 32, u8, b8));
                hashMap.put((Object)"AES256_CTR_HMAC_SHA256_RAW", (Object)e.l(32, 16, 32, 32, u8, b9));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public p3.d f(p3.e x8) {
                p3.f f8 = (p3.f)new f().f().a(x8.X());
                x8 = (v)new k().f().a(x8.Y());
                return (p3.d)p3.d.b0().y(f8).z((v)x8).A(e.this.n()).n();
            }

            public p3.e g(h h8) {
                return p3.e.a0(h8, p.b());
            }

            public void h(p3.e e8) {
                new f().f().e(e8.X());
                new k().f().e(e8.Y());
                r.a(e8.X().Y());
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

    public p3.d o(h h8) {
        return p3.d.c0(h8, p.b());
    }

    public void q(p3.d d8) {
        r.c(d8.a0(), this.n());
        new f().n(d8.Y());
        new k().q(d8.Z());
    }

}

