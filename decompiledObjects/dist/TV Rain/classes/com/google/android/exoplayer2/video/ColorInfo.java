package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import z2;

public final class ColorInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ColorInfo> CREATOR = new Parcelable.Creator()
  {
    public ColorInfo createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ColorInfo(paramAnonymousParcel);
    }
    
    public ColorInfo[] newArray(int paramAnonymousInt)
    {
      return new ColorInfo[0];
    }
  };
  public final int colorRange;
  public final int colorSpace;
  public final int colorTransfer;
  private int hashCode;
  @Nullable
  public final byte[] hdrStaticInfo;
  
  public ColorInfo(int paramInt1, int paramInt2, int paramInt3, @Nullable byte[] paramArrayOfByte)
  {
    colorSpace = paramInt1;
    colorRange = paramInt2;
    colorTransfer = paramInt3;
    hdrStaticInfo = paramArrayOfByte;
  }
  
  public ColorInfo(Parcel paramParcel)
  {
    colorSpace = paramParcel.readInt();
    colorRange = paramParcel.readInt();
    colorTransfer = paramParcel.readInt();
    if (Util.readBoolean(paramParcel)) {
      paramParcel = paramParcel.createByteArray();
    } else {
      paramParcel = null;
    }
    hdrStaticInfo = paramParcel;
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
    if ((paramObject != null) && (ColorInfo.class == paramObject.getClass()))
    {
      paramObject = (ColorInfo)paramObject;
      if ((colorSpace != colorSpace) || (colorRange != colorRange) || (colorTransfer != colorTransfer) || (!Arrays.equals(hdrStaticInfo, hdrStaticInfo))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = colorSpace;
      int j = colorRange;
      int k = colorTransfer;
      hashCode = (Arrays.hashCode(hdrStaticInfo) + (((527 + i) * 31 + j) * 31 + k) * 31);
    }
    return hashCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ColorInfo(");
    localStringBuilder.append(colorSpace);
    localStringBuilder.append(", ");
    localStringBuilder.append(colorRange);
    localStringBuilder.append(", ");
    localStringBuilder.append(colorTransfer);
    localStringBuilder.append(", ");
    boolean bool;
    if (hdrStaticInfo != null) {
      bool = true;
    } else {
      bool = false;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(colorSpace);
    paramParcel.writeInt(colorRange);
    paramParcel.writeInt(colorTransfer);
    boolean bool;
    if (hdrStaticInfo != null) {
      bool = true;
    } else {
      bool = false;
    }
    Util.writeBoolean(paramParcel, bool);
    byte[] arrayOfByte = hdrStaticInfo;
    if (arrayOfByte != null) {
      paramParcel.writeByteArray(arrayOfByte);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.ColorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */