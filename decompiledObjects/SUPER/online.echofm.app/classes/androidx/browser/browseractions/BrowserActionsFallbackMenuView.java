package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import p.a;

@Deprecated
public class BrowserActionsFallbackMenuView
  extends LinearLayout
{
  public final int o = getResources().getDimensionPixelOffset(a.b);
  public final int p = getResources().getDimensionPixelOffset(a.a);
  
  public BrowserActionsFallbackMenuView(@NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResourcesgetDisplayMetricswidthPixels - o * 2, p), 1073741824), paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */