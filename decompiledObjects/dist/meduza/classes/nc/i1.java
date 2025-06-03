package nc;

import dc.l;
import rb.h;

public final class i1
  extends n1
{
  public final l<Throwable, h> e;
  
  public i1(l<? super Throwable, h> paraml)
  {
    e = paraml;
  }
  
  public final void l(Throwable paramThrowable)
  {
    e.invoke(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     nc.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */