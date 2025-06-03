/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.O;

public final class P {
    public static final a b = new a(null);
    public final SharedPreferences a;

    public P() {
        SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final O b() {
        String object = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (object == null) return null;
        try {
            return new O(new JSONObject(object));
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final void c(O o8) {
        Intrinsics.checkNotNullParameter(o8, "profile");
        o8 = o8.b();
        if (o8 != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", o8.toString()).apply();
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

