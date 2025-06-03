package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class zzmt
{
  private static final zzmt zzb = new zzmt(true);
  public final zzpe zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzmt()
  {
    zza = new zzoz();
  }
  
  private zzmt(boolean paramBoolean)
  {
    zza = localzzoz;
    zzg();
    zzg();
  }
  
  public static int zza(zzms paramzzms, Object paramObject)
  {
    zzpw localzzpw = paramzzms.zzd();
    int i = paramzzms.zza();
    paramzzms.zzg();
    i = zzln.zzA(i << 3);
    int j = i;
    if (localzzpw == zzpw.zzj)
    {
      paramzzms = (zzoi)paramObject;
      Charset localCharset = zznl.zza;
      if (!(paramzzms instanceof zzkp))
      {
        j = i + i;
      }
      else
      {
        paramzzms = (zzkp)paramzzms;
        throw null;
      }
    }
    paramzzms = zzpx.zza;
    int k = localzzpw.ordinal();
    i = 4;
    long l;
    switch (k)
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 17: 
      l = ((Long)paramObject).longValue();
      l = l >> 63 ^ l + l;
      break;
    case 16: 
      i = ((Integer)paramObject).intValue();
      i = i >> 31 ^ i + i;
      break;
    case 13: 
      if ((paramObject instanceof zznf)) {
        i = ((zznf)paramObject).zza();
      }
      break;
    case 12: 
      i = ((Integer)paramObject).intValue();
      i = zzln.zzA(i);
      break;
    case 11: 
      if (!(paramObject instanceof zzle)) {
        i = ((byte[])paramObject).length;
      }
      break;
    case 10: 
      if ((paramObject instanceof zzns)) {
        i = ((zzns)paramObject).zza();
      } else {
        i = zzln.zzx((zzoi)paramObject);
      }
      break;
    case 9: 
      i = ((zzoi)paramObject).zzo();
      break;
    case 8: 
      if ((paramObject instanceof zzle))
      {
        i = ((zzle)paramObject).zzd();
        i = zzln.zzA(i) + i;
      }
      else
      {
        i = zzln.zzz((String)paramObject);
      }
      break;
    case 7: 
      ((Boolean)paramObject).booleanValue();
      i = 1;
      break;
    case 6: 
    case 14: 
      ((Integer)paramObject).intValue();
      break;
    case 5: 
    case 15: 
      ((Long)paramObject).longValue();
      break;
    case 4: 
      i = ((Integer)paramObject).intValue();
      l = i;
      break;
    case 2: 
    case 3: 
      l = ((Long)paramObject).longValue();
      i = zzln.zzB(l);
      break;
    case 1: 
      ((Float)paramObject).floatValue();
      break;
    }
    ((Double)paramObject).doubleValue();
    i = 8;
    return j + i;
  }
  
  public static zzmt zzd()
  {
    return zzb;
  }
  
  private static Object zzl(Object paramObject)
  {
    if ((paramObject instanceof zzon)) {
      return ((zzon)paramObject).zzd();
    }
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      int i = paramObject.length;
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, i);
      return arrayOfByte;
    }
    return paramObject;
  }
  
  private final void zzm(Map.Entry paramEntry)
  {
    zzms localzzms = (zzms)paramEntry.getKey();
    paramEntry = paramEntry.getValue();
    boolean bool = paramEntry instanceof zzns;
    localzzms.zzg();
    if (localzzms.zze() == zzpx.zzi)
    {
      Object localObject = zze(localzzms);
      if (localObject == null)
      {
        zza.zzf(localzzms, zzl(paramEntry));
        if (bool) {
          zzd = true;
        }
        return;
      }
      if (!bool)
      {
        if ((localObject instanceof zzon)) {
          paramEntry = localzzms.zzc((zzon)localObject, (zzon)paramEntry);
        } else {
          paramEntry = localzzms.zzb(((zzoi)localObject).zzae(), (zzoi)paramEntry).zzk();
        }
        zza.zzf(localzzms, paramEntry);
        return;
      }
      paramEntry = (zzns)paramEntry;
      throw null;
    }
    if (!bool)
    {
      zza.zzf(localzzms, zzl(paramEntry));
      return;
    }
    throw new IllegalStateException("Lazy fields must be message-valued");
  }
  
  private static boolean zzn(Map.Entry paramEntry)
  {
    zzms localzzms = (zzms)paramEntry.getKey();
    zzpx localzzpx1 = localzzms.zze();
    zzpx localzzpx2 = zzpx.zzi;
    boolean bool = true;
    if (localzzpx1 == localzzpx2)
    {
      localzzms.zzg();
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof zzoj)) {
        bool = ((zzoj)paramEntry).zzp();
      } else {
        if (!(paramEntry instanceof zzns)) {
          break label74;
        }
      }
      return bool;
      label74:
      throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    return true;
  }
  
  private static final int zzo(Map.Entry paramEntry)
  {
    zzms localzzms = (zzms)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if (localzzms.zze() == zzpx.zzi)
    {
      localzzms.zzg();
      localzzms.zzf();
      boolean bool = localObject instanceof zzns;
      int i = ((zzms)paramEntry.getKey()).zza();
      if (bool)
      {
        paramEntry = (zzns)localObject;
        j = zzln.zzA(8);
        k = zzln.zzA(16);
        int m = zzln.zzA(i);
        n = zzln.zzA(24);
        i = paramEntry.zza();
        return j + j + (m + k) + (zzln.zzA(i) + i + n);
      }
      paramEntry = (zzoi)localObject;
      int k = zzln.zzA(8);
      int j = zzln.zzA(16);
      i = zzln.zzA(i);
      int n = zzln.zzA(24);
      return k + k + (i + j) + (zzln.zzx(paramEntry) + n);
    }
    return zza(localzzms, localObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzmt)) {
      return false;
    }
    paramObject = (zzmt)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final int zzb()
  {
    int i = zza.zzc();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += zzo(zza.zzg(j));
      j++;
    }
    Iterator localIterator = zza.zzd().iterator();
    while (localIterator.hasNext()) {
      k += zzo((Map.Entry)localIterator.next());
    }
    return k;
  }
  
  public final zzmt zzc()
  {
    zzmt localzzmt = new zzmt();
    int i = zza.zzc();
    for (int j = 0; j < i; j++)
    {
      localObject = zza.zzg(j);
      localzzmt.zzi((zzms)((zzpa)localObject).zza(), ((Map.Entry)localObject).getValue());
    }
    Object localObject = zza.zzd().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      localzzmt.zzi((zzms)localEntry.getKey(), localEntry.getValue());
    }
    zzd = zzd;
    return localzzmt;
  }
  
  public final Object zze(zzms paramzzms)
  {
    paramzzms = zza.get(paramzzms);
    if (!(paramzzms instanceof zzns)) {
      return paramzzms;
    }
    paramzzms = (zzns)paramzzms;
    throw null;
  }
  
  public final Iterator zzf()
  {
    if (zza.isEmpty()) {
      return Collections.emptyIterator();
    }
    if (zzd) {
      return new zznq(zza.entrySet().iterator());
    }
    return zza.entrySet().iterator();
  }
  
  public final void zzg()
  {
    if (zzc) {
      return;
    }
    int i = zza.zzc();
    for (int j = 0; j < i; j++)
    {
      localObject1 = zza.zzg(j).getValue();
      if ((localObject1 instanceof zznd)) {
        ((zznd)localObject1).zzG();
      }
    }
    Object localObject1 = zza.zzd().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Map.Entry)((Iterator)localObject1).next()).getValue();
      if ((localObject2 instanceof zznd)) {
        ((zznd)localObject2).zzG();
      }
    }
    zza.zza();
    zzc = true;
  }
  
  public final void zzh(zzmt paramzzmt)
  {
    int i = zza.zzc();
    for (int j = 0; j < i; j++) {
      zzm(zza.zzg(j));
    }
    paramzzmt = zza.zzd().iterator();
    while (paramzzmt.hasNext()) {
      zzm((Map.Entry)paramzzmt.next());
    }
  }
  
  public final void zzi(zzms paramzzms, Object paramObject)
  {
    paramzzms.zzg();
    zzpw localzzpw = paramzzms.zzd();
    Object localObject = zznl.zza;
    paramObject.getClass();
    localObject = zzpw.zza;
    localObject = zzpx.zza;
    boolean bool;
    switch (localzzpw.zza().ordinal())
    {
    default: 
      break;
    case 8: 
      if ((paramObject instanceof zzoi)) {
        break label202;
      }
      if (!(paramObject instanceof zzns)) {
        break label225;
      }
    case 7: 
      if ((goto 202) || ((paramObject instanceof Integer))) {
        break label202;
      }
      if (!(paramObject instanceof zznf)) {
        break label225;
      }
    case 6: 
      if ((goto 202) || ((paramObject instanceof zzle))) {
        break label202;
      }
      if (!(paramObject instanceof byte[])) {
        break label225;
      }
      break;
    case 5: 
      bool = paramObject instanceof String;
      break;
    case 4: 
      bool = paramObject instanceof Boolean;
      break;
    case 3: 
      bool = paramObject instanceof Double;
      break;
    case 2: 
      bool = paramObject instanceof Float;
      break;
    case 1: 
      bool = paramObject instanceof Long;
      break;
    case 0: 
      bool = paramObject instanceof Integer;
    }
    if (bool)
    {
      label202:
      if ((paramObject instanceof zzns)) {
        zzd = true;
      }
      zza.zzf(paramzzms, paramObject);
      return;
    }
    label225:
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramzzms.zza()), paramzzms.zzd().zza(), paramObject.getClass().getName() }));
  }
  
  public final boolean zzj()
  {
    return zzc;
  }
  
  public final boolean zzk()
  {
    int i = zza.zzc();
    for (int j = 0; j < i; j++) {
      if (!zzn(zza.zzg(j))) {
        return false;
      }
    }
    Iterator localIterator = zza.zzd().iterator();
    while (localIterator.hasNext()) {
      if (!zzn((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */