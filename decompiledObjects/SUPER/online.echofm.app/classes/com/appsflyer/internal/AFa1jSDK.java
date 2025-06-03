package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFa1jSDK
  implements AFa1iSDK
{
  @NotNull
  private Map<String, String> valueOf = new LinkedHashMap();
  
  @NotNull
  public final Map<String, String> valueOf(@NotNull Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "");
    if (valueOf.isEmpty())
    {
      Resources localResources = paramContext.getResources();
      paramContext = localResources.getDisplayMetrics();
      int i = getConfigurationscreenLayout;
      valueOf.put("xdp", String.valueOf(xdpi));
      valueOf.put("ydp", String.valueOf(ydpi));
      valueOf.put("x_px", String.valueOf(widthPixels));
      valueOf.put("y_px", String.valueOf(heightPixels));
      valueOf.put("d_dpi", String.valueOf(densityDpi));
      valueOf.put("size", String.valueOf(i & 0xF));
    }
    return valueOf;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1jSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */