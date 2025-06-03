package androidx.core.view;

import android.view.Display.Mode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class DisplayCompat$ModeCompat$Api23Impl
{
  @DoNotInline
  public static int getPhysicalHeight(Display.Mode paramMode)
  {
    return paramMode.getPhysicalHeight();
  }
  
  @DoNotInline
  public static int getPhysicalWidth(Display.Mode paramMode)
  {
    return paramMode.getPhysicalWidth();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCompat.ModeCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */