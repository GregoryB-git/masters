package nc;

import ub.e;

public final class o1$a<T>
  extends l<T>
{
  public final o1 q;
  
  public o1$a(e<? super T> parame, o1 paramo1)
  {
    super(1, parame);
    q = paramo1;
  }
  
  public final Throwable r(o1 paramo1)
  {
    Object localObject = q.F();
    if ((localObject instanceof o1.c))
    {
      Throwable localThrowable = ((o1.c)localObject).c();
      if (localThrowable != null) {
        return localThrowable;
      }
    }
    if ((localObject instanceof u)) {
      return a;
    }
    return paramo1.getCancellationException();
  }
  
  public final String z()
  {
    return "AwaitContinuation";
  }
}

/* Location:
 * Qualified Name:     nc.o1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */