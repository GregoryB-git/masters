package sc;

import b.a0;
import d2.h0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a<T>
  extends p
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
  private volatile Object _consensus = a0.X;
  
  public final Object a(Object paramObject)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    Object localObject1 = localAtomicReferenceFieldUpdater.get(this);
    h0 localh0 = a0.X;
    Object localObject2 = localObject1;
    if (localObject1 == localh0)
    {
      localObject1 = c(paramObject);
      localObject2 = localAtomicReferenceFieldUpdater.get(this);
      if (localObject2 == localh0)
      {
        do
        {
          if (localAtomicReferenceFieldUpdater.compareAndSet(this, localh0, localObject1))
          {
            i = 1;
            break;
          }
        } while (localAtomicReferenceFieldUpdater.get(this) == localh0);
        int i = 0;
        if (i != 0) {
          localObject2 = localObject1;
        } else {
          localObject2 = a.get(this);
        }
      }
    }
    b(paramObject, localObject2);
    return localObject2;
  }
  
  public abstract void b(T paramT, Object paramObject);
  
  public abstract h0 c(Object paramObject);
}

/* Location:
 * Qualified Name:     sc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */