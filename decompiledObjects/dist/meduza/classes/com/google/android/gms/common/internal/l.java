package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class l
  extends zza
  implements IAccountAccessor
{
  public l(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IAccountAccessor");
  }
  
  public final Account zzb()
  {
    Parcel localParcel = zzB(2, zza());
    Account localAccount = (Account)zzc.zza(localParcel, Account.CREATOR);
    localParcel.recycle();
    return localAccount;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */