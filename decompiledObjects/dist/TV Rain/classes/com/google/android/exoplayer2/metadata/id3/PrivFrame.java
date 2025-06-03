package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class PrivFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator()
  {
    public PrivFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new PrivFrame(paramAnonymousParcel);
    }
    
    public PrivFrame[] newArray(int paramAnonymousInt)
    {
      return new PrivFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "PRIV";
  public final String owner;
  public final byte[] privateData;
  
  public PrivFrame(Parcel paramParcel)
  {
    super("PRIV");
    owner = ((String)Util.castNonNull(paramParcel.readString()));
    privateData = ((byte[])Util.castNonNull(paramParcel.createByteArray()));
  }
  
  public PrivFrame(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    owner = paramString;
    privateData = paramArrayOfByte;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (PrivFrame.class == paramObject.getClass()))
    {
      paramObject = (PrivFrame)paramObject;
      if ((!Util.areEqual(owner, owner)) || (!Arrays.equals(privateData, privateData))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = owner;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return Arrays.hashCode(privateData) + (527 + i) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": owner=");
    localStringBuilder.append(owner);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(owner);
    paramParcel.writeByteArray(privateData);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.PrivFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */