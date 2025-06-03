package B3;

import r4.b;

public class x
  implements b
{
  public static final Object c = new Object();
  public volatile Object a = c;
  public volatile b b;
  
  public x(b paramb)
  {
    b = paramb;
  }
  
  public Object get()
  {
    Object localObject1 = a;
    Object localObject2 = c;
    Object localObject3 = localObject1;
    if (localObject1 == localObject2)
    {
      try
      {
        localObject1 = a;
        localObject3 = localObject1;
        if (localObject1 == localObject2)
        {
          localObject3 = b.get();
          a = localObject3;
          b = null;
        }
      }
      finally
      {
        break label62;
      }
      return localObject4;
      label62:
      throw ((Throwable)localObject4);
    }
    return localObject4;
  }
}

/* Location:
 * Qualified Name:     B3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */