package com.google.android.gms.internal.firebase_auth_api;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class zzajy<T extends zzaka<T>>
{
  private static final zzajy<?> zzb = new zzajy(true);
  public final zzamh<T, Object> zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzajy()
  {
    zza = new zzamg();
  }
  
  private zzajy(zzamh<T, Object> paramzzamh)
  {
    zza = paramzzamh;
    zze();
  }
  
  private zzajy(boolean paramBoolean)
  {
    this(new zzamg());
    zze();
  }
  
  public static int zza(zzaka<?> paramzzaka, Object paramObject)
  {
    com.google.android.gms.internal.firebase-auth-api.zzanh localzzanh = paramzzaka.zzb();
    int i = paramzzaka.zza();
    if (paramzzaka.zze())
    {
      paramObject = (List)paramObject;
      int j = ((List)paramObject).size();
      boolean bool = paramzzaka.zzd();
      int k = 0;
      int m = 0;
      if (bool)
      {
        if (((List)paramObject).isEmpty()) {
          return 0;
        }
        n = 0;
        while (m < j)
        {
          n += zza(localzzanh, ((List)paramObject).get(m));
          m++;
        }
        m = zzajo.zzg(i);
        return zzajo.zzh(n) + (m + n);
      }
      int n = 0;
      for (m = k; m < j; m++) {
        n += zza(localzzanh, i, ((List)paramObject).get(m));
      }
      return n;
    }
    return zza(localzzanh, i, paramObject);
  }
  
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzanh paramzzanh, int paramInt, Object paramObject)
  {
    int i = zzajo.zzg(paramInt);
    paramInt = i;
    if (paramzzanh == zzanh.zzj)
    {
      zzaki.zza((zzaln)paramObject);
      paramInt = i << 1;
    }
    return paramInt + zza(paramzzanh, paramObject);
  }
  
  private static int zza(com.google.android.gms.internal.firebase-auth-api.zzanh paramzzanh, Object paramObject)
  {
    switch (zzakb.zzb[paramzzanh.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof zzakl)) {
        return zzajo.zza(((zzakl)paramObject).zza());
      }
      return zzajo.zza(((Integer)paramObject).intValue());
    case 17: 
      return zzajo.zzd(((Long)paramObject).longValue());
    case 16: 
      return zzajo.zzf(((Integer)paramObject).intValue());
    case 15: 
      return zzajo.zzc(((Long)paramObject).longValue());
    case 14: 
      return zzajo.zze(((Integer)paramObject).intValue());
    case 13: 
      return zzajo.zzh(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof zzaiw)) {
        return zzajo.zza((zzaiw)paramObject);
      }
      return zzajo.zza((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof zzaiw)) {
        return zzajo.zza((zzaiw)paramObject);
      }
      return zzajo.zza((String)paramObject);
    case 10: 
      if ((paramObject instanceof zzakr)) {
        return zzajo.zza((zzakr)paramObject);
      }
      return zzajo.zzb((zzaln)paramObject);
    case 9: 
      return zzajo.zza((zzaln)paramObject);
    case 8: 
      return zzajo.zza(((Boolean)paramObject).booleanValue());
    case 7: 
      return zzajo.zzb(((Integer)paramObject).intValue());
    case 6: 
      return zzajo.zza(((Long)paramObject).longValue());
    case 5: 
      return zzajo.zzc(((Integer)paramObject).intValue());
    case 4: 
      return zzajo.zze(((Long)paramObject).longValue());
    case 3: 
      return zzajo.zzb(((Long)paramObject).longValue());
    case 2: 
      return zzajo.zza(((Float)paramObject).floatValue());
    }
    return zzajo.zza(((Double)paramObject).doubleValue());
  }
  
  private static int zza(Map.Entry<T, Object> paramEntry)
  {
    zzaka localzzaka = (zzaka)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localzzaka.zzc() == zzank.zzi) && (!localzzaka.zze()) && (!localzzaka.zzd()))
    {
      boolean bool = localObject instanceof zzakr;
      int i = ((zzaka)paramEntry.getKey()).zza();
      if (bool) {
        return zzajo.zza(i, (zzakr)localObject);
      }
      return zzajo.zza(i, (zzaln)localObject);
    }
    return zza(localzzaka, localObject);
  }
  
  private final Object zza(T paramT)
  {
    paramT = zza.get(paramT);
    if (!(paramT instanceof zzakr)) {
      return paramT;
    }
    paramT = (zzakr)paramT;
    throw new NoSuchMethodError();
  }
  
  private static Object zza(Object paramObject)
  {
    if ((paramObject instanceof zzals)) {
      return ((zzals)paramObject).zza();
    }
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    }
    return paramObject;
  }
  
  public static void zza(com.google.android.gms.internal.firebase-auth-api.zzajo paramzzajo, com.google.android.gms.internal.firebase-auth-api.zzanh paramzzanh, int paramInt, Object paramObject)
  {
    if (paramzzanh == zzanh.zzj)
    {
      paramzzanh = (zzaln)paramObject;
      zzaki.zza(paramzzanh);
      paramzzajo.zzj(paramInt, 3);
      paramzzanh.zza(paramzzajo);
      paramzzajo.zzj(paramInt, 4);
      return;
    }
    paramzzajo.zzj(paramInt, paramzzanh.zza());
    switch (zzakb.zzb[paramzzanh.ordinal()])
    {
    default: 
      break;
    case 18: 
      if ((paramObject instanceof zzakl))
      {
        paramzzajo.zzj(((zzakl)paramObject).zza());
        return;
      }
      paramzzajo.zzj(((Integer)paramObject).intValue());
      break;
    case 17: 
      paramzzajo.zzg(((Long)paramObject).longValue());
      return;
    case 16: 
      paramzzajo.zzk(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramzzajo.zzf(((Long)paramObject).longValue());
      return;
    case 14: 
      paramzzajo.zzi(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramzzajo.zzl(((Integer)paramObject).intValue());
      return;
    case 12: 
      if ((paramObject instanceof zzaiw))
      {
        paramzzajo.zzb((zzaiw)paramObject);
        return;
      }
      paramzzanh = (byte[])paramObject;
      paramzzajo.zzb(paramzzanh, 0, paramzzanh.length);
      return;
    case 11: 
      if ((paramObject instanceof zzaiw))
      {
        paramzzajo.zzb((zzaiw)paramObject);
        return;
      }
      paramzzajo.zzb((String)paramObject);
      return;
    case 10: 
      paramzzajo.zzc((zzaln)paramObject);
      return;
    case 9: 
      ((zzaln)paramObject).zza(paramzzajo);
      return;
    case 8: 
      paramzzajo.zzb(((Boolean)paramObject).booleanValue());
      return;
    case 7: 
      paramzzajo.zzi(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramzzajo.zzf(((Long)paramObject).longValue());
      return;
    case 5: 
      paramzzajo.zzj(((Integer)paramObject).intValue());
      return;
    case 4: 
      paramzzajo.zzh(((Long)paramObject).longValue());
      return;
    case 3: 
      paramzzajo.zzh(((Long)paramObject).longValue());
      return;
    case 2: 
      paramzzajo.zzb(((Float)paramObject).floatValue());
      return;
    case 1: 
      paramzzajo.zzb(((Double)paramObject).doubleValue());
    }
  }
  
  public static <T extends zzaka<T>> zzajy<T> zzb()
  {
    return zzb;
  }
  
  private final void zzb(T paramT, Object paramObject)
  {
    if (paramT.zze())
    {
      if ((paramObject instanceof List))
      {
        List localList = (List)paramObject;
        int i = localList.size();
        paramObject = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
          Object localObject = localList.get(j);
          zzc(paramT, localObject);
          ((ArrayList)paramObject).add(localObject);
        }
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zzc(paramT, paramObject);
    }
    if ((paramObject instanceof zzakr)) {
      zzd = true;
    }
    zza.zza(paramT, paramObject);
  }
  
  private final void zzb(Map.Entry<T, Object> paramEntry)
  {
    zzaka localzzaka = (zzaka)paramEntry.getKey();
    paramEntry = paramEntry.getValue();
    boolean bool = paramEntry instanceof zzakr;
    Object localObject;
    if (localzzaka.zze())
    {
      if (!bool)
      {
        localObject = zza(localzzaka);
        List localList = (List)paramEntry;
        int i = localList.size();
        paramEntry = (Map.Entry<T, Object>)localObject;
        if (localObject == null) {
          paramEntry = new ArrayList(i);
        }
        localObject = (List)paramEntry;
        for (int j = 0; j < i; j++) {
          ((List)localObject).add(zza(localList.get(j)));
        }
        zza.zza(localzzaka, paramEntry);
        return;
      }
      throw new IllegalStateException("Lazy fields can not be repeated");
    }
    if (localzzaka.zzc() == zzank.zzi)
    {
      localObject = zza(localzzaka);
      if (localObject == null)
      {
        zza.zza(localzzaka, zza(paramEntry));
        if (bool) {
          zzd = true;
        }
      }
      else
      {
        if (bool) {
          break label254;
        }
        if ((localObject instanceof zzals)) {
          paramEntry = localzzaka.zza((zzals)localObject, (zzals)paramEntry);
        } else {
          paramEntry = localzzaka.zza(((zzaln)localObject).zzr(), (zzaln)paramEntry).zze();
        }
        zza.zza(localzzaka, paramEntry);
      }
      return;
      label254:
      paramEntry = (zzakr)paramEntry;
      throw new NoSuchMethodError();
    }
    if (!bool)
    {
      zza.zza(localzzaka, zza(paramEntry));
      return;
    }
    throw new IllegalStateException("Lazy fields must be message-valued");
  }
  
  private static boolean zzb(Object paramObject)
  {
    if ((paramObject instanceof zzalp)) {
      return ((zzalp)paramObject).zzv();
    }
    if ((paramObject instanceof zzakr)) {
      return true;
    }
    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
  }
  
  /* Error */
  private static void zzc(T paramT, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 44 1 0
    //   6: astore_2
    //   7: aload_1
    //   8: invokestatic 350	com/google/android/gms/internal/firebase_auth_api/zzaki:zza	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: getstatic 352	com/google/android/gms/internal/firebase_auth_api/zzakb:zza	[I
    //   15: aload_2
    //   16: invokevirtual 354	com/google/android/gms/internal/firebase_auth_api/zzanh:zzb	()Lcom/google/android/gms/internal/firebase-auth-api/zzank;
    //   19: invokevirtual 103	java/lang/Enum:ordinal	()I
    //   22: iaload
    //   23: tableswitch	default:+49->72, 1:+147->170, 2:+139->162, 3:+131->154, 4:+123->146, 5:+115->138, 6:+107->130, 7:+88->111, 8:+71->94, 9:+54->77
    //   72: iconst_0
    //   73: istore_3
    //   74: goto +101 -> 175
    //   77: aload_1
    //   78: instanceof 88
    //   81: ifne +44 -> 125
    //   84: aload_1
    //   85: instanceof 153
    //   88: ifeq -16 -> 72
    //   91: goto +34 -> 125
    //   94: aload_1
    //   95: instanceof 117
    //   98: ifne +27 -> 125
    //   101: aload_1
    //   102: instanceof 112
    //   105: ifeq -33 -> 72
    //   108: goto +17 -> 125
    //   111: aload_1
    //   112: instanceof 138
    //   115: ifne +10 -> 125
    //   118: aload_1
    //   119: instanceof 143
    //   122: ifeq -50 -> 72
    //   125: iconst_1
    //   126: istore_3
    //   127: goto +48 -> 175
    //   130: aload_1
    //   131: instanceof 148
    //   134: istore_3
    //   135: goto +40 -> 175
    //   138: aload_1
    //   139: instanceof 163
    //   142: istore_3
    //   143: goto +32 -> 175
    //   146: aload_1
    //   147: instanceof 190
    //   150: istore_3
    //   151: goto +24 -> 175
    //   154: aload_1
    //   155: instanceof 181
    //   158: istore_3
    //   159: goto +16 -> 175
    //   162: aload_1
    //   163: instanceof 122
    //   166: istore_3
    //   167: goto +8 -> 175
    //   170: aload_1
    //   171: instanceof 117
    //   174: istore_3
    //   175: iload_3
    //   176: ifeq +4 -> 180
    //   179: return
    //   180: new 306	java/lang/IllegalArgumentException
    //   183: dup
    //   184: ldc_w 356
    //   187: iconst_3
    //   188: anewarray 5	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_0
    //   194: invokeinterface 47 1 0
    //   199: invokestatic 360	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: aload_0
    //   206: invokeinterface 44 1 0
    //   211: invokevirtual 354	com/google/android/gms/internal/firebase_auth_api/zzanh:zzb	()Lcom/google/android/gms/internal/firebase-auth-api/zzank;
    //   214: aastore
    //   215: dup
    //   216: iconst_2
    //   217: aload_1
    //   218: invokevirtual 364	java/lang/Object:getClass	()Ljava/lang/Class;
    //   221: invokevirtual 370	java/lang/Class:getName	()Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic 374	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   228: invokespecial 309	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   231: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	paramT	T
    //   0	232	1	paramObject	Object
    //   6	10	2	localzzanh	com.google.android.gms.internal.firebase-auth-api.zzanh
    //   73	103	3	bool	boolean
  }
  
  private static <T extends zzaka<T>> boolean zzc(Map.Entry<T, Object> paramEntry)
  {
    zzaka localzzaka = (zzaka)paramEntry.getKey();
    if (localzzaka.zzc() == zzank.zzi)
    {
      boolean bool = localzzaka.zze();
      paramEntry = paramEntry.getValue();
      if (bool)
      {
        paramEntry = (List)paramEntry;
        int i = paramEntry.size();
        for (int j = 0; j < i; j++) {
          if (!zzb(paramEntry.get(j))) {
            return false;
          }
        }
      }
      return zzb(paramEntry);
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzajy)) {
      return false;
    }
    paramObject = (zzajy)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final int zza()
  {
    int i = zza.zzb();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += zza(zza.zza(j));
      j++;
    }
    Iterator localIterator = zza.zzc().iterator();
    while (localIterator.hasNext()) {
      k += zza((Map.Entry)localIterator.next());
    }
    return k;
  }
  
  public final void zza(zzajy<T> paramzzajy)
  {
    int i = zza.zzb();
    for (int j = 0; j < i; j++) {
      zzb(zza.zza(j));
    }
    paramzzajy = zza.zzc().iterator();
    while (paramzzajy.hasNext()) {
      zzb((Map.Entry)paramzzajy.next());
    }
  }
  
  public final Iterator<Map.Entry<T, Object>> zzc()
  {
    if (zza.isEmpty()) {
      return Collections.emptyIterator();
    }
    if (zzd) {
      return new zzakt(zza.zzd().iterator());
    }
    return zza.zzd().iterator();
  }
  
  public final Iterator<Map.Entry<T, Object>> zzd()
  {
    if (zza.isEmpty()) {
      return Collections.emptyIterator();
    }
    if (zzd) {
      return new zzakt(zza.entrySet().iterator());
    }
    return zza.entrySet().iterator();
  }
  
  public final void zze()
  {
    if (zzc) {
      return;
    }
    int i = zza.zzb();
    Object localObject;
    for (int j = 0; j < i; j++)
    {
      localObject = zza.zza(j).getValue();
      if ((localObject instanceof zzakg)) {
        ((zzakg)localObject).zzt();
      }
    }
    Iterator localIterator = zza.zzc().iterator();
    while (localIterator.hasNext())
    {
      localObject = ((Map.Entry)localIterator.next()).getValue();
      if ((localObject instanceof zzakg)) {
        ((zzakg)localObject).zzt();
      }
    }
    zza.zza();
    zzc = true;
  }
  
  public final boolean zzf()
  {
    return zzc;
  }
  
  public final boolean zzg()
  {
    int i = zza.zzb();
    for (int j = 0; j < i; j++) {
      if (!zzc(zza.zza(j))) {
        return false;
      }
    }
    Iterator localIterator = zza.zzc().iterator();
    while (localIterator.hasNext()) {
      if (!zzc((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */