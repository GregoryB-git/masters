package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ChapterTocFrame$1
  implements Parcelable.Creator<ChapterTocFrame>
{
  public ChapterTocFrame createFromParcel(Parcel paramParcel)
  {
    return new ChapterTocFrame(paramParcel);
  }
  
  public ChapterTocFrame[] newArray(int paramInt)
  {
    return new ChapterTocFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */