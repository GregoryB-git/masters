package com.google.android.exoplayer2.offline;

public final class TrackKey
{
  public final int groupIndex;
  public final int periodIndex;
  public final int trackIndex;
  
  public TrackKey(int paramInt1, int paramInt2, int paramInt3)
  {
    periodIndex = paramInt1;
    groupIndex = paramInt2;
    trackIndex = paramInt3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.TrackKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */