package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

final class TtmlRenderUtil
{
  public static void applyStylesToSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, TtmlStyle paramTtmlStyle)
  {
    if (paramTtmlStyle.getStyle() != -1) {
      paramSpannableStringBuilder.setSpan(new StyleSpan(paramTtmlStyle.getStyle()), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.isLinethrough()) {
      paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.isUnderline()) {
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.hasFontColor()) {
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramTtmlStyle.getFontColor()), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.hasBackgroundColor()) {
      paramSpannableStringBuilder.setSpan(new BackgroundColorSpan(paramTtmlStyle.getBackgroundColor()), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.getFontFamily() != null) {
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramTtmlStyle.getFontFamily()), paramInt1, paramInt2, 33);
    }
    if (paramTtmlStyle.getTextAlign() != null) {
      paramSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(paramTtmlStyle.getTextAlign()), paramInt1, paramInt2, 33);
    }
    int i = paramTtmlStyle.getFontSizeUnit();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramTtmlStyle.getFontSize() / 100.0F), paramInt1, paramInt2, 33);
        }
      }
      else {
        paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramTtmlStyle.getFontSize()), paramInt1, paramInt2, 33);
      }
    }
    else {
      paramSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)paramTtmlStyle.getFontSize(), true), paramInt1, paramInt2, 33);
    }
  }
  
  public static String applyTextElementSpacePolicy(String paramString)
  {
    return paramString.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
  }
  
  public static void endParagraph(SpannableStringBuilder paramSpannableStringBuilder)
  {
    for (int i = paramSpannableStringBuilder.length() - 1; (i >= 0) && (paramSpannableStringBuilder.charAt(i) == ' '); i--) {}
    if ((i >= 0) && (paramSpannableStringBuilder.charAt(i) != '\n')) {
      paramSpannableStringBuilder.append('\n');
    }
  }
  
  public static TtmlStyle resolveStyle(TtmlStyle paramTtmlStyle, String[] paramArrayOfString, Map<String, TtmlStyle> paramMap)
  {
    if ((paramTtmlStyle == null) && (paramArrayOfString == null)) {
      return null;
    }
    int i = 0;
    int j = 0;
    if ((paramTtmlStyle == null) && (paramArrayOfString.length == 1)) {
      return (TtmlStyle)paramMap.get(paramArrayOfString[0]);
    }
    if ((paramTtmlStyle == null) && (paramArrayOfString.length > 1))
    {
      paramTtmlStyle = new TtmlStyle();
      i = paramArrayOfString.length;
      while (j < i)
      {
        paramTtmlStyle.chain((TtmlStyle)paramMap.get(paramArrayOfString[j]));
        j++;
      }
      return paramTtmlStyle;
    }
    if ((paramTtmlStyle != null) && (paramArrayOfString != null) && (paramArrayOfString.length == 1)) {
      return paramTtmlStyle.chain((TtmlStyle)paramMap.get(paramArrayOfString[0]));
    }
    if ((paramTtmlStyle != null) && (paramArrayOfString != null) && (paramArrayOfString.length > 1))
    {
      int k = paramArrayOfString.length;
      for (j = i; j < k; j++) {
        paramTtmlStyle.chain((TtmlStyle)paramMap.get(paramArrayOfString[j]));
      }
    }
    return paramTtmlStyle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlRenderUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */