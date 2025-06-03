package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ChapterTocFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator()
  {
    public ChapterTocFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ChapterTocFrame(paramAnonymousParcel);
    }
    
    public ChapterTocFrame[] newArray(int paramAnonymousInt)
    {
      return new ChapterTocFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "CTOC";
  public final String[] children;
  public final String elementId;
  public final boolean isOrdered;
  public final boolean isRoot;
  private final Id3Frame[] subFrames;
  
  public ChapterTocFrame(Parcel paramParcel)
  {
    super("CTOC");
    elementId = ((String)Util.castNonNull(paramParcel.readString()));
    int i = paramParcel.readByte();
    boolean bool1 = true;
    int j = 0;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    isRoot = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    isOrdered = bool2;
    children = paramParcel.createStringArray();
    i = paramParcel.readInt();
    subFrames = new Id3Frame[i];
    while (j < i)
    {
      subFrames[j] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
      j++;
    }
  }
  
  public ChapterTocFrame(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CTOC");
    elementId = paramString;
    isRoot = paramBoolean1;
    isOrdered = paramBoolean2;
    children = paramArrayOfString;
    subFrames = paramArrayOfId3Frame;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ChapterTocFrame.class == paramObject.getClass()))
    {
      paramObject = (ChapterTocFrame)paramObject;
      if ((isRoot != isRoot) || (isOrdered != isOrdered) || (!Util.areEqual(elementId, elementId)) || (!Arrays.equals(children, children)) || (!Arrays.equals(subFrames, subFrames))) {
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
    int i = isRoot;
    int j = isOrdered;
    String str = elementId;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return ((527 + i) * 31 + j) * 31 + k;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(elementId);
    paramParcel.writeByte((byte)isRoot);
    paramParcel.writeByte((byte)isOrdered);
    paramParcel.writeStringArray(children);
    paramParcel.writeInt(subFrames.length);
    Id3Frame[] arrayOfId3Frame = subFrames;
    int i = arrayOfId3Frame.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfId3Frame[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterTocFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */