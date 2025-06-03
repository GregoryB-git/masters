package o7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p2.m0;

public abstract class r<E>
  extends AbstractCollection<E>
  implements Serializable
{
  public static final Object[] a = new Object[0];
  
  public t<E> a()
  {
    Object localObject;
    if (isEmpty())
    {
      localObject = t.b;
      localObject = l0.e;
    }
    else
    {
      localObject = toArray();
      t.b localb = t.b;
      localObject = t.o(localObject.length, (Object[])localObject);
    }
    return (t<E>)localObject;
  }
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public int h(int paramInt, Object[] paramArrayOfObject)
  {
    x0 localx0 = n();
    while (localx0.hasNext())
    {
      paramArrayOfObject[paramInt] = localx0.next();
      paramInt++;
    }
    return paramInt;
  }
  
  public Object[] i()
  {
    return null;
  }
  
  public int k()
  {
    throw new UnsupportedOperationException();
  }
  
  public int l()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean m();
  
  public abstract x0<E> n();
  
  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(a);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    paramArrayOfT.getClass();
    int i = size();
    Object localObject;
    if (paramArrayOfT.length < i)
    {
      localObject = i();
      if (localObject != null) {
        return Arrays.copyOfRange((Object[])localObject, l(), k(), paramArrayOfT.getClass());
      }
      if (paramArrayOfT.length != 0) {
        paramArrayOfT = Arrays.copyOf(paramArrayOfT, 0);
      }
      localObject = Arrays.copyOf(paramArrayOfT, i);
    }
    else
    {
      localObject = paramArrayOfT;
      if (paramArrayOfT.length > i)
      {
        paramArrayOfT[i] = null;
        localObject = paramArrayOfT;
      }
    }
    h(0, (Object[])localObject);
    return (T[])localObject;
  }
  
  public static abstract class a<E>
    extends r.b<E>
  {
    public Object[] a;
    public int b;
    public boolean c;
    
    public a()
    {
      m0.o(4, "initialCapacity");
      a = new Object[4];
      b = 0;
    }
    
    public final void b(int paramInt)
    {
      Object[] arrayOfObject = a;
      if (arrayOfObject.length < paramInt) {}
      for (a = Arrays.copyOf(arrayOfObject, r.b.a(arrayOfObject.length, paramInt));; a = ((Object[])arrayOfObject.clone()))
      {
        c = false;
        break;
        if (!c) {
          break;
        }
      }
    }
  }
  
  public static abstract class b<E>
  {
    public static int a(int paramInt1, int paramInt2)
    {
      if (paramInt2 >= 0)
      {
        int i = paramInt1 + (paramInt1 >> 1) + 1;
        paramInt1 = i;
        if (i < paramInt2) {
          paramInt1 = Integer.highestOneBit(paramInt2 - 1) << 1;
        }
        paramInt2 = paramInt1;
        if (paramInt1 < 0) {
          paramInt2 = Integer.MAX_VALUE;
        }
        return paramInt2;
      }
      throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
  }
}

/* Location:
 * Qualified Name:     o7.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */