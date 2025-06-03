package x1;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2149b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21027d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21028a;

    /* renamed from: b, reason: collision with root package name */
    public final C0295b f21029b;

    /* renamed from: c, reason: collision with root package name */
    public M f21030c;

    /* renamed from: x1.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: x1.b$b, reason: collision with other inner class name */
    public static final class C0295b {
        public final M a() {
            return new M(C2146B.l(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2149b() {
        /*
            r3 = this;
            android.content.Context r0 = x1.C2146B.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            x1.b$b r1 = new x1.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C2149b.<init>():void");
    }

    public final void a() {
        this.f21028a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final C2148a b() {
        String string = this.f21028a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return C2148a.f21014z.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final C2148a c() {
        Bundle c7 = d().c();
        if (c7 == null || !M.f20948c.g(c7)) {
            return null;
        }
        return C2148a.f21014z.c(c7);
    }

    public final M d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            if (this.f21030c == null) {
                synchronized (this) {
                    try {
                        if (this.f21030c == null) {
                            this.f21030c = this.f21029b.a();
                        }
                        V5.t tVar = V5.t.f6803a;
                    } finally {
                    }
                }
            }
            M m7 = this.f21030c;
            if (m7 != null) {
                return m7;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean e() {
        return this.f21028a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    public final C2148a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        C2148a c7 = c();
        if (c7 == null) {
            return c7;
        }
        g(c7);
        d().a();
        return c7;
    }

    public final void g(C2148a accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f21028a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final boolean h() {
        return C2146B.G();
    }

    public C2149b(SharedPreferences sharedPreferences, C0295b tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f21028a = sharedPreferences;
        this.f21029b = tokenCachingStrategyFactory;
    }
}
