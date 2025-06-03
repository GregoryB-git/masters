package O1;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3715e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f3716f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final x1.N f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3718b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f3719c;

    /* renamed from: d, reason: collision with root package name */
    public int f3720d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(x1.N behavior, int i7, String tag, String string) {
            boolean s7;
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (C2146B.H(behavior)) {
                String f7 = f(string);
                s7 = kotlin.text.r.s(tag, "FacebookSDK.", false, 2, null);
                if (!s7) {
                    tag = Intrinsics.i("FacebookSDK.", tag);
                }
                Log.println(i7, tag, f7);
                if (behavior == x1.N.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(x1.N behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(x1.N behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C2146B.H(behavior)) {
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, format2);
            }
        }

        public final synchronized void d(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            C2146B c2146b = C2146B.f20862a;
            if (!C2146B.H(x1.N.INCLUDE_ACCESS_TOKENS)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            C.f3716f.put(original, replace);
        }

        public final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : C.f3716f.entrySet()) {
                str2 = kotlin.text.r.q(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }
    }

    public C(x1.N behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f3720d = 3;
        this.f3717a = behavior;
        this.f3718b = Intrinsics.i("FacebookSDK.", Q.k(tag, "tag"));
        this.f3719c = new StringBuilder();
    }

    public final void b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (g()) {
            this.f3719c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (g()) {
            StringBuilder sb = this.f3719c;
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb.append(format2);
        }
    }

    public final void d(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String sb = this.f3719c.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        f(sb);
        this.f3719c = new StringBuilder();
    }

    public final void f(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f3715e.a(this.f3717a, this.f3720d, this.f3718b, string);
    }

    public final boolean g() {
        C2146B c2146b = C2146B.f20862a;
        return C2146B.H(this.f3717a);
    }
}
