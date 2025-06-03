package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SpliceInsertCommand$1
  implements Parcelable.Creator<SpliceInsertCommand>
{
  public SpliceInsertCommand createFromParcel(Parcel paramParcel)
  {
    return new SpliceInsertCommand(paramParcel, null);
  }
  
  public SpliceInsertCommand[] newArray(int paramInt)
  {
    return new SpliceInsertCommand[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */