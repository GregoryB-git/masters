package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class zzaq
  extends a
{
  public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
  public final int zza = 1;
  public final String zzb;
  
  public zzaq(int paramInt, String paramString)
  {
    j.i(paramString);
    zzb = paramString;
  }
  
  public zzaq(String paramString)
  {
    this(1, paramString);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, zza);
    z.F(paramParcel, 2, zzb, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */