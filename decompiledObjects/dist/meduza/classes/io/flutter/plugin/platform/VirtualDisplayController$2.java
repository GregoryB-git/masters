package io.flutter.plugin.platform;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

class VirtualDisplayController$2
  implements View.OnAttachStateChangeListener
{
  public void onViewAttachedToWindow(View paramView)
  {
    VirtualDisplayController.OneTimeOnDrawListener.schedule(val$embeddedView, new Runnable()
    {
      public void run()
      {
        VirtualDisplayController.2 local2 = VirtualDisplayController.2.this;
        val$embeddedView.postDelayed(val$onNewSizeFrameAvailable, 128L);
      }
    });
    val$embeddedView.removeOnAttachStateChangeListener(this);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.VirtualDisplayController.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */