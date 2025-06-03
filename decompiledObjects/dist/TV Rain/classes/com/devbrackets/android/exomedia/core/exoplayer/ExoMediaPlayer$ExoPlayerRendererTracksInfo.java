package com.devbrackets.android.exomedia.core.exoplayer;

import java.util.Collections;
import java.util.List;

class ExoMediaPlayer$ExoPlayerRendererTracksInfo
{
  public final int rendererTrackGroupIndex;
  public final int rendererTrackIndex;
  public final List<Integer> rendererTrackIndexes;
  
  public ExoMediaPlayer$ExoPlayerRendererTracksInfo(List<Integer> paramList, int paramInt1, int paramInt2)
  {
    rendererTrackIndexes = Collections.unmodifiableList(paramInt1);
    rendererTrackIndex = paramInt2;
    int i;
    rendererTrackGroupIndex = i;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.ExoPlayerRendererTracksInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */