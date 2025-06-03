package X2;

import W2.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class t
  extends AbstractCollection
  implements Serializable
{
  public static final Object[] o = new Object[0];
  private static final long serialVersionUID = 912559L;
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public v a()
  {
    v localv;
    if (isEmpty()) {
      localv = v.Y();
    } else {
      localv = v.s(toArray());
    }
    return localv;
  }
  
  public final boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public abstract int d(Object[] paramArrayOfObject, int paramInt);
  
  public Object[] f()
  {
    return null;
  }
  
  public int g()
  {
    throw new UnsupportedOperationException();
  }
  
  public int i()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean k();
  
  public abstract g0 q();
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(o);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    m.j(paramArrayOfObject);
    int i = size();
    Object[] arrayOfObject;
    if (paramArrayOfObject.length < i)
    {
      arrayOfObject = f();
      if (arrayOfObject != null) {
        return Q.a(arrayOfObject, i(), g(), paramArrayOfObject);
      }
      arrayOfObject = O.d(paramArrayOfObject, i);
    }
    else
    {
      arrayOfObject = paramArrayOfObject;
      if (paramArrayOfObject.length > i)
      {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      }
    }
    d(arrayOfObject, 0);
    return arrayOfObject;
  }
  
  public Object writeReplace()
  {
    return new v.d(toArray());
  }
  
  public static abstract class a
    extends t.b
  {
    public Object[] a;
    public int b;
    public boolean c;
    
    public a(int paramInt)
    {
      i.b(paramInt, "initialCapacity");
      a = new Object[paramInt];
      b = 0;
    }
    
    public t.b b(Iterable paramIterable)
    {
      if ((paramIterable instanceof Collection))
      {
        Collection localCollection = (Collection)paramIterable;
        g(b + localCollection.size());
        if ((localCollection instanceof t))
        {
          b = ((t)localCollection).d(a, b);
          return this;
        }
      }
      super.b(paramIterable);
      return this;
    }
    
    public a d(Object paramObject)
    {
      m.j(paramObject);
      g(b + 1);
      Object[] arrayOfObject = a;
      int i = b;
      b = (i + 1);
      arrayOfObject[i] = paramObject;
      return this;
    }
    
    public t.b e(Object... paramVarArgs)
    {
      f(paramVarArgs, paramVarArgs.length);
      return this;
    }
    
    public final void f(Object[] paramArrayOfObject, int paramInt)
    {
      O.c(paramArrayOfObject, paramInt);
      g(b + paramInt);
      System.arraycopy(paramArrayOfObject, 0, a, b, paramInt);
      b += paramInt;
    }
    
    public final void g(int paramInt)
    {
      Object[] arrayOfObject = a;
      if (arrayOfObject.length < paramInt) {}
      for (a = Arrays.copyOf(arrayOfObject, t.b.c(arrayOfObject.length, paramInt));; a = ((Object[])arrayOfObject.clone()))
      {
        c = false;
        break;
        if (!c) {
          break;
        }
      }
    }
  }
  
  public static abstract class b
  {
    public static int c(int paramInt1, int paramInt2)
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
    
    public abstract b a(Object paramObject);
    
    public b b(Iterable paramIterable)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext()) {
        a(paramIterable.next());
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     X2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */