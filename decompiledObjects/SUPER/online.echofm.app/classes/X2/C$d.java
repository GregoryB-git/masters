package X2;

import java.util.NoSuchElementException;

public final class C$d
  extends g0
{
  public static final Object p = new Object();
  public Object o;
  
  public C$d(Object paramObject)
  {
    o = paramObject;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o != p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object next()
  {
    Object localObject1 = o;
    Object localObject2 = p;
    if (localObject1 != localObject2)
    {
      o = localObject2;
      return localObject1;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     X2.C.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */