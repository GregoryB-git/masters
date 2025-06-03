package b8;

import android.os.Handler;
import c8.r0;
import c8.u;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

public final class n1
  implements u
{
  public final void zza()
  {
    r localr = b.f;
    if ((localr != null) && (localr.a().equalsIgnoreCase(a.a()))) {
      b.s();
    }
  }
  
  public final void zza(Status paramStatus)
  {
    int i = a;
    if ((i == 17011) || (i == 17021) || (i == 17005))
    {
      paramStatus = b;
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
 * Qualified Name:     b8.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */