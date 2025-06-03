package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

public final class SpliceScheduleCommand$ComponentSplice
{
  public final int componentTag;
  public final long utcSpliceTime;
  
  private SpliceScheduleCommand$ComponentSplice(int paramInt, long paramLong)
  {
    componentTag = paramInt;
    utcSpliceTime = paramLong;
  }
  
  private static ComponentSplice createFromParcel(Parcel paramParcel)
  {
    return new ComponentSplice(paramParcel.readInt(), paramParcel.readLong());
  }
  
  private void writeToParcel(Parcel paramParcel)
  {
    paramParcel.writeInt(componentTag);
    paramParcel.writeLong(utcSpliceTime);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */