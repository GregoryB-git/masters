package androidx.core.text;

import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class HtmlCompat$Api24Impl
{
  @DoNotInline
  public static Spanned fromHtml(String paramString, int paramInt)
  {
    return Html.fromHtml(paramString, paramInt);
  }
  
  @DoNotInline
  public static Spanned fromHtml(String paramString, int paramInt, Html.ImageGetter paramImageGetter, Html.TagHandler paramTagHandler)
  {
    return Html.fromHtml(paramString, paramInt, paramImageGetter, paramTagHandler);
  }
  
  @DoNotInline
  public static String toHtml(Spanned paramSpanned, int paramInt)
  {
    return Html.toHtml(paramSpanned, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.HtmlCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */