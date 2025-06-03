package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class kx
  extends la
{
  public static final Parcelable.Creator<kx> CREATOR = new kw();
  private final String a;
  private final String b;
  private final String d;
  private final byte[] e;
  
  public kx(Parcel paramParcel)
  {
    super("GEOB");
    a = ((String)wl.a(paramParcel.readString()));
    b = ((String)wl.a(paramParcel.readString()));
    d = ((String)wl.a(paramParcel.readString()));
    e = ((byte[])wl.a(paramParcel.createByteArray()));
  }
  
  public kx(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    a = paramString1;
    b = paramString2;
    d = paramString3;
    e = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kx.class == paramObject.getClass()))
    {
      paramObject = (kx)paramObject;
      if ((wl.a(a, a)) && (wl.a(b, b)) && (wl.a(d, d)) && (Arrays.equals(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
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
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = d;
    if (str != null) {
      i = str.hashCode();
    }
    return Arrays.hashCode(e) + (((j + 527) * 31 + k) * 31 + i) * 31;
  }
  
  public final String toString()
  {
    String str1 = c;
    String str2 = a;
    String str3 = b;
    String str4 = d;
    return a.p(a.q(a.b(str4, a.b(str3, a.b(str2, a.b(str1, 36)))), str1, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeString(d);
    paramParcel.writeByteArray(e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */