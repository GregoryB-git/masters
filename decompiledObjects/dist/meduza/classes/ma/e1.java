package ma;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class e1<E>
  extends c<E>
  implements RandomAccess
{
  public static final e1<Object> d = new e1(new Object[0], 0, false);
  public E[] b;
  public int c;
  
  public e1(E[] paramArrayOfE, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    b = paramArrayOfE;
    c = paramInt;
  }
  
  public final void add(int paramInt, E paramE)
  {
    a();
    if (paramInt >= 0)
    {
      int i = c;
      if (paramInt <= i)
      {
        Object[] arrayOfObject1 = b;
        if (i < arrayOfObject1.length)
        {
          System.arraycopy(arrayOfObject1, paramInt, arrayOfObject1, paramInt + 1, i - paramInt);
        }
        else
        {
          Object[] arrayOfObject2 = new Object[j.d(i, 3, 2, 1)];
          System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, paramInt);
          System.arraycopy(b, paramInt, arrayOfObject2, paramInt + 1, c - paramInt);
          b = arrayOfObject2;
        }
        b[paramInt] = paramE;
        c += 1;
        modCount += 1;
        return;
      }
    }
    paramE = j.n("Index:", paramInt, ", Size:");
    paramE.append(c);
    throw new IndexOutOfBoundsException(paramE.toString());
  }
  
  public final boolean add(E paramE)
  {
    a();
    int i = c;
    Object[] arrayOfObject = b;
    if (i == arrayOfObject.length) {
      b = Arrays.copyOf(arrayOfObject, i * 3 / 2 + 1);
    }
    arrayOfObject = b;
    i = c;
    c = (i + 1);
    arrayOfObject[i] = paramE;
    modCount += 1;
    return true;
  }
  
  public final a0.d c(int paramInt)
  {
    if (paramInt >= c) {
      return new e1(Arrays.copyOf(b, paramInt), c, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final E get(int paramInt)
  {
    h(paramInt);
    return (E)b[paramInt];
  }
  
  public final void h(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < c)) {
      return;
    }
    StringBuilder localStringBuilder = j.n("Index:", paramInt, ", Size:");
    localStringBuilder.append(c);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final E remove(int paramInt)
  {
    a();
    h(paramInt);
    Object[] arrayOfObject = b;
    Object localObject = arrayOfObject[paramInt];
    int i = c;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return (E)localObject;
  }
  
  public final E set(int paramInt, E paramE)
  {
    a();
    h(paramInt);
    Object[] arrayOfObject = b;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramE;
    modCount += 1;
    return (E)localObject;
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     ma.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */