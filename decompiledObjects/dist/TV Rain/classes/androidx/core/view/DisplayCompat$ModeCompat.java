package androidx.core.view;

import android.graphics.Point;
import android.view.Display.Mode;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class DisplayCompat$ModeCompat
{
  private final boolean mIsNative;
  private final Display.Mode mMode;
  private final Point mPhysicalSize;
  
  public DisplayCompat$ModeCompat(@NonNull Point paramPoint)
  {
    Preconditions.checkNotNull(paramPoint, "physicalSize == null");
    mPhysicalSize = paramPoint;
    mMode = null;
    mIsNative = true;
  }
  
  @RequiresApi(23)
  public DisplayCompat$ModeCompat(@NonNull Display.Mode paramMode, @NonNull Point paramPoint)
  {
    Preconditions.checkNotNull(paramMode, "mode == null, can't wrap a null reference");
    Preconditions.checkNotNull(paramPoint, "physicalSize == null");
    mPhysicalSize = paramPoint;
    mMode = paramMode;
    mIsNative = true;
  }
  
  @RequiresApi(23)
  public DisplayCompat$ModeCompat(@NonNull Display.Mode paramMode, boolean paramBoolean)
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

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCompat.ModeCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */