package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import e.e;
import e.i;

public class ButtonBarLayout
  extends LinearLayout
{
  public boolean o;
  public int p = -1;
  public int q = 0;
  
  public ButtonBarLayout(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, i.n0);
    s.B(this, paramContext, i.n0, paramAttributeSet, localTypedArray, 0, 0);
    o = localTypedArray.getBoolean(i.o0, true);
    localTypedArray.recycle();
  }
  
  private void setStacked(boolean paramBoolean)
  {
    setOrientation(paramBoolean);
    int i;
    if (paramBoolean) {
      i = 5;
    } else {
      i = 80;
    }
    setGravity(i);
    View localView = findViewById(e.w);
    if (localView != null)
    {
      if (paramBoolean) {
        paramBoolean = true;
      } else {
        paramBoolean = true;
      }
      localView.setVisibility(paramBoolean);
    }
    for (paramBoolean = getChildCount() - 2; !paramBoolean; paramBoolean--) {
      bringChildToFront(getChildAt(paramBoolean));
    }
  }
  
  public final int a(int paramInt)
  {
    int i = getChildCount();
    while (paramInt < i)
    {
      if (getChildAt(paramInt).getVisibility() == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  public final boolean b()
  {
    int i = getOrientation();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public int getMinimumHeight()
  {
    return Math.max(q, super.getMinimumHeight());
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = o;
    int j = 0;
    if (bool)
    {
      if ((i > p) && (b())) {
        setStacked(false);
      }
      p = i;
    }
    int k;
    if ((!b()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      i = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
      k = 1;
    }
    else
    {
      i = paramInt1;
      k = 0;
    }
    super.onMeasure(i, paramInt2);
    if ((o) && (!b()) && ((getMeasuredWidthAndState() & 0xFF000000) == 16777216)) {
      setStacked(true);
    } else {
      if (k == 0) {
        break label129;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    label129:
    i = a(0);
    paramInt1 = j;
    if (i >= 0)
    {
      View localView = getChildAt(i);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      paramInt2 = getPaddingTop() + localView.getMeasuredHeight() + topMargin + bottomMargin;
      if (b())
      {
        i = a(i + 1);
        paramInt1 = paramInt2;
        if (i >= 0) {
          paramInt1 = paramInt2 + (getChildAt(i).getPaddingTop() + (int)(getResourcesgetDisplayMetricsdensity * 16.0F));
        }
      }
      else
      {
        paramInt1 = paramInt2 + getPaddingBottom();
      }
    }
    if (s.n(this) != paramInt1) {
      setMinimumHeight(paramInt1);
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (o != paramBoolean)
    {
      o = paramBoolean;
      if ((!paramBoolean) && (getOrientation() == 1)) {
        setStacked(false);
      }
      requestLayout();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ButtonBarLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */