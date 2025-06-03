package Y1;

import O1.P;
import W5.C;
import W5.m;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.D;
import x1.K;
import x1.a;
import x1.h;
import x1.o;
import x1.r;

public abstract class A
  implements Parcelable
{
  public static final a q = new a(null);
  public Map o;
  public u p;
  
  public A(u paramu)
  {
    m(paramu);
  }
  
  public A(Parcel paramParcel)
  {
    paramParcel = P.t0(paramParcel);
    if (paramParcel == null) {
      paramParcel = null;
    } else {
      paramParcel = C.o(paramParcel);
    }
    o = paramParcel;
  }
  
  public void a(String paramString, Object paramObject)
  {
    if (o == null) {
      o = new HashMap();
    }
    Map localMap = o;
    if (localMap != null)
    {
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = paramObject.toString();
      }
      paramString = (String)localMap.put(paramString, paramObject);
    }
  }
  
  public void b() {}
  
  public String c(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "authId");
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("0_auth_logger_id", paramString);
      localJSONObject.put("3_method", f());
      l(localJSONObject);
    }
    catch (JSONException paramString)
    {
      Log.w("LoginMethodHandler", Intrinsics.i("Error creating client state json: ", paramString.getMessage()));
    }
    paramString = localJSONObject.toString();
    Intrinsics.checkNotNullExpressionValue(paramString, "param.toString()");
    return paramString;
  }
  
  public final u d()
  {
    u localu = p;
    if (localu != null) {
      return localu;
    }
    Intrinsics.n("loginClient");
    throw null;
  }
  
  public final Map e()
  {
    return o;
  }
  
  public abstract String f();
  
  public String g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fb");
    localStringBuilder.append(B.m());
    localStringBuilder.append("://authorize/");
    return localStringBuilder.toString();
  }
  
  public void h(String paramString)
  {
    Object localObject1 = d().o();
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((u.e)localObject1).a();
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = B.m();
    }
    y1.F localF = new y1.F(d().i(), (String)localObject2);
    localObject1 = new Bundle();
    ((BaseBundle)localObject1).putString("fb_web_login_e2e", paramString);
    ((BaseBundle)localObject1).putLong("fb_web_login_switchback_time", System.currentTimeMillis());
    ((BaseBundle)localObject1).putString("app_id", (String)localObject2);
    localF.h("fb_dialogs_web_login_dialog_complete", null, (Bundle)localObject1);
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j(int paramInt1, int paramInt2, Intent paramIntent)
  {
    return false;
  }
  
  public Bundle k(u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    Intrinsics.checkNotNullParameter(paramBundle, "values");
    String str1 = paramBundle.getString("code");
    if (!P.c0(str1))
    {
      Object localObject1 = null;
      Object localObject2;
      if (str1 == null)
      {
        parame = null;
      }
      else
      {
        localObject2 = E.a;
        String str2 = g();
        localObject2 = parame.f();
        parame = (u.e)localObject2;
        if (localObject2 == null) {
          parame = "";
        }
        parame = E.a(str1, str2, parame);
      }
      if (parame != null)
      {
        localObject2 = parame.k();
        parame = ((K)localObject2).b();
        if (parame == null)
        {
          try
          {
            localObject2 = ((K)localObject2).c();
            if (localObject2 == null) {
              parame = (u.e)localObject1;
            } else {
              parame = ((JSONObject)localObject2).getString("access_token");
            }
            if ((localObject2 == null) || (P.c0(parame))) {
              break label171;
            }
            paramBundle.putString("access_token", parame);
            if (((JSONObject)localObject2).has("id_token")) {
              paramBundle.putString("id_token", ((JSONObject)localObject2).getString("id_token"));
            }
          }
          catch (JSONException parame)
          {
            break label183;
          }
          return paramBundle;
          label171:
          parame = new x1/o;
          parame.<init>("No access token found from result");
          throw parame;
          label183:
          throw new o(Intrinsics.i("Fail to process code exchange response: ", parame.getMessage()));
        }
        throw new D(parame, parame.c());
      }
      throw new o("Failed to create code exchange request");
    }
    throw new o("No code param found from the request");
  }
  
  public void l(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "param");
  }
  
  public final void m(u paramu)
  {
    Intrinsics.checkNotNullParameter(paramu, "<set-?>");
    p = paramu;
  }
  
  public boolean n()
  {
    return false;
  }
  
  public abstract int o(u.e parame);
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    P localP = P.a;
    P.H0(paramParcel, o);
  }
  
  public static final class a
  {
    public final a a(Bundle paramBundle, h paramh, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      Object localObject = P.a;
      Date localDate = P.x(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
      ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      String str1 = paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
      localObject = P.x(paramBundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
      if ((str1 != null) && (str1.length() != 0))
      {
        String str2 = paramBundle.getString("com.facebook.platform.extra.USER_ID");
        if ((str2 != null) && (str2.length() != 0))
        {
          paramBundle = paramBundle.getString("graph_domain");
          return new a(str1, paramString, str2, localArrayList, null, null, paramh, localDate, new Date(), (Date)localObject, paramBundle);
        }
      }
      return null;
    }
    
    public final a b(Collection paramCollection, Bundle paramBundle, h paramh, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      Object localObject1 = P.a;
      Date localDate1 = P.x(paramBundle, "expires_in", new Date());
      String str1 = paramBundle.getString("access_token");
      if (str1 == null) {
        return null;
      }
      Date localDate2 = P.x(paramBundle, "data_access_expiration_time", new Date(0L));
      localObject1 = paramBundle.getString("granted_scopes");
      if ((localObject1 != null) && (((CharSequence)localObject1).length() > 0))
      {
        paramCollection = ((Collection)kotlin.text.i.V((CharSequence)localObject1, new String[] { "," }, false, 0, 6, null)).toArray(new String[0]);
        if (paramCollection != null)
        {
          paramCollection = (String[])paramCollection;
          paramCollection = m.d(Arrays.copyOf(paramCollection, paramCollection.length));
        }
        else
        {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
      }
      localObject1 = paramBundle.getString("denied_scopes");
      if ((localObject1 != null) && (((CharSequence)localObject1).length() > 0))
      {
        localObject1 = ((Collection)kotlin.text.i.V((CharSequence)localObject1, new String[] { "," }, false, 0, 6, null)).toArray(new String[0]);
        if (localObject1 != null)
        {
          localObject1 = (String[])localObject1;
          localObject1 = m.d(Arrays.copyOf((Object[])localObject1, localObject1.length));
        }
        else
        {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
      }
      else
      {
        localObject1 = null;
      }
      Object localObject2 = paramBundle.getString("expired_scopes");
      if ((localObject2 != null) && (((CharSequence)localObject2).length() > 0))
      {
        localObject2 = ((Collection)kotlin.text.i.V((CharSequence)localObject2, new String[] { "," }, false, 0, 6, null)).toArray(new String[0]);
        if (localObject2 != null)
        {
          localObject2 = (String[])localObject2;
          localObject2 = m.d(Arrays.copyOf((Object[])localObject2, localObject2.length));
        }
        else
        {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
      }
      else
      {
        localObject2 = null;
      }
      if (P.c0(str1)) {
        return null;
      }
      String str2 = paramBundle.getString("graph_domain");
      return new a(str1, paramString, e(paramBundle.getString("signed_request")), paramCollection, (Collection)localObject1, (Collection)localObject2, paramh, localDate1, new Date(), localDate2, str2);
    }
    
    public final x1.i c(Bundle paramBundle, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      paramBundle = paramBundle.getString("com.facebook.platform.extra.ID_TOKEN");
      if ((paramBundle != null) && (paramBundle.length() != 0) && (paramString != null) && (paramString.length() != 0)) {
        try
        {
          paramBundle = new x1.i(paramBundle, paramString);
        }
        catch (Exception paramBundle)
        {
          throw new o(paramBundle.getMessage());
        }
      } else {
        paramBundle = null;
      }
      return paramBundle;
    }
    
    public final x1.i d(Bundle paramBundle, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      paramBundle = paramBundle.getString("id_token");
      if ((paramBundle != null) && (paramBundle.length() != 0) && (paramString != null) && (paramString.length() != 0)) {
        try
        {
          paramBundle = new x1.i(paramBundle, paramString);
        }
        catch (Exception paramBundle)
        {
          throw new o(paramBundle.getMessage(), paramBundle);
        }
      } else {
        paramBundle = null;
      }
      return paramBundle;
    }
    
    public final String e(String paramString)
    {
      if ((paramString != null) && (paramString.length() != 0)) {}
      try
      {
        paramString = ((Collection)kotlin.text.i.V(paramString, new String[] { "." }, false, 0, 6, null)).toArray(new String[0]);
        if (paramString != null)
        {
          paramString = (String[])paramString;
          if (paramString.length == 2)
          {
            byte[] arrayOfByte = Base64.decode(paramString[1], 0);
            Intrinsics.checkNotNullExpressionValue(arrayOfByte, "data");
            Object localObject = b.b;
            paramString = new java/lang/String;
            paramString.<init>(arrayOfByte, (Charset)localObject);
            localObject = new org/json/JSONObject;
            ((JSONObject)localObject).<init>(paramString);
            paramString = ((JSONObject)localObject).getString("user_id");
            Intrinsics.checkNotNullExpressionValue(paramString, "jsonObject.getString(\"user_id\")");
            return paramString;
          }
        }
        else
        {
          paramString = new java/lang/NullPointerException;
          paramString.<init>("null cannot be cast to non-null type kotlin.Array<T>");
          throw paramString;
        }
      }
      catch (UnsupportedEncodingException|JSONException paramString)
      {
        for (;;) {}
      }
      throw new o("Failed to retrieve user_id from signed_request");
      throw new o("Authorization response does not contain the signed_request");
    }
  }
}

/* Location:
 * Qualified Name:     Y1.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */