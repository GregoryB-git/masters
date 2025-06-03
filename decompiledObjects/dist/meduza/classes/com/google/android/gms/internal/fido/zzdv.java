package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

final class zzdv
{
  private final Deque zza = new ArrayDeque(16);
  
  private zzdv(boolean paramBoolean) {}
  
  public static zzdv zza()
  {
    return new zzdv(false);
  }
  
  private final long zzh()
  {
    if (zza.isEmpty()) {
      return 0L;
    }
    return ((Long)zza.peek()).longValue();
  }
  
  private final void zzi(long paramLong)
  {
    zza.pop();
    zza.push(Long.valueOf(paramLong));
  }
  
  public final void zzb()
  {
    if (zza.isEmpty()) {
      return;
    }
    throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", new Object[] { Integer.valueOf(zza.size()), Long.valueOf(zzh()) }));
  }
  
  public final void zzc()
  {
    long l = zzh();
    if (l < 0L)
    {
      if (l != -5L)
      {
        zza.pop();
        return;
      }
      throw new IOException("expected a value for dangling key in indefinite-length map");
    }
    throw new IOException(String.format("expected indefinite length scope but found %s", new Object[] { Long.valueOf(l) }));
  }
  
  public final void zzd()
  {
    long l1 = zzh();
    long l2 = l1;
    if (l1 != -1L)
    {
      if (l1 != -2L) {
        return;
      }
      l2 = -2L;
    }
    throw new IOException(String.format("expected non-string scope but found %s", new Object[] { Long.valueOf(l2) }));
  }
  
  public final void zze(long paramLong)
  {
    long l1 = zzh();
    if (l1 != paramLong)
    {
      long l2 = l1;
      if (l1 != -1L)
      {
        if (l1 == -2L) {
          l2 = -2L;
        }
      }
      else {
        throw new IOException(String.format("expected non-string scope or scope %s but found %s", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2) }));
      }
    }
  }
  
  public final void zzf()
  {
    long l = zzh();
    boolean bool = l < 1L;
    if (!bool)
    {
      zza.pop();
      return;
    }
    if (bool)
    {
      zzi(l - 1L);
      return;
    }
    if (l == -4L)
    {
      zzi(-5L);
      return;
    }
    if (l == -5L) {
      zzi(-4L);
    }
  }
  
  public final void zzg(long paramLong)
  {
    zza.push(Long.valueOf(paramLong));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */