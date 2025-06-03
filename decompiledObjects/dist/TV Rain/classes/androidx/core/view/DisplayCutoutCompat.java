package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2;

public final class DisplayCutoutCompat
{
  private final DisplayCutout mDisplayCutout;
  
  public DisplayCutoutCompat(@Nullable Rect paramRect, @Nullable List<Rect> paramList)
  {
    this(paramRect);
  }
  
  private DisplayCutoutCompat(DisplayCutout paramDisplayCutout)
  {
    mDisplayCutout = paramDisplayCutout;
  }
  
  public DisplayCutoutCompat(@NonNull androidx.core.graphics.Insets paramInsets1, @Nullable Rect paramRect1, @Nullable Rect paramRect2, @Nullable Rect paramRect3, @Nullable Rect paramRect4, @NonNull androidx.core.graphics.Insets paramInsets2)
  {
    this(constructDisplayCutout(paramInsets1, paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2));
  }
  
  private static DisplayCutout constructDisplayCutout(@NonNull androidx.core.graphics.Insets paramInsets1, @Nullable Rect paramRect1, @Nullable Rect paramRect2, @Nullable Rect paramRect3, @Nullable Rect paramRect4, @NonNull androidx.core.graphics.Insets paramInsets2)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      return Api30Impl.createDisplayCutout(paramInsets1.toPlatformInsets(), paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2.toPlatformInsets());
    }
    if (i >= 29) {
      return Api29Impl.createDisplayCutout(paramInsets1.toPlatformInsets(), paramRect1, paramRect2, paramRect3, paramRect4);
    }
    if (i >= 28)
    {
      paramInsets1 = new Rect(left, top, right, bottom);
      paramInsets2 = new ArrayList();
      if (paramRect1 != null) {
        paramInsets2.add(paramRect1);
      }
      if (paramRect2 != null) {
        paramInsets2.add(paramRect2);
      }
      if (paramRect3 != null) {
        paramInsets2.add(paramRect3);
      }
      if (paramRect4 != null) {
        paramInsets2.add(paramRect4);
      }
      return Api28Impl.createDisplayCutout(paramInsets1, paramInsets2);
    }
    return null;
  }
  
  public static DisplayCutoutCompat wrap(DisplayCutout paramDisplayCutout)
  {
    if (paramDisplayCutout == null) {
      paramDisplayCutout = null;
    } else {
      paramDisplayCutout = new DisplayCutoutCompat(paramDisplayCutout);
    }
    return paramDisplayCutout;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (DisplayCutoutCompat.class == paramObject.getClass()))
    {
      paramObject = (DisplayCutoutCompat)paramObject;
      return ObjectsCompat.equals(mDisplayCutout, mDisplayCutout);
    }
    return false;
  }
  
  @NonNull
  public List<Rect> getBoundingRects()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getBoundingRects(mDisplayCutout);
    }
    return Collections.emptyList();
  }
  
  public int getSafeInsetBottom()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getSafeInsetBottom(mDisplayCutout);
    }
    return 0;
  }
  
  public int getSafeInsetLeft()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getSafeInsetLeft(mDisplayCutout);
    }
    return 0;
  }
  
  public int getSafeInsetRight()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getSafeInsetRight(mDisplayCutout);
    }
    return 0;
  }
  
  public int getSafeInsetTop()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getSafeInsetTop(mDisplayCutout);
    }
    return 0;
  }
  
  @NonNull
  public androidx.core.graphics.Insets getWaterfallInsets()
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return androidx.core.graphics.Insets.toCompatInsets(Api30Impl.getWaterfallInsets(mDisplayCutout));
    }
    return androidx.core.graphics.Insets.NONE;
  }
  
  public int hashCode()
  {
    DisplayCutout localDisplayCutout = mDisplayCutout;
    int i;
    if (localDisplayCutout == null) {
      i = 0;
    } else {
      i = localDisplayCutout.hashCode();
    }
    return i;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("DisplayCutoutCompat{");
    localStringBuilder.append(mDisplayCutout);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  @RequiresApi(28)
  public DisplayCutout unwrap()
  {
    return mDisplayCutout;
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static DisplayCutout createDisplayCutout(Rect paramRect, List<Rect> paramList)
    {
      return new DisplayCutout(paramRect, paramList);
    }
    
    @DoNotInline
    public static List<Rect> getBoundingRects(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getBoundingRects();
    }
    
    @DoNotInline
    public static int getSafeInsetBottom(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetBottom();
    }
    
    @DoNotInline
    public static int getSafeInsetLeft(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetLeft();
    }
    
    @DoNotInline
    public static int getSafeInsetRight(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetRight();
    }
    
    @DoNotInline
    public static int getSafeInsetTop(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetTop();
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static DisplayCutout createDisplayCutout(android.graphics.Insets paramInsets, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4)
    {
      return new DisplayCutout(paramInsets, paramRect1, paramRect2, paramRect3, paramRect4);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static DisplayCutout createDisplayCutout(android.graphics.Insets paramInsets1, Rect paramRect1, Rect paramRect2, Rect paramRect3, Rect paramRect4, android.graphics.Insets paramInsets2)
    {
      return new DisplayCutout(paramInsets1, paramRect1, paramRect2, paramRect3, paramRect4, paramInsets2);
    }
    
    @DoNotInline
    public static android.graphics.Insets getWaterfallInsets(DisplayCutout paramDisplayCutout)
    {
      return d.d(paramDisplayCutout);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DisplayCutoutCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */