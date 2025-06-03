package com.devbrackets.android.exomedia.core.listener;

import com.google.android.exoplayer2.text.Cue;
import java.util.List;

public abstract interface CaptionListener
{
  public abstract void onCues(List<Cue> paramList);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.listener.CaptionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */