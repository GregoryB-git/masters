package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class PointerIconCompat
{
  public static final int TYPE_ALIAS = 1010;
  public static final int TYPE_ALL_SCROLL = 1013;
  public static final int TYPE_ARROW = 1000;
  public static final int TYPE_CELL = 1006;
  public static final int TYPE_CONTEXT_MENU = 1001;
  public static final int TYPE_COPY = 1011;
  public static final int TYPE_CROSSHAIR = 1007;
  public static final int TYPE_DEFAULT = 1000;
  public static final int TYPE_GRAB = 1020;
  public static final int TYPE_GRABBING = 1021;
  public static final int TYPE_HAND = 1002;
  public static final int TYPE_HELP = 1003;
  public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
  public static final int TYPE_NO_DROP = 1012;
  public static final int TYPE_NULL = 0;
  public static final int TYPE_TEXT = 1008;
  public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
  public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
  public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
  public static final int TYPE_VERTICAL_TEXT = 1009;
  public static final int TYPE_WAIT = 1004;
  public static final int TYPE_ZOOM_IN = 1018;
  public static final int TYPE_ZOOM_OUT = 1019;
  private final PointerIcon mPointerIcon;
  
  private PointerIconCompat(PointerIcon paramPointerIcon)
  {
    mPointerIcon = paramPointerIcon;
  }
  
  @NonNull
  public static PointerIconCompat create(@NonNull Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    return new PointerIconCompat(Api24Impl.create(paramBitmap, paramFloat1, paramFloat2));
  }
  
  @NonNull
  public static PointerIconCompat getSystemIcon(@NonNull Context paramContext, int paramInt)
  {
    return new PointerIconCompat(Api24Impl.getSystemIcon(paramContext, paramInt));
  }
  
  @NonNull
  public static PointerIconCompat load(@NonNull Resources paramResources, int paramInt)
  {
    return new PointerIconCompat(Api24Impl.load(paramResources, paramInt));
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Object getPointerIcon()
  {
    return mPointerIcon;
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static PointerIcon create(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
    {
      return PointerIcon.create(paramBitmap, paramFloat1, paramFloat2);
    }
    
    @DoNotInline
    public static PointerIcon getSystemIcon(Context paramContext, int paramInt)
    {
      return PointerIcon.getSystemIcon(paramContext, paramInt);
    }
    
    @DoNotInline
    public static PointerIcon load(Resources paramResources, int paramInt)
    {
      return PointerIcon.load(paramResources, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.PointerIconCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */