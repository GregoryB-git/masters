package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.List;
import z2;

final class Cea708Decoder$CueBuilder
{
  private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
  private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
  public static final int COLOR_SOLID_BLACK;
  public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
  public static final int COLOR_TRANSPARENT;
  private static final int DEFAULT_PRIORITY = 4;
  private static final int DIRECTION_BOTTOM_TO_TOP = 3;
  private static final int DIRECTION_LEFT_TO_RIGHT = 0;
  private static final int DIRECTION_RIGHT_TO_LEFT = 1;
  private static final int DIRECTION_TOP_TO_BOTTOM = 2;
  private static final int HORIZONTAL_SIZE = 209;
  private static final int JUSTIFICATION_CENTER = 2;
  private static final int JUSTIFICATION_FULL = 3;
  private static final int JUSTIFICATION_LEFT = 0;
  private static final int JUSTIFICATION_RIGHT = 1;
  private static final int MAXIMUM_ROW_COUNT = 15;
  private static final int PEN_FONT_STYLE_DEFAULT = 0;
  private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
  private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
  private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
  private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
  private static final int PEN_OFFSET_NORMAL = 1;
  private static final int PEN_SIZE_STANDARD = 1;
  private static final int[] PEN_STYLE_BACKGROUND;
  private static final int[] PEN_STYLE_EDGE_TYPE;
  private static final int[] PEN_STYLE_FONT_STYLE;
  private static final int RELATIVE_CUE_SIZE = 99;
  private static final int VERTICAL_SIZE = 74;
  private static final int[] WINDOW_STYLE_FILL;
  private static final int[] WINDOW_STYLE_JUSTIFICATION;
  private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
  private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
  private static final boolean[] WINDOW_STYLE_WORD_WRAP;
  private int anchorId;
  private int backgroundColor;
  private int backgroundColorStartPosition;
  private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();
  private boolean defined;
  private int foregroundColor;
  private int foregroundColorStartPosition;
  private int horizontalAnchor;
  private int italicsStartPosition;
  private int justification;
  private int penStyleId;
  private int priority;
  private boolean relativePositioning;
  private final List<SpannableString> rolledUpCaptions = new ArrayList();
  private int row;
  private int rowCount;
  private boolean rowLock;
  private int underlineStartPosition;
  private int verticalAnchor;
  private boolean visible;
  private int windowFillColor;
  private int windowStyleId;
  
  static
  {
    int i = getArgbColorFromCeaColor(0, 0, 0, 0);
    COLOR_SOLID_BLACK = i;
    int j = getArgbColorFromCeaColor(0, 0, 0, 3);
    COLOR_TRANSPARENT = j;
    WINDOW_STYLE_JUSTIFICATION = new int[] { 0, 0, 0, 0, 0, 2, 0 };
    WINDOW_STYLE_PRINT_DIRECTION = new int[] { 0, 0, 0, 0, 0, 0, 2 };
    WINDOW_STYLE_SCROLL_DIRECTION = new int[] { 3, 3, 3, 3, 3, 3, 1 };
    WINDOW_STYLE_WORD_WRAP = new boolean[] { 0, 0, 0, 1, 1, 1, 0 };
    WINDOW_STYLE_FILL = new int[] { i, j, i, i, j, i, i };
    PEN_STYLE_FONT_STYLE = new int[] { 0, 1, 2, 3, 4, 3, 4 };
    PEN_STYLE_EDGE_TYPE = new int[] { 0, 0, 0, 0, 0, 3, 3 };
    PEN_STYLE_BACKGROUND = new int[] { i, i, i, i, i, j, j };
  }
  
  public Cea708Decoder$CueBuilder()
  {
    reset();
  }
  
  public static int getArgbColorFromCeaColor(int paramInt1, int paramInt2, int paramInt3)
  {
    return getArgbColorFromCeaColor(paramInt1, paramInt2, paramInt3, 0);
  }
  
  public static int getArgbColorFromCeaColor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    Assertions.checkIndex(paramInt1, 0, 4);
    Assertions.checkIndex(paramInt2, 0, 4);
    Assertions.checkIndex(paramInt3, 0, 4);
    Assertions.checkIndex(paramInt4, 0, 4);
    if ((paramInt4 != 0) && (paramInt4 != 1)) {
      if (paramInt4 != 2)
      {
        if (paramInt4 == 3)
        {
          paramInt4 = 0;
          break label68;
        }
      }
      else
      {
        paramInt4 = 127;
        break label68;
      }
    }
    paramInt4 = 255;
    label68:
    if (paramInt1 > 1) {
      paramInt1 = 255;
    } else {
      paramInt1 = 0;
    }
    if (paramInt2 > 1) {
      paramInt2 = 255;
    } else {
      paramInt2 = 0;
    }
    if (paramInt3 > 1) {
      i = 255;
    }
    return Color.argb(paramInt4, paramInt1, paramInt2, i);
  }
  
  public void append(char paramChar)
  {
    if (paramChar == '\n')
    {
      rolledUpCaptions.add(buildSpannableString());
      captionStringBuilder.clear();
      if (italicsStartPosition != -1) {
        italicsStartPosition = 0;
      }
      if (underlineStartPosition != -1) {
        underlineStartPosition = 0;
      }
      if (foregroundColorStartPosition != -1) {
        foregroundColorStartPosition = 0;
      }
      if (backgroundColorStartPosition != -1) {
        backgroundColorStartPosition = 0;
      }
      while (((rowLock) && (rolledUpCaptions.size() >= rowCount)) || (rolledUpCaptions.size() >= 15)) {
        rolledUpCaptions.remove(0);
      }
    }
    captionStringBuilder.append(paramChar);
  }
  
  public void backspace()
  {
    int i = captionStringBuilder.length();
    if (i > 0) {
      captionStringBuilder.delete(i - 1, i);
    }
  }
  
  public Cea708Cue build()
  {
    if (isEmpty()) {
      return null;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    boolean bool = false;
    for (int i = 0; i < rolledUpCaptions.size(); i++)
    {
      localSpannableStringBuilder.append((CharSequence)rolledUpCaptions.get(i));
      localSpannableStringBuilder.append('\n');
    }
    localSpannableStringBuilder.append(buildSpannableString());
    i = justification;
    if (i != 0) {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            localObject = z2.t("Unexpected justification value: ");
            ((StringBuilder)localObject).append(justification);
            throw new IllegalArgumentException(((StringBuilder)localObject).toString());
          }
        }
        else
        {
          localObject = Layout.Alignment.ALIGN_CENTER;
          break label152;
        }
      }
      else
      {
        localObject = Layout.Alignment.ALIGN_OPPOSITE;
        break label152;
      }
    }
    Object localObject = Layout.Alignment.ALIGN_NORMAL;
    label152:
    float f1;
    float f2;
    if (relativePositioning)
    {
      f1 = horizontalAnchor / 99.0F;
      f2 = verticalAnchor / 99.0F;
    }
    else
    {
      f1 = horizontalAnchor / 209.0F;
      f2 = verticalAnchor / 74.0F;
    }
    int j = anchorId;
    if (j % 3 == 0) {
      i = 0;
    } else if (j % 3 == 1) {
      i = 1;
    } else {
      i = 2;
    }
    if (j / 3 == 0) {
      j = 0;
    } else if (j / 3 == 1) {
      j = 1;
    } else {
      j = 2;
    }
    int k = windowFillColor;
    if (k != COLOR_SOLID_BLACK) {
      bool = true;
    }
    return new Cea708Cue(localSpannableStringBuilder, (Layout.Alignment)localObject, f2 * 0.9F + 0.05F, 0, i, f1 * 0.9F + 0.05F, j, Float.MIN_VALUE, bool, k, priority);
  }
  
  public SpannableString buildSpannableString()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(captionStringBuilder);
    int i = localSpannableStringBuilder.length();
    if (i > 0)
    {
      if (italicsStartPosition != -1) {
        localSpannableStringBuilder.setSpan(new StyleSpan(2), italicsStartPosition, i, 33);
      }
      if (underlineStartPosition != -1) {
        localSpannableStringBuilder.setSpan(new UnderlineSpan(), underlineStartPosition, i, 33);
      }
      if (foregroundColorStartPosition != -1) {
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(foregroundColor), foregroundColorStartPosition, i, 33);
      }
      if (backgroundColorStartPosition != -1) {
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(backgroundColor), backgroundColorStartPosition, i, 33);
      }
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public void clear()
  {
    rolledUpCaptions.clear();
    captionStringBuilder.clear();
    italicsStartPosition = -1;
    underlineStartPosition = -1;
    foregroundColorStartPosition = -1;
    backgroundColorStartPosition = -1;
    row = 0;
  }
  
  public void defineWindow(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, boolean paramBoolean4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    defined = true;
    visible = paramBoolean1;
    rowLock = paramBoolean2;
    priority = paramInt1;
    relativePositioning = paramBoolean4;
    verticalAnchor = paramInt2;
    horizontalAnchor = paramInt3;
    anchorId = paramInt6;
    paramInt1 = rowCount;
    paramInt2 = paramInt4 + 1;
    if (paramInt1 != paramInt2)
    {
      rowCount = paramInt2;
      while (((paramBoolean2) && (rolledUpCaptions.size() >= rowCount)) || (rolledUpCaptions.size() >= 15)) {
        rolledUpCaptions.remove(0);
      }
    }
    if ((paramInt7 != 0) && (windowStyleId != paramInt7))
    {
      windowStyleId = paramInt7;
      paramInt1 = paramInt7 - 1;
      setWindowAttributes(WINDOW_STYLE_FILL[paramInt1], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[paramInt1], 0, WINDOW_STYLE_PRINT_DIRECTION[paramInt1], WINDOW_STYLE_SCROLL_DIRECTION[paramInt1], WINDOW_STYLE_JUSTIFICATION[paramInt1]);
    }
    if ((paramInt8 != 0) && (penStyleId != paramInt8))
    {
      penStyleId = paramInt8;
      paramInt1 = paramInt8 - 1;
      setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[paramInt1], PEN_STYLE_FONT_STYLE[paramInt1]);
      setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[paramInt1], COLOR_SOLID_BLACK);
    }
  }
  
  public boolean isDefined()
  {
    return defined;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if ((isDefined()) && ((!rolledUpCaptions.isEmpty()) || (captionStringBuilder.length() != 0))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isVisible()
  {
    return visible;
  }
  
  public void reset()
  {
    clear();
    defined = false;
    visible = false;
    priority = 4;
    relativePositioning = false;
    verticalAnchor = 0;
    horizontalAnchor = 0;
    anchorId = 0;
    rowCount = 15;
    rowLock = true;
    justification = 0;
    windowStyleId = 0;
    penStyleId = 0;
    int i = COLOR_SOLID_BLACK;
    windowFillColor = i;
    foregroundColor = COLOR_SOLID_WHITE;
    backgroundColor = i;
  }
  
  public void setPenAttributes(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, int paramInt5)
  {
    if (italicsStartPosition != -1)
    {
      if (!paramBoolean1)
      {
        captionStringBuilder.setSpan(new StyleSpan(2), italicsStartPosition, captionStringBuilder.length(), 33);
        italicsStartPosition = -1;
      }
    }
    else if (paramBoolean1) {
      italicsStartPosition = captionStringBuilder.length();
    }
    if (underlineStartPosition != -1)
    {
      if (!paramBoolean2)
      {
        captionStringBuilder.setSpan(new UnderlineSpan(), underlineStartPosition, captionStringBuilder.length(), 33);
        underlineStartPosition = -1;
      }
    }
    else if (paramBoolean2) {
      underlineStartPosition = captionStringBuilder.length();
    }
  }
  
  public void setPenColor(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((foregroundColorStartPosition != -1) && (foregroundColor != paramInt1)) {
      captionStringBuilder.setSpan(new ForegroundColorSpan(foregroundColor), foregroundColorStartPosition, captionStringBuilder.length(), 33);
    }
    if (paramInt1 != COLOR_SOLID_WHITE)
    {
      foregroundColorStartPosition = captionStringBuilder.length();
      foregroundColor = paramInt1;
    }
    if ((backgroundColorStartPosition != -1) && (backgroundColor != paramInt2)) {
      captionStringBuilder.setSpan(new BackgroundColorSpan(backgroundColor), backgroundColorStartPosition, captionStringBuilder.length(), 33);
    }
    if (paramInt2 != COLOR_SOLID_BLACK)
    {
      backgroundColorStartPosition = captionStringBuilder.length();
      backgroundColor = paramInt2;
    }
  }
  
  public void setPenLocation(int paramInt1, int paramInt2)
  {
    if (row != paramInt1) {
      append('\n');
    }
    row = paramInt1;
  }
  
  public void setVisibility(boolean paramBoolean)
  {
    visible = paramBoolean;
  }
  
  public void setWindowAttributes(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    windowFillColor = paramInt1;
    justification = paramInt6;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.Cea708Decoder.CueBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */