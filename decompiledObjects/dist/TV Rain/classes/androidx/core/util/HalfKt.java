package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\030\n\000\n\002\030\002\n\002\020\006\n\002\020\007\n\002\020\n\n\002\020\016\n\000\032\r\020\000\032\0020\001*\0020\002H\b\032\r\020\000\032\0020\001*\0020\003H\b\032\r\020\000\032\0020\001*\0020\004H\b\032\r\020\000\032\0020\001*\0020\005H\b¨\006\006"}, d2={"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class HalfKt
{
  @RequiresApi(26)
  @NotNull
  public static final Half toHalf(double paramDouble)
  {
    Half localHalf = Half.valueOf((float)paramDouble);
    Intrinsics.checkNotNullExpressionValue(localHalf, "valueOf(this)");
    return localHalf;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Half toHalf(float paramFloat)
  {
    Half localHalf = Half.valueOf(paramFloat);
    Intrinsics.checkNotNullExpressionValue(localHalf, "valueOf(this)");
    return localHalf;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Half toHalf(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    paramString = Half.valueOf(paramString);
    Intrinsics.checkNotNullExpressionValue(paramString, "valueOf(this)");
    return paramString;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Half toHalf(short paramShort)
  {
    Half localHalf = Half.valueOf(paramShort);
    Intrinsics.checkNotNullExpressionValue(localHalf, "valueOf(this)");
    return localHalf;
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.HalfKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */