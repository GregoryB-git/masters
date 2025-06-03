package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class CommentFrame$1
  implements Parcelable.Creator<CommentFrame>
{
  public CommentFrame createFromParcel(Parcel paramParcel)
  {
    return new CommentFrame(paramParcel);
  }
  
  public CommentFrame[] newArray(int paramInt)
  {
    return new CommentFrame[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.CommentFrame.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */