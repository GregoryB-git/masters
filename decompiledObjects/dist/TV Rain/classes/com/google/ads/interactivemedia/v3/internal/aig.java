package com.google.ads.interactivemedia.v3.internal;

import a;
import java.util.Arrays;
import java.util.Map.Entry;

final class aig<K, V>
  extends aib<K, V>
{
  private static final aib<Object, Object> a = new aig(null, new Object[0], 0);
  private static final long serialVersionUID = 0L;
  private final transient Object b;
  private final transient Object[] c;
  private final transient int d;
  
  private aig(Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    b = paramObject;
    c = paramArrayOfObject;
    d = paramInt;
  }
  
  public static <K, V> aig<K, V> a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == 0) {
      return (aig)a;
    }
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    if (paramInt == 1)
    {
      aim.a(paramArrayOfObject[0], paramArrayOfObject[1]);
      return new aig(null, paramArrayOfObject, 1);
    }
    ahf.b(paramInt, paramArrayOfObject.length >> 1);
    int m = aid.a(paramInt);
    if (paramInt == 1)
    {
      aim.a(paramArrayOfObject[0], paramArrayOfObject[1]);
    }
    else
    {
      int n = m - 1;
      Object localObject2;
      Object localObject3;
      if (m <= 128)
      {
        localObject2 = new byte[m];
        Arrays.fill((byte[])localObject2, (byte)-1);
        localObject1 = localObject2;
        if (k < paramInt)
        {
          j = k * 2;
          localObject3 = paramArrayOfObject[j];
          localObject1 = paramArrayOfObject[(j ^ 0x1)];
          aim.a(localObject3, localObject1);
          for (i = aim.e(localObject3.hashCode());; i++)
          {
            i &= n;
            m = localObject2[i] & 0xFF;
            if (m == 255)
            {
              localObject2[i] = ((byte)(byte)j);
              k++;
              break;
            }
            if (paramArrayOfObject[m].equals(localObject3)) {
              break label202;
            }
          }
          label202:
          throw a(localObject3, localObject1, paramArrayOfObject, m);
        }
      }
      for (;;)
      {
        break;
        if (m <= 32768)
        {
          localObject2 = new short[m];
          Arrays.fill((short[])localObject2, (short)-1);
          k = i;
          localObject1 = localObject2;
          if (k < paramInt)
          {
            j = k * 2;
            localObject1 = paramArrayOfObject[j];
            localObject3 = paramArrayOfObject[(j ^ 0x1)];
            aim.a(localObject1, localObject3);
            for (i = aim.e(localObject1.hashCode());; i = m + 1)
            {
              m = i & n;
              i = localObject2[m] & 0xFFFF;
              if (i == 65535)
              {
                localObject2[m] = ((short)(short)j);
                k++;
                break;
              }
              if (paramArrayOfObject[i].equals(localObject1)) {
                break label333;
              }
            }
            label333:
            throw a(localObject1, localObject3, paramArrayOfObject, i);
          }
        }
        else
        {
          localObject2 = new int[m];
          Arrays.fill((int[])localObject2, -1);
          k = j;
          localObject1 = localObject2;
          if (k < paramInt)
          {
            j = k * 2;
            localObject1 = paramArrayOfObject[j];
            localObject3 = paramArrayOfObject[(j ^ 0x1)];
            aim.a(localObject1, localObject3);
            for (i = aim.e(localObject1.hashCode());; i++)
            {
              i &= n;
              m = localObject2[i];
              if (m == -1)
              {
                localObject2[i] = j;
                k++;
                break;
              }
              if (paramArrayOfObject[m].equals(localObject1)) {
                break label446;
              }
            }
            label446:
            throw a(localObject1, localObject3, paramArrayOfObject, m);
          }
        }
      }
    }
    return new aig(localObject1, paramArrayOfObject, paramInt);
  }
  
  private static IllegalArgumentException a(Object paramObject1, Object paramObject2, Object[] paramArrayOfObject, int paramInt)
  {
    String str = String.valueOf(paramObject1);
    paramObject2 = String.valueOf(paramObject2);
    paramObject1 = String.valueOf(paramArrayOfObject[paramInt]);
    paramArrayOfObject = String.valueOf(paramArrayOfObject[(paramInt ^ 0x1)]);
    paramInt = str.length();
    int i = ((String)paramObject2).length();
    int j = ((String)paramObject1).length();
    paramObject2 = a.q(paramArrayOfObject.length() + (j + (i + (paramInt + 39))), "Multiple entries with same key: ", str, "=", (String)paramObject2);
    ((StringBuilder)paramObject2).append(" and ");
    ((StringBuilder)paramObject2).append((String)paramObject1);
    ((StringBuilder)paramObject2).append("=");
    ((StringBuilder)paramObject2).append(paramArrayOfObject);
    return new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
  
  public final aid<Map.Entry<K, V>> b()
  {
    return new aij(this, c, 0, d);
  }
  
  public final aid<K> c()
  {
    return new ail(this, new aik(c, 0, d));
  }
  
  public final ahx<V> d()
  {
    return new aik(c, 1, d);
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final V get(Object paramObject)
  {
    Object localObject = b;
    Object[] arrayOfObject = c;
    int i = d;
    if (paramObject == null) {
      return null;
    }
    if (i == 1)
    {
      if (arrayOfObject[0].equals(paramObject)) {
        return (V)arrayOfObject[1];
      }
      return null;
    }
    if (localObject == null) {
      return null;
    }
    int k;
    if ((localObject instanceof byte[]))
    {
      localObject = (byte[])localObject;
      j = localObject.length;
      for (i = aim.e(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = localObject[k] & 0xFF;
        if (i == 255) {
          return null;
        }
        if (arrayOfObject[i].equals(paramObject)) {
          return (V)arrayOfObject[(i ^ 0x1)];
        }
      }
    }
    if ((localObject instanceof short[]))
    {
      localObject = (short[])localObject;
      j = localObject.length;
      for (i = aim.e(paramObject.hashCode());; i++)
      {
        i &= j - 1;
        k = localObject[i] & 0xFFFF;
        if (k == 65535) {
          return null;
        }
        if (arrayOfObject[k].equals(paramObject)) {
          return (V)arrayOfObject[(k ^ 0x1)];
        }
      }
    }
    localObject = (int[])localObject;
    int j = localObject.length;
    for (i = aim.e(paramObject.hashCode());; i = k + 1)
    {
      k = i & j - 1;
      i = localObject[k];
      if (i == -1) {
        return null;
      }
      if (arrayOfObject[i].equals(paramObject)) {
        return (V)arrayOfObject[(i ^ 0x1)];
      }
    }
  }
  
  public final int size()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */