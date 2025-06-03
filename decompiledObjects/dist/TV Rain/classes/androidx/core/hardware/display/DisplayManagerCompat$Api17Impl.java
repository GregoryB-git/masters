package androidx.core.hardware.display;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class DisplayManagerCompat$Api17Impl
{
  @DoNotInline
  public static Display getDisplay(DisplayManager paramDisplayManager, int paramInt)
  {
    return paramDisplayManager.getDisplay(paramInt);
  }
  
  @DoNotInline
  public static Display[] getDisplays(DisplayManager paramDisplayManager)
  {
    return paramDisplayManager.getDisplays();
  }
}

/* Location:
 * Qualified Name:     androidx.core.hardware.display.DisplayManagerCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */