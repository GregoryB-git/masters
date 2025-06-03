package com.google.android.recaptcha.internal;

import ec.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nc.e0;
import rb.f;
import sb.j;
import vb.a;

public final class zzl
{
  private final List zza;
  private zzek zzb;
  
  public zzl()
  {
    this(null, 1, null);
  }
  
  private final void zzh(zze... paramVarArgs)
  {
    List localList = zza;
    i.e(localList, "<this>");
    i.e(paramVarArgs, "elements");
    localList.addAll(j.j(paramVarArgs));
  }
  
  public final Object zzb(String paramString, long paramLong, ub.e parame)
  {
    return e0.b(new zzh(this, paramString, paramLong, null), parame);
  }
  
  public final Object zzc(long paramLong, zzsc paramzzsc, zzek paramzzek, ub.e parame)
  {
    if ((parame instanceof zzi))
    {
      localObject = (zzi)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject;
        break label59;
      }
    }
    parame = new zzi(this, parame);
    label59:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject);
        paramzzsc = (zzsc)localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      paramzzsc = new zzk(this, paramzzek, paramLong, paramzzsc, null);
      zzc = 1;
      paramzzek = e0.b(paramzzsc, parame);
      paramzzsc = paramzzek;
      if (paramzzek == locala) {
        return locala;
      }
    }
    return a;
  }
  
  public final List zzd()
  {
    return zza;
  }
  
  public final void zzf(zze... paramVarArgs)
  {
    zzh((zze[])Arrays.copyOf(paramVarArgs, 1));
  }
  
  public final void zzg(zzsr paramzzsr)
  {
    Iterator localIterator = zza.iterator();
    while (localIterator.hasNext()) {
      ((zze)localIterator.next()).zzk(paramzzsr);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */