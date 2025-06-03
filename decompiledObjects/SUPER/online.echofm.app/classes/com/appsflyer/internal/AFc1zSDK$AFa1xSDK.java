package com.appsflyer.internal;

import android.util.Base64;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1zSDK$AFa1xSDK
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

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1zSDK.AFa1xSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */