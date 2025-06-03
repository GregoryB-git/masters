package M4;

import java.util.NoSuchElementException;

public final class g
{
  public final Object a;
  
  public g()
  {
    a = null;
  }
  
  public g(Object paramObject)
  {
    if (paramObject != null)
    {
      a = paramObject;
      return;
    }
    throw new NullPointerException("value for optional is empty.");
  }
  
  public static g a()
  {
    return new g();
  }
  
  public static g b(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = a();
    } else {
      paramObject = e(paramObject);
    }
    return (g)paramObject;
  }
  
  public static g e(Object paramObject)
  {
    return new g(paramObject);
  }
  
  public Object c()
  {
    Object localObject = a;
    if (localObject != null) {
      return localObject;
    }
    throw new NoSuchElementException("No value present");
  }
  
  public boolean d()
  {
    boolean bool;
    if (a != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     M4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */