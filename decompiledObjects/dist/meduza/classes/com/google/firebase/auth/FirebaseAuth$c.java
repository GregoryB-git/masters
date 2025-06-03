package com.google.firebase.auth;

import android.os.Handler;
import c8.r0;
import c8.t;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import m6.j;

public final class FirebaseAuth$c
  implements t, z0
{
  public FirebaseAuth$c(FirebaseAuth paramFirebaseAuth) {}
  
  public final void a(zzagw paramzzagw, b8.r paramr)
  {
    j.i(paramzzagw);
    j.i(paramr);
    paramr.L(paramzzagw);
    FirebaseAuth localFirebaseAuth = a;
    localFirebaseAuth.getClass();
    FirebaseAuth.n(localFirebaseAuth, paramr, paramzzagw, true, true);
  }
  
  public final void zza(Status paramStatus)
  {
    int i = a;
    if ((i == 17011) || (i == 17021) || (i == 17005) || (i == 17091))
    {
      paramStatus = a;
      paramStatus.s();
      paramStatus = x;
      if (paramStatus != null)
      {
        paramStatus = b;
        e.removeCallbacks(f);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.FirebaseAuth.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */