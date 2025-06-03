package nc;

import ub.e;
import uc.c;

public abstract interface j0<T>
  extends j1
{
  public abstract Object await(e<? super T> parame);
  
  public abstract T getCompleted();
  
  public abstract Throwable getCompletionExceptionOrNull();
  
  public abstract c<T> getOnAwait();
}

/* Location:
 * Qualified Name:     nc.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */