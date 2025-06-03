package o7;

import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p2.m0;
import r7.a;
import x6.b;

public final class c0
{
  public static Object a(int paramInt)
  {
    if ((paramInt >= 2) && (paramInt <= 1073741824) && (Integer.highestOneBit(paramInt) == paramInt))
    {
      if (paramInt <= 256) {
        return new byte[paramInt];
      }
      if (paramInt <= 65536) {
        return new short[paramInt];
      }
      return new int[paramInt];
    }
    throw new IllegalArgumentException(f.h("must be power of 2 between 2^1 and 2^30: ", paramInt));
  }
  
  public static ArrayList b(Iterator paramIterator)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterator.getClass();
    while (paramIterator.hasNext()) {
      localArrayList.add(paramIterator.next());
    }
    return localArrayList;
  }
  
  @SafeVarargs
  public static ArrayList c(Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    m0.o(i, "arraySize");
    ArrayList localArrayList = new ArrayList(a.E(i + 5L + i / 10));
    Collections.addAll(localArrayList, paramVarArgs);
    return localArrayList;
  }
  
  public static int d(int paramInt)
  {
    int i;
    if (paramInt < 32) {
      i = 4;
    } else {
      i = 2;
    }
    return (paramInt + 1) * i;
  }
  
  public static int e(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3, int[] paramArrayOfInt, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = b.s0(paramObject1);
    int j = i & paramInt;
    int k = f(j, paramObject3);
    if (k == 0) {
      return -1;
    }
    int m = paramInt;
    int n = -1;
    for (;;)
    {
      k--;
      int i1 = paramArrayOfInt[k];
      if (((i1 & m) == (i & m)) && (b.Q(paramObject1, paramArrayOfObject1[k])) && ((paramArrayOfObject2 == null) || (b.Q(paramObject2, paramArrayOfObject2[k]))))
      {
        i1 &= paramInt;
        if (n == -1) {
          g(paramObject3, j, i1);
        } else {
          paramArrayOfInt[n] = (i1 & paramInt | paramArrayOfInt[n] & m);
        }
        return k;
      }
      i1 &= paramInt;
      if (i1 == 0) {
        return -1;
      }
      n = k;
      k = i1;
    }
  }
  
  public static int f(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return ((byte[])paramObject)[paramInt] & 0xFF;
    }
    if ((paramObject instanceof short[])) {
      return ((short[])paramObject)[paramInt] & 0xFFFF;
    }
    return ((int[])paramObject)[paramInt];
  }
  
  public static void g(Object paramObject, int paramInt1, int paramInt2)
  {
    if ((paramObject instanceof byte[])) {
      ((byte[])paramObject)[paramInt1] = ((byte)(byte)paramInt2);
    } else if ((paramObject instanceof short[])) {
      ((short[])paramObject)[paramInt1] = ((short)(short)paramInt2);
    } else {
      ((int[])paramObject)[paramInt1] = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     o7.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */