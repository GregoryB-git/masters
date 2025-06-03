package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.SeekMap;

final class ExtractorMediaPeriod$PreparedState
{
  public final SeekMap seekMap;
  public final boolean[] trackEnabledStates;
  public final boolean[] trackIsAudioVideoFlags;
  public final boolean[] trackNotifiedDownstreamFormats;
  public final TrackGroupArray tracks;
  
  public ExtractorMediaPeriod$PreparedState(SeekMap paramSeekMap, TrackGroupArray paramTrackGroupArray, boolean[] paramArrayOfBoolean)
  {
    seekMap = paramSeekMap;
    tracks = paramTrackGroupArray;
    trackIsAudioVideoFlags = paramArrayOfBoolean;
    int i = length;
    trackEnabledStates = new boolean[i];
    trackNotifiedDownstreamFormats = new boolean[i];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaPeriod.PreparedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */