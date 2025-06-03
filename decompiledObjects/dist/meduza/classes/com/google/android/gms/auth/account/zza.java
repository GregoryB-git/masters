package com.google.android.gms.auth.account;

import a6.b;
import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

public abstract class zza
  extends zzb
  implements b
{
  public zza()
  {
    super("com.google.android.gms.auth.account.IWorkAccountCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      boolean bool = false;
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = zzc.zza;
      paramInt1 = paramParcel1.readInt();
      zzc.zzb(paramParcel1);
      if (paramInt1 != 0) {
        bool = true;
      }
      zzc(bool);
    }
    else
    {
      paramParcel2 = (Account)zzc.zza(paramParcel1, Account.CREATOR);
      zzc.zzb(paramParcel1);
      zzb(paramParcel2);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.account.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */