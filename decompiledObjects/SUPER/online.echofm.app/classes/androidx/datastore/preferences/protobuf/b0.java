package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class b0
  extends c
  implements RandomAccess
{
  public static final b0 r;
  public Object[] p;
  public int q;
  
  static
  {
    b0 localb0 = new b0(new Object[0], 0);
    r = localb0;
    localb0.j();
  }
  
  public b0(Object[] paramArrayOfObject, int paramInt)
  {
    p = paramArrayOfObject;
    q = paramInt;
  }
  
  public static Object[] d(int paramInt)
  {
    return new Object[paramInt];
  }
  
  public static b0 f()
  {
    return r;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    a();
    if (paramInt >= 0)
    {
      int i = q;
      if (paramInt <= i)
      {
        Object[] arrayOfObject = p;
        if (i < arrayOfObject.length)
        {
          System.arraycopy(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt);
        }
        else
        {
          arrayOfObject = d(i * 3 / 2 + 1);
          System.arraycopy(p, 0, arrayOfObject, 0, paramInt);
          System.arraycopy(p, paramInt, arrayOfObject, paramInt + 1, q - paramInt);
          p = arrayOfObject;
        }
        p[paramInt] = paramObject;
        q += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(i(paramInt));
  }
  
  public boolean add(Object paramObject)
  {
    a();
    int i = q;
    Object[] arrayOfObject = p;
    if (i == arrayOfObject.length) {
      p = Arrays.copyOf(arrayOfObject, i * 3 / 2 + 1);
    }
    arrayOfObject = p;
    i = q;
    q = (i + 1);
    arrayOfObject[i] = paramObject;
    modCount += 1;
    return true;
  }
  
  public final void g(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < q)) {
      return;
    }
    throw new IndexOutOfBoundsException(i(paramInt));
  }
  
  public Object get(int paramInt)
  {
    g(paramInt);
    return p[paramInt];
  }
  
  public final String i(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public b0 k(int paramInt)
  {
    if (paramInt >= q) {
      return new b0(Arrays.copyOf(p, paramInt), q);
    }
    throw new IllegalArgumentException();
  }
  
  public Object remove(int paramInt)
  {
    a();
    g(paramInt);
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    int i = q;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    q -= 1;
    modCount += 1;
    return localObject;
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    a();
    g(paramInt);
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    modCount += 1;
    return localObject;
  }
  
  public int size()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */