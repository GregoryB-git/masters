package com.google.android.gms.internal.firebase_auth_api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzahz
  implements Parcelable.Creator<zzaia>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    while (paramParcel.dataPosition() < i) {
      b.t(paramParcel.readInt(), paramParcel);
    }
    b.j(i, paramParcel);
    return new zzaia();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */