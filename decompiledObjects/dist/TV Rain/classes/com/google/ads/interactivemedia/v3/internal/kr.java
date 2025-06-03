package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class kr
  extends la
{
  public static final Parcelable.Creator<kr> CREATOR = new kq();
  private final String a;
  private final int b;
  private final int d;
  private final long e;
  private final long f;
  private final la[] g;
  
  public kr(Parcel paramParcel)
  {
    super("CHAP");
    a = ((String)wl.a(paramParcel.readString()));
    b = paramParcel.readInt();
    d = paramParcel.readInt();
    e = paramParcel.readLong();
    f = paramParcel.readLong();
    int i = paramParcel.readInt();
    g = new la[i];
    for (int j = 0; j < i; j++) {
      g[j] = ((la)paramParcel.readParcelable(la.class.getClassLoader()));
    }
  }
  
  public kr(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, la[] paramArrayOfla)
  {
    super("CHAP");
    a = paramString;
    b = paramInt1;
    d = paramInt2;
    e = paramLong1;
    f = paramLong2;
    g = paramArrayOfla;
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
    if ((paramObject != null) && (kr.class == paramObject.getClass()))
    {
      paramObject = (kr)paramObject;
      if ((b == b) && (d == d) && (e == e) && (f == f) && (wl.a(a, a)) && (Arrays.equals(g, g))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = d;
    int k = (int)e;
    int m = (int)f;
    String str = a;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    return ((((i + 527) * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(d);
    paramParcel.writeLong(e);
    paramParcel.writeLong(f);
    paramParcel.writeInt(g.length);
    la[] arrayOfla = g;
    int i = arrayOfla.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfla[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */