package com.appsflyer.internal;

import android.util.Base64;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1zSDK
{
  @NotNull
  public static final AFa1xSDK AFInAppEventParameterName = new AFa1xSDK((byte)0);
  @NotNull
  public final String AFInAppEventType;
  @NotNull
  public final String AFKeystoreWrapper;
  public int valueOf;
  @NotNull
  public final String values;
  
  public AFc1zSDK(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, int paramInt)
  {
    AFInAppEventType = paramString1;
    AFKeystoreWrapper = paramString2;
    values = paramString3;
    valueOf = paramInt;
  }
  
  @NotNull
  public final JSONObject AFInAppEventParameterName()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("label", AFInAppEventType);
    localJSONObject.put("hash_name", AFKeystoreWrapper);
    localJSONObject.put("st", values);
    localJSONObject.put("c", String.valueOf(valueOf));
    return localJSONObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AFc1zSDK)) {
      return false;
    }
    paramObject = (AFc1zSDK)paramObject;
    if (!Intrinsics.a(AFInAppEventType, AFInAppEventType)) {
      return false;
    }
    if (!Intrinsics.a(AFKeystoreWrapper, AFKeystoreWrapper)) {
      return false;
    }
    if (!Intrinsics.a(values, values)) {
      return false;
    }
    return valueOf == valueOf;
  }
  
  public final int hashCode()
  {
    return ((AFInAppEventType.hashCode() * 31 + AFKeystoreWrapper.hashCode()) * 31 + values.hashCode()) * 31 + valueOf;
  }
  
  @NotNull
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ExceptionInfo(label=");
    localStringBuilder.append(AFInAppEventType);
    localStringBuilder.append(", hashName=");
    localStringBuilder.append(AFKeystoreWrapper);
    localStringBuilder.append(", stackTrace=");
    localStringBuilder.append(values);
    localStringBuilder.append(", counter=");
    localStringBuilder.append(valueOf);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  @Metadata
  public static final class AFa1xSDK
  {
    public static AFc1zSDK AFInAppEventParameterName(@NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "");
      paramString = i.V(paramString, new String[] { "\n" }, false, 0, 6, null);
      if (paramString.size() != 4) {
        return null;
      }
      Iterator localIterator = paramString.iterator();
      String str1 = null;
      paramString = str1;
      String str2 = paramString;
      Object localObject = str2;
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        if (i.s(str3, "label=", false, 2, null))
        {
          str1 = values(str3, "label=");
        }
        else if (i.s(str3, "hashName=", false, 2, null))
        {
          paramString = values(str3, "hashName=");
        }
        else if (i.s(str3, "stackTrace=", false, 2, null))
        {
          str2 = values(str3, "stackTrace=");
        }
        else
        {
          if (!i.s(str3, "c=", false, 2, null)) {
            break;
          }
          localObject = str3.substring(2);
          Intrinsics.checkNotNullExpressionValue(localObject, "");
          localObject = Integer.valueOf(Integer.parseInt(i.f0((CharSequence)localObject).toString()));
        }
      }
      if (AFKeystoreWrapper((Integer)localObject, new String[] { str1, paramString, str2 })) {
        return null;
      }
      Intrinsics.b(str1);
      Intrinsics.b(paramString);
      Intrinsics.b(str2);
      Intrinsics.b(localObject);
      return new AFc1zSDK(str1, paramString, str2, ((Number)localObject).intValue());
    }
    
    private static boolean AFKeystoreWrapper(Integer paramInteger, String... paramVarArgs)
    {
      boolean bool;
      if (paramInteger == null) {
        bool = true;
      } else {
        bool = false;
      }
      int i = paramVarArgs.length;
      for (i = 0; i < 3; i++)
      {
        paramInteger = paramVarArgs[i];
        if ((!bool) && (paramInteger != null) && (paramInteger.length() != 0)) {
          bool = false;
        } else {
          bool = true;
        }
      }
      return bool;
    }
    
    private static String values(String paramString1, String paramString2)
    {
      paramString1 = paramString1.substring(paramString2.length());
      Intrinsics.checkNotNullExpressionValue(paramString1, "");
      paramString2 = i.f0(paramString1).toString();
      Intrinsics.checkNotNullParameter(paramString2, "");
      paramString1 = b.b;
      paramString2 = paramString2.getBytes(paramString1);
      Intrinsics.checkNotNullExpressionValue(paramString2, "");
      Intrinsics.checkNotNullParameter(paramString2, "");
      paramString2 = Base64.decode(paramString2, 2);
      Intrinsics.checkNotNullExpressionValue(paramString2, "");
      return new String(paramString2, paramString1);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */