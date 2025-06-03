package p6;

import V5.n;
import V5.o;
import X5.d;

public abstract class D
{
  public static final Object a(Object paramObject, d paramd)
  {
    paramd = (d)paramObject;
    if ((paramObject instanceof z))
    {
      paramd = n.o;
      paramd = o.a(a);
    }
    return n.a(paramd);
  }
  
  public static final Object b(Object paramObject, g6.l paraml)
  {
    Object localObject = n.b(paramObject);
    if (localObject == null)
    {
      localObject = paramObject;
      if (paraml != null) {
        localObject = new A(paramObject, paraml);
      }
    }
    else
    {
      localObject = new z((Throwable)localObject, false, 2, null);
    }
    return localObject;
  }
  
  public static final Object c(Object paramObject, l paraml)
  {
    paraml = n.b(paramObject);
    if (paraml != null) {
      paramObject = new z(paraml, false, 2, null);
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     p6.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */