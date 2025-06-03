package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import sun.misc.Unsafe;

final class zzalr<T>
  implements zzamc<T>
{
  private static final int[] zza = new int[0];
  private static final Unsafe zzb = zzana.zzb();
  private final int[] zzc;
  private final Object[] zzd;
  private final int zze;
  private final int zzf;
  private final com.google.android.gms.internal.firebase-auth-api.zzaln zzg;
  private final boolean zzh;
  private final boolean zzi;
  private final boolean zzj;
  private final int[] zzk;
  private final int zzl;
  private final int zzm;
  private final com.google.android.gms.internal.firebase-auth-api.zzalv zzn;
  private final com.google.android.gms.internal.firebase-auth-api.zzakx zzo;
  private final zzamv<?, ?> zzp;
  private final zzajx<?> zzq;
  private final com.google.android.gms.internal.firebase-auth-api.zzalg zzr;
  
  private zzalr(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, zzaln paramzzaln, boolean paramBoolean, int[] paramArrayOfInt2, int paramInt3, int paramInt4, zzalv paramzzalv, zzakx paramzzakx, zzamv<?, ?> paramzzamv, zzajx<?> paramzzajx, zzalg paramzzalg)
  {
    zzc = paramArrayOfInt1;
    zzd = paramArrayOfObject;
    zze = paramInt1;
    zzf = paramInt2;
    zzi = (paramzzaln instanceof zzakg);
    if ((paramzzajx != null) && (paramzzajx.zza(paramzzaln))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    zzh = paramBoolean;
    zzj = false;
    zzk = paramArrayOfInt2;
    zzl = paramInt3;
    zzm = paramInt4;
    zzn = paramzzalv;
    zzo = paramzzakx;
    zzp = paramzzamv;
    zzq = paramzzajx;
    zzg = paramzzaln;
    zzr = paramzzalg;
  }
  
  private static <T> double zza(T paramT, long paramLong)
  {
    return ((Double)zzana.zze(paramT, paramLong)).doubleValue();
  }
  
  private final int zza(int paramInt)
  {
    if ((paramInt >= zze) && (paramInt <= zzf)) {
      return zza(paramInt, 0);
    }
    return -1;
  }
  
  private final int zza(int paramInt1, int paramInt2)
  {
    int i = zzc.length / 3 - 1;
    while (paramInt2 <= i)
    {
      int j = i + paramInt2 >>> 1;
      int k = j * 3;
      int m = zzc[k];
      if (paramInt1 == m) {
        return k;
      }
      if (paramInt1 < m) {
        i = j - 1;
      } else {
        paramInt2 = j + 1;
      }
    }
    return -1;
  }
  
  private static int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzanh paramzzanh, Class<?> paramClass, zzaiv paramzzaiv)
  {
    long l;
    switch (zzalq.zza[paramzzanh.ordinal()])
    {
    default: 
      throw new RuntimeException("unsupported field type.");
    case 17: 
      paramInt1 = zzais.zzb(paramArrayOfByte, paramInt1, paramzzaiv);
      break;
    case 16: 
      paramInt1 = zzais.zzd(paramArrayOfByte, paramInt1, paramzzaiv);
      l = zzaji.zza(zzb);
      break;
    case 15: 
      paramInt1 = zzais.zzc(paramArrayOfByte, paramInt1, paramzzaiv);
      paramInt2 = zzaji.zza(zza);
      break;
    case 14: 
      paramInt1 = zzais.zza(zzaly.zza().zza(paramClass), paramArrayOfByte, paramInt1, paramInt2, paramzzaiv);
      break;
    case 12: 
    case 13: 
      paramInt1 = zzais.zzd(paramArrayOfByte, paramInt1, paramzzaiv);
      l = zzb;
      paramArrayOfByte = Long.valueOf(l);
      break;
    case 9: 
    case 10: 
    case 11: 
      paramInt1 = zzais.zzc(paramArrayOfByte, paramInt1, paramzzaiv);
      paramInt2 = zza;
    }
    label259:
    label280:
    boolean bool;
    for (paramArrayOfByte = Integer.valueOf(paramInt2);; paramArrayOfByte = Boolean.valueOf(bool))
    {
      zzc = paramArrayOfByte;
      break;
      paramArrayOfByte = Float.valueOf(zzais.zzb(paramArrayOfByte, paramInt1));
      break label259;
      paramArrayOfByte = Long.valueOf(zzais.zzd(paramArrayOfByte, paramInt1));
      break label280;
      paramArrayOfByte = Integer.valueOf(zzais.zzc(paramArrayOfByte, paramInt1));
      zzc = paramArrayOfByte;
      paramInt1 += 4;
      break;
      paramArrayOfByte = Double.valueOf(zzais.zza(paramArrayOfByte, paramInt1));
      zzc = paramArrayOfByte;
      paramInt1 += 8;
      break;
      paramInt1 = zzais.zza(paramArrayOfByte, paramInt1, paramzzaiv);
      break;
      paramInt1 = zzais.zzd(paramArrayOfByte, paramInt1, paramzzaiv);
      if (zzb != 0L) {
        bool = true;
      } else {
        bool = false;
      }
    }
    return paramInt1;
  }
  
  public static <T> zzalr<T> zza(Class<T> paramClass, zzall paramzzall, zzalv paramzzalv, zzakx paramzzakx, zzamv<?, ?> paramzzamv, zzajx<?> paramzzajx, zzalg paramzzalg)
  {
    if ((paramzzall instanceof zzama))
    {
      zzama localzzama = (zzama)paramzzall;
      paramzzall = localzzama.zzd();
      int i = paramzzall.length();
      if (paramzzall.charAt(0) >= 55296) {
        for (j = 1;; j = k)
        {
          k = j + 1;
          m = k;
          if (paramzzall.charAt(j) < 55296) {
            break;
          }
        }
      }
      int m = 1;
      int j = m + 1;
      int n = paramzzall.charAt(m);
      m = j;
      int k = n;
      if (n >= 55296)
      {
        n &= 0x1FFF;
        k = 13;
        for (;;)
        {
          m = j + 1;
          j = paramzzall.charAt(j);
          if (j < 55296) {
            break;
          }
          n |= (j & 0x1FFF) << k;
          k += 13;
          j = m;
        }
        k = n | j << k;
      }
      int i1;
      int i2;
      int i3;
      int i4;
      if (k == 0)
      {
        paramClass = zza;
        i1 = 0;
        n = i1;
        j = n;
        i2 = j;
        i3 = i2;
        k = i3;
        i4 = k;
      }
      else
      {
        k = m + 1;
        n = paramzzall.charAt(m);
        m = n;
        j = k;
        if (n >= 55296)
        {
          m = n & 0x1FFF;
          j = 13;
          n = k;
          k = m;
          for (;;)
          {
            m = n + 1;
            n = paramzzall.charAt(n);
            if (n < 55296) {
              break;
            }
            k |= (n & 0x1FFF) << j;
            j += 13;
            n = m;
          }
          k |= n << j;
          j = m;
          m = k;
        }
        k = j + 1;
        n = paramzzall.charAt(j);
        i5 = n;
        j = k;
        if (n >= 55296)
        {
          n &= 0x1FFF;
          j = 13;
          for (i1 = k;; i1 = k)
          {
            k = i1 + 1;
            i1 = paramzzall.charAt(i1);
            if (i1 < 55296) {
              break;
            }
            n |= (i1 & 0x1FFF) << j;
            j += 13;
          }
          i5 = n | i1 << j;
          j = k;
        }
        k = j + 1;
        n = paramzzall.charAt(j);
        j = n;
        i1 = k;
        if (n >= 55296)
        {
          j = n & 0x1FFF;
          n = 13;
          i1 = k;
          k = j;
          for (;;)
          {
            j = i1 + 1;
            i1 = paramzzall.charAt(i1);
            if (i1 < 55296) {
              break;
            }
            k |= (i1 & 0x1FFF) << n;
            n += 13;
            i1 = j;
          }
          k |= i1 << n;
          i1 = j;
          j = k;
        }
        n = i1 + 1;
        i1 = paramzzall.charAt(i1);
        k = i1;
        i2 = n;
        if (i1 >= 55296)
        {
          k = i1 & 0x1FFF;
          i1 = 13;
          i2 = n;
          n = k;
          for (;;)
          {
            k = i2 + 1;
            i2 = paramzzall.charAt(i2);
            if (i2 < 55296) {
              break;
            }
            n |= (i2 & 0x1FFF) << i1;
            i1 += 13;
            i2 = k;
          }
          n |= i2 << i1;
          i2 = k;
          k = n;
        }
        i1 = i2 + 1;
        i3 = paramzzall.charAt(i2);
        n = i3;
        i2 = i1;
        if (i3 >= 55296)
        {
          i2 = i3 & 0x1FFF;
          n = 13;
          for (i3 = i1;; i3 = i1)
          {
            i1 = i3 + 1;
            i3 = paramzzall.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i2 |= (i3 & 0x1FFF) << n;
            n += 13;
          }
          n = i2 | i3 << n;
          i2 = i1;
        }
        i3 = i2 + 1;
        i4 = paramzzall.charAt(i2);
        i1 = i4;
        i2 = i3;
        if (i4 >= 55296)
        {
          i1 = i4 & 0x1FFF;
          i2 = 13;
          i4 = i3;
          i3 = i1;
          for (;;)
          {
            i1 = i4 + 1;
            i4 = paramzzall.charAt(i4);
            if (i4 < 55296) {
              break;
            }
            i3 |= (i4 & 0x1FFF) << i2;
            i2 += 13;
            i4 = i1;
          }
          i3 |= i4 << i2;
          i2 = i1;
          i1 = i3;
        }
        i3 = i2 + 1;
        i6 = paramzzall.charAt(i2);
        i4 = i6;
        i2 = i3;
        if (i6 >= 55296)
        {
          i4 = i6 & 0x1FFF;
          i2 = 13;
          for (i6 = i3;; i6 = i3)
          {
            i3 = i6 + 1;
            i6 = paramzzall.charAt(i6);
            if (i6 < 55296) {
              break;
            }
            i4 |= (i6 & 0x1FFF) << i2;
            i2 += 13;
          }
          i4 |= i6 << i2;
          i2 = i3;
        }
        i6 = i2 + 1;
        i7 = paramzzall.charAt(i2);
        i3 = i7;
        i2 = i6;
        if (i7 >= 55296)
        {
          i2 = i7 & 0x1FFF;
          i3 = 13;
          i7 = i6;
          i6 = i2;
          for (;;)
          {
            i2 = i7 + 1;
            i7 = paramzzall.charAt(i7);
            if (i7 < 55296) {
              break;
            }
            i6 |= (i7 & 0x1FFF) << i3;
            i3 += 13;
            i7 = i2;
          }
          i3 = i6 | i7 << i3;
        }
        paramClass = new int[i3 + i1 + i4];
        i4 = m;
        i6 = i2;
        i2 = k;
        m = (m << 1) + i5;
        k = i3;
        i3 = i2;
        i2 = j;
        j = i1;
        i1 = m;
        m = i6;
      }
      Unsafe localUnsafe = zzb;
      Object[] arrayOfObject1 = localzzama.zze();
      Class localClass = localzzama.zza().getClass();
      int[] arrayOfInt = new int[n * 3];
      Object[] arrayOfObject2 = new Object[n << 1];
      int i8 = k + j;
      j = k;
      int i9 = i8;
      int i10 = 0;
      int i5 = 0;
      int i7 = i3;
      int i6 = i2;
      n = m;
      m = i;
      while (n < m)
      {
        i2 = n + 1;
        i = paramzzall.charAt(n);
        if (i >= 55296)
        {
          i3 = i & 0x1FFF;
          i = i2;
          i2 = 13;
          for (;;)
          {
            n = i + 1;
            i = paramzzall.charAt(i);
            if (i < 55296) {
              break;
            }
            i3 |= (i & 0x1FFF) << i2;
            i2 += 13;
            i = n;
          }
          i = i3 | i << i2;
          i2 = n;
        }
        n = i2 + 1;
        int i11 = paramzzall.charAt(i2);
        if (i11 >= 55296)
        {
          i12 = i11 & 0x1FFF;
          i2 = 13;
          for (;;)
          {
            i3 = n + 1;
            i11 = paramzzall.charAt(n);
            n = m;
            if (i11 < 55296) {
              break;
            }
            i12 |= (i11 & 0x1FFF) << i2;
            i2 += 13;
            m = n;
            n = i3;
          }
          i11 = i12 | i11 << i2;
          i2 = i3;
        }
        else
        {
          i2 = n;
          n = m;
        }
        int i13 = i11 & 0xFF;
        int i12 = i5;
        if ((i11 & 0x400) != 0)
        {
          paramClass[i5] = i10;
          i12 = i5 + 1;
        }
        Object localObject;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i13 >= 51)
        {
          i3 = i2 + 1;
          i5 = paramzzall.charAt(i2);
          i2 = i5;
          m = i3;
          if (i5 >= 55296)
          {
            i2 = i5 & 0x1FFF;
            m = 13;
            i5 = i3;
            i3 = i2;
            for (;;)
            {
              i2 = i5 + 1;
              i5 = paramzzall.charAt(i5);
              if (i5 < 55296) {
                break;
              }
              i3 |= (i5 & 0x1FFF) << m;
              m += 13;
              i5 = i2;
            }
            i3 |= i5 << m;
            m = i2;
            i2 = i3;
          }
          i3 = i13 - 51;
          if ((i3 != 9) && (i3 != 17))
          {
            if ((i3 == 12) && ((localzzama.zzb().equals(zzalz.zza)) || ((i11 & 0x800) != 0)))
            {
              i5 = i10 / 3;
              i3 = i1 + 1;
              arrayOfObject2[((i5 << 1) + 1)] = arrayOfObject1[i1];
              i1 = i3;
            }
          }
          else
          {
            i5 = i10 / 3;
            i3 = i1 + 1;
            arrayOfObject2[((i5 << 1) + 1)] = arrayOfObject1[i1];
            i1 = i3;
          }
          i2 <<= 1;
          localObject = arrayOfObject1[i2];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zza(localClass, (String)localObject);
            arrayOfObject1[i2] = localObject;
          }
          i14 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i2++;
          localObject = arrayOfObject1[i2];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zza(localClass, (String)localObject);
            arrayOfObject1[i2] = localObject;
          }
          i15 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i2 = i1;
          i16 = 0;
          i1 = m;
          i17 = j;
          i18 = i9;
          m = i2;
        }
        else
        {
          i3 = i1 + 1;
          localObject = zza(localClass, (String)arrayOfObject1[i1]);
          if ((i13 != 9) && (i13 != 17))
          {
            if ((i13 != 27) && (i13 != 49))
            {
              if ((i13 != 12) && (i13 != 30) && (i13 != 44))
              {
                if (i13 == 50)
                {
                  m = j + 1;
                  paramClass[j] = i10;
                  j = i10 / 3 << 1;
                  i1 = i3 + 1;
                  arrayOfObject2[j] = arrayOfObject1[i3];
                  if ((i11 & 0x800) != 0)
                  {
                    arrayOfObject2[(j + 1)] = arrayOfObject1[i1];
                    i1++;
                    j = m;
                    m = i1;
                    break label2101;
                  }
                  j = m;
                  m = i1;
                  break label2101;
                }
                break label2097;
              }
              if ((localzzama.zzb() != zzalz.zza) && ((i11 & 0x800) == 0)) {
                break label2097;
              }
              i1 = i10 / 3;
              m = i3 + 1;
              arrayOfObject2[((i1 << 1) + 1)] = arrayOfObject1[i3];
            }
            else
            {
              i1 = i10 / 3;
              m = i3 + 1;
              arrayOfObject2[((i1 << 1) + 1)] = arrayOfObject1[i3];
            }
            break label2101;
          }
          else
          {
            arrayOfObject2[((i10 / 3 << 1) + 1)] = ((Field)localObject).getType();
          }
          label2097:
          m = i3;
          label2101:
          int i19 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          if ((i11 & 0x1000) != 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if ((i1 != 0) && (i13 <= 17))
          {
            i1 = i2 + 1;
            i3 = paramzzall.charAt(i2);
            i2 = i3;
            i5 = i1;
            if (i3 >= 55296)
            {
              i3 &= 0x1FFF;
              i2 = 13;
              for (i5 = i1;; i5 = i1)
              {
                i1 = i5 + 1;
                i5 = paramzzall.charAt(i5);
                if (i5 < 55296) {
                  break;
                }
                i3 |= (i5 & 0x1FFF) << i2;
                i2 += 13;
              }
              i2 = i3 | i5 << i2;
              i5 = i1;
            }
            i1 = i2 / 32 + (i4 << 1);
            localObject = arrayOfObject1[i1];
            if ((localObject instanceof Field))
            {
              localObject = (Field)localObject;
            }
            else
            {
              localObject = zza(localClass, (String)localObject);
              arrayOfObject1[i1] = localObject;
            }
            i1 = (int)localUnsafe.objectFieldOffset((Field)localObject);
            i3 = i2 % 32;
            i2 = i1;
          }
          else
          {
            i1 = 1048575;
            i3 = 0;
            i5 = i2;
            i2 = i1;
          }
          int i20 = m;
          i15 = i2;
          i16 = i3;
          i1 = i5;
          i14 = i19;
          i17 = j;
          i18 = i9;
          m = i20;
          if (i13 >= 18)
          {
            i15 = i2;
            i16 = i3;
            i1 = i5;
            i14 = i19;
            i17 = j;
            i18 = i9;
            m = i20;
            if (i13 <= 49)
            {
              paramClass[i9] = i19;
              i18 = i9 + 1;
              m = i20;
              i17 = j;
              i14 = i19;
              i1 = i5;
              i16 = i3;
              i15 = i2;
            }
          }
        }
        i5 = i10 + 1;
        arrayOfInt[i10] = i;
        i9 = i5 + 1;
        if ((i11 & 0x200) != 0) {
          j = 536870912;
        } else {
          j = 0;
        }
        if ((i11 & 0x100) != 0) {
          i2 = 268435456;
        } else {
          i2 = 0;
        }
        if ((i11 & 0x800) != 0) {
          i3 = Integer.MIN_VALUE;
        } else {
          i3 = 0;
        }
        arrayOfInt[i5] = (i13 << 20 | i3 | j | i2 | i14);
        i10 = i9 + 1;
        arrayOfInt[i9] = (i15 | i16 << 20);
        j = m;
        m = n;
        n = i1;
        i1 = j;
        i5 = i12;
        j = i17;
        i9 = i18;
      }
      return new zzalr(arrayOfInt, arrayOfObject2, i6, i7, localzzama.zza(), false, paramClass, k, i8, paramzzalv, paramzzakx, paramzzamv, paramzzajx, paramzzalg);
    }
    paramClass = (zzamp)paramzzall;
    throw new NoSuchMethodError();
  }
  
  private final <K, V, UT, UB> UB zza(int paramInt1, int paramInt2, Map<K, V> paramMap, zzakk paramzzakk, UB paramUB, zzamv<UT, UB> paramzzamv, Object paramObject)
  {
    com.google.android.gms.internal.firebase-auth-api.zzale localzzale = zzr.zza(zzf(paramInt1));
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!paramzzakk.zza(((Integer)localEntry.getValue()).intValue()))
      {
        paramMap = paramUB;
        if (paramUB == null) {
          paramMap = paramzzamv.zzc(paramObject);
        }
        paramUB = zzaiw.zzc(zzalf.zza(localzzale, localEntry.getKey(), localEntry.getValue()));
        com.google.android.gms.internal.firebase-auth-api.zzajo localzzajo = paramUB.zzb();
        try
        {
          zzalf.zza(localzzajo, localzzale, localEntry.getKey(), localEntry.getValue());
          paramzzamv.zza(paramMap, paramInt2, paramUB.zza());
          localIterator.remove();
          paramUB = paramMap;
        }
        catch (IOException paramMap)
        {
          throw new RuntimeException(paramMap);
        }
      }
    }
    return paramUB;
  }
  
  private final Object zza(T paramT, int paramInt)
  {
    com.google.android.gms.internal.firebase-auth-api.zzamc localzzamc = zze(paramInt);
    long l = zzc(paramInt) & 0xFFFFF;
    if (!zzc(paramT, paramInt)) {
      return localzzamc.zza();
    }
    Object localObject = zzb.getObject(paramT, l);
    if (zzg(localObject)) {
      return localObject;
    }
    paramT = localzzamc.zza();
    if (localObject != null) {
      localzzamc.zza(paramT, localObject);
    }
    return paramT;
  }
  
  private final Object zza(T paramT, int paramInt1, int paramInt2)
  {
    com.google.android.gms.internal.firebase-auth-api.zzamc localzzamc = zze(paramInt2);
    if (!zzc(paramT, paramInt1, paramInt2)) {
      return localzzamc.zza();
    }
    paramT = zzb.getObject(paramT, zzc(paramInt2) & 0xFFFFF);
    if (zzg(paramT)) {
      return paramT;
    }
    Object localObject = localzzamc.zza();
    if (paramT != null) {
      localzzamc.zza(localObject, paramT);
    }
    return localObject;
  }
  
  private final <UT, UB> UB zza(Object paramObject1, int paramInt, UB paramUB, zzamv<UT, UB> paramzzamv, Object paramObject2)
  {
    int i = zzc[paramInt];
    paramObject1 = zzana.zze(paramObject1, zzc(paramInt) & 0xFFFFF);
    if (paramObject1 == null) {
      return paramUB;
    }
    com.google.android.gms.internal.firebase-auth-api.zzakk localzzakk = zzd(paramInt);
    if (localzzakk == null) {
      return paramUB;
    }
    return (UB)zza(paramInt, i, zzr.zze(paramObject1), localzzakk, paramUB, paramzzamv, paramObject2);
  }
  
  private static Field zza(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (localObject2 : paramClass.getDeclaredFields()) {
        if (paramString.equals(((Field)localObject2).getName())) {
          return (Field)localObject2;
        }
      }
      paramClass = paramClass.getName();
      Object localObject2 = Arrays.toString((Object[])???);
      ??? = new StringBuilder("Field ");
      ((StringBuilder)???).append(paramString);
      ((StringBuilder)???).append(" for ");
      ((StringBuilder)???).append(paramClass);
      ((StringBuilder)???).append(" not found. Known fields are ");
      ((StringBuilder)???).append((String)localObject2);
      throw new RuntimeException(((StringBuilder)???).toString());
    }
  }
  
  private static void zza(int paramInt, Object paramObject, com.google.android.gms.internal.firebase-auth-api.zzanm paramzzanm)
  {
    if ((paramObject instanceof String))
    {
      paramzzanm.zza(paramInt, (String)paramObject);
      return;
    }
    paramzzanm.zza(paramInt, (zzaiw)paramObject);
  }
  
  private static <UT, UB> void zza(zzamv<UT, UB> paramzzamv, T paramT, zzanm paramzzanm)
  {
    paramzzamv.zzb(paramzzamv.zzd(paramT), paramzzanm);
  }
  
  private final <K, V> void zza(zzanm paramzzanm, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null) {
      paramzzanm.zza(paramInt1, zzr.zza(zzf(paramInt2)), zzr.zzd(paramObject));
    }
  }
  
  private final void zza(T paramT, int paramInt1, int paramInt2, Object paramObject)
  {
    zzb.putObject(paramT, zzc(paramInt2) & 0xFFFFF, paramObject);
    zzb(paramT, paramInt1, paramInt2);
  }
  
  private final void zza(Object paramObject, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzamd paramzzamd)
  {
    long l;
    if (zzg(paramInt))
    {
      l = paramInt & 0xFFFFF;
      paramzzamd = paramzzamd.zzr();
    }
    for (;;)
    {
      zzana.zza(paramObject, l, paramzzamd);
      return;
      boolean bool = zzi;
      paramInt &= 0xFFFFF;
      if (bool)
      {
        l = paramInt;
        paramzzamd = paramzzamd.zzq();
      }
      else
      {
        l = paramInt;
        paramzzamd = paramzzamd.zzp();
      }
    }
  }
  
  private final void zza(T paramT, int paramInt, Object paramObject)
  {
    zzb.putObject(paramT, zzc(paramInt) & 0xFFFFF, paramObject);
    zzb(paramT, paramInt);
  }
  
  private final void zza(T paramT1, T paramT2, int paramInt)
  {
    if (!zzc(paramT2, paramInt)) {
      return;
    }
    long l = zzc(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = zzb;
    Object localObject1 = localUnsafe.getObject(paramT2, l);
    if (localObject1 != null)
    {
      com.google.android.gms.internal.firebase-auth-api.zzamc localzzamc = zze(paramInt);
      if (!zzc(paramT1, paramInt))
      {
        if (!zzg(localObject1))
        {
          localUnsafe.putObject(paramT1, l, localObject1);
        }
        else
        {
          paramT2 = localzzamc.zza();
          localzzamc.zza(paramT2, localObject1);
          localUnsafe.putObject(paramT1, l, paramT2);
        }
        zzb(paramT1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramT1, l);
      paramT2 = (T)localObject2;
      if (!zzg(localObject2))
      {
        paramT2 = localzzamc.zza();
        localzzamc.zza(paramT2, localObject2);
        localUnsafe.putObject(paramT1, l, paramT2);
      }
      localzzamc.zza(paramT2, localObject1);
      return;
    }
    paramInt = zzc[paramInt];
    paramT1 = String.valueOf(paramT2);
    paramT2 = new StringBuilder("Source subfield ");
    paramT2.append(paramInt);
    paramT2.append(" is present but null: ");
    paramT2.append(paramT1);
    throw new IllegalStateException(paramT2.toString());
  }
  
  private final boolean zza(T paramT, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return zzc(paramT, paramInt1);
    }
    return (paramInt3 & paramInt4) != 0;
  }
  
  private static boolean zza(Object paramObject, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    return paramzzamc.zze(zzana.zze(paramObject, paramInt & 0xFFFFF));
  }
  
  private static <T> float zzb(T paramT, long paramLong)
  {
    return ((Float)zzana.zze(paramT, paramLong)).floatValue();
  }
  
  private final int zzb(int paramInt)
  {
    return zzc[(paramInt + 2)];
  }
  
  private final void zzb(T paramT, int paramInt)
  {
    paramInt = zzb(paramInt);
    long l = 0xFFFFF & paramInt;
    if (l == 1048575L) {
      return;
    }
    zzana.zza(paramT, l, 1 << (paramInt >>> 20) | zzana.zzc(paramT, l));
  }
  
  private final void zzb(T paramT, int paramInt1, int paramInt2)
  {
    zzana.zza(paramT, zzb(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void zzb(T paramT1, T paramT2, int paramInt)
  {
    int i = zzc[paramInt];
    if (!zzc(paramT2, i, paramInt)) {
      return;
    }
    long l = zzc(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = zzb;
    Object localObject1 = localUnsafe.getObject(paramT2, l);
    if (localObject1 != null)
    {
      com.google.android.gms.internal.firebase-auth-api.zzamc localzzamc = zze(paramInt);
      if (!zzc(paramT1, i, paramInt))
      {
        if (!zzg(localObject1))
        {
          localUnsafe.putObject(paramT1, l, localObject1);
        }
        else
        {
          paramT2 = localzzamc.zza();
          localzzamc.zza(paramT2, localObject1);
          localUnsafe.putObject(paramT1, l, paramT2);
        }
        zzb(paramT1, i, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramT1, l);
      paramT2 = (T)localObject2;
      if (!zzg(localObject2))
      {
        paramT2 = localzzamc.zza();
        localzzamc.zza(paramT2, localObject2);
        localUnsafe.putObject(paramT1, l, paramT2);
      }
      localzzamc.zza(paramT2, localObject1);
      return;
    }
    paramInt = zzc[paramInt];
    paramT2 = String.valueOf(paramT2);
    paramT1 = new StringBuilder("Source subfield ");
    paramT1.append(paramInt);
    paramT1.append(" is present but null: ");
    paramT1.append(paramT2);
    throw new IllegalStateException(paramT1.toString());
  }
  
  private final int zzc(int paramInt)
  {
    return zzc[(paramInt + 1)];
  }
  
  private static <T> int zzc(T paramT, long paramLong)
  {
    return ((Integer)zzana.zze(paramT, paramLong)).intValue();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamy zzc(Object paramObject)
  {
    zzakg localzzakg = (zzakg)paramObject;
    com.google.android.gms.internal.firebase-auth-api.zzamy localzzamy = zzb;
    paramObject = localzzamy;
    if (localzzamy == zzamy.zzc())
    {
      paramObject = zzamy.zzd();
      zzb = ((com.google.android.gms.internal.firebase-auth-api.zzamy)paramObject);
    }
    return (com.google.android.gms.internal.firebase-auth-api.zzamy)paramObject;
  }
  
  private final boolean zzc(T paramT, int paramInt)
  {
    int i = zzb(paramInt);
    long l = i & 0xFFFFF;
    if (l == 1048575L)
    {
      paramInt = zzc(paramInt);
      l = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return zzana.zze(paramT, l) != null;
      case 16: 
        return zzana.zzd(paramT, l) != 0L;
      case 15: 
        return zzana.zzc(paramT, l) != 0;
      case 14: 
        return zzana.zzd(paramT, l) != 0L;
      case 13: 
        return zzana.zzc(paramT, l) != 0;
      case 12: 
        return zzana.zzc(paramT, l) != 0;
      case 11: 
        return zzana.zzc(paramT, l) != 0;
      case 10: 
        return !zzaiw.zza.equals(zzana.zze(paramT, l));
      case 9: 
        return zzana.zze(paramT, l) != null;
      case 8: 
        paramT = zzana.zze(paramT, l);
        if ((paramT instanceof String)) {
          return !((String)paramT).isEmpty();
        }
        if ((paramT instanceof zzaiw)) {
          return !zzaiw.zza.equals(paramT);
        }
        throw new IllegalArgumentException();
      case 7: 
        return zzana.zzh(paramT, l);
      case 6: 
        return zzana.zzc(paramT, l) != 0;
      case 5: 
        return zzana.zzd(paramT, l) != 0L;
      case 4: 
        return zzana.zzc(paramT, l) != 0;
      case 3: 
        return zzana.zzd(paramT, l) != 0L;
      case 2: 
        return zzana.zzd(paramT, l) != 0L;
      case 1: 
        return Float.floatToRawIntBits(zzana.zzb(paramT, l)) != 0;
      }
      return Double.doubleToRawLongBits(zzana.zza(paramT, l)) != 0L;
    }
    return (zzana.zzc(paramT, l) & 1 << (i >>> 20)) != 0;
  }
  
  private final boolean zzc(T paramT, int paramInt1, int paramInt2)
  {
    return zzana.zzc(paramT, zzb(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  private final boolean zzc(T paramT1, T paramT2, int paramInt)
  {
    return zzc(paramT1, paramInt) == zzc(paramT2, paramInt);
  }
  
  private static <T> long zzd(T paramT, long paramLong)
  {
    return ((Long)zzana.zze(paramT, paramLong)).longValue();
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzakk zzd(int paramInt)
  {
    return (zzakk)zzd[((paramInt / 3 << 1) + 1)];
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzamc zze(int paramInt)
  {
    paramInt = paramInt / 3 << 1;
    Object localObject = (zzamc)zzd[paramInt];
    if (localObject != null) {
      return (com.google.android.gms.internal.firebase-auth-api.zzamc)localObject;
    }
    localObject = zzaly.zza().zza((Class)zzd[(paramInt + 1)]);
    zzd[paramInt] = localObject;
    return (com.google.android.gms.internal.firebase-auth-api.zzamc)localObject;
  }
  
  private static <T> boolean zze(T paramT, long paramLong)
  {
    return ((Boolean)zzana.zze(paramT, paramLong)).booleanValue();
  }
  
  private final Object zzf(int paramInt)
  {
    return zzd[(paramInt / 3 << 1)];
  }
  
  private static void zzf(Object paramObject)
  {
    if (zzg(paramObject)) {
      return;
    }
    throw new IllegalArgumentException(f.j("Mutating immutable message: ", String.valueOf(paramObject)));
  }
  
  private static boolean zzg(int paramInt)
  {
    return (paramInt & 0x20000000) != 0;
  }
  
  private static boolean zzg(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof zzakg)) {
      return ((zzakg)paramObject).zzw();
    }
    return true;
  }
  
  public final int zza(T paramT)
  {
    Unsafe localUnsafe = zzb;
    int i = 0;
    int k = 1048575;
    int m = 0;
    int n = m;
    int i1 = n;
    int i2 = n;
    n = k;
    label1864:
    label1871:
    label2320:
    int j;
    while (i2 < zzc.length)
    {
      int i3 = zzc(i2);
      int i4 = (0xFF00000 & i3) >>> 20;
      localObject = zzc;
      int i5 = localObject[i2];
      int i6 = localObject[(i2 + 2)];
      int i7 = i6 & 0xFFFFF;
      if (i4 <= 17)
      {
        k = n;
        if (i7 != n)
        {
          if (i7 == 1048575) {
            n = i;
          } else {
            n = localUnsafe.getInt(paramT, i7);
          }
          k = i7;
          m = n;
        }
        i6 = 1 << (i6 >>> 20);
        i7 = k;
      }
      else
      {
        i6 = i;
        i7 = n;
      }
      long l = i3 & 0xFFFFF;
      if (i4 >= zzakd.zza.zza()) {
        zzakd.zzb.zza();
      }
      switch (i4)
      {
      default: 
        n = i1;
        break;
      case 68: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zza(i5, (zzaln)localUnsafe.getObject(paramT, l), zze(i2));
        }
        break;
      case 67: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzd(i5, zzd(paramT, l));
        }
        break;
      case 66: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zze(i5, zzc(paramT, l));
        }
        break;
      case 65: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzc(i5, 0L);
        }
        break;
      case 64: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzd(i5, i);
        }
        break;
      case 63: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zza(i5, zzc(paramT, l));
        }
        break;
      case 62: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzf(i5, zzc(paramT, l));
        }
        break;
      case 61: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          localObject = localUnsafe.getObject(paramT, l);
        }
      case 60: 
      case 59: 
        do
        {
          n = zzajo.zza(i5, (zzaiw)localObject);
          break;
          n = i1;
          if (!zzc(paramT, i5, i2)) {
            break label1871;
          }
          n = zzame.zza(i5, localUnsafe.getObject(paramT, l), zze(i2));
          break label1864;
          n = i1;
          if (!zzc(paramT, i5, i2)) {
            break label1871;
          }
          localObject = localUnsafe.getObject(paramT, l);
        } while ((localObject instanceof zzaiw));
        n = zzajo.zza(i5, (String)localObject);
        break;
      case 58: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zza(i5, true);
        }
        break;
      case 57: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzb(i5, i);
        }
        break;
      case 56: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zza(i5, 0L);
        }
        break;
      case 55: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzc(i5, zzc(paramT, l));
        }
        break;
      case 54: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zze(i5, zzd(paramT, l));
        }
        break;
      case 53: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zzb(i5, zzd(paramT, l));
        }
        break;
      case 52: 
        n = i1;
        if (zzc(paramT, i5, i2)) {
          n = zzajo.zza(i5, 0.0F);
        }
        break;
      case 51: 
        n = i1;
        if (zzc(paramT, i5, i2))
        {
          n = zzajo.zza(i5, 0.0D);
          n = i1 + n;
        }
        break;
      case 50: 
        n = zzr.zza(i5, localUnsafe.getObject(paramT, l), zzf(i2));
        break;
      case 49: 
        n = zzame.zza(i5, (List)localUnsafe.getObject(paramT, l), zze(i2));
        break;
      case 48: 
        k = zzame.zzh((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 47: 
        k = zzame.zzg((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 46: 
        k = zzame.zzd((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 45: 
        k = zzame.zzc((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 44: 
        k = zzame.zzb((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 43: 
        k = zzame.zzi((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 42: 
        k = zzame.zza((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 41: 
        k = zzame.zzc((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 40: 
        k = zzame.zzd((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 39: 
        k = zzame.zze((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 38: 
        k = zzame.zzj((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 37: 
        k = zzame.zzf((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 36: 
        k = zzame.zzc((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0) {
          n = k;
        }
        break;
      case 35: 
        k = zzame.zzd((List)localUnsafe.getObject(paramT, l));
        n = i1;
        if (k > 0)
        {
          n = k;
          k = zzajo.zzg(i5);
          n = i1 + (zzajo.zzh(n) + k + n);
        }
        break;
      case 34: 
        n = zzame.zzh(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 33: 
        n = zzame.zzg(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 30: 
        n = zzame.zzb(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 29: 
        n = zzame.zzi(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 28: 
        n = zzame.zza(i5, (List)localUnsafe.getObject(paramT, l));
        break;
      case 27: 
        n = zzame.zzb(i5, (List)localUnsafe.getObject(paramT, l), zze(i2));
        break;
      case 26: 
        n = zzame.zzb(i5, (List)localUnsafe.getObject(paramT, l));
        break;
      case 25: 
        n = zzame.zza(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 22: 
        n = zzame.zze(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 21: 
        n = zzame.zzj(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 20: 
        n = zzame.zzf(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 19: 
      case 24: 
      case 31: 
        n = zzame.zzc(i5, (List)localUnsafe.getObject(paramT, l), i);
        break;
      case 18: 
      case 23: 
      case 32: 
        n = zzame.zzd(i5, (List)localUnsafe.getObject(paramT, l), i);
        n = i1 + n;
        k = n;
        n = i;
        break;
      case 17: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zza(i5, (zzaln)localUnsafe.getObject(paramT, l), zze(i2));
        }
        break;
      case 16: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zzd(i5, localUnsafe.getLong(paramT, l));
        }
        break;
      case 15: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zze(i5, localUnsafe.getInt(paramT, l));
        }
        break;
      case 14: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zzc(i5, 0L);
        }
        break;
      case 13: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = i1 + zzajo.zzd(i5, 0);
        }
        break;
      case 12: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zza(i5, localUnsafe.getInt(paramT, l));
        }
        break;
      case 11: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          n = zzajo.zzf(i5, localUnsafe.getInt(paramT, l));
        }
        break;
      case 10: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6)) {
          localObject = localUnsafe.getObject(paramT, l);
        }
      case 9: 
      case 8: 
        do
        {
          n = zzajo.zza(i5, (zzaiw)localObject);
          break;
          n = i1;
          if (!zza(paramT, i2, i7, m, i6)) {
            break label2320;
          }
          n = i1 + zzame.zza(i5, localUnsafe.getObject(paramT, l), zze(i2));
          break label2320;
          n = i1;
          if (!zza(paramT, i2, i7, m, i6)) {
            break label2320;
          }
          localObject = localUnsafe.getObject(paramT, l);
        } while ((localObject instanceof zzaiw));
        n = zzajo.zza(i5, (String)localObject);
        break;
      case 7: 
        n = i1;
        if (zza(paramT, i2, i7, m, i6))
        {
          n = zzajo.zza(i5, true);
          n = i1 + n;
        }
      case 6: 
        do
        {
          j = 0;
          k = n;
          n = j;
          break;
          n = i1;
        } while (!zza(paramT, i2, i7, m, i6));
        n = 0;
        j = zzajo.zzb(i5, 0);
        break;
      case 5: 
        i4 = j;
        k = i1;
        n = i4;
        if (!zza(paramT, i2, i7, m, i6)) {
          break label2631;
        }
        j = zzajo.zza(i5, 0L);
        n = i4;
        break;
      case 4: 
        i4 = j;
        k = i1;
        n = i4;
        if (!zza(paramT, i2, i7, m, i6)) {
          break label2631;
        }
        j = zzajo.zzc(i5, localUnsafe.getInt(paramT, l));
        n = i4;
        break;
      case 3: 
        i4 = j;
        k = i1;
        n = i4;
        if (!zza(paramT, i2, i7, m, i6)) {
          break label2631;
        }
        j = zzajo.zze(i5, localUnsafe.getLong(paramT, l));
        n = i4;
        break;
      case 2: 
        i4 = j;
        k = i1;
        n = i4;
        if (!zza(paramT, i2, i7, m, i6)) {
          break label2631;
        }
        j = zzajo.zzb(i5, localUnsafe.getLong(paramT, l));
        n = i4;
        break;
      case 1: 
        i4 = j;
        k = i1;
        n = i4;
        if (!zza(paramT, i2, i7, m, i6)) {
          break label2631;
        }
        j = zzajo.zza(i5, 0.0F);
        n = i4;
        break;
      }
      k = i1;
      n = j;
      if (zza(paramT, i2, i7, m, i6))
      {
        k = zzajo.zza(i5, 0.0D);
        n = j;
        j = k;
        k = i1 + j;
      }
      label2631:
      i2 += 3;
      j = n;
      n = i7;
      i1 = k;
    }
    Object localObject = zzp;
    i1 += ((zzamv)localObject).zza(((zzamv)localObject).zzd(paramT));
    n = i1;
    if (zzh)
    {
      paramT = zzq.zza(paramT);
      k = zza.zzb();
      for (n = j; n < k; n++)
      {
        localObject = zza.zza(n);
        j += zzajy.zza((zzaka)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      }
      localObject = zza.zzc().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramT = (Map.Entry)((Iterator)localObject).next();
        j += zzajy.zza((zzaka)paramT.getKey(), paramT.getValue());
      }
      n = i1 + j;
    }
    return n;
  }
  
  public final int zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzaiv paramzzaiv)
  {
    Object localObject1 = this;
    Object localObject2 = paramT;
    Object localObject3 = paramArrayOfByte;
    int i = paramInt2;
    int j = paramInt3;
    Object localObject4 = paramzzaiv;
    zzf(paramT);
    Object localObject5 = zzb;
    int k = 0;
    int m = k;
    int n = m;
    int i1 = -1;
    int i2 = 1048575;
    while (paramInt1 < i)
    {
      int i3 = paramInt1 + 1;
      paramInt1 = localObject3[paramInt1];
      if (paramInt1 < 0)
      {
        i3 = zzais.zza(paramInt1, (byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
        paramInt1 = zza;
      }
      m = paramInt1 >>> 3;
      int i4 = paramInt1 & 0x7;
      if (m > i1)
      {
        i1 = k / 3;
        if ((m >= zze) && (m <= zzf)) {
          i1 = ((zzalr)localObject1).zza(m, i1);
        } else {
          i1 = -1;
        }
      }
      else
      {
        i1 = ((zzalr)localObject1).zza(m);
      }
      Object localObject6;
      int i5;
      int i8;
      if (i1 == -1)
      {
        localObject6 = localObject5;
        k = n;
        n = i2;
        i5 = 0;
        localObject5 = localObject1;
        i2 = j;
        j = i3;
        i1 = m;
        m = i2;
        localObject3 = localObject4;
        i2 = i5;
        localObject1 = localObject6;
      }
      else
      {
        Object localObject7 = zzc;
        int i6 = localObject7[(i1 + 1)];
        i = (i6 & 0xFF00000) >>> 20;
        long l1 = i6 & 0xFFFFF;
        i5 = 1;
        int i7;
        label1208:
        boolean bool;
        if (i <= 17)
        {
          j = localObject7[(i1 + 2)];
          i7 = 1 << (j >>> 20);
          j &= 0xFFFFF;
          if (j != i2)
          {
            if (i2 != 1048575) {
              ((Unsafe)localObject5).putInt(localObject2, i2, n);
            }
            if (j == 1048575) {
              n = 0;
            } else {
              n = ((Unsafe)localObject5).getInt(localObject2, j);
            }
            i2 = j;
            k = n;
            n = i2;
          }
          else
          {
            k = n;
            n = i2;
          }
          switch (i)
          {
          default: 
          case 17: 
            do
            {
              i2 = i1;
              j = paramInt1;
              break;
            } while (i4 != 3);
            localObject4 = ((zzalr)localObject1).zza(localObject2, i1);
            i8 = zzais.zza(localObject4, ((zzalr)localObject1).zze(i1), paramArrayOfByte, i3, paramInt2, m << 3 | 0x4, paramzzaiv);
            ((zzalr)localObject1).zza(localObject2, i1, localObject4);
            i5 = k | i7;
            j = paramInt3;
            i2 = paramInt1;
            k = i1;
            i3 = n;
            i = paramInt2;
            localObject4 = paramzzaiv;
            paramInt1 = i8;
            i1 = m;
            m = i2;
            n = i5;
            i2 = i3;
            break;
          case 16: 
            localObject4 = paramzzaiv;
            if (i4 == 0)
            {
              i2 = zzais.zzd((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              ((Unsafe)localObject5).putLong(paramT, l1, zzaji.zza(zzb));
              i5 = k | i7;
              i = paramInt2;
              j = paramInt3;
              k = i2;
              i3 = paramInt1;
              i2 = n;
              n = i1;
              paramInt1 = k;
              i1 = m;
              k = n;
              m = i3;
              n = i5;
              continue;
            }
            i2 = i1;
            j = paramInt1;
            break;
          case 15: 
            localObject4 = localObject5;
            localObject6 = paramzzaiv;
            if (i4 == 0)
            {
              i2 = zzais.zzc((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject6);
              ((Unsafe)localObject4).putInt(localObject2, l1, zzaji.zza(zza));
              i5 = k | i7;
              localObject5 = localObject4;
              i = paramInt2;
              j = paramInt3;
              i3 = paramInt1;
              k = i1;
              paramInt1 = i2;
              i2 = i5;
              localObject4 = localObject6;
              i1 = m;
              m = i3;
            }
            break;
          case 12: 
            j = paramInt1;
            localObject4 = localObject5;
            localObject6 = paramzzaiv;
            if (i4 == 0)
            {
              i2 = zzais.zzc((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject6);
              i8 = zza;
              i = i1;
              localObject8 = ((zzalr)localObject1).zzd(i);
              if ((i6 & 0x80000000) != 0) {
                i3 = i5;
              } else {
                i3 = 0;
              }
              if ((i3 != 0) && (localObject8 != null) && (!((zzakk)localObject8).zza(i8)))
              {
                zzc(paramT).zza(j, Long.valueOf(i8));
                i3 = j;
                i8 = i;
                localObject5 = localObject4;
                i = paramInt2;
                j = paramInt3;
                i5 = k;
                i1 = n;
                paramInt1 = i2;
                localObject4 = localObject6;
                k = i8;
                n = i5;
                i2 = i1;
                localObject8 = localObject2;
                break label5445;
              }
              ((Unsafe)localObject4).putInt(localObject2, l1, i8);
            }
            else
            {
              i2 = i1;
              j = paramInt1;
            }
            break;
          case 10: 
            localObject4 = paramzzaiv;
            if (i4 == 2)
            {
              i2 = zzais.zza((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              ((Unsafe)localObject5).putObject(localObject2, l1, zzc);
              k |= i7;
              i5 = paramInt1;
              localObject4 = paramzzaiv;
              i = paramInt2;
              j = paramInt3;
              paramInt1 = i2;
              i2 = k;
              k = i1;
            }
            break;
          case 9: 
            j = i1;
            if (i4 == 2)
            {
              localObject6 = ((zzalr)localObject1).zza(localObject2, j);
              localObject4 = ((zzalr)localObject1).zze(j);
              i2 = zzais.zza(localObject6, (com.google.android.gms.internal.firebase-auth-api.zzamc)localObject4, paramArrayOfByte, i3, paramInt2, paramzzaiv);
              ((zzalr)localObject1).zza(localObject2, j, localObject6);
              i1 = k | i7;
            }
            else
            {
              i2 = i1;
              j = paramInt1;
            }
            break;
          case 8: 
            localObject4 = paramzzaiv;
            if (i4 == 2)
            {
              if (zzg(i6))
              {
                i2 = zzais.zzb((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              }
              else
              {
                i2 = zzais.zzc((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                j = zza;
                if (j < 0) {
                  break label1208;
                }
                if (j == 0)
                {
                  zzc = "";
                }
                else
                {
                  zzc = new String((byte[])localObject3, i2, j, zzaki.zza);
                  i2 += j;
                }
              }
              ((Unsafe)localObject5).putObject(localObject2, l1, zzc);
              break label1378;
              throw zzakm.zzf();
            }
          case 7: 
            localObject4 = paramzzaiv;
            if (i4 == 0)
            {
              i2 = zzais.zzd((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              if (zzb != 0L) {
                bool = true;
              } else {
                bool = false;
              }
              zzana.zzc(localObject2, l1, bool);
            }
            break;
          case 6: 
          case 13: 
            if (i4 == 5)
            {
              ((Unsafe)localObject5).putInt(localObject2, l1, zzais.zzc((byte[])localObject3, i3));
              i2 = i3 + 4;
            }
            break;
          case 5: 
          case 14: 
            if (i4 == 1)
            {
              ((Unsafe)localObject5).putLong(paramT, l1, zzais.zzd((byte[])localObject3, i3));
              i2 = i3 + 8;
              i3 = k | i7;
              localObject4 = paramzzaiv;
              j = i1;
              i1 = i2;
            }
            break;
          case 4: 
          case 11: 
            localObject4 = paramzzaiv;
            if (i4 == 0)
            {
              i2 = zzais.zzc((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              ((Unsafe)localObject5).putInt(localObject2, l1, zza);
              i = k | i7;
              j = i1;
              i1 = i;
            }
            break;
          case 2: 
          case 3: 
            localObject4 = localObject5;
            localObject6 = paramzzaiv;
            if (i4 == 0)
            {
              j = zzais.zzd((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject6);
              ((Unsafe)localObject4).putLong(paramT, l1, zzb);
              i2 = i1;
              i1 = j;
              localObject5 = localObject4;
              i = paramInt2;
              j = paramInt3;
              i5 = paramInt1;
              i3 = n;
              n = k | i7;
              localObject4 = localObject6;
              paramInt1 = i1;
              i1 = m;
              k = i2;
              m = i5;
              i2 = i3;
              continue;
            }
            i2 = i1;
            j = paramInt1;
            break;
          case 1: 
            j = paramInt1;
            i2 = i1;
            if (i4 == 5)
            {
              zzana.zza(localObject2, l1, zzais.zzb((byte[])localObject3, i3));
              i2 = i3 + 4;
            }
            break;
          case 0: 
            label1378:
            j = paramInt1;
            i2 = i1;
            if (i4 == 1)
            {
              zzana.zza(localObject2, l1, zzais.zza((byte[])localObject3, i3));
              i2 = i3 + 8;
              i = k | i7;
              j = i1;
              i1 = i;
              localObject4 = paramzzaiv;
              i3 = i1;
              i1 = i2;
              i = paramInt2;
              i2 = paramInt3;
              i5 = paramInt1;
              k = j;
              j = i2;
              i2 = i3;
              paramInt1 = i1;
              i1 = m;
              m = i5;
              i3 = n;
              n = i2;
              i2 = i3;
              continue;
            }
            localObject3 = paramzzaiv;
            localObject4 = localObject5;
            i = paramInt2;
            paramInt1 = j;
            i1 = m;
            localObject5 = localObject1;
            m = paramInt3;
            j = i3;
            localObject1 = localObject4;
            break;
          }
        }
        j = paramInt2;
        k = n;
        if (i == 27)
        {
          if (i4 == 2)
          {
            localObject6 = (zzakn)((Unsafe)localObject5).getObject(localObject2, l1);
            localObject4 = localObject6;
            if (!((zzakn)localObject6).zzc())
            {
              n = ((List)localObject6).size();
              if (n == 0) {
                n = 10;
              } else {
                n <<= 1;
              }
              localObject4 = ((zzakn)localObject6).zza(n);
              ((Unsafe)localObject5).putObject(localObject2, l1, localObject4);
            }
            i8 = zzais.zzb(((zzalr)localObject1).zze(i1), paramInt1, paramArrayOfByte, i3, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject4, paramzzaiv);
            n = i1;
            i3 = paramInt1;
            i5 = k;
            paramInt1 = paramInt3;
            localObject4 = paramzzaiv;
            i = j;
            j = paramInt1;
            paramInt1 = i8;
            i1 = m;
            k = n;
            m = i3;
            n = i5;
            continue;
          }
        }
        else
        {
          i5 = i2;
          label2520:
          label2643:
          label2889:
          label2893:
          label3245:
          label3505:
          label3509:
          label3513:
          label4317:
          label4335:
          Object localObject9;
          if (i <= 49)
          {
            l2 = i6;
            localObject4 = zzb;
            localObject6 = (zzakn)((Unsafe)localObject4).getObject(localObject2, l1);
            if (!((zzakn)localObject6).zzc())
            {
              localObject6 = ((zzakn)localObject6).zza(((List)localObject6).size() << 1);
              ((Unsafe)localObject4).putObject(localObject2, l1, localObject6);
            }
            n = i3;
            switch (i)
            {
            default: 
            case 49: 
              do
              {
                localObject2 = paramzzaiv;
                localObject4 = localObject5;
                i2 = n;
                n = j;
                j = i2;
                localObject5 = localObject2;
                i2 = paramInt1;
                break;
              } while (i4 != 3);
              i2 = zzais.zza(((zzalr)localObject1).zze(i1), paramInt1, paramArrayOfByte, n, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, paramzzaiv);
              break;
            case 34: 
            case 48: 
              localObject4 = paramzzaiv;
              i2 = n;
              if (i4 == 2)
              {
                localObject2 = (zzaky)localObject6;
                i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                j = zza + i2;
                while (i2 < j)
                {
                  i2 = zzais.zzd((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                  ((zzaky)localObject2).zza(zzaji.zza(zzb));
                }
                if (i2 != j) {
                  throw zzakm.zzj();
                }
              }
              else
              {
                if (i4 != 0) {
                  break label2520;
                }
                localObject2 = (zzaky)localObject6;
                for (i = zzais.zzd((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);; i = zzais.zzd((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4))
                {
                  ((zzaky)localObject2).zza(zzaji.zza(zzb));
                  i2 = i;
                  if (i >= j) {
                    break;
                  }
                  i3 = zzais.zzc((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                  i2 = i;
                  if (paramInt1 != zza) {
                    break;
                  }
                }
              }
            case 33: 
            case 47: 
              localObject4 = paramzzaiv;
              i2 = n;
              if (i4 == 2)
              {
                localObject2 = (zzakj)localObject6;
                i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                j = zza + i2;
                while (i2 < j)
                {
                  i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                  ((zzakj)localObject2).zzc(zzaji.zza(zza));
                }
                if (i2 != j) {
                  throw zzakm.zzj();
                }
              }
              else
              {
                if (i4 != 0) {
                  break label2520;
                }
                localObject2 = (zzakj)localObject6;
                for (i = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);; i = zzais.zzc((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4))
                {
                  ((zzakj)localObject2).zzc(zzaji.zza(zza));
                  i2 = i;
                  if (i >= j) {
                    break;
                  }
                  i3 = zzais.zzc((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                  i2 = i;
                  if (paramInt1 != zza) {
                    break;
                  }
                }
              }
              i = paramInt1;
              localObject2 = paramzzaiv;
              paramInt1 = i2;
              localObject4 = localObject1;
              j = n;
              localObject1 = localObject2;
              break label4335;
              j = n;
              i2 = paramInt1;
              break;
            case 30: 
            case 44: 
              localObject4 = localObject5;
              if (i4 == 2)
              {
                i2 = zzais.zza((byte[])localObject3, n, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, paramzzaiv);
              }
              else
              {
                if (i4 != 0) {
                  break label2643;
                }
                i2 = zzais.zza(paramInt1, paramArrayOfByte, n, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, paramzzaiv);
              }
              zzame.zza(paramT, m, (List)localObject6, ((zzalr)localObject1).zzd(i1), null, zzp);
              localObject2 = localObject1;
              i = paramInt1;
              localObject4 = localObject5;
              j = paramInt2;
              i3 = n;
              localObject5 = paramzzaiv;
              paramInt1 = i2;
              n = j;
              j = i3;
              localObject6 = localObject3;
              i2 = i;
              break label5328;
              i2 = paramInt1;
              j = n;
              localObject4 = paramzzaiv;
              break;
            case 28: 
              localObject7 = paramzzaiv;
              if (i4 == 2)
              {
                i3 = zzais.zzc((byte[])localObject3, n, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject7);
                i8 = zza;
                if (i8 >= 0)
                {
                  if (i8 <= localObject3.length - i3)
                  {
                    i2 = i3;
                    i = i8;
                    localObject8 = localObject1;
                    localObject2 = localObject3;
                    if (i8 == 0) {
                      localObject4 = localObject3;
                    }
                    for (i = i3;; i = i3)
                    {
                      ((List)localObject6).add(zzaiw.zza);
                      do
                      {
                        ((List)localObject6).add(zzaiw.zza((byte[])localObject2, i2, i));
                        i = i2 + i;
                        localObject4 = localObject2;
                        localObject1 = localObject8;
                        i2 = i;
                        localObject2 = localObject1;
                        localObject3 = localObject4;
                        if (i >= j) {
                          break;
                        }
                        i3 = zzais.zzc((byte[])localObject4, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject7);
                        i2 = i;
                        localObject2 = localObject1;
                        localObject3 = localObject4;
                        if (paramInt1 != zza) {
                          break;
                        }
                        i3 = zzais.zzc((byte[])localObject4, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject7);
                        i8 = zza;
                        if (i8 < 0) {
                          break label2893;
                        }
                        if (i8 > localObject4.length - i3) {
                          break label2889;
                        }
                        i2 = i3;
                        i = i8;
                        localObject8 = localObject1;
                        localObject2 = localObject4;
                      } while (i8 != 0);
                    }
                    throw zzakm.zzj();
                    throw zzakm.zzf();
                  }
                  throw zzakm.zzj();
                }
                throw zzakm.zzf();
              }
            case 27: 
              j = i1;
              i2 = n;
              if (i4 == 2)
              {
                i2 = zzais.zzb(((zzalr)localObject1).zze(j), paramInt1, paramArrayOfByte, i2, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, paramzzaiv);
                i = paramInt1;
                localObject4 = localObject5;
                localObject5 = paramzzaiv;
                j = n;
                paramInt1 = i2;
                n = paramInt2;
                localObject2 = localObject1;
                localObject6 = localObject3;
                i2 = i;
                break label5328;
              }
              localObject4 = localObject5;
              i2 = paramInt2;
              j = n;
              localObject5 = paramzzaiv;
              n = i2;
              i2 = paramInt1;
              break;
            case 26: 
              localObject8 = paramzzaiv;
              i3 = paramInt1;
              i2 = n;
              if (i4 == 2)
              {
                if ((l2 & 0x20000000) == 0L)
                {
                  i = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                  i2 = zza;
                  if (i2 >= 0)
                  {
                    if (i2 == 0)
                    {
                      localObject4 = localObject3;
                      localObject3 = localObject1;
                      ((List)localObject6).add("");
                      localObject1 = localObject4;
                    }
                    else
                    {
                      localObject4 = new String((byte[])localObject3, i, i2, zzaki.zza);
                      localObject2 = localObject3;
                      localObject3 = localObject1;
                    }
                    for (;;)
                    {
                      ((List)localObject6).add(localObject4);
                      i += i2;
                      localObject1 = localObject2;
                      i2 = i;
                      localObject4 = localObject3;
                      localObject2 = localObject1;
                      if (i >= j) {
                        break label4317;
                      }
                      i8 = zzais.zzc((byte[])localObject1, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                      i2 = i;
                      localObject4 = localObject3;
                      localObject2 = localObject1;
                      if (i3 != zza) {
                        break label4317;
                      }
                      i = zzais.zzc((byte[])localObject1, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                      i2 = zza;
                      if (i2 < 0) {
                        break label3245;
                      }
                      if (i2 == 0)
                      {
                        localObject4 = localObject1;
                        break;
                      }
                      localObject4 = new String((byte[])localObject1, i, i2, zzaki.zza);
                      localObject2 = localObject1;
                    }
                    throw zzakm.zzf();
                  }
                  throw zzakm.zzf();
                }
                i = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                i8 = zza;
                if (i8 >= 0)
                {
                  if (i8 == 0)
                  {
                    localObject4 = localObject3;
                    localObject3 = localObject1;
                    ((List)localObject6).add("");
                    localObject1 = localObject4;
                  }
                  else
                  {
                    i2 = i + i8;
                    if (!zzanb.zzc((byte[])localObject3, i, i2)) {
                      break label3513;
                    }
                    localObject4 = new String((byte[])localObject3, i, i8, zzaki.zza);
                    localObject2 = localObject1;
                  }
                  for (;;)
                  {
                    ((List)localObject6).add(localObject4);
                    localObject1 = localObject3;
                    localObject3 = localObject2;
                    i = i2;
                    i2 = i;
                    localObject4 = localObject3;
                    localObject2 = localObject1;
                    if (i >= j) {
                      break label4317;
                    }
                    i8 = zzais.zzc((byte[])localObject1, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                    i2 = i;
                    localObject4 = localObject3;
                    localObject2 = localObject1;
                    if (i3 != zza) {
                      break label4317;
                    }
                    i = zzais.zzc((byte[])localObject1, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                    i8 = zza;
                    if (i8 < 0) {
                      break label3509;
                    }
                    if (i8 == 0)
                    {
                      localObject4 = localObject1;
                      break;
                    }
                    i2 = i + i8;
                    if (!zzanb.zzc((byte[])localObject1, i, i2)) {
                      break label3505;
                    }
                    localObject4 = new String((byte[])localObject1, i, i8, zzaki.zza);
                    localObject2 = localObject3;
                    localObject3 = localObject1;
                  }
                  throw zzakm.zzd();
                  throw zzakm.zzf();
                  throw zzakm.zzd();
                }
                throw zzakm.zzf();
              }
            case 25: 
            case 42: 
            case 24: 
            case 31: 
            case 41: 
            case 45: 
            case 23: 
            case 32: 
            case 40: 
            case 46: 
            case 22: 
            case 29: 
            case 39: 
            case 43: 
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      localObject4 = paramzzaiv;
                      i2 = paramInt1;
                      j = n;
                      n = paramInt2;
                      localObject2 = localObject5;
                      localObject5 = localObject4;
                      localObject4 = localObject2;
                      break label5317;
                      localObject8 = paramzzaiv;
                      i2 = n;
                      if (i4 == 2)
                      {
                        localObject4 = (zzaiu)localObject6;
                        i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                        j = zza + i2;
                        while (i2 < j)
                        {
                          i2 = zzais.zzd((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                          if (zzb != 0L) {
                            bool = true;
                          } else {
                            bool = false;
                          }
                          ((zzaiu)localObject4).zza(bool);
                        }
                        if (i2 == j)
                        {
                          localObject4 = localObject1;
                          localObject2 = localObject3;
                          break;
                        }
                        throw zzakm.zzj();
                      }
                    } while (i4 != 0);
                    localObject6 = (zzaiu)localObject6;
                    i = zzais.zzd((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                    i2 = i;
                    localObject4 = localObject1;
                    localObject2 = localObject3;
                    if (zzb != 0L) {}
                    for (;;)
                    {
                      bool = true;
                      do
                      {
                        bool = false;
                        localObject3 = localObject2;
                        localObject1 = localObject4;
                        i = i2;
                        ((zzaiu)localObject6).zza(bool);
                        i2 = i;
                        localObject4 = localObject1;
                        localObject2 = localObject3;
                        if (i >= j) {
                          break;
                        }
                        i3 = zzais.zzc((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                        i2 = i;
                        localObject4 = localObject1;
                        localObject2 = localObject3;
                        if (paramInt1 != zza) {
                          break;
                        }
                        i = zzais.zzd((byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                        i2 = i;
                        localObject4 = localObject1;
                        localObject2 = localObject3;
                      } while (zzb == 0L);
                    }
                    localObject8 = paramzzaiv;
                    i2 = n;
                    if (i4 == 2)
                    {
                      localObject4 = (zzakj)localObject6;
                      i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                      i3 = zza;
                      j = i2 + i3;
                      if (j <= localObject3.length)
                      {
                        i = ((zzakj)localObject4).size();
                        ((zzakj)localObject4).zzd(i3 / 4 + i);
                        while (i2 < j)
                        {
                          ((zzakj)localObject4).zzc(zzais.zzc((byte[])localObject3, i2));
                          i2 += 4;
                        }
                        if (i2 == j)
                        {
                          localObject4 = localObject1;
                          localObject2 = localObject3;
                          break;
                        }
                        throw zzakm.zzj();
                      }
                      throw zzakm.zzj();
                    }
                  } while (i4 != 5);
                  localObject6 = (zzakj)localObject6;
                  ((zzakj)localObject6).zzc(zzais.zzc((byte[])localObject3, i2));
                  for (i = i2 + 4;; i = i3 + 4)
                  {
                    i2 = i;
                    localObject4 = localObject1;
                    localObject2 = localObject3;
                    if (i >= j) {
                      break;
                    }
                    i3 = zzais.zzc((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                    i2 = i;
                    localObject4 = localObject1;
                    localObject2 = localObject3;
                    if (paramInt1 != zza) {
                      break;
                    }
                    ((zzakj)localObject6).zzc(zzais.zzc((byte[])localObject3, i3));
                  }
                  localObject8 = paramzzaiv;
                  i2 = n;
                  if (i4 == 2)
                  {
                    localObject4 = (zzaky)localObject6;
                    i2 = zzais.zzc((byte[])localObject3, i2, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                    i = zza;
                    j = i2 + i;
                    if (j <= localObject3.length)
                    {
                      i3 = ((zzaky)localObject4).size();
                      ((zzaky)localObject4).zzc(i / 8 + i3);
                      while (i2 < j)
                      {
                        ((zzaky)localObject4).zza(zzais.zzd((byte[])localObject3, i2));
                        i2 += 8;
                      }
                      if (i2 == j)
                      {
                        localObject4 = localObject1;
                        localObject2 = localObject3;
                        break;
                      }
                      throw zzakm.zzj();
                    }
                    throw zzakm.zzj();
                  }
                } while (i4 != 1);
                localObject6 = (zzaky)localObject6;
                ((zzaky)localObject6).zza(zzais.zzd((byte[])localObject3, i2));
                for (i = i2 + 8;; i = i3 + 8)
                {
                  i2 = i;
                  localObject4 = localObject1;
                  localObject2 = localObject3;
                  if (i >= j) {
                    break;
                  }
                  i3 = zzais.zzc((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                  i2 = i;
                  localObject4 = localObject1;
                  localObject2 = localObject3;
                  if (paramInt1 != zza) {
                    break;
                  }
                  ((zzaky)localObject6).zza(zzais.zzd((byte[])localObject3, i3));
                }
                localObject8 = paramzzaiv;
                i2 = paramInt1;
                i = n;
                if (i4 == 2)
                {
                  i2 = zzais.zza((byte[])localObject3, i, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                  localObject2 = localObject3;
                  localObject4 = localObject1;
                  localObject1 = paramzzaiv;
                  i = paramInt1;
                  localObject3 = localObject2;
                  j = n;
                  paramInt1 = i2;
                  n = paramInt2;
                  localObject6 = localObject5;
                  localObject2 = localObject4;
                  localObject5 = localObject1;
                  localObject4 = localObject6;
                  localObject6 = localObject3;
                  i2 = i;
                  break label5328;
                }
              } while (i4 != 0);
              n = j;
              localObject4 = localObject5;
              paramInt1 = zzais.zza(i2, paramArrayOfByte, i, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzakn)localObject6, paramzzaiv);
              localObject2 = localObject1;
              j = i;
              localObject5 = localObject8;
              localObject6 = localObject3;
              break;
            case 20: 
            case 21: 
            case 37: 
            case 38: 
              i = j;
              localObject8 = paramzzaiv;
              i3 = paramInt1;
              localObject7 = localObject5;
              i8 = n;
              if (i4 == 2)
              {
                localObject5 = (zzaky)localObject6;
                paramInt1 = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                n = zza + paramInt1;
                while (paramInt1 < n)
                {
                  paramInt1 = zzais.zzd((byte[])localObject3, paramInt1, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                  ((zzaky)localObject5).zza(zzb);
                }
                if (paramInt1 == n)
                {
                  localObject2 = localObject1;
                  n = i;
                  j = i8;
                  localObject5 = localObject8;
                  localObject4 = localObject7;
                  localObject6 = localObject3;
                  i2 = i3;
                  break label5328;
                }
                throw zzakm.zzj();
              }
              n = i;
              j = i8;
              localObject5 = localObject8;
              localObject4 = localObject7;
              i2 = i3;
              if (i4 != 0) {
                break label5317;
              }
              localObject9 = (zzaky)localObject6;
              for (i4 = zzais.zzd((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);; i4 = zzais.zzd((byte[])localObject3, i7, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8))
              {
                ((zzaky)localObject9).zza(zzb);
                paramInt1 = i4;
                localObject2 = localObject1;
                n = i;
                j = i8;
                localObject5 = localObject8;
                localObject4 = localObject7;
                localObject6 = localObject3;
                i2 = i3;
                if (i4 >= i) {
                  break;
                }
                i7 = zzais.zzc((byte[])localObject3, i4, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                paramInt1 = i4;
                localObject2 = localObject1;
                n = i;
                j = i8;
                localObject5 = localObject8;
                localObject4 = localObject7;
                localObject6 = localObject3;
                i2 = i3;
                if (i3 != zza) {
                  break;
                }
              }
            case 19: 
            case 36: 
              i = j;
              localObject8 = paramzzaiv;
              i3 = paramInt1;
              localObject7 = localObject5;
              i8 = n;
              if (i4 == 2)
              {
                localObject5 = (zzake)localObject6;
                paramInt1 = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                j = zza;
                n = paramInt1 + j;
                if (n <= localObject3.length)
                {
                  i2 = ((zzake)localObject5).size();
                  ((zzake)localObject5).zzc(j / 4 + i2);
                  while (paramInt1 < n)
                  {
                    ((zzake)localObject5).zza(zzais.zzb((byte[])localObject3, paramInt1));
                    paramInt1 += 4;
                  }
                  if (paramInt1 == n)
                  {
                    localObject2 = localObject1;
                    n = i;
                    j = i8;
                    localObject5 = localObject8;
                    localObject4 = localObject7;
                    localObject6 = localObject3;
                    i2 = i3;
                    break label5328;
                  }
                  throw zzakm.zzj();
                }
                throw zzakm.zzj();
              }
              n = i;
              j = i8;
              localObject5 = localObject8;
              localObject4 = localObject7;
              i2 = i3;
              if (i4 != 5) {
                break label5317;
              }
              localObject9 = (zzake)localObject6;
              ((zzake)localObject9).zza(zzais.zzb((byte[])localObject3, i8));
              for (i4 = i8 + 4;; i4 = i7 + 4)
              {
                paramInt1 = i4;
                localObject2 = localObject1;
                n = i;
                j = i8;
                localObject5 = localObject8;
                localObject4 = localObject7;
                localObject6 = localObject3;
                i2 = i3;
                if (i4 >= i) {
                  break;
                }
                i7 = zzais.zzc((byte[])localObject3, i4, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                paramInt1 = i4;
                localObject2 = localObject1;
                n = i;
                j = i8;
                localObject5 = localObject8;
                localObject4 = localObject7;
                localObject6 = localObject3;
                i2 = i3;
                if (i3 != zza) {
                  break;
                }
                ((zzake)localObject9).zza(zzais.zzb((byte[])localObject3, i7));
              }
            }
            i = j;
            localObject8 = paramzzaiv;
            i3 = paramInt1;
            localObject7 = localObject5;
            i8 = n;
            if (i4 == 2)
            {
              localObject5 = (zzajt)localObject6;
              paramInt1 = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
              i2 = zza;
              n = paramInt1 + i2;
              if (n <= localObject3.length)
              {
                j = ((zzajt)localObject5).size();
                ((zzajt)localObject5).zzc(i2 / 8 + j);
                while (paramInt1 < n)
                {
                  ((zzajt)localObject5).zza(zzais.zza((byte[])localObject3, paramInt1));
                  paramInt1 += 8;
                }
                if (paramInt1 == n)
                {
                  localObject2 = localObject1;
                  n = i;
                  j = i8;
                  localObject5 = localObject8;
                  localObject4 = localObject7;
                  localObject6 = localObject3;
                  i2 = i3;
                }
                else
                {
                  throw zzakm.zzj();
                }
              }
              else
              {
                throw zzakm.zzj();
              }
            }
            else
            {
              n = i;
              j = i8;
              localObject5 = localObject8;
              localObject4 = localObject7;
              i2 = i3;
              if (i4 == 1)
              {
                localObject9 = (zzajt)localObject6;
                ((zzajt)localObject9).zza(zzais.zza((byte[])localObject3, i8));
                for (i4 = i8 + 8;; i4 = i7 + 8)
                {
                  paramInt1 = i4;
                  localObject2 = localObject1;
                  n = i;
                  j = i8;
                  localObject5 = localObject8;
                  localObject4 = localObject7;
                  localObject6 = localObject3;
                  i2 = i3;
                  if (i4 >= i) {
                    break;
                  }
                  i7 = zzais.zzc((byte[])localObject3, i4, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject8);
                  paramInt1 = i4;
                  localObject2 = localObject1;
                  n = i;
                  j = i8;
                  localObject5 = localObject8;
                  localObject4 = localObject7;
                  localObject6 = localObject3;
                  i2 = i3;
                  if (i3 != zza) {
                    break;
                  }
                  ((zzajt)localObject9).zza(zzais.zza((byte[])localObject3, i7));
                }
              }
              label5317:
              paramInt1 = j;
              localObject6 = localObject3;
              localObject2 = localObject1;
            }
            label5328:
            i = paramInt3;
            if (paramInt1 == j)
            {
              j = paramInt1;
              i3 = n;
              n = i1;
              localObject1 = localObject4;
              paramInt1 = i2;
              i1 = m;
              localObject4 = paramT;
              m = i;
              i = i3;
              localObject3 = localObject5;
              localObject5 = localObject2;
              localObject2 = localObject4;
              i2 = n;
              n = i5;
              break label7252;
            }
            i8 = n;
            localObject7 = localObject5;
            j = i;
            localObject5 = localObject4;
            i3 = i2;
            n = k;
            i2 = i5;
            localObject8 = paramT;
            localObject3 = localObject6;
            k = i1;
            localObject1 = localObject2;
            i = i8;
            localObject4 = localObject7;
            label5445:
            i1 = m;
            m = i3;
            localObject2 = localObject8;
            continue;
          }
          localObject6 = localObject5;
          i8 = i3;
          localObject4 = paramzzaiv;
          n = i1;
          if (i != 50) {
            break label6037;
          }
          if (i4 == 2)
          {
            localObject9 = zzb;
            localObject7 = ((zzalr)localObject1).zzf(n);
            localObject2 = paramT;
            localObject8 = ((Unsafe)localObject9).getObject(localObject2, l1);
            localObject5 = localObject8;
            if (zzr.zzf(localObject8))
            {
              localObject5 = zzr.zzb(localObject7);
              zzr.zza(localObject5, localObject8);
              ((Unsafe)localObject9).putObject(localObject2, l1, localObject5);
            }
            localObject7 = zzr.zza(localObject7);
            localObject9 = zzr.zze(localObject5);
            i2 = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
            i1 = zza;
            if ((i1 >= 0) && (i1 <= j - i2))
            {
              i = i2 + i1;
              localObject5 = zzb;
              localObject8 = zzd;
              localObject1 = localObject6;
              i1 = paramInt1;
              paramInt1 = i;
              localObject6 = localObject5;
              localObject5 = localObject8;
              label5863:
              while (i2 < paramInt1)
              {
                i3 = i2 + 1;
                i4 = localObject3[i2];
                i = i4;
                i2 = i3;
                if (i4 < 0)
                {
                  i2 = zzais.zza(i4, (byte[])localObject3, i3, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
                  i = zza;
                }
                i4 = i >>> 3;
                i3 = i & 0x7;
                if (i4 != 1)
                {
                  if (i4 == 2) {
                    if (i3 == zzc.zza())
                    {
                      i2 = zza(paramArrayOfByte, i2, paramInt2, zzc, zzd.getClass(), paramzzaiv);
                      localObject5 = zzc;
                      break label5863;
                    }
                  }
                }
                else if (i3 == zza.zza())
                {
                  i2 = zza(paramArrayOfByte, i2, paramInt2, zza, null, paramzzaiv);
                  localObject6 = zzc;
                  break label5863;
                }
                i2 = zzais.zza(i, (byte[])localObject3, i2, j, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
              }
              if (i2 == paramInt1)
              {
                ((Map)localObject9).put(localObject6, localObject5);
                if (paramInt1 == i8)
                {
                  i2 = paramInt1;
                  i = j;
                  paramInt1 = i1;
                  i1 = m;
                  localObject5 = this;
                  m = paramInt3;
                  j = i2;
                  localObject3 = localObject4;
                  i2 = n;
                  n = i5;
                  break label7252;
                }
                i3 = paramInt3;
                i2 = i1;
                i8 = k;
                localObject5 = localObject1;
                localObject1 = this;
                i = j;
                j = i3;
                i1 = m;
                k = n;
                m = i2;
                n = i8;
                i2 = i5;
                continue;
              }
              throw zzakm.zzg();
            }
            throw zzakm.zzj();
          }
          localObject2 = paramT;
        }
        localObject1 = localObject5;
        n = i2;
        i2 = paramInt3;
        i = paramInt2;
        j = i3;
        localObject3 = paramzzaiv;
        i3 = i1;
        localObject5 = this;
        i1 = m;
        m = i2;
        i2 = i3;
        break label7252;
        label6037:
        localObject2 = localObject6;
        localObject6 = paramT;
        Object localObject8 = zzb;
        long l2 = localObject7[(n + 2)] & 0xFFFFF;
        switch (i)
        {
        default: 
        case 68: 
          for (;;)
          {
            localObject5 = localObject4;
            i2 = n;
            localObject1 = this;
            n = m;
            break;
            if (i4 == 3)
            {
              localObject5 = zza(localObject6, m, n);
              i1 = zzais.zza(localObject5, zze(n), paramArrayOfByte, i8, paramInt2, paramInt1 & 0xFFFFFFF8 | 0x4, paramzzaiv);
              zza(localObject6, m, n, localObject5);
              localObject5 = this;
              i2 = paramInt1;
              paramInt1 = i1;
              i1 = m;
              localObject3 = localObject4;
              localObject4 = localObject5;
              m = i2;
              i2 = n;
              break label7208;
            }
          }
        case 67: 
          if (i4 == 0)
          {
            n = zzais.zzd((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
            localObject5 = Long.valueOf(zzaji.zza(zzb));
          }
          else
          {
            localObject5 = localObject4;
            i2 = n;
            localObject1 = this;
            n = m;
          }
          break;
        case 66: 
          if (i4 == 0)
          {
            n = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
            localObject5 = Integer.valueOf(zzaji.zza(zza));
            i2 = paramInt1;
            ((Unsafe)localObject8).putObject(localObject6, l1, localObject5);
            ((Unsafe)localObject8).putInt(localObject6, l2, m);
            localObject3 = paramzzaiv;
            j = i1;
            localObject4 = this;
            paramInt1 = n;
            i1 = m;
            m = i2;
            i2 = j;
          }
          break;
        case 63: 
          j = paramInt1;
          if (i4 == 0)
          {
            i2 = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
            i = zza;
            localObject5 = zzd(n);
            if ((localObject5 != null) && (!((zzakk)localObject5).zza(i)))
            {
              zzc(paramT).zza(j, Long.valueOf(i));
              n = i2;
              break label6548;
            }
            localObject5 = Integer.valueOf(i);
            n = i2;
          }
          else
          {
            localObject5 = paramzzaiv;
            localObject1 = this;
            n = m;
            i2 = i1;
          }
          break;
        case 61: 
          if (i4 == 2)
          {
            n = zzais.zza((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
            localObject5 = zzc;
            ((Unsafe)localObject8).putObject(localObject6, l1, localObject5);
            ((Unsafe)localObject8).putInt(localObject6, l2, m);
            localObject3 = paramzzaiv;
            i2 = i1;
            j = paramInt1;
            localObject4 = this;
            paramInt1 = n;
            i1 = m;
            m = j;
            break label7208;
          }
          localObject5 = localObject4;
          i2 = n;
          localObject1 = this;
          n = m;
          break;
        case 60: 
          if (i4 == 2)
          {
            localObject5 = zza(localObject6, m, n);
            localObject1 = zze(n);
            localObject3 = localObject4;
            i2 = paramInt1;
            localObject4 = this;
            paramInt1 = zzais.zza(localObject5, (com.google.android.gms.internal.firebase-auth-api.zzamc)localObject1, paramArrayOfByte, i8, paramInt2, paramzzaiv);
            ((zzalr)localObject4).zza(localObject6, m, n, localObject5);
            i1 = m;
            m = i2;
            i2 = n;
            break label7208;
          }
          localObject5 = localObject4;
          localObject1 = this;
          i2 = n;
          n = m;
          break;
        case 59: 
          i2 = n;
          n = m;
          localObject1 = this;
          localObject5 = localObject4;
          if (i4 != 2) {
            break label7190;
          }
          n = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
          i2 = zza;
          if (i2 == 0)
          {
            ((Unsafe)localObject8).putObject(localObject6, l1, "");
          }
          else
          {
            if (((i6 & 0x20000000) != 0) && (!zzanb.zzc((byte[])localObject3, n, n + i2))) {
              throw zzakm.zzd();
            }
            ((Unsafe)localObject8).putObject(localObject6, l1, new String((byte[])localObject3, n, i2, zzaki.zza));
            n += i2;
          }
          break;
        case 58: 
          i2 = n;
          n = m;
          localObject1 = this;
          localObject5 = localObject4;
          if (i4 != 0) {
            break label7190;
          }
          n = zzais.zzd((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
          if (zzb != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          localObject5 = Boolean.valueOf(bool);
          break;
        case 57: 
        case 64: 
          localObject5 = localObject4;
          i2 = n;
          n = m;
          localObject1 = this;
          if (i4 != 5) {
            break label7190;
          }
          localObject5 = Integer.valueOf(zzais.zzc((byte[])localObject3, i8));
          break;
        case 56: 
        case 65: 
          localObject5 = localObject4;
          i2 = n;
          n = m;
          localObject1 = this;
          if (i4 != 1) {
            break label7190;
          }
          localObject5 = Long.valueOf(zzais.zzd((byte[])localObject3, i8));
          break;
        case 55: 
        case 62: 
          i2 = n;
          n = m;
          localObject1 = this;
          localObject5 = localObject4;
          if (i4 != 0) {
            break label7190;
          }
          n = zzais.zzc((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
          localObject5 = Integer.valueOf(zza);
          break;
        case 53: 
        case 54: 
          i2 = n;
          n = m;
          localObject1 = this;
          localObject5 = localObject4;
          if (i4 != 0) {
            break label7190;
          }
          n = zzais.zzd((byte[])localObject3, i8, (com.google.android.gms.internal.firebase-auth-api.zzaiv)localObject4);
          localObject5 = Long.valueOf(zzb);
          ((Unsafe)localObject8).putObject(localObject6, l1, localObject5);
          break;
        case 52: 
          label6548:
          localObject5 = localObject4;
          i2 = n;
          n = m;
          localObject1 = this;
          if (i4 != 5) {
            break label7190;
          }
          localObject5 = Float.valueOf(zzais.zzb((byte[])localObject3, i8));
          ((Unsafe)localObject8).putObject(localObject6, l1, localObject5);
          n = i3 + 4;
          break;
        }
        localObject5 = localObject4;
        i2 = n;
        n = m;
        localObject1 = this;
        if (i4 == 1)
        {
          localObject5 = Double.valueOf(zzais.zza((byte[])localObject3, i8));
          ((Unsafe)localObject8).putObject(localObject6, l1, localObject5);
          n = i3 + 8;
          i2 = i1;
          j = paramInt1;
          localObject4 = this;
          localObject3 = paramzzaiv;
          ((Unsafe)localObject8).putInt(localObject6, l2, m);
          paramInt1 = n;
          i1 = m;
          m = j;
        }
        else
        {
          label7190:
          m = paramInt1;
          paramInt1 = i3;
          localObject4 = localObject1;
          localObject3 = localObject5;
          i1 = n;
        }
        label7208:
        i = paramInt2;
        if (paramInt1 != i3) {
          break label7479;
        }
        j = paramInt3;
        i3 = m;
        localObject1 = localObject2;
        n = i5;
        localObject2 = localObject6;
        localObject5 = localObject4;
        m = j;
        j = paramInt1;
        paramInt1 = i3;
      }
      label7252:
      if ((paramInt1 == m) && (m != 0))
      {
        paramInt2 = paramInt1;
        paramInt1 = j;
        paramInt3 = i;
        i1 = k;
        i2 = n;
        break label7520;
      }
      if ((zzh) && (zzd != zzajv.zza))
      {
        i4 = zzais.zza(paramInt1, paramArrayOfByte, j, paramInt2, paramT, zzg, zzp, paramzzaiv);
        localObject3 = paramArrayOfByte;
        localObject4 = paramzzaiv;
        i3 = paramInt1;
        i8 = i2;
        i2 = k;
        i5 = n;
        localObject6 = localObject5;
        localObject5 = localObject1;
        j = m;
        localObject1 = localObject6;
        paramInt1 = i4;
        k = i8;
        m = i3;
        n = i2;
        i2 = i5;
      }
      else
      {
        localObject4 = zzc(paramT);
        i3 = zzais.zza(paramInt1, paramArrayOfByte, j, paramInt2, (com.google.android.gms.internal.firebase-auth-api.zzamy)localObject4, paramzzaiv);
        j = m;
        m = paramInt1;
        localObject6 = localObject2;
        localObject4 = localObject5;
        paramInt1 = i3;
        for (;;)
        {
          localObject3 = paramArrayOfByte;
          localObject5 = paramzzaiv;
          localObject2 = localObject4;
          i5 = i2;
          i3 = k;
          i2 = n;
          localObject4 = localObject5;
          localObject5 = localObject1;
          localObject1 = localObject2;
          k = i5;
          n = i3;
          localObject2 = localObject6;
          break;
          label7479:
          j = paramInt3;
          n = i5;
          localObject1 = localObject2;
        }
      }
    }
    paramArrayOfByte = (byte[])localObject5;
    paramInt3 = i;
    localObject5 = localObject1;
    localObject1 = paramArrayOfByte;
    i1 = n;
    paramInt2 = m;
    m = j;
    label7520:
    if (i2 != 1048575) {
      ((Unsafe)localObject1).putInt(localObject2, i2, i1);
    }
    i1 = zzl;
    paramArrayOfByte = null;
    while (i1 < zzm)
    {
      paramArrayOfByte = (zzamy)zza(paramT, zzk[i1], paramArrayOfByte, zzp, paramT);
      i1++;
    }
    if (paramArrayOfByte != null) {
      zzp.zzb(localObject2, paramArrayOfByte);
    }
    if (m == 0)
    {
      if (paramInt1 != paramInt3) {
        throw zzakm.zzg();
      }
    }
    else {
      if ((paramInt1 > paramInt3) || (paramInt2 != m)) {
        break label7637;
      }
    }
    return paramInt1;
    label7637:
    throw zzakm.zzg();
  }
  
  public final T zza()
  {
    return (T)zzn.zza(zzg);
  }
  
  /* Error */
  public final void zza(T paramT, zzamd paramzzamd, zzajv paramzzajv)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore 4
    //   3: aload_3
    //   4: astore 5
    //   6: aload_3
    //   7: invokevirtual 229	java/lang/Object:getClass	()Ljava/lang/Class;
    //   10: pop
    //   11: aload_1
    //   12: invokestatic 745	com/google/android/gms/internal/firebase_auth_api/zzalr:zzf	(Ljava/lang/Object;)V
    //   15: aload_0
    //   16: getfield 87	com/google/android/gms/internal/firebase_auth_api/zzalr:zzp	Lcom/google/android/gms/internal/firebase-auth-api/zzamv;
    //   19: astore 6
    //   21: aload_0
    //   22: getfield 89	com/google/android/gms/internal/firebase_auth_api/zzalr:zzq	Lcom/google/android/gms/internal/firebase-auth-api/zzajx;
    //   25: astore 7
    //   27: aconst_null
    //   28: astore 8
    //   30: aload 8
    //   32: astore 9
    //   34: aload_2
    //   35: invokeinterface 933 1 0
    //   40: istore 10
    //   42: aload_0
    //   43: iload 10
    //   45: invokespecial 749	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(I)I
    //   48: istore 11
    //   50: iload 11
    //   52: ifge +297 -> 349
    //   55: iload 10
    //   57: ldc_w 934
    //   60: if_icmpne +58 -> 118
    //   63: aload_0
    //   64: getfield 79	com/google/android/gms/internal/firebase_auth_api/zzalr:zzl	I
    //   67: istore 10
    //   69: iload 10
    //   71: aload_0
    //   72: getfield 81	com/google/android/gms/internal/firebase_auth_api/zzalr:zzm	I
    //   75: if_icmpge +28 -> 103
    //   78: aload_0
    //   79: aload_1
    //   80: aload_0
    //   81: getfield 77	com/google/android/gms/internal/firebase_auth_api/zzalr:zzk	[I
    //   84: iload 10
    //   86: iaload
    //   87: aload 8
    //   89: aload 6
    //   91: aload_1
    //   92: invokespecial 920	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: astore 8
    //   97: iinc 10 1
    //   100: goto -31 -> 69
    //   103: aload 8
    //   105: ifnull +12 -> 117
    //   108: aload 6
    //   110: aload 4
    //   112: aload 8
    //   114: invokevirtual 922	com/google/android/gms/internal/firebase_auth_api/zzamv:zzb	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   117: return
    //   118: aload_0
    //   119: getfield 73	com/google/android/gms/internal/firebase_auth_api/zzalr:zzh	Z
    //   122: ifne +9 -> 131
    //   125: aconst_null
    //   126: astore 12
    //   128: goto +18 -> 146
    //   131: aload 7
    //   133: aload 5
    //   135: aload_0
    //   136: getfield 91	com/google/android/gms/internal/firebase_auth_api/zzalr:zzg	Lcom/google/android/gms/internal/firebase-auth-api/zzaln;
    //   139: iload 10
    //   141: invokevirtual 937	com/google/android/gms/internal/firebase_auth_api/zzajx:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzajv;Lcom/google/android/gms/internal/firebase-auth-api/zzaln;I)Ljava/lang/Object;
    //   144: astore 12
    //   146: aload 12
    //   148: ifnull +53 -> 201
    //   151: aload 9
    //   153: ifnonnull +15 -> 168
    //   156: aload 7
    //   158: aload 4
    //   160: invokevirtual 939	com/google/android/gms/internal/firebase_auth_api/zzajx:zzb	(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;
    //   163: astore 13
    //   165: goto +7 -> 172
    //   168: aload 9
    //   170: astore 13
    //   172: aload 8
    //   174: astore 14
    //   176: aload 7
    //   178: aload_1
    //   179: aload_2
    //   180: aload 12
    //   182: aload_3
    //   183: aload 13
    //   185: aload 8
    //   187: aload 6
    //   189: invokevirtual 942	com/google/android/gms/internal/firebase_auth_api/zzajx:zza	(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;Lcom/google/android/gms/internal/firebase-auth-api/zzajy;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;
    //   192: astore 8
    //   194: aload 13
    //   196: astore 9
    //   198: goto -164 -> 34
    //   201: aload 6
    //   203: astore 15
    //   205: aload 4
    //   207: astore 12
    //   209: aload 8
    //   211: astore 14
    //   213: aload 15
    //   215: aload_2
    //   216: invokevirtual 945	com/google/android/gms/internal/firebase_auth_api/zzamv:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzamd;)Z
    //   219: pop
    //   220: aload 8
    //   222: astore 13
    //   224: aload 8
    //   226: ifnonnull +16 -> 242
    //   229: aload 8
    //   231: astore 14
    //   233: aload 15
    //   235: aload 12
    //   237: invokevirtual 318	com/google/android/gms/internal/firebase_auth_api/zzamv:zzc	(Ljava/lang/Object;)Ljava/lang/Object;
    //   240: astore 13
    //   242: aload 13
    //   244: astore 14
    //   246: aload 15
    //   248: aload 13
    //   250: aload_2
    //   251: iconst_0
    //   252: invokevirtual 948	com/google/android/gms/internal/firebase_auth_api/zzamv:zza	(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z
    //   255: istore 16
    //   257: aload 13
    //   259: astore 8
    //   261: iload 16
    //   263: ifne -65 -> 198
    //   266: aload_0
    //   267: getfield 79	com/google/android/gms/internal/firebase_auth_api/zzalr:zzl	I
    //   270: istore 10
    //   272: iload 10
    //   274: aload_0
    //   275: getfield 81	com/google/android/gms/internal/firebase_auth_api/zzalr:zzm	I
    //   278: if_icmpge +28 -> 306
    //   281: aload_0
    //   282: aload_1
    //   283: aload_0
    //   284: getfield 77	com/google/android/gms/internal/firebase_auth_api/zzalr:zzk	[I
    //   287: iload 10
    //   289: iaload
    //   290: aload 13
    //   292: aload 15
    //   294: aload_1
    //   295: invokespecial 920	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    //   298: astore 13
    //   300: iinc 10 1
    //   303: goto -31 -> 272
    //   306: aload 13
    //   308: ifnull +12 -> 320
    //   311: aload 15
    //   313: aload 12
    //   315: aload 13
    //   317: invokevirtual 922	com/google/android/gms/internal/firebase_auth_api/zzamv:zzb	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   320: return
    //   321: astore_2
    //   322: aload 14
    //   324: astore 8
    //   326: aload 4
    //   328: astore 13
    //   330: aload 6
    //   332: astore 14
    //   334: goto +2885 -> 3219
    //   337: astore_2
    //   338: aload 4
    //   340: astore 13
    //   342: aload 6
    //   344: astore 14
    //   346: goto +2873 -> 3219
    //   349: aload 6
    //   351: astore 14
    //   353: aload 4
    //   355: astore 13
    //   357: aload_0
    //   358: iload 11
    //   360: invokespecial 358	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(I)I
    //   363: istore 17
    //   365: ldc_w 529
    //   368: iload 17
    //   370: iand
    //   371: bipush 20
    //   373: iushr
    //   374: tableswitch	default:+290->664, 0:+2588->2962, 1:+2567->2941, 2:+2546->2920, 3:+2525->2899, 4:+2504->2878, 5:+2483->2857, 6:+2462->2836, 7:+2441->2815, 8:+2429->2803, 9:+2397->2771, 10:+2376->2750, 11:+2355->2729, 12:+2280->2654, 13:+2259->2633, 14:+2238->2612, 15:+2217->2591, 16:+2188->2562, 17:+2146->2520, 18:+2123->2497, 19:+2100->2474, 20:+2077->2451, 21:+2054->2428, 22:+2031->2405, 23:+2008->2382, 24:+1985->2359, 25:+1962->2336, 26:+1900->2274, 27:+1857->2231, 28:+1830->2204, 29:+1807->2181, 30:+1752->2126, 31:+1725->2099, 32:+1698->2072, 33:+1671->2045, 34:+1644->2018, 35:+1613->1987, 36:+1582->1956, 37:+1551->1925, 38:+1520->1894, 39:+1489->1863, 40:+1458->1832, 41:+1427->1801, 42:+1396->1770, 43:+1365->1739, 44:+1301->1675, 45:+1262->1636, 46:+1231->1605, 47:+1200->1574, 48:+1169->1543, 49:+1118->1492, 50:+931->1305, 51:+903->1277, 52:+875->1249, 53:+847->1221, 54:+819->1193, 55:+791->1165, 56:+763->1137, 57:+735->1109, 58:+707->1081, 59:+688->1062, 60:+646->1020, 61:+621->995, 62:+593->967, 63:+495->869, 64:+467->841, 65:+439->813, 66:+397->771, 67:+369->743, 68:+311->685
    //   664: aload 8
    //   666: astore 6
    //   668: aload 6
    //   670: ifnonnull +2334 -> 3004
    //   673: aload 14
    //   675: aload 13
    //   677: invokevirtual 318	com/google/android/gms/internal/firebase_auth_api/zzamv:zzc	(Ljava/lang/Object;)Ljava/lang/Object;
    //   680: astore 6
    //   682: goto +2316 -> 2998
    //   685: aload 8
    //   687: astore 4
    //   689: aload_0
    //   690: aload 13
    //   692: iload 10
    //   694: iload 11
    //   696: invokespecial 903	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;II)Ljava/lang/Object;
    //   699: checkcast 598	com/google/android/gms/internal/firebase_auth_api/zzaln
    //   702: astore 6
    //   704: aload 8
    //   706: astore 4
    //   708: aload_2
    //   709: aload 6
    //   711: aload_0
    //   712: iload 11
    //   714: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   717: aload 5
    //   719: invokeinterface 951 4 0
    //   724: aload 8
    //   726: astore 4
    //   728: aload_0
    //   729: aload 13
    //   731: iload 10
    //   733: iload 11
    //   735: aload 6
    //   737: invokespecial 905	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;IILjava/lang/Object;)V
    //   740: goto +338 -> 1078
    //   743: aload 8
    //   745: astore 4
    //   747: aload 13
    //   749: iload 17
    //   751: ldc_w 256
    //   754: iand
    //   755: i2l
    //   756: aload_2
    //   757: invokeinterface 953 1 0
    //   762: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   765: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   768: goto +28 -> 796
    //   771: aload 8
    //   773: astore 4
    //   775: aload 13
    //   777: iload 17
    //   779: ldc_w 256
    //   782: iand
    //   783: i2l
    //   784: aload_2
    //   785: invokeinterface 955 1 0
    //   790: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   793: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   796: aload 8
    //   798: astore 4
    //   800: aload_0
    //   801: aload 13
    //   803: iload 10
    //   805: iload 11
    //   807: invokespecial 459	com/google/android/gms/internal/firebase_auth_api/zzalr:zzb	(Ljava/lang/Object;II)V
    //   810: goto +268 -> 1078
    //   813: aload 8
    //   815: astore 4
    //   817: aload 13
    //   819: iload 17
    //   821: ldc_w 256
    //   824: iand
    //   825: i2l
    //   826: aload_2
    //   827: invokeinterface 957 1 0
    //   832: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   835: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   838: goto -42 -> 796
    //   841: aload 8
    //   843: astore 4
    //   845: aload 13
    //   847: iload 17
    //   849: ldc_w 256
    //   852: iand
    //   853: i2l
    //   854: aload_2
    //   855: invokeinterface 959 1 0
    //   860: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   863: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   866: goto -70 -> 796
    //   869: aload 8
    //   871: astore 4
    //   873: aload_2
    //   874: invokeinterface 961 1 0
    //   879: istore 18
    //   881: aload 8
    //   883: astore 4
    //   885: aload_0
    //   886: iload 11
    //   888: invokespecial 383	com/google/android/gms/internal/firebase_auth_api/zzalr:zzd	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    //   891: astore 6
    //   893: aload 6
    //   895: ifnull +48 -> 943
    //   898: aload 8
    //   900: astore 4
    //   902: aload 6
    //   904: iload 18
    //   906: invokeinterface 313 2 0
    //   911: ifeq +6 -> 917
    //   914: goto +29 -> 943
    //   917: aload 8
    //   919: astore 4
    //   921: aload 13
    //   923: iload 10
    //   925: iload 18
    //   927: aload 8
    //   929: aload 14
    //   931: invokestatic 964	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;
    //   934: astore 6
    //   936: aload 6
    //   938: astore 8
    //   940: goto +2043 -> 2983
    //   943: aload 8
    //   945: astore 4
    //   947: aload 13
    //   949: iload 17
    //   951: ldc_w 256
    //   954: iand
    //   955: i2l
    //   956: iload 18
    //   958: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   961: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   964: goto -168 -> 796
    //   967: aload 8
    //   969: astore 4
    //   971: aload 13
    //   973: iload 17
    //   975: ldc_w 256
    //   978: iand
    //   979: i2l
    //   980: aload_2
    //   981: invokeinterface 966 1 0
    //   986: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   989: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   992: goto -196 -> 796
    //   995: aload 8
    //   997: astore 4
    //   999: aload 13
    //   1001: iload 17
    //   1003: ldc_w 256
    //   1006: iand
    //   1007: i2l
    //   1008: aload_2
    //   1009: invokeinterface 473 1 0
    //   1014: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1017: goto -221 -> 796
    //   1020: aload 8
    //   1022: astore 4
    //   1024: aload_0
    //   1025: aload 13
    //   1027: iload 10
    //   1029: iload 11
    //   1031: invokespecial 903	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;II)Ljava/lang/Object;
    //   1034: checkcast 598	com/google/android/gms/internal/firebase_auth_api/zzaln
    //   1037: astore 6
    //   1039: aload 8
    //   1041: astore 4
    //   1043: aload_2
    //   1044: aload 6
    //   1046: aload_0
    //   1047: iload 11
    //   1049: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   1052: aload 5
    //   1054: invokeinterface 968 4 0
    //   1059: goto -335 -> 724
    //   1062: aload 8
    //   1064: astore 4
    //   1066: aload_0
    //   1067: aload 13
    //   1069: iload 17
    //   1071: aload_2
    //   1072: invokespecial 970	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamd;)V
    //   1075: goto -279 -> 796
    //   1078: goto +1905 -> 2983
    //   1081: aload 8
    //   1083: astore 4
    //   1085: aload 13
    //   1087: iload 17
    //   1089: ldc_w 256
    //   1092: iand
    //   1093: i2l
    //   1094: aload_2
    //   1095: invokeinterface 973 1 0
    //   1100: invokestatic 202	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1103: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1106: goto -310 -> 796
    //   1109: aload 8
    //   1111: astore 4
    //   1113: aload 13
    //   1115: iload 17
    //   1117: ldc_w 256
    //   1120: iand
    //   1121: i2l
    //   1122: aload_2
    //   1123: invokeinterface 975 1 0
    //   1128: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1131: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1134: goto -338 -> 796
    //   1137: aload 8
    //   1139: astore 4
    //   1141: aload 13
    //   1143: iload 17
    //   1145: ldc_w 256
    //   1148: iand
    //   1149: i2l
    //   1150: aload_2
    //   1151: invokeinterface 977 1 0
    //   1156: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1159: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1162: goto -366 -> 796
    //   1165: aload 8
    //   1167: astore 4
    //   1169: aload 13
    //   1171: iload 17
    //   1173: ldc_w 256
    //   1176: iand
    //   1177: i2l
    //   1178: aload_2
    //   1179: invokeinterface 979 1 0
    //   1184: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1187: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1190: goto -394 -> 796
    //   1193: aload 8
    //   1195: astore 4
    //   1197: aload 13
    //   1199: iload 17
    //   1201: ldc_w 256
    //   1204: iand
    //   1205: i2l
    //   1206: aload_2
    //   1207: invokeinterface 981 1 0
    //   1212: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1215: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1218: goto -422 -> 796
    //   1221: aload 8
    //   1223: astore 4
    //   1225: aload 13
    //   1227: iload 17
    //   1229: ldc_w 256
    //   1232: iand
    //   1233: i2l
    //   1234: aload_2
    //   1235: invokeinterface 983 1 0
    //   1240: invokestatic 167	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1243: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1246: goto -450 -> 796
    //   1249: aload 8
    //   1251: astore 4
    //   1253: aload 13
    //   1255: iload 17
    //   1257: ldc_w 256
    //   1260: iand
    //   1261: i2l
    //   1262: aload_2
    //   1263: invokeinterface 985 1 0
    //   1268: invokestatic 183	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1271: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1274: goto -478 -> 796
    //   1277: aload 8
    //   1279: astore 4
    //   1281: aload 13
    //   1283: iload 17
    //   1285: ldc_w 256
    //   1288: iand
    //   1289: i2l
    //   1290: aload_2
    //   1291: invokeinterface 987 1 0
    //   1296: invokestatic 195	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   1299: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1302: goto -506 -> 796
    //   1305: aload 8
    //   1307: astore 4
    //   1309: aload_0
    //   1310: iload 11
    //   1312: invokespecial 273	com/google/android/gms/internal/firebase_auth_api/zzalr:zzf	(I)Ljava/lang/Object;
    //   1315: astore 15
    //   1317: aload 8
    //   1319: astore 4
    //   1321: aload_0
    //   1322: iload 11
    //   1324: invokespecial 358	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(I)I
    //   1327: ldc_w 256
    //   1330: iand
    //   1331: i2l
    //   1332: lstore 19
    //   1334: aload 8
    //   1336: astore 4
    //   1338: aload 13
    //   1340: lload 19
    //   1342: invokestatic 99	com/google/android/gms/internal/firebase_auth_api/zzana:zze	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   1345: astore 12
    //   1347: aload 12
    //   1349: ifnonnull +36 -> 1385
    //   1352: aload 8
    //   1354: astore 4
    //   1356: aload_0
    //   1357: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1360: aload 15
    //   1362: invokeinterface 874 2 0
    //   1367: astore 6
    //   1369: aload 8
    //   1371: astore 4
    //   1373: aload 13
    //   1375: lload 19
    //   1377: aload 6
    //   1379: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1382: goto +73 -> 1455
    //   1385: aload 12
    //   1387: astore 6
    //   1389: aload 8
    //   1391: astore 4
    //   1393: aload_0
    //   1394: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1397: aload 12
    //   1399: invokeinterface 872 2 0
    //   1404: ifeq +51 -> 1455
    //   1407: aload 8
    //   1409: astore 4
    //   1411: aload_0
    //   1412: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1415: aload 15
    //   1417: invokeinterface 874 2 0
    //   1422: astore 6
    //   1424: aload 8
    //   1426: astore 4
    //   1428: aload_0
    //   1429: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1432: aload 6
    //   1434: aload 12
    //   1436: invokeinterface 877 3 0
    //   1441: pop
    //   1442: aload 8
    //   1444: astore 4
    //   1446: aload 13
    //   1448: lload 19
    //   1450: aload 6
    //   1452: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   1455: aload 8
    //   1457: astore 4
    //   1459: aload_2
    //   1460: aload_0
    //   1461: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1464: aload 6
    //   1466: invokeinterface 386 2 0
    //   1471: aload_0
    //   1472: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   1475: aload 15
    //   1477: invokeinterface 278 2 0
    //   1482: aload 5
    //   1484: invokeinterface 990 4 0
    //   1489: goto -411 -> 1078
    //   1492: iload 17
    //   1494: ldc_w 256
    //   1497: iand
    //   1498: i2l
    //   1499: lstore 19
    //   1501: aload 8
    //   1503: astore 4
    //   1505: aload_0
    //   1506: iload 11
    //   1508: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   1511: astore 6
    //   1513: aload 8
    //   1515: astore 4
    //   1517: aload_2
    //   1518: aload_0
    //   1519: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1522: aload 13
    //   1524: lload 19
    //   1526: invokeinterface 995 4 0
    //   1531: aload 6
    //   1533: aload 5
    //   1535: invokeinterface 998 4 0
    //   1540: goto -462 -> 1078
    //   1543: aload 8
    //   1545: astore 4
    //   1547: aload_2
    //   1548: aload_0
    //   1549: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1552: aload 13
    //   1554: iload 17
    //   1556: ldc_w 256
    //   1559: iand
    //   1560: i2l
    //   1561: invokeinterface 995 4 0
    //   1566: invokeinterface 1001 2 0
    //   1571: goto -493 -> 1078
    //   1574: aload 8
    //   1576: astore 4
    //   1578: aload_2
    //   1579: aload_0
    //   1580: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1583: aload 13
    //   1585: iload 17
    //   1587: ldc_w 256
    //   1590: iand
    //   1591: i2l
    //   1592: invokeinterface 995 4 0
    //   1597: invokeinterface 1003 2 0
    //   1602: goto -524 -> 1078
    //   1605: aload 8
    //   1607: astore 4
    //   1609: aload_2
    //   1610: aload_0
    //   1611: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1614: aload 13
    //   1616: iload 17
    //   1618: ldc_w 256
    //   1621: iand
    //   1622: i2l
    //   1623: invokeinterface 995 4 0
    //   1628: invokeinterface 1005 2 0
    //   1633: goto -555 -> 1078
    //   1636: aload 8
    //   1638: astore 4
    //   1640: aload_2
    //   1641: aload_0
    //   1642: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1645: aload 13
    //   1647: iload 17
    //   1649: ldc_w 256
    //   1652: iand
    //   1653: i2l
    //   1654: invokeinterface 995 4 0
    //   1659: invokeinterface 1007 2 0
    //   1664: goto -586 -> 1078
    //   1667: astore_2
    //   1668: aload 4
    //   1670: astore 8
    //   1672: goto +1547 -> 3219
    //   1675: aload_0
    //   1676: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1679: aload 13
    //   1681: iload 17
    //   1683: ldc_w 256
    //   1686: iand
    //   1687: i2l
    //   1688: invokeinterface 995 4 0
    //   1693: astore 15
    //   1695: aload_2
    //   1696: aload 15
    //   1698: invokeinterface 1009 2 0
    //   1703: aload_0
    //   1704: iload 11
    //   1706: invokespecial 383	com/google/android/gms/internal/firebase_auth_api/zzalr:zzd	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    //   1709: astore 12
    //   1711: aload_1
    //   1712: iload 10
    //   1714: aload 15
    //   1716: aload 12
    //   1718: aload 8
    //   1720: aload 14
    //   1722: invokestatic 831	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;
    //   1725: astore 6
    //   1727: aload 6
    //   1729: astore 8
    //   1731: goto +1352 -> 3083
    //   1734: astore 6
    //   1736: goto +1265 -> 3001
    //   1739: aload_0
    //   1740: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1743: aload 13
    //   1745: iload 17
    //   1747: ldc_w 256
    //   1750: iand
    //   1751: i2l
    //   1752: invokeinterface 995 4 0
    //   1757: astore 6
    //   1759: aload_2
    //   1760: aload 6
    //   1762: invokeinterface 1011 2 0
    //   1767: goto +1216 -> 2983
    //   1770: aload_0
    //   1771: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1774: aload 13
    //   1776: iload 17
    //   1778: ldc_w 256
    //   1781: iand
    //   1782: i2l
    //   1783: invokeinterface 995 4 0
    //   1788: astore 6
    //   1790: aload_2
    //   1791: aload 6
    //   1793: invokeinterface 1013 2 0
    //   1798: goto +1185 -> 2983
    //   1801: aload_0
    //   1802: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1805: aload 13
    //   1807: iload 17
    //   1809: ldc_w 256
    //   1812: iand
    //   1813: i2l
    //   1814: invokeinterface 995 4 0
    //   1819: astore 6
    //   1821: aload_2
    //   1822: aload 6
    //   1824: invokeinterface 1015 2 0
    //   1829: goto +1154 -> 2983
    //   1832: aload_0
    //   1833: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1836: aload 13
    //   1838: iload 17
    //   1840: ldc_w 256
    //   1843: iand
    //   1844: i2l
    //   1845: invokeinterface 995 4 0
    //   1850: astore 6
    //   1852: aload_2
    //   1853: aload 6
    //   1855: invokeinterface 1017 2 0
    //   1860: goto +1123 -> 2983
    //   1863: aload_0
    //   1864: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1867: aload 13
    //   1869: iload 17
    //   1871: ldc_w 256
    //   1874: iand
    //   1875: i2l
    //   1876: invokeinterface 995 4 0
    //   1881: astore 6
    //   1883: aload_2
    //   1884: aload 6
    //   1886: invokeinterface 1019 2 0
    //   1891: goto +1092 -> 2983
    //   1894: aload_0
    //   1895: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1898: aload 13
    //   1900: iload 17
    //   1902: ldc_w 256
    //   1905: iand
    //   1906: i2l
    //   1907: invokeinterface 995 4 0
    //   1912: astore 6
    //   1914: aload_2
    //   1915: aload 6
    //   1917: invokeinterface 1021 2 0
    //   1922: goto +1061 -> 2983
    //   1925: aload_0
    //   1926: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1929: aload 13
    //   1931: iload 17
    //   1933: ldc_w 256
    //   1936: iand
    //   1937: i2l
    //   1938: invokeinterface 995 4 0
    //   1943: astore 6
    //   1945: aload_2
    //   1946: aload 6
    //   1948: invokeinterface 1023 2 0
    //   1953: goto +1030 -> 2983
    //   1956: aload_0
    //   1957: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1960: aload 13
    //   1962: iload 17
    //   1964: ldc_w 256
    //   1967: iand
    //   1968: i2l
    //   1969: invokeinterface 995 4 0
    //   1974: astore 6
    //   1976: aload_2
    //   1977: aload 6
    //   1979: invokeinterface 1025 2 0
    //   1984: goto +999 -> 2983
    //   1987: aload_0
    //   1988: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   1991: aload 13
    //   1993: iload 17
    //   1995: ldc_w 256
    //   1998: iand
    //   1999: i2l
    //   2000: invokeinterface 995 4 0
    //   2005: astore 6
    //   2007: aload_2
    //   2008: aload 6
    //   2010: invokeinterface 1027 2 0
    //   2015: goto +968 -> 2983
    //   2018: aload_2
    //   2019: aload_0
    //   2020: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2023: aload 13
    //   2025: iload 17
    //   2027: ldc_w 256
    //   2030: iand
    //   2031: i2l
    //   2032: invokeinterface 995 4 0
    //   2037: invokeinterface 1001 2 0
    //   2042: goto +941 -> 2983
    //   2045: aload_2
    //   2046: aload_0
    //   2047: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2050: aload 13
    //   2052: iload 17
    //   2054: ldc_w 256
    //   2057: iand
    //   2058: i2l
    //   2059: invokeinterface 995 4 0
    //   2064: invokeinterface 1003 2 0
    //   2069: goto +914 -> 2983
    //   2072: aload_2
    //   2073: aload_0
    //   2074: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2077: aload 13
    //   2079: iload 17
    //   2081: ldc_w 256
    //   2084: iand
    //   2085: i2l
    //   2086: invokeinterface 995 4 0
    //   2091: invokeinterface 1005 2 0
    //   2096: goto +887 -> 2983
    //   2099: aload_2
    //   2100: aload_0
    //   2101: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2104: aload 13
    //   2106: iload 17
    //   2108: ldc_w 256
    //   2111: iand
    //   2112: i2l
    //   2113: invokeinterface 995 4 0
    //   2118: invokeinterface 1007 2 0
    //   2123: goto +860 -> 2983
    //   2126: aload_0
    //   2127: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2130: aload 13
    //   2132: iload 17
    //   2134: ldc_w 256
    //   2137: iand
    //   2138: i2l
    //   2139: invokeinterface 995 4 0
    //   2144: astore 6
    //   2146: aload_2
    //   2147: aload 6
    //   2149: invokeinterface 1009 2 0
    //   2154: aload_1
    //   2155: iload 10
    //   2157: aload 6
    //   2159: aload_0
    //   2160: iload 11
    //   2162: invokespecial 383	com/google/android/gms/internal/firebase_auth_api/zzalr:zzd	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    //   2165: aload 8
    //   2167: aload 14
    //   2169: invokestatic 831	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;
    //   2172: astore 6
    //   2174: aload 6
    //   2176: astore 8
    //   2178: goto +905 -> 3083
    //   2181: aload_0
    //   2182: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2185: aload 13
    //   2187: iload 17
    //   2189: ldc_w 256
    //   2192: iand
    //   2193: i2l
    //   2194: invokeinterface 995 4 0
    //   2199: astore 6
    //   2201: goto -442 -> 1759
    //   2204: aload_2
    //   2205: aload_0
    //   2206: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2209: aload 13
    //   2211: iload 17
    //   2213: ldc_w 256
    //   2216: iand
    //   2217: i2l
    //   2218: invokeinterface 995 4 0
    //   2223: invokeinterface 1029 2 0
    //   2228: goto +755 -> 2983
    //   2231: aload_0
    //   2232: iload 11
    //   2234: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   2237: astore 6
    //   2239: iload 17
    //   2241: ldc_w 256
    //   2244: iand
    //   2245: i2l
    //   2246: lstore 19
    //   2248: aload_2
    //   2249: aload_0
    //   2250: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2253: aload 13
    //   2255: lload 19
    //   2257: invokeinterface 995 4 0
    //   2262: aload 6
    //   2264: aload 5
    //   2266: invokeinterface 1031 4 0
    //   2271: goto +712 -> 2983
    //   2274: iload 17
    //   2276: invokestatic 463	com/google/android/gms/internal/firebase_auth_api/zzalr:zzg	(I)Z
    //   2279: ifeq +30 -> 2309
    //   2282: aload_2
    //   2283: aload_0
    //   2284: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2287: aload 13
    //   2289: iload 17
    //   2291: ldc_w 256
    //   2294: iand
    //   2295: i2l
    //   2296: invokeinterface 995 4 0
    //   2301: invokeinterface 1033 2 0
    //   2306: goto +677 -> 2983
    //   2309: aload_2
    //   2310: aload_0
    //   2311: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2314: aload 13
    //   2316: iload 17
    //   2318: ldc_w 256
    //   2321: iand
    //   2322: i2l
    //   2323: invokeinterface 995 4 0
    //   2328: invokeinterface 1035 2 0
    //   2333: goto +650 -> 2983
    //   2336: aload_0
    //   2337: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2340: aload 13
    //   2342: iload 17
    //   2344: ldc_w 256
    //   2347: iand
    //   2348: i2l
    //   2349: invokeinterface 995 4 0
    //   2354: astore 6
    //   2356: goto -566 -> 1790
    //   2359: aload_0
    //   2360: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2363: aload 13
    //   2365: iload 17
    //   2367: ldc_w 256
    //   2370: iand
    //   2371: i2l
    //   2372: invokeinterface 995 4 0
    //   2377: astore 6
    //   2379: goto -558 -> 1821
    //   2382: aload_0
    //   2383: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2386: aload 13
    //   2388: iload 17
    //   2390: ldc_w 256
    //   2393: iand
    //   2394: i2l
    //   2395: invokeinterface 995 4 0
    //   2400: astore 6
    //   2402: goto -550 -> 1852
    //   2405: aload_0
    //   2406: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2409: aload 13
    //   2411: iload 17
    //   2413: ldc_w 256
    //   2416: iand
    //   2417: i2l
    //   2418: invokeinterface 995 4 0
    //   2423: astore 6
    //   2425: goto -542 -> 1883
    //   2428: aload_0
    //   2429: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2432: aload 13
    //   2434: iload 17
    //   2436: ldc_w 256
    //   2439: iand
    //   2440: i2l
    //   2441: invokeinterface 995 4 0
    //   2446: astore 6
    //   2448: goto -534 -> 1914
    //   2451: aload_0
    //   2452: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2455: aload 13
    //   2457: iload 17
    //   2459: ldc_w 256
    //   2462: iand
    //   2463: i2l
    //   2464: invokeinterface 995 4 0
    //   2469: astore 6
    //   2471: goto -526 -> 1945
    //   2474: aload_0
    //   2475: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2478: aload 13
    //   2480: iload 17
    //   2482: ldc_w 256
    //   2485: iand
    //   2486: i2l
    //   2487: invokeinterface 995 4 0
    //   2492: astore 6
    //   2494: goto -518 -> 1976
    //   2497: aload_0
    //   2498: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   2501: aload 13
    //   2503: iload 17
    //   2505: ldc_w 256
    //   2508: iand
    //   2509: i2l
    //   2510: invokeinterface 995 4 0
    //   2515: astore 6
    //   2517: goto -510 -> 2007
    //   2520: aload_0
    //   2521: aload 13
    //   2523: iload 11
    //   2525: invokespecial 754	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;I)Ljava/lang/Object;
    //   2528: checkcast 598	com/google/android/gms/internal/firebase_auth_api/zzaln
    //   2531: astore 6
    //   2533: aload_2
    //   2534: aload 6
    //   2536: aload_0
    //   2537: iload 11
    //   2539: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   2542: aload 5
    //   2544: invokeinterface 951 4 0
    //   2549: aload_0
    //   2550: aload 13
    //   2552: iload 11
    //   2554: aload 6
    //   2556: invokespecial 759	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;)V
    //   2559: goto +424 -> 2983
    //   2562: aload 13
    //   2564: iload 17
    //   2566: ldc_w 256
    //   2569: iand
    //   2570: i2l
    //   2571: aload_2
    //   2572: invokeinterface 953 1 0
    //   2577: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   2580: aload_0
    //   2581: aload 13
    //   2583: iload 11
    //   2585: invokespecial 477	com/google/android/gms/internal/firebase_auth_api/zzalr:zzb	(Ljava/lang/Object;I)V
    //   2588: goto +395 -> 2983
    //   2591: aload 13
    //   2593: iload 17
    //   2595: ldc_w 256
    //   2598: iand
    //   2599: i2l
    //   2600: aload_2
    //   2601: invokeinterface 955 1 0
    //   2606: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2609: goto -29 -> 2580
    //   2612: aload 13
    //   2614: iload 17
    //   2616: ldc_w 256
    //   2619: iand
    //   2620: i2l
    //   2621: aload_2
    //   2622: invokeinterface 957 1 0
    //   2627: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   2630: goto -50 -> 2580
    //   2633: aload 13
    //   2635: iload 17
    //   2637: ldc_w 256
    //   2640: iand
    //   2641: i2l
    //   2642: aload_2
    //   2643: invokeinterface 959 1 0
    //   2648: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2651: goto -71 -> 2580
    //   2654: aload_2
    //   2655: invokeinterface 961 1 0
    //   2660: istore 18
    //   2662: aload_0
    //   2663: iload 11
    //   2665: invokespecial 383	com/google/android/gms/internal/firebase_auth_api/zzalr:zzd	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    //   2668: astore 6
    //   2670: aload 6
    //   2672: ifnull +40 -> 2712
    //   2675: aload 6
    //   2677: iload 18
    //   2679: invokeinterface 313 2 0
    //   2684: ifeq +6 -> 2690
    //   2687: goto +25 -> 2712
    //   2690: aload 13
    //   2692: iload 10
    //   2694: iload 18
    //   2696: aload 8
    //   2698: aload 14
    //   2700: invokestatic 964	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;
    //   2703: astore 6
    //   2705: aload 6
    //   2707: astore 8
    //   2709: goto +374 -> 3083
    //   2712: aload 13
    //   2714: iload 17
    //   2716: ldc_w 256
    //   2719: iand
    //   2720: i2l
    //   2721: iload 18
    //   2723: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2726: goto -146 -> 2580
    //   2729: aload 13
    //   2731: iload 17
    //   2733: ldc_w 256
    //   2736: iand
    //   2737: i2l
    //   2738: aload_2
    //   2739: invokeinterface 966 1 0
    //   2744: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2747: goto -167 -> 2580
    //   2750: aload 13
    //   2752: iload 17
    //   2754: ldc_w 256
    //   2757: iand
    //   2758: i2l
    //   2759: aload_2
    //   2760: invokeinterface 473 1 0
    //   2765: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   2768: goto -188 -> 2580
    //   2771: aload_0
    //   2772: aload 13
    //   2774: iload 11
    //   2776: invokespecial 754	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;I)Ljava/lang/Object;
    //   2779: checkcast 598	com/google/android/gms/internal/firebase_auth_api/zzaln
    //   2782: astore 6
    //   2784: aload_2
    //   2785: aload 6
    //   2787: aload_0
    //   2788: iload 11
    //   2790: invokespecial 356	com/google/android/gms/internal/firebase_auth_api/zzalr:zze	(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    //   2793: aload 5
    //   2795: invokeinterface 968 4 0
    //   2800: goto -251 -> 2549
    //   2803: aload_0
    //   2804: aload 13
    //   2806: iload 17
    //   2808: aload_2
    //   2809: invokespecial 970	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamd;)V
    //   2812: goto -232 -> 2580
    //   2815: aload 13
    //   2817: iload 17
    //   2819: ldc_w 256
    //   2822: iand
    //   2823: i2l
    //   2824: aload_2
    //   2825: invokeinterface 973 1 0
    //   2830: invokestatic 789	com/google/android/gms/internal/firebase_auth_api/zzana:zzc	(Ljava/lang/Object;JZ)V
    //   2833: goto -253 -> 2580
    //   2836: aload 13
    //   2838: iload 17
    //   2840: ldc_w 256
    //   2843: iand
    //   2844: i2l
    //   2845: aload_2
    //   2846: invokeinterface 975 1 0
    //   2851: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2854: goto -274 -> 2580
    //   2857: aload 13
    //   2859: iload 17
    //   2861: ldc_w 256
    //   2864: iand
    //   2865: i2l
    //   2866: aload_2
    //   2867: invokeinterface 977 1 0
    //   2872: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   2875: goto -295 -> 2580
    //   2878: aload 13
    //   2880: iload 17
    //   2882: ldc_w 256
    //   2885: iand
    //   2886: i2l
    //   2887: aload_2
    //   2888: invokeinterface 979 1 0
    //   2893: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   2896: goto -316 -> 2580
    //   2899: aload 13
    //   2901: iload 17
    //   2903: ldc_w 256
    //   2906: iand
    //   2907: i2l
    //   2908: aload_2
    //   2909: invokeinterface 981 1 0
    //   2914: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   2917: goto -337 -> 2580
    //   2920: aload 13
    //   2922: iload 17
    //   2924: ldc_w 256
    //   2927: iand
    //   2928: i2l
    //   2929: aload_2
    //   2930: invokeinterface 983 1 0
    //   2935: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   2938: goto -358 -> 2580
    //   2941: aload 13
    //   2943: iload 17
    //   2945: ldc_w 256
    //   2948: iand
    //   2949: i2l
    //   2950: aload_2
    //   2951: invokeinterface 985 1 0
    //   2956: invokestatic 792	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JF)V
    //   2959: goto -379 -> 2580
    //   2962: aload 13
    //   2964: iload 17
    //   2966: ldc_w 256
    //   2969: iand
    //   2970: i2l
    //   2971: aload_2
    //   2972: invokeinterface 987 1 0
    //   2977: invokestatic 795	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JD)V
    //   2980: goto -400 -> 2580
    //   2983: aload 13
    //   2985: astore 4
    //   2987: aload 14
    //   2989: astore 6
    //   2991: goto -2957 -> 34
    //   2994: astore_2
    //   2995: goto +224 -> 3219
    //   2998: goto +6 -> 3004
    //   3001: goto +93 -> 3094
    //   3004: aload 6
    //   3006: astore 4
    //   3008: aload 14
    //   3010: aload 6
    //   3012: aload_2
    //   3013: iconst_0
    //   3014: invokevirtual 948	com/google/android/gms/internal/firebase_auth_api/zzamv:zza	(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z
    //   3017: istore 16
    //   3019: aload 6
    //   3021: astore 8
    //   3023: iload 16
    //   3025: ifne +58 -> 3083
    //   3028: aload_0
    //   3029: getfield 79	com/google/android/gms/internal/firebase_auth_api/zzalr:zzl	I
    //   3032: istore 10
    //   3034: iload 10
    //   3036: aload_0
    //   3037: getfield 81	com/google/android/gms/internal/firebase_auth_api/zzalr:zzm	I
    //   3040: if_icmpge +28 -> 3068
    //   3043: aload_0
    //   3044: aload_1
    //   3045: aload_0
    //   3046: getfield 77	com/google/android/gms/internal/firebase_auth_api/zzalr:zzk	[I
    //   3049: iload 10
    //   3051: iaload
    //   3052: aload 6
    //   3054: aload 14
    //   3056: aload_1
    //   3057: invokespecial 920	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    //   3060: astore 6
    //   3062: iinc 10 1
    //   3065: goto -31 -> 3034
    //   3068: aload 6
    //   3070: ifnull +12 -> 3082
    //   3073: aload 14
    //   3075: aload 13
    //   3077: aload 6
    //   3079: invokevirtual 922	com/google/android/gms/internal/firebase_auth_api/zzamv:zzb	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   3082: return
    //   3083: aload 14
    //   3085: astore 6
    //   3087: aload 13
    //   3089: astore 4
    //   3091: goto -3057 -> 34
    //   3094: aload 8
    //   3096: astore 4
    //   3098: aload 14
    //   3100: aload_2
    //   3101: invokevirtual 945	com/google/android/gms/internal/firebase_auth_api/zzamv:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzamd;)Z
    //   3104: pop
    //   3105: aload 8
    //   3107: astore 6
    //   3109: aload 8
    //   3111: ifnonnull +16 -> 3127
    //   3114: aload 8
    //   3116: astore 4
    //   3118: aload 14
    //   3120: aload 13
    //   3122: invokevirtual 318	com/google/android/gms/internal/firebase_auth_api/zzamv:zzc	(Ljava/lang/Object;)Ljava/lang/Object;
    //   3125: astore 6
    //   3127: aload 6
    //   3129: astore 4
    //   3131: aload 14
    //   3133: aload 6
    //   3135: aload_2
    //   3136: iconst_0
    //   3137: invokevirtual 948	com/google/android/gms/internal/firebase_auth_api/zzamv:zza	(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z
    //   3140: istore 16
    //   3142: aload 6
    //   3144: astore 8
    //   3146: iload 16
    //   3148: ifne -65 -> 3083
    //   3151: aload_0
    //   3152: getfield 79	com/google/android/gms/internal/firebase_auth_api/zzalr:zzl	I
    //   3155: istore 10
    //   3157: iload 10
    //   3159: aload_0
    //   3160: getfield 81	com/google/android/gms/internal/firebase_auth_api/zzalr:zzm	I
    //   3163: if_icmpge +28 -> 3191
    //   3166: aload_0
    //   3167: aload_1
    //   3168: aload_0
    //   3169: getfield 77	com/google/android/gms/internal/firebase_auth_api/zzalr:zzk	[I
    //   3172: iload 10
    //   3174: iaload
    //   3175: aload 6
    //   3177: aload 14
    //   3179: aload_1
    //   3180: invokespecial 920	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    //   3183: astore 6
    //   3185: iinc 10 1
    //   3188: goto -31 -> 3157
    //   3191: aload 6
    //   3193: ifnull +12 -> 3205
    //   3196: aload 14
    //   3198: aload 13
    //   3200: aload 6
    //   3202: invokevirtual 922	com/google/android/gms/internal/firebase_auth_api/zzamv:zzb	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   3205: return
    //   3206: astore_2
    //   3207: goto +4 -> 3211
    //   3210: astore_2
    //   3211: aload 6
    //   3213: astore 14
    //   3215: aload 4
    //   3217: astore 13
    //   3219: aload_0
    //   3220: getfield 79	com/google/android/gms/internal/firebase_auth_api/zzalr:zzl	I
    //   3223: istore 10
    //   3225: iload 10
    //   3227: aload_0
    //   3228: getfield 81	com/google/android/gms/internal/firebase_auth_api/zzalr:zzm	I
    //   3231: if_icmpge +28 -> 3259
    //   3234: aload_0
    //   3235: aload_1
    //   3236: aload_0
    //   3237: getfield 77	com/google/android/gms/internal/firebase_auth_api/zzalr:zzk	[I
    //   3240: iload 10
    //   3242: iaload
    //   3243: aload 8
    //   3245: aload 14
    //   3247: aload_1
    //   3248: invokespecial 920	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    //   3251: astore 8
    //   3253: iinc 10 1
    //   3256: goto -31 -> 3225
    //   3259: aload 8
    //   3261: ifnull +12 -> 3273
    //   3264: aload 14
    //   3266: aload 13
    //   3268: aload 8
    //   3270: invokevirtual 922	com/google/android/gms/internal/firebase_auth_api/zzamv:zzb	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   3273: aload_2
    //   3274: athrow
    //   3275: astore 6
    //   3277: goto -276 -> 3001
    //   3280: astore 8
    //   3282: aload 6
    //   3284: astore 8
    //   3286: goto -192 -> 3094
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3289	0	this	zzalr
    //   0	3289	1	paramT	T
    //   0	3289	2	paramzzamd	zzamd
    //   0	3289	3	paramzzajv	zzajv
    //   1	3215	4	localObject1	Object
    //   4	2790	5	localzzajv	zzajv
    //   19	1709	6	localObject2	Object
    //   1734	1	6	localzzakp1	zzakp
    //   1757	1455	6	localObject3	Object
    //   3275	8	6	localzzakp2	zzakp
    //   25	152	7	localzzajx	com.google.android.gms.internal.firebase-auth-api.zzajx
    //   28	3241	8	localObject4	Object
    //   3280	1	8	localzzakp3	zzakp
    //   3284	1	8	localzzakp4	zzakp
    //   32	165	9	localObject5	Object
    //   40	3214	10	i	int
    //   48	2741	11	j	int
    //   126	1591	12	localObject6	Object
    //   163	3104	13	localObject7	Object
    //   174	3091	14	localObject8	Object
    //   203	1512	15	localObject9	Object
    //   255	2892	16	bool	boolean
    //   363	2607	17	k	int
    //   879	1843	18	m	int
    //   1332	924	19	l	long
    // Exception table:
    //   from	to	target	type
    //   176	194	321	finally
    //   213	220	321	finally
    //   233	242	321	finally
    //   246	257	321	finally
    //   118	125	337	finally
    //   131	146	337	finally
    //   156	165	337	finally
    //   689	704	1667	finally
    //   708	724	1667	finally
    //   728	740	1667	finally
    //   747	768	1667	finally
    //   775	796	1667	finally
    //   800	810	1667	finally
    //   817	838	1667	finally
    //   845	866	1667	finally
    //   873	881	1667	finally
    //   885	893	1667	finally
    //   902	914	1667	finally
    //   921	936	1667	finally
    //   947	964	1667	finally
    //   971	992	1667	finally
    //   999	1017	1667	finally
    //   1024	1039	1667	finally
    //   1043	1059	1667	finally
    //   1066	1075	1667	finally
    //   1085	1106	1667	finally
    //   1113	1134	1667	finally
    //   1141	1162	1667	finally
    //   1169	1190	1667	finally
    //   1197	1218	1667	finally
    //   1225	1246	1667	finally
    //   1253	1274	1667	finally
    //   1281	1302	1667	finally
    //   1309	1317	1667	finally
    //   1321	1334	1667	finally
    //   1338	1347	1667	finally
    //   1356	1369	1667	finally
    //   1373	1382	1667	finally
    //   1393	1407	1667	finally
    //   1411	1424	1667	finally
    //   1428	1442	1667	finally
    //   1446	1455	1667	finally
    //   1459	1489	1667	finally
    //   1505	1513	1667	finally
    //   1517	1540	1667	finally
    //   1547	1571	1667	finally
    //   1578	1602	1667	finally
    //   1609	1633	1667	finally
    //   1640	1664	1667	finally
    //   3008	3019	1667	finally
    //   3098	3105	1667	finally
    //   3118	3127	1667	finally
    //   3131	3142	1667	finally
    //   689	704	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   708	724	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   728	740	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   747	768	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   775	796	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   800	810	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   817	838	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   845	866	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   873	881	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   885	893	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   902	914	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   921	936	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   947	964	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   971	992	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   999	1017	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1024	1039	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1043	1059	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1066	1075	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1085	1106	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1113	1134	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1141	1162	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1169	1190	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1197	1218	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1225	1246	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1253	1274	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1281	1302	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1309	1317	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1321	1334	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1338	1347	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1356	1369	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1373	1382	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1393	1407	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1411	1424	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1428	1442	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1446	1455	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1459	1489	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1505	1513	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1517	1540	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1547	1571	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1578	1602	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1609	1633	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1640	1664	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1675	1711	1734	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   673	682	2994	finally
    //   1711	1727	2994	finally
    //   1739	1759	2994	finally
    //   1759	1767	2994	finally
    //   1770	1790	2994	finally
    //   1790	1798	2994	finally
    //   1801	1821	2994	finally
    //   1821	1829	2994	finally
    //   1832	1852	2994	finally
    //   1852	1860	2994	finally
    //   1863	1883	2994	finally
    //   1883	1891	2994	finally
    //   1894	1914	2994	finally
    //   1914	1922	2994	finally
    //   1925	1945	2994	finally
    //   1945	1953	2994	finally
    //   1956	1976	2994	finally
    //   1976	1984	2994	finally
    //   1987	2007	2994	finally
    //   2007	2015	2994	finally
    //   2018	2042	2994	finally
    //   2045	2069	2994	finally
    //   2072	2096	2994	finally
    //   2099	2123	2994	finally
    //   2126	2174	2994	finally
    //   2181	2201	2994	finally
    //   2204	2228	2994	finally
    //   2231	2239	2994	finally
    //   2248	2271	2994	finally
    //   2274	2306	2994	finally
    //   2309	2333	2994	finally
    //   2336	2356	2994	finally
    //   2359	2379	2994	finally
    //   2382	2402	2994	finally
    //   2405	2425	2994	finally
    //   2428	2448	2994	finally
    //   2451	2471	2994	finally
    //   2474	2494	2994	finally
    //   2497	2517	2994	finally
    //   2520	2549	2994	finally
    //   2549	2559	2994	finally
    //   2562	2580	2994	finally
    //   2580	2588	2994	finally
    //   2591	2609	2994	finally
    //   2612	2630	2994	finally
    //   2633	2651	2994	finally
    //   2654	2670	2994	finally
    //   2675	2687	2994	finally
    //   2690	2705	2994	finally
    //   2712	2726	2994	finally
    //   2729	2747	2994	finally
    //   2750	2768	2994	finally
    //   2771	2800	2994	finally
    //   2803	2812	2994	finally
    //   2815	2833	2994	finally
    //   2836	2854	2994	finally
    //   2857	2875	2994	finally
    //   2878	2896	2994	finally
    //   2899	2917	2994	finally
    //   2920	2938	2994	finally
    //   2941	2959	2994	finally
    //   2962	2980	2994	finally
    //   357	365	3206	finally
    //   1675	1711	3206	finally
    //   34	50	3210	finally
    //   673	682	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1711	1727	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1739	1759	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1759	1767	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1770	1790	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1790	1798	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1801	1821	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1821	1829	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1832	1852	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1852	1860	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1863	1883	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1883	1891	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1894	1914	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1914	1922	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1925	1945	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1945	1953	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1956	1976	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1976	1984	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   1987	2007	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2007	2015	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2018	2042	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2045	2069	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2072	2096	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2099	2123	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2126	2174	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2181	2201	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2204	2228	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2231	2239	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2248	2271	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2274	2306	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2309	2333	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2336	2356	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2359	2379	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2382	2402	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2405	2425	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2428	2448	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2451	2471	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2474	2494	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2497	2517	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2520	2549	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2549	2559	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2562	2580	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2580	2588	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2591	2609	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2612	2630	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2633	2651	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2654	2670	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2675	2687	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2690	2705	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2712	2726	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2729	2747	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2750	2768	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2771	2800	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2803	2812	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2815	2833	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2836	2854	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2857	2875	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2878	2896	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2899	2917	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2920	2938	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2941	2959	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   2962	2980	3275	com/google/android/gms/internal/firebase_auth_api/zzakp
    //   3008	3019	3280	com/google/android/gms/internal/firebase_auth_api/zzakp
  }
  
  public final void zza(T paramT, zzanm paramzzanm)
  {
    Object localObject1 = paramzzanm;
    label72:
    long l;
    boolean bool1;
    if (paramzzanm.zza() == 2)
    {
      zza(zzp, paramT, (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
      if (zzh)
      {
        paramzzanm = zzq.zza(paramT);
        if (!zza.isEmpty())
        {
          localObject2 = paramzzanm.zzc();
          paramzzanm = (Map.Entry)((Iterator)localObject2).next();
          break label72;
        }
      }
      localObject2 = null;
      paramzzanm = null;
      for (i = zzc.length - 3;; i -= 3)
      {
        localObject3 = paramzzanm;
        if (i < 0) {
          break;
        }
        j = zzc(i);
        k = zzc[i];
        while ((paramzzanm != null) && (zzq.zza(paramzzanm) > k))
        {
          zzq.zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, paramzzanm);
          if (((Iterator)localObject2).hasNext()) {
            paramzzanm = (Map.Entry)((Iterator)localObject2).next();
          } else {
            paramzzanm = null;
          }
        }
        float f;
        double d;
        switch ((j & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          break;
        case 67: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          l = zzd(paramT, j & 0xFFFFF);
          break;
        case 66: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 65: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          l = zzd(paramT, j & 0xFFFFF);
          break;
        case 64: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 63: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 62: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 61: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          break;
        case 60: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          break;
        case 59: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          break;
        case 58: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          bool1 = zze(paramT, j & 0xFFFFF);
          break;
        case 57: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 56: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          l = zzd(paramT, j & 0xFFFFF);
          break;
        case 55: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          j = zzc(paramT, j & 0xFFFFF);
          break;
        case 54: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          l = zzd(paramT, j & 0xFFFFF);
          break;
        case 53: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          l = zzd(paramT, j & 0xFFFFF);
          break;
        case 52: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          f = zzb(paramT, j & 0xFFFFF);
          break;
        case 51: 
          if (!zzc(paramT, k, i)) {
            continue;
          }
          d = zza(paramT, j & 0xFFFFF);
          break;
        case 50: 
          zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, k, zzana.zze(paramT, j & 0xFFFFF), i);
          break;
        case 49: 
          zzame.zza(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, zze(i));
          break;
        case 48: 
          zzame.zzl(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 47: 
          zzame.zzk(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 46: 
          zzame.zzj(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 45: 
          zzame.zzi(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 44: 
          zzame.zzc(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 43: 
          zzame.zzm(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 42: 
          zzame.zza(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 41: 
          zzame.zzd(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 40: 
          zzame.zze(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 39: 
          zzame.zzg(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 38: 
          zzame.zzn(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 37: 
          zzame.zzh(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 36: 
          zzame.zzf(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 35: 
          zzame.zzb(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
        case 34: 
          zzame.zzl(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 33: 
          zzame.zzk(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 32: 
          zzame.zzj(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 31: 
          zzame.zzi(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 30: 
          zzame.zzc(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 29: 
          zzame.zzm(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 28: 
          zzame.zza(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
        case 27: 
          zzame.zzb(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, zze(i));
          break;
        case 26: 
          zzame.zzb(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
        case 25: 
          zzame.zza(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 24: 
          zzame.zzd(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 23: 
          zzame.zze(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 22: 
          zzame.zzg(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 21: 
          zzame.zzn(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 20: 
          zzame.zzh(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 19: 
          zzame.zzf(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 18: 
          zzame.zzb(zzc[i], (List)zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          break;
        case 17: 
          if (!zzc(paramT, i)) {
            continue;
          }
          ((zzanm)localObject1).zza(k, zzana.zze(paramT, j & 0xFFFFF), zze(i));
          break;
        case 16: 
          if (!zzc(paramT, i)) {
            continue;
          }
          l = zzana.zzd(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzd(k, l);
          break;
        case 15: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zze(k, j);
          break;
        case 14: 
          if (!zzc(paramT, i)) {
            continue;
          }
          l = zzana.zzd(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzc(k, l);
          break;
        case 13: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzd(k, j);
          break;
        case 12: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zza(k, j);
          break;
        case 11: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzf(k, j);
          break;
        case 10: 
          if (!zzc(paramT, i)) {
            continue;
          }
          ((zzanm)localObject1).zza(k, (zzaiw)zzana.zze(paramT, j & 0xFFFFF));
          break;
        case 9: 
          if (!zzc(paramT, i)) {
            continue;
          }
          ((zzanm)localObject1).zzb(k, zzana.zze(paramT, j & 0xFFFFF), zze(i));
          break;
        case 8: 
          if (!zzc(paramT, i)) {
            continue;
          }
          zza(k, zzana.zze(paramT, j & 0xFFFFF), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
        case 7: 
          if (!zzc(paramT, i)) {
            continue;
          }
          bool1 = zzana.zzh(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zza(k, bool1);
          break;
        case 6: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzb(k, j);
          break;
        case 5: 
          if (!zzc(paramT, i)) {
            continue;
          }
          l = zzana.zzd(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zza(k, l);
          break;
        case 4: 
          if (!zzc(paramT, i)) {
            continue;
          }
          j = zzana.zzc(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzc(k, j);
          break;
        case 3: 
          if (!zzc(paramT, i)) {
            continue;
          }
          l = zzana.zzd(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zze(k, l);
          break;
        case 2: 
          if (!zzc(paramT, i)) {
            continue;
          }
          l = zzana.zzd(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zzb(k, l);
          break;
        case 1: 
          if (!zzc(paramT, i)) {
            continue;
          }
          f = zzana.zzb(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zza(k, f);
          break;
        }
        if (zzc(paramT, i))
        {
          d = zzana.zza(paramT, j & 0xFFFFF);
          ((zzanm)localObject1).zza(k, d);
        }
      }
      while (localObject3 != null)
      {
        zzq.zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, (Map.Entry)localObject3);
        if (((Iterator)localObject2).hasNext()) {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
        } else {
          localObject3 = null;
        }
      }
      return;
    }
    if (zzh)
    {
      localObject3 = zzq.zza(paramT);
      if (!zza.isEmpty())
      {
        localObject2 = ((zzajy)localObject3).zzd();
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        break label2625;
      }
    }
    Object localObject3 = null;
    Object localObject2 = null;
    label2625:
    int m = zzc.length;
    Unsafe localUnsafe = zzb;
    int j = 0;
    int k = j;
    int i = 1048575;
    while (k < m)
    {
      int n = zzc(k);
      Object localObject4 = zzc;
      int i1 = localObject4[k];
      int i2 = (n & 0xFF00000) >>> 20;
      int i4;
      int i5;
      if (i2 <= 17)
      {
        int i3 = localObject4[(k + 2)];
        i4 = i3 & 0xFFFFF;
        i5 = i;
        if (i4 != i)
        {
          if (i4 == 1048575) {
            j = 0;
          } else {
            j = localUnsafe.getInt(paramT, i4);
          }
          i5 = i4;
        }
        i4 = 1 << (i3 >>> 20);
        i = i5;
        i5 = i4;
      }
      else
      {
        i5 = 0;
      }
      for (;;)
      {
        localObject4 = localObject2;
        if ((localObject3 == null) || (zzq.zza((Map.Entry)localObject3) > i1)) {
          break;
        }
        zzq.zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, (Map.Entry)localObject3);
        if (((Iterator)localObject4).hasNext()) {
          localObject3 = (Map.Entry)((Iterator)localObject4).next();
        } else {
          localObject3 = null;
        }
      }
      l = n & 0xFFFFF;
      boolean bool2;
      switch (i2)
      {
      default: 
      case 68: 
      case 67: 
      case 66: 
      case 65: 
      case 64: 
      case 63: 
      case 62: 
      case 61: 
      case 60: 
      case 59: 
      case 58: 
      case 57: 
      case 56: 
      case 55: 
      case 54: 
      case 53: 
      case 52: 
      case 51: 
      case 50: 
      case 49: 
      case 48: 
      case 47: 
      case 46: 
      case 45: 
      case 44: 
      case 43: 
      case 42: 
      case 41: 
      case 40: 
      case 39: 
      case 38: 
      case 37: 
      case 36: 
      case 35: 
      case 34: 
      case 33: 
      case 32: 
      case 31: 
      case 30: 
      case 29: 
      case 28: 
      case 27: 
      case 26: 
      case 25: 
      case 24: 
      case 23: 
      case 22: 
      case 21: 
      case 20: 
      case 19: 
      case 18: 
        for (bool1 = false;; bool1 = false)
        {
          localObject2 = localObject1;
          break label5491;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, localUnsafe.getObject(paramT, l), zze(k));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzd(i1, zzd(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zze(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzc(i1, zzd(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzd(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzf(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, (zzaiw)localUnsafe.getObject(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzb(i1, localUnsafe.getObject(paramT, l), zze(k));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          zza(i1, localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, zze(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzb(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, zzd(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzc(i1, zzc(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zze(i1, zzd(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zzb(i1, zzd(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, zzb(paramT, l));
          break;
          if (!zzc(paramT, i1, k)) {
            break;
          }
          ((zzanm)localObject1).zza(i1, zza(paramT, l));
          break;
          zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, i1, localUnsafe.getObject(paramT, l), k);
          break;
          zzame.zza(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, zze(k));
          break;
          zzame.zzl(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzk(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzj(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzi(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzc(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzm(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zza(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzd(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zze(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzg(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzn(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzh(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzf(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzb(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, true);
          break;
          zzame.zzl(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzk(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzj(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzi(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzc(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzm(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zza(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
          zzame.zzb(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, zze(k));
          break;
          zzame.zzb(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          break;
          zzame.zza(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzd(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zze(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzg(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzn(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzh(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzf(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
          continue;
          zzame.zzb(zzc[k], (List)localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, false);
        }
      case 17: 
        bool1 = false;
        if (zza(paramT, k, i, j, i5)) {
          paramzzanm.zza(i1, localUnsafe.getObject(paramT, l), zze(k));
        }
        localObject2 = paramzzanm;
        break;
      case 16: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzd(i1, localUnsafe.getLong(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 15: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zze(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 14: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzc(i1, localUnsafe.getLong(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 13: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzd(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 12: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 11: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzf(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 10: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, (zzaiw)localUnsafe.getObject(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 9: 
        bool2 = false;
        i4 = k;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, i4, i, j, i5))
        {
          ((zzanm)localObject1).zzb(i1, localUnsafe.getObject(paramT, l), zze(i4));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 8: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          zza(i1, localUnsafe.getObject(paramT, l), (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 7: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, zzana.zzh(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 6: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzb(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 5: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, localUnsafe.getLong(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 4: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzc(i1, localUnsafe.getInt(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 3: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zze(i1, localUnsafe.getLong(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 2: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zzb(i1, localUnsafe.getLong(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 1: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, zzana.zzb(paramT, l));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 0: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (zza(paramT, k, i, j, i5))
        {
          ((zzanm)localObject1).zza(i1, zzana.zza(paramT, l));
          bool1 = bool2;
          localObject2 = localObject1;
        }
        break;
      }
      label5491:
      k += 3;
      localObject1 = localObject2;
      localObject2 = localObject4;
    }
    while (localObject3 != null)
    {
      zzq.zza((com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1, (Map.Entry)localObject3);
      if (((Iterator)localObject2).hasNext()) {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
      } else {
        localObject3 = null;
      }
    }
    zza(zzp, paramT, (com.google.android.gms.internal.firebase-auth-api.zzanm)localObject1);
  }
  
  /* Error */
  public final void zza(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 745	com/google/android/gms/internal/firebase_auth_api/zzalr:zzf	(Ljava/lang/Object;)V
    //   4: aload_2
    //   5: invokevirtual 229	java/lang/Object:getClass	()Ljava/lang/Class;
    //   8: pop
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: aload_0
    //   13: getfield 56	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	[I
    //   16: arraylength
    //   17: if_icmpge +701 -> 718
    //   20: aload_0
    //   21: iload_3
    //   22: invokespecial 358	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(I)I
    //   25: istore 4
    //   27: ldc_w 256
    //   30: iload 4
    //   32: iand
    //   33: i2l
    //   34: lstore 5
    //   36: aload_0
    //   37: getfield 56	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	[I
    //   40: iload_3
    //   41: iaload
    //   42: istore 7
    //   44: iload 4
    //   46: ldc_w 529
    //   49: iand
    //   50: bipush 20
    //   52: iushr
    //   53: tableswitch	default:+291->344, 0:+632->685, 1:+608->661, 2:+584->637, 3:+572->625, 4:+548->601, 5:+536->589, 6:+524->577, 7:+500->553, 8:+476->529, 9:+466->519, 10:+454->507, 11:+442->495, 12:+430->483, 13:+418->471, 14:+406->459, 15:+394->447, 16:+382->435, 17:+466->519, 18:+366->419, 19:+366->419, 20:+366->419, 21:+366->419, 22:+366->419, 23:+366->419, 24:+366->419, 25:+366->419, 26:+366->419, 27:+366->419, 28:+366->419, 29:+366->419, 30:+366->419, 31:+366->419, 32:+366->419, 33:+366->419, 34:+366->419, 35:+366->419, 36:+366->419, 37:+366->419, 38:+366->419, 39:+366->419, 40:+366->419, 41:+366->419, 42:+366->419, 43:+366->419, 44:+366->419, 45:+366->419, 46:+366->419, 47:+366->419, 48:+366->419, 49:+366->419, 50:+352->405, 51:+318->371, 52:+318->371, 53:+318->371, 54:+318->371, 55:+318->371, 56:+318->371, 57:+318->371, 58:+318->371, 59:+318->371, 60:+308->361, 61:+294->347, 62:+294->347, 63:+294->347, 64:+294->347, 65:+294->347, 66:+294->347, 67:+294->347, 68:+308->361
    //   344: goto +368 -> 712
    //   347: aload_0
    //   348: aload_2
    //   349: iload 7
    //   351: iload_3
    //   352: invokespecial 378	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;II)Z
    //   355: ifeq +357 -> 712
    //   358: goto +24 -> 382
    //   361: aload_0
    //   362: aload_1
    //   363: aload_2
    //   364: iload_3
    //   365: invokespecial 1142	com/google/android/gms/internal/firebase_auth_api/zzalr:zzb	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   368: goto +344 -> 712
    //   371: aload_0
    //   372: aload_2
    //   373: iload 7
    //   375: iload_3
    //   376: invokespecial 378	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;II)Z
    //   379: ifeq +333 -> 712
    //   382: aload_1
    //   383: lload 5
    //   385: aload_2
    //   386: lload 5
    //   388: invokestatic 99	com/google/android/gms/internal/firebase_auth_api/zzana:zze	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   391: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   394: aload_0
    //   395: aload_1
    //   396: iload 7
    //   398: iload_3
    //   399: invokespecial 459	com/google/android/gms/internal/firebase_auth_api/zzalr:zzb	(Ljava/lang/Object;II)V
    //   402: goto +310 -> 712
    //   405: aload_0
    //   406: getfield 93	com/google/android/gms/internal/firebase_auth_api/zzalr:zzr	Lcom/google/android/gms/internal/firebase-auth-api/zzalg;
    //   409: aload_1
    //   410: aload_2
    //   411: lload 5
    //   413: invokestatic 1145	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzalg;Ljava/lang/Object;Ljava/lang/Object;J)V
    //   416: goto +296 -> 712
    //   419: aload_0
    //   420: getfield 85	com/google/android/gms/internal/firebase_auth_api/zzalr:zzo	Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    //   423: aload_1
    //   424: aload_2
    //   425: lload 5
    //   427: invokeinterface 1148 5 0
    //   432: goto +280 -> 712
    //   435: aload_0
    //   436: aload_2
    //   437: iload_3
    //   438: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   441: ifeq +271 -> 712
    //   444: goto +202 -> 646
    //   447: aload_0
    //   448: aload_2
    //   449: iload_3
    //   450: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   453: ifeq +259 -> 712
    //   456: goto +36 -> 492
    //   459: aload_0
    //   460: aload_2
    //   461: iload_3
    //   462: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   465: ifeq +247 -> 712
    //   468: goto +178 -> 646
    //   471: aload_0
    //   472: aload_2
    //   473: iload_3
    //   474: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   477: ifeq +235 -> 712
    //   480: goto +12 -> 492
    //   483: aload_0
    //   484: aload_2
    //   485: iload_3
    //   486: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   489: ifeq +223 -> 712
    //   492: goto +118 -> 610
    //   495: aload_0
    //   496: aload_2
    //   497: iload_3
    //   498: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   501: ifeq +211 -> 712
    //   504: goto +106 -> 610
    //   507: aload_0
    //   508: aload_2
    //   509: iload_3
    //   510: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   513: ifeq +199 -> 712
    //   516: goto +22 -> 538
    //   519: aload_0
    //   520: aload_1
    //   521: aload_2
    //   522: iload_3
    //   523: invokespecial 1150	com/google/android/gms/internal/firebase_auth_api/zzalr:zza	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   526: goto +186 -> 712
    //   529: aload_0
    //   530: aload_2
    //   531: iload_3
    //   532: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   535: ifeq +177 -> 712
    //   538: aload_1
    //   539: lload 5
    //   541: aload_2
    //   542: lload 5
    //   544: invokestatic 99	com/google/android/gms/internal/firebase_auth_api/zzana:zze	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   547: invokestatic 469	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   550: goto +156 -> 706
    //   553: aload_0
    //   554: aload_2
    //   555: iload_3
    //   556: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   559: ifeq +153 -> 712
    //   562: aload_1
    //   563: lload 5
    //   565: aload_2
    //   566: lload 5
    //   568: invokestatic 545	com/google/android/gms/internal/firebase_auth_api/zzana:zzh	(Ljava/lang/Object;J)Z
    //   571: invokestatic 789	com/google/android/gms/internal/firebase_auth_api/zzana:zzc	(Ljava/lang/Object;JZ)V
    //   574: goto +132 -> 706
    //   577: aload_0
    //   578: aload_2
    //   579: iload_3
    //   580: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   583: ifeq +129 -> 712
    //   586: goto +24 -> 610
    //   589: aload_0
    //   590: aload_2
    //   591: iload_3
    //   592: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   595: ifeq +117 -> 712
    //   598: goto +48 -> 646
    //   601: aload_0
    //   602: aload_2
    //   603: iload_3
    //   604: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   607: ifeq +105 -> 712
    //   610: aload_1
    //   611: lload 5
    //   613: aload_2
    //   614: lload 5
    //   616: invokestatic 511	com/google/android/gms/internal/firebase_auth_api/zzana:zzc	(Ljava/lang/Object;J)I
    //   619: invokestatic 514	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JI)V
    //   622: goto +84 -> 706
    //   625: aload_0
    //   626: aload_2
    //   627: iload_3
    //   628: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   631: ifeq +81 -> 712
    //   634: goto +12 -> 646
    //   637: aload_0
    //   638: aload_2
    //   639: iload_3
    //   640: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   643: ifeq +69 -> 712
    //   646: aload_1
    //   647: lload 5
    //   649: aload_2
    //   650: lload 5
    //   652: invokestatic 535	com/google/android/gms/internal/firebase_auth_api/zzana:zzd	(Ljava/lang/Object;J)J
    //   655: invokestatic 1037	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JJ)V
    //   658: goto +48 -> 706
    //   661: aload_0
    //   662: aload_2
    //   663: iload_3
    //   664: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   667: ifeq +45 -> 712
    //   670: aload_1
    //   671: lload 5
    //   673: aload_2
    //   674: lload 5
    //   676: invokestatic 547	com/google/android/gms/internal/firebase_auth_api/zzana:zzb	(Ljava/lang/Object;J)F
    //   679: invokestatic 792	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JF)V
    //   682: goto +24 -> 706
    //   685: aload_0
    //   686: aload_2
    //   687: iload_3
    //   688: invokespecial 361	com/google/android/gms/internal/firebase_auth_api/zzalr:zzc	(Ljava/lang/Object;I)Z
    //   691: ifeq +21 -> 712
    //   694: aload_1
    //   695: lload 5
    //   697: aload_2
    //   698: lload 5
    //   700: invokestatic 553	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;J)D
    //   703: invokestatic 795	com/google/android/gms/internal/firebase_auth_api/zzana:zza	(Ljava/lang/Object;JD)V
    //   706: aload_0
    //   707: aload_1
    //   708: iload_3
    //   709: invokespecial 477	com/google/android/gms/internal/firebase_auth_api/zzalr:zzb	(Ljava/lang/Object;I)V
    //   712: iinc 3 3
    //   715: goto -704 -> 11
    //   718: aload_0
    //   719: getfield 87	com/google/android/gms/internal/firebase_auth_api/zzalr:zzp	Lcom/google/android/gms/internal/firebase-auth-api/zzamv;
    //   722: aload_1
    //   723: aload_2
    //   724: invokestatic 1153	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;Ljava/lang/Object;)V
    //   727: aload_0
    //   728: getfield 73	com/google/android/gms/internal/firebase_auth_api/zzalr:zzh	Z
    //   731: ifeq +12 -> 743
    //   734: aload_0
    //   735: getfield 89	com/google/android/gms/internal/firebase_auth_api/zzalr:zzq	Lcom/google/android/gms/internal/firebase-auth-api/zzajx;
    //   738: aload_1
    //   739: aload_2
    //   740: invokestatic 1156	com/google/android/gms/internal/firebase_auth_api/zzame:zza	(Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Ljava/lang/Object;Ljava/lang/Object;)V
    //   743: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	744	0	this	zzalr
    //   0	744	1	paramT1	T
    //   0	744	2	paramT2	T
    //   10	703	3	i	int
    //   25	25	4	j	int
    //   34	665	5	l	long
    //   42	355	7	k	int
  }
  
  public final void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzaiv paramzzaiv)
  {
    zza(paramT, paramArrayOfByte, paramInt1, paramInt2, 0, paramzzaiv);
  }
  
  public final int zzb(T paramT)
  {
    int i = zzc.length;
    int j = 0;
    for (int k = 0; j < i; k = i1)
    {
      int m = zzc(j);
      int n = zzc[j];
      long l = 0xFFFFF & m;
      i1 = 37;
      Object localObject;
      boolean bool;
      float f;
      switch ((m & 0xFF00000) >>> 20)
      {
      default: 
        i1 = k;
        break;
      case 68: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 67: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 66: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 65: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 64: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 63: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 62: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 61: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 60: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        localObject = zzana.zze(paramT, l);
        i1 = k * 53;
        break;
      case 59: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 58: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        i1 = k * 53;
        bool = zze(paramT, l);
        break;
      case 57: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 56: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 55: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        i1 = k * 53;
        k = zzc(paramT, l);
        break;
      case 54: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        break;
      case 53: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        i1 = k * 53;
        l = zzd(paramT, l);
        break;
      case 52: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        i1 = k * 53;
        f = zzb(paramT, l);
        break;
      case 51: 
        i1 = k;
        if (!zzc(paramT, n, j)) {
          break label992;
        }
        i1 = k * 53;
        d = zza(paramT, l);
        break;
      case 17: 
        localObject = zzana.zze(paramT, l);
        if (localObject == null) {}
        break;
      case 10: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
        i1 = k * 53;
        localObject = zzana.zze(paramT, l);
        k = localObject.hashCode();
        break;
      case 9: 
        localObject = zzana.zze(paramT, l);
        if (localObject != null) {
          i1 = localObject.hashCode();
        }
        i1 = k * 53 + i1;
        break;
      case 8: 
        i1 = k * 53;
        k = ((String)zzana.zze(paramT, l)).hashCode();
        break;
      case 7: 
        i1 = k * 53;
        bool = zzana.zzh(paramT, l);
        k = zzaki.zza(bool);
        break;
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
        i1 = k * 53;
        k = zzana.zzc(paramT, l);
        i1 += k;
        break;
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
        i1 = k * 53;
        l = zzana.zzd(paramT, l);
        break;
      case 1: 
        i1 = k * 53;
        f = zzana.zzb(paramT, l);
        k = Float.floatToIntBits(f);
        break;
      }
      i1 = k * 53;
      double d = zzana.zza(paramT, l);
      l = Double.doubleToLongBits(d);
      k = zzaki.zza(l);
      i1 = k + i1;
      label992:
      j += 3;
    }
    k = zzp.zzd(paramT).hashCode() + k * 53;
    int i1 = k;
    if (zzh) {
      i1 = k * 53 + zzq.zza(paramT).hashCode();
    }
    return i1;
  }
  
  public final boolean zzb(T paramT1, T paramT2)
  {
    int i = zzc.length;
    for (int j = 0;; j += 3)
    {
      boolean bool = true;
      if (j >= i) {
        break;
      }
      int k = zzc(j);
      long l1 = k & 0xFFFFF;
      switch ((k & 0xFF00000) >>> 20)
      {
      default: 
        break;
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 57: 
      case 58: 
      case 59: 
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 67: 
      case 68: 
        long l2 = zzb(j) & 0xFFFFF;
        if (zzana.zzc(paramT1, l2) != zzana.zzc(paramT2, l2)) {
          break;
        }
        if (zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1))) {
          break label960;
        }
        break;
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
        bool = zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1));
        break;
      case 17: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1))) {
          break label960;
        }
      case 16: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzd(paramT1, l1) == zzana.zzd(paramT2, l1)) {
          break label960;
        }
        break;
      case 15: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
      case 14: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzd(paramT1, l1) == zzana.zzd(paramT2, l1)) {
          break label960;
        }
        break;
      case 13: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
      case 12: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
        break;
      case 11: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
      case 10: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1))) {
          break label960;
        }
        break;
      case 9: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1))) {
          break label960;
        }
      case 8: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzame.zza(zzana.zze(paramT1, l1), zzana.zze(paramT2, l1))) {
          break label960;
        }
        break;
      case 7: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzh(paramT1, l1) == zzana.zzh(paramT2, l1)) {
          break label960;
        }
      case 6: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
        break;
      case 5: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzd(paramT1, l1) == zzana.zzd(paramT2, l1)) {
          break label960;
        }
      case 4: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzc(paramT1, l1) == zzana.zzc(paramT2, l1)) {
          break label960;
        }
        break;
      case 3: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (zzana.zzd(paramT1, l1) == zzana.zzd(paramT2, l1)) {
          break label960;
        }
      case 2: 
        if ((goto 957) || (!zzc(paramT1, paramT2, j))) {
          break;
        }
        if (zzana.zzd(paramT1, l1) == zzana.zzd(paramT2, l1)) {
          break label960;
        }
        break;
      case 1: 
        if (!zzc(paramT1, paramT2, j)) {
          break;
        }
        if (Float.floatToIntBits(zzana.zzb(paramT1, l1)) == Float.floatToIntBits(zzana.zzb(paramT2, l1))) {
          break label960;
        }
        break;
      }
      if ((!zzc(paramT1, paramT2, j)) || (Double.doubleToLongBits(zzana.zza(paramT1, l1)) != Double.doubleToLongBits(zzana.zza(paramT2, l1)))) {
        bool = false;
      }
      label960:
      if (!bool) {
        return false;
      }
    }
    if (!zzp.zzd(paramT1).equals(zzp.zzd(paramT2))) {
      return false;
    }
    if (zzh) {
      return zzq.zza(paramT1).equals(zzq.zza(paramT2));
    }
    return true;
  }
  
  public final void zzd(T paramT)
  {
    if (!zzg(paramT)) {
      return;
    }
    boolean bool = paramT instanceof zzakg;
    int i = 0;
    Object localObject1;
    if (bool)
    {
      localObject1 = (zzakg)paramT;
      ((zzakg)localObject1).zzb(Integer.MAX_VALUE);
      zza = 0;
      ((zzakg)localObject1).zzu();
    }
    int j = zzc.length;
    while (i < j)
    {
      int k = zzc(i);
      long l = 0xFFFFF & k;
      k = (k & 0xFF00000) >>> 20;
      if (k != 9)
      {
        if ((k != 60) && (k != 68)) {}
        switch (k)
        {
        default: 
          break;
        case 50: 
          localObject1 = zzb;
          Object localObject2 = ((Unsafe)localObject1).getObject(paramT, l);
          if (localObject2 == null) {
            break label362;
          }
          ((Unsafe)localObject1).putObject(paramT, l, zzr.zzc(localObject2));
          break;
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
          zzo.zzb(paramT, l);
          break label362;
          if (!zzc(paramT, zzc[i], i)) {
            break label362;
          }
          break;
        }
      }
      else
      {
        if (!zzc(paramT, i)) {
          break label362;
        }
      }
      zze(i).zzd(zzb.getObject(paramT, l));
      label362:
      i += 3;
    }
    zzp.zzf(paramT);
    if (zzh) {
      zzq.zzc(paramT);
    }
  }
  
  public final boolean zze(T paramT)
  {
    int i = 1048575;
    int j = 0;
    for (int k = j;; k++)
    {
      int m = zzl;
      int n = 1;
      int i1 = 1;
      if (k >= m) {
        break;
      }
      int i2 = zzk[k];
      int i3 = zzc[i2];
      int i4 = zzc(i2);
      int i5 = zzc[(i2 + 2)];
      m = i5 & 0xFFFFF;
      i5 = 1 << (i5 >>> 20);
      if (m != i)
      {
        if (m != 1048575) {
          j = zzb.getInt(paramT, m);
        }
        i = m;
      }
      if ((0x10000000 & i4) != 0) {
        m = 1;
      } else {
        m = 0;
      }
      if ((m != 0) && (!zza(paramT, i2, i, j, i5))) {
        return false;
      }
      m = (0xFF00000 & i4) >>> 20;
      if ((m != 9) && (m != 17))
      {
        Object localObject1;
        if (m != 27) {
          if ((m != 60) && (m != 68))
          {
            if (m != 49)
            {
              if (m != 50) {
                continue;
              }
              localObject1 = zzr.zzd(zzana.zze(paramT, i4 & 0xFFFFF));
              m = i1;
              if (!((Map)localObject1).isEmpty())
              {
                localObject2 = zzf(i2);
                m = i1;
                if (zzr.zza(localObject2).zzc.zzb() == zzank.zzi)
                {
                  localObject2 = null;
                  Iterator localIterator = ((Map)localObject1).values().iterator();
                  Object localObject3;
                  do
                  {
                    m = i1;
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = localIterator.next();
                    localObject1 = localObject2;
                    if (localObject2 == null) {
                      localObject1 = zzaly.zza().zza(localObject3.getClass());
                    }
                    localObject2 = localObject1;
                  } while (((zzamc)localObject1).zze(localObject3));
                  m = 0;
                }
              }
              if (m != 0) {
                continue;
              }
              return false;
            }
          }
          else
          {
            if ((!zzc(paramT, i3, i2)) || (zza(paramT, i4, zze(i2)))) {
              continue;
            }
            return false;
          }
        }
        Object localObject2 = (List)zzana.zze(paramT, i4 & 0xFFFFF);
        m = n;
        if (!((List)localObject2).isEmpty())
        {
          localObject1 = zze(i2);
          for (i1 = 0;; i1++)
          {
            m = n;
            if (i1 >= ((List)localObject2).size()) {
              break;
            }
            if (!((zzamc)localObject1).zze(((List)localObject2).get(i1)))
            {
              m = 0;
              break;
            }
          }
        }
        if (m == 0) {
          return false;
        }
      }
      else if ((zza(paramT, i2, i, j, i5)) && (!zza(paramT, i4, zze(i2))))
      {
        return false;
      }
    }
    return (!zzh) || (zzq.zza(paramT).zzg());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */