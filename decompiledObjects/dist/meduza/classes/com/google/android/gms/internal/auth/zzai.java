package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import k6.j;

final class zzai
  implements j
{
  private static final Account zza = new Account("DUMMY_NAME", "com.google");
  private final Status zzb;
  private final Account zzc;
  
  public zzai(Status paramStatus, Account paramAccount)
  {
    zzb = paramStatus;
    paramStatus = paramAccount;
    if (paramAccount == null) {
      paramStatus = zza;
    }
    zzc = paramStatus;
  }
  
  public final Account getAccount()
  {
    return zzc;
  }
  
  public final Status getStatus()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */