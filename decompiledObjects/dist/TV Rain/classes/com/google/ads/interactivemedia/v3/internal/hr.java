package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import z2;

public final class hr
  implements kd.a
{
  public static final Parcelable.Creator<hr> CREATOR = new hq();
  public final String a;
  public final byte[] b;
  public final int c;
  private final int d;
  
  private hr(Parcel paramParcel)
  {
    a = ((String)wl.a(paramParcel.readString()));
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    b = arrayOfByte;
    paramParcel.readByteArray(arrayOfByte);
    d = paramParcel.readInt();
    c = paramParcel.readInt();
  }
  
  public hr(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramArrayOfByte;
    d = paramInt1;
    c = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (hr.class == paramObject.getClass()))
    {
      paramObject = (hr)paramObject;
      if ((a.equals(a)) && (Arrays.equals(b, b)) && (d == d) && (c == c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = z2.c(a, 527, 31);
    return ((Arrays.hashCode(b) + i) * 31 + d) * 31 + c;
  }
  
  public final String toString()
  {
    String str = String.valueOf(a);
    if (str.length() != 0) {
      return "mdta: key=".concat(str);
    }
    return new String("mdta: key=");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeInt(b.length);
    paramParcel.writeByteArray(b);
    paramParcel.writeInt(d);
    paramParcel.writeInt(c);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */