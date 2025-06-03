package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import z2;

public final class ll
  extends la
{
  public static final Parcelable.Creator<ll> CREATOR = new lk();
  private final String a;
  private final String b;
  
  public ll(Parcel paramParcel)
  {
    super((String)wl.a(paramParcel.readString()));
    a = paramParcel.readString();
    b = ((String)wl.a(paramParcel.readString()));
  }
  
  public ll(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    a = paramString2;
    b = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ll.class == paramObject.getClass()))
    {
      paramObject = (ll)paramObject;
      if ((c.equals(c)) && (wl.a(a, a)) && (wl.a(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = z2.c(c, 527, 31);
    String str = a;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = b;
    if (str != null) {
      j = str.hashCode();
    }
    return (i + k) * 31 + j;
  }
  
  public final String toString()
  {
    String str1 = c;
    String str2 = b;
    return z2.l(a.b(str2, a.b(str1, 6)), str1, ": url=", str2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(c);
    paramParcel.writeString(a);
    paramParcel.writeString(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ll
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */