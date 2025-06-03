package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzajo;
import com.google.android.gms.internal.firebase-auth-api.zzalm;
import com.google.android.gms.internal.firebase-auth-api.zzals;
import com.google.android.gms.internal.firebase-auth-api.zzanh;
import com.google.android.gms.internal.firebase-auth-api.zzank;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzakg<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>>
  extends zzain<MessageType, BuilderType>
{
  private static Map<Class<?>, zzakg<?, ?>> zzc = new ConcurrentHashMap();
  public com.google.android.gms.internal.firebase-auth-api.zzamy zzb = zzamy.zzc();
  private int zzd = -1;
  
  private final int zza()
  {
    return zzaly.zza().zza(this).zzb(this);
  }
  
  private static <T extends zzakg<T, ?>> T zza(T paramT)
  {
    if ((paramT != null) && (!zzb(paramT, true)))
    {
      paramT = new zzamw(paramT).zza();
      paramT.getClass();
      throw paramT;
    }
    return paramT;
  }
  
  public static <T extends zzakg<T, ?>> T zza(T paramT, zzaiw paramzzaiw, zzajv paramzzajv)
  {
    return zza(zzb(paramT, paramzzaiw, paramzzajv));
  }
  
  private static <T extends zzakg<T, ?>> T zza(T paramT, zzaji paramzzaji, zzajv paramzzajv)
  {
    paramT = paramT.zzo();
    try
    {
      com.google.android.gms.internal.firebase-auth-api.zzamc localzzamc = zzaly.zza().zza(paramT);
      localzzamc.zza(paramT, zzajm.zza(paramzzaji), paramzzajv);
      localzzamc.zzd(paramT);
      return paramT;
    }
    catch (RuntimeException paramT)
    {
      if ((paramT.getCause() instanceof zzakm)) {
        throw ((zzakm)paramT.getCause());
      }
      throw paramT;
    }
    catch (IOException paramT)
    {
      if ((paramT.getCause() instanceof zzakm)) {
        throw ((zzakm)paramT.getCause());
      }
      throw new zzakm(paramT);
    }
    catch (zzamw paramT)
    {
      paramT = paramT.zza();
      paramT.getClass();
      throw paramT;
    }
    catch (zzakm paramzzaji)
    {
      paramT = paramzzaji;
      if (paramzzaji.zzl()) {
        paramT = new zzakm(paramzzaji);
      }
      throw paramT;
    }
  }
  
  public static <T extends zzakg<T, ?>> T zza(T paramT, InputStream paramInputStream, zzajv paramzzajv)
  {
    if (paramInputStream == null)
    {
      paramInputStream = zzaki.zzb;
      paramInputStream = zzaji.zza(paramInputStream, 0, paramInputStream.length, false);
    }
    else
    {
      paramInputStream = new zzajk(paramInputStream, 4096, null);
    }
    return zza(zza(paramT, paramInputStream, paramzzajv));
  }
  
  private static <T extends zzakg<T, ?>> T zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzajv paramzzajv)
  {
    if (paramInt2 == 0) {
      return paramT;
    }
    com.google.android.gms.internal.firebase-auth-api.zzakg localzzakg = paramT.zzo();
    try
    {
      paramT = zzaly.zza().zza(localzzakg);
      zzaiv localzzaiv = new com/google/android/gms/internal/firebase_auth_api/zzaiv;
      localzzaiv.<init>(paramzzajv);
      paramT.zza(localzzakg, paramArrayOfByte, 0, paramInt2, localzzaiv);
      paramT.zzd(localzzakg);
      return localzzakg;
    }
    catch (IndexOutOfBoundsException paramT)
    {
      paramT = zzakm.zzj();
      paramT.getClass();
      throw paramT;
    }
    catch (IOException paramT)
    {
      if ((paramT.getCause() instanceof zzakm)) {
        throw ((zzakm)paramT.getCause());
      }
      throw new zzakm(paramT);
    }
    catch (zzamw paramT)
    {
      paramT = paramT.zza();
      paramT.getClass();
      throw paramT;
    }
    catch (zzakm paramArrayOfByte)
    {
      paramT = paramArrayOfByte;
      if (paramArrayOfByte.zzl()) {
        paramT = new zzakm(paramArrayOfByte);
      }
      throw paramT;
    }
  }
  
  public static <T extends zzakg<T, ?>> T zza(T paramT, byte[] paramArrayOfByte, zzajv paramzzajv)
  {
    return zza(zza(paramT, paramArrayOfByte, 0, paramArrayOfByte.length, paramzzajv));
  }
  
  public static <T extends zzakg<?, ?>> T zza(Class<T> paramClass)
  {
    Object localObject1 = (zzakg)zzc.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (zzakg)zzc.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (zzakg)((zzakg)zzana.zza(paramClass)).zza(zze.zzf, null, null);
      if (localObject1 != null) {
        zzc.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject1;
  }
  
  public static <E> zzakn<E> zza(zzakn<E> paramzzakn)
  {
    return paramzzakn.zza(paramzzakn.size() << 1);
  }
  
  public static Object zza(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, String paramString, Object[] paramArrayOfObject)
  {
    return new zzama(paramzzaln, paramString, paramArrayOfObject);
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
  
  public static <T extends zzakg<?, ?>> void zza(Class<T> paramClass, T paramT)
  {
    paramT.zzu();
    zzc.put(paramClass, paramT);
  }
  
  private final int zzb(zzamc<?> paramzzamc)
  {
    if (paramzzamc == null) {
      return zzaly.zza().zza(this).zza(this);
    }
    return paramzzamc.zza(this);
  }
  
  private static <T extends zzakg<T, ?>> T zzb(T paramT, zzaiw paramzzaiw, zzajv paramzzajv)
  {
    paramzzaiw = paramzzaiw.zzc();
    paramT = zza(paramT, paramzzaiw, paramzzajv);
    try
    {
      paramzzaiw.zzc(0);
      return paramT;
    }
    catch (zzakm paramT)
    {
      throw paramT;
    }
  }
  
  private static final <T extends zzakg<T, ?>> boolean zzb(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.zza(zze.zza, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = zzaly.zza().zza(paramT).zze(paramT);
    if (paramBoolean)
    {
      i = zze.zzb;
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
  
  public static <E> zzakn<E> zzp()
  {
    return zzamb.zzd();
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
    return zzaly.zza().zza(this).zzb(this, (zzakg)paramObject);
  }
  
  public int hashCode()
  {
    if (zzw()) {
      return zza();
    }
    if (zza == 0) {
      zza = zza();
    }
    return zza;
  }
  
  public String toString()
  {
    return zzalo.zza(this, super.toString());
  }
  
  public final int zza(com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    if (zzw())
    {
      i = zzb(paramzzamc);
      if (i >= 0) {
        return i;
      }
      throw new IllegalStateException(j.g("serialized size must be non-negative, was ", i));
    }
    if (zzi() != Integer.MAX_VALUE) {
      return zzi();
    }
    int i = zzb(paramzzamc);
    zzb(i);
    return i;
  }
  
  public abstract Object zza(int paramInt, Object paramObject1, Object paramObject2);
  
  public final void zza(zzajo paramzzajo)
  {
    zzaly.zza().zza(this).zza(this, zzajq.zza(paramzzajo));
  }
  
  final void zzb(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzd = (paramInt & 0x7FFFFFFF | zzd & 0x80000000);
      return;
    }
    throw new IllegalStateException(j.g("serialized size must be non-negative, was ", paramInt));
  }
  
  final int zzi()
  {
    return zzd & 0x7FFFFFFF;
  }
  
  public final int zzl()
  {
    return zza(null);
  }
  
  public final <MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzm()
  {
    return (zzb)zza(zze.zze, null, null);
  }
  
  public final BuilderType zzn()
  {
    return ((zzb)zza(zze.zze, null, null)).zza(this);
  }
  
  public final MessageType zzo()
  {
    return (zzakg)zza(zze.zzd, null, null);
  }
  
  public final void zzt()
  {
    zzaly.zza().zza(this).zzd(this);
    zzu();
  }
  
  public final void zzu()
  {
    zzd &= 0x7FFFFFFF;
  }
  
  public final boolean zzv()
  {
    return zzb(this, true);
  }
  
  public final boolean zzw()
  {
    return (zzd & 0x80000000) != 0;
  }
  
  public static final class zza<T extends zzakg<T, ?>>
    extends zzair<T>
  {
    public zza(T paramT) {}
  }
  
  public static class zzb<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>>
    extends zzaip<MessageType, BuilderType>
  {
    public MessageType zza;
    private final MessageType zzb;
    
    public zzb(MessageType paramMessageType)
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
  
  public static final class zzc
    implements zzaka<zzc>
  {
    public final int zza()
    {
      throw new NoSuchMethodError();
    }
    
    public final zzalm zza(zzalm paramzzalm, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
    {
      throw new NoSuchMethodError();
    }
    
    public final zzals zza(zzals paramzzals1, zzals paramzzals2)
    {
      throw new NoSuchMethodError();
    }
    
    public final zzanh zzb()
    {
      throw new NoSuchMethodError();
    }
    
    public final zzank zzc()
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
  
  public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType>
    extends zzakg<MessageType, BuilderType>
    implements zzalp
  {
    public zzajy<zzakg.zzc> zzc = zzajy.zzb();
    
    public final zzajy<zzakg.zzc> zza()
    {
      if (zzc.zzf()) {
        zzc = ((zzajy)zzc.clone());
      }
      return zzc;
    }
  }
  
  public static enum zze
  {
    public static int[] zza()
    {
      return (int[])zzh.clone();
    }
  }
  
  public static final class zzf<ContainingType extends zzaln, Type>
    extends zzajs<ContainingType, Type>
  {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */