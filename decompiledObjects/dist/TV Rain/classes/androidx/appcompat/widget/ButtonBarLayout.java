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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout
  extends LinearLayout
{
  private static final int PEEK_BUTTON_DP = 16;
  private boolean mAllowStacking;
  private int mLastWidthSize = -1;
  private boolean mStacked;
  
  public ButtonBarLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.ButtonBarLayout;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, 0, 0);
    mAllowStacking = localTypedArray.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
    localTypedArray.recycle();
    if (getOrientation() == 1) {
      setStacked(mAllowStacking);
    }
  }
  
  private int getNextVisibleChildIndex(int paramInt)
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
  
  private boolean isStacked()
  {
    return mStacked;
  }
  
  private void setStacked(boolean paramBoolean)
  {
    if ((mStacked != paramBoolean) && ((!paramBoolean) || (mAllowStacking)))
    {
      mStacked = paramBoolean;
      setOrientation(paramBoolean);
      int i;
      if (paramBoolean) {
        i = 8388613;
      } else {
        i = 80;
      }
      setGravity(i);
      View localView = findViewById(R.id.spacer);
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
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = mAllowStacking;
    int j = 0;
    if (bool)
    {
      if ((i > mLastWidthSize) && (isStacked())) {
        setStacked(false);
      }
      mLastWidthSize = i;
    }
    if ((!isStacked()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
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
    int m = i;
    if (mAllowStacking)
    {
      m = i;
      if (!isStacked())
      {
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          k = 1;
        } else {
          k = 0;
        }
        m = i;
        if (k != 0)
        {
          setStacked(true);
          m = 1;
        }
      }
    }
    if (m != 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
    int k = getNextVisibleChildIndex(0);
    i = j;
    if (k >= 0)
    {
      View localView = getChildAt(k);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = getPaddingTop();
      i = localView.getMeasuredHeight() + i + topMargin + bottomMargin + 0;
      if (isStacked())
      {
        k = getNextVisibleChildIndex(k + 1);
        if (k >= 0) {
          i = getChildAt(k).getPaddingTop() + (int)(getResourcesgetDisplayMetricsdensity * 16.0F) + i;
        }
      }
      else
      {
        i = getPaddingBottom() + i;
      }
    }
    if (ViewCompat.getMinimumHeight(this) != i)
    {
      setMinimumHeight(i);
      if (paramInt2 == 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (mAllowStacking != paramBoolean)
    {
      mAllowStacking = paramBoolean;
      if ((!paramBoolean) && (isStacked())) {
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