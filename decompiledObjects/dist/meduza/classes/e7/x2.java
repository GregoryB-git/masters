package e7;

import android.app.job.JobParameters;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.zzig;
import d2.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m6.j;
import r.f;
import va.a;

public final class x2
  implements Runnable
{
  public x2(w4 paramw4, k6 paramk6, Bundle paramBundle) {}
  
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 2: 
      localObject1 = (w4)c;
      n0 localn0 = e;
      if (localn0 == null) {
        zzjo.b("Failed to send default event parameters to service");
      } else {
        try
        {
          j.i((k6)d);
          localn0.m((Bundle)b, (k6)d);
        }
        catch (RemoteException localRemoteException)
        {
          c).zzj().o.c("Failed to send default event parameters to service", localRemoteException);
        }
      }
      return;
    case 1: 
      c).a.c0();
      c).a.p((f0)b, (String)d);
      return;
    case 0: 
      Object localObject3 = (zzig)c;
      localObject1 = (f0)b;
      localObject3.getClass();
      boolean bool = "_cmp".equals(a);
      int i = 0;
      if (bool)
      {
        localObject2 = b;
        if ((localObject2 != null) && (a.size() != 0))
        {
          localObject2 = b.a.getString("_cis");
          if (("referrer broadcast".equals(localObject2)) || ("referrer API".equals(localObject2)))
          {
            j = 1;
            break label264;
          }
        }
      }
      int j = 0;
      label264:
      localObject2 = localObject1;
      if (j != 0)
      {
        a.zzj().u.c("Event has been filtered ", ((f0)localObject1).toString());
        localObject2 = new f0("_cmpx", b, c, d);
      }
      zzig localzzig = (zzig)c;
      k6 localk6 = (k6)d;
      localObject1 = a.a;
      i6.q((h6)localObject1);
      if (((w1)localObject1).H(a))
      {
        a.zzj().w.c("EES config found for", a);
        localObject1 = a.a;
        i6.q((h6)localObject1);
        localObject3 = a;
        if (TextUtils.isEmpty((CharSequence)localObject3)) {
          localObject1 = null;
        } else {
          localObject1 = (zzb)s.get(localObject3);
        }
        Object localObject5;
        if (localObject1 == null)
        {
          localObject1 = a.zzj().w;
          localObject3 = a;
          localObject5 = "EES not loaded for";
        }
        else
        {
          try
          {
            i6.q(a.o);
            HashMap localHashMap = o6.F(b.E(), true);
            localObject5 = a.i(a, b.a0.d, b.a0.b);
            localObject3 = localObject5;
            if (localObject5 == null) {
              localObject3 = a;
            }
            localObject5 = new com/google/android/gms/internal/measurement/zzad;
            ((zzad)localObject5).<init>((String)localObject3, d, localHashMap);
            bool = ((zzb)localObject1).zza((zzad)localObject5);
            i = bool;
          }
          catch (zzc localzzc)
          {
            a.zzj().o.d("EES error. appId, eventName", b, a);
          }
          if (i != 0) {
            break label616;
          }
          localObject1 = a.zzj().w;
          localObject4 = a;
          localObject5 = "EES was not applied to event";
        }
        ((b1)localObject1).c((String)localObject5, localObject4);
      }
      else
      {
        a.c0();
        a.o((f0)localObject2, localk6);
        break label784;
      }
      label616:
      localObject4 = localObject2;
      if (((zzb)localObject1).zzc())
      {
        a.zzj().w.c("EES edited event", a);
        i6.q(a.o);
        localObject4 = o6.A(((zzb)localObject1).zza().zzb());
      }
      a.c0();
      a.o((f0)localObject4, localk6);
      if (((zzb)localObject1).zzb())
      {
        localObject2 = ((zzb)localObject1).zza().zzc().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (zzad)((Iterator)localObject2).next();
          a.zzj().w.c("EES logging created event", ((zzad)localObject1).zzb());
          i6.q(a.o);
          localObject1 = o6.A((zzad)localObject1);
          a.c0();
          a.o((f0)localObject1, localk6);
        }
      }
      label784:
      return;
    }
    Object localObject2 = (m5)b;
    Object localObject1 = (a1)d;
    Object localObject4 = (JobParameters)c;
    w.b("AppMeasurementJobService processed last upload request.");
    ((o5)a).b((JobParameters)localObject4);
  }
}

/* Location:
 * Qualified Name:     e7.x2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */