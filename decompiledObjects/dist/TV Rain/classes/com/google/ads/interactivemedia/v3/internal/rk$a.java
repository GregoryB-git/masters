package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class rk$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new ro();
  private final long a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  
  public rk$a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a = paramLong;
    b = paramString1;
    c = paramString2;
    d = paramString3;
    e = paramString4;
  }
  
  public rk$a(Parcel paramParcel)
  {
    a = paramParcel.readLong();
    b = paramParcel.readString();
    c = paramParcel.readString();
    d = paramParcel.readString();
    e = paramParcel.readString();
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
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((a == a) && (TextUtils.equals(b, b)) && (TextUtils.equals(c, c)) && (TextUtils.equals(d, d)) && (TextUtils.equals(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    String str = b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = d;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = e;
    if (str != null) {
      j = str.hashCode();
    }
    return (((i * 31 + k) * 31 + m) * 31 + n) * 31 + j;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(a);
    paramParcel.writeString(b);
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeString(e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rk.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */