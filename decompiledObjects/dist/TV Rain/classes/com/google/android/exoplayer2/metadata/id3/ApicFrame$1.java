package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ApicFrame$1
  implements Parcelable.Creator<ApicFrame>
{
  public ApicFrame createFromParcel(Parcel paramParcel)
  {
    return new ApicFrame(paramParcel);
  }
  
  public ApicFrame[] newArray(int paramInt)
  {
    return new ApicFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ApicFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */