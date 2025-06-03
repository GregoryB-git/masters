package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class tc
  implements Parcelable
{
  public static final Parcelable.Creator<tc> CREATOR = new tf();
  public static final tc v = new tc();
  public final String w;
  public final String x;
  public final boolean y;
  public final int z;
  
  public tc()
  {
    this(null, null, false, 0);
  }
  
  public tc(Parcel paramParcel)
  {
    w = paramParcel.readString();
    x = paramParcel.readString();
    y = wl.a(paramParcel);
    z = paramParcel.readInt();
  }
  
  public tc(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    w = wl.b(paramString1);
    x = wl.b(paramString2);
    y = paramBoolean;
    z = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (tc)paramObject;
      if ((TextUtils.equals(w, w)) && (TextUtils.equals(x, x)) && (y == y) && (z == z)) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = w;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    str = x;
    if (str != null) {
      i = str.hashCode();
    }
    return (((j + 31) * 31 + i) * 31 + y) * 31 + z;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(w);
    paramParcel.writeString(x);
    wl.a(paramParcel, y);
    paramParcel.writeInt(z);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */