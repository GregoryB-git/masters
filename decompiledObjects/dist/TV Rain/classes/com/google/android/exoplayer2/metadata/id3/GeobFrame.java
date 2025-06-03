package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class GeobFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator()
  {
    public GeobFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new GeobFrame(paramAnonymousParcel);
    }
    
    public GeobFrame[] newArray(int paramAnonymousInt)
    {
      return new GeobFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "GEOB";
  public final byte[] data;
  public final String description;
  public final String filename;
  public final String mimeType;
  
  public GeobFrame(Parcel paramParcel)
  {
    super("GEOB");
    mimeType = ((String)Util.castNonNull(paramParcel.readString()));
    filename = ((String)Util.castNonNull(paramParcel.readString()));
    description = ((String)Util.castNonNull(paramParcel.readString()));
    data = ((byte[])Util.castNonNull(paramParcel.createByteArray()));
  }
  
  public GeobFrame(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    mimeType = paramString1;
    filename = paramString2;
    description = paramString3;
    data = paramArrayOfByte;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (GeobFrame.class == paramObject.getClass()))
    {
      paramObject = (GeobFrame)paramObject;
      if ((!Util.areEqual(mimeType, mimeType)) || (!Util.areEqual(filename, filename)) || (!Util.areEqual(description, description)) || (!Arrays.equals(data, data))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = mimeType;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = filename;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = description;
    if (str != null) {
      i = str.hashCode();
    }
    return Arrays.hashCode(data) + (((527 + j) * 31 + k) * 31 + i) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(mimeType);
    localStringBuilder.append(", filename=");
    localStringBuilder.append(filename);
    localStringBuilder.append(", description=");
    localStringBuilder.append(description);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(mimeType);
    paramParcel.writeString(filename);
    paramParcel.writeString(description);
    paramParcel.writeByteArray(data);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.GeobFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */