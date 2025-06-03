package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16239a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f16240b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f16241c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f16242d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f16243e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f16244f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f16245g;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f16240b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        f16241c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        f16242d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        f16243e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(...)");
        f16244f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(...)");
        f16245g = forName6;
    }
}
