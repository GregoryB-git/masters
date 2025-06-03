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

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import java.security.GeneralSecurityException;
import k3.d;
import k3.m;
import p3.f;
import p3.g;
import p3.h;
import p3.y;
import q3.a;
import q3.l;
import q3.r;

public class f
extends d {
    public f() {
        super(p3.f.class, new m(l.class){

            public l c(p3.f f8) {
                return new a(f8.Z().Y(), f8.a0().X());
            }
        });
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override
    public d.a f() {
        return new d.a(g.class){

            public p3.f f(g g8) {
                return (p3.f)p3.f.c0().z(g8.Z()).y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(g8.Y()))).A(f.this.l()).n();
            }

            public g g(com.google.crypto.tink.shaded.protobuf.h h8) {
                return g.b0(h8, p.b());
            }

            public void h(g g8) {
                r.a(g8.Y());
                f.this.o(g8.Z());
            }
        };
    }

    @Override
    public y.c g() {
        return y.c.q;
    }

    public int l() {
        return 0;
    }

    public p3.f m(com.google.crypto.tink.shaded.protobuf.h h8) {
        return p3.f.d0(h8, p.b());
    }

    public void n(p3.f f8) {
        r.c(f8.b0(), this.l());
        r.a(f8.Z().size());
        this.o(f8.a0());
    }

    public final void o(h h8) {
        if (h8.X() >= 12 && h8.X() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

}

