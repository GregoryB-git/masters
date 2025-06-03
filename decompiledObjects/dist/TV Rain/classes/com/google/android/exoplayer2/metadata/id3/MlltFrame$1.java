package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MlltFrame$1
  implements Parcelable.Creator<MlltFrame>
{
  public MlltFrame createFromParcel(Parcel paramParcel)
  {
    return new MlltFrame(paramParcel);
  }
  
  public MlltFrame[] newArray(int paramInt)
  {
    return new MlltFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.MlltFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */