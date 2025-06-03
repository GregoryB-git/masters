package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ChapterFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator()
  {
    public ChapterFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ChapterFrame(paramAnonymousParcel);
    }
    
    public ChapterFrame[] newArray(int paramAnonymousInt)
    {
      return new ChapterFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "CHAP";
  public final String chapterId;
  public final long endOffset;
  public final int endTimeMs;
  public final long startOffset;
  public final int startTimeMs;
  private final Id3Frame[] subFrames;
  
  public ChapterFrame(Parcel paramParcel)
  {
    super("CHAP");
    chapterId = ((String)Util.castNonNull(paramParcel.readString()));
    startTimeMs = paramParcel.readInt();
    endTimeMs = paramParcel.readInt();
    startOffset = paramParcel.readLong();
    endOffset = paramParcel.readLong();
    int i = paramParcel.readInt();
    subFrames = new Id3Frame[i];
    for (int j = 0; j < i; j++) {
      subFrames[j] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
    }
  }
  
  public ChapterFrame(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CHAP");
    chapterId = paramString;
    startTimeMs = paramInt1;
    endTimeMs = paramInt2;
    startOffset = paramLong1;
    endOffset = paramLong2;
    subFrames = paramArrayOfId3Frame;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ChapterFrame.class == paramObject.getClass()))
    {
      paramObject = (ChapterFrame)paramObject;
      if ((startTimeMs != startTimeMs) || (endTimeMs != endTimeMs) || (startOffset != startOffset) || (endOffset != endOffset) || (!Util.areEqual(chapterId, chapterId)) || (!Arrays.equals(subFrames, subFrames))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Id3Frame getSubFrame(int paramInt)
  {
    return subFrames[paramInt];
  }
  
  public int getSubFrameCount()
  {
    return subFrames.length;
  }
  
  public int hashCode()
  {
    int i = startTimeMs;
    int j = endTimeMs;
    int k = (int)startOffset;
    int m = (int)endOffset;
    String str = chapterId;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    return ((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(chapterId);
    paramParcel.writeInt(startTimeMs);
    paramParcel.writeInt(endTimeMs);
    paramParcel.writeLong(startOffset);
    paramParcel.writeLong(endOffset);
    paramParcel.writeInt(subFrames.length);
    Id3Frame[] arrayOfId3Frame = subFrames;
    int i = arrayOfId3Frame.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfId3Frame[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */