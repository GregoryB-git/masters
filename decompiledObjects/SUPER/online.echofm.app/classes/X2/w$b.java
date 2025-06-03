package X2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class w$b
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Object o;
  public final Object p;
  
  public w$b(w paramw)
  {
    Object[] arrayOfObject1 = new Object[paramw.size()];
    Object[] arrayOfObject2 = new Object[paramw.size()];
    g0 localg0 = paramw.g().q();
    for (int i = 0; localg0.hasNext(); i++)
    {
      paramw = (Map.Entry)localg0.next();
      arrayOfObject1[i] = paramw.getKey();
      arrayOfObject2[i] = paramw.getValue();
    }
    o = arrayOfObject1;
    p = arrayOfObject2;
  }
  
  public final Object a()
  {
    Object[] arrayOfObject1 = (Object[])o;
    Object[] arrayOfObject2 = (Object[])p;
    w.a locala = b(arrayOfObject1.length);
    for (int i = 0; i < arrayOfObject1.length; i++) {
      locala.f(arrayOfObject1[i], arrayOfObject2[i]);
    }
    return locala.c();
  }
  
  public w.a b(int paramInt)
  {
    return new w.a(paramInt);
  }
  
  public final Object readResolve()
  {
    Object localObject1 = o;
    if (!(localObject1 instanceof y)) {
      return a();
    }
    Object localObject2 = (y)localObject1;
    Object localObject3 = (t)p;
    localObject1 = b(((AbstractCollection)localObject2).size());
    localObject2 = ((y)localObject2).q();
    localObject3 = ((t)localObject3).q();
    while (((Iterator)localObject2).hasNext()) {
      ((w.a)localObject1).f(((Iterator)localObject2).next(), ((Iterator)localObject3).next());
    }
    return ((w.a)localObject1).c();
  }
}

/* Location:
 * Qualified Name:     X2.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */