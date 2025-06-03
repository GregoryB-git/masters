package androidx.core.text;

import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000 \n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032/\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\0042\n\b\002\020\005\032\004\030\0010\0062\n\b\002\020\007\032\004\030\0010\bH\b\032\027\020\t\032\0020\002*\0020\0012\b\b\002\020\n\032\0020\004H\b¨\006\013"}, d2={"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class HtmlKt
{
  @NotNull
  public static final Spanned parseAsHtml(@NotNull String paramString, int paramInt, @Nullable Html.ImageGetter paramImageGetter, @Nullable Html.TagHandler paramTagHandler)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    paramString = HtmlCompat.fromHtml(paramString, paramInt, paramImageGetter, paramTagHandler);
    Intrinsics.checkNotNullExpressionValue(paramString, "fromHtml(this, flags, imageGetter, tagHandler)");
    return paramString;
  }
  
  @NotNull
  public static final String toHtml(@NotNull Spanned paramSpanned, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramSpanned, "<this>");
    paramSpanned = HtmlCompat.toHtml(paramSpanned, paramInt);
    Intrinsics.checkNotNullExpressionValue(paramSpanned, "toHtml(this, option)");
    return paramSpanned;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.HtmlKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */