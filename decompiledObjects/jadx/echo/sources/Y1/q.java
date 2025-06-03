package Y1;

import O1.F;
import O1.P;
import W5.K;
import Y1.A;
import Y1.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2162o;
import x1.EnumC2155h;

/* loaded from: classes.dex */
public final class q extends A {

    /* renamed from: r, reason: collision with root package name */
    public o f7446r;

    /* renamed from: s, reason: collision with root package name */
    public final String f7447s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f7445t = new b(null);

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i7) {
            return new q[i7];
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class c implements P.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f7448a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f7449b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u.e f7450c;

        public c(Bundle bundle, q qVar, u.e eVar) {
            this.f7448a = bundle;
            this.f7449b = qVar;
            this.f7450c = eVar;
        }

        @Override // O1.P.a
        public void a(JSONObject jSONObject) {
            try {
                this.f7448a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString("id"));
                this.f7449b.t(this.f7450c, this.f7448a);
            } catch (JSONException e7) {
                this.f7449b.d().f(u.f.c.d(u.f.f7502w, this.f7449b.d().o(), "Caught exception", e7.getMessage(), null, 8, null));
            }
        }

        @Override // O1.P.a
        public void b(C2162o c2162o) {
            this.f7449b.d().f(u.f.c.d(u.f.f7502w, this.f7449b.d().o(), "Caught exception", c2162o == null ? null : c2162o.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f7447s = "get_token";
    }

    public static final void u(q this$0, u.e request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.r(request, bundle);
    }

    @Override // Y1.A
    public void b() {
        o oVar = this.f7446r;
        if (oVar == null) {
            return;
        }
        oVar.b();
        oVar.g(null);
        this.f7446r = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Y1.A
    public String f() {
        return this.f7447s;
    }

    @Override // Y1.A
    public int o(final u.e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context i7 = d().i();
        if (i7 == null) {
            i7 = C2146B.l();
        }
        o oVar = new o(i7, request);
        this.f7446r = oVar;
        if (Intrinsics.a(Boolean.valueOf(oVar.h()), Boolean.FALSE)) {
            return 0;
        }
        d().r();
        F.b bVar = new F.b() { // from class: Y1.p
            @Override // O1.F.b
            public final void a(Bundle bundle) {
                q.u(q.this, request, bundle);
            }
        };
        o oVar2 = this.f7446r;
        if (oVar2 == null) {
            return 1;
        }
        oVar2.g(bVar);
        return 1;
    }

    public final void q(u.e request, Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            t(request, result);
            return;
        }
        d().r();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        P p7 = P.f3756a;
        P.G(string2, new c(result, this, request));
    }

    public final void r(u.e request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(request, "request");
        o oVar = this.f7446r;
        if (oVar != null) {
            oVar.g(null);
        }
        this.f7446r = null;
        d().t();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = W5.o.f();
            }
            Set<String> n7 = request.n();
            if (n7 == null) {
                n7 = K.b();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (!n7.contains("openid") || (string != null && string.length() != 0)) {
                if (stringArrayList.containsAll(n7)) {
                    q(request, bundle);
                    return;
                }
                HashSet hashSet = new HashSet();
                for (String str : n7) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.u(hashSet);
            }
        }
        d().B();
    }

    public final void t(u.e request, Bundle result) {
        u.f d7;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            A.a aVar = A.f7349q;
            d7 = u.f.f7502w.b(request, aVar.a(result, EnumC2155h.FACEBOOK_APPLICATION_SERVICE, request.a()), aVar.c(result, request.m()));
        } catch (C2162o e7) {
            d7 = u.f.c.d(u.f.f7502w, d().o(), null, e7.getMessage(), null, 8, null);
        }
        d().g(d7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7447s = "get_token";
    }
}
