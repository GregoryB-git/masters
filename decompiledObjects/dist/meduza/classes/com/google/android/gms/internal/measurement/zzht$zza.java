package com.google.android.gms.internal.measurement;

import a0.d;
import android.content.Context;
import android.os.Build;
import b0.f;
import n7.a;
import n7.h;

public class zzht$zza
{
  private static volatile h<zzhr> zza;
  
  public static h<zzhr> zza(Context paramContext)
  {
    h localh = zza;
    Object localObject = localh;
    if (localh == null) {
      try
      {
        localh = zza;
        localObject = localh;
        if (localh == null)
        {
          new zzht();
          if (!zzhu.zza(Build.TYPE, Build.TAGS))
          {
            paramContext = a.a;
          }
          else
          {
            localObject = paramContext;
            if (zzhg.zza()) {
              if (f.q(paramContext)) {
                localObject = paramContext;
              } else {
                localObject = d.f(paramContext);
              }
            }
            paramContext = zzht.zza((Context)localObject);
          }
          zza = paramContext;
          localObject = paramContext;
        }
      }
      finally {}
    }
    return (h<zzhr>)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzht.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */