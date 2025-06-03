package com.google.android.exoplayer2.text.cea;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.List;

class Cea608Decoder$CueBuilder
{
  private static final int BASE_ROW = 15;
  private static final int SCREEN_CHARWIDTH = 32;
  private int captionMode;
  private int captionRowCount;
  private final StringBuilder captionStringBuilder = new StringBuilder();
  private final List<CueStyle> cueStyles = new ArrayList();
  private int indent;
  private final List<SpannableString> rolledUpCaptions = new ArrayList();
  private int row;
  private int tabOffset;
  
  public Cea608Decoder$CueBuilder(int paramInt1, int paramInt2)
  {
    reset(paramInt1);
    setCaptionRowCount(paramInt2);
  }
  
  private static void setColorSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == -1) {
      return;
    }
    paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt3), paramInt1, paramInt2, 33);
  }
  
  private static void setItalicSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt1, paramInt2, 33);
  }
  
  private static void setUnderlineSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
  }
  
  public void append(char paramChar)
  {
    captionStringBuilder.append(paramChar);
  }
  
  public void backspace()
  {
    int i = captionStringBuilder.length();
    if (i > 0)
    {
      captionStringBuilder.delete(i - 1, i);
      for (int j = cueStyles.size() - 1; j >= 0; j--)
      {
        CueStyle localCueStyle = (CueStyle)cueStyles.get(j);
        int k = start;
        if (k != i) {
          break;
        }
        start = (k - 1);
      }
    }
  }
  
  public Cue build()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (int i = 0; i < rolledUpCaptions.size(); i++)
    {
      localSpannableStringBuilder.append((CharSequence)rolledUpCaptions.get(i));
      localSpannableStringBuilder.append('\n');
    }
    localSpannableStringBuilder.append(buildSpannableString());
    if (localSpannableStringBuilder.length() == 0) {
      return null;
    }
    int j = indent + tabOffset;
    int k = 32 - j - localSpannableStringBuilder.length();
    i = j - k;
    float f;
    if ((captionMode == 2) && ((Math.abs(i) < 3) || (k < 0)))
    {
      f = 0.5F;
      i = 1;
    }
    else if ((captionMode == 2) && (i > 0))
    {
      f = (32 - k) / 32.0F * 0.8F + 0.1F;
      i = 2;
    }
    else
    {
      f = j / 32.0F;
      i = 0;
      f = f * 0.8F + 0.1F;
    }
    if (captionMode != 1)
    {
      k = row;
      if (k <= 7)
      {
        j = 0;
        break label223;
      }
    }
    k = row - 15 - 2;
    j = 2;
    label223:
    return new Cue(localSpannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, k, 1, j, f, i, Float.MIN_VALUE);
  }
  
  public SpannableString buildSpannableString()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(captionStringBuilder);
    int i = localSpannableStringBuilder.length();
    int j = 0;
    int k = j;
    int m = k;
    int n = -1;
    int i1 = n;
    int i2 = i1;
    int i3 = i2;
    int i4 = i2;
    int i5 = k;
    int i6 = i1;
    while (j < cueStyles.size())
    {
      CueStyle localCueStyle = (CueStyle)cueStyles.get(j);
      boolean bool = underline;
      k = style;
      i1 = i3;
      int i7 = m;
      if (k != 8)
      {
        if (k == 7) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (k != 7) {
          i3 = Cea608Decoder.access$000()[k];
        }
        i7 = i1;
        i1 = i3;
      }
      k = start;
      int i8 = j + 1;
      if (i8 < cueStyles.size()) {
        i3 = cueStyles.get(i8)).start;
      } else {
        i3 = i;
      }
      if (k == i3)
      {
        j = i8;
        i3 = i1;
        m = i7;
      }
      else
      {
        if ((n != -1) && (!bool))
        {
          setUnderlineSpan(localSpannableStringBuilder, n, k);
          i2 = -1;
        }
        else
        {
          i2 = n;
          if (n == -1)
          {
            i2 = n;
            if (bool) {
              i2 = k;
            }
          }
        }
        int i9;
        if ((i6 != -1) && (i7 == 0))
        {
          setItalicSpan(localSpannableStringBuilder, i6, k);
          i9 = -1;
        }
        else
        {
          i9 = i6;
          if (i6 == -1)
          {
            i9 = i6;
            if (i7 != 0) {
              i9 = k;
            }
          }
        }
        j = i8;
        n = i2;
        i6 = i9;
        i3 = i1;
        m = i7;
        if (i1 != i4)
        {
          setColorSpan(localSpannableStringBuilder, i5, k, i4);
          i4 = i1;
          j = i8;
          n = i2;
          i6 = i9;
          i5 = k;
          i3 = i1;
          m = i7;
        }
      }
    }
    if ((n != -1) && (n != i)) {
      setUnderlineSpan(localSpannableStringBuilder, n, i);
    }
    if ((i6 != -1) && (i6 != i)) {
      setItalicSpan(localSpannableStringBuilder, i6, i);
    }
    if (i5 != i) {
      setColorSpan(localSpannableStringBuilder, i5, i, i4);
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public int getRow()
  {
    return row;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if ((cueStyles.isEmpty()) && (rolledUpCaptions.isEmpty()) && (captionStringBuilder.length() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reset(int paramInt)
  {
    captionMode = paramInt;
    cueStyles.clear();
    rolledUpCaptions.clear();
    captionStringBuilder.setLength(0);
    row = 15;
    indent = 0;
    tabOffset = 0;
  }
  
  public void rollUp()
  {
    rolledUpCaptions.add(buildSpannableString());
    captionStringBuilder.setLength(0);
    cueStyles.clear();
    int i = Math.min(captionRowCount, row);
    while (rolledUpCaptions.size() >= i) {
      rolledUpCaptions.remove(0);
    }
  }
  
  public void setCaptionRowCount(int paramInt)
  {
    captionRowCount = paramInt;
  }
  
  public void setIndent(int paramInt)
  {
    indent = paramInt;
  }
  
  public void setRow(int paramInt)
  {
    row = paramInt;
  }
  
  public void setStyle(int paramInt, boolean paramBoolean)
  {
    cueStyles.add(new CueStyle(paramInt, paramBoolean, captionStringBuilder.length()));
  }
  
  public void setTab(int paramInt)
  {
    tabOffset = paramInt;
  }
  
  public String toString()
  {
    return captionStringBuilder.toString();
  }
  
  public static class CueStyle
  {
    public int start;
    public final int style;
    public final boolean underline;
    
    public CueStyle(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      style = paramInt1;
      underline = paramBoolean;
      start = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */