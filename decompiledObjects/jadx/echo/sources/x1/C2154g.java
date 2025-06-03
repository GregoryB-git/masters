package x1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2148a;
import x1.C2154g;
import x1.F;
import x1.J;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2154g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21044f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static C2154g f21045g;

    /* renamed from: a, reason: collision with root package name */
    public final Z.a f21046a;

    /* renamed from: b, reason: collision with root package name */
    public final C2149b f21047b;

    /* renamed from: c, reason: collision with root package name */
    public C2148a f21048c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f21049d;

    /* renamed from: e, reason: collision with root package name */
    public Date f21050e;

    /* renamed from: x1.g$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final F c(C2148a c2148a, F.b bVar) {
            e f7 = f(c2148a);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f7.b());
            bundle.putString("client_id", c2148a.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            F x7 = F.f20890n.x(c2148a, f7.a(), bVar);
            x7.G(bundle);
            x7.F(L.GET);
            return x7;
        }

        public final F d(C2148a c2148a, F.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            F x7 = F.f20890n.x(c2148a, "me/permissions", bVar);
            x7.G(bundle);
            x7.F(L.GET);
            return x7;
        }

        public final C2154g e() {
            C2154g c2154g;
            C2154g c2154g2 = C2154g.f21045g;
            if (c2154g2 != null) {
                return c2154g2;
            }
            synchronized (this) {
                c2154g = C2154g.f21045g;
                if (c2154g == null) {
                    Z.a b7 = Z.a.b(C2146B.l());
                    Intrinsics.checkNotNullExpressionValue(b7, "getInstance(applicationContext)");
                    C2154g c2154g3 = new C2154g(b7, new C2149b());
                    C2154g.f21045g = c2154g3;
                    c2154g = c2154g3;
                }
            }
            return c2154g;
        }

        public final e f(C2148a c2148a) {
            String h7 = c2148a.h();
            if (h7 == null) {
                h7 = "facebook";
            }
            return Intrinsics.a(h7, "instagram") ? new c() : new b();
        }
    }

    /* renamed from: x1.g$b */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f21051a = "oauth/access_token";

        /* renamed from: b, reason: collision with root package name */
        public final String f21052b = "fb_extend_sso_token";

        @Override // x1.C2154g.e
        public String a() {
            return this.f21051a;
        }

        @Override // x1.C2154g.e
        public String b() {
            return this.f21052b;
        }
    }

    /* renamed from: x1.g$c */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f21053a = "refresh_access_token";

        /* renamed from: b, reason: collision with root package name */
        public final String f21054b = "ig_refresh_token";

        @Override // x1.C2154g.e
        public String a() {
            return this.f21053a;
        }

        @Override // x1.C2154g.e
        public String b() {
            return this.f21054b;
        }
    }

    /* renamed from: x1.g$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f21055a;

        /* renamed from: b, reason: collision with root package name */
        public int f21056b;

        /* renamed from: c, reason: collision with root package name */
        public int f21057c;

        /* renamed from: d, reason: collision with root package name */
        public Long f21058d;

        /* renamed from: e, reason: collision with root package name */
        public String f21059e;

        public final String a() {
            return this.f21055a;
        }

        public final Long b() {
            return this.f21058d;
        }

        public final int c() {
            return this.f21056b;
        }

        public final int d() {
            return this.f21057c;
        }

        public final String e() {
            return this.f21059e;
        }

        public final void f(String str) {
            this.f21055a = str;
        }

        public final void g(Long l7) {
            this.f21058d = l7;
        }

        public final void h(int i7) {
            this.f21056b = i7;
        }

        public final void i(int i7) {
            this.f21057c = i7;
        }

        public final void j(String str) {
            this.f21059e = str;
        }
    }

    /* renamed from: x1.g$e */
    public interface e {
        String a();

        String b();
    }

    public C2154g(Z.a localBroadcastManager, C2149b accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f21046a = localBroadcastManager;
        this.f21047b = accessTokenCache;
        this.f21049d = new AtomicBoolean(false);
        this.f21050e = new Date(0L);
    }

    public static final void l(C2154g this$0, C2148a.InterfaceC0294a interfaceC0294a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m(interfaceC0294a);
    }

    public static final void n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, K response) {
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject d7 = response.d();
        if (d7 == null || (optJSONArray = d7.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString("status");
                if (!O1.P.c0(optString) && !O1.P.c0(status)) {
                    Intrinsics.checkNotNullExpressionValue(status, "status");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String status2 = status.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode == -1309235419) {
                        if (status2.equals("expired")) {
                            expiredPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.i("Unexpected status: ", status2));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && status2.equals("declined")) {
                            declinedPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.i("Unexpected status: ", status2));
                    } else {
                        if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.i("Unexpected status: ", status2));
                    }
                }
            }
            if (i8 >= length) {
                return;
            } else {
                i7 = i8;
            }
        }
    }

    public static final void o(d refreshResult, K response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject d7 = response.d();
        if (d7 == null) {
            return;
        }
        refreshResult.f(d7.optString("access_token"));
        refreshResult.h(d7.optInt("expires_at"));
        refreshResult.i(d7.optInt("expires_in"));
        refreshResult.g(Long.valueOf(d7.optLong("data_access_expiration_time")));
        refreshResult.j(d7.optString("graph_domain", null));
    }

    public static final void p(d refreshResult, C2148a c2148a, C2148a.InterfaceC0294a interfaceC0294a, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, C2154g this$0, J it) {
        C2148a c2148a2;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String a7 = refreshResult.a();
        int c7 = refreshResult.c();
        Long b7 = refreshResult.b();
        String e7 = refreshResult.e();
        try {
            a aVar = f21044f;
            if (aVar.e().i() != null) {
                C2148a i7 = aVar.e().i();
                if ((i7 == null ? null : i7.m()) == c2148a.m()) {
                    if (!permissionsCallSucceeded.get() && a7 == null && c7 == 0) {
                        if (interfaceC0294a != null) {
                            interfaceC0294a.b(new C2162o("Failed to refresh access token"));
                        }
                        this$0.f21049d.set(false);
                        return;
                    }
                    Date g7 = c2148a.g();
                    if (refreshResult.c() != 0) {
                        g7 = new Date(refreshResult.c() * 1000);
                    } else if (refreshResult.d() != 0) {
                        g7 = new Date((refreshResult.d() * 1000) + new Date().getTime());
                    }
                    Date date = g7;
                    if (a7 == null) {
                        a7 = c2148a.l();
                    }
                    String str = a7;
                    String c8 = c2148a.c();
                    String m7 = c2148a.m();
                    Set j7 = permissionsCallSucceeded.get() ? permissions : c2148a.j();
                    Set e8 = permissionsCallSucceeded.get() ? declinedPermissions : c2148a.e();
                    Set f7 = permissionsCallSucceeded.get() ? expiredPermissions : c2148a.f();
                    EnumC2155h k7 = c2148a.k();
                    Date date2 = new Date();
                    Date date3 = b7 != null ? new Date(b7.longValue() * 1000) : c2148a.d();
                    if (e7 == null) {
                        e7 = c2148a.h();
                    }
                    C2148a c2148a3 = new C2148a(str, c8, m7, j7, e8, f7, k7, date, date2, date3, e7);
                    try {
                        aVar.e().r(c2148a3);
                        this$0.f21049d.set(false);
                        if (interfaceC0294a != null) {
                            interfaceC0294a.a(c2148a3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        c2148a2 = c2148a3;
                        this$0.f21049d.set(false);
                        if (interfaceC0294a != null && c2148a2 != null) {
                            interfaceC0294a.a(c2148a2);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC0294a != null) {
                interfaceC0294a.b(new C2162o("No current access token to refresh"));
            }
            this$0.f21049d.set(false);
        } catch (Throwable th2) {
            th = th2;
            c2148a2 = null;
        }
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final C2148a i() {
        return this.f21048c;
    }

    public final boolean j() {
        C2148a f7 = this.f21047b.f();
        if (f7 == null) {
            return false;
        }
        s(f7, false);
        return true;
    }

    public final void k(final C2148a.InterfaceC0294a interfaceC0294a) {
        if (Intrinsics.a(Looper.getMainLooper(), Looper.myLooper())) {
            m(interfaceC0294a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(interfaceC0294a) { // from class: x1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C2154g.l(C2154g.this, null);
                }
            });
        }
    }

    public final void m(final C2148a.InterfaceC0294a interfaceC0294a) {
        final C2148a i7 = i();
        if (i7 == null) {
            if (interfaceC0294a == null) {
                return;
            }
            interfaceC0294a.b(new C2162o("No current access token to refresh"));
            return;
        }
        if (!this.f21049d.compareAndSet(false, true)) {
            if (interfaceC0294a == null) {
                return;
            }
            interfaceC0294a.b(new C2162o("Refresh already in progress"));
            return;
        }
        this.f21050e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar = f21044f;
        J j7 = new J(aVar.d(i7, new F.b() { // from class: x1.d
            @Override // x1.F.b
            public final void a(K k7) {
                C2154g.n(atomicBoolean, hashSet, hashSet2, hashSet3, k7);
            }
        }), aVar.c(i7, new F.b() { // from class: x1.e
            @Override // x1.F.b
            public final void a(K k7) {
                C2154g.o(C2154g.d.this, k7);
            }
        }));
        j7.f(new J.a(i7, interfaceC0294a, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: x1.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2148a f21038b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f21039c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Set f21040d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Set f21041e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Set f21042f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ C2154g f21043g;

            {
                this.f21039c = atomicBoolean;
                this.f21040d = hashSet;
                this.f21041e = hashSet2;
                this.f21042f = hashSet3;
                this.f21043g = this;
            }

            @Override // x1.J.a
            public final void a(J j8) {
                C2154g.p(C2154g.d.this, this.f21038b, null, this.f21039c, this.f21040d, this.f21041e, this.f21042f, this.f21043g, j8);
            }
        });
        j7.q();
    }

    public final void q(C2148a c2148a, C2148a c2148a2) {
        Intent intent = new Intent(C2146B.l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", c2148a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", c2148a2);
        this.f21046a.d(intent);
    }

    public final void r(C2148a c2148a) {
        s(c2148a, true);
    }

    public final void s(C2148a c2148a, boolean z7) {
        C2148a c2148a2 = this.f21048c;
        this.f21048c = c2148a;
        this.f21049d.set(false);
        this.f21050e = new Date(0L);
        if (z7) {
            C2149b c2149b = this.f21047b;
            if (c2148a != null) {
                c2149b.g(c2148a);
            } else {
                c2149b.a();
                O1.P p7 = O1.P.f3756a;
                O1.P.i(C2146B.l());
            }
        }
        if (O1.P.e(c2148a2, c2148a)) {
            return;
        }
        q(c2148a2, c2148a);
        t();
    }

    public final void t() {
        Context l7 = C2146B.l();
        C2148a.c cVar = C2148a.f21014z;
        C2148a e7 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l7.getSystemService("alarm");
        if (cVar.g()) {
            if ((e7 == null ? null : e7.g()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(l7, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, e7.g().getTime(), PendingIntent.getBroadcast(l7, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    public final boolean u() {
        C2148a i7 = i();
        if (i7 == null) {
            return false;
        }
        long time = new Date().getTime();
        return i7.k().e() && time - this.f21050e.getTime() > 3600000 && time - i7.i().getTime() > 86400000;
    }
}
