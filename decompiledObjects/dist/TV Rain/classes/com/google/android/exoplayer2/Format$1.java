package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Format$1
  implements Parcelable.Creator<Format>
{
  public Format createFromParcel(Parcel paramParcel)
  {
    return new Format(paramParcel);
  }
  
  public Format[] newArray(int paramInt)
  {
    return new Format[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Format.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */