package d8;

import e0.d;
import o9.l;
import t9.a;
import t9.a.a;
import t9.b;

public final class s<T>
  implements b<T>, a<T>
{
  public static final d c = new d(21);
  public static final r d = new r(0);
  public a.a<T> a;
  public volatile b<T> b;
  
  public s(d paramd, b paramb)
  {
    a = paramd;
    b = paramb;
  }
  
  public final void a(a.a<T> parama)
  {
    Object localObject1 = b;
    Object localObject2 = d;
    if (localObject1 != localObject2)
    {
      parama.h((b)localObject1);
      return;
    }
    localObject1 = null;
    try
    {
      b localb = b;
      if (localb != localObject2)
      {
        localObject1 = localb;
      }
      else
      {
        a.a locala = a;
        localObject2 = new o9/l;
        ((l)localObject2).<init>(6, locala, parama);
        a = ((a.a)localObject2);
      }
      if (localObject1 != null) {
        parama.h(localb);
      }
      return;
    }
    finally {}
  }
  
  public final T get()
  {
    return (T)b.get();
  }
}

/* Location:
 * Qualified Name:     d8.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */