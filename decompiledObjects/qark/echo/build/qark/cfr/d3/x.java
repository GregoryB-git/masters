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

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import d3.j;
import d3.k;
import d3.l;
import d3.t;
import d3.v;
import d3.w;
import java.security.GeneralSecurityException;
import k3.b;
import k3.c;
import k3.i;
import k3.o;
import p3.I;
import p3.n;
import r3.a;

public abstract class x {
    public static final a a;
    public static final k3.k b;
    public static final k3.j c;
    public static final c d;
    public static final b e;

    static {
        a a8;
        a = a8 = k3.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        b = k3.k.a(new j(), v.class, k3.p.class);
        c = k3.j.a(new k(), a8, k3.p.class);
        d = c.a(new l(), t.class, o.class);
        e = b.a(new w(), a8, o.class);
    }

    public static /* synthetic */ t a(o o8, y y8) {
        return x.b(o8, y8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static t b(o o8, y y8) {
        if (!o8.f().equals((Object)"type.googleapis.com/google.crypto.tink.AesGcmSivKey")) throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        try {
            n n8 = n.a0(o8.g(), p.b());
            if (n8.Y() != 0) throw new GeneralSecurityException("Only version 0 keys are accepted");
            v v8 = v.a().b(n8.X().size()).c(x.e(o8.e())).a();
            return t.a().e(v8).d(r3.b.a(n8.X().Y(), y.b(y8))).c(o8.c()).a();
        }
        catch (A a8) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        x.d(i.a());
    }

    public static void d(i i8) {
        i8.h(b);
        i8.g(c);
        i8.f(d);
        i8.e(e);
    }

    public static v.c e(I i8) {
        int n8 = .a[i8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 == 4) {
                    return v.c.d;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to parse OutputPrefixType: ");
                stringBuilder.append(i8.g());
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            return v.c.c;
        }
        return v.c.b;
    }

}

