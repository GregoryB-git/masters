package b1;

import java.util.Iterator;
import java.util.Map.Entry;
import n.b;
import n.b.e;
import y2.k;

public final class u<T>
  extends w<T>
{
  public b<t<?>, a<?>> a = new b();
  
  public final void onActive()
  {
    Iterator localIterator = a.iterator();
    for (;;)
    {
      Object localObject = (b.e)localIterator;
      if (!((b.e)localObject).hasNext()) {
        break;
      }
      localObject = (a)((Map.Entry)((b.e)localObject).next()).getValue();
      a.observeForever((x)localObject);
    }
  }
  
  public final void onInactive()
  {
    Iterator localIterator = a.iterator();
    for (;;)
    {
      Object localObject = (b.e)localIterator;
      if (!((b.e)localObject).hasNext()) {
        break;
      }
      localObject = (a)((Map.Entry)((b.e)localObject).next()).getValue();
      a.removeObserver((x)localObject);
    }
  }
  
  public static final class a<V>
    implements x<V>
  {
    public final t<V> a;
    public final x<? super V> b;
    public int c = -1;
    
    public a(t paramt, k paramk)
    {
      a = paramt;
      b = paramk;
    }
    
    public final void a(V paramV)
    {
      if (c != a.getVersion())
      {
        c = a.getVersion();
        b.a(paramV);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */