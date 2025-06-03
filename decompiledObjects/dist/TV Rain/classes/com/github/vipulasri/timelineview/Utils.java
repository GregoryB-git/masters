package com.github.vipulasri.timelineview;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class Utils
{
  public static int dpToPx(float paramFloat, Context paramContext)
  {
    return dpToPx(paramFloat, paramContext.getResources());
  }
  
  public static int dpToPx(float paramFloat, Resources paramResources)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, paramResources.getDisplayMetrics());
  }
}

/* Location:
 * Qualified Name:     com.github.vipulasri.timelineview.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */