package com.google.android.exoplayer2.source;

@Deprecated
public final class DynamicConcatenatingMediaSource
  extends ConcatenatingMediaSource
{
  @Deprecated
  public DynamicConcatenatingMediaSource()
  {
    super(new MediaSource[0]);
  }
  
  @Deprecated
  public DynamicConcatenatingMediaSource(boolean paramBoolean)
  {
    super(paramBoolean, new MediaSource[0]);
  }
  
  @Deprecated
  public DynamicConcatenatingMediaSource(boolean paramBoolean, ShuffleOrder paramShuffleOrder)
  {
    super(paramBoolean, paramShuffleOrder, new MediaSource[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.DynamicConcatenatingMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */