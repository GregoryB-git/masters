package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\032\n\000\n\002\020\b\n\002\030\002\n\002\020\007\n\002\030\002\n\002\030\002\n\002\b\002\032\r\020\000\032\0020\001*\0020\002H\n\032\r\020\000\032\0020\003*\0020\004H\n\032\r\020\000\032\0020\003*\0020\005H\n\032\r\020\006\032\0020\001*\0020\002H\n\032\r\020\006\032\0020\003*\0020\004H\n\032\r\020\006\032\0020\003*\0020\005H\n¨\006\007"}, d2={"component1", "", "Landroid/util/Size;", "", "Landroid/util/SizeF;", "Landroidx/core/util/SizeFCompat;", "component2", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class SizeKt
{
  @RequiresApi(21)
  public static final float component1(@NotNull SizeF paramSizeF)
  {
    Intrinsics.checkNotNullParameter(paramSizeF, "<this>");
    return paramSizeF.getWidth();
  }
  
  public static final float component1(@NotNull SizeFCompat paramSizeFCompat)
  {
    Intrinsics.checkNotNullParameter(paramSizeFCompat, "<this>");
    return paramSizeFCompat.getWidth();
  }
  
  @RequiresApi(21)
  public static final int component1(@NotNull Size paramSize)
  {
    Intrinsics.checkNotNullParameter(paramSize, "<this>");
    return paramSize.getWidth();
  }
  
  @RequiresApi(21)
  public static final float component2(@NotNull SizeF paramSizeF)
  {
    Intrinsics.checkNotNullParameter(paramSizeF, "<this>");
    return paramSizeF.getHeight();
  }
  
  public static final float component2(@NotNull SizeFCompat paramSizeFCompat)
  {
    Intrinsics.checkNotNullParameter(paramSizeFCompat, "<this>");
    return paramSizeFCompat.getHeight();
  }
  
  @RequiresApi(21)
  public static final int component2(@NotNull Size paramSize)
  {
    Intrinsics.checkNotNullParameter(paramSize, "<this>");
    return paramSize.getHeight();
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.SizeKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */