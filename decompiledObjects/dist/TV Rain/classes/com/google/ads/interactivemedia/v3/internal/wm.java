package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class wm
  implements Parcelable
{
  public static final Parcelable.Creator<wm> CREATOR = new wp();
  public final int a;
  public final int b;
  public final int c;
  public final byte[] d;
  private int e;
  
  public wm(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramArrayOfByte;
  }
  
  public wm(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    c = paramParcel.readInt();
    if (wl.a(paramParcel)) {
      paramParcel = paramParcel.createByteArray();
    } else {
      paramParcel = null;
    }
    d = paramParcel;
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
    if ((paramObject != null) && (wm.class == paramObject.getClass()))
    {
      paramObject = (wm)paramObject;
      if ((a == a) && (b == b) && (c == c) && (Arrays.equals(d, d))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (e == 0)
    {
      int i = a;
      int j = b;
      int k = c;
      e = (Arrays.hashCode(d) + (((i + 527) * 31 + j) * 31 + k) * 31);
    }
    return e;
  }
  
  public final String toString()
  {
    int i = a;
    int j = b;
    int k = c;
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder(55);
    localStringBuilder.append("ColorInfo(");
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
    localStringBuilder.append(", ");
    localStringBuilder.append(k);
    localStringBuilder.append(", ");
    localStringBuilder.append(bool);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    wl.a(paramParcel, bool);
    byte[] arrayOfByte = d;
    if (arrayOfByte != null) {
      paramParcel.writeByteArray(arrayOfByte);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */