package com.google.android.exoplayer2.trackselection;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Format;

public final class DefaultTrackSelector$AudioTrackScore
  implements Comparable<AudioTrackScore>
{
  private final int bitrate;
  private final int channelCount;
  private final int defaultSelectionFlagScore;
  private final int matchLanguageScore;
  private final DefaultTrackSelector.Parameters parameters;
  private final int sampleRate;
  private final int withinRendererCapabilitiesScore;
  
  public DefaultTrackSelector$AudioTrackScore(Format paramFormat, DefaultTrackSelector.Parameters paramParameters, int paramInt)
  {
    parameters = paramParameters;
    int i = 0;
    withinRendererCapabilitiesScore = DefaultTrackSelector.isSupported(paramInt, false);
    matchLanguageScore = DefaultTrackSelector.formatHasLanguage(paramFormat, preferredAudioLanguage);
    paramInt = i;
    if ((selectionFlags & 0x1) != 0) {
      paramInt = 1;
    }
    defaultSelectionFlagScore = paramInt;
    channelCount = channelCount;
    sampleRate = sampleRate;
    bitrate = bitrate;
  }
  
  public int compareTo(@NonNull AudioTrackScore paramAudioTrackScore)
  {
    int i = withinRendererCapabilitiesScore;
    int j = withinRendererCapabilitiesScore;
    if (i != j) {
      return DefaultTrackSelector.access$300(i, j);
    }
    j = matchLanguageScore;
    int k = matchLanguageScore;
    if (j != k) {
      return DefaultTrackSelector.access$300(j, k);
    }
    j = defaultSelectionFlagScore;
    k = defaultSelectionFlagScore;
    if (j != k) {
      return DefaultTrackSelector.access$300(j, k);
    }
    if (parameters.forceLowestBitrate) {
      return DefaultTrackSelector.access$300(bitrate, bitrate);
    }
    j = 1;
    if (i != 1) {
      j = -1;
    }
    k = channelCount;
    i = channelCount;
    if (k != i) {
      return DefaultTrackSelector.access$300(k, i) * j;
    }
    i = sampleRate;
    k = sampleRate;
    if (i != k) {
      return DefaultTrackSelector.access$300(i, k) * j;
    }
    return DefaultTrackSelector.access$300(bitrate, bitrate) * j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackScore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */