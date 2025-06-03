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
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import d3.n;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.m;
import p3.i;
import p3.j;
import p3.k;
import p3.y;
import q3.b;
import q3.r;

public final class h
extends d {
    public h() {
        super(i.class, new m(a.class){

            public a c(i i8) {
                return new b(i8.Y().Y(), i8.Z().X());
            }
        });
    }

    public static d.a.a l(int n8, int n9, l.b b8) {
        return new d.a.a((j)j.Z().y(n8).z((k)k.Y().y(n9).n()).n(), b8);
    }

    public static void o(boolean bl) {
        c3.x.l(new h(), bl);
        n.c();
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override
    public d.a f() {
        return new d.a(j.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                l.b b8 = l.b.o;
                hashMap.put((Object)"AES128_EAX", (Object)h.l(16, 16, b8));
                l.b b9 = l.b.q;
                hashMap.put((Object)"AES128_EAX_RAW", (Object)h.l(16, 16, b9));
                hashMap.put((Object)"AES256_EAX", (Object)h.l(32, 16, b8));
                hashMap.put((Object)"AES256_EAX_RAW", (Object)h.l(32, 16, b9));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public i f(j j8) {
                return (i)i.b0().y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(j8.X()))).z(j8.Y()).A(h.this.m()).n();
            }

            public j g(com.google.crypto.tink.shaded.protobuf.h h8) {
                return j.a0(h8, p.b());
            }

            public void h(j j8) {
                r.a(j8.X());
                if (j8.Y().X() != 12) {
                    if (j8.Y().X() == 16) {
                        return;
                    }
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
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

    public i n(com.google.crypto.tink.shaded.protobuf.h h8) {
        return i.c0(h8, p.b());
    }

    public void p(i i8) {
        r.c(i8.a0(), this.m());
        r.a(i8.Y().size());
        if (i8.Z().X() != 12) {
            if (i8.Z().X() == 16) {
                return;
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

}

