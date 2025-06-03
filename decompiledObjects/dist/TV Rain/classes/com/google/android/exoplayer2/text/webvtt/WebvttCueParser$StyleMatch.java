package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.NonNull;

final class WebvttCueParser$StyleMatch
  implements Comparable<StyleMatch>
{
  public final int score;
  public final WebvttCssStyle style;
  
  public WebvttCueParser$StyleMatch(int paramInt, WebvttCssStyle paramWebvttCssStyle)
  {
    score = paramInt;
    style = paramWebvttCssStyle;
  }
  
  public int compareTo(@NonNull StyleMatch paramStyleMatch)
  {
    return score - score;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */