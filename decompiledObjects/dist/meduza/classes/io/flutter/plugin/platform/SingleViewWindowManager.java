package io.flutter.plugin.platform;

import a4.r;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowMetrics;
import d3.a;
import e0.f0;
import e0.h0;
import e0.i0;
import io.flutter.Log;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

abstract class SingleViewWindowManager
  implements WindowManager
{
  private static final String TAG = "PlatformViewsController";
  public final WindowManager delegate;
  public SingleViewFakeWindowViewGroup fakeWindowRootView;
  
  public SingleViewWindowManager(WindowManager paramWindowManager, SingleViewFakeWindowViewGroup paramSingleViewFakeWindowViewGroup)
  {
    delegate = paramWindowManager;
    fakeWindowRootView = paramSingleViewFakeWindowViewGroup;
  }
  
  public void addCrossWindowBlurEnabledListener(Executor paramExecutor, Consumer<Boolean> paramConsumer)
  {
    i0.f(delegate, paramExecutor, paramConsumer);
  }
  
  public void addCrossWindowBlurEnabledListener(Consumer<Boolean> paramConsumer)
  {
    i0.g(delegate, paramConsumer);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    SingleViewFakeWindowViewGroup localSingleViewFakeWindowViewGroup = fakeWindowRootView;
    if (localSingleViewFakeWindowViewGroup == null)
    {
      Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
      return;
    }
    localSingleViewFakeWindowViewGroup.addView(paramView, paramLayoutParams);
  }
  
  public WindowMetrics getCurrentWindowMetrics()
  {
    return f0.b(delegate);
  }
  
  @Deprecated
  public Display getDefaultDisplay()
  {
    return delegate.getDefaultDisplay();
  }
  
  public WindowMetrics getMaximumWindowMetrics()
  {
    return a.c(delegate);
  }
  
  public boolean isCrossWindowBlurEnabled()
  {
    return h0.k(delegate);
  }
  
  public void removeCrossWindowBlurEnabledListener(Consumer<Boolean> paramConsumer)
  {
    r.g(delegate, paramConsumer);
  }
  
  public void removeView(View paramView)
  {
    SingleViewFakeWindowViewGroup localSingleViewFakeWindowViewGroup = fakeWindowRootView;
    if (localSingleViewFakeWindowViewGroup == null)
    {
      Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
      return;
    }
    localSingleViewFakeWindowViewGroup.removeView(paramView);
  }
  
  public void removeViewImmediate(View paramView)
  {
    if (fakeWindowRootView == null)
    {
      Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
      return;
    }
    paramView.clearAnimation();
    fakeWindowRootView.removeView(paramView);
  }
  
  public void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    SingleViewFakeWindowViewGroup localSingleViewFakeWindowViewGroup = fakeWindowRootView;
    if (localSingleViewFakeWindowViewGroup == null)
    {
      Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
      return;
    }
    localSingleViewFakeWindowViewGroup.updateViewLayout(paramView, paramLayoutParams);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewWindowManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */