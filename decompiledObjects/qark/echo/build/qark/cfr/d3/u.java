/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.security.NoSuchAlgorithmException
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  javax.crypto.Cipher
 *  javax.crypto.NoSuchPaddingException
 */
package d3;

import c3.a;
import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import d3.x;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import k3.d;
import k3.m;
import p3.n;
import p3.o;
import p3.y;
import q3.r;

public final class u
extends d {
    public u() {
        super(n.class, new m(a.class){

            public a c(n n8) {
                return new f3.a(n8.X().Y());
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l() {
        try {
            Cipher.getInstance((String)"AES/GCM-SIV/NoPadding");
            return true;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException noSuchAlgorithmException) {
            return false;
        }
    }

    private static d.a.a m(int n8, l.b b8) {
        return new d.a.a((o)o.X().y(n8).n(), b8);
    }

    public static void p(boolean bl) {
        if (u.l()) {
            c3.x.l(new u(), bl);
            x.c();
        }
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override
    public d.a f() {
        return new d.a(o.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                l.b b8 = l.b.o;
                hashMap.put((Object)"AES128_GCM_SIV", (Object)u.m(16, b8));
                l.b b9 = l.b.q;
                hashMap.put((Object)"AES128_GCM_SIV_RAW", (Object)u.m(16, b9));
                hashMap.put((Object)"AES256_GCM_SIV", (Object)u.m(32, b8));
                hashMap.put((Object)"AES256_GCM_SIV_RAW", (Object)u.m(32, b9));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public n f(o o8) {
                return (n)n.Z().y(h.i(q3.p.c(o8.W()))).z(u.this.n()).n();
            }

            public o g(h h8) {
                return o.Y(h8, p.b());
            }

            public void h(o o8) {
                r.a(o8.W());
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

    public n o(h h8) {
        return n.a0(h8, p.b());
    }

    public void q(n n8) {
        r.c(n8.Y(), this.n());
        r.a(n8.X().size());
    }

}

