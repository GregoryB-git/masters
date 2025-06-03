package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzakx;
import java.util.List;

final class zzakw
  implements zzakx
{
  private static <E> zzakn<E> zzc(Object paramObject, long paramLong)
  {
    return (zzakn)zzana.zze(paramObject, paramLong);
  }
  
  public final <L> List<L> zza(Object paramObject, long paramLong)
  {
    com.google.android.gms.internal.firebase-auth-api.zzakn localzzakn1 = zzc(paramObject, paramLong);
    com.google.android.gms.internal.firebase-auth-api.zzakn localzzakn2 = localzzakn1;
    if (!localzzakn1.zzc())
    {
      int i = localzzakn1.size();
      if (i == 0) {
        i = 10;
      } else {
        i <<= 1;
      }
      localzzakn2 = localzzakn1.zza(i);
      zzana.zza(paramObject, paramLong, localzzakn2);
    }
    return localzzakn2;
  }
  
  public final <E> void zza(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = zzc(paramObject1, paramLong);
    com.google.android.gms.internal.firebase-auth-api.zzakn localzzakn = zzc(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = localzzakn.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((zzakn)localObject).zzc()) {
          paramObject2 = ((zzakn)localObject).zza(j + i);
        }
        ((List)paramObject2).addAll(localzzakn);
      }
    }
    localObject = localzzakn;
    if (i > 0) {
      localObject = paramObject2;
    }
    zzana.zza(paramObject1, paramLong, localObject);
  }
  
  public final void zzb(Object paramObject, long paramLong)
  {
    zzc(paramObject, paramLong).zzb();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */