package sb;

import ec.i;
import f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

public final class a0<T>
  extends d<T>
  implements RandomAccess
{
  public final Object[] a;
  public final int b;
  public int c;
  public int d;
  
  public a0(Object[] paramArrayOfObject, int paramInt)
  {
    a = paramArrayOfObject;
    int i = 1;
    int j;
    if (paramInt >= 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (paramInt <= paramArrayOfObject.length) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        b = paramArrayOfObject.length;
        d = paramInt;
        return;
      }
      StringBuilder localStringBuilder = a0.j.n("ring buffer filled size: ", paramInt, " cannot be larger than the buffer size: ");
      localStringBuilder.append(paramArrayOfObject.length);
      throw new IllegalArgumentException(localStringBuilder.toString().toString());
    }
    throw new IllegalArgumentException(f.h("ring buffer filled size should not be negative but it is ", paramInt).toString());
  }
  
  public final int a()
  {
    return d;
  }
  
  public final T get(int paramInt)
  {
    int i = a();
    if ((paramInt >= 0) && (paramInt < i)) {
      return (T)a[((c + paramInt) % b)];
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final void h(int paramInt)
  {
    int i = 1;
    int j;
    if (paramInt >= 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (paramInt <= d) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        if (paramInt > 0)
        {
          int k = c;
          j = b;
          i = (k + paramInt) % j;
          if (k > i)
          {
            j.m(a, k, j);
            j.m(a, 0, i);
          }
          else
          {
            j.m(a, k, i);
          }
          c = i;
          d -= paramInt;
        }
        return;
      }
      StringBuilder localStringBuilder = a0.j.n("n shouldn't be greater than the buffer size: n = ", paramInt, ", size = ");
      localStringBuilder.append(d);
      throw new IllegalArgumentException(localStringBuilder.toString().toString());
    }
    throw new IllegalArgumentException(f.h("n shouldn't be negative but it is ", paramInt).toString());
  }
  
  public final Iterator<T> iterator()
  {
    return new a(this);
  }
  
  public final Object[] toArray()
  {
    return toArray(new Object[a()]);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    int i = paramArrayOfT.length;
    int j = d;
    Object localObject = paramArrayOfT;
    if (i < j)
    {
      localObject = Arrays.copyOf(paramArrayOfT, j);
      i.d(localObject, "copyOf(...)");
    }
    int k = d;
    int m = c;
    int n = 0;
    j = 0;
    int i1;
    for (;;)
    {
      i = n;
      i1 = j;
      if (j >= k) {
        break;
      }
      i = n;
      i1 = j;
      if (m >= b) {
        break;
      }
      localObject[j] = a[m];
      j++;
      m++;
    }
    while (i1 < k)
    {
      localObject[i1] = a[i];
      i1++;
      i++;
    }
    if (k < localObject.length) {
      localObject[k] = null;
    }
    return (T[])localObject;
  }
  
  public static final class a
    extends c<T>
  {
    public int c;
    public int d;
    
    public a(a0<T> parama0)
    {
      c = parama0.a();
      d = c;
    }
  }
}

/* Location:
 * Qualified Name:     sb.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */