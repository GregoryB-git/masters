package com.facebook.drawee.view;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import javax.annotation.Nullable;

public class AspectRatioMeasure
{
  private static boolean shouldAdjust(int paramInt)
  {
    boolean bool;
    if ((paramInt != 0) && (paramInt != -2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void updateMeasureSpec(Spec paramSpec, float paramFloat, @Nullable ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2)
  {
    if ((paramFloat > 0.0F) && (paramLayoutParams != null)) {
      if (shouldAdjust(height)) {
        height = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View.MeasureSpec.getSize(width) - paramInt1) / paramFloat + paramInt2), height), 1073741824);
      } else if (shouldAdjust(width)) {
        width = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View.MeasureSpec.getSize(height) - paramInt2) * paramFloat + paramInt1), width), 1073741824);
      }
    }
  }
  
  public static class Spec
  {
    public int height;
    public int width;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.AspectRatioMeasure
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */