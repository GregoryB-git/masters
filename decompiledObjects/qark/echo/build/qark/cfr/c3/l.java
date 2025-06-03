/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package c3;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;
import p3.A;
import p3.I;

public final class l {
    public final A a;

    public l(A a8) {
        this.a = a8;
    }

    public static l a(String string2, byte[] arrby, b b8) {
        return new l((A)A.c0().z(string2).A(h.i(arrby)).y(l.c(b8)).n());
    }

    public static I c(b b8) {
        int n8 = .b[b8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return I.t;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return I.s;
            }
            return I.r;
        }
        return I.q;
    }

    public A b() {
        return this.a;
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* synthetic */ b[] s;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            o = b10 = new b();
            p = b9 = new b();
            q = b11 = new b();
            r = b8 = new b();
            s = new b[]{b10, b9, b11, b8};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])s.clone();
        }
    }

}

