package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class BinaryFrame$1
  implements Parcelable.Creator<BinaryFrame>
{
  public BinaryFrame createFromParcel(Parcel paramParcel)
  {
    return new BinaryFrame(paramParcel);
  }
  
  public BinaryFrame[] newArray(int paramInt)
  {
    return new BinaryFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.BinaryFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */