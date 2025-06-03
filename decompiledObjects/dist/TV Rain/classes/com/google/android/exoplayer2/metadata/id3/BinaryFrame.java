package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import z2;

public final class BinaryFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator()
  {
    public BinaryFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new BinaryFrame(paramAnonymousParcel);
    }
    
    public BinaryFrame[] newArray(int paramAnonymousInt)
    {
      return new BinaryFrame[paramAnonymousInt];
    }
  };
  public final byte[] data;
  
  public BinaryFrame(Parcel paramParcel)
  {
    super((String)Util.castNonNull(paramParcel.readString()));
    data = ((byte[])Util.castNonNull(paramParcel.createByteArray()));
  }
  
  public BinaryFrame(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    data = paramArrayOfByte;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (BinaryFrame.class == paramObject.getClass()))
    {
      paramObject = (BinaryFrame)paramObject;
      if ((!id.equals(id)) || (!Arrays.equals(data, data))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = z2.c(id, 527, 31);
    return Arrays.hashCode(data) + i;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeByteArray(data);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.BinaryFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */