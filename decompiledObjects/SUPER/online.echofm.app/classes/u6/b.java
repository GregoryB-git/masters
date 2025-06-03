package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b
  extends y
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
  private volatile Object _consensus = a.a;
  
  public final Object a(Object paramObject)
  {
    Object localObject1 = a.get(this);
    Object localObject2 = localObject1;
    if (localObject1 == a.a) {
      localObject2 = c(d(paramObject));
    }
    b(paramObject, localObject2);
    return localObject2;
  }
  
  public abstract void b(Object paramObject1, Object paramObject2);
  
  public final Object c(Object paramObject)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    Object localObject1 = localAtomicReferenceFieldUpdater.get(this);
    Object localObject2 = a.a;
    if (localObject1 != localObject2) {
      return localObject1;
    }
    if (u.b.a(localAtomicReferenceFieldUpdater, this, localObject2, paramObject)) {
      return paramObject;
    }
    return localAtomicReferenceFieldUpdater.get(this);
  }
  
  public abstract Object d(Object paramObject);
}

/* Location:
 * Qualified Name:     u6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */