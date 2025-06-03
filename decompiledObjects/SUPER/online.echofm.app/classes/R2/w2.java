package R2;

import D2.b;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.y7;

public final class w2
  implements Runnable
{
  public w2(t2 paramt2, c0 paramc0, ServiceConnection paramServiceConnection) {}
  
  public final void run()
  {
    Object localObject1 = q;
    u2 localu2 = b;
    localObject1 = t2.a((t2)localObject1);
    Object localObject2 = o;
    ServiceConnection localServiceConnection = p;
    localObject2 = localu2.a((String)localObject1, (c0)localObject2);
    a.e().n();
    a.Q();
    if (localObject2 != null)
    {
      long l1 = ((BaseBundle)localObject2).getLong("install_begin_timestamp_seconds", 0L) * 1000L;
      if (l1 == 0L)
      {
        localObject1 = a.j().L();
        localObject2 = "Service response is missing Install Referrer install timestamp";
      }
      for (;;)
      {
        ((a2)localObject1).a((String)localObject2);
        break;
        String str = ((BaseBundle)localObject2).getString("install_referrer");
        if ((str != null) && (!str.isEmpty()))
        {
          a.j().K().b("InstallReferrer API result", str);
          Object localObject3 = a.L();
          Object localObject4 = new StringBuilder("?");
          ((StringBuilder)localObject4).append(str);
          localObject4 = Uri.parse(((StringBuilder)localObject4).toString());
          boolean bool1;
          if ((y7.a()) && (a.z().s(K.F0))) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          boolean bool2;
          if ((H6.a()) && (a.z().s(K.a1))) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          localObject4 = ((S5)localObject3).D((Uri)localObject4, bool1, bool2);
          if (localObject4 == null)
          {
            localObject1 = a.j().G();
            localObject2 = "No campaign params defined in Install Referrer result";
          }
          else
          {
            localObject3 = ((BaseBundle)localObject4).getString("medium");
            if ((localObject3 != null) && (!"(not set)".equalsIgnoreCase((String)localObject3)) && (!"organic".equalsIgnoreCase((String)localObject3)))
            {
              long l2 = ((BaseBundle)localObject2).getLong("referrer_click_timestamp_seconds", 0L) * 1000L;
              if (l2 == 0L)
              {
                localObject1 = a.j().G();
                localObject2 = "Install Referrer is missing click timestamp for ad campaign";
              }
              else
              {
                ((BaseBundle)localObject4).putLong("click_timestamp", l2);
              }
            }
            else
            {
              if (l1 == a.F().f.a()) {
                a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
              }
              if (!a.p()) {
                break;
              }
              a.F().f.b(l1);
              a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
              ((BaseBundle)localObject4).putString("_cis", "referrer API v2");
              a.H().Y("auto", "_cmp", (Bundle)localObject4, (String)localObject1);
              break;
            }
          }
        }
        else
        {
          localObject1 = a.j().G();
          localObject2 = "No referrer defined in Install Referrer response";
        }
      }
    }
    if (localServiceConnection != null) {
      b.b().c(a.a(), localServiceConnection);
    }
  }
}

/* Location:
 * Qualified Name:     R2.w2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */