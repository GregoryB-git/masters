// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import org.json.JSONException;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.content.SharedPreferences;

public final class P
{
    public static final a b;
    public final SharedPreferences a;
    
    static {
        b = new a(null);
    }
    
    public P() {
        final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }
    
    public final void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
    
    public final O b() {
        final String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", (String)null);
        Label_0035: {
            if (string == null) {
                break Label_0035;
            }
            try {
                return new O(new JSONObject(string));
                return null;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    public final void c(final O o) {
        Intrinsics.checkNotNullParameter(o, "profile");
        final JSONObject b = o.b();
        if (b != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", b.toString()).apply();
        }
    }
    
    public static final class a
    {
    }
}
