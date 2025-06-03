package x1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class P
{
  public static final a b = new a(null);
  public final SharedPreferences a;
  
  public P()
  {
    SharedPreferences localSharedPreferences = B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
    Intrinsics.checkNotNullExpressionValue(localSharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
    a = localSharedPreferences;
  }
  
  public final void a()
  {
    a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
  }
  
  public final O b()
  {
    String str = a.getString("com.facebook.ProfileManager.CachedProfile", null);
    if (str != null) {}
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(str);
      localObject = new O((JSONObject)localObject);
      return (O)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final void c(O paramO)
  {
    Intrinsics.checkNotNullParameter(paramO, "profile");
    paramO = paramO.b();
    if (paramO != null) {
      a.edit().putString("com.facebook.ProfileManager.CachedProfile", paramO.toString()).apply();
    }
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     x1.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */