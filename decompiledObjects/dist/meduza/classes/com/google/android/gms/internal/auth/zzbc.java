package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzbc
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    PendingIntent localPendingIntent = null;
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
            localPendingIntent = (PendingIntent)b.e(paramParcel, k, PendingIntent.CREATOR);
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
    return new zzbb(j, str, localPendingIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */