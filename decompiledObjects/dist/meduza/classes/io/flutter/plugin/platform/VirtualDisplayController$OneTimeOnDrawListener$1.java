package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

class VirtualDisplayController$OneTimeOnDrawListener$1
  implements Runnable
{
  public VirtualDisplayController$OneTimeOnDrawListener$1(VirtualDisplayController.OneTimeOnDrawListener paramOneTimeOnDrawListener) {}
  
  public void run()
  {
    this$0.mView.getViewTreeObserver().removeOnDrawListener(this$0);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */