package androidx.core.graphics;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\032\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n¢\006\002\b\b"}, d2={"<anonymous>", "", "decoder", "Landroid/graphics/ImageDecoder;", "info", "Landroid/graphics/ImageDecoder$ImageInfo;", "source", "Landroid/graphics/ImageDecoder$Source;", "onHeaderDecoded"}, k=3, mv={1, 7, 1}, xi=176)
public final class ImageDecoderKt$decodeBitmap$1
  implements ImageDecoder.OnHeaderDecodedListener
{
  public ImageDecoderKt$decodeBitmap$1(Function3<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> paramFunction3) {}
  
  public final void onHeaderDecoded(@NotNull ImageDecoder paramImageDecoder, @NotNull ImageDecoder.ImageInfo paramImageInfo, @NotNull ImageDecoder.Source paramSource)
  {
    Intrinsics.checkNotNullParameter(paramImageDecoder, "decoder");
    Intrinsics.checkNotNullParameter(paramImageInfo, "info");
    Intrinsics.checkNotNullParameter(paramSource, "source");
    $action.invoke(paramImageDecoder, paramImageInfo, paramSource);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */