package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzkg$zza<MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>>
  extends zzin<MessageType, BuilderType>
{
  public MessageType zza;
  private final MessageType zzb;
  
  public zzkg$zza(MessageType paramMessageType)
  {
    zzb = paramMessageType;
    if (!paramMessageType.zzcq())
    {
      zza = paramMessageType.zzci();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  private static <MessageType> void zza(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    zzma.zza().zza(paramMessageType1).zza(paramMessageType1, paramMessageType2);
  }
  
  private final BuilderType zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzjt paramzzjt)
  {
    if (!zza.zzcq()) {
      zzan();
    }
    try
    {
      zzme localzzme = zzma.zza().zza(zza);
      zzkg localzzkg = zza;
      zzit localzzit = new com/google/android/gms/internal/measurement/zzit;
      localzzit.<init>(paramzzjt);
      localzzme.zza(localzzkg, paramArrayOfByte, 0, paramInt2, localzzit);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw zzkp.zzi();
    }
    catch (zzkp paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
  
  private final BuilderType zzc(zzjk paramzzjk, zzjt paramzzjt)
  {
    if (!zza.zzcq()) {
      zzan();
    }
    try
    {
      zzma.zza().zza(zza).zza(zza, zzjl.zza(paramzzjk), paramzzjt);
      return this;
    }
    catch (RuntimeException paramzzjk)
    {
      if ((paramzzjk.getCause() instanceof IOException)) {
        throw ((IOException)paramzzjk.getCause());
      }
      throw paramzzjk;
    }
  }
  
  public final boolean j_()
  {
    return zzkg.zza(zza, false);
  }
  
  public final BuilderType zza(MessageType paramMessageType)
  {
    if (zzb.equals(paramMessageType)) {
      return this;
    }
    if (!zza.zzcq()) {
      zzan();
    }
    zza(zza, paramMessageType);
    return this;
  }
  
  public final MessageType zzah()
  {
    zzkg localzzkg = (zzkg)zzak();
    if (localzzkg.j_()) {
      return localzzkg;
    }
    throw new zzmv(localzzkg);
  }
  
  public MessageType zzai()
  {
    if (!zza.zzcq()) {
      return zza;
    }
    zza.zzco();
    return zza;
  }
  
  public final void zzam()
  {
    if (!zza.zzcq()) {
      zzan();
    }
  }
  
  public void zzan()
  {
    zzkg localzzkg = zzb.zzci();
    zza(localzzkg, zza);
    zza = localzzkg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */