/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 */
package d3;

import c3.a;
import c3.s;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import d3.E;
import java.security.GeneralSecurityException;
import k3.d;
import k3.m;
import p3.A;
import p3.G;
import p3.H;
import p3.y;
import q3.r;

public class F
extends d {
    public F() {
        super(G.class, new m(a.class){

            public a c(G g8) {
                Object object = g8.X().X();
                object = s.a((String)object).a((String)object);
                return new E(g8.X().W(), (a)object);
            }
        });
    }

    public static void m(boolean bl) {
        c3.x.l(new F(), bl);
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override
    public d.a f() {
        return new d.a(H.class){

            public G f(H h8) {
                return (G)G.Z().y(h8).z(F.this.k()).n();
            }

            public H g(h h8) {
                return H.Z(h8, p.b());
            }

            public void h(H h8) {
                if (!h8.X().isEmpty() && h8.Y()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        };
    }

    @Override
    public y.c g() {
        return y.c.t;
    }

    public int k() {
        return 0;
    }

    public G l(h h8) {
        return G.a0(h8, p.b());
    }

    public void n(G g8) {
        r.c(g8.Y(), this.k());
    }

}

