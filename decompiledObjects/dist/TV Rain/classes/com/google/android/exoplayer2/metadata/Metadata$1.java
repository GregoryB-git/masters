package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Metadata$1
  implements Parcelable.Creator<Metadata>
{
  public Metadata createFromParcel(Parcel paramParcel)
  {
    return new Metadata(paramParcel);
  }
  
  public Metadata[] newArray(int paramInt)
  {
    return new Metadata[0];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.Metadata.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */