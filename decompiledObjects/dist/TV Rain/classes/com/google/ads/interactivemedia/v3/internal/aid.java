package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Set;

public abstract class aid<E>
  extends ahx<E>
  implements Set<E>
{
  private transient ahw<E> a;
  
  public static int a(int paramInt)
  {
    int i = Math.max(paramInt, 2);
    boolean bool = true;
    if (i < 751619276)
    {
      paramInt = Integer.highestOneBit(i - 1) << 1;
      while (paramInt * 0.7D < i) {
        paramInt <<= 1;
      }
      return paramInt;
    }
    if (i >= 1073741824) {
      bool = false;
    }
    ahf.a(bool, "collection too large");
    return 1073741824;
  }
  
  private static <E> aid<E> a(int paramInt, Object... paramVarArgs)
  {
    int i = paramInt;
    while (i != 0) {
      if (i != 1)
      {
        int j = a(i);
        Object[] arrayOfObject = new Object[j];
        int k = j - 1;
        int m = 0;
        int n = m;
        Object localObject1;
        int i4;
        for (paramInt = n; m < i; paramInt = i4)
        {
          localObject1 = aim.a(paramVarArgs[m], m);
          int i1 = localObject1.hashCode();
          int i3;
          for (int i2 = aim.e(i1);; i2++)
          {
            i3 = i2 & k;
            Object localObject2 = arrayOfObject[i3];
            if (localObject2 == null)
            {
              paramVarArgs[paramInt] = localObject1;
              arrayOfObject[i3] = localObject1;
              i3 = n + i1;
              i4 = paramInt + 1;
              break;
            }
            i3 = n;
            i4 = paramInt;
            if (localObject2.equals(localObject1)) {
              break;
            }
          }
          m++;
          n = i3;
        }
        Arrays.fill(paramVarArgs, paramInt, i, null);
        if (paramInt == 1) {
          return new aip(paramVarArgs[0], n);
        }
        if (a(paramInt) < j / 2)
        {
          i = paramInt;
        }
        else
        {
          i = paramVarArgs.length;
          localObject1 = paramVarArgs;
          if (paramInt < (i >> 1) + (i >> 2)) {
            localObject1 = Arrays.copyOf(paramVarArgs, paramInt);
          }
          return new ain((Object[])localObject1, n, arrayOfObject, k, paramInt);
        }
      }
      else
      {
        return a(paramVarArgs[0]);
      }
    }
    return ain.a;
  }
  
  private static <E> aid<E> a(E paramE)
  {
    return new aip(paramE);
  }
  
  public static <E> aid<E> a(E[] paramArrayOfE)
  {
    int i = paramArrayOfE.length;
    if (i != 0)
    {
      if (i != 1) {
        return a(paramArrayOfE.length, (Object[])paramArrayOfE.clone());
      }
      return a(paramArrayOfE[0]);
    }
    return ain.a;
  }
  
  public boolean a()
  {
    return false;
  }
  
  public abstract aio<E> b();
  
  public ahw<E> c()
  {
    ahw localahw1 = a;
    ahw localahw2 = localahw1;
    if (localahw1 == null)
    {
      localahw2 = h();
      a = localahw2;
    }
    return localahw2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof aid)) && (a()) && (((aid)paramObject).a()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    return aim.a(this, paramObject);
  }
  
  public ahw<E> h()
  {
    return ahw.b(toArray());
  }
  
  public int hashCode()
  {
    return aim.a(this);
  }
  
  public Object writeReplace()
  {
    return new aic(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aid
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */