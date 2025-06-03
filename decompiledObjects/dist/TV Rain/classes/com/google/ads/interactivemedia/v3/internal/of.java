package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class of
  implements Parcelable
{
  public static final Parcelable.Creator<of> CREATOR = new oe();
  public static final of a = new of(new od[0]);
  public final int b;
  private final od[] c;
  private int d;
  
  public of(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    b = i;
    c = new od[i];
    for (i = 0; i < b; i++) {
      c[i] = ((od)paramParcel.readParcelable(od.class.getClassLoader()));
    }
  }
  
  public of(od... paramVarArgs)
  {
    c = paramVarArgs;
    b = paramVarArgs.length;
  }
  
  public final int a(od paramod)
  {
    for (int i = 0; i < b; i++) {
      if (c[i] == paramod) {
        return i;
      }
    }
    return -1;
  }
  
  public final od a(int paramInt)
  {
    return c[paramInt];
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
    if ((paramObject != null) && (of.class == paramObject.getClass()))
    {
      paramObject = (of)paramObject;
      if ((b == b) && (Arrays.equals(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (d == 0) {
      d = Arrays.hashCode(c);
    }
    return d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(b);
    for (paramInt = 0; paramInt < b; paramInt++) {
      paramParcel.writeParcelable(c[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.of
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */