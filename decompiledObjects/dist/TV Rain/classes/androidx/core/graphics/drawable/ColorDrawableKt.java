package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\032\r\020\000\032\0020\001*\0020\002H\b\032\r\020\000\032\0020\001*\0020\003H\b¨\006\004"}, d2={"toDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class ColorDrawableKt
{
  @NotNull
  public static final ColorDrawable toDrawable(@ColorInt int paramInt)
  {
    return new ColorDrawable(paramInt);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final ColorDrawable toDrawable(@NotNull Color paramColor)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    return new ColorDrawable(b.d(paramColor));
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.ColorDrawableKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */