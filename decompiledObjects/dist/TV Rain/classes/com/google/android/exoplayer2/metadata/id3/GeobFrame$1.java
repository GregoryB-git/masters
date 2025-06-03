package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class GeobFrame$1
  implements Parcelable.Creator<GeobFrame>
{
  public GeobFrame createFromParcel(Parcel paramParcel)
  {
    return new GeobFrame(paramParcel);
  }
  
  public GeobFrame[] newArray(int paramInt)
  {
    return new GeobFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.GeobFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */