package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Display.Mode;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class DisplayCompat$Api23Impl
{
  @NonNull
  public static DisplayCompat.ModeCompat getMode(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    Display.Mode localMode = paramDisplay.getMode();
    paramContext = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(paramContext, paramDisplay);
    if ((paramContext != null) && (!physicalSizeEquals(localMode, paramContext))) {
      paramContext = new DisplayCompat.ModeCompat(localMode, paramContext);
    } else {
      paramContext = new DisplayCompat.ModeCompat(localMode, true);
    }
    return paramContext;
  }
  
  @SuppressLint({"ArrayReturn"})
  @NonNull
  public static DisplayCompat.ModeCompat[] getSupportedModes(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    Display.Mode[] arrayOfMode = paramDisplay.getSupportedModes();
    DisplayCompat.ModeCompat[] arrayOfModeCompat = new DisplayCompat.ModeCompat[arrayOfMode.length];
    Display.Mode localMode = paramDisplay.getMode();
    paramDisplay = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(paramContext, paramDisplay);
    int i = 0;
    int j = i;
    if (paramDisplay != null) {
      if (physicalSizeEquals(localMode, paramDisplay)) {
        j = i;
      } else {
        for (j = 0; j < arrayOfMode.length; j++)
        {
          if (physicalSizeEquals(arrayOfMode[j], localMode)) {
            paramContext = new DisplayCompat.ModeCompat(arrayOfMode[j], paramDisplay);
          } else {
            paramContext = new DisplayCompat.ModeCompat(arrayOfMode[j], false);
          }
          arrayOfModeCompat[j] = paramContext;
        }
      }
    }
    while (j < arrayOfMode.length)
    {
      boolean bool = physicalSizeEquals(arrayOfMode[j], localMode);
      arrayOfModeCompat[j] = new DisplayCompat.ModeCompat(arrayOfMode[j], bool);
      j++;
    }
    return arrayOfModeCompat;
  }
  
  public static boolean isCurrentModeTheLargestMode(@NonNull Display paramDisplay)
  {
    Display.Mode localMode = paramDisplay.getMode();
    paramDisplay = paramDisplay.getSupportedModes();
    int i = paramDisplay.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramDisplay[j];
      if ((localMode.getPhysicalHeight() >= ((Display.Mode)localObject).getPhysicalHeight()) && (localMode.getPhysicalWidth() >= ((Display.Mode)localObject).getPhysicalWidth())) {
        j++;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public static boolean physicalSizeEquals(Display.Mode paramMode, Point paramPoint)
  {
    boolean bool;
    if (((paramMode.getPhysicalWidth() == x) && (paramMode.getPhysicalHeight() == y)) || ((paramMode.getPhysicalWidth() == y) && (paramMode.getPhysicalHeight() == x))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean physicalSizeEquals(Display.Mode paramMode1, Display.Mode paramMode2)
  {
    boolean bool;
    if ((paramMode1.getPhysicalWidth() == paramMode2.getPhysicalWidth()) && (paramMode1.getPhysicalHeight() == paramMode2.getPhysicalHeight())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */