package com.google.android.gms.internal.measurement;

import a0.j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkg<MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>>
  extends zzio<MessageType, BuilderType>
{
  private static Map<Class<?>, zzkg<?, ?>> zzc = new ConcurrentHashMap();
  public zzmx zzb = zzmx.zzc();
  private int zzd = -1;
  
  private final int zza()
  {
    return zzma.zza().zza(this).zzb(this);
  }
  
  public static <T extends zzkg<?, ?>> T zza(Class<T> paramClass)
  {
    Object localObject1 = (zzkg)zzc.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (zzkg)zzc.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (zzkg)((zzkg)zzmz.zza(paramClass)).zza(zzf.zzf, null, null);
      if (localObject1 != null) {
        zzc.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject1;
  }
  
  public static <E> zzkm<E> zza(zzkm<E> paramzzkm)
  {
    return paramzzkm.zza(paramzzkm.size() << 1);
  }
  
  public static zzkn zza(zzkn paramzzkn)
  {
    return paramzzkn.zzc(paramzzkn.size() << 1);
  }
  
  public static Object zza(zzlm paramzzlm, String paramString, Object[] paramArrayOfObject)
  {
    return new zzmc(paramzzlm, paramString, paramArrayOfObject);
  }
  
  static Object zza(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  public static <T extends zzkg<?, ?>> void zza(Class<T> paramClass, T paramT)
  {
    paramT.zzcp();
    zzc.put(paramClass, paramT);
  }
  
  private final int zzb(zzme<?> paramzzme)
  {
    if (paramzzme == null) {
      return zzma.zza().zza(this).zza(this);
    }
    return paramzzme.zza(this);
  }
  
  private static final <T extends zzkg<T, ?>> boolean zzb(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.zza(zzf.zza, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = zzma.zza().zza(paramT).zze(paramT);
    if (paramBoolean)
    {
      i = zzf.zzb;
      T ?;
      if (bool) {
        ? = paramT;
      } else {
        ? = null;
      }
      paramT.zza(i, ?, null);
    }
    return bool;
  }
  
  public static zzkk zzcj()
  {
    return zzkh.zzd();
  }
  
  public static zzkn zzck()
  {
    return zzlb.zzd();
  }
  
  public static <E> zzkm<E> zzcl()
  {
    return zzmd.zzd();
  }
  
  public boolean equals(Object paramObject)
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
    return zzma.zza().zza(this).zzb(this, (zzkg)paramObject);
  }
  
  public int hashCode()
  {
    if (zzcq()) {
      return zza();
    }
    if (zza == 0) {
      zza = zza();
    }
    return zza;
  }
  
  public final boolean j_()
  {
    return zzb(this, true);
  }
  
  public String toString()
  {
    return zzlr.zza(this, super.toString());
  }
  
  public final int zza(zzme paramzzme)
  {
    if (zzcq())
    {
      i = zzb(paramzzme);
      if (i >= 0) {
        return i;
      }
      throw new IllegalStateException(j.g("serialized size must be non-negative, was ", i));
    }
    if (zzcc() != Integer.MAX_VALUE) {
      return zzcc();
    }
    int i = zzb(paramzzme);
    zzc(i);
    return i;
  }
  
  public final <MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zza(MessageType paramMessageType)
  {
    return zzcg().zza(paramMessageType);
  }
  
  public abstract Object zza(int paramInt, Object paramObject1, Object paramObject2);
  
  public final void zza(zzjn paramzzjn)
  {
    zzma.zza().zza(this).zza(this, zzjp.zza(paramzzjn));
  }
  
  final void zzc(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzd = (paramInt & 0x7FFFFFFF | zzd & 0x80000000);
      return;
    }
    throw new IllegalStateException(j.g("serialized size must be non-negative, was ", paramInt));
  }
  
  public final int zzcc()
  {
    return zzd & 0x7FFFFFFF;
  }
  
  public final int zzcf()
  {
    return zza(null);
  }
  
  public final <MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzcg()
  {
    return (zza)zza(zzf.zze, null, null);
  }
  
  public final BuilderType zzch()
  {
    return ((zza)zza(zzf.zze, null, null)).zza(this);
  }
  
  public final MessageType zzci()
  {
    return (zzkg)zza(zzf.zzd, null, null);
  }
  
  public final void zzco()
  {
    zzma.zza().zza(this).zzd(this);
    zzcp();
  }
  
  public final void zzcp()
  {
    zzd &= 0x7FFFFFFF;
  }
  
  public final boolean zzcq()
  {
    return (zzd & 0x80000000) != 0;
  }
  
  public static class zza<MessageType extends zzkg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>>
    extends zzin<MessageType, BuilderType>
  {
    public MessageType zza;
    private final MessageType zzb;
    
    public zza(MessageType paramMessageType)
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
  
  public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType>
    extends zzkg<MessageType, BuilderType>
    implements zzlo
  {
    public zzjw<zzkg.zze> zzc = zzjw.zzb();
    
    public final zzjw<zzkg.zze> zza()
    {
      if (zzc.zzf()) {
        zzc = ((zzjw)zzc.clone());
      }
      return zzc;
    }
  }
  
  public static final class zzc<T extends zzkg<T, ?>>
    extends zzip<T>
  {
    public zzc(T paramT) {}
  }
  
  public static final class zzd<ContainingType extends zzlm, Type>
    extends zzjr<ContainingType, Type>
  {}
  
  public static final class zze
    implements zzjy<zze>
  {
    public final int zza()
    {
      throw new NoSuchMethodError();
    }
    
    public final zzlp zza(zzlp paramzzlp, zzlm paramzzlm)
    {
      throw new NoSuchMethodError();
    }
    
    public final zzlv zza(zzlv paramzzlv1, zzlv paramzzlv2)
    {
      throw new NoSuchMethodError();
    }
    
    public final zzng zzb()
    {
      throw new NoSuchMethodError();
    }
    
    public final zznj zzc()
    {
      throw new NoSuchMethodError();
    }
    
    public final boolean zzd()
    {
      throw new NoSuchMethodError();
    }
    
    public final boolean zze()
    {
      throw new NoSuchMethodError();
    }
  }
  
  public static enum zzf
  {
    public static int[] zza()
    {
      return (int[])zzh.clone();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */