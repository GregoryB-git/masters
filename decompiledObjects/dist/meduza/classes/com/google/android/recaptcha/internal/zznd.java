package com.google.android.recaptcha.internal;

import f;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zznd<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>>
  extends zzko<MessageType, BuilderType>
{
  private static final Map zzb = new ConcurrentHashMap();
  public zzpm zzc = zzpm.zzc();
  private int zzd = -1;
  
  public static zznj zzA()
  {
    return zznx.zzf();
  }
  
  public static zznk zzB()
  {
    return zzot.zze();
  }
  
  public static zznk zzC(zznk paramzznk)
  {
    int i = paramzznk.size();
    return paramzznk.zzd(i + i);
  }
  
  public static Object zzE(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  public static Object zzF(zzoi paramzzoi, String paramString, Object[] paramArrayOfObject)
  {
    return new zzou(paramzzoi, paramString, paramArrayOfObject);
  }
  
  public static void zzI(Class paramClass, zznd paramzznd)
  {
    paramzznd.zzH();
    zzb.put(paramClass, paramzznd);
  }
  
  public static final boolean zzK(zznd paramzznd, boolean paramBoolean)
  {
    int i = ((Byte)paramzznd.zzh(1, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = zzos.zza().zzb(paramzznd.getClass()).zzl(paramzznd);
    if (paramBoolean)
    {
      zznd localzznd;
      if (true != bool) {
        localzznd = null;
      } else {
        localzznd = paramzznd;
      }
      paramzznd.zzh(2, localzznd, null);
    }
    return bool;
  }
  
  private final int zzf(zzow paramzzow)
  {
    return zzos.zza().zzb(getClass()).zza(this);
  }
  
  private static zznd zzg(zznd paramzznd)
  {
    if ((paramzznd != null) && (!zzK(paramzznd, true))) {
      throw new zzpk(paramzznd).zza();
    }
    return paramzznd;
  }
  
  private static zznd zzi(zznd paramzznd, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzmo paramzzmo)
  {
    if (paramInt2 == 0) {
      return paramzznd;
    }
    zznd localzznd = paramzznd.zzv();
    try
    {
      zzow localzzow = zzos.zza().zzb(localzznd.getClass());
      paramzznd = new com/google/android/recaptcha/internal/zzkt;
      paramzznd.<init>(paramzzmo);
      localzzow.zzi(localzznd, paramArrayOfByte, 0, paramInt2, paramzznd);
      localzzow.zzf(localzznd);
      return localzznd;
    }
    catch (IndexOutOfBoundsException paramzznd)
    {
      throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    catch (IOException paramzznd)
    {
      if ((paramzznd.getCause() instanceof zznn)) {
        throw ((zznn)paramzznd.getCause());
      }
      throw new zznn(paramzznd);
    }
    catch (zzpk paramzznd)
    {
      throw paramzznd.zza();
    }
    catch (zznn paramzznd)
    {
      if (paramzznd.zzb()) {
        throw new zznn(paramzznd);
      }
      throw paramzznd;
    }
  }
  
  public static zznc zzs(zzoi paramzzoi1, Object paramObject, zzoi paramzzoi2, zzng paramzzng, int paramInt, zzpw paramzzpw, Class paramClass)
  {
    return new zznc(paramzzoi1, "", null, new zznb(null, paramInt, paramzzpw, false, false), paramClass);
  }
  
  public static zznd zzu(Class paramClass)
  {
    Map localMap = zzb;
    Object localObject1 = (zznd)localMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (zznd)localMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (zznd)((zznd)zzps.zze(paramClass)).zzh(6, null, null);
      if (localObject1 != null) {
        localMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (zznd)localObject1;
  }
  
  public static zznd zzw(zznd paramzznd, InputStream paramInputStream)
  {
    if (paramInputStream == null)
    {
      paramInputStream = zznl.zzb;
      i = paramInputStream.length;
      paramInputStream = zzli.zzH(paramInputStream, 0, 0, false);
    }
    else
    {
      paramInputStream = new zzlg(paramInputStream, 4096, null);
    }
    zzmo localzzmo = zzmo.zza;
    int i = zzos.zza;
    localzzmo = zzmo.zza;
    paramzznd = paramzznd.zzv();
    try
    {
      zzow localzzow = zzos.zza().zzb(paramzznd.getClass());
      localzzow.zzh(paramzznd, zzlj.zzq(paramInputStream), localzzmo);
      localzzow.zzf(paramzznd);
      zzg(paramzznd);
      return paramzznd;
    }
    catch (RuntimeException paramzznd)
    {
      if ((paramzznd.getCause() instanceof zznn)) {
        throw ((zznn)paramzznd.getCause());
      }
      throw paramzznd;
    }
    catch (IOException paramzznd)
    {
      if ((paramzznd.getCause() instanceof zznn)) {
        throw ((zznn)paramzznd.getCause());
      }
      throw new zznn(paramzznd);
    }
    catch (zzpk paramzznd)
    {
      throw paramzznd.zza();
    }
    catch (zznn paramzznd)
    {
      if (paramzznd.zzb()) {
        throw new zznn(paramzznd);
      }
      throw paramzznd;
    }
  }
  
  public static zznd zzx(zznd paramzznd, byte[] paramArrayOfByte)
  {
    zzmo localzzmo = zzmo.zza;
    int i = zzos.zza;
    paramzznd = zzi(paramzznd, paramArrayOfByte, 0, paramArrayOfByte.length, zzmo.zza);
    zzg(paramzznd);
    return paramzznd;
  }
  
  public static zzni zzy()
  {
    return zzne.zzf();
  }
  
  public static zzni zzz(zzni paramzzni)
  {
    int i = paramzzni.size();
    return paramzzni.zzg(i + i);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    Class localClass = getClass();
    return zzos.zza().zzb(localClass).zzk(this, (zznd)paramObject);
  }
  
  public final int hashCode()
  {
    if (!zzL())
    {
      int i = zza;
      int j = i;
      if (i == 0)
      {
        j = zzn();
        zza = j;
      }
      return j;
    }
    return zzn();
  }
  
  public final String toString()
  {
    return zzok.zza(this, super.toString());
  }
  
  public final zzoq zzD()
  {
    return (zzoq)zzh(7, null, null);
  }
  
  public final void zzG()
  {
    zzos.zza().zzb(getClass()).zzf(this);
    zzH();
  }
  
  public final void zzH()
  {
    zzd &= 0x7FFFFFFF;
  }
  
  public final void zzJ(int paramInt)
  {
    zzd = (zzd & 0x80000000 | 0x7FFFFFFF);
  }
  
  public final boolean zzL()
  {
    return (zzd & 0x80000000) != 0;
  }
  
  public final int zza(zzow paramzzow)
  {
    if (zzL())
    {
      i = paramzzow.zza(this);
      if (i >= 0) {
        return i;
      }
      throw new IllegalStateException(f.h("serialized size must be non-negative, was ", i));
    }
    int i = zzd & 0x7FFFFFFF;
    if (i == Integer.MAX_VALUE)
    {
      i = paramzzow.zza(this);
      if (i >= 0)
      {
        zzd = (zzd & 0x80000000 | i);
        return i;
      }
      throw new IllegalStateException(f.h("serialized size must be non-negative, was ", i));
    }
    return i;
  }
  
  public final void zze(zzln paramzzln)
  {
    zzos.zza().zzb(getClass()).zzj(this, zzlo.zza(paramzzln));
  }
  
  public abstract Object zzh(int paramInt, Object paramObject1, Object paramObject2);
  
  public final int zzn()
  {
    return zzos.zza().zzb(getClass()).zzb(this);
  }
  
  public final int zzo()
  {
    int i;
    if (zzL())
    {
      i = zzf(null);
      if (i < 0) {
        throw new IllegalStateException(f.h("serialized size must be non-negative, was ", i));
      }
    }
    else
    {
      i = zzd & 0x7FFFFFFF;
      if (i == Integer.MAX_VALUE)
      {
        i = zzf(null);
        if (i < 0) {
          break label80;
        }
        zzd = (zzd & 0x80000000 | i);
      }
    }
    return i;
    label80:
    throw new IllegalStateException(f.h("serialized size must be non-negative, was ", i));
  }
  
  public final boolean zzp()
  {
    return zzK(this, true);
  }
  
  public final zzmx zzq()
  {
    return (zzmx)zzh(5, null, null);
  }
  
  public final zzmx zzr()
  {
    zzmx localzzmx = (zzmx)zzh(5, null, null);
    localzzmx.zzh(this);
    return localzzmx;
  }
  
  public final zznd zzv()
  {
    return (zznd)zzh(4, null, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */