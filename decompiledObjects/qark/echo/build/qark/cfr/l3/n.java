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
import java.security.GeneralSecurityException;
import k3.b;
import k3.c;
import k3.o;
import k3.t;
import l3.i;
import l3.l;
import l3.m;
import p3.I;
import p3.u;
import p3.v;
import p3.x;
import r3.a;

public abstract class n {
    public static final a a;
    public static final k3.k b;
    public static final k3.j c;
    public static final c d;
    public static final b e;

    static {
        a a8;
        a = a8 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        b = k3.k.a(new j(), l.class, k3.p.class);
        c = k3.j.a(new k(), a8, k3.p.class);
        d = c.a(new d3.l(), i.class, o.class);
        e = b.a(new m(), a8, o.class);
    }

    public static /* synthetic */ i a(o o8, y y8) {
        return n.b(o8, y8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static i b(o o8, y y8) {
        if (!o8.f().equals((Object)"type.googleapis.com/google.crypto.tink.HmacKey")) throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        try {
            v v8 = v.d0(o8.g(), p.b());
            if (v8.b0() != 0) throw new GeneralSecurityException("Only version 0 keys are accepted");
            l l8 = l.a().c(v8.Z().size()).d(v8.a0().Z()).b(n.e(v8.a0().Y())).e(n.f(o8.e())).a();
            return i.c().e(l8).d(r3.b.a(v8.Z().Y(), y.b(y8))).c(o8.c()).a();
        }
        catch (A | IllegalArgumentException a8) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
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

    public static l.c e(u u8) {
        int n8 = .a[u8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 == 5) {
                            return l.c.f;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to parse HashType: ");
                        stringBuilder.append(u8.g());
                        throw new GeneralSecurityException(stringBuilder.toString());
                    }
                    return l.c.e;
                }
                return l.c.d;
            }
            return l.c.c;
        }
        return l.c.b;
    }

    public static l.d f(I i8) {
        int n8 = .b[i8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return l.d.e;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to parse OutputPrefixType: ");
                    stringBuilder.append(i8.g());
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
                return l.d.d;
            }
            return l.d.c;
        }
        return l.d.b;
    }

}

