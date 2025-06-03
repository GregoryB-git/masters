/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 */
package O1;

import W5.m;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.B;

public final class H {
    public static final H a = new H();
    public static final String b = H.class.getName();

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        Object object = x.a;
        object = String.format((String)"m.%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.u()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection d() {
        return (Collection)m.i("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection e() {
        return (Collection)m.i("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        Object object = x.a;
        object = String.format((String)"https://graph.%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.u()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final String g() {
        Object object = x.a;
        object = String.format((String)"%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.v()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final String h() {
        Object object = x.a;
        object = String.format((String)"https://graph.%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.x()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final String i(String string2) {
        Intrinsics.checkNotNullParameter(string2, "subdomain");
        x x8 = x.a;
        string2 = String.format((String)"https://graph.%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
        Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
        return string2;
    }

    public static final String j() {
        Object object = x.a;
        object = String.format((String)"https://graph-video.%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.x()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final String k() {
        Object object = x.a;
        object = String.format((String)"m.%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.y()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }
}

