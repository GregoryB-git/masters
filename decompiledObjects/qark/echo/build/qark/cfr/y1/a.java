/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package y1;

import O1.P;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;

public final class a
implements Serializable {
    public static final a q = new a(null);
    private static final long serialVersionUID = 1L;
    public final String o;
    public final String p;

    public a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "applicationId");
        this.o = string3;
        string3 = string2;
        if (P.c0(string2)) {
            string3 = null;
        }
        this.p = string3;
    }

    public a(x1.a a8) {
        Intrinsics.checkNotNullParameter(a8, "accessToken");
        this(a8.l(), B.m());
    }

    private final Object writeReplace() {
        return new b(this.p, this.o);
    }

    public final String a() {
        return this.p;
    }

    public final String b() {
        return this.o;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof a;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        P p8 = P.a;
        object = (a)object;
        bl = bl2;
        if (P.e(object.p, this.p)) {
            bl = bl2;
            if (P.e(object.o, this.o)) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        String string2 = this.p;
        int n8 = string2 == null ? 0 : string2.hashCode();
        return n8 ^ this.o.hashCode();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements Serializable {
        public static final a q = new a(null);
        private static final long serialVersionUID = -2488473066578201069L;
        public final String o;
        public final String p;

        public b(String string2, String string3) {
            Intrinsics.checkNotNullParameter(string3, "appId");
            this.o = string2;
            this.p = string3;
        }

        private final Object readResolve() {
            return new y1.a(this.o, this.p);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }

    }

}

