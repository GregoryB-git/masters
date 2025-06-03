package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000$\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\005\032*\020\000\032\0020\001*\0020\0022\b\b\003\020\003\032\0020\0042\b\b\003\020\005\032\0020\0042\n\b\002\020\006\032\004\030\0010\007\032,\020\b\032\004\030\0010\001*\0020\0022\b\b\003\020\003\032\0020\0042\b\b\003\020\005\032\0020\0042\n\b\002\020\006\032\004\030\0010\007\0322\020\t\032\0020\n*\0020\0022\b\b\003\020\013\032\0020\0042\b\b\003\020\f\032\0020\0042\b\b\003\020\r\032\0020\0042\b\b\003\020\016\032\0020\004¨\006\017"}, d2={"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class DrawableKt
{
  @NotNull
  public static final Bitmap toBitmap(@NotNull Drawable paramDrawable, @Px int paramInt1, @Px int paramInt2, @Nullable Bitmap.Config paramConfig)
  {
    Intrinsics.checkNotNullParameter(paramDrawable, "<this>");
    if ((paramDrawable instanceof BitmapDrawable))
    {
      localObject = (BitmapDrawable)paramDrawable;
      if (((BitmapDrawable)localObject).getBitmap() != null)
      {
        if ((paramConfig == null) || (((BitmapDrawable)localObject).getBitmap().getConfig() == paramConfig))
        {
          if ((paramInt1 == ((BitmapDrawable)localObject).getBitmap().getWidth()) && (paramInt2 == ((BitmapDrawable)localObject).getBitmap().getHeight()))
          {
            paramDrawable = ((BitmapDrawable)localObject).getBitmap();
            Intrinsics.checkNotNullExpressionValue(paramDrawable, "bitmap");
            return paramDrawable;
          }
          paramDrawable = Bitmap.createScaledBitmap(((BitmapDrawable)localObject).getBitmap(), paramInt1, paramInt2, true);
          Intrinsics.checkNotNullExpressionValue(paramDrawable, "createScaledBitmap(bitmap, width, height, true)");
          return paramDrawable;
        }
      }
      else {
        throw new IllegalArgumentException("bitmap is null");
      }
    }
    Object localObject = paramDrawable.getBounds();
    Intrinsics.checkNotNullExpressionValue(localObject, "bounds");
    int i = left;
    int j = top;
    int k = right;
    int m = bottom;
    localObject = paramConfig;
    if (paramConfig == null) {
      localObject = Bitmap.Config.ARGB_8888;
    }
    paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
    paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
    paramDrawable.draw(new Canvas(paramConfig));
    paramDrawable.setBounds(i, j, k, m);
    Intrinsics.checkNotNullExpressionValue(paramConfig, "bitmap");
    return paramConfig;
  }
  
  @Nullable
  public static final Bitmap toBitmapOrNull(@NotNull Drawable paramDrawable, @Px int paramInt1, @Px int paramInt2, @Nullable Bitmap.Config paramConfig)
  {
    Intrinsics.checkNotNullParameter(paramDrawable, "<this>");
    if (((paramDrawable instanceof BitmapDrawable)) && (((BitmapDrawable)paramDrawable).getBitmap() == null)) {
      return null;
    }
    return toBitmap(paramDrawable, paramInt1, paramInt2, paramConfig);
  }
  
  public static final void updateBounds(@NotNull Drawable paramDrawable, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Intrinsics.checkNotNullParameter(paramDrawable, "<this>");
    paramDrawable.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.DrawableKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */