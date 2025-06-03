package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class WebvttCssStyle
{
  public static final int FONT_SIZE_UNIT_EM = 2;
  public static final int FONT_SIZE_UNIT_PERCENT = 3;
  public static final int FONT_SIZE_UNIT_PIXEL = 1;
  private static final int OFF = 0;
  private static final int ON = 1;
  public static final int STYLE_BOLD = 1;
  public static final int STYLE_BOLD_ITALIC = 3;
  public static final int STYLE_ITALIC = 2;
  public static final int STYLE_NORMAL = 0;
  public static final int UNSPECIFIED = -1;
  private int backgroundColor;
  private int bold;
  private int fontColor;
  private String fontFamily;
  private float fontSize;
  private int fontSizeUnit;
  private boolean hasBackgroundColor;
  private boolean hasFontColor;
  private int italic;
  private int linethrough;
  private List<String> targetClasses;
  private String targetId;
  private String targetTag;
  private String targetVoice;
  private Layout.Alignment textAlign;
  private int underline;
  
  public WebvttCssStyle()
  {
    reset();
  }
  
  private static int updateScoreForMatch(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if (!paramString1.isEmpty())
    {
      int i = -1;
      if (paramInt1 != -1)
      {
        if (paramString1.equals(paramString2)) {
          i = paramInt1 + paramInt2;
        }
        return i;
      }
    }
    return paramInt1;
  }
  
  public void cascadeFrom(WebvttCssStyle paramWebvttCssStyle)
  {
    if (hasFontColor) {
      setFontColor(fontColor);
    }
    int i = bold;
    if (i != -1) {
      bold = i;
    }
    i = italic;
    if (i != -1) {
      italic = i;
    }
    String str = fontFamily;
    if (str != null) {
      fontFamily = str;
    }
    if (linethrough == -1) {
      linethrough = linethrough;
    }
    if (underline == -1) {
      underline = underline;
    }
    if (textAlign == null) {
      textAlign = textAlign;
    }
    if (fontSizeUnit == -1)
    {
      fontSizeUnit = fontSizeUnit;
      fontSize = fontSize;
    }
    if (hasBackgroundColor) {
      setBackgroundColor(backgroundColor);
    }
  }
  
  public int getBackgroundColor()
  {
    if (hasBackgroundColor) {
      return backgroundColor;
    }
    throw new IllegalStateException("Background color not defined.");
  }
  
  public int getFontColor()
  {
    if (hasFontColor) {
      return fontColor;
    }
    throw new IllegalStateException("Font color not defined");
  }
  
  public String getFontFamily()
  {
    return fontFamily;
  }
  
  public float getFontSize()
  {
    return fontSize;
  }
  
  public int getFontSizeUnit()
  {
    return fontSizeUnit;
  }
  
  public int getSpecificityScore(String paramString1, String paramString2, String[] paramArrayOfString, String paramString3)
  {
    if ((targetId.isEmpty()) && (targetTag.isEmpty()) && (targetClasses.isEmpty()) && (targetVoice.isEmpty())) {
      return paramString2.isEmpty();
    }
    int i = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, targetId, paramString1, 1073741824), targetTag, paramString2, 2), targetVoice, paramString3, 4);
    if ((i != -1) && (Arrays.asList(paramArrayOfString).containsAll(targetClasses))) {
      return targetClasses.size() * 4 + i;
    }
    return 0;
  }
  
  public int getStyle()
  {
    int i = bold;
    if ((i == -1) && (italic == -1)) {
      return -1;
    }
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (italic == 1) {
      j = 2;
    }
    return i | j;
  }
  
  public Layout.Alignment getTextAlign()
  {
    return textAlign;
  }
  
  public boolean hasBackgroundColor()
  {
    return hasBackgroundColor;
  }
  
  public boolean hasFontColor()
  {
    return hasFontColor;
  }
  
  public boolean isLinethrough()
  {
    int i = linethrough;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isUnderline()
  {
    int i = underline;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public void reset()
  {
    targetId = "";
    targetTag = "";
    targetClasses = Collections.emptyList();
    targetVoice = "";
    fontFamily = null;
    hasFontColor = false;
    hasBackgroundColor = false;
    linethrough = -1;
    underline = -1;
    bold = -1;
    italic = -1;
    fontSizeUnit = -1;
    textAlign = null;
  }
  
  public WebvttCssStyle setBackgroundColor(int paramInt)
  {
    backgroundColor = paramInt;
    hasBackgroundColor = true;
    return this;
  }
  
  public WebvttCssStyle setBold(boolean paramBoolean)
  {
    bold = paramBoolean;
    return this;
  }
  
  public WebvttCssStyle setFontColor(int paramInt)
  {
    fontColor = paramInt;
    hasFontColor = true;
    return this;
  }
  
  public WebvttCssStyle setFontFamily(String paramString)
  {
    fontFamily = Util.toLowerInvariant(paramString);
    return this;
  }
  
  public WebvttCssStyle setFontSize(float paramFloat)
  {
    fontSize = paramFloat;
    return this;
  }
  
  public WebvttCssStyle setFontSizeUnit(short paramShort)
  {
    fontSizeUnit = paramShort;
    return this;
  }
  
  public WebvttCssStyle setItalic(boolean paramBoolean)
  {
    italic = paramBoolean;
    return this;
  }
  
  public WebvttCssStyle setLinethrough(boolean paramBoolean)
  {
    linethrough = paramBoolean;
    return this;
  }
  
  public void setTargetClasses(String[] paramArrayOfString)
  {
    targetClasses = Arrays.asList(paramArrayOfString);
  }
  
  public void setTargetId(String paramString)
  {
    targetId = paramString;
  }
  
  public void setTargetTagName(String paramString)
  {
    targetTag = paramString;
  }
  
  public void setTargetVoice(String paramString)
  {
    targetVoice = paramString;
  }
  
  public WebvttCssStyle setTextAlign(Layout.Alignment paramAlignment)
  {
    textAlign = paramAlignment;
    return this;
  }
  
  public WebvttCssStyle setUnderline(boolean paramBoolean)
  {
    underline = paramBoolean;
    return this;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface FontSizeUnit {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface StyleFlags {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttCssStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */