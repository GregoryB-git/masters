package x1;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20970b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20971a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public P() {
        SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f20971a = sharedPreferences;
    }

    public final void a() {
        this.f20971a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final O b() {
        String string = this.f20971a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new O(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(O profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject b7 = profile.b();
        if (b7 != null) {
            this.f20971a.edit().putString("com.facebook.ProfileManager.CachedProfile", b7.toString()).apply();
        }
    }
}
