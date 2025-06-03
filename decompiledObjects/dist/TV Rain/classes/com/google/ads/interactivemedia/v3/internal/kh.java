package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class kh
  implements kd.a
{
  public static final Parcelable.Creator<kh> CREATOR = new kg();
  public final String a;
  public final String b;
  public final long c;
  public final long d;
  public final byte[] e;
  private int f;
  
  static
  {
    bw.a(null, "application/id3", Long.MAX_VALUE);
    bw.a(null, "application/x-scte35", Long.MAX_VALUE);
  }
  
  public kh(Parcel paramParcel)
  {
    a = ((String)wl.a(paramParcel.readString()));
    b = ((String)wl.a(paramParcel.readString()));
    c = paramParcel.readLong();
    d = paramParcel.readLong();
    e = ((byte[])wl.a(paramParcel.createByteArray()));
  }
  
  public kh(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong1;
    d = paramLong2;
    e = paramArrayOfByte;
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
    if ((paramObject != null) && (kh.class == paramObject.getClass()))
    {
      paramObject = (kh)paramObject;
      if ((c == c) && (d == d) && (wl.a(a, a)) && (wl.a(b, b)) && (Arrays.equals(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (f == 0)
    {
      String str = a;
      int i = 0;
      int j;
      if (str != null) {
        j = str.hashCode();
      } else {
        j = 0;
      }
      str = b;
      if (str != null) {
        i = str.hashCode();
      }
      long l = c;
      int k = (int)(l ^ l >>> 32);
      l = d;
      int m = (int)(l ^ l >>> 32);
      f = (Arrays.hashCode(e) + ((((j + 527) * 31 + i) * 31 + k) * 31 + m) * 31);
    }
    return f;
  }
  
  public final String toString()
  {
    String str1 = a;
    long l1 = d;
    long l2 = c;
    String str2 = b;
    StringBuilder localStringBuilder = new StringBuilder(a.b(str2, a.b(str1, 79)));
    localStringBuilder.append("EMSG: scheme=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", id=");
    localStringBuilder.append(l1);
    localStringBuilder.append(", durationMs=");
    localStringBuilder.append(l2);
    localStringBuilder.append(", value=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeLong(c);
    paramParcel.writeLong(d);
    paramParcel.writeByteArray(e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */