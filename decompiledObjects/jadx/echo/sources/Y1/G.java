package Y1;

import O1.C0446i;
import O1.P;
import O1.V;
import Y1.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C2162o;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public class G extends F {

    /* renamed from: t, reason: collision with root package name */
    public V f7365t;

    /* renamed from: u, reason: collision with root package name */
    public String f7366u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7367v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC2155h f7368w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f7364x = new c(null);

    @NotNull
    public static final Parcelable.Creator<G> CREATOR = new b();

    public final class a extends V.a {

        /* renamed from: h, reason: collision with root package name */
        public String f7369h;

        /* renamed from: i, reason: collision with root package name */
        public t f7370i;

        /* renamed from: j, reason: collision with root package name */
        public B f7371j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7372k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7373l;

        /* renamed from: m, reason: collision with root package name */
        public String f7374m;

        /* renamed from: n, reason: collision with root package name */
        public String f7375n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ G f7376o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G this$0, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f7376o = this$0;
            this.f7369h = "fbconnect://success";
            this.f7370i = t.NATIVE_WITH_FALLBACK;
            this.f7371j = B.FACEBOOK;
        }

        @Override // O1.V.a
        public V a() {
            Bundle f7 = f();
            if (f7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            f7.putString("redirect_uri", this.f7369h);
            f7.putString("client_id", c());
            f7.putString("e2e", j());
            f7.putString("response_type", this.f7371j == B.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f7.putString("return_scopes", "true");
            f7.putString("auth_type", i());
            f7.putString("login_behavior", this.f7370i.name());
            if (this.f7372k) {
                f7.putString("fx_app", this.f7371j.toString());
            }
            if (this.f7373l) {
                f7.putString("skip_dedupe", "true");
            }
            V.b bVar = V.f3770A;
            Context d7 = d();
            if (d7 != null) {
                return bVar.d(d7, "oauth", f7, g(), this.f7371j, e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        public final String i() {
            String str = this.f7375n;
            if (str != null) {
                return str;
            }
            Intrinsics.n("authType");
            throw null;
        }

        public final String j() {
            String str = this.f7374m;
            if (str != null) {
                return str;
            }
            Intrinsics.n("e2e");
            throw null;
        }

        public final a k(String authType) {
            Intrinsics.checkNotNullParameter(authType, "authType");
            l(authType);
            return this;
        }

        public final void l(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f7375n = str;
        }

        public final a m(String e2e) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            n(e2e);
            return this;
        }

        public final void n(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f7374m = str;
        }

        public final a o(boolean z7) {
            this.f7372k = z7;
            return this;
        }

        public final a p(boolean z7) {
            this.f7369h = z7 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(t loginBehavior) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            this.f7370i = loginBehavior;
            return this;
        }

        public final a r(B targetApp) {
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            this.f7371j = targetApp;
            return this;
        }

        public final a s(boolean z7) {
            this.f7373l = z7;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new G(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G[] newArray(int i7) {
            return new G[i7];
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class d implements V.d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u.e f7378b;

        public d(u.e eVar) {
            this.f7378b = eVar;
        }

        @Override // O1.V.d
        public void a(Bundle bundle, C2162o c2162o) {
            G.this.x(this.f7378b, bundle, c2162o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7367v = "web_view";
        this.f7368w = EnumC2155h.WEB_VIEW;
    }

    @Override // Y1.A
    public void b() {
        V v7 = this.f7365t;
        if (v7 != null) {
            if (v7 != null) {
                v7.cancel();
            }
            this.f7365t = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7367v;
    }

    @Override // Y1.A
    public boolean i() {
        return true;
    }

    @Override // Y1.A
    public int o(u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle q7 = q(request);
        d dVar = new d(request);
        String a7 = u.f7470A.a();
        this.f7366u = a7;
        a("e2e", a7);
        androidx.fragment.app.e i7 = d().i();
        if (i7 == null) {
            return 0;
        }
        boolean W6 = P.W(i7);
        a aVar = new a(this, i7, request.a(), q7);
        String str = this.f7366u;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f7365t = aVar.m(str).p(W6).k(request.c()).q(request.j()).r(request.k()).o(request.q()).s(request.v()).h(dVar).a();
        C0446i c0446i = new C0446i();
        c0446i.D1(true);
        c0446i.b2(this.f7365t);
        c0446i.T1(i7.n(), "FacebookDialogFragment");
        return 1;
    }

    @Override // Y1.F
    public EnumC2155h t() {
        return this.f7368w;
    }

    @Override // Y1.A, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i7);
        dest.writeString(this.f7366u);
    }

    public final void x(u.e request, Bundle bundle, C2162o c2162o) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.v(request, bundle, c2162o);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7367v = "web_view";
        this.f7368w = EnumC2155h.WEB_VIEW;
        this.f7366u = source.readString();
    }
}
