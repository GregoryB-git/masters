package Y1;

import O1.P;
import W5.m;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;
import x1.a;
import x1.h;
import x1.o;

public final class A$a
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

/* Location:
 * Qualified Name:     Y1.A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */