package androidx.appcompat.widget;

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
import b.a0;
import e0.d0;

public class ButtonBarLayout
  extends LinearLayout
{
  public boolean a;
  public boolean b;
  public int c = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = a0.x;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    d0.g(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, 0);
    a = localTypedArray.getBoolean(0, true);
    localTypedArray.recycle();
    if (getOrientation() == 1) {
      setStacked(a);
    }
  }
  
  private void setStacked(boolean paramBoolean)
  {
    if ((b != paramBoolean) && ((!paramBoolean) || (a)))
    {
      b = paramBoolean;
      setOrientation(paramBoolean);
      int i;
      if (paramBoolean) {
        i = 8388613;
      } else {
        i = 80;
      }
      setGravity(i);
      View localView = findViewById(2131362019);
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
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = a;
    int j = 0;
    if (bool)
    {
      if ((i > c) && (b)) {
        setStacked(false);
      }
      c = i;
    }
    if ((!b) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      k = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
      i = 1;
    }
    else
    {
      k = paramInt1;
      i = 0;
    }
    super.onMeasure(k, paramInt2);
    int k = i;
    int m;
    if (a)
    {
      k = i;
      if (!b)
      {
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          m = 1;
        } else {
          m = 0;
        }
        k = i;
        if (m != 0)
        {
          setStacked(true);
          k = 1;
        }
      }
    }
    if (k != 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
    k = getChildCount();
    for (i = 0;; i++)
    {
      m = -1;
      if (i >= k) {
        break;
      }
      if (getChildAt(i).getVisibility() == 0)
      {
        k = i;
        break label196;
      }
    }
    k = -1;
    label196:
    i = j;
    if (k >= 0)
    {
      localObject = getChildAt(k);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
      i = getPaddingTop();
      j = 0 + (((View)localObject).getMeasuredHeight() + i + topMargin + bottomMargin);
      if (b)
      {
        i = k + 1;
        int n = getChildCount();
        for (;;)
        {
          k = m;
          if (i >= n) {
            break;
          }
          if (getChildAt(i).getVisibility() == 0)
          {
            k = i;
            break;
          }
          i++;
        }
        i = j;
        if (k < 0) {
          break label347;
        }
        i = getChildAt(k).getPaddingTop() + (int)(getResourcesgetDisplayMetricsdensity * 16.0F);
      }
      else
      {
        i = getPaddingBottom();
      }
      i = j + i;
    }
    label347:
    Object localObject = d0.a;
    if (getMinimumHeight() != i)
    {
      setMinimumHeight(i);
      if (paramInt2 == 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (a != paramBoolean)
    {
      a = paramBoolean;
      if ((!paramBoolean) && (b)) {
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