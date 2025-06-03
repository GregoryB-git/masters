package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import b.a0;

public final class c
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  static
  {
    new DecelerateInterpolator();
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Context localContext = getContext();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(null, a0.f, 2130968581, 0);
    int i = localTypedArray.getLayoutDimension(13, 0);
    paramConfiguration = localContext.getResources();
    int j = i;
    if (!localContext.getResources().getBoolean(2131034112)) {
      j = Math.min(i, paramConfiguration.getDimensionPixelSize(2131165193));
    }
    localTypedArray.recycle();
    setContentHeight(j);
    localContext.getResources().getDimensionPixelSize(2131165194);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((a)paramView).getClass();
    throw null;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool = true;
    } else {
      bool = false;
    }
    setFillViewport(bool);
    throw null;
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) {}
  
  public void setContentHeight(int paramInt)
  {
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    throw null;
  }
  
  public final class a
    extends LinearLayout
  {
    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      throw null;
    }
    
    public final void setSelected(boolean paramBoolean)
    {
      int i;
      if (isSelected() != paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      super.setSelected(paramBoolean);
      if ((i != 0) && (paramBoolean)) {
        sendAccessibilityEvent(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */