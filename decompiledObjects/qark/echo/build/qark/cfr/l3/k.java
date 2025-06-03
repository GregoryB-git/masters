/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  javax.crypto.spec.SecretKeySpec
 */
package l3;

import c3.l;
import c3.t;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import h3.b;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import k3.d;
import k3.m;
import l3.g;
import l3.i;
import l3.j;
import l3.n;
import o3.a;
import p3.u;
import p3.v;
import p3.w;
import p3.x;
import p3.y;
import q3.o;
import q3.r;

public final class k
extends d {
    public static final k3.l d = k3.l.b(new j(), i.class, g.class);

    public k() {
        super(v.class, new m(t.class){

            public t c(v v8) {
                u u8 = v8.a0().Y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(v8.Z().Y(), "HMAC");
                int n8 = v8.a0().Z();
                int n9 = .a[u8.ordinal()];
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    return new o(new q3.n("HMACSHA512", (Key)secretKeySpec), n8);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new o(new q3.n("HMACSHA384", (Key)secretKeySpec), n8);
                        }
                        return new o(new q3.n("HMACSHA256", (Key)secretKeySpec), n8);
                    }
                    return new o(new q3.n("HMACSHA224", (Key)secretKeySpec), n8);
                }
                return new o(new q3.n("HMACSHA1", (Key)secretKeySpec), n8);
            }
        });
    }

    public static d.a.a m(int n8, int n9, u u8, l.b b8) {
        return new d.a.a((w)w.a0().z((x)x.a0().y(u8).z(n9).n()).y(n8).n(), b8);
    }

    public static void p(boolean bl) {
        c3.x.l(new k(), bl);
        n.c();
        k3.h.c().d(d);
    }

    public static void r(x x8) {
        if (x8.Z() >= 10) {
            int n8 = .a[x8.Y().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                if (x8.Z() <= 64) {
                                    return;
                                }
                                throw new GeneralSecurityException("tag size too big");
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (x8.Z() <= 48) {
                            return;
                        }
                        throw new GeneralSecurityException("tag size too big");
                    }
                    if (x8.Z() <= 32) {
                        return;
                    }
                    throw new GeneralSecurityException("tag size too big");
                }
                if (x8.Z() <= 28) {
                    return;
                }
                throw new GeneralSecurityException("tag size too big");
            }
            if (x8.Z() <= 20) {
                return;
            }
            throw new GeneralSecurityException("tag size too big");
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override
    public b.b a() {
        return b.b.p;
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override
    public d.a f() {
        return new d.a(w.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                u u8 = u.s;
                l.b b8 = l.b.o;
                hashMap.put((Object)"HMAC_SHA256_128BITTAG", (Object)k.m(32, 16, u8, b8));
                l.b b9 = l.b.q;
                hashMap.put((Object)"HMAC_SHA256_128BITTAG_RAW", (Object)k.m(32, 16, u8, b9));
                hashMap.put((Object)"HMAC_SHA256_256BITTAG", (Object)k.m(32, 32, u8, b8));
                hashMap.put((Object)"HMAC_SHA256_256BITTAG_RAW", (Object)k.m(32, 32, u8, b9));
                u8 = u.t;
                hashMap.put((Object)"HMAC_SHA512_128BITTAG", (Object)k.m(64, 16, u8, b8));
                hashMap.put((Object)"HMAC_SHA512_128BITTAG_RAW", (Object)k.m(64, 16, u8, b9));
                hashMap.put((Object)"HMAC_SHA512_256BITTAG", (Object)k.m(64, 32, u8, b8));
                hashMap.put((Object)"HMAC_SHA512_256BITTAG_RAW", (Object)k.m(64, 32, u8, b9));
                hashMap.put((Object)"HMAC_SHA512_512BITTAG", (Object)k.m(64, 64, u8, b8));
                hashMap.put((Object)"HMAC_SHA512_512BITTAG_RAW", (Object)k.m(64, 64, u8, b9));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public v f(w w8) {
                return (v)v.c0().A(k.this.n()).z(w8.Z()).y(h.i(q3.p.c(w8.Y()))).n();
            }

            public w g(h h8) {
                return w.b0(h8, p.b());
            }

            public void h(w w8) {
                if (w8.Y() >= 16) {
                    k.r(w8.Z());
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

    public v o(h h8) {
        return v.d0(h8, p.b());
    }

    public void q(v v8) {
        r.c(v8.b0(), this.n());
        if (v8.Z().size() >= 16) {
            k.r(v8.a0());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

}

