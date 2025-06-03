package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class zzjw<T extends zzjy<T>>
{
  private static final zzjw<?> zzb = new zzjw(true);
  public final zzmj<T, Object> zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzjw()
  {
    zza = new zzmi();
  }
  
  private zzjw(zzmj<T, Object> paramzzmj)
  {
    zza = paramzzmj;
    zze();
  }
  
  private zzjw(boolean paramBoolean)
  {
    this(new zzmi());
    zze();
  }
  
  public static int zza(zzjy<?> paramzzjy, Object paramObject)
  {
    zzng localzzng = paramzzjy.zzb();
    int i = paramzzjy.zza();
    if (paramzzjy.zze())
    {
      paramObject = (List)paramObject;
      int j = ((List)paramObject).size();
      boolean bool = paramzzjy.zzd();
      int k = 0;
      int m = 0;
      if (bool)
      {
        if (((List)paramObject).isEmpty()) {
          return 0;
        }
        k = 0;
        while (m < j)
        {
          k += zza(localzzng, ((List)paramObject).get(m));
          m++;
        }
        m = zzjn.zzf(i);
        return zzjn.zzg(k) + (m + k);
      }
      m = 0;
      while (k < j)
      {
        m += zza(localzzng, i, ((List)paramObject).get(k));
        k++;
      }
      return m;
    }
    return zza(localzzng, i, paramObject);
  }
  
  public static int zza(zzng paramzzng, int paramInt, Object paramObject)
  {
    int i = zzjn.zzf(paramInt);
    paramInt = i;
    if (paramzzng == zzng.zzj)
    {
      zzkj.zza((zzlm)paramObject);
      paramInt = i << 1;
    }
    return paramInt + zza(paramzzng, paramObject);
  }
  
  private static int zza(zzng paramzzng, Object paramObject)
  {
    switch (zzjz.zzb[paramzzng.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof zzki)) {
        return zzjn.zza(((zzki)paramObject).zza());
      }
      return zzjn.zza(((Integer)paramObject).intValue());
    case 17: 
      return zzjn.zzd(((Long)paramObject).longValue());
    case 16: 
      return zzjn.zze(((Integer)paramObject).intValue());
    case 15: 
      return zzjn.zzc(((Long)paramObject).longValue());
    case 14: 
      return zzjn.zzd(((Integer)paramObject).intValue());
    case 13: 
      return zzjn.zzg(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof zziy)) {
        return zzjn.zza((zziy)paramObject);
      }
      return zzjn.zza((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof zziy)) {
        return zzjn.zza((zziy)paramObject);
      }
      return zzjn.zza((String)paramObject);
    case 10: 
      if ((paramObject instanceof zzkq)) {
        return zzjn.zza((zzkq)paramObject);
      }
      return zzjn.zzb((zzlm)paramObject);
    case 9: 
      return zzjn.zza((zzlm)paramObject);
    case 8: 
      return zzjn.zza(((Boolean)paramObject).booleanValue());
    case 7: 
      return zzjn.zzb(((Integer)paramObject).intValue());
    case 6: 
      return zzjn.zza(((Long)paramObject).longValue());
    case 5: 
      return zzjn.zzc(((Integer)paramObject).intValue());
    case 4: 
      return zzjn.zze(((Long)paramObject).longValue());
    case 3: 
      return zzjn.zzb(((Long)paramObject).longValue());
    case 2: 
      return zzjn.zza(((Float)paramObject).floatValue());
    }
    return zzjn.zza(((Double)paramObject).doubleValue());
  }
  
  private static int zza(Map.Entry<T, Object> paramEntry)
  {
    zzjy localzzjy = (zzjy)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localzzjy.zzc() == zznj.zzi) && (!localzzjy.zze()) && (!localzzjy.zzd()))
    {
      boolean bool = localObject instanceof zzkq;
      int i = ((zzjy)paramEntry.getKey()).zza();
      if (bool) {
        return zzjn.zza(i, (zzkq)localObject);
      }
      return zzjn.zza(i, (zzlm)localObject);
    }
    return zza(localzzjy, localObject);
  }
  
  private final Object zza(T paramT)
  {
    paramT = zza.get(paramT);
    if (!(paramT instanceof zzkq)) {
      return paramT;
    }
    paramT = (zzkq)paramT;
    throw new NoSuchMethodError();
  }
  
  private static Object zza(Object paramObject)
  {
    if ((paramObject instanceof zzlv)) {
      return ((zzlv)paramObject).zza();
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
  
  public static void zza(zzjn paramzzjn, zzng paramzzng, int paramInt, Object paramObject)
  {
    if (paramzzng == zzng.zzj)
    {
      paramzzng = (zzlm)paramObject;
      zzkj.zza(paramzzng);
      paramzzjn.zzj(paramInt, 3);
      paramzzng.zza(paramzzjn);
      paramzzjn.zzj(paramInt, 4);
      return;
    }
    paramzzjn.zzj(paramInt, paramzzng.zza());
    switch (zzjz.zzb[paramzzng.ordinal()])
    {
    default: 
      break;
    case 18: 
      if ((paramObject instanceof zzki))
      {
        paramzzjn.zzi(((zzki)paramObject).zza());
        return;
      }
      paramzzjn.zzi(((Integer)paramObject).intValue());
      break;
    case 17: 
      paramzzjn.zzg(((Long)paramObject).longValue());
      return;
    case 16: 
      paramzzjn.zzj(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramzzjn.zzf(((Long)paramObject).longValue());
      return;
    case 14: 
      paramzzjn.zzh(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramzzjn.zzk(((Integer)paramObject).intValue());
      return;
    case 12: 
      if ((paramObject instanceof zziy))
      {
        paramzzjn.zzb((zziy)paramObject);
        return;
      }
      paramzzng = (byte[])paramObject;
      paramzzjn.zzb(paramzzng, 0, paramzzng.length);
      return;
    case 11: 
      if ((paramObject instanceof zziy))
      {
        paramzzjn.zzb((zziy)paramObject);
        return;
      }
      paramzzjn.zzb((String)paramObject);
      return;
    case 10: 
      paramzzjn.zzc((zzlm)paramObject);
      return;
    case 9: 
      ((zzlm)paramObject).zza(paramzzjn);
      return;
    case 8: 
      paramzzjn.zzb(((Boolean)paramObject).booleanValue());
      return;
    case 7: 
      paramzzjn.zzh(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramzzjn.zzf(((Long)paramObject).longValue());
      return;
    case 5: 
      paramzzjn.zzi(((Integer)paramObject).intValue());
      return;
    case 4: 
      paramzzjn.zzh(((Long)paramObject).longValue());
      return;
    case 3: 
      paramzzjn.zzh(((Long)paramObject).longValue());
      return;
    case 2: 
      paramzzjn.zzb(((Float)paramObject).floatValue());
      return;
    case 1: 
      paramzzjn.zzb(((Double)paramObject).doubleValue());
    }
  }
  
  public static <T extends zzjy<T>> zzjw<T> zzb()
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
    if ((paramObject instanceof zzkq)) {
      zzd = true;
    }
    zza.zza(paramT, paramObject);
  }
  
  private final void zzb(Map.Entry<T, Object> paramEntry)
  {
    zzjy localzzjy = (zzjy)paramEntry.getKey();
    paramEntry = paramEntry.getValue();
    boolean bool = paramEntry instanceof zzkq;
    Object localObject;
    if (localzzjy.zze())
    {
      if (!bool)
      {
        localObject = zza(localzzjy);
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
        zza.zza(localzzjy, paramEntry);
        return;
      }
      throw new IllegalStateException("Lazy fields can not be repeated");
    }
    if (localzzjy.zzc() == zznj.zzi)
    {
      localObject = zza(localzzjy);
      if (localObject == null)
      {
        zza.zza(localzzjy, zza(paramEntry));
        if (bool) {
          zzd = true;
        }
      }
      else
      {
        if (bool) {
          break label254;
        }
        if ((localObject instanceof zzlv)) {
          paramEntry = localzzjy.zza((zzlv)localObject, (zzlv)paramEntry);
        } else {
          paramEntry = localzzjy.zza(((zzlm)localObject).zzcn(), (zzlm)paramEntry).zzaj();
        }
        zza.zza(localzzjy, paramEntry);
      }
      return;
      label254:
      paramEntry = (zzkq)paramEntry;
      throw new NoSuchMethodError();
    }
    if (!bool)
    {
      zza.zza(localzzjy, zza(paramEntry));
      return;
    }
    throw new IllegalStateException("Lazy fields must be message-valued");
  }
  
  private static boolean zzb(Object paramObject)
  {
    if ((paramObject instanceof zzlo)) {
      return ((zzlo)paramObject).j_();
    }
    if ((paramObject instanceof zzkq)) {
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
    //   8: invokestatic 350	com/google/android/gms/internal/measurement/zzkj:zza	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: getstatic 352	com/google/android/gms/internal/measurement/zzjz:zza	[I
    //   15: aload_2
    //   16: invokevirtual 354	com/google/android/gms/internal/measurement/zzng:zzb	()Lcom/google/android/gms/internal/measurement/zznj;
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
    //   85: instanceof 152
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
    //   112: instanceof 137
    //   115: ifne +10 -> 125
    //   118: aload_1
    //   119: instanceof 142
    //   122: ifeq -50 -> 72
    //   125: iconst_1
    //   126: istore_3
    //   127: goto +48 -> 175
    //   130: aload_1
    //   131: instanceof 147
    //   134: istore_3
    //   135: goto +40 -> 175
    //   138: aload_1
    //   139: instanceof 162
    //   142: istore_3
    //   143: goto +32 -> 175
    //   146: aload_1
    //   147: instanceof 189
    //   150: istore_3
    //   151: goto +24 -> 175
    //   154: aload_1
    //   155: instanceof 180
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
    //   180: new 305	java/lang/IllegalArgumentException
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
    //   211: invokevirtual 354	com/google/android/gms/internal/measurement/zzng:zzb	()Lcom/google/android/gms/internal/measurement/zznj;
    //   214: aastore
    //   215: dup
    //   216: iconst_2
    //   217: aload_1
    //   218: invokevirtual 364	java/lang/Object:getClass	()Ljava/lang/Class;
    //   221: invokevirtual 370	java/lang/Class:getName	()Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic 374	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   228: invokespecial 308	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   231: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	paramT	T
    //   0	232	1	paramObject	Object
    //   6	10	2	localzzng	zzng
    //   73	103	3	bool	boolean
  }
  
  private static <T extends zzjy<T>> boolean zzc(Map.Entry<T, Object> paramEntry)
  {
    zzjy localzzjy = (zzjy)paramEntry.getKey();
    if (localzzjy.zzc() == zznj.zzi)
    {
      boolean bool = localzzjy.zze();
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
    if (!(paramObject instanceof zzjw)) {
      return false;
    }
    paramObject = (zzjw)paramObject;
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
  
  public final void zza(zzjw<T> paramzzjw)
  {
    int i = zza.zzb();
    for (int j = 0; j < i; j++) {
      zzb(zza.zza(j));
    }
    paramzzjw = zza.zzc().iterator();
    while (paramzzjw.hasNext()) {
      zzb((Map.Entry)paramzzjw.next());
    }
  }
  
  public final Iterator<Map.Entry<T, Object>> zzc()
  {
    if (zza.isEmpty()) {
      return Collections.emptyIterator();
    }
    if (zzd) {
      return new zzks(zza.zzd().iterator());
    }
    return zza.zzd().iterator();
  }
  
  public final Iterator<Map.Entry<T, Object>> zzd()
  {
    if (zza.isEmpty()) {
      return Collections.emptyIterator();
    }
    if (zzd) {
      return new zzks(zza.entrySet().iterator());
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
      if ((localObject instanceof zzkg)) {
        ((zzkg)localObject).zzco();
      }
    }
    Iterator localIterator = zza.zzc().iterator();
    while (localIterator.hasNext())
    {
      localObject = ((Map.Entry)localIterator.next()).getValue();
      if ((localObject instanceof zzkg)) {
        ((zzkg)localObject).zzco();
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */