package d8;

import t9.b;

public final class o<T>
  implements b<T>
{
  public static final Object c = new Object();
  public volatile Object a = c;
  public volatile b<T> b;
  
  public o(b<T> paramb)
  {
    b = paramb;
  }
  
  public final T get()
  {
    Object localObject1 = a;
    Object localObject2 = c;
    Object localObject3 = localObject1;
    if (localObject1 == localObject2) {
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
      finally {}
    }
    return ?;
  }
}

/* Location:
 * Qualified Name:     d8.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */