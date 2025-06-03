package A1;

import O1.C;
import O1.C.a;
import O1.P;
import W5.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.b;
import x1.K;
import x1.L;
import x1.N;
import x1.r;

public final class d
{
  public static final d a = new d();
  public static final String b = d.class.getCanonicalName();
  public static boolean c;
  
  public static final void b()
  {
    Object localObject2;
    Object localObject3;
    Object localObject4;
    try
    {
      Object localObject1 = new A1/c;
      ((c)localObject1).<init>();
      localObject2 = new x1/F;
      ((F)localObject2).<init>(null, Intrinsics.i(B.m(), "/cloudbridge_settings"), null, L.o, (F.b)localObject1, null, 32, null);
      localObject3 = C.e;
      localObject4 = N.s;
      localObject1 = b;
      if (localObject1 != null)
      {
        ((C.a)localObject3).c((N)localObject4, (String)localObject1, " \n\nCreating Graph Request: \n=============\n%s\n\n ", new Object[] { localObject2 });
        ((F)localObject2).l();
      }
    }
    catch (JSONException localJSONException)
    {
      break label90;
      localObject2 = new java/lang/NullPointerException;
      ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type kotlin.String");
      throw ((Throwable)localObject2);
      label90:
      localObject4 = C.e;
      localObject3 = N.s;
      localObject2 = b;
      if (localObject2 == null) {
        break label126;
      }
    }
    ((C.a)localObject4).c((N)localObject3, (String)localObject2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", new Object[] { V5.a.b(localJSONException) });
    return;
    label126:
    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
  }
  
  public static final void c(K paramK)
  {
    Intrinsics.checkNotNullParameter(paramK, "response");
    a.d(paramK);
  }
  
  public static final Map e()
  {
    if (T1.a.d(d.class)) {
      return null;
    }
    try
    {
      Object localObject = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
      if (localObject == null) {
        return null;
      }
      o localo1 = o.r;
      String str1 = ((SharedPreferences)localObject).getString(localo1.e(), null);
      o localo2 = o.p;
      String str2 = ((SharedPreferences)localObject).getString(localo2.e(), null);
      o localo3 = o.s;
      String str3 = ((SharedPreferences)localObject).getString(localo3.e(), null);
      if ((str1 != null) && (!i.F(str1)) && (str2 != null) && (!i.F(str2)) && (str3 != null) && (!i.F(str3)))
      {
        localObject = new java/util/LinkedHashMap;
        ((LinkedHashMap)localObject).<init>();
        ((Map)localObject).put(localo2.e(), str2);
        ((Map)localObject).put(localo1.e(), str1);
        ((Map)localObject).put(localo3.e(), str3);
        C.e.c(N.s, b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", new Object[] { str1, str2, str3 });
        return (Map)localObject;
      }
    }
    finally
    {
      break label214;
      return null;
      label214:
      T1.a.b(localThrowable, d.class);
    }
    return null;
  }
  
  public final void d(K paramK)
  {
    boolean bool = false;
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (paramK.b() != null)
    {
      localObject1 = C.e;
      localObject2 = N.s;
      localObject4 = b;
      if (localObject4 != null)
      {
        ((C.a)localObject1).c((N)localObject2, (String)localObject4, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", new Object[] { paramK.b().toString(), String.valueOf(paramK.b().e()) });
        paramK = e();
        if (paramK != null)
        {
          localObject4 = new URL(String.valueOf(paramK.get(o.p.e())));
          localObject1 = g.a;
          localObject2 = String.valueOf(paramK.get(o.r.e()));
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(((URL)localObject4).getProtocol());
          ((StringBuilder)localObject1).append("://");
          ((StringBuilder)localObject1).append(((URL)localObject4).getHost());
          g.d((String)localObject2, ((StringBuilder)localObject1).toString(), String.valueOf(paramK.get(o.s.e())));
          c = true;
        }
        return;
      }
      throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
    Object localObject2 = C.e;
    Object localObject1 = N.s;
    Object localObject4 = b;
    if (localObject4 != null)
    {
      ((C.a)localObject2).c((N)localObject1, (String)localObject4, " \n\nGraph Response Received: \n================\n%s\n\n ", new Object[] { paramK });
      paramK = paramK.c();
      try
      {
        Object localObject5 = P.a;
        if (paramK == null) {
          paramK = null;
        } else {
          paramK = paramK.get("data");
        }
        if (paramK != null)
        {
          localObject5 = P.m((JSONArray)paramK);
          paramK = new org/json/JSONObject;
          paramK.<init>((String)m.s((List)localObject5));
          paramK = P.n(paramK);
          String str1 = (String)paramK.get(o.p.e());
          String str2 = (String)paramK.get(o.r.e());
          localObject5 = (String)paramK.get(o.s.e());
          if ((str1 != null) && (str2 != null) && (localObject5 != null)) {
            try
            {
              g.d(str2, str1, (String)localObject5);
              g(paramK);
              localObject4 = o.q;
              if (paramK.get(((o)localObject4).e()) != null)
              {
                paramK = paramK.get(((o)localObject4).e());
                if (paramK != null) {
                  bool = ((Boolean)paramK).booleanValue();
                } else {
                  throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
              }
              c = bool;
              return;
            }
            catch (MalformedURLException localMalformedURLException)
            {
              paramK = C.e;
              localObject1 = N.s;
              localObject4 = b;
              Intrinsics.checkNotNullExpressionValue(localObject4, "TAG");
              paramK.c((N)localObject1, (String)localObject4, "CloudBridge Settings API response doesn't have valid url\n %s ", new Object[] { V5.a.b(localMalformedURLException) });
              return;
            }
          }
          Intrinsics.checkNotNullExpressionValue(localObject4, "TAG");
          localMalformedURLException.b((N)localObject1, (String)localObject4, "CloudBridge Settings API response doesn't have valid data");
          return;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        break label528;
      }
      catch (JSONException localJSONException) {}
      paramK = new java/lang/NullPointerException;
      paramK.<init>("null cannot be cast to non-null type org.json.JSONArray");
      throw paramK;
      label528:
      C.a locala = C.e;
      Object localObject3 = N.s;
      paramK = b;
      Intrinsics.checkNotNullExpressionValue(paramK, "TAG");
      locala.c((N)localObject3, paramK, "CloudBridge Settings API response is not a valid json: \n%s ", new Object[] { V5.a.b(localNullPointerException) });
      return;
      localObject3 = C.e;
      N localN = N.s;
      paramK = b;
      Intrinsics.checkNotNullExpressionValue(paramK, "TAG");
      ((C.a)localObject3).c(localN, paramK, "CloudBridge Settings API response is not a valid json: \n%s ", new Object[] { V5.a.b(locala) });
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
  }
  
  public final boolean f()
  {
    return c;
  }
  
  public final void g(Map paramMap)
  {
    Object localObject1 = B.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
    if (localObject1 == null) {
      return;
    }
    if (paramMap == null)
    {
      paramMap = ((SharedPreferences)localObject1).edit();
      paramMap.clear();
      paramMap.apply();
      return;
    }
    o localo1 = o.r;
    Object localObject2 = paramMap.get(localo1.e());
    o localo2 = o.p;
    Object localObject3 = paramMap.get(localo2.e());
    o localo3 = o.s;
    paramMap = paramMap.get(localo3.e());
    if ((localObject2 != null) && (localObject3 != null) && (paramMap != null))
    {
      localObject1 = ((SharedPreferences)localObject1).edit();
      ((SharedPreferences.Editor)localObject1).putString(localo1.e(), localObject2.toString());
      ((SharedPreferences.Editor)localObject1).putString(localo2.e(), localObject3.toString());
      ((SharedPreferences.Editor)localObject1).putString(localo3.e(), paramMap.toString());
      ((SharedPreferences.Editor)localObject1).apply();
      C.e.c(N.s, b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", new Object[] { localObject2, localObject3, paramMap });
    }
  }
}

/* Location:
 * Qualified Name:     A1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */