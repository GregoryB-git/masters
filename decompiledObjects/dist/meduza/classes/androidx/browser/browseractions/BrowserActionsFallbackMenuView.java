package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView
  extends LinearLayout
{
  public final int a = getResources().getDimensionPixelOffset(2131165266);
  public final int b = getResources().getDimensionPixelOffset(2131165265);
  
  public BrowserActionsFallbackMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResourcesgetDisplayMetricswidthPixels - a * 2, b), 1073741824), paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */