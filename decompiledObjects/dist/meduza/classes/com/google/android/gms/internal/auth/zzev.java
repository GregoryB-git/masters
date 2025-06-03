package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>>
  extends zzdq<MessageType, BuilderType>
{
  private static final Map zzb = new ConcurrentHashMap();
  public zzha zzc = zzha.zza();
  private int zzd = -1;
  
  public static zzev zzb(Class paramClass)
  {
    Map localMap = zzb;
    Object localObject1 = (zzev)localMap.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (zzev)localMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (zzev)((zzev)zzhj.zze(paramClass)).zzn(6, null, null);
      if (localObject1 != null) {
        localMap.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (zzev)localObject1;
  }
  
  public static zzev zzd(zzev paramzzev, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = zzo(paramzzev, paramArrayOfByte, 0, paramArrayOfByte.length, zzel.zza);
    if (paramArrayOfByte != null)
    {
      int i = ((Byte)paramArrayOfByte.zzn(1, null, null)).byteValue();
      if (i != 1) {
        if (i != 0)
        {
          paramzzev = paramArrayOfByte.getClass();
          boolean bool = zzgf.zza().zzb(paramzzev).zzi(paramArrayOfByte);
          if (true != bool) {
            paramzzev = null;
          } else {
            paramzzev = paramArrayOfByte;
          }
          paramArrayOfByte.zzn(2, paramzzev, null);
          if (bool) {}
        }
        else
        {
          paramzzev = new zzgy(paramArrayOfByte).zza();
          paramzzev.zze(paramArrayOfByte);
          throw paramzzev;
        }
      }
    }
    return paramArrayOfByte;
  }
  
  public static zzez zzf()
  {
    return zzgg.zze();
  }
  
  public static Object zzg(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static Object zzh(zzfx paramzzfx, String paramString, Object[] paramArrayOfObject)
  {
    return new zzgh(paramzzfx, "\001\001\000\000\001\001\001\000\001\000\001\032", paramArrayOfObject);
  }
  
  public static void zzk(Class paramClass, zzev paramzzev)
  {
    paramzzev.zzj();
    zzb.put(paramClass, paramzzev);
  }
  
  private static zzev zzo(zzev paramzzev, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzel paramzzel)
  {
    paramzzev = paramzzev.zzc();
    try
    {
      zzgi localzzgi = zzgf.zza().zzb(paramzzev.getClass());
      zzdt localzzdt = new com/google/android/gms/internal/auth/zzdt;
      localzzdt.<init>(paramzzel);
      localzzgi.zzg(paramzzev, paramArrayOfByte, 0, paramInt2, localzzdt);
      localzzgi.zze(paramzzev);
      return paramzzev;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      paramArrayOfByte = zzfb.zzf();
      paramArrayOfByte.zze(paramzzev);
      throw paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      if ((paramArrayOfByte.getCause() instanceof zzfb)) {
        throw ((zzfb)paramArrayOfByte.getCause());
      }
      paramArrayOfByte = new zzfb(paramArrayOfByte);
      paramArrayOfByte.zze(paramzzev);
      throw paramArrayOfByte;
    }
    catch (zzgy paramArrayOfByte)
    {
      paramArrayOfByte = paramArrayOfByte.zza();
      paramArrayOfByte.zze(paramzzev);
      throw paramArrayOfByte;
    }
    catch (zzfb paramArrayOfByte)
    {
      paramArrayOfByte.zze(paramzzev);
      throw paramArrayOfByte;
    }
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
    return zzgf.zza().zzb(localClass).zzh(this, (zzev)paramObject);
  }
  
  public final int hashCode()
  {
    if (!zzm())
    {
      int i = zza;
      int j = i;
      if (i == 0)
      {
        j = zza();
        zza = j;
      }
      return j;
    }
    return zza();
  }
  
  public final String toString()
  {
    return zzfz.zza(this, super.toString());
  }
  
  final int zza()
  {
    return zzgf.zza().zzb(getClass()).zza(this);
  }
  
  public final zzev zzc()
  {
    return (zzev)zzn(4, null, null);
  }
  
  public final void zzi()
  {
    zzgf.zza().zzb(getClass()).zze(this);
    zzj();
  }
  
  final void zzj()
  {
    zzd &= 0x7FFFFFFF;
  }
  
  public final void zzl(int paramInt)
  {
    zzd = (zzd & 0x80000000 | 0x7FFFFFFF);
  }
  
  final boolean zzm()
  {
    return (zzd & 0x80000000) != 0;
  }
  
  public abstract Object zzn(int paramInt, Object paramObject1, Object paramObject2);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzev
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */