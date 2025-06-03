package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import z2;

public final class kp
  extends la
{
  public static final Parcelable.Creator<kp> CREATOR = new ko();
  private final byte[] a;
  
  public kp(Parcel paramParcel)
  {
    super((String)wl.a(paramParcel.readString()));
    a = ((byte[])wl.a(paramParcel.createByteArray()));
  }
  
  public kp(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    a = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kp.class == paramObject.getClass()))
    {
      paramObject = (kp)paramObject;
      if ((c.equals(c)) && (Arrays.equals(a, a))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = z2.c(c, 527, 31);
    return Arrays.hashCode(a) + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(c);
    paramParcel.writeByteArray(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */