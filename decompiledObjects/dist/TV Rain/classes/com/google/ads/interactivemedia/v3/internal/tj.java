package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public final class tj
  extends FrameLayout
{
  private final ti a = new ti(this, (byte)0);
  private float b;
  private int c = 0;
  
  public tj(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private tj(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
  }
  
  public final void a(float paramFloat)
  {
    if (b != paramFloat)
    {
      b = paramFloat;
      requestLayout();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (b <= 0.0F) {
      return;
    }
    paramInt2 = getMeasuredWidth();
    paramInt1 = getMeasuredHeight();
    float f1 = paramInt2;
    float f2 = paramInt1;
    float f3 = f1 / f2;
    float f4 = b / f3 - 1.0F;
    if (Math.abs(f4) <= 0.01F)
    {
      a.a(b, f3, false);
      return;
    }
    int i = c;
    if (i != 0) {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 4) {
            break label180;
          }
          if (f4 > 0.0F) {
            break label171;
          }
          f4 = b;
          break label146;
        }
      }
    }
    label146:
    label171:
    for (f4 = b;; f4 = b)
    {
      paramInt2 = (int)(f2 * f4);
      break;
      for (f4 = b;; f4 = b)
      {
        paramInt1 = (int)(f1 / f4);
        break label180;
        if (f4 <= 0.0F) {
          break;
        }
      }
    }
    label180:
    a.a(b, f3, true);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */