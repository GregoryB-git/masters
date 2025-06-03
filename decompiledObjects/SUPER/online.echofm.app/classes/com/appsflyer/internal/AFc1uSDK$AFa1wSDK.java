package com.appsflyer.internal;

import W5.m;
import android.util.Base64;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.b;
import kotlin.text.d;
import kotlin.text.e;
import kotlin.text.f;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
public final class AFc1uSDK$AFa1wSDK
{
  public final Boolean AFInAppEventType;
  public final String valueOf;
  public Boolean values;
  
  public AFc1uSDK$AFa1wSDK() {}
  
  public AFc1uSDK$AFa1wSDK(String paramString, Boolean paramBoolean)
  {
    valueOf = paramString;
    AFInAppEventType = paramBoolean;
  }
  
  @NotNull
  public static String AFInAppEventParameterName(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "");
    Object localObject = MessageDigest.getInstance("SHA-256");
    paramString = paramString.getBytes(b.b);
    Intrinsics.checkNotNullExpressionValue(paramString, "");
    localObject = ((MessageDigest)localObject).digest(paramString);
    Intrinsics.checkNotNullExpressionValue(localObject, "");
    int i = localObject.length;
    paramString = "";
    for (int j = 0; j < i; j++)
    {
      byte b = localObject[j];
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      paramString = String.format("%02x", Arrays.copyOf(new Object[] { Byte.valueOf(b) }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString, "");
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
  
  public static int AFKeystoreWrapper(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "");
    paramString = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").a(paramString);
    if (paramString != null)
    {
      Object localObject = paramString.a().get(1);
      int i = 0;
      if (localObject != null)
      {
        localObject = ((d)localObject).a();
        if (localObject != null)
        {
          localObject = i.f((String)localObject);
          if (localObject != null)
          {
            j = ((Number)localObject).intValue();
            break label71;
          }
        }
      }
      int j = 0;
      label71:
      localObject = paramString.a().get(2);
      if (localObject != null)
      {
        localObject = ((d)localObject).a();
        if (localObject != null)
        {
          localObject = i.f((String)localObject);
          if (localObject != null)
          {
            k = ((Number)localObject).intValue();
            break label118;
          }
        }
      }
      int k = 0;
      label118:
      paramString = paramString.a().get(3);
      int m = i;
      if (paramString != null)
      {
        paramString = paramString.a();
        m = i;
        if (paramString != null)
        {
          paramString = i.f(paramString);
          m = i;
          if (paramString != null) {
            m = paramString.intValue();
          }
        }
      }
      return j * 1000000 + k * 1000 + m;
    }
    return -1;
  }
  
  @NotNull
  public static String valueOf(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "");
    paramString = paramString.getBytes(b.b);
    Intrinsics.checkNotNullExpressionValue(paramString, "");
    paramString = Base64.encodeToString(paramString, 2);
    Intrinsics.checkNotNullExpressionValue(paramString, "");
    return paramString;
  }
  
  public static double values(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "");
    try
    {
      d = Double.parseDouble(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      paramString = NumberFormat.getInstance(Locale.getDefault()).parse(paramString);
      if (paramString == null) {
        break label37;
      }
    }
    double d = paramString.doubleValue();
    return d;
    label37:
    throw new ParseException("Failed parse String into number", 0);
  }
  
  @NotNull
  public static JSONArray values(List<AFc1zSDK> paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "");
    Object localObject = (Iterable)paramList;
    paramList = new ArrayList(m.l((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramList.add(((AFc1zSDK)((Iterator)localObject).next()).AFInAppEventParameterName());
    }
    return new JSONArray(paramList);
  }
  
  public static boolean values(HttpURLConnection paramHttpURLConnection)
  {
    Intrinsics.checkNotNullParameter(paramHttpURLConnection, "");
    return paramHttpURLConnection.getResponseCode() / 100 == 2;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1uSDK.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */