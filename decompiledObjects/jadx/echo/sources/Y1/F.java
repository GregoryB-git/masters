package Y1;

import O1.P;
import Y1.A;
import Y1.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.C2148a;
import x1.C2162o;
import x1.C2164q;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public abstract class F extends A {

    /* renamed from: s, reason: collision with root package name */
    public static final a f7362s = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public String f7363r;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    public Bundle p(Bundle parameters, u.e request) {
        String str;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", g());
        parameters.putString(request.r() ? "app_id" : "client_id", request.a());
        parameters.putString("e2e", u.f7470A.a());
        if (request.r()) {
            str = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (request.n().contains("openid")) {
                parameters.putString("nonce", request.m());
            }
            str = "id_token,token,signed_request,graph_domain";
        }
        parameters.putString("response_type", str);
        parameters.putString("code_challenge", request.d());
        EnumC0708a e7 = request.e();
        parameters.putString("code_challenge_method", e7 == null ? null : e7.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.c());
        parameters.putString("login_behavior", request.j().name());
        parameters.putString("sdk", Intrinsics.i("android-", C2146B.B()));
        if (r() != null) {
            parameters.putString("sso", r());
        }
        parameters.putString("cct_prefetching", C2146B.f20878q ? "1" : "0");
        if (request.q()) {
            parameters.putString("fx_app", request.k().toString());
        }
        if (request.v()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.l() != null) {
            parameters.putString("messenger_page_id", request.l());
            parameters.putString("reset_messenger_state", request.o() ? "1" : "0");
        }
        return parameters;
    }

    public Bundle q(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        P p7 = P.f3756a;
        if (!P.d0(request.n())) {
            String join = TextUtils.join(",", request.n());
            bundle.putString("scope", join);
            a("scope", join);
        }
        EnumC0712e g7 = request.g();
        if (g7 == null) {
            g7 = EnumC0712e.NONE;
        }
        bundle.putString("default_audience", g7.e());
        bundle.putString("state", c(request.b()));
        C2148a e7 = C2148a.f21014z.e();
        String l7 = e7 == null ? null : e7.l();
        if (l7 == null || !Intrinsics.a(l7, u())) {
            androidx.fragment.app.e i7 = d().i();
            if (i7 != null) {
                P.i(i7);
            }
            a("access_token", "0");
        } else {
            bundle.putString("access_token", l7);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C2146B.p() ? "1" : "0");
        return bundle;
    }

    public String r() {
        return null;
    }

    public abstract EnumC2155h t();

    public final String u() {
        Context i7 = d().i();
        if (i7 == null) {
            i7 = C2146B.l();
        }
        return i7.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    public void v(u.e request, Bundle bundle, C2162o c2162o) {
        String str;
        u.f c7;
        Intrinsics.checkNotNullParameter(request, "request");
        u d7 = d();
        this.f7363r = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f7363r = bundle.getString("e2e");
            }
            try {
                A.a aVar = A.f7349q;
                C2148a b7 = aVar.b(request.n(), bundle, t(), request.a());
                c7 = u.f.f7502w.b(d7.o(), b7, aVar.d(bundle, request.m()));
                if (d7.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d7.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b7 != null) {
                        w(b7.l());
                    }
                }
            } catch (C2162o e7) {
                c7 = u.f.c.d(u.f.f7502w, d7.o(), null, e7.getMessage(), null, 8, null);
            }
        } else if (c2162o instanceof C2164q) {
            c7 = u.f.f7502w.a(d7.o(), "User canceled log in.");
        } else {
            this.f7363r = null;
            String message = c2162o == null ? null : c2162o.getMessage();
            if (c2162o instanceof x1.D) {
                x1.r c8 = ((x1.D) c2162o).c();
                str = String.valueOf(c8.b());
                message = c8.toString();
            } else {
                str = null;
            }
            c7 = u.f.f7502w.c(d7.o(), null, message, str);
        }
        P p7 = P.f3756a;
        if (!P.c0(this.f7363r)) {
            h(this.f7363r);
        }
        d7.g(c7);
    }

    public final void w(String str) {
        Context i7 = d().i();
        if (i7 == null) {
            i7 = C2146B.l();
        }
        i7.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
