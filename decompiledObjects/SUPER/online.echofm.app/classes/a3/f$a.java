package a3;

import W2.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class f$a
  extends AbstractList
  implements RandomAccess, Serializable
{
  private static final long serialVersionUID = 0L;
  public final int[] o;
  public final int p;
  public final int q;
  
  public f$a(int[] paramArrayOfInt)
  {
    this(paramArrayOfInt, 0, paramArrayOfInt.length);
  }
  
  public f$a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    o = paramArrayOfInt;
    p = paramInt1;
    q = paramInt2;
  }
  
  public Integer a(int paramInt)
  {
    m.h(paramInt, size());
    return Integer.valueOf(o[(p + paramInt)]);
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Integer)) && (f.a(o, ((Integer)paramObject).intValue(), p, q) != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Integer d(int paramInt, Integer paramInteger)
  {
    m.h(paramInt, size());
    int[] arrayOfInt = o;
    int i = p;
    int j = arrayOfInt[(i + paramInt)];
    arrayOfInt[(i + paramInt)] = ((Integer)m.j(paramInteger)).intValue();
    return Integer.valueOf(j);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      int i = size();
      if (((a)paramObject).size() != i) {
        return false;
      }
      for (int j = 0; j < i; j++) {
        if (o[(p + j)] != o[(p + j)]) {
          return false;
        }
      }
      return true;
    }
    return super.equals(paramObject);
  }
  
  public int[] f()
  {
    return Arrays.copyOfRange(o, p, q);
  }
  
  public int hashCode()
  {
    int i = p;
    int j = 1;
    while (i < q)
    {
      j = j * 31 + f.i(o[i]);
      i++;
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    if ((paramObject instanceof Integer))
    {
      int i = f.a(o, ((Integer)paramObject).intValue(), p, q);
      if (i >= 0) {
        return i - p;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    if ((paramObject instanceof Integer))
    {
      int i = f.b(o, ((Integer)paramObject).intValue(), p, q);
      if (i >= 0) {
        return i - p;
      }
    }
    return -1;
  }
  
  public int size()
  {
    return q - p;
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    m.n(paramInt1, paramInt2, size());
    if (paramInt1 == paramInt2) {
      return Collections.emptyList();
    }
    int[] arrayOfInt = o;
    int i = p;
    return new a(arrayOfInt, paramInt1 + i, i + paramInt2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(size() * 5);
    localStringBuilder.append('[');
    localStringBuilder.append(o[p]);
    int i = p;
    for (;;)
    {
      i++;
      if (i >= q) {
        break;
      }
      localStringBuilder.append(", ");
      localStringBuilder.append(o[i]);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     a3.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */