package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzee
  implements Parcelable.Creator<zzeb>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    Intent localIntent = null;
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
            localIntent = (Intent)b.e(paramParcel, k, Intent.CREATOR);
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
    return new zzeb(j, str, localIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */