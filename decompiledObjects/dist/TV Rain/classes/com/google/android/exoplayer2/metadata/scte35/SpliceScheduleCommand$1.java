package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SpliceScheduleCommand$1
  implements Parcelable.Creator<SpliceScheduleCommand>
{
  public SpliceScheduleCommand createFromParcel(Parcel paramParcel)
  {
    return new SpliceScheduleCommand(paramParcel, null);
  }
  
  public SpliceScheduleCommand[] newArray(int paramInt)
  {
    return new SpliceScheduleCommand[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */