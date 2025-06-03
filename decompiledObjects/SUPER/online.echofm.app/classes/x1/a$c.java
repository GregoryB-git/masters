package x1;

import O1.P;
import W5.m;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$c
{
  public final a a(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "current");
    return new a(parama.l(), parama.c(), parama.m(), parama.j(), parama.e(), parama.f(), parama.k(), new Date(), new Date(), parama.d(), null, 1024, null);
  }
  
  public final a b(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
    if (paramJSONObject.getInt("version") <= 1)
    {
      String str1 = paramJSONObject.getString("token");
      Date localDate1 = new Date(paramJSONObject.getLong("expires_at"));
      Object localObject1 = paramJSONObject.getJSONArray("permissions");
      Object localObject2 = paramJSONObject.getJSONArray("declined_permissions");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("expired_permissions");
      Date localDate2 = new Date(paramJSONObject.getLong("last_refresh"));
      Object localObject3 = paramJSONObject.getString("source");
      Intrinsics.checkNotNullExpressionValue(localObject3, "jsonObject.getString(SOURCE_KEY)");
      localObject3 = h.valueOf((String)localObject3);
      String str2 = paramJSONObject.getString("application_id");
      String str3 = paramJSONObject.getString("user_id");
      Date localDate3 = new Date(paramJSONObject.optLong("data_access_expiration_time", 0L));
      String str4 = paramJSONObject.optString("graph_domain", null);
      Intrinsics.checkNotNullExpressionValue(str1, "token");
      Intrinsics.checkNotNullExpressionValue(str2, "applicationId");
      Intrinsics.checkNotNullExpressionValue(str3, "userId");
      paramJSONObject = P.a;
      Intrinsics.checkNotNullExpressionValue(localObject1, "permissionsArray");
      localObject1 = (Collection)P.g0((JSONArray)localObject1);
      Intrinsics.checkNotNullExpressionValue(localObject2, "declinedPermissionsArray");
      localObject2 = (Collection)P.g0((JSONArray)localObject2);
      if (localJSONArray == null) {
        paramJSONObject = new ArrayList();
      } else {
        paramJSONObject = P.g0(localJSONArray);
      }
      return new a(str1, str2, str3, (Collection)localObject1, (Collection)localObject2, (Collection)paramJSONObject, (h)localObject3, localDate1, localDate2, localDate3, str4);
    }
    throw new o("Unknown AccessToken serialization format.");
  }
  
  public final a c(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    List localList1 = f(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
    List localList2 = f(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
    List localList3 = f(paramBundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
    M.a locala = M.c;
    Object localObject1 = locala.a(paramBundle);
    Object localObject2 = localObject1;
    if (P.c0((String)localObject1)) {
      localObject2 = B.m();
    }
    String str = locala.f(paramBundle);
    if (str == null) {
      return null;
    }
    localObject1 = P.f(str);
    if (localObject1 == null) {
      localObject1 = null;
    }
    try
    {
      localObject1 = ((JSONObject)localObject1).getString("id");
      if (localObject2 == null) {
        return null;
      }
      if (localObject1 == null) {
        return null;
      }
      return new a(str, (String)localObject2, (String)localObject1, (Collection)localList1, (Collection)localList2, (Collection)localList3, locala.e(paramBundle), locala.c(paramBundle), locala.d(paramBundle), null, null, 1024, null);
    }
    catch (JSONException paramBundle) {}
    return null;
  }
  
  public final void d()
  {
    a locala = g.f.e().i();
    if (locala != null) {
      h(a(locala));
    }
  }
  
  public final a e()
  {
    return g.f.e().i();
  }
  
  public final List f(Bundle paramBundle, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    paramBundle = paramBundle.getStringArrayList(paramString);
    if (paramBundle == null)
    {
      paramBundle = m.f();
    }
    else
    {
      paramBundle = Collections.unmodifiableList(new ArrayList(paramBundle));
      Intrinsics.checkNotNullExpressionValue(paramBundle, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
    }
    return paramBundle;
  }
  
  public final boolean g()
  {
    a locala = g.f.e().i();
    boolean bool;
    if ((locala != null) && (!locala.n())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void h(a parama)
  {
    g.f.e().r(parama);
  }
}

/* Location:
 * Qualified Name:     x1.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */