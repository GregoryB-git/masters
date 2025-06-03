package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ChapterFrame$1
  implements Parcelable.Creator<ChapterFrame>
{
  public ChapterFrame createFromParcel(Parcel paramParcel)
  {
    return new ChapterFrame(paramParcel);
  }
  
  public ChapterFrame[] newArray(int paramInt)
  {
    return new ChapterFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */