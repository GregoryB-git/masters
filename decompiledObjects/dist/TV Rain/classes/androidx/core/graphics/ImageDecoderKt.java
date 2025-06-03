package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\0000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\032U\020\000\032\0020\001*\0020\0022C\b\004\020\003\032=\022\004\022\0020\005\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\002¢\006\f\b\007\022\b\b\b\022\004\b\b(\n\022\004\022\0020\0130\004¢\006\002\b\fH\bø\001\000\032U\020\r\032\0020\016*\0020\0022C\b\004\020\003\032=\022\004\022\0020\005\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\023\022\0210\002¢\006\f\b\007\022\b\b\b\022\004\b\b(\n\022\004\022\0020\0130\004¢\006\002\b\fH\bø\001\000\002\007\n\005\b20\001¨\006\017"}, d2={"decodeBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/ImageDecoder$Source;", "action", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "name", "info", "source", "", "Lkotlin/ExtensionFunctionType;", "decodeDrawable", "Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@SuppressLint({"ClassVerificationFailure"})
public final class ImageDecoderKt
{
  @RequiresApi(28)
  @NotNull
  public static final Bitmap decodeBitmap(@NotNull ImageDecoder.Source paramSource, @NotNull Function3<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> paramFunction3)
  {
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "action");
    paramSource = ImageDecoder.decodeBitmap(paramSource, new ImageDecoder.OnHeaderDecodedListener()
    {
      public final void onHeaderDecoded(@NotNull ImageDecoder paramAnonymousImageDecoder, @NotNull ImageDecoder.ImageInfo paramAnonymousImageInfo, @NotNull ImageDecoder.Source paramAnonymousSource)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousImageDecoder, "decoder");
        Intrinsics.checkNotNullParameter(paramAnonymousImageInfo, "info");
        Intrinsics.checkNotNullParameter(paramAnonymousSource, "source");
        $action.invoke(paramAnonymousImageDecoder, paramAnonymousImageInfo, paramAnonymousSource);
      }
    });
    Intrinsics.checkNotNullExpressionValue(paramSource, "crossinline action: Imag…ction(info, source)\n    }");
    return paramSource;
  }
  
  @RequiresApi(28)
  @NotNull
  public static final Drawable decodeDrawable(@NotNull ImageDecoder.Source paramSource, @NotNull Function3<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> paramFunction3)
  {
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction3, "action");
    paramSource = ImageDecoder.decodeDrawable(paramSource, new ImageDecoder.OnHeaderDecodedListener()
    {
      public final void onHeaderDecoded(@NotNull ImageDecoder paramAnonymousImageDecoder, @NotNull ImageDecoder.ImageInfo paramAnonymousImageInfo, @NotNull ImageDecoder.Source paramAnonymousSource)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousImageDecoder, "decoder");
        Intrinsics.checkNotNullParameter(paramAnonymousImageInfo, "info");
        Intrinsics.checkNotNullParameter(paramAnonymousSource, "source");
        $action.invoke(paramAnonymousImageDecoder, paramAnonymousImageInfo, paramAnonymousSource);
      }
    });
    Intrinsics.checkNotNullExpressionValue(paramSource, "crossinline action: Imag…ction(info, source)\n    }");
    return paramSource;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.ImageDecoderKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */