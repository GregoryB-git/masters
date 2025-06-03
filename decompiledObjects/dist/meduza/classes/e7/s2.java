package e7;

import android.content.ComponentName;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.SparseArray;
import b.z;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzig;
import d2.q;
import d3.a;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import m6.j;

public final class s2
  implements Runnable
{
  public final void run()
  {
    label263:
    Object localObject4;
    switch (a)
    {
    default: 
      break;
    case 3: 
      localObject1 = (w4)c;
      n0 localn0 = e;
      if (localn0 == null) {
        zzjo.b("Discarding data. Failed to send app launch");
      } else {
        try
        {
          j.i((k6)b);
          localn0.r2((k6)b);
          ((w4)c).n().y();
          ((w4)c).w(localn0, null, (k6)b);
          ((w4)c).H();
        }
        catch (RemoteException localRemoteException1)
        {
          c).zzj().o.c("Failed to send app launch to the service", localRemoteException1);
        }
      }
      return;
    case 2: 
      Object localObject2 = ((k3)c).r();
      if (!((q)localObject2).j().y().p())
      {
        zzjt.b("Analytics storage consent denied; will not get session id");
      }
      else
      {
        localObject1 = ((q)localObject2).j();
        ((z)((q)localObject2).zzb()).getClass();
        if ((!((l1)localObject1).r(System.currentTimeMillis())) && (jA.a() != 0L))
        {
          localObject2 = Long.valueOf(jA.a());
          break label263;
        }
      }
      localObject2 = null;
      if (localObject2 != null) {
        ((j2)c).b).m().G((zzdq)b, ((Long)localObject2).longValue());
      } else {
        try
        {
          ((zzdq)b).zza(null);
        }
        catch (RemoteException localRemoteException2)
        {
          c).b).zzj().o.c("getSessionId failed with exception", localRemoteException2);
        }
      }
      return;
    case 1: 
      localObject3 = (k3)b;
      localObject4 = (List)c;
      ((o0)localObject3).l();
      if (Build.VERSION.SDK_INT >= 30)
      {
        localObject1 = ((q)localObject3).j().w();
        localObject4 = ((List)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          w5 localw5 = (w5)((Iterator)localObject4).next();
          if ((!a.g((SparseArray)localObject1, c)) || (((Long)((SparseArray)localObject1).get(c)).longValue() < b)) {
            ((k3)localObject3).I().add(localw5);
          }
        }
        ((k3)localObject3).N();
      }
      return;
    case 0: 
      c).a.c0();
      if (b).c.D() == null)
      {
        localObject1 = c).a;
        localObject3 = (f)b;
        localObject1.getClass();
        localObject4 = a;
        j.i(localObject4);
        localObject4 = ((i6)localObject1).M((String)localObject4);
        if (localObject4 != null) {
          ((i6)localObject1).n((f)localObject3, (k6)localObject4);
        }
      }
      else
      {
        localObject3 = c).a;
        localObject1 = (f)b;
        localObject3.getClass();
        localObject4 = a;
        j.i(localObject4);
        localObject4 = ((i6)localObject3).M((String)localObject4);
        if (localObject4 != null) {
          ((i6)localObject3).I((f)localObject1, (k6)localObject4);
        }
      }
      return;
    }
    Object localObject1 = c).c;
    Object localObject3 = (ComponentName)b;
    ((o0)localObject1).l();
    if (e != null)
    {
      e = null;
      zzjw.c("Disconnected from device MeasurementService", localObject3);
      ((o0)localObject1).l();
      ((w4)localObject1).A();
    }
  }
}

/* Location:
 * Qualified Name:     e7.s2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */