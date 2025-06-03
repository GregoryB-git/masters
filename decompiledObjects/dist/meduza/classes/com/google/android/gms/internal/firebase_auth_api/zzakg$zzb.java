package com.google.android.gms.internal.firebase_auth_api;

public class zzakg$zzb<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>>
  extends zzaip<MessageType, BuilderType>
{
  public MessageType zza;
  private final MessageType zzb;
  
  public zzakg$zzb(MessageType paramMessageType)
  {
    zzb = paramMessageType;
    if (!paramMessageType.zzw())
    {
      zza = paramMessageType.zzo();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  private static <MessageType> void zza(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    zzaly.zza().zza(paramMessageType1).zza(paramMessageType1, paramMessageType2);
  }
  
  public final BuilderType zza(MessageType paramMessageType)
  {
    if (zzb.equals(paramMessageType)) {
      return this;
    }
    if (!zza.zzw()) {
      zzh();
    }
    zza(zza, paramMessageType);
    return this;
  }
  
  public final MessageType zzc()
  {
    zzakg localzzakg = (zzakg)zzf();
    if (localzzakg.zzv()) {
      return localzzakg;
    }
    throw new zzamw(localzzakg);
  }
  
  public MessageType zzd()
  {
    if (!zza.zzw()) {
      return zza;
    }
    zza.zzt();
    return zza;
  }
  
  public final void zzg()
  {
    if (!zza.zzw()) {
      zzh();
    }
  }
  
  public void zzh()
  {
    com.google.android.gms.internal.firebase-auth-api.zzakg localzzakg = zzb.zzo();
    zza(localzzakg, zza);
    zza = localzzakg;
  }
  
  public final boolean zzv()
  {
    return zzakg.zza(zza, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakg.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */