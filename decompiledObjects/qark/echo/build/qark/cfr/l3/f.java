/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 */
package l3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import d3.j;
import d3.k;
import d3.l;
import java.security.GeneralSecurityException;
import k3.b;
import k3.c;
import k3.i;
import k3.o;
import k3.t;
import l3.a;
import l3.d;
import l3.e;
import p3.I;

public abstract class f {
    public static final r3.a a;
    public static final k3.k b;
    public static final k3.j c;
    public static final c d;
    public static final b e;

    static {
        r3.a a8;
        a = a8 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        b = k3.k.a(new j(), d.class, k3.p.class);
        c = k3.j.a(new k(), a8, k3.p.class);
        d = c.a(new l(), a.class, o.class);
        e = b.a(new e(), a8, o.class);
    }

    public static /* synthetic */ a a(o o8, y y8) {
        return f.b(o8, y8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a b(o o8, y y8) {
        if (!o8.f().equals((Object)"type.googleapis.com/google.crypto.tink.AesCmacKey")) throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        try {
            p3.a a8 = p3.a.c0(o8.g(), p.b());
            if (a8.a0() != 0) throw new GeneralSecurityException("Only version 0 keys are accepted");
            d d8 = d.a().b(a8.Y().size()).c(a8.Z().X()).d(f.e(o8.e())).a();
            return a.c().e(d8).c(r3.b.a(a8.Y().Y(), y.b(y8))).d(o8.c()).a();
        }
        catch (A | IllegalArgumentException a9) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        f.d(i.a());
    }

    public static void d(i i8) {
        i8.h(b);
        i8.g(c);
        i8.f(d);
        i8.e(e);
    }

    public static d.c e(I i8) {
        int n8 = .a[i8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return d.c.e;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to parse OutputPrefixType: ");
                    stringBuilder.append(i8.g());
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
                return d.c.d;
            }
            return d.c.c;
        }
        return d.c.b;
    }

}

