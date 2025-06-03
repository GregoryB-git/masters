package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

public abstract class zzio<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>>
  implements zzlm
{
  public int zza = 0;
  
  public static <T> void zza(Iterable<T> paramIterable, List<? super T> paramList)
  {
    zzin.zza(paramIterable, paramList);
  }
  
  public int zza(zzme paramzzme)
  {
    int i = zzcc();
    int j = i;
    if (i == -1)
    {
      j = paramzzme.zza(this);
      zzc(j);
    }
    return j;
  }
  
  void zzc(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public int zzcc()
  {
    throw new UnsupportedOperationException();
  }
  
  public final zziy zzcd()
  {
    try
    {
      localObject = zziy.zzc(zzcf());
      zza(((zzjd)localObject).zzb());
      localObject = ((zzjd)localObject).zza();
      return (zziy)localObject;
    }
    catch (IOException localIOException)
    {
      Object localObject = getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder("Serializing ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" to a ");
      localStringBuilder.append("ByteString");
      localStringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
  
  public final byte[] zzce()
  {
    try
    {
      localObject1 = new byte[zzcf()];
      localObject2 = zzjn.zzb((byte[])localObject1);
      zza((zzjn)localObject2);
      ((zzjn)localObject2).zzb();
      return (byte[])localObject1;
    }
    catch (IOException localIOException)
    {
      Object localObject1 = getClass().getName();
      Object localObject2 = new StringBuilder("Serializing ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" to a ");
      ((StringBuilder)localObject2).append("byte array");
      ((StringBuilder)localObject2).append(" threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject2).toString(), localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzio
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */