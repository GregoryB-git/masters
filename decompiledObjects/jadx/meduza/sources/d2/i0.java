package d2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import d2.a;
import d2.j0;
import d2.z;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i0 {
    public static final z.b A;
    public static final z.a B;
    public static final a.h C;
    public static final a D;
    public static final a.d E;
    public static final a.d F;
    public static final a.h G;
    public static final a.d H;
    public static final a.d I;
    public static final a.d J;
    public static final a.d K;
    public static final a.d L;
    public static final a.d M;
    public static final a.d N;
    public static final a.d O;

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f3364a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.e f3365b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.c f3366c;

    /* renamed from: d, reason: collision with root package name */
    public static final a.f f3367d;

    /* renamed from: e, reason: collision with root package name */
    public static final a.f f3368e;
    public static final a.f f;

    /* renamed from: g, reason: collision with root package name */
    public static final a.f f3369g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.c f3370h;

    /* renamed from: i, reason: collision with root package name */
    public static final a.c f3371i;

    /* renamed from: j, reason: collision with root package name */
    public static final a.c f3372j;

    /* renamed from: k, reason: collision with root package name */
    public static final a.c f3373k;

    /* renamed from: l, reason: collision with root package name */
    public static final a.c f3374l;

    /* renamed from: m, reason: collision with root package name */
    public static final a.c f3375m;

    /* renamed from: n, reason: collision with root package name */
    public static final a.b f3376n;

    /* renamed from: o, reason: collision with root package name */
    public static final a.b f3377o;

    /* renamed from: p, reason: collision with root package name */
    public static final a.f f3378p;

    /* renamed from: q, reason: collision with root package name */
    public static final a.f f3379q;

    /* renamed from: r, reason: collision with root package name */
    public static final a.f f3380r;

    /* renamed from: s, reason: collision with root package name */
    public static final a.b f3381s;
    public static final a.b t;

    /* renamed from: u, reason: collision with root package name */
    public static final a.d f3382u;

    /* renamed from: v, reason: collision with root package name */
    public static final a.b f3383v;

    /* renamed from: w, reason: collision with root package name */
    public static final a.b f3384w;

    /* renamed from: x, reason: collision with root package name */
    public static final a.b f3385x;

    /* renamed from: y, reason: collision with root package name */
    public static final a.h f3386y;

    /* renamed from: z, reason: collision with root package name */
    public static final a.g f3387z;

    public class a extends a.i {

        /* renamed from: d, reason: collision with root package name */
        public final Pattern f3388d = Pattern.compile("\\A\\d+");

        @Override // d2.a
        public final boolean d() {
            int i10;
            PackageInfo packageInfo;
            boolean d10 = super.d();
            if (!d10 || (i10 = Build.VERSION.SDK_INT) >= 29) {
                return d10;
            }
            Uri uri = c2.p.f2234a;
            if (i10 >= 26) {
                packageInfo = f.a();
            } else {
                try {
                    packageInfo = c2.p.c();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f3388d.matcher(packageInfo.versionName);
            return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends a.d {
        public b() {
            super("MULTI_PROFILE", "MULTI_PROFILE");
        }

        @Override // d2.a
        public final boolean d() {
            if (!super.d() || !x6.b.c0("MULTI_PROCESS")) {
                return false;
            }
            Uri uri = c2.p.f2234a;
            if (i0.F.d()) {
                return j0.b.f3390a.getStatics().isMultiProcessEnabled();
            }
            throw i0.a();
        }
    }

    static {
        new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        f3364a = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        f3365b = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        f3366c = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        f3367d = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        f3368e = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        f = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        f3369g = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        f3370h = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        f3371i = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        f3372j = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        f3373k = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        f3374l = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        f3375m = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        f3376n = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        f3377o = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        f3378p = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        f3379q = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        f3380r = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        f3381s = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        t = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        f3382u = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        f3383v = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        f3384w = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        f3385x = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        f3386y = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        f3387z = new a.g();
        A = new z.b();
        B = new z.a();
        C = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        D = new a();
        E = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        F = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        G = new a.h("FORCE_DARK", "FORCE_DARK");
        H = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        I = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        J = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        K = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        L = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        M = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        N = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        O = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b();
        new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new a.d("MUTE_AUDIO", "MUTE_AUDIO");
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
