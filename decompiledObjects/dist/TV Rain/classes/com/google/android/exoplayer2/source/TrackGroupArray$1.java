package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class TrackGroupArray$1
  implements Parcelable.Creator<TrackGroupArray>
{
  public TrackGroupArray createFromParcel(Parcel paramParcel)
  {
    return new TrackGroupArray(paramParcel);
  }
  
  public TrackGroupArray[] newArray(int paramInt)
  {
    return new TrackGroupArray[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.TrackGroupArray.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */