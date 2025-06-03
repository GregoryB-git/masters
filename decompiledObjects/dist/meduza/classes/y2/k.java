package y2;

import a3.b;
import b1.u;
import b1.w;
import b1.x;
import o.a;
import p2.j0;

public final class k
  implements x<Object>
{
  public Object a = null;
  
  public k(b paramb, Object paramObject, j0 paramj0, u paramu) {}
  
  public final void a(final Object paramObject)
  {
    b.d(new a(paramObject));
  }
  
  public final class a
    implements Runnable
  {
    public final void run()
    {
      synchronized (b.c)
      {
        Object localObject2 = b.d.apply(paramObject);
        k localk = b;
        Object localObject3 = paramObject;
        if ((localObject3 == null) && (localObject2 != null)) {
          a = localObject2;
        }
        for (localObject3 = e;; localObject3 = e)
        {
          ((w)localObject3).postValue(localObject2);
          break;
          if ((localObject3 == null) || (localObject3.equals(localObject2))) {
            break;
          }
          localObject3 = b;
          a = localObject2;
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     y2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */