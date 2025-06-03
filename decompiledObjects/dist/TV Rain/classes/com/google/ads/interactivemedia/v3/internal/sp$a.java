package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class sp$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new sv();
  public final int a;
  public final int[] b;
  public final int c;
  public final int d;
  private final int e;
  
  public sp$a(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    int i = paramParcel.readByte();
    e = i;
    int[] arrayOfInt = new int[i];
    b = arrayOfInt;
    paramParcel.readIntArray(arrayOfInt);
    c = paramParcel.readInt();
    d = paramParcel.readInt();
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
      if ((a == a) && (Arrays.equals(b, b)) && (c == c) && (d == d)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    return ((Arrays.hashCode(b) + i * 31) * 31 + c) * 31 + d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b.length);
    paramParcel.writeIntArray(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sp.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */