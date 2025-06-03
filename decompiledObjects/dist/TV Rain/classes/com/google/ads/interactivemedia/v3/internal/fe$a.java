package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.UUID;
import z2;

public final class fe$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new ff();
  public final byte[] a;
  private int b;
  private final UUID c;
  private final String d;
  private final String e;
  
  public fe$a(Parcel paramParcel)
  {
    c = new UUID(paramParcel.readLong(), paramParcel.readLong());
    d = paramParcel.readString();
    e = ((String)wl.a(paramParcel.readString()));
    a = paramParcel.createByteArray();
  }
  
  public fe$a(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    c = ((UUID)rp.a(paramUUID));
    d = paramString1;
    e = ((String)rp.a(paramString2));
    a = paramArrayOfByte;
  }
  
  public fe$a(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
  {
    this(paramUUID, null, paramString, paramArrayOfByte);
  }
  
  public final a a(byte[] paramArrayOfByte)
  {
    return new a(c, d, e, null);
  }
  
  public final boolean a()
  {
    return a != null;
  }
  
  public final boolean a(a parama)
  {
    return (a()) && (!parama.a()) && (a(c));
  }
  
  public final boolean a(UUID paramUUID)
  {
    return (av.a.equals(c)) || (paramUUID.equals(c));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (a)paramObject;
    return (wl.a(d, d)) && (wl.a(e, e)) && (wl.a(c, c)) && (Arrays.equals(a, a));
  }
  
  public final int hashCode()
  {
    if (b == 0)
    {
      int i = c.hashCode();
      String str = d;
      if (str == null) {
        j = 0;
      } else {
        j = str.hashCode();
      }
      int j = z2.c(e, (i * 31 + j) * 31, 31);
      b = (Arrays.hashCode(a) + j);
    }
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(c.getMostSignificantBits());
    paramParcel.writeLong(c.getLeastSignificantBits());
    paramParcel.writeString(d);
    paramParcel.writeString(e);
    paramParcel.writeByteArray(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fe.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */