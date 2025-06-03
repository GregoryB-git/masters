package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ApicFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator()
  {
    public ApicFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ApicFrame(paramAnonymousParcel);
    }
    
    public ApicFrame[] newArray(int paramAnonymousInt)
    {
      return new ApicFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "APIC";
  @Nullable
  public final String description;
  public final String mimeType;
  public final byte[] pictureData;
  public final int pictureType;
  
  public ApicFrame(Parcel paramParcel)
  {
    super("APIC");
    mimeType = ((String)Util.castNonNull(paramParcel.readString()));
    description = ((String)Util.castNonNull(paramParcel.readString()));
    pictureType = paramParcel.readInt();
    pictureData = ((byte[])Util.castNonNull(paramParcel.createByteArray()));
  }
  
  public ApicFrame(String paramString1, @Nullable String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    mimeType = paramString1;
    description = paramString2;
    pictureType = paramInt;
    pictureData = paramArrayOfByte;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ApicFrame.class == paramObject.getClass()))
    {
      paramObject = (ApicFrame)paramObject;
      if ((pictureType != pictureType) || (!Util.areEqual(mimeType, mimeType)) || (!Util.areEqual(description, description)) || (!Arrays.equals(pictureData, pictureData))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = pictureType;
    String str = mimeType;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = description;
    if (str != null) {
      j = str.hashCode();
    }
    return Arrays.hashCode(pictureData) + (((527 + i) * 31 + k) * 31 + j) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(mimeType);
    localStringBuilder.append(", description=");
    localStringBuilder.append(description);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(mimeType);
    paramParcel.writeString(description);
    paramParcel.writeInt(pictureType);
    paramParcel.writeByteArray(pictureData);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ApicFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */