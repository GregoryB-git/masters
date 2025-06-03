/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a
extends Enum {
    public static final a o;
    public static final /* enum */ a p;
    public static final /* enum */ a q;
    public static final /* enum */ a r;
    public static final /* synthetic */ a[] s;

    static {
        p = new a();
        q = new a();
        r = new a();
        s = a.c();
        o = new a(null);
    }

    public static final /* synthetic */ a[] c() {
        return new a[]{p, q, r};
    }

    public static a valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        a[] arra = s;
        return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final a a(String string2) {
            Intrinsics.checkNotNullParameter(string2, "rawValue");
            if (Intrinsics.a(string2, "MOBILE_APP_INSTALL")) {
                return a.p;
            }
            if (Intrinsics.a(string2, "CUSTOM_APP_EVENTS")) {
                return a.q;
            }
            return a.r;
        }
    }

}

