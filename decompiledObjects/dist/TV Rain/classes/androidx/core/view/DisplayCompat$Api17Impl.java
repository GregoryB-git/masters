package androidx.core.view;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class DisplayCompat$Api17Impl
{
  public static void getRealSize(Display paramDisplay, Point paramPoint)
  {
    paramDisplay.getRealSize(paramPoint);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */