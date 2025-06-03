package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class TextInformationFrame$1
  implements Parcelable.Creator<TextInformationFrame>
{
  public TextInformationFrame createFromParcel(Parcel paramParcel)
  {
    return new TextInformationFrame(paramParcel);
  }
  
  public TextInformationFrame[] newArray(int paramInt)
  {
    return new TextInformationFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.TextInformationFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */