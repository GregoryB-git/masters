/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class B
extends Enum {
    public static final a p;
    public static final /* enum */ B q;
    public static final /* enum */ B r;
    public static final /* synthetic */ B[] s;
    public final String o;

    static {
        q = new B("facebook");
        r = new B("instagram");
        s = B.c();
        p = new a(null);
    }

    public B(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ B[] c() {
        return new B[]{q, r};
    }

    public static B valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (B)Enum.valueOf(B.class, (String)string2);
    }

    public static B[] values() {
        B[] arrb = s;
        return (B[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
    }

    public String toString() {
        return this.o;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final B a(String string2) {
            for (B b8 : B.values()) {
                if (!Intrinsics.a(b8.toString(), string2)) continue;
                return b8;
            }
            return B.q;
        }
    }

}

