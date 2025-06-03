package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzba
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3) {
            b.t(k, paramParcel);
          } else {
            arrayOfByte = b.c(k, paramParcel);
          }
        }
        else {
          str = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new zzaz(j, str, arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */