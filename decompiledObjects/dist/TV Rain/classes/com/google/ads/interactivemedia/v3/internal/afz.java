package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;

public final class afz
{
  public static boolean a = false;
  
  @TargetApi(13)
  public static boolean a(Context paramContext, TestingConfiguration paramTestingConfiguration)
  {
    if ((paramTestingConfiguration != null) && (paramTestingConfiguration.forceTvMode())) {
      return true;
    }
    paramContext = (UiModeManager)paramContext.getSystemService("uimode");
    return (paramContext != null) && (paramContext.getCurrentModeType() == 4);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */