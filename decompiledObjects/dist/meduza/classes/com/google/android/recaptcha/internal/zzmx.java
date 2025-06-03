package com.google.android.recaptcha.internal;

public class zzmx<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>>
  extends zzkn<MessageType, BuilderType>
{
  public zznd zza;
  private final zznd zzb;
  
  public zzmx(MessageType paramMessageType)
  {
    zzb = paramMessageType;
    if (!paramMessageType.zzL())
    {
      zza = paramMessageType.zzv();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  private static void zze(Object paramObject1, Object paramObject2)
  {
    zzos.zza().zzb(paramObject1.getClass()).zzg(paramObject1, paramObject2);
  }
  
  public final zzmx zzg()
  {
    zzmx localzzmx = (zzmx)zzb.zzh(5, null, null);
    zza = zzj();
    return localzzmx;
  }
  
  public final zzmx zzh(zznd paramzznd)
  {
    if (!zzb.equals(paramzznd))
    {
      if (!zza.zzL()) {
        zzo();
      }
      zze(zza, paramzznd);
    }
    return this;
  }
  
  public final MessageType zzi()
  {
    zznd localzznd = zzj();
    if (zznd.zzK(localzznd, true)) {
      return localzznd;
    }
    throw new zzpk(localzznd);
  }
  
  public MessageType zzj()
  {
    if (!zza.zzL()) {
      return zza;
    }
    zza.zzG();
    return zza;
  }
  
  public final void zzn()
  {
    if (!zza.zzL()) {
      zzo();
    }
  }
  
  public void zzo()
  {
    zznd localzznd = zzb.zzv();
    zze(localzznd, zza);
    zza = localzznd;
  }
  
  public final boolean zzp()
  {
    return zznd.zzK(zza, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */