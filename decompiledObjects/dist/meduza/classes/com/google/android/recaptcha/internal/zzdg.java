package com.google.android.recaptcha.internal;

import b.a0;
import dc.p;
import nc.d2;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzdg
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zzdg(zzdt paramzzdt, String paramString, long paramLong, zzsp paramzzsp, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzdg(zzc, zzd, zze, zzf, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject2;
    if (zzb != 0)
    {
      localObject1 = (zzen)zza;
      localObject3 = localObject1;
      localObject4 = localObject1;
      localObject5 = localObject1;
      try
      {
        f.b(paramObject);
      }
      catch (Exception localException1)
      {
        paramObject = localObject3;
        break label149;
      }
      catch (zzbd localzzbd1)
      {
        paramObject = localObject4;
        break label183;
      }
      catch (d2 paramObject)
      {
        localObject2 = paramObject;
        break label204;
      }
    }
    else
    {
      f.b(paramObject);
      paramObject = zzdt.zzf(zzc, zzd).zzf(28);
    }
    try
    {
      long l = zze;
      localObject4 = new com/google/android/recaptcha/internal/zzdf;
      ((zzdf)localObject4).<init>(zzc, zzf, (zzen)paramObject, null);
      zza = paramObject;
      zzb = 1;
      localObject4 = a0.M(l, (p)localObject4, this);
      if (localObject4 != localObject2)
      {
        localObject2 = paramObject;
        paramObject = localObject4;
        localObject3 = localObject2;
        localObject4 = localObject2;
        localObject5 = localObject2;
        paramObject = (zzsr)paramObject;
        return paramObject;
      }
      return localObject2;
    }
    catch (Exception localException2)
    {
      zzbd localzzbd2 = zzdt.zzb(zzc, localException2, new zzbd(zzbb.zzc, zzba.zzZ, localException2.getMessage()));
      ((zzen)paramObject).zzb(localzzbd2);
      throw localzzbd2;
    }
    catch (zzbd localzzbd3)
    {
      zzbd localzzbd4 = zzdt.zzb(zzc, localzzbd3, localzzbd3);
      ((zzen)paramObject).zzb(localzzbd4);
      throw localzzbd4;
    }
    catch (d2 locald2)
    {
      label149:
      label183:
      localObject5 = paramObject;
    }
    label204:
    paramObject = zzdt.zzb(zzc, locald2, new zzbd(zzbb.zzc, zzba.zzb, locald2.getMessage()));
    ((zzen)localObject5).zzb((zzbd)paramObject);
    throw ((Throwable)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */