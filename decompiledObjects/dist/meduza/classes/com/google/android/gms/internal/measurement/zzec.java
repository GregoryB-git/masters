package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzec
  implements Parcelable.Creator<zzdz>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = l1;
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    Object localObject1 = str3;
    Object localObject2 = localObject1;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\b': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\007': 
        localObject1 = b.b(j, paramParcel);
        break;
      case '\006': 
        str3 = b.f(j, paramParcel);
        break;
      case '\005': 
        str2 = b.f(j, paramParcel);
        break;
      case '\004': 
        str1 = b.f(j, paramParcel);
        break;
      case '\003': 
        bool = b.k(j, paramParcel);
        break;
      case '\002': 
        l2 = b.q(j, paramParcel);
        break;
      case '\001': 
        l1 = b.q(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new zzdz(l1, l2, bool, str1, str2, str3, (Bundle)localObject1, (String)localObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */