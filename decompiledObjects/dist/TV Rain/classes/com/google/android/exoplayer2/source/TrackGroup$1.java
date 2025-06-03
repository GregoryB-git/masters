package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class TrackGroup$1
  implements Parcelable.Creator<TrackGroup>
{
  public TrackGroup createFromParcel(Parcel paramParcel)
  {
    return new TrackGroup(paramParcel);
  }
  
  public TrackGroup[] newArray(int paramInt)
  {
    return new TrackGroup[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.TrackGroup.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */