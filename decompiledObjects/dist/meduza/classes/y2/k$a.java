package y2;

import b1.w;
import o.a;

public final class k$a
  implements Runnable
{
  public final void run()
  {
    synchronized (b.c)
    {
      Object localObject2 = b.d.apply(a);
      k localk = b;
      Object localObject3 = a;
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

/* Location:
 * Qualified Name:     y2.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */