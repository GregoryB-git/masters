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
package d3;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import d3.A;
import d3.B;
import d3.j;
import d3.k;
import d3.l;
import d3.y;
import java.security.GeneralSecurityException;
import k3.b;
import k3.c;
import k3.i;
import k3.o;
import k3.t;
import p3.I;
import p3.r;
import r3.a;

public abstract class C {
    public static final a a;
    public static final k3.k b;
    public static final k3.j c;
    public static final c d;
    public static final b e;

    static {
        a a8;
        a = a8 = t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        b = k3.k.a(new j(), A.class, k3.p.class);
        c = k3.j.a(new k(), a8, k3.p.class);
        d = c.a(new l(), y.class, o.class);
        e = b.a(new B(), a8, o.class);
    }

    public static /* synthetic */ y a(o o8, c3.y y8) {
        return C.b(o8, y8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static y b(o o8, c3.y y8) {
        if (!o8.f().equals((Object)"type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        try {
            r r8 = r.a0(o8.g(), p.b());
            if (r8.Y() != 0) throw new GeneralSecurityException("Only version 0 keys are accepted");
            return y.a(C.e(o8.e()), r3.b.a(r8.X().Y(), c3.y.b(y8)), o8.c());
        }
        catch (com.google.crypto.tink.shaded.protobuf.A a8) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        C.d(i.a());
    }

    public static void d(i i8) {
        i8.h(b);
        i8.g(c);
        i8.f(d);
        i8.e(e);
    }

    public static A.a e(I i8) {
        int n8 = .a[i8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 == 4) {
                    return A.a.d;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to parse OutputPrefixType: ");
                stringBuilder.append(i8.g());
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            return A.a.c;
        }
        return A.a.b;
    }

}

