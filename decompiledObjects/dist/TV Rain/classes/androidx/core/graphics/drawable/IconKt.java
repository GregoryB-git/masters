package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\026\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\022\n\000\032\r\020\000\032\0020\001*\0020\002H\b\032\r\020\003\032\0020\001*\0020\002H\b\032\r\020\003\032\0020\001*\0020\004H\b\032\r\020\003\032\0020\001*\0020\005H\b¨\006\006"}, d2={"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class IconKt
{
  @RequiresApi(26)
  @NotNull
  public static final Icon toAdaptiveIcon(@NotNull Bitmap paramBitmap)
  {
    Intrinsics.checkNotNullParameter(paramBitmap, "<this>");
    paramBitmap = f0.o(paramBitmap);
    Intrinsics.checkNotNullExpressionValue(paramBitmap, "createWithAdaptiveBitmap(this)");
    return paramBitmap;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Icon toIcon(@NotNull Bitmap paramBitmap)
  {
    Intrinsics.checkNotNullParameter(paramBitmap, "<this>");
    paramBitmap = Icon.createWithBitmap(paramBitmap);
    Intrinsics.checkNotNullExpressionValue(paramBitmap, "createWithBitmap(this)");
    return paramBitmap;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Icon toIcon(@NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramUri, "<this>");
    paramUri = Icon.createWithContentUri(paramUri);
    Intrinsics.checkNotNullExpressionValue(paramUri, "createWithContentUri(this)");
    return paramUri;
  }
  
  @RequiresApi(26)
  @NotNull
  public static final Icon toIcon(@NotNull byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "<this>");
    paramArrayOfByte = Icon.createWithData(paramArrayOfByte, 0, paramArrayOfByte.length);
    Intrinsics.checkNotNullExpressionValue(paramArrayOfByte, "createWithData(this, 0, size)");
    return paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */