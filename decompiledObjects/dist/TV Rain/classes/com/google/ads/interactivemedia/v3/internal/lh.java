package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import z2;

public final class lh
  extends la
{
  public static final Parcelable.Creator<lh> CREATOR = new lg();
  public final String a;
  public final byte[] b;
  
  public lh(Parcel paramParcel)
  {
    super("PRIV");
    a = ((String)wl.a(paramParcel.readString()));
    b = ((byte[])wl.a(paramParcel.createByteArray()));
  }
  
  public lh(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    a = paramString;
    b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (lh.class == paramObject.getClass()))
    {
      paramObject = (lh)paramObject;
      if ((wl.a(a, a)) && (Arrays.equals(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return Arrays.hashCode(b) + (i + 527) * 31;
  }
  
  public final String toString()
  {
    String str1 = c;
    String str2 = a;
    return z2.l(a.b(str2, a.b(str1, 8)), str1, ": owner=", str2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeByteArray(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */