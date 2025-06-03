package p6;

import X5.d;

public final class x0$a
  extends m
{
  public final x0 w;
  
  public x0$a(d paramd, x0 paramx0)
  {
    super(paramd, 1);
    w = paramx0;
  }
  
  public String G()
  {
    return "AwaitContinuation";
  }
  
  public Throwable u(q0 paramq0)
  {
    Object localObject = w.b0();
    if ((localObject instanceof x0.c))
    {
      Throwable localThrowable = ((x0.c)localObject).e();
      if (localThrowable != null) {
        return localThrowable;
      }
    }
    if ((localObject instanceof z)) {
      return a;
    }
    return paramq0.s();
  }
}

/* Location:
 * Qualified Name:     p6.x0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */