package p1;

import ec.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.TreeMap;
import rb.h;
import t1.d;
import t1.e;

public final class l
  implements e, d
{
  public static final TreeMap<Integer, l> q = new TreeMap();
  public final int a;
  public volatile String b;
  public final long[] c;
  public final double[] d;
  public final String[] e;
  public final byte[][] f;
  public final int[] o;
  public int p;
  
  public l(int paramInt)
  {
    a = paramInt;
    paramInt++;
    o = new int[paramInt];
    c = new long[paramInt];
    d = new double[paramInt];
    e = new String[paramInt];
    f = new byte[paramInt][];
  }
  
  public static final l C(int paramInt, String paramString)
  {
    i.e(paramString, "query");
    synchronized (q)
    {
      Object localObject = ???.ceilingEntry(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        ???.remove(((Map.Entry)localObject).getKey());
        localObject = (l)((Map.Entry)localObject).getValue();
        localObject.getClass();
        b = paramString;
        p = paramInt;
        paramString = (String)localObject;
      }
      else
      {
        localObject = h.a;
        localObject = new l(paramInt);
        b = paramString;
        p = paramInt;
        paramString = (String)localObject;
      }
      return paramString;
    }
  }
  
  public final void F(int paramInt, long paramLong)
  {
    o[paramInt] = 2;
    c[paramInt] = paramLong;
  }
  
  public final void H()
  {
    synchronized (q)
    {
      ???.put(Integer.valueOf(a), this);
      if (???.size() > 15)
      {
        int i = ???.size() - 10;
        localObject1 = ???.descendingKeySet().iterator();
        i.d(localObject1, "queryPool.descendingKeySet().iterator()");
        while (i > 0)
        {
          ((Iterator)localObject1).next();
          ((Iterator)localObject1).remove();
          i--;
        }
      }
      Object localObject1 = h.a;
      return;
    }
  }
  
  public final void T(byte[] paramArrayOfByte, int paramInt)
  {
    o[paramInt] = 5;
    f[paramInt] = paramArrayOfByte;
  }
  
  public final void close() {}
  
  public final void d0(int paramInt)
  {
    o[paramInt] = 1;
  }
  
  public final void f(d paramd)
  {
    int i = p;
    if (1 <= i) {
      for (int j = 1;; j++)
      {
        int k = o[j];
        if (k != 1)
        {
          if (k != 2)
          {
            if (k != 3)
            {
              Object localObject;
              if (k != 4)
              {
                if (k == 5)
                {
                  localObject = f[j];
                  if (localObject != null) {
                    paramd.T((byte[])localObject, j);
                  } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                  }
                }
              }
              else
              {
                localObject = e[j];
                if (localObject != null) {
                  paramd.n(j, (String)localObject);
                } else {
                  throw new IllegalArgumentException("Required value was null.".toString());
                }
              }
            }
            else
            {
              paramd.s(j, d[j]);
            }
          }
          else {
            paramd.F(j, c[j]);
          }
        }
        else {
          paramd.d0(j);
        }
        if (j == i) {
          break;
        }
      }
    }
  }
  
  public final String g()
  {
    String str = b;
    if (str != null) {
      return str;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final void n(int paramInt, String paramString)
  {
    i.e(paramString, "value");
    o[paramInt] = 4;
    e[paramInt] = paramString;
  }
  
  public final void s(int paramInt, double paramDouble)
  {
    o[paramInt] = 3;
    d[paramInt] = paramDouble;
  }
}

/* Location:
 * Qualified Name:     p1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */