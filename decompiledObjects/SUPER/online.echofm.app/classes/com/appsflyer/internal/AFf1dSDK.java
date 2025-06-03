package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1dSDK
  implements AFf1eSDK
{
  @NotNull
  public final String valueOf(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "");
    paramString = String.format(paramString, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() });
    Intrinsics.checkNotNullExpressionValue(paramString, "");
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1dSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */