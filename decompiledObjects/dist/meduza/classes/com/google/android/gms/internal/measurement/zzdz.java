package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class zzdz
  extends a
{
  public static final Parcelable.Creator<zzdz> CREATOR = new zzec();
  public final long zza;
  public final long zzb;
  public final boolean zzc;
  public final String zzd;
  public final String zze;
  public final String zzf;
  public final Bundle zzg;
  public final String zzh;
  
  public zzdz(long paramLong1, long paramLong2, boolean paramBoolean, String paramString1, String paramString2, String paramString3, Bundle paramBundle, String paramString4)
  {
    zza = paramLong1;
    zzb = paramLong2;
    zzc = paramBoolean;
    zzd = paramString1;
    zze = paramString2;
    zzf = paramString3;
    zzg = paramBundle;
    zzh = paramString4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, zza);
    z.C(paramParcel, 2, zzb);
    z.t(paramParcel, 3, zzc);
    z.F(paramParcel, 4, zzd, false);
    z.F(paramParcel, 5, zze, false);
    z.F(paramParcel, 6, zzf, false);
    z.v(paramParcel, 7, zzg, false);
    z.F(paramParcel, 8, zzh, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */