package com.google.android.gms.internal.firebase_auth_api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzagv
  implements Parcelable.Creator<zzagw>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            if (k != 5)
            {
              if (k != 6) {
                b.t(j, paramParcel);
              } else {
                localObject3 = b.r(j, paramParcel);
              }
            }
            else {
              localObject2 = b.f(j, paramParcel);
            }
          }
          else {
            localObject1 = b.r(j, paramParcel);
          }
        }
        else {
          str2 = b.f(j, paramParcel);
        }
      }
      else {
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new zzagw(str1, str2, (Long)localObject1, (String)localObject2, (Long)localObject3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */