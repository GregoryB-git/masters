// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import W5.m;
import java.util.List;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.Arrays;
import x1.B;
import kotlin.jvm.internal.x;

public final class H
{
    public static final H a;
    public static final String b;
    
    static {
        a = new H();
        b = H.class.getName();
    }
    
    public static final String a() {
        return "v16.0";
    }
    
    public static final String b() {
        final x a = x.a;
        final String format = String.format("m.%s", Arrays.copyOf(new Object[] { B.u() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String c() {
        return "CONNECTION_FAILURE";
    }
    
    public static final Collection d() {
        return m.i("service_disabled", "AndroidAuthKillSwitchException");
    }
    
    public static final Collection e() {
        return m.i("access_denied", "OAuthAccessDeniedException");
    }
    
    public static final String f() {
        final x a = x.a;
        final String format = String.format("https://graph.%s", Arrays.copyOf(new Object[] { B.u() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String g() {
        final x a = x.a;
        final String format = String.format("%s", Arrays.copyOf(new Object[] { B.v() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String h() {
        final x a = x.a;
        final String format = String.format("https://graph.%s", Arrays.copyOf(new Object[] { B.x() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String i(String format) {
        Intrinsics.checkNotNullParameter(format, "subdomain");
        final x a = x.a;
        format = String.format("https://graph.%s", Arrays.copyOf(new Object[] { format }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String j() {
        final x a = x.a;
        final String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[] { B.x() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final String k() {
        final x a = x.a;
        final String format = String.format("m.%s", Arrays.copyOf(new Object[] { B.y() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
