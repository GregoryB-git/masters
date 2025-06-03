package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.layout.d;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public abstract class x
  implements WindowManager
{
  public final WindowManager o;
  public s p;
  
  public x(WindowManager paramWindowManager, s params)
  {
    o = paramWindowManager;
    p = params;
  }
  
  public void addCrossWindowBlurEnabledListener(Executor paramExecutor, Consumer paramConsumer)
  {
    w.a(o, paramExecutor, paramConsumer);
  }
  
  public void addCrossWindowBlurEnabledListener(Consumer paramConsumer)
  {
    v.a(o, paramConsumer);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    s locals = p;
    if (locals == null)
    {
      t5.b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
      return;
    }
    locals.addView(paramView, paramLayoutParams);
  }
  
  public WindowMetrics getCurrentWindowMetrics()
  {
    return d.a(o);
  }
  
  public Display getDefaultDisplay()
  {
    return o.getDefaultDisplay();
  }
  
  public WindowMetrics getMaximumWindowMetrics()
  {
    return androidx.window.layout.b.a(o);
  }
  
  public boolean isCrossWindowBlurEnabled()
  {
    return t.a(o);
  }
  
  public void removeCrossWindowBlurEnabledListener(Consumer paramConsumer)
  {
    u.a(o, paramConsumer);
  }
  
  public void removeView(View paramView)
  {
    s locals = p;
    if (locals == null)
    {
      t5.b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
      return;
    }
    locals.removeView(paramView);
  }
  
  public void removeViewImmediate(View paramView)
  {
    if (p == null)
    {
      t5.b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
      return;
    }
    paramView.clearAnimation();
    p.removeView(paramView);
  }
  
  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    s locals = p;
    if (locals == null)
    {
      t5.b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
      return;
    }
    locals.updateViewLayout(paramView, paramLayoutParams);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */