package O1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f3745a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final String f3746b = H.class.getName();

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C2146B.u()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection d() {
        List i7;
        i7 = W5.o.i("service_disabled", "AndroidAuthKillSwitchException");
        return i7;
    }

    public static final Collection e() {
        List i7;
        i7 = W5.o.i("access_denied", "OAuthAccessDeniedException");
        return i7;
    }

    public static final String f() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C2146B.u()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String g() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{C2146B.v()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String h() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C2146B.x()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String i(String subdomain) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String j() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C2146B.x()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String k() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C2146B.y()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
