package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Display;
import io.flutter.embedding.engine.FlutterJNI;

class VsyncWaiter$DisplayListener
  implements DisplayManager.DisplayListener
{
  private DisplayManager displayManager;
  
  public VsyncWaiter$DisplayListener(VsyncWaiter paramVsyncWaiter, DisplayManager paramDisplayManager)
  {
    displayManager = paramDisplayManager;
  }
  
  public void onDisplayAdded(int paramInt) {}
  
  public void onDisplayChanged(int paramInt)
  {
    if (paramInt == 0)
    {
      float f = displayManager.getDisplay(0).getRefreshRate();
      VsyncWaiter.access$002(this$0, (1.0E9D / f));
      VsyncWaiter.access$100(this$0).setRefreshRateFPS(f);
    }
  }
  
  public void onDisplayRemoved(int paramInt) {}
  
  public void register()
  {
    displayManager.registerDisplayListener(this, null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.VsyncWaiter.DisplayListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */