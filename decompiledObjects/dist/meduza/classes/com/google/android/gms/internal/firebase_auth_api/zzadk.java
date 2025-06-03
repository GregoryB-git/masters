package com.google.android.gms.internal.firebase_auth_api;

import c8.e1;
import c8.f1;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;
import x6.b;

final class zzadk
  extends zzaeg<String, z0>
{
  private final String zzu;
  private final String zzv;
  
  public zzadk(String paramString1, String paramString2)
  {
    super(4);
    j.f("code cannot be null or empty", paramString1);
    zzu = paramString1;
    zzv = paramString2;
  }
  
  public final String zza()
  {
    return "verifyPasswordResetCode";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzd(zzu, zzv, zzb);
  }
  
  public final void zzb()
  {
    com.google.android.gms.internal.firebase-auth-api.zzahg localzzahg = zzm;
    if (localzzahg.zzg()) {
      localzzahg.zzc();
    } else {
      localzzahg.zzb();
    }
    localzzahg.zzb();
    boolean bool = localzzahg.zzh();
    int i = 3;
    if (bool)
    {
      String str = localzzahg.zzd();
      str.getClass();
      int j = str.hashCode();
      i = 0;
      int k = -1;
      switch (j)
      {
      default: 
        break;
      case 970484929: 
        if (str.equals("RECOVER_EMAIL")) {
          k = 5;
        }
        break;
      case 870738373: 
        if (str.equals("EMAIL_SIGNIN")) {
          k = 4;
        }
        break;
      case -1099157829: 
        if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
          k = 3;
        }
        break;
      case -1341836234: 
        if (str.equals("VERIFY_EMAIL")) {
          k = 2;
        }
        break;
      case -1452371317: 
        if (str.equals("PASSWORD_RESET")) {
          k = 1;
        }
        break;
      case -1874510116: 
        if (str.equals("REVERT_SECOND_FACTOR_ADDITION")) {
          k = 0;
        }
        break;
      }
      switch (k)
      {
      default: 
        i = 3;
        break;
      case 5: 
        i = 2;
        break;
      case 4: 
        i = 4;
        break;
      case 3: 
        i = 5;
        break;
      case 2: 
        i = 1;
        break;
      case 0: 
        i = 6;
      }
      if ((i != 4) && (i != 3)) {
        if (localzzahg.zzf()) {
          new e1(localzzahg.zzb(), b.F0(localzzahg.zza()));
        } else if (localzzahg.zzg()) {
          new f1(localzzahg.zzc(), localzzahg.zzb());
        } else if (localzzahg.zze()) {
          new e1(localzzahg.zzb());
        }
      }
    }
    if (i != 0)
    {
      zza(new Status(17499, null, null, null));
      return;
    }
    zzb(zzm.zzb());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */