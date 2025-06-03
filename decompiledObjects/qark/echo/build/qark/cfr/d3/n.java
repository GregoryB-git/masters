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
import d3.g;
import d3.i;
import d3.j;
import d3.k;
import d3.l;
import d3.m;
import java.security.GeneralSecurityException;
import k3.b;
import k3.c;
import k3.o;
import k3.t;
import p3.I;
import r3.a;

public abstract class n {
    public static final a a;
    public static final k3.k b;
    public static final k3.j c;
    public static final c d;
    public static final b e;

    static {
        a a8;
        a = a8 = t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = k3.k.a(new j(), i.class, k3.p.class);
        c = k3.j.a(new k(), a8, k3.p.class);
        d = c.a(new l(), g.class, o.class);
        e = b.a(new m(), a8, o.class);
    }

    public static /* synthetic */ g a(o o8, y y8) {
        return n.b(o8, y8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static g b(o o8, y y8) {
        if (!o8.f().equals((Object)"type.googleapis.com/google.crypto.tink.AesEaxKey")) throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        try {
            p3.i i8 = p3.i.c0(o8.g(), p.b());
            if (i8.a0() != 0) throw new GeneralSecurityException("Only version 0 keys are accepted");
            i i9 = i.a().c(i8.Y().size()).b(i8.Z().X()).d(16).e(n.e(o8.e())).a();
            return g.a().e(i9).d(r3.b.a(i8.Y().Y(), y.b(y8))).c(o8.c()).a();
        }
        catch (A a8) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        n.d(k3.i.a());
    }

    public static void d(k3.i i8) {
        i8.h(b);
        i8.g(c);
        i8.f(d);
        i8.e(e);
    }

    public static i.c e(I i8) {
        int n8 = .a[i8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 == 4) {
                    return i.c.d;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to parse OutputPrefixType: ");
                stringBuilder.append(i8.g());
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            return i.c.c;
        }
        return i.c.b;
    }

}

