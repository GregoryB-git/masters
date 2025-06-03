package com.google.firebase.messaging;

import B2.b;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class U
  implements Parcelable.Creator
{
  public static void c(T paramT, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.e(paramParcel, 2, o, false);
    c.b(paramParcel, paramInt);
  }
  
  public T a(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = b.n(paramParcel);
      if (b.i(j) != 2) {
        b.t(paramParcel, j);
      } else {
        localBundle = b.a(paramParcel, j);
      }
    }
    b.h(paramParcel, i);
    return new T(localBundle);
  }
  
  public T[] b(int paramInt)
  {
    return new T[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */