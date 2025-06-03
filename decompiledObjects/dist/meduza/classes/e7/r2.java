package e7;

import b.z;
import com.google.android.gms.internal.measurement.zzgc.zzd;
import com.google.android.gms.internal.measurement.zzgc.zzi;
import com.google.android.gms.internal.measurement.zzgf.zzo.zza;
import com.google.android.gms.measurement.internal.zzig;
import d2.q;

public final class r2
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      c.a.c0();
      localObject1 = c.a;
      localObject2 = b;
      ((i6)localObject1).zzl().l();
      ((i6)localObject1).d0();
      m6.j.i(localObject2);
      m6.j.e(a);
      boolean bool = ((i6)localObject1).R().x(null, h0.u0);
      int i = 0;
      if (bool)
      {
        ((z)((i6)localObject1).zzb()).getClass();
        long l1 = System.currentTimeMillis();
        int j = ((i6)localObject1).R().q(null, h0.d0);
        ((i6)localObject1).R();
        l2 = ((Long)h0.e.a(null)).longValue();
        for (k = 0; (k < j) && (((i6)localObject1).L(null, l1 - l2)); k++) {}
      }
      ((i6)localObject1).R();
      long l2 = ((Integer)h0.l.a(null)).intValue();
      for (int k = 0; (k < l2) && (((i6)localObject1).L(a, 0L)); k++) {}
      if (((i6)localObject1).R().x(null, h0.v0)) {
        ((i6)localObject1).D();
      }
      if (((i6)localObject1).R().x(null, h0.L0))
      {
        g6 localg6 = r;
        Object localObject3 = a;
        zzgf.zzo.zza localzza = zzgf.zzo.zza.zza(O);
        localg6.l();
        k = i;
        if (localg6.h().x(null, h0.K0))
        {
          k = i;
          if (localzza == zzgf.zzo.zza.zzb) {
            if (g6.r((String)localObject3))
            {
              k = i;
            }
            else
            {
              localObject3 = localg6.o().C((String)localObject3);
              k = i;
              if (localObject3 != null)
              {
                k = i;
                if (((zzgc.zzd)localObject3).zzq())
                {
                  k = i;
                  if (!((zzgc.zzd)localObject3).zzh().zze().isEmpty()) {
                    k = 1;
                  }
                }
              }
            }
          }
        }
        if (k != 0)
        {
          localObject2 = a;
          ((z)((i6)localObject1).zzb()).getClass();
          ((i6)localObject1).t((String)localObject2, System.currentTimeMillis());
        }
      }
      return;
    }
    c.a.c0();
    Object localObject2 = c.a;
    Object localObject1 = b;
    a0.j.q((i6)localObject2);
    m6.j.e(a);
    ((i6)localObject2).W((k6)localObject1);
    ((i6)localObject2).U((k6)localObject1);
  }
}

/* Location:
 * Qualified Name:     e7.r2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */