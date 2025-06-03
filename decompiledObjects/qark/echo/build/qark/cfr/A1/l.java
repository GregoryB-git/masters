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

public final class l
extends Enum {
    public static final /* enum */ l A;
    public static final /* enum */ l B;
    public static final /* enum */ l C;
    public static final /* enum */ l D;
    public static final /* enum */ l E;
    public static final /* enum */ l F;
    public static final /* synthetic */ l[] G;
    public static final /* enum */ l p;
    public static final /* enum */ l q;
    public static final /* enum */ l r;
    public static final /* enum */ l s;
    public static final /* enum */ l t;
    public static final /* enum */ l u;
    public static final /* enum */ l v;
    public static final /* enum */ l w;
    public static final /* enum */ l x;
    public static final /* enum */ l y;
    public static final /* enum */ l z;
    public final String o;

    static {
        p = new l("anon_id");
        q = new l("fb_login_id");
        r = new l("madid");
        s = new l("page_id");
        t = new l("page_scoped_user_id");
        u = new l("ud");
        v = new l("advertiser_tracking_enabled");
        w = new l("application_tracking_enabled");
        x = new l("consider_views");
        y = new l("device_token");
        z = new l("extInfo");
        A = new l("include_dwell_data");
        B = new l("include_video_data");
        C = new l("install_referrer");
        D = new l("installer_package");
        E = new l("receipt_data");
        F = new l("url_schemes");
        G = l.c();
    }

    public l(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ l[] c() {
        return new l[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F};
    }

    public static l valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (l)Enum.valueOf(l.class, (String)string2);
    }

    public static l[] values() {
        l[] arrl = G;
        return (l[])Arrays.copyOf((Object[])arrl, (int)arrl.length);
    }

    public final String e() {
        return this.o;
    }
}

