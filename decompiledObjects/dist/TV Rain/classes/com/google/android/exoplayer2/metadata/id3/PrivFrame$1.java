package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class PrivFrame$1
  implements Parcelable.Creator<PrivFrame>
{
  public PrivFrame createFromParcel(Parcel paramParcel)
  {
    return new PrivFrame(paramParcel);
  }
  
  public PrivFrame[] newArray(int paramInt)
  {
    return new PrivFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.PrivFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */