package androidx.lifecycle;

class ReflectiveGenericLifecycleObserver
  implements f
{
  public final Object o;
  public final a.a p;
  
  public ReflectiveGenericLifecycleObserver(Object paramObject)
  {
    o = paramObject;
    p = a.c.c(paramObject.getClass());
  }
  
  public void a(h paramh, d.b paramb)
  {
    p.a(paramh, paramb, o);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ReflectiveGenericLifecycleObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */