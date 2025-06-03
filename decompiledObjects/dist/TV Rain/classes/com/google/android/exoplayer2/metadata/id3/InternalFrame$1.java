package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class InternalFrame$1
  implements Parcelable.Creator<InternalFrame>
{
  public InternalFrame createFromParcel(Parcel paramParcel)
  {
    return new InternalFrame(paramParcel);
  }
  
  public InternalFrame[] newArray(int paramInt)
  {
    return new InternalFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.InternalFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */