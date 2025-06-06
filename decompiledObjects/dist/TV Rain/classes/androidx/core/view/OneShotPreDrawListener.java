package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;

public final class OneShotPreDrawListener
  implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener
{
  private final Runnable mRunnable;
  private final View mView;
  private ViewTreeObserver mViewTreeObserver;
  
  private OneShotPreDrawListener(View paramView, Runnable paramRunnable)
  {
    mView = paramView;
    mViewTreeObserver = paramView.getViewTreeObserver();
    mRunnable = paramRunnable;
  }
  
  @NonNull
  public static OneShotPreDrawListener add(@NonNull View paramView, @NonNull Runnable paramRunnable)
  {
    if (paramView != null)
    {
      if (paramRunnable != null)
      {
        paramRunnable = new OneShotPreDrawListener(paramView, paramRunnable);
        paramView.getViewTreeObserver().addOnPreDrawListener(paramRunnable);
        paramView.addOnAttachStateChangeListener(paramRunnable);
        return paramRunnable;
      }
      throw new NullPointerException("runnable == null");
    }
    throw new NullPointerException("view == null");
  }
  
  public boolean onPreDraw()
  {
    removeListener();
    mRunnable.run();
    return true;
  }
  
  public void onViewAttachedToWindow(@NonNull View paramView)
  {
    mViewTreeObserver = paramView.getViewTreeObserver();
  }
  
  public void onViewDetachedFromWindow(@NonNull View paramView)
  {
    removeListener();
  }
  
  public void removeListener()
  {
    if (mViewTreeObserver.isAlive()) {
      mViewTreeObserver.removeOnPreDrawListener(this);
    } else {
      mView.getViewTreeObserver().removeOnPreDrawListener(this);
    }
    mView.removeOnAttachStateChangeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.OneShotPreDrawListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */