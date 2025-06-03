package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class lf
  extends la
{
  public static final Parcelable.Creator<lf> CREATOR = new le();
  public final int a;
  public final int b;
  public final int[] d;
  public final int[] e;
  private final int f;
  
  public lf(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    super("MLLT");
    f = paramInt1;
    a = paramInt2;
    b = paramInt3;
    d = paramArrayOfInt1;
    e = paramArrayOfInt2;
  }
  
  public lf(Parcel paramParcel)
  {
    super("MLLT");
    f = paramParcel.readInt();
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    d = ((int[])wl.a(paramParcel.createIntArray()));
    e = ((int[])wl.a(paramParcel.createIntArray()));
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
    if ((paramObject != null) && (lf.class == paramObject.getClass()))
    {
      paramObject = (lf)paramObject;
      if ((f == f) && (a == a) && (b == b) && (Arrays.equals(d, d)) && (Arrays.equals(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = f;
    int j = a;
    int k = b;
    int m = Arrays.hashCode(d);
    return Arrays.hashCode(e) + (m + (((i + 527) * 31 + j) * 31 + k) * 31) * 31;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(f);
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeIntArray(d);
    paramParcel.writeIntArray(e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */