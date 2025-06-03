package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

final class zzga<T>
  implements zzgi<T>
{
  private static final int[] zza = new int[0];
  private static final Unsafe zzb = zzhj.zzg();
  private final int[] zzc;
  private final Object[] zzd;
  private final int zze;
  private final int zzf;
  private final zzfx zzg;
  private final int[] zzh;
  private final int zzi;
  private final int zzj;
  private final zzfl zzk;
  private final zzgz zzl;
  private final zzem zzm;
  private final zzgc zzn;
  private final zzfs zzo;
  
  private zzga(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, zzfx paramzzfx, int paramInt3, boolean paramBoolean, int[] paramArrayOfInt2, int paramInt4, int paramInt5, zzgc paramzzgc, zzfl paramzzfl, zzgz paramzzgz, zzem paramzzem, zzfs paramzzfs)
  {
    zzc = paramArrayOfInt1;
    zzd = paramArrayOfObject;
    zze = paramInt1;
    zzf = paramInt2;
    zzh = paramArrayOfInt2;
    zzi = paramInt4;
    zzj = paramInt5;
    zzn = paramzzgc;
    zzk = paramzzfl;
    zzl = paramzzgz;
    zzm = paramzzem;
    zzg = paramzzfx;
    zzo = paramzzfs;
  }
  
  private final void zzA(Object paramObject, int paramInt1, int paramInt2)
  {
    zzhj.zzn(paramObject, zzl(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void zzB(Object paramObject1, int paramInt, Object paramObject2)
  {
    zzb.putObject(paramObject1, zzo(paramInt) & 0xFFFFF, paramObject2);
    zzz(paramObject1, paramInt);
  }
  
  private final void zzC(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2)
  {
    zzb.putObject(paramObject1, zzo(paramInt2) & 0xFFFFF, paramObject2);
    zzA(paramObject1, paramInt1, paramInt2);
  }
  
  private final boolean zzD(Object paramObject1, Object paramObject2, int paramInt)
  {
    return zzE(paramObject1, paramInt) == zzE(paramObject2, paramInt);
  }
  
  private final boolean zzE(Object paramObject, int paramInt)
  {
    int i = zzl(paramInt);
    long l = i & 0xFFFFF;
    if (l == 1048575L)
    {
      i = zzo(paramInt);
      paramInt = zzn(i);
      l = i & 0xFFFFF;
      switch (paramInt)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return zzhj.zzf(paramObject, l) != null;
      case 16: 
        return zzhj.zzd(paramObject, l) != 0L;
      case 15: 
        return zzhj.zzc(paramObject, l) != 0;
      case 14: 
        return zzhj.zzd(paramObject, l) != 0L;
      case 13: 
        return zzhj.zzc(paramObject, l) != 0;
      case 12: 
        return zzhj.zzc(paramObject, l) != 0;
      case 11: 
        return zzhj.zzc(paramObject, l) != 0;
      case 10: 
        return !zzef.zzb.equals(zzhj.zzf(paramObject, l));
      case 9: 
        return zzhj.zzf(paramObject, l) != null;
      case 8: 
        paramObject = zzhj.zzf(paramObject, l);
        if ((paramObject instanceof String)) {
          return !((String)paramObject).isEmpty();
        }
        if ((paramObject instanceof zzef)) {
          return !zzef.zzb.equals(paramObject);
        }
        throw new IllegalArgumentException();
      case 7: 
        return zzhj.zzt(paramObject, l);
      case 6: 
        return zzhj.zzc(paramObject, l) != 0;
      case 5: 
        return zzhj.zzd(paramObject, l) != 0L;
      case 4: 
        return zzhj.zzc(paramObject, l) != 0;
      case 3: 
        return zzhj.zzd(paramObject, l) != 0L;
      case 2: 
        return zzhj.zzd(paramObject, l) != 0L;
      case 1: 
        return Float.floatToRawIntBits(zzhj.zzb(paramObject, l)) != 0;
      }
      return Double.doubleToRawLongBits(zzhj.zza(paramObject, l)) != 0L;
    }
    return (zzhj.zzc(paramObject, l) & 1 << (i >>> 20)) != 0;
  }
  
  private final boolean zzF(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return zzE(paramObject, paramInt1);
    }
    return (paramInt3 & paramInt4) != 0;
  }
  
  private static boolean zzG(Object paramObject, int paramInt, zzgi paramzzgi)
  {
    return paramzzgi.zzi(zzhj.zzf(paramObject, paramInt & 0xFFFFF));
  }
  
  private static boolean zzH(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof zzev)) {
      return ((zzev)paramObject).zzm();
    }
    return true;
  }
  
  private final boolean zzI(Object paramObject, int paramInt1, int paramInt2)
  {
    return zzhj.zzc(paramObject, zzl(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  public static zzha zzc(Object paramObject)
  {
    zzev localzzev = (zzev)paramObject;
    zzha localzzha = zzc;
    paramObject = localzzha;
    if (localzzha == zzha.zza())
    {
      paramObject = zzha.zzd();
      zzc = ((zzha)paramObject);
    }
    return (zzha)paramObject;
  }
  
  public static zzga zzj(Class paramClass, zzfu paramzzfu, zzgc paramzzgc, zzfl paramzzfl, zzgz paramzzgz, zzem paramzzem, zzfs paramzzfs)
  {
    if ((paramzzfu instanceof zzgh))
    {
      zzgh localzzgh = (zzgh)paramzzfu;
      paramzzfu = localzzgh.zzd();
      int i = paramzzfu.length();
      if (paramzzfu.charAt(0) >= 55296) {
        for (j = 1;; j = k)
        {
          k = j + 1;
          m = k;
          if (paramzzfu.charAt(j) < 55296) {
            break;
          }
        }
      }
      int m = 1;
      int j = m + 1;
      int k = paramzzfu.charAt(m);
      int n = j;
      m = k;
      if (k >= 55296)
      {
        k &= 0x1FFF;
        m = 13;
        for (i1 = j;; i1 = j)
        {
          j = i1 + 1;
          i1 = paramzzfu.charAt(i1);
          if (i1 < 55296) {
            break;
          }
          k |= (i1 & 0x1FFF) << m;
          m += 13;
        }
        m = k | i1 << m;
        n = j;
      }
      int i3;
      int i4;
      if (m == 0)
      {
        paramClass = zza;
        i1 = 0;
        j = i1;
        i2 = j;
        i3 = i2;
        m = i3;
        k = m;
        i4 = k;
        i5 = j;
      }
      else
      {
        m = n + 1;
        i1 = paramzzfu.charAt(n);
        j = i1;
        k = m;
        if (i1 >= 55296)
        {
          j = i1 & 0x1FFF;
          k = 13;
          i1 = m;
          m = j;
          for (;;)
          {
            j = i1 + 1;
            i1 = paramzzfu.charAt(i1);
            if (i1 < 55296) {
              break;
            }
            m |= (i1 & 0x1FFF) << k;
            k += 13;
            i1 = j;
          }
          m |= i1 << k;
          k = j;
          j = m;
        }
        m = k + 1;
        k = paramzzfu.charAt(k);
        i5 = k;
        i1 = m;
        if (k >= 55296)
        {
          i1 = k & 0x1FFF;
          k = 13;
          for (n = m;; n = m)
          {
            m = n + 1;
            n = paramzzfu.charAt(n);
            if (n < 55296) {
              break;
            }
            i1 |= (n & 0x1FFF) << k;
            k += 13;
          }
          i5 = i1 | n << k;
          i1 = m;
        }
        k = i1 + 1;
        i1 = paramzzfu.charAt(i1);
        m = i1;
        n = k;
        if (i1 >= 55296)
        {
          m = i1 & 0x1FFF;
          i1 = 13;
          n = k;
          k = m;
          for (;;)
          {
            m = n + 1;
            n = paramzzfu.charAt(n);
            if (n < 55296) {
              break;
            }
            k |= (n & 0x1FFF) << i1;
            i1 += 13;
            n = m;
          }
          k |= n << i1;
          n = m;
          m = k;
        }
        i1 = n + 1;
        n = paramzzfu.charAt(n);
        k = n;
        i2 = i1;
        if (n >= 55296)
        {
          n &= 0x1FFF;
          k = 13;
          for (i2 = i1;; i2 = i1)
          {
            i1 = i2 + 1;
            i2 = paramzzfu.charAt(i2);
            if (i2 < 55296) {
              break;
            }
            n |= (i2 & 0x1FFF) << k;
            k += 13;
          }
          k = n | i2 << k;
          i2 = i1;
        }
        n = i2 + 1;
        i2 = paramzzfu.charAt(i2);
        i1 = i2;
        i3 = n;
        if (i2 >= 55296)
        {
          i2 &= 0x1FFF;
          i1 = 13;
          for (i3 = n;; i3 = n)
          {
            n = i3 + 1;
            i3 = paramzzfu.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i2 |= (i3 & 0x1FFF) << i1;
            i1 += 13;
          }
          i1 = i2 | i3 << i1;
          i3 = n;
        }
        i2 = i3 + 1;
        i3 = paramzzfu.charAt(i3);
        n = i3;
        i4 = i2;
        if (i3 >= 55296)
        {
          i3 &= 0x1FFF;
          n = 13;
          for (i4 = i2;; i4 = i2)
          {
            i2 = i4 + 1;
            i4 = paramzzfu.charAt(i4);
            if (i4 < 55296) {
              break;
            }
            i3 |= (i4 & 0x1FFF) << n;
            n += 13;
          }
          n = i3 | i4 << n;
          i4 = i2;
        }
        i3 = i4 + 1;
        i6 = paramzzfu.charAt(i4);
        i4 = i6;
        i2 = i3;
        if (i6 >= 55296)
        {
          i4 = i6 & 0x1FFF;
          i2 = 13;
          for (i6 = i3;; i6 = i3)
          {
            i3 = i6 + 1;
            i6 = paramzzfu.charAt(i6);
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
        i7 = paramzzfu.charAt(i2);
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
            i7 = paramzzfu.charAt(i7);
            if (i7 < 55296) {
              break;
            }
            i6 |= (i7 & 0x1FFF) << i3;
            i3 += 13;
            i7 = i2;
          }
          i3 = i6 | i7 << i3;
        }
        i7 = j + j + i5;
        paramClass = new int[i3 + n + i4];
        i5 = m;
        i4 = k;
        i6 = i2;
        k = i3;
        m = i7;
        i3 = i4;
        i2 = i5;
        i5 = n;
        i4 = j;
        n = i6;
      }
      Unsafe localUnsafe = zzb;
      Object[] arrayOfObject1 = localzzgh.zze();
      Class localClass = localzzgh.zza().getClass();
      int i8 = k + i5;
      int[] arrayOfInt = new int[i1 * 3];
      Object[] arrayOfObject2 = new Object[i1 + i1];
      int i5 = 0;
      int i9 = i5;
      j = k;
      int i1 = i8;
      int i6 = i3;
      int i7 = i2;
      int i2 = n;
      while (i2 < i)
      {
        int i10 = i2 + 1;
        i2 = paramzzfu.charAt(i2);
        if (i2 >= 55296)
        {
          i3 = i2 & 0x1FFF;
          n = 13;
          for (;;)
          {
            i2 = i10 + 1;
            i10 = paramzzfu.charAt(i10);
            if (i10 < 55296) {
              break;
            }
            i3 |= (i10 & 0x1FFF) << n;
            n += 13;
            i10 = i2;
          }
          i10 = i3 | i10 << n;
          n = i2;
        }
        else
        {
          n = i10;
          i10 = i2;
        }
        int i11 = n + 1;
        int i12 = paramzzfu.charAt(n);
        if (i12 >= 55296)
        {
          i3 = i12 & 0x1FFF;
          n = 13;
          for (;;)
          {
            i2 = i11 + 1;
            i11 = paramzzfu.charAt(i11);
            if (i11 < 55296) {
              break;
            }
            i3 |= (i11 & 0x1FFF) << n;
            n += 13;
            i11 = i2;
          }
          i12 = i3 | i11 << n;
        }
        else
        {
          i2 = i11;
        }
        i11 = i5;
        if ((i12 & 0x400) != 0)
        {
          paramClass[i5] = i9;
          i11 = i5 + 1;
        }
        int i13 = i12 & 0xFF;
        label1670:
        Object localObject;
        int i14;
        if (i13 >= 51)
        {
          i5 = i2 + 1;
          i2 = paramzzfu.charAt(i2);
          n = i5;
          i3 = i2;
          if (i2 >= 55296)
          {
            i3 = i2 & 0x1FFF;
            n = 13;
            for (;;)
            {
              i2 = i5 + 1;
              i5 = paramzzfu.charAt(i5);
              if (i5 < 55296) {
                break;
              }
              i3 |= (i5 & 0x1FFF) << n;
              n += 13;
              i5 = i2;
            }
            i3 |= i5 << n;
            n = i2;
          }
          i5 = i13 - 51;
          if ((i5 != 9) && (i5 != 17))
          {
            i2 = m;
            if (i5 != 12) {
              break label1670;
            }
            if (localzzgh.zzc() != 1)
            {
              i2 = m;
              if ((i12 & 0x800) == 0) {
                break label1670;
              }
            }
            i5 = i9 / 3;
            i2 = m + 1;
            arrayOfObject2[(i5 + i5 + 1)] = arrayOfObject1[m];
            m = i2;
          }
          else
          {
            i5 = i9 / 3;
            i2 = m + 1;
            arrayOfObject2[(i5 + i5 + 1)] = arrayOfObject1[m];
            m = i2;
          }
          i2 = m;
          m = i3 + i3;
          localObject = arrayOfObject1[m];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zzv(localClass, (String)localObject);
            arrayOfObject1[m] = localObject;
          }
          i5 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          m++;
          localObject = arrayOfObject1[m];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zzv(localClass, (String)localObject);
            arrayOfObject1[m] = localObject;
          }
          i14 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i15 = n;
          i3 = 0;
          m = i2;
          n = j;
          j = i15;
        }
        else
        {
          i3 = m + 1;
          Field localField = zzv(localClass, (String)arrayOfObject1[m]);
          if ((i13 != 9) && (i13 != 17))
          {
            if ((i13 != 27) && (i13 != 49))
            {
              if ((i13 != 12) && (i13 != 30) && (i13 != 44))
              {
                n = i3;
                m = j;
                if (i13 == 50)
                {
                  m = j + 1;
                  paramClass[j] = i9;
                  j = i9 / 3;
                  n = i3 + 1;
                  localObject = arrayOfObject1[i3];
                  j += j;
                  arrayOfObject2[j] = localObject;
                  if ((i12 & 0x800) != 0)
                  {
                    i3 = n + 1;
                    arrayOfObject2[(j + 1)] = arrayOfObject1[n];
                    j = m;
                    m = i3;
                    break label1995;
                  }
                }
                j = m;
                m = n;
                label1995:
                n = j;
                break label2121;
              }
              if (localzzgh.zzc() != 1)
              {
                m = i3;
                n = j;
                if ((i12 & 0x800) == 0) {
                  break label2121;
                }
              }
              n = i9 / 3;
              m = i3 + 1;
              arrayOfObject2[(n + n + 1)] = arrayOfObject1[i3];
            }
            else
            {
              n = i9 / 3;
              m = i3 + 1;
              arrayOfObject2[(n + n + 1)] = arrayOfObject1[i3];
            }
            n = j;
          }
          else
          {
            m = i9 / 3;
            arrayOfObject2[(m + m + 1)] = localField.getType();
            n = j;
            m = i3;
          }
          label2121:
          i15 = (int)localUnsafe.objectFieldOffset(localField);
          i3 = 1048575;
          if (((i12 & 0x1000) != 0) && (i13 <= 17))
          {
            i5 = i2 + 1;
            i2 = paramzzfu.charAt(i2);
            if (i2 >= 55296)
            {
              i3 = i2 & 0x1FFF;
              i2 = 13;
              for (;;)
              {
                j = i5 + 1;
                i5 = paramzzfu.charAt(i5);
                if (i5 < 55296) {
                  break;
                }
                i3 |= (i5 & 0x1FFF) << i2;
                i2 += 13;
                i5 = j;
              }
              i2 = i3 | i5 << i2;
            }
            else
            {
              j = i5;
            }
            i3 = i2 / 32 + (i4 + i4);
            localObject = arrayOfObject1[i3];
            if ((localObject instanceof Field))
            {
              localObject = (Field)localObject;
            }
            else
            {
              localObject = zzv(localClass, (String)localObject);
              arrayOfObject1[i3] = localObject;
            }
            i3 = (int)localUnsafe.objectFieldOffset((Field)localObject);
            i2 %= 32;
          }
          else
          {
            j = i2;
            i2 = 0;
          }
          i5 = i1;
          if (i13 >= 18)
          {
            i5 = i1;
            if (i13 <= 49)
            {
              paramClass[i1] = i15;
              i5 = i1 + 1;
            }
          }
          i14 = i3;
          i1 = i5;
          i3 = i2;
          i5 = i15;
        }
        int i15 = i9 + 1;
        arrayOfInt[i9] = i10;
        int i16 = i15 + 1;
        if ((i12 & 0x200) != 0) {
          i2 = 536870912;
        } else {
          i2 = 0;
        }
        if ((i12 & 0x100) != 0) {
          i9 = 268435456;
        } else {
          i9 = 0;
        }
        if ((i12 & 0x800) != 0) {
          i10 = Integer.MIN_VALUE;
        } else {
          i10 = 0;
        }
        arrayOfInt[i15] = (i5 | i10 | i2 | i9 | i13 << 20);
        i9 = i16 + 1;
        arrayOfInt[i16] = (i3 << 20 | i14);
        i2 = j;
        i5 = i11;
        j = n;
      }
      return new zzga(arrayOfInt, arrayOfObject2, i7, i6, localzzgh.zza(), localzzgh.zzc(), false, paramClass, k, i8, paramzzgc, paramzzfl, paramzzgz, paramzzem, paramzzfs);
    }
    paramClass = (zzgw)paramzzfu;
    throw null;
  }
  
  private static int zzk(Object paramObject, long paramLong)
  {
    return ((Integer)zzhj.zzf(paramObject, paramLong)).intValue();
  }
  
  private final int zzl(int paramInt)
  {
    return zzc[(paramInt + 2)];
  }
  
  private final int zzm(int paramInt1, int paramInt2)
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
  
  private static int zzn(int paramInt)
  {
    return paramInt >>> 20 & 0xFF;
  }
  
  private final int zzo(int paramInt)
  {
    return zzc[(paramInt + 1)];
  }
  
  private static long zzp(Object paramObject, long paramLong)
  {
    return ((Long)zzhj.zzf(paramObject, paramLong)).longValue();
  }
  
  private final zzey zzq(int paramInt)
  {
    paramInt /= 3;
    return (zzey)zzd[(paramInt + paramInt + 1)];
  }
  
  private final zzgi zzr(int paramInt)
  {
    Object localObject = zzd;
    paramInt /= 3;
    paramInt += paramInt;
    localObject = (zzgi)localObject[paramInt];
    if (localObject != null) {
      return (zzgi)localObject;
    }
    localObject = zzgf.zza().zzb((Class)zzd[(paramInt + 1)]);
    zzd[paramInt] = localObject;
    return (zzgi)localObject;
  }
  
  private final Object zzs(int paramInt)
  {
    paramInt /= 3;
    return zzd[(paramInt + paramInt)];
  }
  
  private final Object zzt(Object paramObject, int paramInt)
  {
    zzgi localzzgi = zzr(paramInt);
    int i = zzo(paramInt);
    if (!zzE(paramObject, paramInt)) {
      return localzzgi.zzd();
    }
    long l = i & 0xFFFFF;
    paramObject = zzb.getObject(paramObject, l);
    if (zzH(paramObject)) {
      return paramObject;
    }
    Object localObject = localzzgi.zzd();
    if (paramObject != null) {
      localzzgi.zzf(localObject, paramObject);
    }
    return localObject;
  }
  
  private final Object zzu(Object paramObject, int paramInt1, int paramInt2)
  {
    zzgi localzzgi = zzr(paramInt2);
    if (!zzI(paramObject, paramInt1, paramInt2)) {
      return localzzgi.zzd();
    }
    Object localObject = zzb.getObject(paramObject, zzo(paramInt2) & 0xFFFFF);
    if (zzH(localObject)) {
      return localObject;
    }
    paramObject = localzzgi.zzd();
    if (localObject != null) {
      localzzgi.zzf(paramObject, localObject);
    }
    return paramObject;
  }
  
  private static Field zzv(Class paramClass, String paramString)
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
      ??? = Arrays.toString((Object[])???);
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Field ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" for ");
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append(" not found. Known fields are ");
      ((StringBuilder)localObject2).append((String)???);
      throw new RuntimeException(((StringBuilder)localObject2).toString());
    }
  }
  
  private static void zzw(Object paramObject)
  {
    if (zzH(paramObject)) {
      return;
    }
    throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(paramObject)));
  }
  
  private final void zzx(Object paramObject1, Object paramObject2, int paramInt)
  {
    if (!zzE(paramObject2, paramInt)) {
      return;
    }
    int i = zzo(paramInt);
    Unsafe localUnsafe = zzb;
    long l = i & 0xFFFFF;
    Object localObject1 = localUnsafe.getObject(paramObject2, l);
    if (localObject1 != null)
    {
      zzgi localzzgi = zzr(paramInt);
      if (!zzE(paramObject1, paramInt))
      {
        if (!zzH(localObject1))
        {
          localUnsafe.putObject(paramObject1, l, localObject1);
        }
        else
        {
          paramObject2 = localzzgi.zzd();
          localzzgi.zzf(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l, paramObject2);
        }
        zzz(paramObject1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l);
      paramObject2 = localObject2;
      if (!zzH(localObject2))
      {
        paramObject2 = localzzgi.zzd();
        localzzgi.zzf(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l, paramObject2);
      }
      localzzgi.zzf(paramObject2, localObject1);
      return;
    }
    paramInt = zzc[paramInt];
    paramObject2 = paramObject2.toString();
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(paramInt);
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append((String)paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  private final void zzy(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i = zzc[paramInt];
    if (!zzI(paramObject2, i, paramInt)) {
      return;
    }
    int j = zzo(paramInt);
    Unsafe localUnsafe = zzb;
    long l = j & 0xFFFFF;
    Object localObject1 = localUnsafe.getObject(paramObject2, l);
    if (localObject1 != null)
    {
      zzgi localzzgi = zzr(paramInt);
      if (!zzI(paramObject1, i, paramInt))
      {
        if (!zzH(localObject1))
        {
          localUnsafe.putObject(paramObject1, l, localObject1);
        }
        else
        {
          paramObject2 = localzzgi.zzd();
          localzzgi.zzf(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l, paramObject2);
        }
        zzA(paramObject1, i, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l);
      paramObject2 = localObject2;
      if (!zzH(localObject2))
      {
        paramObject2 = localzzgi.zzd();
        localzzgi.zzf(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l, paramObject2);
      }
      localzzgi.zzf(paramObject2, localObject1);
      return;
    }
    paramInt = zzc[paramInt];
    paramObject2 = paramObject2.toString();
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(paramInt);
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append((String)paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  private final void zzz(Object paramObject, int paramInt)
  {
    paramInt = zzl(paramInt);
    long l = 0xFFFFF & paramInt;
    if (l == 1048575L) {
      return;
    }
    zzhj.zzn(paramObject, l, 1 << (paramInt >>> 20) | zzhj.zzc(paramObject, l));
  }
  
  public final int zza(Object paramObject)
  {
    int i = zzc.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = zzo(j);
      int n = zzc[j];
      int i1 = zzn(m);
      long l = 0xFFFFF & m;
      m = 37;
      boolean bool;
      float f;
      switch (i1)
      {
      default: 
        m = k;
        break;
      case 68: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 67: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 66: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 65: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 64: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 63: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 62: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 61: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 60: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        localObject = zzhj.zzf(paramObject, l);
        m = k * 53;
        break;
      case 59: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 58: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        m = k * 53;
        bool = ((Boolean)zzhj.zzf(paramObject, l)).booleanValue();
        break;
      case 57: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 56: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 55: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        m = k * 53;
        k = zzk(paramObject, l);
        break;
      case 54: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        break;
      case 53: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        m = k * 53;
        l = zzp(paramObject, l);
        break;
      case 52: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        m = k * 53;
        f = ((Float)zzhj.zzf(paramObject, l)).floatValue();
        break;
      case 51: 
        m = k;
        if (!zzI(paramObject, n, j)) {
          break label1019;
        }
        m = k * 53;
        d = ((Double)zzhj.zzf(paramObject, l)).doubleValue();
        break;
      case 17: 
        localObject = zzhj.zzf(paramObject, l);
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
        m = k * 53;
        localObject = zzhj.zzf(paramObject, l);
        k = localObject.hashCode();
        break;
      case 9: 
        localObject = zzhj.zzf(paramObject, l);
        if (localObject != null) {
          m = localObject.hashCode();
        }
        m = k * 53 + m;
        break;
      case 8: 
        m = k * 53;
        k = ((String)zzhj.zzf(paramObject, l)).hashCode();
        break;
      case 7: 
        m = k * 53;
        bool = zzhj.zzt(paramObject, l);
        k = zzfa.zza(bool);
        break;
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
        m = k * 53;
        k = zzhj.zzc(paramObject, l);
        break;
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
        m = k * 53;
        l = zzhj.zzd(paramObject, l);
        break;
      case 1: 
        m = k * 53;
        f = zzhj.zzb(paramObject, l);
        k = Float.floatToIntBits(f);
        m = k + m;
        break;
      }
      m = k * 53;
      double d = zzhj.zza(paramObject, l);
      l = Double.doubleToLongBits(d);
      Object localObject = zzfa.zza;
      k = (int)(l ^ l >>> 32);
      m += k;
      label1019:
      j += 3;
    }
    return zzl.zzb(paramObject).hashCode() + k * 53;
  }
  
  public final int zzb(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzdt paramzzdt)
  {
    Object localObject1 = this;
    Object localObject2 = paramObject;
    int i = paramInt2;
    int j = paramInt3;
    Object localObject3 = paramzzdt;
    zzw(paramObject);
    Object localObject4 = zzb;
    int k = 0;
    int m = 0;
    int n = m;
    int i1 = n;
    int i2 = -1;
    int i3 = 1048575;
    int i4;
    label179:
    label181:
    label842:
    label862:
    label1279:
    label1435:
    label1696:
    label2943:
    label2946:
    label3147:
    label3151:
    label3164:
    label3168:
    label3235:
    label3453:
    label3662:
    label3666:
    label3670:
    label4331:
    label5004:
    label5041:
    label5141:
    label5160:
    label5417:
    label6330:
    label6419:
    label6521:
    while (paramInt1 < i)
    {
      n = paramInt1 + 1;
      i4 = paramArrayOfByte[paramInt1];
      if (i4 < 0)
      {
        n = zzdu.zzi(i4, paramArrayOfByte, n, (zzdt)localObject3);
        i4 = zza;
      }
      i5 = i4 >>> 3;
      if (i5 > i2)
      {
        paramInt1 = m / 3;
        if ((i5 >= zze) && (i5 <= zzf)) {
          paramInt1 = ((zzga)localObject1).zzm(i5, paramInt1);
        } else {
          paramInt1 = -1;
        }
      }
      else
      {
        if ((i5 < zze) || (i5 > zzf)) {
          break label179;
        }
        paramInt1 = ((zzga)localObject1).zzm(i5, k);
      }
      break label181;
      paramInt1 = -1;
      if (paramInt1 == -1)
      {
        i6 = i1;
        m = i3;
        i2 = k;
        i3 = i2;
        paramInt1 = j;
        j = i5;
        i1 = n;
        n = i;
        i5 = i3;
        i3 = j;
        k = i6;
        j = m;
      }
      else
      {
        int i7 = i4 & 0x7;
        Object localObject5 = zzc;
        i6 = localObject5[(paramInt1 + 1)];
        m = zzn(i6);
        long l1 = i6 & 0xFFFFF;
        int i8;
        boolean bool;
        if (m <= 17)
        {
          j = localObject5[(paramInt1 + 2)];
          i8 = 1 << (j >>> 20);
          j &= 0xFFFFF;
          if (j != i3)
          {
            if (i3 != 1048575) {
              ((Unsafe)localObject4).putInt(localObject2, i3, i1);
            }
            if (j == 1048575) {
              i1 = 0;
            } else {
              i1 = ((Unsafe)localObject4).getInt(localObject2, j);
            }
            k = i1;
          }
          else
          {
            j = i3;
            k = i1;
          }
          switch (m)
          {
          default: 
            m = paramInt1;
            if (i7 == 3)
            {
              localObject6 = ((zzga)localObject1).zzt(localObject2, m);
              paramInt1 = zzdu.zzl(localObject6, ((zzga)localObject1).zzr(m), paramArrayOfByte, n, paramInt2, i5 << 3 | 0x4, paramzzdt);
              ((zzga)localObject1).zzB(localObject2, m, localObject6);
              i6 = paramInt3;
              i = paramInt2;
              n = i4;
              i3 = j;
              i1 = k | i8;
              k = 0;
              i2 = i5;
              j = i6;
            }
            break;
          case 16: 
            if (i7 == 0)
            {
              n = zzdu.zzk(paramArrayOfByte, n, (zzdt)localObject3);
              ((Unsafe)localObject4).putLong(paramObject, l1, zzej.zzc(zzb));
              i1 = k | i8;
            }
            else
            {
              i = 0;
            }
            break;
          case 15: 
            if (i7 == 0)
            {
              n = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);
              i2 = zzej.zzb(zza);
            }
          case 12: 
            for (;;)
            {
              ((Unsafe)localObject4).putInt(localObject2, l1, i2);
              break label842;
              i3 = paramInt1;
              i = i4;
              if (i7 != 0) {
                break label862;
              }
              i1 = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);
              m = zza;
              localObject6 = ((zzga)localObject1).zzq(i3);
              n = i1;
              i2 = m;
              if ((0x80000000 & i6) != 0)
              {
                n = i1;
                i2 = m;
                if (localObject6 != null)
                {
                  if (!((zzey)localObject6).zza()) {
                    break;
                  }
                  n = i1;
                  i2 = m;
                }
              }
            }
            zzc(paramObject).zzh(i, Long.valueOf(m));
            i4 = i;
            paramInt1 = i1;
            m = i3;
            i1 = k;
            break;
          case 10: 
            if (i7 == 2)
            {
              n = zzdu.zza(paramArrayOfByte, n, (zzdt)localObject3);
              ((Unsafe)localObject4).putObject(localObject2, l1, zzc);
            }
            break;
          case 9: 
            i1 = paramInt1;
            if (i7 == 2)
            {
              localObject6 = ((zzga)localObject1).zzt(localObject2, i1);
              n = zzdu.zzm(localObject6, ((zzga)localObject1).zzr(i1), paramArrayOfByte, n, paramInt2, paramzzdt);
              ((zzga)localObject1).zzB(localObject2, i1, localObject6);
              i1 = k | i8;
              m = paramInt1;
              paramInt1 = n;
              n = i4;
            }
            else
            {
              i = 0;
            }
            break;
          case 8: 
            i1 = n;
            if (i7 == 2)
            {
              if ((i6 & 0x20000000) != 0)
              {
                n = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject3);
                i1 = zza;
                if (i1 >= 0)
                {
                  if (i1 == 0)
                  {
                    zzc = "";
                  }
                  else
                  {
                    i3 = zzhn.zza;
                    i3 = paramArrayOfByte.length;
                    if ((i3 - n - i1 | n | i1) >= 0)
                    {
                      i2 = n + i1;
                      localObject6 = new char[i1];
                      i3 = 0;
                      i = n;
                      byte b1;
                      for (;;)
                      {
                        n = i;
                        i1 = i3;
                        if (i >= i2) {
                          break;
                        }
                        b1 = paramArrayOfByte[i];
                        n = i;
                        i1 = i3;
                        if (!zzhk.zzd(b1)) {
                          break;
                        }
                        i++;
                        localObject6[i3] = ((char)(char)b1);
                        i3++;
                      }
                      if (n < i2)
                      {
                        i3 = n + 1;
                        b1 = paramArrayOfByte[n];
                        if (zzhk.zzd(b1))
                        {
                          n = i1 + 1;
                          localObject6[i1] = ((char)(char)b1);
                          for (;;)
                          {
                            i = n;
                            n = i3;
                            i1 = i;
                            if (i3 >= i2) {
                              break;
                            }
                            b1 = paramArrayOfByte[i3];
                            n = i3;
                            i1 = i;
                            if (!zzhk.zzd(b1)) {
                              break;
                            }
                            i3++;
                            n = i + 1;
                            localObject6[i] = ((char)(char)b1);
                          }
                        }
                        if (b1 < -32) {
                          if (i3 < i2)
                          {
                            zzhk.zzc(b1, paramArrayOfByte[i3], (char[])localObject6, i1);
                            n = i3 + 1;
                            i1++;
                          }
                        }
                        for (;;)
                        {
                          break;
                          throw zzfb.zzb();
                          if (b1 < -16)
                          {
                            if (i3 < i2 - 1)
                            {
                              n = i3 + 1;
                              zzhk.zzb(b1, paramArrayOfByte[i3], paramArrayOfByte[n], (char[])localObject6, i1);
                              n++;
                              i1++;
                            }
                            else
                            {
                              throw zzfb.zzb();
                            }
                          }
                          else
                          {
                            if (i3 >= i2 - 2) {
                              break label1279;
                            }
                            i = i3 + 1;
                            byte b2 = paramArrayOfByte[i3];
                            n = i + 1;
                            zzhk.zza(b1, b2, paramArrayOfByte[i], paramArrayOfByte[n], (char[])localObject6, i1);
                            i1 += 2;
                            n++;
                          }
                        }
                        throw zzfb.zzb();
                      }
                      zzc = new String((char[])localObject6, 0, i1);
                      n = i2;
                    }
                    else
                    {
                      throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(i3), Integer.valueOf(n), Integer.valueOf(i1) }));
                    }
                  }
                }
                else {
                  throw zzfb.zzc();
                }
              }
              else
              {
                n = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject3);
                i1 = zza;
                if (i1 < 0) {
                  break label1435;
                }
                if (i1 == 0)
                {
                  zzc = "";
                }
                else
                {
                  zzc = new String(paramArrayOfByte, n, i1, zzfa.zzb);
                  n += i1;
                }
              }
              ((Unsafe)localObject4).putObject(localObject2, l1, zzc);
              break label1696;
              throw zzfb.zzc();
            }
            else
            {
              i = 0;
            }
            break;
          case 7: 
            if (i7 == 0)
            {
              n = zzdu.zzk(paramArrayOfByte, n, (zzdt)localObject3);
              if (zzb != 0L) {
                bool = true;
              } else {
                bool = false;
              }
              zzhj.zzk(localObject2, l1, bool);
            }
            break;
          case 6: 
          case 13: 
            i1 = n;
            if (i7 == 5)
            {
              ((Unsafe)localObject4).putInt(localObject2, l1, zzdu.zzb(paramArrayOfByte, i1));
              n = i1 + 4;
            }
            break;
          case 5: 
          case 14: 
            i1 = n;
            if (i7 == 1) {
              ((Unsafe)localObject4).putLong(paramObject, l1, zzdu.zzn(paramArrayOfByte, i1));
            } else {
              i = 0;
            }
            break;
          case 4: 
          case 11: 
            if (i7 == 0)
            {
              n = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);
              ((Unsafe)localObject4).putInt(localObject2, l1, zza);
            }
            break;
          case 2: 
          case 3: 
            if (i7 == 0)
            {
              n = zzdu.zzk(paramArrayOfByte, n, (zzdt)localObject3);
              ((Unsafe)localObject4).putLong(paramObject, l1, zzb);
              i1 = k | i8;
              i3 = i4;
              i4 = n;
            }
            break;
          case 1: 
            i1 = n;
            if (i7 == 5)
            {
              zzhj.zzm(localObject2, l1, Float.intBitsToFloat(zzdu.zzb(paramArrayOfByte, i1)));
              n = i1 + 4;
            }
            break;
          case 0: 
            if (i7 == 1)
            {
              zzhj.zzl(localObject2, l1, Double.longBitsToDouble(zzdu.zzn(paramArrayOfByte, n)));
              n += 8;
              i1 = k | i8;
              i3 = i4;
              i4 = n;
              n = i3;
              m = paramInt1;
              paramInt1 = i4;
              i4 = paramInt3;
              k = 0;
              i3 = j;
              i = paramInt2;
              i2 = i5;
              j = i4;
              continue;
            }
            i = 0;
            i2 = paramInt3;
            i3 = paramInt1;
            paramInt1 = paramInt2;
            m = i5;
            i1 = n;
            n = paramInt1;
            paramInt1 = i2;
            i5 = i3;
            i3 = m;
            i2 = i;
            break;
          }
        }
        k = i1;
        i = i3;
        i2 = i4;
        int i9 = 0;
        i1 = 10;
        Object localObject7;
        if (m == 27)
        {
          if (i7 == 2)
          {
            localObject5 = (zzez)((Unsafe)localObject4).getObject(localObject2, l1);
            localObject6 = localObject5;
            if (!((zzez)localObject5).zzc())
            {
              i4 = ((List)localObject5).size();
              if (i4 != 0) {
                i1 = i4 + i4;
              }
              localObject6 = ((zzez)localObject5).zzd(i1);
              ((Unsafe)localObject4).putObject(localObject2, l1, localObject6);
            }
            n = zzdu.zze(((zzga)localObject1).zzr(paramInt1), i2, paramArrayOfByte, n, paramInt2, (zzez)localObject6, paramzzdt);
            j = paramInt3;
            i4 = paramInt2;
            m = paramInt1;
            paramInt1 = n;
            i1 = k;
            k = 0;
            i3 = i;
            n = i2;
            i2 = i5;
            i = i4;
            continue;
          }
        }
        else
        {
          if (m <= 49)
          {
            l2 = i6;
            localObject6 = zzb;
            zzez localzzez = (zzez)((Unsafe)localObject6).getObject(localObject2, l1);
            if (!localzzez.zzc())
            {
              i3 = localzzez.size();
              if (i3 != 0) {
                i1 = i3 + i3;
              }
              localzzez = localzzez.zzd(i1);
              ((Unsafe)localObject6).putObject(localObject2, l1, localzzez);
            }
            Object localObject8;
            switch (m)
            {
            default: 
              localObject7 = localObject3;
              m = i5;
              localObject8 = localObject4;
              i6 = paramInt1;
              i8 = paramInt2;
              localObject5 = localObject1;
              i1 = m;
              localObject2 = localObject8;
              localObject6 = localObject7;
              j = i6;
              i3 = i8;
              if (i7 == 3)
              {
                localObject6 = ((zzga)localObject1).zzr(i6);
                i7 = i2 & 0xFFFFFFF8 | 0x4;
              }
              break;
            case 34: 
            case 48: 
            case 33: 
            case 47: 
            case 30: 
            case 44: 
            case 28: 
            case 27: 
            case 26: 
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
            case 20: 
            case 21: 
            case 37: 
            case 38: 
            case 19: 
            case 36: 
            case 18: 
            case 35: 
              int i10;
              for (j = zzdu.zzc((zzgi)localObject6, paramArrayOfByte, n, paramInt2, i7, paramzzdt);; j = zzdu.zzc((zzgi)localObject6, paramArrayOfByte, i10, paramInt2, i7, paramzzdt))
              {
                localzzez.add(zzc);
                break label5041;
                if (i7 == 2)
                {
                  localObject2 = (zzfm)localzzez;
                  i1 = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);
                  i3 = zza + i1;
                  while (i1 < i3)
                  {
                    i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject3);
                    ((zzfm)localObject2).zze(zzej.zzc(zzb));
                  }
                  if (i1 != i3) {
                    throw zzfb.zzf();
                  }
                }
                else
                {
                  localObject5 = localObject1;
                  if (i7 != 0) {
                    break label2946;
                  }
                  localObject2 = (zzfm)localzzez;
                  for (i3 = zzdu.zzk(paramArrayOfByte, n, (zzdt)localObject3);; i3 = zzdu.zzk(paramArrayOfByte, j, (zzdt)localObject3))
                  {
                    ((zzfm)localObject2).zze(zzej.zzc(zzb));
                    i1 = i3;
                    if (i3 >= paramInt2) {
                      break;
                    }
                    j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject3);
                    i1 = i3;
                    if (i2 != zza) {
                      break;
                    }
                  }
                  if (i7 == 2)
                  {
                    localObject2 = (zzew)localzzez;
                    i1 = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);
                    i3 = zza + i1;
                    while (i1 < i3)
                    {
                      i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject3);
                      ((zzew)localObject2).zze(zzej.zzb(zza));
                    }
                    if (i1 != i3) {
                      throw zzfb.zzf();
                    }
                  }
                  else
                  {
                    localObject5 = localObject1;
                    if (i7 != 0) {
                      break label2946;
                    }
                    localObject2 = (zzew)localzzez;
                    for (i3 = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject3);; i3 = zzdu.zzh(paramArrayOfByte, j, (zzdt)localObject3))
                    {
                      ((zzew)localObject2).zze(zzej.zzb(zza));
                      i1 = i3;
                      if (i3 >= paramInt2) {
                        break;
                      }
                      j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject3);
                      i1 = i3;
                      if (i2 != zza) {
                        break;
                      }
                    }
                  }
                }
                break label5004;
                if (i7 == 2)
                {
                  i1 = zzdu.zzf(paramArrayOfByte, n, localzzez, (zzdt)localObject3);
                }
                else
                {
                  if (i7 != 0) {
                    break label2943;
                  }
                  i1 = zzdu.zzj(i2, paramArrayOfByte, n, paramInt2, localzzez, paramzzdt);
                }
                localObject6 = ((zzga)localObject1).zzq(paramInt1);
                localObject5 = zzl;
                i3 = zzgk.zza;
                if (localObject6 != null) {
                  if ((localzzez instanceof RandomAccess))
                  {
                    i2 = localzzez.size();
                    localObject1 = null;
                    i3 = 0;
                    j = i3;
                    while (i3 < i2)
                    {
                      m = ((Integer)localzzez.get(i3)).intValue();
                      if (((zzey)localObject6).zza())
                      {
                        if (i3 != j) {
                          localzzez.set(j, Integer.valueOf(m));
                        }
                        j++;
                      }
                      else
                      {
                        localObject1 = zzgk.zzc(localObject2, i5, m, localObject1, (zzgz)localObject5);
                      }
                      i3++;
                    }
                    if (j != i2) {
                      localzzez.subList(j, i2).clear();
                    }
                  }
                  else
                  {
                    localObject7 = localzzez.iterator();
                    localObject1 = null;
                    while (((Iterator)localObject7).hasNext())
                    {
                      i3 = ((Integer)((Iterator)localObject7).next()).intValue();
                      if (!((zzey)localObject6).zza())
                      {
                        localObject1 = zzgk.zzc(localObject2, i5, i3, localObject1, (zzgz)localObject5);
                        ((Iterator)localObject7).remove();
                      }
                    }
                  }
                }
                i3 = paramInt1;
                for (paramInt1 = i1;; paramInt1 = i1)
                {
                  localObject2 = this;
                  j = paramInt2;
                  localObject1 = localObject3;
                  localObject3 = localObject4;
                  i1 = i5;
                  localObject4 = localObject1;
                  i5 = i3;
                  i3 = j;
                  break label5160;
                  localObject5 = this;
                  i3 = paramInt2;
                  i1 = i5;
                  localObject2 = localObject4;
                  localObject6 = localObject3;
                  j = paramInt1;
                  break label5141;
                  localObject1 = localObject3;
                  if (i7 != 2) {
                    break label3168;
                  }
                  j = zzdu.zzh(paramArrayOfByte, n, (zzdt)localObject1);
                  m = zza;
                  if (m < 0) {
                    break label3164;
                  }
                  if (m > paramArrayOfByte.length - j) {
                    break;
                  }
                  i3 = j;
                  i1 = m;
                  if (m == 0) {}
                  for (i1 = j;; i1 = j)
                  {
                    localzzez.add(zzef.zzb);
                    do
                    {
                      localzzez.add(zzef.zzk(paramArrayOfByte, i3, i1));
                      i1 = i3 + i1;
                      if (i1 >= paramInt2) {
                        break label3151;
                      }
                      i3 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject1);
                      if (i2 != zza) {
                        break label3151;
                      }
                      j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject1);
                      m = zza;
                      if (m < 0) {
                        break label3147;
                      }
                      if (m > paramArrayOfByte.length - j) {
                        break;
                      }
                      i3 = j;
                      i1 = m;
                    } while (m != 0);
                  }
                  throw zzfb.zzf();
                  throw zzfb.zzc();
                  i3 = paramInt1;
                }
                throw zzfb.zzf();
                throw zzfb.zzc();
                break label3235;
                if (i7 == 2)
                {
                  localObject2 = this;
                  i1 = zzdu.zze(((zzga)localObject2).zzr(paramInt1), i2, paramArrayOfByte, n, paramInt2, localzzez, paramzzdt);
                  i3 = paramInt2;
                  localObject1 = localObject3;
                  j = paramInt1;
                  paramInt1 = i1;
                  i1 = i5;
                  localObject3 = localObject4;
                  localObject4 = localObject1;
                  i5 = j;
                  break label5160;
                }
                localObject5 = this;
                i3 = paramInt2;
                i1 = i5;
                localObject2 = localObject4;
                localObject6 = localObject3;
                j = paramInt1;
                break;
                localObject6 = localObject3;
                i1 = n;
                if (i7 == 2)
                {
                  if ((l2 & 0x20000000) == 0L)
                  {
                    i3 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject6);
                    i1 = zza;
                    if (i1 >= 0)
                    {
                      if (i1 == 0) {
                        localzzez.add("");
                      }
                      for (localObject2 = new String(paramArrayOfByte, i3, i1, zzfa.zzb);; localObject2 = new String(paramArrayOfByte, i3, i1, zzfa.zzb))
                      {
                        localzzez.add(localObject2);
                        i3 += i1;
                        localObject2 = localObject1;
                        i1 = i3;
                        if (i3 >= paramInt2) {
                          break label4331;
                        }
                        j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject6);
                        localObject2 = localObject1;
                        i1 = i3;
                        if (i2 != zza) {
                          break label4331;
                        }
                        i3 = zzdu.zzh(paramArrayOfByte, j, (zzdt)localObject6);
                        i1 = zza;
                        if (i1 < 0) {
                          break label3453;
                        }
                        if (i1 == 0) {
                          break;
                        }
                      }
                      throw zzfb.zzc();
                    }
                    throw zzfb.zzc();
                  }
                  i3 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject6);
                  j = zza;
                  if (j >= 0)
                  {
                    if (j == 0)
                    {
                      localzzez.add("");
                    }
                    else
                    {
                      i1 = i3 + j;
                      if (!zzhn.zzc(paramArrayOfByte, i3, i1)) {
                        break label3670;
                      }
                    }
                    for (localObject2 = new String(paramArrayOfByte, i3, j, zzfa.zzb);; localObject2 = new String(paramArrayOfByte, i3, j, zzfa.zzb))
                    {
                      localzzez.add(localObject2);
                      i3 = i1;
                      localObject2 = localObject1;
                      i1 = i3;
                      if (i3 >= paramInt2) {
                        break label4331;
                      }
                      j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject6);
                      localObject2 = localObject1;
                      i1 = i3;
                      if (i2 != zza) {
                        break label4331;
                      }
                      i3 = zzdu.zzh(paramArrayOfByte, j, (zzdt)localObject6);
                      j = zza;
                      if (j < 0) {
                        break label3666;
                      }
                      if (j == 0) {
                        break;
                      }
                      i1 = i3 + j;
                      if (!zzhn.zzc(paramArrayOfByte, i3, i1)) {
                        break label3662;
                      }
                    }
                    throw zzfb.zzb();
                    throw zzfb.zzc();
                    throw zzfb.zzb();
                  }
                  throw zzfb.zzc();
                }
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        i3 = paramInt2;
                        localObject5 = localObject1;
                        i1 = i5;
                        localObject2 = localObject4;
                        localObject6 = localObject3;
                        j = paramInt1;
                        break label5141;
                        localObject6 = localObject3;
                        i1 = n;
                        if (i7 == 2)
                        {
                          localObject2 = (zzdv)localzzez;
                          i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject6);
                          i3 = zza + i1;
                          while (i1 < i3)
                          {
                            i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject6);
                            if (zzb != 0L) {
                              bool = true;
                            } else {
                              bool = false;
                            }
                            ((zzdv)localObject2).zze(bool);
                          }
                          if (i1 == i3) {
                            break;
                          }
                          throw zzfb.zzf();
                        }
                      } while (i7 != 0);
                      localObject5 = (zzdv)localzzez;
                      i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject6);
                      localObject2 = localObject1;
                      i3 = i1;
                      if (zzb != 0L) {}
                      for (i3 = i1;; i3 = i1)
                      {
                        bool = true;
                        do
                        {
                          bool = false;
                          localObject1 = localObject2;
                          ((zzdv)localObject5).zze(bool);
                          localObject2 = localObject1;
                          i1 = i3;
                          if (i3 >= paramInt2) {
                            break;
                          }
                          j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject6);
                          localObject2 = localObject1;
                          i1 = i3;
                          if (i2 != zza) {
                            break;
                          }
                          i1 = zzdu.zzk(paramArrayOfByte, j, (zzdt)localObject6);
                          localObject2 = localObject1;
                          i3 = i1;
                        } while (zzb == 0L);
                      }
                      localObject6 = localObject3;
                      i1 = n;
                      if (i7 == 2)
                      {
                        localObject2 = (zzew)localzzez;
                        i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject6);
                        i3 = zza + i1;
                        while (i1 < i3)
                        {
                          ((zzew)localObject2).zze(zzdu.zzb(paramArrayOfByte, i1));
                          i1 += 4;
                        }
                        if (i1 == i3)
                        {
                          localObject2 = localObject1;
                          break label4331;
                        }
                        throw zzfb.zzf();
                      }
                    } while (i7 != 5);
                    localObject5 = (zzew)localzzez;
                    ((zzew)localObject5).zze(zzdu.zzb(paramArrayOfByte, i1));
                    for (i3 = i1 + 4;; i3 = j + 4)
                    {
                      localObject2 = localObject1;
                      i1 = i3;
                      if (i3 >= paramInt2) {
                        break;
                      }
                      j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject6);
                      localObject2 = localObject1;
                      i1 = i3;
                      if (i2 != zza) {
                        break;
                      }
                      ((zzew)localObject5).zze(zzdu.zzb(paramArrayOfByte, j));
                    }
                    localObject6 = localObject3;
                    i1 = n;
                    if (i7 == 2)
                    {
                      localObject2 = (zzfm)localzzez;
                      i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject6);
                      i3 = zza + i1;
                      while (i1 < i3)
                      {
                        ((zzfm)localObject2).zze(zzdu.zzn(paramArrayOfByte, i1));
                        i1 += 8;
                      }
                      if (i1 == i3)
                      {
                        localObject2 = localObject1;
                        break;
                      }
                      throw zzfb.zzf();
                    }
                  } while (i7 != 1);
                  localObject5 = (zzfm)localzzez;
                  ((zzfm)localObject5).zze(zzdu.zzn(paramArrayOfByte, i1));
                  for (i3 = i1 + 8;; i3 = j + 8)
                  {
                    localObject2 = localObject1;
                    i1 = i3;
                    if (i3 >= paramInt2) {
                      break;
                    }
                    j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject6);
                    localObject2 = localObject1;
                    i1 = i3;
                    if (i2 != zza) {
                      break;
                    }
                    ((zzfm)localObject5).zze(zzdu.zzn(paramArrayOfByte, j));
                  }
                  localObject2 = localObject3;
                  j = n;
                  if (i7 == 2)
                  {
                    i1 = zzdu.zzf(paramArrayOfByte, j, localzzez, (zzdt)localObject2);
                    localObject2 = localObject1;
                    i3 = paramInt2;
                    j = i1;
                    i1 = i5;
                    localObject1 = localObject3;
                    i5 = paramInt1;
                    paramInt1 = j;
                    localObject3 = localObject4;
                    localObject4 = localObject1;
                    break label5160;
                  }
                } while (i7 != 0);
                i3 = paramInt2;
                i1 = i5;
                localObject3 = localObject4;
                localObject4 = localObject2;
                i5 = paramInt1;
                paramInt1 = zzdu.zzj(i2, paramArrayOfByte, j, paramInt2, localzzez, paramzzdt);
                localObject2 = localObject1;
                break label5160;
                localObject7 = localObject3;
                i1 = i5;
                i6 = n;
                localObject2 = localObject4;
                j = paramInt1;
                m = paramInt2;
                if (i7 == 2)
                {
                  localObject2 = (zzfm)localzzez;
                  i1 = zzdu.zzh(paramArrayOfByte, i6, (zzdt)localObject7);
                  i3 = zza + i1;
                  while (i1 < i3)
                  {
                    i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject7);
                    ((zzfm)localObject2).zze(zzb);
                  }
                  if (i1 != i3) {
                    throw zzfb.zzf();
                  }
                }
                else
                {
                  localObject5 = localObject1;
                  localObject6 = localObject7;
                  i3 = m;
                  if (i7 != 0) {
                    break;
                  }
                  localObject2 = (zzfm)localzzez;
                  for (i3 = zzdu.zzk(paramArrayOfByte, i6, (zzdt)localObject7);; i3 = zzdu.zzk(paramArrayOfByte, j, (zzdt)localObject7))
                  {
                    ((zzfm)localObject2).zze(zzb);
                    i1 = i3;
                    if (i3 >= m) {
                      break;
                    }
                    j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject7);
                    i1 = i3;
                    if (i2 != zza) {
                      break;
                    }
                  }
                  localObject7 = localObject3;
                  i1 = i5;
                  i6 = n;
                  localObject2 = localObject4;
                  j = paramInt1;
                  m = paramInt2;
                  if (i7 == 2)
                  {
                    localObject2 = (zzer)localzzez;
                    i1 = zzdu.zzh(paramArrayOfByte, i6, (zzdt)localObject7);
                    i3 = zza + i1;
                    while (i1 < i3)
                    {
                      ((zzer)localObject2).zze(Float.intBitsToFloat(zzdu.zzb(paramArrayOfByte, i1)));
                      i1 += 4;
                    }
                    if (i1 != i3) {
                      throw zzfb.zzf();
                    }
                  }
                  else
                  {
                    localObject5 = localObject1;
                    localObject6 = localObject7;
                    i3 = m;
                    if (i7 != 5) {
                      break;
                    }
                    localObject2 = (zzer)localzzez;
                    ((zzer)localObject2).zze(Float.intBitsToFloat(zzdu.zzb(paramArrayOfByte, i6)));
                    for (i3 = i6 + 4;; i3 = j + 4)
                    {
                      i1 = i3;
                      if (i3 >= m) {
                        break;
                      }
                      j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject7);
                      i1 = i3;
                      if (i2 != zza) {
                        break;
                      }
                      ((zzer)localObject2).zze(Float.intBitsToFloat(zzdu.zzb(paramArrayOfByte, j)));
                    }
                    localObject7 = localObject3;
                    i1 = i5;
                    i6 = n;
                    localObject2 = localObject4;
                    j = paramInt1;
                    m = paramInt2;
                    if (i7 == 2)
                    {
                      localObject2 = (zzek)localzzez;
                      i1 = zzdu.zzh(paramArrayOfByte, i6, (zzdt)localObject7);
                      i3 = zza + i1;
                      while (i1 < i3)
                      {
                        ((zzek)localObject2).zze(Double.longBitsToDouble(zzdu.zzn(paramArrayOfByte, i1)));
                        i1 += 8;
                      }
                      if (i1 != i3) {
                        throw zzfb.zzf();
                      }
                    }
                    else
                    {
                      localObject5 = localObject1;
                      localObject6 = localObject7;
                      i3 = m;
                      if (i7 != 1) {
                        break;
                      }
                      localObject2 = (zzek)localzzez;
                      ((zzek)localObject2).zze(Double.longBitsToDouble(zzdu.zzn(paramArrayOfByte, i6)));
                      for (i3 = i6 + 8;; i3 = j + 8)
                      {
                        i1 = i3;
                        if (i3 >= m) {
                          break;
                        }
                        j = zzdu.zzh(paramArrayOfByte, i3, (zzdt)localObject7);
                        i1 = i3;
                        if (i2 != zza) {
                          break;
                        }
                        ((zzek)localObject2).zze(Double.longBitsToDouble(zzdu.zzn(paramArrayOfByte, j)));
                      }
                    }
                  }
                }
                i3 = paramInt2;
                j = paramInt1;
                localObject6 = localObject3;
                localObject3 = localObject4;
                paramInt1 = i1;
                localObject2 = localObject1;
                i1 = i5;
                localObject4 = localObject6;
                i5 = j;
                break label5160;
                localObject2 = localObject1;
                paramInt1 = j;
                i1 = m;
                localObject3 = localObject8;
                localObject4 = localObject7;
                i5 = i6;
                i3 = i8;
                if (j >= i8) {
                  break label5160;
                }
                i10 = zzdu.zzh(paramArrayOfByte, j, (zzdt)localObject7);
                localObject2 = localObject1;
                paramInt1 = j;
                i1 = m;
                localObject3 = localObject8;
                localObject4 = localObject7;
                i5 = i6;
                i3 = i8;
                if (i2 != zza) {
                  break label5160;
                }
              }
            }
            paramInt1 = n;
            i5 = j;
            localObject4 = localObject6;
            localObject3 = localObject2;
            localObject2 = localObject5;
            if (paramInt1 != n)
            {
              localObject5 = paramObject;
              i2 = i1;
              n = i4;
              i1 = k;
              k = 0;
              i4 = i;
              localObject6 = localObject4;
              i = i3;
              j = paramInt3;
              localObject1 = localObject2;
              m = i5;
              i3 = i4;
              localObject2 = localObject5;
              localObject4 = localObject3;
              localObject3 = localObject6;
              break label6521;
            }
            localObject5 = paramObject;
            j = paramInt3;
            localObject6 = localObject3;
            n = i3;
            i3 = i1;
            localObject3 = localObject4;
            localObject1 = localObject2;
            i1 = paramInt1;
            localObject2 = localObject5;
            paramInt1 = j;
            i2 = i9;
            localObject4 = localObject6;
            j = i;
            break label6419;
          }
          j = paramInt1;
          localObject2 = localObject4;
          i3 = i5;
          if (m != 50) {
            break label5417;
          }
          if (i7 == 2)
          {
            paramArrayOfByte = zzb;
            localObject3 = ((zzga)localObject1).zzs(j);
            localObject4 = paramArrayOfByte.getObject(paramObject, l1);
            if (!((zzfr)localObject4).zze())
            {
              paramzzdt = zzfr.zza().zzb();
              zzfs.zza(paramzzdt, localObject4);
              paramArrayOfByte.putObject(paramObject, l1, paramzzdt);
            }
            paramObject = (zzfq)localObject3;
            throw null;
          }
          localObject2 = paramObject;
        }
        i4 = paramInt3;
        i3 = paramInt1;
        i1 = n;
        n = paramInt2;
        j = i5;
        paramInt1 = i4;
        i4 = i2;
        i5 = i3;
        i3 = j;
        i2 = i9;
        j = i;
        break label6419;
        i1 = n;
        localObject2 = paramObject;
        localObject6 = zzb;
        long l2 = localObject5[(j + 2)] & 0xFFFFF;
        switch (m)
        {
        default: 
        case 68: 
          do
          {
            localObject3 = paramzzdt;
            break;
          } while (i7 != 3);
          localObject5 = ((zzga)localObject1).zzu(localObject2, i3, j);
          localObject6 = ((zzga)localObject1).zzr(j);
          localObject3 = paramzzdt;
          i1 = zzdu.zzl(localObject5, (zzgi)localObject6, paramArrayOfByte, i1, paramInt2, i2 & 0xFFFFFFF8 | 0x4, (zzdt)localObject3);
          ((zzga)localObject1).zzC(localObject2, i3, j, localObject5);
          i4 = i2;
          break;
        case 67: 
          if (i7 == 0)
          {
            localObject3 = paramzzdt;
            i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject3);
            localObject3 = Long.valueOf(zzej.zzc(zzb));
          }
          break;
        case 66: 
          localObject3 = paramzzdt;
          if (i7 == 0)
          {
            i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject3);
            localObject3 = Integer.valueOf(zzej.zzb(zza));
          }
          break;
        case 63: 
          localObject3 = paramzzdt;
          if (i7 == 0)
          {
            i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject3);
            i3 = zza;
            localObject3 = ((zzga)localObject1).zzq(j);
            if ((localObject3 != null) && (!((zzey)localObject3).zza())) {
              zzc(paramObject).zzh(i2, Long.valueOf(i3));
            } else {
              localObject3 = Integer.valueOf(i3);
            }
          }
          break;
        case 61: 
          localObject3 = paramzzdt;
          if (i7 == 2)
          {
            i1 = zzdu.zza(paramArrayOfByte, i1, (zzdt)localObject3);
            localObject3 = zzc;
            ((Unsafe)localObject6).putObject(localObject2, l1, localObject3);
            ((Unsafe)localObject6).putInt(localObject2, l2, i5);
            localObject3 = paramzzdt;
          }
          else
          {
            localObject3 = paramzzdt;
          }
          break;
        case 60: 
          if (i7 == 2)
          {
            localObject6 = ((zzga)localObject1).zzu(localObject2, i3, j);
            localObject5 = ((zzga)localObject1).zzr(j);
            i4 = i2;
            localObject3 = paramzzdt;
            i1 = zzdu.zzm(localObject6, (zzgi)localObject5, paramArrayOfByte, i1, paramInt2, paramzzdt);
            ((zzga)localObject1).zzC(localObject2, i3, j, localObject6);
          }
          else
          {
            localObject3 = paramzzdt;
          }
          break;
        case 59: 
          localObject7 = localObject6;
          localObject5 = paramzzdt;
          localObject3 = localObject5;
          if (i7 != 2) {
            break label6330;
          }
          i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject5);
          i3 = zza;
          if (i3 == 0)
          {
            ((Unsafe)localObject7).putObject(localObject2, l1, "");
          }
          else
          {
            if (((i6 & 0x20000000) != 0) && (!zzhn.zzc(paramArrayOfByte, i1, i1 + i3))) {
              throw zzfb.zzb();
            }
            ((Unsafe)localObject7).putObject(localObject2, l1, new String(paramArrayOfByte, i1, i3, zzfa.zzb));
            i1 += i3;
          }
          break;
        case 58: 
          localObject5 = paramzzdt;
          localObject3 = localObject5;
          if (i7 != 0) {
            break label6330;
          }
          i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject5);
          if (zzb != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          localObject3 = Boolean.valueOf(bool);
          break;
        case 57: 
        case 64: 
          localObject3 = paramzzdt;
          if (i7 != 5) {
            break label6330;
          }
          localObject3 = Integer.valueOf(zzdu.zzb(paramArrayOfByte, i1));
          break;
        case 56: 
        case 65: 
          localObject3 = paramzzdt;
          if (i7 != 1) {
            break label6330;
          }
          localObject3 = Long.valueOf(zzdu.zzn(paramArrayOfByte, i1));
          break;
        case 55: 
        case 62: 
          localObject5 = paramzzdt;
          localObject3 = localObject5;
          if (i7 != 0) {
            break label6330;
          }
          i1 = zzdu.zzh(paramArrayOfByte, i1, (zzdt)localObject5);
          ((Unsafe)localObject6).putObject(localObject2, l1, Integer.valueOf(zza));
          break;
        case 53: 
        case 54: 
          localObject5 = paramzzdt;
          localObject3 = localObject5;
          if (i7 != 0) {
            break label6330;
          }
          i1 = zzdu.zzk(paramArrayOfByte, i1, (zzdt)localObject5);
          localObject3 = Long.valueOf(zzb);
          localObject5 = paramzzdt;
          ((Unsafe)localObject6).putObject(localObject2, l1, localObject3);
          ((Unsafe)localObject6).putInt(localObject2, l2, i5);
          localObject3 = localObject5;
          break;
        case 52: 
          localObject3 = paramzzdt;
          if (i7 != 5) {
            break label6330;
          }
          localObject3 = Float.valueOf(Float.intBitsToFloat(zzdu.zzb(paramArrayOfByte, i1)));
          ((Unsafe)localObject6).putObject(localObject2, l1, localObject3);
          i1 += 4;
          break;
        }
        localObject3 = paramzzdt;
        if (i7 == 1)
        {
          localObject3 = Double.valueOf(Double.longBitsToDouble(zzdu.zzn(paramArrayOfByte, i1)));
          ((Unsafe)localObject6).putObject(localObject2, l1, localObject3);
          i1 += 8;
          localObject3 = paramzzdt;
          ((Unsafe)localObject6).putInt(localObject2, l2, i5);
        }
        m = paramInt2;
        if (i1 != n)
        {
          n = i1;
          i2 = i5;
          i1 = k;
          i6 = 0;
          k = paramInt1;
          j = paramInt3;
          i5 = m;
          i3 = i;
          paramInt1 = n;
          m = k;
          n = i4;
          k = i6;
          i = i5;
          continue;
        }
        n = paramInt3;
        j = i;
        i2 = i9;
        i3 = i5;
        i5 = paramInt1;
        paramInt1 = n;
        n = m;
      }
      if ((i4 == paramInt1) && (paramInt1 != 0))
      {
        paramInt3 = i1;
        paramInt2 = n;
        n = i4;
        i1 = k;
        paramObject = localObject4;
        i3 = j;
        i5 = paramInt1;
        break label6538;
      }
      Object localObject6 = zzc(paramObject);
      int i6 = zzdu.zzg(i4, paramArrayOfByte, i1, paramInt2, (zzha)localObject6, paramzzdt);
      m = i5;
      i5 = i3;
      i1 = k;
      i3 = j;
      k = i2;
      i = n;
      j = paramInt1;
      n = i4;
      i2 = i5;
      paramInt1 = i6;
    }
    paramObject = localObject4;
    int i5 = j;
    paramInt2 = i;
    paramInt3 = paramInt1;
    label6538:
    if (i3 != 1048575) {
      ((Unsafe)paramObject).putInt(localObject2, i3, i1);
    }
    paramInt1 = zzi;
    while (paramInt1 < zzj)
    {
      i1 = zzh[paramInt1];
      i4 = zzc[i1];
      paramObject = zzhj.zzf(localObject2, ((zzga)localObject1).zzo(i1) & 0xFFFFF);
      if ((paramObject == null) || (((zzga)localObject1).zzq(i1) == null))
      {
        paramInt1++;
      }
      else
      {
        paramObject = (zzfr)paramObject;
        paramObject = (zzfq)((zzga)localObject1).zzs(i1);
        throw null;
      }
    }
    if (i5 == 0)
    {
      if (paramInt3 != paramInt2) {
        throw zzfb.zzd();
      }
    }
    else {
      if ((paramInt3 > paramInt2) || (n != i5)) {
        break label6684;
      }
    }
    return paramInt3;
    label6684:
    throw zzfb.zzd();
  }
  
  public final Object zzd()
  {
    return ((zzev)zzg).zzc();
  }
  
  public final void zze(Object paramObject)
  {
    if (!zzH(paramObject)) {
      return;
    }
    boolean bool = paramObject instanceof zzev;
    int i = 0;
    Object localObject;
    if (bool)
    {
      localObject = (zzev)paramObject;
      ((zzev)localObject).zzl(Integer.MAX_VALUE);
      zza = 0;
      ((zzev)localObject).zzj();
    }
    int j = zzc.length;
    while (i < j)
    {
      int k = zzo(i);
      int m = zzn(k);
      long l = 0xFFFFF & k;
      if (m != 9)
      {
        if ((m != 60) && (m != 68)) {}
        switch (m)
        {
        default: 
          break;
        case 50: 
          Unsafe localUnsafe = zzb;
          localObject = localUnsafe.getObject(paramObject, l);
          if (localObject == null) {
            break label355;
          }
          ((zzfr)localObject).zzc();
          localUnsafe.putObject(paramObject, l, localObject);
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
          zzk.zza(paramObject, l);
          break label355;
          if (!zzI(paramObject, zzc[i], i)) {
            break label355;
          }
          break;
        }
      }
      else
      {
        if (!zzE(paramObject, i)) {
          break label355;
        }
      }
      zzr(i).zze(zzb.getObject(paramObject, l));
      label355:
      i += 3;
    }
    zzl.zze(paramObject);
  }
  
  /* Error */
  public final void zzf(Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 392	com/google/android/gms/internal/auth/zzga:zzw	(Ljava/lang/Object;)V
    //   4: aload_2
    //   5: invokevirtual 209	java/lang/Object:getClass	()Ljava/lang/Class;
    //   8: pop
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: aload_0
    //   13: getfield 50	com/google/android/gms/internal/auth/zzga:zzc	[I
    //   16: arraylength
    //   17: if_icmpge +714 -> 731
    //   20: aload_0
    //   21: iload_3
    //   22: invokespecial 87	com/google/android/gms/internal/auth/zzga:zzo	(I)I
    //   25: istore 4
    //   27: aload_0
    //   28: getfield 50	com/google/android/gms/internal/auth/zzga:zzc	[I
    //   31: iload_3
    //   32: iaload
    //   33: istore 5
    //   35: iload 4
    //   37: invokestatic 111	com/google/android/gms/internal/auth/zzga:zzn	(I)I
    //   40: istore 6
    //   42: ldc 80
    //   44: iload 4
    //   46: iand
    //   47: i2l
    //   48: lstore 7
    //   50: iload 6
    //   52: tableswitch	default:+292->344, 0:+646->698, 1:+622->674, 2:+598->650, 3:+586->638, 4:+562->614, 5:+550->602, 6:+538->590, 7:+514->566, 8:+490->542, 9:+480->532, 10:+468->520, 11:+456->508, 12:+444->496, 13:+432->484, 14:+420->472, 15:+408->460, 16:+396->448, 17:+480->532, 18:+382->434, 19:+382->434, 20:+382->434, 21:+382->434, 22:+382->434, 23:+382->434, 24:+382->434, 25:+382->434, 26:+382->434, 27:+382->434, 28:+382->434, 29:+382->434, 30:+382->434, 31:+382->434, 32:+382->434, 33:+382->434, 34:+382->434, 35:+382->434, 36:+382->434, 37:+382->434, 38:+382->434, 39:+382->434, 40:+382->434, 41:+382->434, 42:+382->434, 43:+382->434, 44:+382->434, 45:+382->434, 46:+382->434, 47:+382->434, 48:+382->434, 49:+382->434, 50:+353->405, 51:+319->371, 52:+319->371, 53:+319->371, 54:+319->371, 55:+319->371, 56:+319->371, 57:+319->371, 58:+319->371, 59:+319->371, 60:+309->361, 61:+295->347, 62:+295->347, 63:+295->347, 64:+295->347, 65:+295->347, 66:+295->347, 67:+295->347, 68:+309->361
    //   344: goto +381 -> 725
    //   347: aload_0
    //   348: aload_2
    //   349: iload 5
    //   351: iload_3
    //   352: invokespecial 280	com/google/android/gms/internal/auth/zzga:zzI	(Ljava/lang/Object;II)Z
    //   355: ifeq +370 -> 725
    //   358: goto +24 -> 382
    //   361: aload_0
    //   362: aload_1
    //   363: aload_2
    //   364: iload_3
    //   365: invokespecial 682	com/google/android/gms/internal/auth/zzga:zzy	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   368: goto +357 -> 725
    //   371: aload_0
    //   372: aload_2
    //   373: iload 5
    //   375: iload_3
    //   376: invokespecial 280	com/google/android/gms/internal/auth/zzga:zzI	(Ljava/lang/Object;II)Z
    //   379: ifeq +346 -> 725
    //   382: aload_1
    //   383: lload 7
    //   385: aload_2
    //   386: lload 7
    //   388: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   391: invokestatic 684	com/google/android/gms/internal/auth/zzhj:zzp	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   394: aload_0
    //   395: aload_1
    //   396: iload 5
    //   398: iload_3
    //   399: invokespecial 101	com/google/android/gms/internal/auth/zzga:zzA	(Ljava/lang/Object;II)V
    //   402: goto +323 -> 725
    //   405: getstatic 566	com/google/android/gms/internal/auth/zzgk:zza	I
    //   408: istore 4
    //   410: aload_1
    //   411: lload 7
    //   413: aload_1
    //   414: lload 7
    //   416: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   419: aload_2
    //   420: lload 7
    //   422: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   425: invokestatic 639	com/google/android/gms/internal/auth/zzfs:zza	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   428: invokestatic 684	com/google/android/gms/internal/auth/zzhj:zzp	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   431: goto +294 -> 725
    //   434: aload_0
    //   435: getfield 66	com/google/android/gms/internal/auth/zzga:zzk	Lcom/google/android/gms/internal/auth/zzfl;
    //   438: aload_1
    //   439: aload_2
    //   440: lload 7
    //   442: invokevirtual 687	com/google/android/gms/internal/auth/zzfl:zzb	(Ljava/lang/Object;Ljava/lang/Object;J)V
    //   445: goto +280 -> 725
    //   448: aload_0
    //   449: aload_2
    //   450: iload_3
    //   451: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   454: ifeq +271 -> 725
    //   457: goto +202 -> 659
    //   460: aload_0
    //   461: aload_2
    //   462: iload_3
    //   463: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   466: ifeq +259 -> 725
    //   469: goto +36 -> 505
    //   472: aload_0
    //   473: aload_2
    //   474: iload_3
    //   475: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   478: ifeq +247 -> 725
    //   481: goto +178 -> 659
    //   484: aload_0
    //   485: aload_2
    //   486: iload_3
    //   487: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   490: ifeq +235 -> 725
    //   493: goto +12 -> 505
    //   496: aload_0
    //   497: aload_2
    //   498: iload_3
    //   499: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   502: ifeq +223 -> 725
    //   505: goto +118 -> 623
    //   508: aload_0
    //   509: aload_2
    //   510: iload_3
    //   511: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   514: ifeq +211 -> 725
    //   517: goto +106 -> 623
    //   520: aload_0
    //   521: aload_2
    //   522: iload_3
    //   523: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   526: ifeq +199 -> 725
    //   529: goto +22 -> 551
    //   532: aload_0
    //   533: aload_1
    //   534: aload_2
    //   535: iload_3
    //   536: invokespecial 689	com/google/android/gms/internal/auth/zzga:zzx	(Ljava/lang/Object;Ljava/lang/Object;I)V
    //   539: goto +186 -> 725
    //   542: aload_0
    //   543: aload_2
    //   544: iload_3
    //   545: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   548: ifeq +177 -> 725
    //   551: aload_1
    //   552: lload 7
    //   554: aload_2
    //   555: lload 7
    //   557: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   560: invokestatic 684	com/google/android/gms/internal/auth/zzhj:zzp	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   563: goto +156 -> 719
    //   566: aload_0
    //   567: aload_2
    //   568: iload_3
    //   569: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   572: ifeq +153 -> 725
    //   575: aload_1
    //   576: lload 7
    //   578: aload_2
    //   579: lload 7
    //   581: invokestatic 142	com/google/android/gms/internal/auth/zzhj:zzt	(Ljava/lang/Object;J)Z
    //   584: invokestatic 504	com/google/android/gms/internal/auth/zzhj:zzk	(Ljava/lang/Object;JZ)V
    //   587: goto +132 -> 719
    //   590: aload_0
    //   591: aload_2
    //   592: iload_3
    //   593: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   596: ifeq +129 -> 725
    //   599: goto +24 -> 623
    //   602: aload_0
    //   603: aload_2
    //   604: iload_3
    //   605: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   608: ifeq +117 -> 725
    //   611: goto +48 -> 659
    //   614: aload_0
    //   615: aload_2
    //   616: iload_3
    //   617: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   620: ifeq +105 -> 725
    //   623: aload_1
    //   624: lload 7
    //   626: aload_2
    //   627: lload 7
    //   629: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   632: invokestatic 83	com/google/android/gms/internal/auth/zzhj:zzn	(Ljava/lang/Object;JI)V
    //   635: goto +84 -> 719
    //   638: aload_0
    //   639: aload_2
    //   640: iload_3
    //   641: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   644: ifeq +81 -> 725
    //   647: goto +12 -> 659
    //   650: aload_0
    //   651: aload_2
    //   652: iload_3
    //   653: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   656: ifeq +69 -> 725
    //   659: aload_1
    //   660: lload 7
    //   662: aload_2
    //   663: lload 7
    //   665: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   668: invokestatic 691	com/google/android/gms/internal/auth/zzhj:zzo	(Ljava/lang/Object;JJ)V
    //   671: goto +48 -> 719
    //   674: aload_0
    //   675: aload_2
    //   676: iload_3
    //   677: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   680: ifeq +45 -> 725
    //   683: aload_1
    //   684: lload 7
    //   686: aload_2
    //   687: lload 7
    //   689: invokestatic 145	com/google/android/gms/internal/auth/zzhj:zzb	(Ljava/lang/Object;J)F
    //   692: invokestatic 517	com/google/android/gms/internal/auth/zzhj:zzm	(Ljava/lang/Object;JF)V
    //   695: goto +24 -> 719
    //   698: aload_0
    //   699: aload_2
    //   700: iload_3
    //   701: invokespecial 107	com/google/android/gms/internal/auth/zzga:zzE	(Ljava/lang/Object;I)Z
    //   704: ifeq +21 -> 725
    //   707: aload_1
    //   708: lload 7
    //   710: aload_2
    //   711: lload 7
    //   713: invokestatic 154	com/google/android/gms/internal/auth/zzhj:zza	(Ljava/lang/Object;J)D
    //   716: invokestatic 524	com/google/android/gms/internal/auth/zzhj:zzl	(Ljava/lang/Object;JD)V
    //   719: aload_0
    //   720: aload_1
    //   721: iload_3
    //   722: invokespecial 97	com/google/android/gms/internal/auth/zzga:zzz	(Ljava/lang/Object;I)V
    //   725: iinc 3 3
    //   728: goto -717 -> 11
    //   731: aload_0
    //   732: getfield 68	com/google/android/gms/internal/auth/zzga:zzl	Lcom/google/android/gms/internal/auth/zzgz;
    //   735: aload_1
    //   736: aload_2
    //   737: invokestatic 694	com/google/android/gms/internal/auth/zzgk:zzd	(Lcom/google/android/gms/internal/auth/zzgz;Ljava/lang/Object;Ljava/lang/Object;)V
    //   740: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	741	0	this	zzga
    //   0	741	1	paramObject1	Object
    //   0	741	2	paramObject2	Object
    //   10	716	3	i	int
    //   25	384	4	j	int
    //   33	364	5	k	int
    //   40	11	6	m	int
    //   48	664	7	l	long
  }
  
  public final void zzg(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzdt paramzzdt)
  {
    zzb(paramObject, paramArrayOfByte, paramInt1, paramInt2, 0, paramzzdt);
  }
  
  /* Error */
  public final boolean zzh(Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	com/google/android/gms/internal/auth/zzga:zzc	[I
    //   4: arraylength
    //   5: istore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: iload 4
    //   11: iload_3
    //   12: if_icmpge +952 -> 964
    //   15: aload_0
    //   16: iload 4
    //   18: invokespecial 87	com/google/android/gms/internal/auth/zzga:zzo	(I)I
    //   21: istore 5
    //   23: iload 5
    //   25: invokestatic 111	com/google/android/gms/internal/auth/zzga:zzn	(I)I
    //   28: istore 6
    //   30: iload 5
    //   32: ldc 80
    //   34: iand
    //   35: i2l
    //   36: lstore 7
    //   38: iload 6
    //   40: tableswitch	default:+292->332, 0:+880->920, 1:+845->885, 2:+815->855, 3:+785->825, 4:+756->796, 5:+726->766, 6:+697->737, 7:+668->708, 8:+636->676, 9:+604->644, 10:+572->612, 11:+543->583, 12:+514->554, 13:+485->525, 14:+455->495, 15:+426->466, 16:+396->436, 17:+364->404, 18:+343->383, 19:+343->383, 20:+343->383, 21:+343->383, 22:+343->383, 23:+343->383, 24:+343->383, 25:+343->383, 26:+343->383, 27:+343->383, 28:+343->383, 29:+343->383, 30:+343->383, 31:+343->383, 32:+343->383, 33:+343->383, 34:+343->383, 35:+343->383, 36:+343->383, 37:+343->383, 38:+343->383, 39:+343->383, 40:+343->383, 41:+343->383, 42:+343->383, 43:+343->383, 44:+343->383, 45:+343->383, 46:+343->383, 47:+343->383, 48:+343->383, 49:+343->383, 50:+343->383, 51:+295->335, 52:+295->335, 53:+295->335, 54:+295->335, 55:+295->335, 56:+295->335, 57:+295->335, 58:+295->335, 59:+295->335, 60:+295->335, 61:+295->335, 62:+295->335, 63:+295->335, 64:+295->335, 65:+295->335, 66:+295->335, 67:+295->335, 68:+295->335
    //   332: goto +626 -> 958
    //   335: aload_0
    //   336: iload 4
    //   338: invokespecial 79	com/google/android/gms/internal/auth/zzga:zzl	(I)I
    //   341: ldc 80
    //   343: iand
    //   344: i2l
    //   345: lstore 9
    //   347: aload_1
    //   348: lload 9
    //   350: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   353: aload_2
    //   354: lload 9
    //   356: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   359: if_icmpne +597 -> 956
    //   362: aload_1
    //   363: lload 7
    //   365: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   368: aload_2
    //   369: lload 7
    //   371: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   374: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   377: ifne +581 -> 958
    //   380: goto +576 -> 956
    //   383: aload_1
    //   384: lload 7
    //   386: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   389: aload_2
    //   390: lload 7
    //   392: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   395: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   398: ifne +560 -> 958
    //   401: goto +555 -> 956
    //   404: aload_0
    //   405: aload_1
    //   406: aload_2
    //   407: iload 4
    //   409: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   412: ifeq +544 -> 956
    //   415: aload_1
    //   416: lload 7
    //   418: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   421: aload_2
    //   422: lload 7
    //   424: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   427: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   430: ifeq +526 -> 956
    //   433: goto +525 -> 958
    //   436: aload_0
    //   437: aload_1
    //   438: aload_2
    //   439: iload 4
    //   441: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   444: ifeq +512 -> 956
    //   447: aload_1
    //   448: lload 7
    //   450: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   453: aload_2
    //   454: lload 7
    //   456: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   459: lcmp
    //   460: ifne +496 -> 956
    //   463: goto +495 -> 958
    //   466: aload_0
    //   467: aload_1
    //   468: aload_2
    //   469: iload 4
    //   471: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   474: ifeq +482 -> 956
    //   477: aload_1
    //   478: lload 7
    //   480: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   483: aload_2
    //   484: lload 7
    //   486: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   489: if_icmpne +467 -> 956
    //   492: goto +466 -> 958
    //   495: aload_0
    //   496: aload_1
    //   497: aload_2
    //   498: iload 4
    //   500: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   503: ifeq +453 -> 956
    //   506: aload_1
    //   507: lload 7
    //   509: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   512: aload_2
    //   513: lload 7
    //   515: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   518: lcmp
    //   519: ifne +437 -> 956
    //   522: goto +436 -> 958
    //   525: aload_0
    //   526: aload_1
    //   527: aload_2
    //   528: iload 4
    //   530: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   533: ifeq +423 -> 956
    //   536: aload_1
    //   537: lload 7
    //   539: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   542: aload_2
    //   543: lload 7
    //   545: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   548: if_icmpne +408 -> 956
    //   551: goto +407 -> 958
    //   554: aload_0
    //   555: aload_1
    //   556: aload_2
    //   557: iload 4
    //   559: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   562: ifeq +394 -> 956
    //   565: aload_1
    //   566: lload 7
    //   568: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   571: aload_2
    //   572: lload 7
    //   574: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   577: if_icmpne +379 -> 956
    //   580: goto +378 -> 958
    //   583: aload_0
    //   584: aload_1
    //   585: aload_2
    //   586: iload 4
    //   588: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   591: ifeq +365 -> 956
    //   594: aload_1
    //   595: lload 7
    //   597: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   600: aload_2
    //   601: lload 7
    //   603: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   606: if_icmpne +350 -> 956
    //   609: goto +349 -> 958
    //   612: aload_0
    //   613: aload_1
    //   614: aload_2
    //   615: iload 4
    //   617: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   620: ifeq +336 -> 956
    //   623: aload_1
    //   624: lload 7
    //   626: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   629: aload_2
    //   630: lload 7
    //   632: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   635: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   638: ifeq +318 -> 956
    //   641: goto +317 -> 958
    //   644: aload_0
    //   645: aload_1
    //   646: aload_2
    //   647: iload 4
    //   649: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   652: ifeq +304 -> 956
    //   655: aload_1
    //   656: lload 7
    //   658: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   661: aload_2
    //   662: lload 7
    //   664: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   667: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   670: ifeq +286 -> 956
    //   673: goto +285 -> 958
    //   676: aload_0
    //   677: aload_1
    //   678: aload_2
    //   679: iload 4
    //   681: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   684: ifeq +272 -> 956
    //   687: aload_1
    //   688: lload 7
    //   690: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   693: aload_2
    //   694: lload 7
    //   696: invokestatic 117	com/google/android/gms/internal/auth/zzhj:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   699: invokestatic 700	com/google/android/gms/internal/auth/zzgk:zzf	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   702: ifeq +254 -> 956
    //   705: goto +253 -> 958
    //   708: aload_0
    //   709: aload_1
    //   710: aload_2
    //   711: iload 4
    //   713: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   716: ifeq +240 -> 956
    //   719: aload_1
    //   720: lload 7
    //   722: invokestatic 142	com/google/android/gms/internal/auth/zzhj:zzt	(Ljava/lang/Object;J)Z
    //   725: aload_2
    //   726: lload 7
    //   728: invokestatic 142	com/google/android/gms/internal/auth/zzhj:zzt	(Ljava/lang/Object;J)Z
    //   731: if_icmpne +225 -> 956
    //   734: goto +224 -> 958
    //   737: aload_0
    //   738: aload_1
    //   739: aload_2
    //   740: iload 4
    //   742: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   745: ifeq +211 -> 956
    //   748: aload_1
    //   749: lload 7
    //   751: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   754: aload_2
    //   755: lload 7
    //   757: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   760: if_icmpne +196 -> 956
    //   763: goto +195 -> 958
    //   766: aload_0
    //   767: aload_1
    //   768: aload_2
    //   769: iload 4
    //   771: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   774: ifeq +182 -> 956
    //   777: aload_1
    //   778: lload 7
    //   780: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   783: aload_2
    //   784: lload 7
    //   786: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   789: lcmp
    //   790: ifne +166 -> 956
    //   793: goto +165 -> 958
    //   796: aload_0
    //   797: aload_1
    //   798: aload_2
    //   799: iload 4
    //   801: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   804: ifeq +152 -> 956
    //   807: aload_1
    //   808: lload 7
    //   810: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   813: aload_2
    //   814: lload 7
    //   816: invokestatic 123	com/google/android/gms/internal/auth/zzhj:zzc	(Ljava/lang/Object;J)I
    //   819: if_icmpne +137 -> 956
    //   822: goto +136 -> 958
    //   825: aload_0
    //   826: aload_1
    //   827: aload_2
    //   828: iload 4
    //   830: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   833: ifeq +123 -> 956
    //   836: aload_1
    //   837: lload 7
    //   839: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   842: aload_2
    //   843: lload 7
    //   845: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   848: lcmp
    //   849: ifne +107 -> 956
    //   852: goto +106 -> 958
    //   855: aload_0
    //   856: aload_1
    //   857: aload_2
    //   858: iload 4
    //   860: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   863: ifeq +93 -> 956
    //   866: aload_1
    //   867: lload 7
    //   869: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   872: aload_2
    //   873: lload 7
    //   875: invokestatic 120	com/google/android/gms/internal/auth/zzhj:zzd	(Ljava/lang/Object;J)J
    //   878: lcmp
    //   879: ifne +77 -> 956
    //   882: goto +76 -> 958
    //   885: aload_0
    //   886: aload_1
    //   887: aload_2
    //   888: iload 4
    //   890: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   893: ifeq +63 -> 956
    //   896: aload_1
    //   897: lload 7
    //   899: invokestatic 145	com/google/android/gms/internal/auth/zzhj:zzb	(Ljava/lang/Object;J)F
    //   902: invokestatic 378	java/lang/Float:floatToIntBits	(F)I
    //   905: aload_2
    //   906: lload 7
    //   908: invokestatic 145	com/google/android/gms/internal/auth/zzhj:zzb	(Ljava/lang/Object;J)F
    //   911: invokestatic 378	java/lang/Float:floatToIntBits	(F)I
    //   914: if_icmpne +42 -> 956
    //   917: goto +41 -> 958
    //   920: aload_0
    //   921: aload_1
    //   922: aload_2
    //   923: iload 4
    //   925: invokespecial 702	com/google/android/gms/internal/auth/zzga:zzD	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   928: ifeq +28 -> 956
    //   931: aload_1
    //   932: lload 7
    //   934: invokestatic 154	com/google/android/gms/internal/auth/zzhj:zza	(Ljava/lang/Object;J)D
    //   937: invokestatic 381	java/lang/Double:doubleToLongBits	(D)J
    //   940: aload_2
    //   941: lload 7
    //   943: invokestatic 154	com/google/android/gms/internal/auth/zzhj:zza	(Ljava/lang/Object;J)D
    //   946: invokestatic 381	java/lang/Double:doubleToLongBits	(D)J
    //   949: lcmp
    //   950: ifne +6 -> 956
    //   953: goto +5 -> 958
    //   956: iconst_0
    //   957: ireturn
    //   958: iinc 4 3
    //   961: goto -952 -> 9
    //   964: aload_0
    //   965: getfield 68	com/google/android/gms/internal/auth/zzga:zzl	Lcom/google/android/gms/internal/auth/zzgz;
    //   968: aload_1
    //   969: invokevirtual 389	com/google/android/gms/internal/auth/zzgz:zzb	(Ljava/lang/Object;)Ljava/lang/Object;
    //   972: aload_0
    //   973: getfield 68	com/google/android/gms/internal/auth/zzga:zzl	Lcom/google/android/gms/internal/auth/zzgz;
    //   976: aload_2
    //   977: invokevirtual 389	com/google/android/gms/internal/auth/zzgz:zzb	(Ljava/lang/Object;)Ljava/lang/Object;
    //   980: invokevirtual 703	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   983: ifne +5 -> 988
    //   986: iconst_0
    //   987: ireturn
    //   988: iconst_1
    //   989: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	990	0	this	zzga
    //   0	990	1	paramObject1	Object
    //   0	990	2	paramObject2	Object
    //   5	8	3	i	int
    //   7	952	4	j	int
    //   21	14	5	k	int
    //   28	11	6	m	int
    //   36	906	7	l1	long
    //   345	10	9	l2	long
  }
  
  public final boolean zzi(Object paramObject)
  {
    int i = 1048575;
    int j = 0;
    for (int k = j; k < zzi; k++)
    {
      int m = zzh[k];
      int n = zzc[m];
      int i1 = zzo(m);
      int i2 = zzc[(m + 2)];
      int i3 = i2 & 0xFFFFF;
      i2 = 1 << (i2 >>> 20);
      if (i3 != i)
      {
        if (i3 != 1048575)
        {
          long l = i3;
          j = zzb.getInt(paramObject, l);
        }
        i = i3;
      }
      if (((0x10000000 & i1) != 0) && (!zzF(paramObject, m, i, j, i2))) {
        return false;
      }
      i3 = zzn(i1);
      List localList;
      zzgi localzzgi;
      if ((i3 != 9) && (i3 != 17))
      {
        if (i3 != 27) {
          if ((i3 != 60) && (i3 != 68))
          {
            if (i3 != 49)
            {
              if ((i3 != 50) || (((zzfr)zzhj.zzf(paramObject, i1 & 0xFFFFF)).isEmpty())) {
                continue;
              }
              paramObject = (zzfq)zzs(m);
              throw null;
            }
          }
          else
          {
            if ((!zzI(paramObject, n, m)) || (zzG(paramObject, i1, zzr(m)))) {
              continue;
            }
            return false;
          }
        }
        localList = (List)zzhj.zzf(paramObject, i1 & 0xFFFFF);
        if (!localList.isEmpty())
        {
          localzzgi = zzr(m);
          i3 = 0;
        }
      }
      else
      {
        while (i3 < localList.size())
        {
          if (!localzzgi.zzi(localList.get(i3))) {
            return false;
          }
          i3++;
          continue;
          if ((zzF(paramObject, m, i, j, i2)) && (!zzG(paramObject, i1, zzr(m)))) {
            return false;
          }
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */