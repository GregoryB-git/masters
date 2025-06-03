package c8;

import n7.f;

public final class g1
  implements b8.b
{
  public final int a;
  public final f b;
  
  public g1(com.google.android.gms.internal.firebase-auth-api.zzahg paramzzahg)
  {
    if (paramzzahg.zzg()) {
      paramzzahg.zzc();
    } else {
      paramzzahg.zzb();
    }
    paramzzahg.zzb();
    boolean bool = paramzzahg.zzh();
    Object localObject = null;
    if (!bool)
    {
      a = 3;
      b = null;
      return;
    }
    String str = paramzzahg.zzd();
    str.getClass();
    int i = -1;
    int j = str.hashCode();
    int k = 5;
    switch (j)
    {
    default: 
      break;
    case 970484929: 
      if (str.equals("RECOVER_EMAIL")) {
        i = 5;
      }
      break;
    case 870738373: 
      if (str.equals("EMAIL_SIGNIN")) {
        i = 4;
      }
      break;
    case -1099157829: 
      if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
        i = 3;
      }
      break;
    case -1341836234: 
      if (str.equals("VERIFY_EMAIL")) {
        i = 2;
      }
      break;
    case -1452371317: 
      if (str.equals("PASSWORD_RESET")) {
        i = 1;
      }
      break;
    case -1874510116: 
      if (str.equals("REVERT_SECOND_FACTOR_ADDITION")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      k = 3;
      break;
    case 5: 
      k = 2;
      break;
    case 4: 
      k = 4;
      break;
    case 2: 
      k = 1;
      break;
    case 1: 
      k = 0;
      break;
    case 0: 
      k = 6;
    }
    a = k;
    if ((k != 4) && (k != 3))
    {
      if (paramzzahg.zzf()) {
        localObject = new e1(paramzzahg.zzb(), x6.b.F0(paramzzahg.zza()));
      } else if (paramzzahg.zzg()) {
        localObject = new f1(paramzzahg.zzc(), paramzzahg.zzb());
      } else if (paramzzahg.zze()) {
        localObject = new e1(paramzzahg.zzb());
      }
      b = ((f)localObject);
      return;
    }
    b = null;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final f b()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     c8.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */