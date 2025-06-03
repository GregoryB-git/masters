package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display.Mode;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;

public final class DisplayCompat
{
  private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
  private static final int DISPLAY_SIZE_4K_WIDTH = 3840;
  
  public static Point getCurrentDisplaySizeFromWorkarounds(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    if (Build.VERSION.SDK_INT < 28) {
      localPoint = parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", paramDisplay);
    } else {
      localPoint = parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", paramDisplay);
    }
    if (localPoint != null) {
      return localPoint;
    }
    boolean bool = isSonyBravia4kTv(paramContext);
    Point localPoint = null;
    paramContext = localPoint;
    if (bool)
    {
      paramContext = localPoint;
      if (isCurrentModeTheLargestMode(paramDisplay)) {
        paramContext = new Point(3840, 2160);
      }
    }
    return paramContext;
  }
  
  @NonNull
  private static Point getDisplaySize(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    paramContext = getCurrentDisplaySizeFromWorkarounds(paramContext, paramDisplay);
    if (paramContext != null) {
      return paramContext;
    }
    paramContext = new Point();
    Api17Impl.getRealSize(paramDisplay, paramContext);
    return paramContext;
  }
  
  @NonNull
  public static ModeCompat getMode(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    return Api23Impl.getMode(paramContext, paramDisplay);
  }
  
  @SuppressLint({"ArrayReturn"})
  @NonNull
  public static ModeCompat[] getSupportedModes(@NonNull Context paramContext, @NonNull Display paramDisplay)
  {
    return Api23Impl.getSupportedModes(paramContext, paramDisplay);
  }
  
  @Nullable
  private static String getSystemProperty(String paramString)
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      paramString = (String)localClass.getMethod("get", new Class[] { String.class }).invoke(localClass, new Object[] { paramString });
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static boolean isCurrentModeTheLargestMode(@NonNull Display paramDisplay)
  {
    return Api23Impl.isCurrentModeTheLargestMode(paramDisplay);
  }
  
  private static boolean isSonyBravia4kTv(@NonNull Context paramContext)
  {
    boolean bool;
    if ((isTv(paramContext)) && ("Sony".equals(Build.MANUFACTURER)) && (Build.MODEL.startsWith("BRAVIA")) && (paramContext.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isTv(@NonNull Context paramContext)
  {
    paramContext = (UiModeManager)paramContext.getSystemService("uimode");
    boolean bool;
    if ((paramContext != null) && (paramContext.getCurrentModeType() == 4)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static Point parseDisplaySize(@NonNull String paramString)
    throws NumberFormatException
  {
    paramString = paramString.trim().split("x", -1);
    if (paramString.length == 2)
    {
      int i = Integer.parseInt(paramString[0]);
      int j = Integer.parseInt(paramString[1]);
      if ((i > 0) && (j > 0)) {
        return new Point(i, j);
      }
    }
    throw new NumberFormatException();
  }
  
  @Nullable
  private static Point parsePhysicalDisplaySizeFromSystemProperties(@NonNull String paramString, @NonNull Display paramDisplay)
  {
    if (paramDisplay.getDisplayId() != 0) {
      return null;
    }
    paramString = getSystemProperty(paramString);
    if ((!TextUtils.isEmpty(paramString)) && (paramString != null)) {}
    try
    {
      paramString = parseDisplaySize(paramString);
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    public static void getRealSize(Display paramDisplay, Point paramPoint)
    {
      paramDisplay.getRealSize(paramPoint);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
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
  
  public static final class ModeCompat
  {
    private final boolean mIsNative;
    private final Display.Mode mMode;
    private final Point mPhysicalSize;
    
    public ModeCompat(@NonNull Point paramPoint)
    {
      Preconditions.checkNotNull(paramPoint, "physicalSize == null");
      mPhysicalSize = paramPoint;
      mMode = null;
      mIsNative = true;
    }
    
    @RequiresApi(23)
    public ModeCompat(@NonNull Display.Mode paramMode, @NonNull Point paramPoint)
    {
      Preconditions.checkNotNull(paramMode, "mode == null, can't wrap a null reference");
      Preconditions.checkNotNull(paramPoint, "physicalSize == null");
      mPhysicalSize = paramPoint;
      mMode = paramMode;
      mIsNative = true;
    }
    
    @RequiresApi(23)
    public ModeCompat(@NonNull Display.Mode paramMode, boolean paramBoolean)
    {
      Preconditions.checkNotNull(paramMode, "mode == null, can't wrap a null reference");
      mPhysicalSize = new Point(Api23Impl.getPhysicalWidth(paramMode), Api23Impl.getPhysicalHeight(paramMode));
      mMode = paramMode;
      mIsNative = paramBoolean;
    }
    
    public int getPhysicalHeight()
    {
      return mPhysicalSize.y;
    }
    
    public int getPhysicalWidth()
    {
      return mPhysicalSize.x;
    }
    
    @Deprecated
    public boolean isNative()
    {
      return mIsNative;
    }
    
    @Nullable
    @RequiresApi(23)
    public Display.Mode toMode()
    {
      return mMode;
    }
    
    @RequiresApi(23)
    public static class Api23Impl
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
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */