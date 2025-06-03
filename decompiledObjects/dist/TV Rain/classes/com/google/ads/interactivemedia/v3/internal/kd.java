package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class kd
  implements Parcelable
{
  public static final Parcelable.Creator<kd> CREATOR = new kf();
  private final a[] a;
  
  public kd(Parcel paramParcel)
  {
    a = new a[paramParcel.readInt()];
    for (int i = 0;; i++)
    {
      a[] arrayOfa = a;
      if (i >= arrayOfa.length) {
        break;
      }
      arrayOfa[i] = ((a)paramParcel.readParcelable(a.class.getClassLoader()));
    }
  }
  
  public kd(List<? extends a> paramList)
  {
    a[] arrayOfa = new a[paramList.size()];
    a = arrayOfa;
    paramList.toArray(arrayOfa);
  }
  
  public kd(a... paramVarArgs)
  {
    a[] arrayOfa = paramVarArgs;
    if (paramVarArgs == null) {
      arrayOfa = new a[0];
    }
    a = arrayOfa;
  }
  
  public final int a()
  {
    return a.length;
  }
  
  public final a a(int paramInt)
  {
    return a[paramInt];
  }
  
  public final kd a(kd paramkd)
  {
    if (paramkd == null) {
      return this;
    }
    return a(a);
  }
  
  public final kd a(a... paramVarArgs)
  {
    a[] arrayOfa = a;
    arrayOfa = (a[])Arrays.copyOf(arrayOfa, arrayOfa.length + paramVarArgs.length);
    System.arraycopy(paramVarArgs, 0, arrayOfa, a.length, paramVarArgs.length);
    return new kd((a[])wl.a(arrayOfa));
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
    if ((paramObject != null) && (kd.class == paramObject.getClass()))
    {
      paramObject = (kd)paramObject;
      return Arrays.equals(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public final String toString()
  {
    String str = String.valueOf(Arrays.toString(a));
    if (str.length() != 0) {
      return "entries=".concat(str);
    }
    return new String("entries=");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a.length);
    a[] arrayOfa = a;
    int i = arrayOfa.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfa[paramInt], 0);
    }
  }
  
  public static abstract interface a
    extends Parcelable
  {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */