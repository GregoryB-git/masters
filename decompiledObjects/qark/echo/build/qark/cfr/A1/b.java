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

public final class b
extends Enum {
    public static final /* enum */ b A;
    public static final /* enum */ b B;
    public static final /* enum */ b C;
    public static final /* enum */ b D;
    public static final /* enum */ b E;
    public static final /* enum */ b F;
    public static final /* enum */ b G;
    public static final /* synthetic */ b[] H;
    public static final a p;
    public static final /* enum */ b q;
    public static final /* enum */ b r;
    public static final /* enum */ b s;
    public static final /* enum */ b t;
    public static final /* enum */ b u;
    public static final /* enum */ b v;
    public static final /* enum */ b w;
    public static final /* enum */ b x;
    public static final /* enum */ b y;
    public static final /* enum */ b z;
    public final String o;

    static {
        q = new b("anon_id");
        r = new b("app_user_id");
        s = new b("advertiser_id");
        t = new b("page_id");
        u = new b("page_scoped_user_id");
        v = new b("ud");
        w = new b("advertiser_tracking_enabled");
        x = new b("application_tracking_enabled");
        y = new b("consider_views");
        z = new b("device_token");
        A = new b("extInfo");
        B = new b("include_dwell_data");
        C = new b("include_video_data");
        D = new b("install_referrer");
        E = new b("installer_package");
        F = new b("receipt_data");
        G = new b("url_schemes");
        H = b.c();
        p = new a(null);
    }

    public b(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ b[] c() {
        return new b[]{q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G};
    }

    public static b valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        b[] arrb = H;
        return (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
    }

    public final String e() {
        return this.o;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final b a(String string2) {
            Intrinsics.checkNotNullParameter(string2, "rawValue");
            for (b b8 : b.values()) {
                if (!Intrinsics.a(b8.e(), string2)) continue;
                return b8;
            }
            return null;
        }
    }

}

