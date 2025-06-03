package kc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ub.e;
import vb.a;

public final class c<T>
  extends d<T>
  implements Iterator<T>, e<rb.h>
{
  public int a;
  public T b;
  public e<? super rb.h> c;
  
  public final void a(Object paramObject, e parame)
  {
    b = paramObject;
    a = 3;
    c = parame;
    paramObject = a.a;
    ec.i.e(parame, "frame");
  }
  
  public final RuntimeException c()
  {
    int i = a;
    Object localObject;
    if (i != 4)
    {
      if (i != 5)
      {
        localObject = f.l("Unexpected state of the iterator: ");
        ((StringBuilder)localObject).append(a);
        localObject = new IllegalStateException(((StringBuilder)localObject).toString());
      }
      else
      {
        localObject = new IllegalStateException("Iterator has failed.");
      }
    }
    else {
      localObject = new NoSuchElementException();
    }
    return (RuntimeException)localObject;
  }
  
  public final ub.h getContext()
  {
    return ub.i.a;
  }
  
  public final boolean hasNext()
  {
    for (;;)
    {
      int i = a;
      if (i != 0)
      {
        if (i != 1)
        {
          if ((i != 2) && (i != 3))
          {
            if (i == 4) {
              return false;
            }
            throw c();
          }
          return true;
        }
        ec.i.b(null);
        throw null;
      }
      a = 5;
      e locale = c;
      ec.i.b(locale);
      c = null;
      locale.resumeWith(rb.h.a);
    }
  }
  
  public final T next()
  {
    int i = a;
    if ((i != 0) && (i != 1))
    {
      if (i != 2)
      {
        if (i == 3)
        {
          a = 0;
          Object localObject = b;
          b = null;
          return (T)localObject;
        }
        throw c();
      }
      a = 1;
      ec.i.b(null);
      throw null;
    }
    if (hasNext()) {
      return (T)next();
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void resumeWith(Object paramObject)
  {
    rb.f.b(paramObject);
    a = 4;
  }
}

/* Location:
 * Qualified Name:     kc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */