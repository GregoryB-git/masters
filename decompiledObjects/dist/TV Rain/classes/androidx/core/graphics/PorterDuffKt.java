package androidx.core.graphics;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\030\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\032\025\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\b\032\r\020\005\032\0020\006*\0020\002H\b¨\006\007"}, d2={"toColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/graphics/PorterDuff$Mode;", "color", "", "toXfermode", "Landroid/graphics/PorterDuffXfermode;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class PorterDuffKt
{
  @NotNull
  public static final PorterDuffColorFilter toColorFilter(@NotNull PorterDuff.Mode paramMode, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramMode, "<this>");
    return new PorterDuffColorFilter(paramInt, paramMode);
  }
  
  @NotNull
  public static final PorterDuffXfermode toXfermode(@NotNull PorterDuff.Mode paramMode)
  {
    Intrinsics.checkNotNullParameter(paramMode, "<this>");
    return new PorterDuffXfermode(paramMode);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PorterDuffKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */