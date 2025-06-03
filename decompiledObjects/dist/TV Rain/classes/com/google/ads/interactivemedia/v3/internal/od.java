package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class od
  implements Parcelable
{
  public static final Parcelable.Creator<od> CREATOR = new oc();
  public final int a;
  private final bw[] b;
  private int c;
  
  public od(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    a = i;
    b = new bw[i];
    for (i = 0; i < a; i++) {
      b[i] = ((bw)paramParcel.readParcelable(bw.class.getClassLoader()));
    }
  }
  
  public od(bw... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    b = paramVarArgs;
    a = paramVarArgs.length;
  }
  
  public final int a(bw parambw)
  {
    for (int i = 0;; i++)
    {
      bw[] arrayOfbw = b;
      if (i >= arrayOfbw.length) {
        break;
      }
      if (parambw == arrayOfbw[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public final bw a(int paramInt)
  {
    return b[paramInt];
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
    if ((paramObject != null) && (od.class == paramObject.getClass()))
    {
      paramObject = (od)paramObject;
      if ((a == a) && (Arrays.equals(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (c == 0) {
      c = (Arrays.hashCode(b) + 527);
    }
    return c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    for (paramInt = 0; paramInt < a; paramInt++) {
      paramParcel.writeParcelable(b[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.od
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */