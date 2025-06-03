package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import z5.b;
import z5.c;

public final class zzd
  extends zza
  implements zzf
{
  public zzd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.auth.IAuthManagerService");
  }
  
  public final Bundle zzd(String paramString, Bundle paramBundle)
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBundle);
    paramBundle = zzb(2, localParcel);
    paramString = (Bundle)zzc.zza(paramBundle, Bundle.CREATOR);
    paramBundle.recycle();
    return paramString;
  }
  
  public final Bundle zze(Account paramAccount, String paramString, Bundle paramBundle)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramAccount);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBundle);
    paramString = zzb(5, localParcel);
    paramAccount = (Bundle)zzc.zza(paramString, Bundle.CREATOR);
    paramString.recycle();
    return paramAccount;
  }
  
  public final Bundle zzf(Account paramAccount)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramAccount);
    localParcel = zzb(7, localParcel);
    paramAccount = (Bundle)zzc.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return paramAccount;
  }
  
  public final Bundle zzg(String paramString)
  {
    Object localObject = zza();
    ((Parcel)localObject).writeString(paramString);
    paramString = zzb(8, (Parcel)localObject);
    localObject = (Bundle)zzc.zza(paramString, Bundle.CREATOR);
    paramString.recycle();
    return (Bundle)localObject;
  }
  
  public final c zzh(b paramb)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramb);
    localParcel = zzb(3, localParcel);
    paramb = (c)zzc.zza(localParcel, c.CREATOR);
    localParcel.recycle();
    return paramb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */