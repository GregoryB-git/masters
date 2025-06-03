/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d3;

import c3.a;
import c3.s;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import k3.d;
import k3.m;
import p3.E;
import p3.F;
import p3.y;
import q3.r;

public class D
extends d {
    public D() {
        super(E.class, new m(a.class){

            public a c(E object) {
                object = object.X().W();
                return s.a((String)object).a((String)object);
            }
        });
    }

    public static void m(boolean bl) {
        x.l(new D(), bl);
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override
    public d.a f() {
        return new d.a(F.class){

            public E f(F f8) {
                return (E)E.Z().y(f8).z(D.this.k()).n();
            }

            public F g(h h8) {
                return F.X(h8, p.b());
            }

            public void h(F f8) {
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

    public E l(h h8) {
        return E.a0(h8, p.b());
    }

    public void n(E e8) {
        r.c(e8.Y(), this.k());
    }

}

