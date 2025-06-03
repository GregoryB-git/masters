package x1;

import V5.t;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static final a d = new a(null);
  public final SharedPreferences a;
  public final b b;
  public M c;
  
  public b()
  {
    this(localSharedPreferences, new b());
  }
  
  public b(SharedPreferences paramSharedPreferences, b paramb)
  {
    a = paramSharedPreferences;
    b = paramb;
  }
  
  public final void a()
  {
    a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    if (h()) {
      d().a();
    }
  }
  
  public final a b()
  {
    Object localObject1 = a;
    Object localObject3 = null;
    String str = ((SharedPreferences)localObject1).getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    localObject1 = localObject3;
    if (str != null) {}
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(str);
      localObject1 = a.z.b((JSONObject)localObject1);
      return (a)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final a c()
  {
    Object localObject = d().c();
    if ((localObject != null) && (M.c.g((Bundle)localObject))) {
      localObject = a.z.c((Bundle)localObject);
    } else {
      localObject = null;
    }
    return (a)localObject;
  }
  
  public final M d()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      if (c != null) {
        break label60;
      }
      try
      {
        if (c == null) {
          c = b.a();
        }
      }
      finally {}
      t localt = t.a;
    }
    finally
    {
      break label86;
    }
    throw ((Throwable)localObject2);
    label60:
    Object localObject3 = c;
    if (localObject3 != null) {
      return (M)localObject3;
    }
    localObject3 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject3).<init>("Required value was null.".toString());
    throw ((Throwable)localObject3);
    label86:
    T1.a.b((Throwable)localObject3, this);
    return null;
  }
  
  public final boolean e()
  {
    return a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
  }
  
  public final a f()
  {
    Object localObject;
    if (e())
    {
      localObject = b();
    }
    else if (h())
    {
      a locala = c();
      localObject = locala;
      if (locala != null)
      {
        g(locala);
        d().a();
        localObject = locala;
      }
    }
    else
    {
      localObject = null;
    }
    return (a)localObject;
  }
  
  public final void g(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "accessToken");
    try
    {
      parama = parama.o();
      a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", parama.toString()).apply();
      return;
    }
    catch (JSONException parama)
    {
      for (;;) {}
    }
  }
  
  public final boolean h()
  {
    return B.G();
  }
  
  public static final class a {}
  
  public static final class b
  {
    public final M a()
    {
      return new M(B.l(), null, 2, null);
    }
  }
}

/* Location:
 * Qualified Name:     x1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */