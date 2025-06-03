package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import b.a0;

public final class AspectRatioFrameLayout
  extends FrameLayout
{
  public final b a;
  public float b;
  public int c = 0;
  
  public AspectRatioFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet != null) {
      paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, a0.W, 0, 0);
    }
    try
    {
      c = paramAttributeSet.getInt(0, 0);
      paramAttributeSet.recycle();
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public int getResizeMode()
  {
    return c;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (b <= 0.0F) {
      return;
    }
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    float f1 = paramInt1;
    float f2 = paramInt2;
    float f3 = f1 / f2;
    f3 = b / f3 - 1.0F;
    if (Math.abs(f3) <= 0.01F)
    {
      localb = a;
      localb.getClass();
      localb.getClass();
      localb.getClass();
      if (!a)
      {
        a = true;
        b.post(localb);
      }
      return;
    }
    int i = c;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          break label171;
        }
        if (i != 4) {
          break label180;
        }
        if (f3 > 0.0F) {
          break label171;
        }
      }
    }
    else {
      if (f3 <= 0.0F) {
        break label171;
      }
    }
    paramInt2 = (int)(f1 / b);
    break label180;
    label171:
    paramInt1 = (int)(f2 * b);
    label180:
    b localb = a;
    localb.getClass();
    localb.getClass();
    localb.getClass();
    if (!a)
    {
      a = true;
      b.post(localb);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  public void setAspectRatio(float paramFloat)
  {
    if (b != paramFloat)
    {
      b = paramFloat;
      requestLayout();
    }
  }
  
  public void setAspectRatioListener(a parama) {}
  
  public void setResizeMode(int paramInt)
  {
    if (c != paramInt)
    {
      c = paramInt;
      requestLayout();
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
  
  public final class b
    implements Runnable
  {
    public boolean a;
    
    public b() {}
    
    public final void run()
    {
      a = false;
      getClass();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.AspectRatioFrameLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */