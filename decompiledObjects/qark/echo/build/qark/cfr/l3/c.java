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
package l3;

import c3.l;
import c3.t;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import l3.a;
import l3.b;
import l3.f;
import l3.g;
import p3.a;
import p3.b;
import p3.c;
import p3.y;
import q3.m;
import q3.o;
import q3.r;

public final class c
extends d {
    public static final k3.l d = k3.l.b(new b(), a.class, g.class);

    public c() {
        super(p3.a.class, new k3.m(t.class){

            public t c(p3.a a8) {
                return new o(new m(a8.Y().Y()), a8.Z().X());
            }
        });
    }

    public static void o(boolean bl) {
        c3.x.l(new c(), bl);
        f.c();
        k3.h.c().d(d);
    }

    public static void q(p3.c c8) {
        if (c8.X() >= 10) {
            if (c8.X() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void r(int n8) {
        if (n8 == 32) {
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
        return new d.a(p3.b.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                p3.b b8 = (p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n();
                l.b b9 = l.b.o;
                hashMap.put((Object)"AES_CMAC", (Object)new d.a.a(b8, b9));
                hashMap.put((Object)"AES256_CMAC", (Object)new d.a.a((p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), b9));
                hashMap.put((Object)"AES256_CMAC_RAW", (Object)new d.a.a((p3.b)p3.b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), l.b.q));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public p3.a f(p3.b b8) {
                return (p3.a)p3.a.b0().A(0).y(h.i(q3.p.c(b8.X()))).z(b8.Y()).n();
            }

            public p3.b g(h h8) {
                return p3.b.a0(h8, p.b());
            }

            public void h(p3.b b8) {
                c.q(b8.Y());
                c.r(b8.X());
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

    public p3.a n(h h8) {
        return p3.a.c0(h8, p.b());
    }

    public void p(p3.a a8) {
        r.c(a8.a0(), this.m());
        c.r(a8.Y().size());
        c.q(a8.Z());
    }

}

