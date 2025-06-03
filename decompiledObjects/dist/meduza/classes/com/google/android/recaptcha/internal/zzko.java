package com.google.android.recaptcha.internal;

import g;
import java.io.IOException;
import java.util.List;

public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>>
  implements zzoi
{
  public int zza = 0;
  
  public static void zzc(Iterable paramIterable, List paramList)
  {
    zzkn.zzd(paramIterable, paramList);
  }
  
  public int zza(zzow paramzzow)
  {
    throw null;
  }
  
  public final zzle zzb()
  {
    try
    {
      int i = zzo();
      Object localObject = zzle.zzb;
      localObject = new byte[i];
      zzlk localzzlk = new com/google/android/recaptcha/internal/zzlk;
      localzzlk.<init>((byte[])localObject, 0, i);
      zze(localzzlk);
      localzzlk.zzC();
      localObject = new zzlc((byte[])localObject);
      return (zzle)localObject;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(g.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), localIOException);
    }
  }
  
  public final byte[] zzd()
  {
    try
    {
      int i = zzo();
      byte[] arrayOfByte = new byte[i];
      zzlk localzzlk = new com/google/android/recaptcha/internal/zzlk;
      localzzlk.<init>(arrayOfByte, 0, i);
      zze(localzzlk);
      localzzlk.zzC();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(g.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzko
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */