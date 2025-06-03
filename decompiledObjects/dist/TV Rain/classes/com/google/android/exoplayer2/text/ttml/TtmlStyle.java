package com.google.android.exoplayer2.text.ttml;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class TtmlStyle
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
  private int bold = -1;
  private int fontColor;
  private String fontFamily;
  private float fontSize;
  private int fontSizeUnit = -1;
  private boolean hasBackgroundColor;
  private boolean hasFontColor;
  private String id;
  private TtmlStyle inheritableStyle;
  private int italic = -1;
  private int linethrough = -1;
  private Layout.Alignment textAlign;
  private int underline = -1;
  
  private TtmlStyle inherit(TtmlStyle paramTtmlStyle, boolean paramBoolean)
  {
    if (paramTtmlStyle != null)
    {
      if ((!hasFontColor) && (hasFontColor)) {
        setFontColor(fontColor);
      }
      if (bold == -1) {
        bold = bold;
      }
      if (italic == -1) {
        italic = italic;
      }
      if (fontFamily == null) {
        fontFamily = fontFamily;
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
      if ((paramBoolean) && (!hasBackgroundColor) && (hasBackgroundColor)) {
        setBackgroundColor(backgroundColor);
      }
    }
    return this;
  }
  
  public TtmlStyle chain(TtmlStyle paramTtmlStyle)
  {
    return inherit(paramTtmlStyle, true);
  }
  
  public int getBackgroundColor()
  {
    if (hasBackgroundColor) {
      return backgroundColor;
    }
    throw new IllegalStateException("Background color has not been defined.");
  }
  
  public int getFontColor()
  {
    if (hasFontColor) {
      return fontColor;
    }
    throw new IllegalStateException("Font color has not been defined.");
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
  
  public String getId()
  {
    return id;
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
  
  public TtmlStyle inherit(TtmlStyle paramTtmlStyle)
  {
    return inherit(paramTtmlStyle, false);
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
  
  public TtmlStyle setBackgroundColor(int paramInt)
  {
    backgroundColor = paramInt;
    hasBackgroundColor = true;
    return this;
  }
  
  public TtmlStyle setBold(boolean paramBoolean)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    bold = paramBoolean;
    return this;
  }
  
  public TtmlStyle setFontColor(int paramInt)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    fontColor = paramInt;
    hasFontColor = true;
    return this;
  }
  
  public TtmlStyle setFontFamily(String paramString)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    fontFamily = paramString;
    return this;
  }
  
  public TtmlStyle setFontSize(float paramFloat)
  {
    fontSize = paramFloat;
    return this;
  }
  
  public TtmlStyle setFontSizeUnit(int paramInt)
  {
    fontSizeUnit = paramInt;
    return this;
  }
  
  public TtmlStyle setId(String paramString)
  {
    id = paramString;
    return this;
  }
  
  public TtmlStyle setItalic(boolean paramBoolean)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    italic = paramBoolean;
    return this;
  }
  
  public TtmlStyle setLinethrough(boolean paramBoolean)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    linethrough = paramBoolean;
    return this;
  }
  
  public TtmlStyle setTextAlign(Layout.Alignment paramAlignment)
  {
    textAlign = paramAlignment;
    return this;
  }
  
  public TtmlStyle setUnderline(boolean paramBoolean)
  {
    boolean bool;
    if (inheritableStyle == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
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
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */