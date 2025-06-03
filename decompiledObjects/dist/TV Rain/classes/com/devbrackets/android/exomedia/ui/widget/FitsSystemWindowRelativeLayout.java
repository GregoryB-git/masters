package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

public class FitsSystemWindowRelativeLayout
  extends RelativeLayout
{
  private Rect originalPadding;
  
  public FitsSystemWindowRelativeLayout(Context paramContext)
  {
    super(paramContext);
    setup();
  }
  
  public FitsSystemWindowRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup();
  }
  
  public FitsSystemWindowRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup();
  }
  
  @TargetApi(21)
  public FitsSystemWindowRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setup();
  }
  
  private boolean navBarCanMove()
  {
    boolean bool;
    if (getResourcesgetConfigurationsmallestScreenWidthDp <= 600) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void setup()
  {
    setFitsSystemWindows(true);
    if (originalPadding == null) {
      originalPadding = new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    updatePadding(new Rect());
  }
  
  private void updatePadding(Rect paramRect)
  {
    Rect localRect = originalPadding;
    int i = left;
    int j = left;
    int k = right;
    int m = right;
    int n = bottom;
    int i1 = bottom;
    setPadding(i + j, top + top, k + m, n + i1);
  }
  
  public boolean fitSystemWindows(@NonNull Rect paramRect)
  {
    updatePadding(paramRect);
    return false;
  }
  
  @TargetApi(20)
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    fitSystemWindows(new Rect(paramWindowInsets.getSystemWindowInsetLeft(), paramWindowInsets.getSystemWindowInsetTop(), paramWindowInsets.getSystemWindowInsetRight(), paramWindowInsets.getSystemWindowInsetBottom()));
    return paramWindowInsets;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (navBarCanMove()) {
      setup();
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.FitsSystemWindowRelativeLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */