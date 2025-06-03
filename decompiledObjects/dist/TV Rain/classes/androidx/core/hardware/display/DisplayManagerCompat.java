package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.WeakHashMap;

public final class DisplayManagerCompat
{
  public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
  private static final WeakHashMap<Context, DisplayManagerCompat> sInstances = new WeakHashMap();
  private final Context mContext;
  
  private DisplayManagerCompat(Context paramContext)
  {
    mContext = paramContext;
  }
  
  @NonNull
  public static DisplayManagerCompat getInstance(@NonNull Context paramContext)
  {
    synchronized (sInstances)
    {
      DisplayManagerCompat localDisplayManagerCompat1 = (DisplayManagerCompat)???.get(paramContext);
      DisplayManagerCompat localDisplayManagerCompat2 = localDisplayManagerCompat1;
      if (localDisplayManagerCompat1 == null)
      {
        localDisplayManagerCompat2 = new androidx/core/hardware/display/DisplayManagerCompat;
        localDisplayManagerCompat2.<init>(paramContext);
        ???.put(paramContext, localDisplayManagerCompat2);
      }
      return localDisplayManagerCompat2;
    }
  }
  
  @Nullable
  public Display getDisplay(int paramInt)
  {
    return Api17Impl.getDisplay((DisplayManager)mContext.getSystemService("display"), paramInt);
  }
  
  @NonNull
  public Display[] getDisplays()
  {
    return Api17Impl.getDisplays((DisplayManager)mContext.getSystemService("display"));
  }
  
  @NonNull
  public Display[] getDisplays(@Nullable String paramString)
  {
    return Api17Impl.getDisplays((DisplayManager)mContext.getSystemService("display"));
  }
  
  @RequiresApi(17)
  public static class Api17Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.hardware.display.DisplayManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */