/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 */
package k3;

import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.q;
import k3.t;
import p3.I;
import p3.y;
import r3.a;

public final class o
implements q {
    public final String a;
    public final a b;
    public final h c;
    public final y.c d;
    public final I e;
    public final Integer f;

    public o(String string2, h h8, y.c c8, I i8, Integer n8) {
        this.a = string2;
        this.b = t.e(string2);
        this.c = h8;
        this.d = c8;
        this.e = i8;
        this.f = n8;
    }

    public static o b(String string2, h h8, y.c c8, I i8, Integer n8) {
        block7 : {
            block6 : {
                block5 : {
                    if (i8 != I.s) break block5;
                    if (n8 != null) {
                        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                    }
                    break block6;
                }
                if (n8 == null) break block7;
            }
            return new o(string2, h8, c8, i8, n8);
        }
        throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
    }

    @Override
    public a a() {
        return this.b;
    }

    public Integer c() {
        return this.f;
    }

    public y.c d() {
        return this.d;
    }

    public I e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public h g() {
        return this.c;
    }
}

