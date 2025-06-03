package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import z5.b;

public final class zzp
  extends zza
{
  public zzp(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
  }
  
  public final void zzd(IStatusCallback paramIStatusCallback, zzbw paramzzbw)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramIStatusCallback);
    zzc.zzc(localParcel, paramzzbw);
    zzc(2, localParcel);
  }
  
  public final void zze(zzm paramzzm, b paramb)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzm);
    zzc.zzc(localParcel, paramb);
    zzc(4, localParcel);
  }
  
  public final void zzf(zzo paramzzo, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzo);
    zzc.zzc(localParcel, paramAccount);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBundle);
    zzc(1, localParcel);
  }
  
  public final void zzg(zzk paramzzk, Account paramAccount)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzk);
    zzc.zzc(localParcel, paramAccount);
    zzc(6, localParcel);
  }
  
  public final void zzh(zzk paramzzk, String paramString)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzk);
    localParcel.writeString(paramString);
    zzc(3, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */