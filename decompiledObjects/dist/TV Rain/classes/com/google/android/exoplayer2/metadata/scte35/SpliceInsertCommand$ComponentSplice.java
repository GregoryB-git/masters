package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

public final class SpliceInsertCommand$ComponentSplice
{
  public final long componentSplicePlaybackPositionUs;
  public final long componentSplicePts;
  public final int componentTag;
  
  private SpliceInsertCommand$ComponentSplice(int paramInt, long paramLong1, long paramLong2)
  {
    componentTag = paramInt;
    componentSplicePts = paramLong1;
    componentSplicePlaybackPositionUs = paramLong2;
  }
  
  public static ComponentSplice createFromParcel(Parcel paramParcel)
  {
    return new ComponentSplice(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong());
  }
  
  public void writeToParcel(Parcel paramParcel)
  {
    paramParcel.writeInt(componentTag);
    paramParcel.writeLong(componentSplicePts);
    paramParcel.writeLong(componentSplicePlaybackPositionUs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */