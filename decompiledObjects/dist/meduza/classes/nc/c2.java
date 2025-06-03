package nc;

public final class c2
{
  public static final ThreadLocal<x0> a = new ThreadLocal();
  
  public static x0 a()
  {
    ThreadLocal localThreadLocal = a;
    x0 localx0 = (x0)localThreadLocal.get();
    Object localObject = localx0;
    if (localx0 == null)
    {
      localObject = new g(Thread.currentThread());
      localThreadLocal.set(localObject);
    }
    return (x0)localObject;
  }
}

/* Location:
 * Qualified Name:     nc.c2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */