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

public final class m
extends Enum {
    public static final /* enum */ m A;
    public static final /* enum */ m B;
    public static final /* enum */ m C;
    public static final /* enum */ m D;
    public static final /* enum */ m E;
    public static final /* enum */ m F;
    public static final /* enum */ m G;
    public static final /* synthetic */ m[] H;
    public static final a p;
    public static final /* enum */ m q;
    public static final /* enum */ m r;
    public static final /* enum */ m s;
    public static final /* enum */ m t;
    public static final /* enum */ m u;
    public static final /* enum */ m v;
    public static final /* enum */ m w;
    public static final /* enum */ m x;
    public static final /* enum */ m y;
    public static final /* enum */ m z;
    public final String o;

    static {
        q = new m("_logTime");
        r = new m("_eventName");
        s = new m("_valueToSum");
        t = new m("fb_content_id");
        u = new m("fb_content");
        v = new m("fb_content_type");
        w = new m("fb_description");
        x = new m("fb_level");
        y = new m("fb_max_rating_value");
        z = new m("fb_num_items");
        A = new m("fb_payment_info_available");
        B = new m("fb_registration_method");
        C = new m("fb_search_string");
        D = new m("fb_success");
        E = new m("fb_order_id");
        F = new m("ad_type");
        G = new m("fb_currency");
        H = m.c();
        p = new a(null);
    }

    public m(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ m[] c() {
        return new m[]{q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G};
    }

    public static m valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (m)Enum.valueOf(m.class, (String)string2);
    }

    public static m[] values() {
        m[] arrm = H;
        return (m[])Arrays.copyOf((Object[])arrm, (int)arrm.length);
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

        public final m a(String string2) {
            Intrinsics.checkNotNullParameter(string2, "rawValue");
            for (m m8 : m.values()) {
                if (!Intrinsics.a(m8.e(), string2)) continue;
                return m8;
            }
            return null;
        }
    }

}

