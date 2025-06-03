package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Display;
import io.flutter.embedding.engine.FlutterJNI;

public class s$b
  implements DisplayManager.DisplayListener
{
  public DisplayManager a;
  
  public s$b(s params, DisplayManager paramDisplayManager)
  {
    a = paramDisplayManager;
  }
  
  public void a()
  {
    a.registerDisplayListener(this, null);
  }
  
  public void onDisplayAdded(int paramInt) {}
  
  public void onDisplayChanged(int paramInt)
  {
    if (paramInt == 0)
    {
      float f = a.getDisplay(0).getRefreshRate();
      s.b(b, (1.0E9D / f));
      s.c(b).setRefreshRateFPS(f);
    }
  }
  
  public void onDisplayRemoved(int paramInt) {}
}

/* Location:
 * Qualified Name:     io.flutter.view.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */