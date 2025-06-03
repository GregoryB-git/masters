package com.google.android.gms.internal.firebase_auth_api;

import java.io.IOException;
import java.io.OutputStream;

public abstract class zzain<MessageType extends zzain<MessageType, BuilderType>, BuilderType extends zzaip<MessageType, BuilderType>>
  implements zzaln
{
  public int zza = 0;
  
  public int zza(com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    int i = zzi();
    int j = i;
    if (i == -1)
    {
      j = paramzzamc.zza(this);
      zzb(j);
    }
    return j;
  }
  
  public final void zza(OutputStream paramOutputStream)
  {
    paramOutputStream = zzajo.zza(paramOutputStream, zzajo.zzd(zzl()));
    zza(paramOutputStream);
    paramOutputStream.zzc();
  }
  
  void zzb(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  int zzi()
  {
    throw new UnsupportedOperationException();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzj()
  {
    try
    {
      Object localObject = zzaiw.zzc(zzl());
      zza(((zzajf)localObject).zzb());
      localObject = ((zzajf)localObject).zza();
      return (com.google.android.gms.internal.firebase-auth-api.zzaiw)localObject;
    }
    catch (IOException localIOException)
    {
      String str = getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder("Serializing ");
      localStringBuilder.append(str);
      localStringBuilder.append(" to a ");
      localStringBuilder.append("ByteString");
      localStringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
  
  public final byte[] zzk()
  {
    try
    {
      byte[] arrayOfByte = new byte[zzl()];
      localObject = zzajo.zzb(arrayOfByte);
      zza((com.google.android.gms.internal.firebase-auth-api.zzajo)localObject);
      ((zzajo)localObject).zzb();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      Object localObject = getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder("Serializing ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" to a ");
      localStringBuilder.append("byte array");
      localStringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */