package b8;

import android.os.Handler;
import c8.r0;
import c8.t;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import com.google.firebase.auth.FirebaseAuth;

public final class p1
  implements t, z0
{
  public p1(FirebaseAuth paramFirebaseAuth) {}
  
  public final void a(zzagw paramzzagw, r paramr)
  {
    FirebaseAuth localFirebaseAuth = a;
    localFirebaseAuth.getClass();
    FirebaseAuth.n(localFirebaseAuth, paramr, paramzzagw, true, true);
  }
  
  public final void zza(Status paramStatus)
  {
    int i = a;
    if ((i == 17011) || (i == 17021) || (i == 17005))
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
 * Qualified Name:     b8.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */