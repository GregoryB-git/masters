package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;

class VirtualDisplayController$OneTimeOnDrawListener
  implements ViewTreeObserver.OnDrawListener
{
  public Runnable mOnDrawRunnable;
  public final View mView;
  
  public VirtualDisplayController$OneTimeOnDrawListener(View paramView, Runnable paramRunnable)
  {
    mView = paramView;
    mOnDrawRunnable = paramRunnable;
  }
  
  public static void schedule(View paramView, Runnable paramRunnable)
  {
    paramRunnable = new OneTimeOnDrawListener(paramView, paramRunnable);
    paramView.getViewTreeObserver().addOnDrawListener(paramRunnable);
  }
  
  public void onDraw()
  {
    Runnable localRunnable = mOnDrawRunnable;
    if (localRunnable == null) {
      return;
    }
    localRunnable.run();
    mOnDrawRunnable = null;
    mView.post(new Runnable()
    {
      public void run()
      {
        mView.getViewTreeObserver().removeOnDrawListener(VirtualDisplayController.OneTimeOnDrawListener.this);
      }
    });
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */