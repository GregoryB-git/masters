package nc;

import f;
import rb.h;

public final class c$b
  extends i
{
  public final c<T>[].a a;
  
  public c$b(c.a[] paramArrayOfa)
  {
    a = paramArrayOfa;
  }
  
  public final void h(Throwable paramThrowable)
  {
    i();
  }
  
  public final void i()
  {
    c.a[] arrayOfa = a;
    int i = arrayOfa.length;
    int j = 0;
    while (j < i)
    {
      t0 localt0 = f;
      if (localt0 != null)
      {
        localt0.dispose();
        j++;
      }
      else
      {
        ec.i.i("handle");
        throw null;
      }
    }
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (Throwable)paramObject;
    i();
    return h.a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DisposeHandlersOnCancel[");
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */