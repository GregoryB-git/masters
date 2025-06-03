package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class lp
  implements Parcelable, Comparable<lp>
{
  public static final Parcelable.Creator<lp> CREATOR = new lo();
  public final int a;
  public final int b;
  public final int c;
  
  public lp(int paramInt1, int paramInt2, int paramInt3)
  {
    a = -1;
    b = -1;
    c = -1;
  }
  
  public lp(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    c = paramParcel.readInt();
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
    if ((paramObject != null) && (lp.class == paramObject.getClass()))
    {
      paramObject = (lp)paramObject;
      if ((a == a) && (b == b) && (c == c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a * 31 + b) * 31 + c;
  }
  
  public final String toString()
  {
    int i = a;
    int j = b;
    int k = c;
    StringBuilder localStringBuilder = new StringBuilder(35);
    localStringBuilder.append(i);
    localStringBuilder.append(".");
    localStringBuilder.append(j);
    localStringBuilder.append(".");
    localStringBuilder.append(k);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */