package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@SuppressLint({"InlinedApi"})
public final class HtmlCompat
{
  public static final int FROM_HTML_MODE_COMPACT = 63;
  public static final int FROM_HTML_MODE_LEGACY = 0;
  public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
  public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
  public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
  public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
  
  @NonNull
  public static Spanned fromHtml(@NonNull String paramString, int paramInt)
  {
    return Api24Impl.fromHtml(paramString, paramInt);
  }
  
  @NonNull
  public static Spanned fromHtml(@NonNull String paramString, int paramInt, @Nullable Html.ImageGetter paramImageGetter, @Nullable Html.TagHandler paramTagHandler)
  {
    return Api24Impl.fromHtml(paramString, paramInt, paramImageGetter, paramTagHandler);
  }
  
  @NonNull
  public static String toHtml(@NonNull Spanned paramSpanned, int paramInt)
  {
    return Api24Impl.toHtml(paramSpanned, paramInt);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.text.HtmlCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */