package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class zzbw
  extends a
{
  public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
  public final int zza;
  public String zzb;
  
  public zzbw()
  {
    zza = 1;
  }
  
  public zzbw(int paramInt, String paramString)
  {
    zza = paramInt;
    zzb = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, zza);
    z.F(paramParcel, 2, zzb, false);
    z.L(paramInt, paramParcel);
  }
  
  public final zzbw zza(String paramString)
  {
    zzb = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */