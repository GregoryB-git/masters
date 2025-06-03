package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Objects;

final class zzau<K, V>
  extends zzan<K, V>
{
  private static final zzan<Object, Object> zza = new zzau(null, new Object[0], 0);
  private final transient Object zzb;
  private final transient Object[] zzc;
  private final transient int zzd;
  
  private zzau(Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    zzb = paramObject;
    zzc = paramArrayOfObject;
    zzd = paramInt;
  }
  
  public static <K, V> zzau<K, V> zza(int paramInt, Object[] paramArrayOfObject, zzaq<K, V> paramzzaq)
  {
    int i = paramInt;
    Object[] arrayOfObject = paramArrayOfObject;
    if (i == 0) {
      return (zzau)zza;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    paramArrayOfObject = null;
    Object localObject3 = null;
    if (i == 1)
    {
      paramArrayOfObject = arrayOfObject[0];
      Objects.requireNonNull(paramArrayOfObject);
      paramzzaq = arrayOfObject[1];
      Objects.requireNonNull(paramzzaq);
      zzag.zza(paramArrayOfObject, paramzzaq);
      return new zzau(null, arrayOfObject, 1);
    }
    zzw.zzb(i, arrayOfObject.length >> 1);
    int j = Math.max(i, 2);
    int k = 1073741824;
    if (j < 751619276)
    {
      paramInt = Integer.highestOneBit(j - 1) << 1;
      for (;;)
      {
        k = paramInt;
        if (paramInt * 0.7D >= j) {
          break;
        }
        paramInt <<= 1;
      }
    }
    if (j < 1073741824) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt != 0)
    {
      if (i == 1)
      {
        localObject4 = arrayOfObject[0];
        Objects.requireNonNull(localObject4);
        localObject3 = arrayOfObject[1];
        Objects.requireNonNull(localObject3);
        zzag.zza(localObject4, localObject3);
      }
      else
      {
        int m = k - 1;
        int n;
        int i1;
        if (k <= 128)
        {
          localObject4 = new byte[k];
          Arrays.fill((byte[])localObject4, (byte)-1);
          paramInt = 0;
          k = paramInt;
          paramArrayOfObject = (Object[])localObject3;
          if (paramInt < i)
          {
            j = paramInt * 2;
            n = k * 2;
            localObject1 = arrayOfObject[j];
            Objects.requireNonNull(localObject1);
            localObject3 = arrayOfObject[(j ^ 0x1)];
            Objects.requireNonNull(localObject3);
            zzag.zza(localObject1, localObject3);
            for (j = zzaf.zza(localObject1.hashCode());; j++)
            {
              j &= m;
              i1 = localObject4[j] & 0xFF;
              if (i1 == 255)
              {
                localObject4[j] = ((byte)(byte)n);
                if (k < paramInt)
                {
                  arrayOfObject[n] = localObject1;
                  arrayOfObject[(n ^ 0x1)] = localObject3;
                }
                k++;
              }
              else
              {
                if (!localObject1.equals(arrayOfObject[i1])) {
                  continue;
                }
                j = i1 ^ 0x1;
                paramArrayOfObject = arrayOfObject[j];
                Objects.requireNonNull(paramArrayOfObject);
                paramArrayOfObject = new zzap(localObject1, localObject3, paramArrayOfObject);
                arrayOfObject[j] = localObject3;
              }
              paramInt++;
              break;
            }
          }
          if (k == i) {
            paramArrayOfObject = (Object[])localObject4;
          }
        }
        label905:
        for (;;)
        {
          for (paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(k), paramArrayOfObject };; paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(k), paramArrayOfObject })
          {
            break label930;
            if (k > 32768) {
              break;
            }
            localObject4 = new short[k];
            Arrays.fill((short[])localObject4, (short)-1);
            paramInt = 0;
            k = paramInt;
            paramArrayOfObject = (Object[])localObject1;
            if (paramInt < i)
            {
              j = paramInt * 2;
              n = k * 2;
              localObject1 = arrayOfObject[j];
              Objects.requireNonNull(localObject1);
              localObject3 = arrayOfObject[(j ^ 0x1)];
              Objects.requireNonNull(localObject3);
              zzag.zza(localObject1, localObject3);
              for (j = zzaf.zza(localObject1.hashCode());; j = i1 + 1)
              {
                i1 = j & m;
                j = localObject4[i1] & 0xFFFF;
                if (j == 65535)
                {
                  localObject4[i1] = ((short)(short)n);
                  if (k < paramInt)
                  {
                    arrayOfObject[n] = localObject1;
                    arrayOfObject[(n ^ 0x1)] = localObject3;
                  }
                  k++;
                }
                else
                {
                  if (!localObject1.equals(arrayOfObject[j])) {
                    continue;
                  }
                  j ^= 0x1;
                  paramArrayOfObject = arrayOfObject[j];
                  Objects.requireNonNull(paramArrayOfObject);
                  paramArrayOfObject = new zzap(localObject1, localObject3, paramArrayOfObject);
                  arrayOfObject[j] = localObject3;
                }
                paramInt++;
                break;
              }
            }
            if (k == i)
            {
              paramArrayOfObject = (Object[])localObject4;
              break label905;
            }
          }
          localObject4 = new int[k];
          Arrays.fill((int[])localObject4, -1);
          paramInt = 0;
          k = paramInt;
          paramArrayOfObject = (Object[])localObject2;
          if (paramInt < i)
          {
            j = paramInt * 2;
            n = k * 2;
            localObject1 = arrayOfObject[j];
            Objects.requireNonNull(localObject1);
            localObject3 = arrayOfObject[(j ^ 0x1)];
            Objects.requireNonNull(localObject3);
            zzag.zza(localObject1, localObject3);
            for (j = zzaf.zza(localObject1.hashCode());; j = i1 + 1)
            {
              i1 = j & m;
              j = localObject4[i1];
              if (j == -1)
              {
                localObject4[i1] = n;
                if (k < paramInt)
                {
                  arrayOfObject[n] = localObject1;
                  arrayOfObject[(n ^ 0x1)] = localObject3;
                }
                k++;
              }
              else
              {
                if (!localObject1.equals(arrayOfObject[j])) {
                  continue;
                }
                j ^= 0x1;
                paramArrayOfObject = arrayOfObject[j];
                Objects.requireNonNull(paramArrayOfObject);
                paramArrayOfObject = new zzap(localObject1, localObject3, paramArrayOfObject);
                arrayOfObject[j] = localObject3;
              }
              paramInt++;
              break;
            }
          }
          if (k != i) {
            break;
          }
          paramArrayOfObject = (Object[])localObject4;
        }
        paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(k), paramArrayOfObject };
      }
      label930:
      Object localObject4 = arrayOfObject;
      localObject3 = paramArrayOfObject;
      if ((paramArrayOfObject instanceof Object[]))
      {
        paramArrayOfObject = (Object[])paramArrayOfObject;
        localObject4 = (zzap)paramArrayOfObject[2];
        if (paramzzaq != null)
        {
          zza = ((com.google.android.gms.internal.firebase-auth-api.zzap)localObject4);
          localObject3 = paramArrayOfObject[0];
          i = ((Integer)paramArrayOfObject[1]).intValue();
          localObject4 = Arrays.copyOf(arrayOfObject, i << 1);
        }
        else
        {
          throw ((zzap)localObject4).zza();
        }
      }
      return new zzau(localObject3, (Object[])localObject4, i);
    }
    throw new IllegalArgumentException("collection too large");
  }
  
  public final V get(Object paramObject)
  {
    Object localObject = zzb;
    Object[] arrayOfObject = zzc;
    int i = zzd;
    if (paramObject == null) {}
    do
    {
      do
      {
        paramObject = null;
        break label292;
        if (i != 1) {
          break;
        }
        localObject = arrayOfObject[0];
        Objects.requireNonNull(localObject);
      } while (!localObject.equals(paramObject));
      paramObject = arrayOfObject[1];
      Objects.requireNonNull(paramObject);
      break;
    } while (localObject == null);
    int k;
    if ((localObject instanceof byte[]))
    {
      localObject = (byte[])localObject;
      j = localObject.length;
      for (i = zzaf.zza(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = localObject[k] & 0xFF;
        if (i == 255) {
          break;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          paramObject = arrayOfObject[(i ^ 0x1)];
          break label292;
        }
      }
    }
    if ((localObject instanceof short[]))
    {
      localObject = (short[])localObject;
      j = localObject.length;
      for (i = zzaf.zza(paramObject.hashCode());; i++)
      {
        i &= j - 1;
        k = localObject[i] & 0xFFFF;
        if (k == 65535) {
          break;
        }
        if (paramObject.equals(arrayOfObject[k]))
        {
          paramObject = arrayOfObject[(k ^ 0x1)];
          break label292;
        }
      }
    }
    localObject = (int[])localObject;
    int j = localObject.length;
    for (i = zzaf.zza(paramObject.hashCode());; i++)
    {
      i &= j - 1;
      k = localObject[i];
      if (k == -1) {
        break;
      }
      if (paramObject.equals(arrayOfObject[k]))
      {
        paramObject = arrayOfObject[(k ^ 0x1)];
        label292:
        if (paramObject == null) {
          return null;
        }
        return (V)paramObject;
      }
    }
  }
  
  public final int size()
  {
    return zzd;
  }
  
  public final zzai<V> zza()
  {
    return new zzay(zzc, 1, zzd);
  }
  
  public final zzas<Map.Entry<K, V>> zzb()
  {
    return new zzat(this, zzc, 0, zzd);
  }
  
  public final zzas<K> zzc()
  {
    return new zzav(this, new zzay(zzc, 0, zzd));
  }
  
  public final boolean zzd()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzau
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */