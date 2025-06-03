package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class DrmInitData$1
  implements Parcelable.Creator<DrmInitData>
{
  public DrmInitData createFromParcel(Parcel paramParcel)
  {
    return new DrmInitData(paramParcel);
  }
  
  public DrmInitData[] newArray(int paramInt)
  {
    return new DrmInitData[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmInitData.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */