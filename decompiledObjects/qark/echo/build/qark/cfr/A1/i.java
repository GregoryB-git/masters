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

public final class i
extends Enum {
    public static final /* enum */ i A;
    public static final /* enum */ i B;
    public static final /* enum */ i C;
    public static final /* enum */ i D;
    public static final /* enum */ i E;
    public static final /* enum */ i F;
    public static final /* synthetic */ i[] G;
    public static final /* enum */ i p;
    public static final /* enum */ i q;
    public static final /* enum */ i r;
    public static final /* enum */ i s;
    public static final /* enum */ i t;
    public static final /* enum */ i u;
    public static final /* enum */ i v;
    public static final /* enum */ i w;
    public static final /* enum */ i x;
    public static final /* enum */ i y;
    public static final /* enum */ i z;
    public final String o;

    static {
        p = new i("value");
        q = new i("event_time");
        r = new i("event_name");
        s = new i("content_ids");
        t = new i("contents");
        u = new i("content_type");
        v = new i("description");
        w = new i("level");
        x = new i("max_rating_value");
        y = new i("num_items");
        z = new i("payment_info_available");
        A = new i("registration_method");
        B = new i("search_string");
        C = new i("success");
        D = new i("order_id");
        E = new i("ad_type");
        F = new i("currency");
        G = i.c();
    }

    public i(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ i[] c() {
        return new i[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F};
    }

    public static i valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (i)Enum.valueOf(i.class, (String)string2);
    }

    public static i[] values() {
        i[] arri = G;
        return (i[])Arrays.copyOf((Object[])arri, (int)arri.length);
    }

    public final String e() {
        return this.o;
    }
}

