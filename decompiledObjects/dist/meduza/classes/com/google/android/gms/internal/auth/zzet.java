package com.google.android.gms.internal.auth;

public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>>
  extends zzdp<MessageType, BuilderType>
{
  public zzev zza;
  private final zzev zzb;
  
  public zzet(MessageType paramMessageType)
  {
    zzb = paramMessageType;
    if (!paramMessageType.zzm())
    {
      zza = paramMessageType.zzc();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  public final zzet zzb()
  {
    zzet localzzet = (zzet)zzb.zzn(5, null, null);
    zza = zzc();
    return localzzet;
  }
  
  public MessageType zzc()
  {
    if (!zza.zzm()) {
      return zza;
    }
    zza.zzi();
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */