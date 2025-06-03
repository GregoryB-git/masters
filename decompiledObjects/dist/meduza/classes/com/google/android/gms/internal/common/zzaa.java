package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class zzaa
{
  private final zzr zza;
  private final boolean zzb;
  private final zzx zzc;
  
  private zzaa(zzx paramzzx, boolean paramBoolean, zzr paramzzr, int paramInt)
  {
    zzc = paramzzx;
    zzb = paramBoolean;
    zza = paramzzr;
  }
  
  public static zzaa zzc(zzr paramzzr)
  {
    return new zzaa(new zzx(paramzzr), false, zzq.zza, Integer.MAX_VALUE);
  }
  
  private final Iterator zzh(CharSequence paramCharSequence)
  {
    zzx localzzx = zzc;
    return new zzw(localzzx, this, paramCharSequence, zza);
  }
  
  public final zzaa zzb()
  {
    zzr localzzr = zza;
    return new zzaa(zzc, true, localzzr, Integer.MAX_VALUE);
  }
  
  public final Iterable zzd(CharSequence paramCharSequence)
  {
    return new zzy(this, paramCharSequence);
  }
  
  public final List zzf(CharSequence paramCharSequence)
  {
    paramCharSequence.getClass();
    Iterator localIterator = zzh(paramCharSequence);
    paramCharSequence = new ArrayList();
    while (localIterator.hasNext()) {
      paramCharSequence.add((String)localIterator.next());
    }
    return Collections.unmodifiableList(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */