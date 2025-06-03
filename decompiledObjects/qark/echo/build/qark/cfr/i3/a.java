/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.InvalidKeyException
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package i3;

import c3.e;
import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import k3.m;
import p3.p;
import p3.q;
import p3.y;
import q3.d;
import q3.r;

public final class a
extends k3.d {
    public a() {
        super(p3.p.class, new m(e.class){

            public e c(p3.p p8) {
                return new d(p8.X().Y());
            }
        });
    }

    public static void m(boolean bl) {
        c3.x.l(new a(), bl);
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override
    public d.a f() {
        return new d.a(q.class){

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"AES256_SIV", (Object)new d.a.a((q)q.X().y(64).n(), l.b.o));
                hashMap.put((Object)"AES256_SIV_RAW", (Object)new d.a.a((q)q.X().y(64).n(), l.b.q));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public p3.p f(q q8) {
                return (p3.p)p3.p.Z().y(h.i(q3.p.c(q8.W()))).z(a.this.k()).n();
            }

            public q g(h h8) {
                return q.Y(h8, p.b());
            }

            public void h(q q8) {
                if (q8.W() == 64) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid key size: ");
                stringBuilder.append(q8.W());
                stringBuilder.append(". Valid keys must have ");
                stringBuilder.append(64);
                stringBuilder.append(" bytes.");
                throw new InvalidAlgorithmParameterException(stringBuilder.toString());
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

    public p3.p l(h h8) {
        return p3.p.a0(h8, p.b());
    }

    public void n(p3.p p8) {
        r.c(p8.Y(), this.k());
        if (p8.X().size() == 64) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid key size: ");
        stringBuilder.append(p8.X().size());
        stringBuilder.append(". Valid keys must have ");
        stringBuilder.append(64);
        stringBuilder.append(" bytes.");
        throw new InvalidKeyException(stringBuilder.toString());
    }

}

