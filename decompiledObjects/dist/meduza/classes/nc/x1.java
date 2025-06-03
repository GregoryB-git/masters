package nc;

import p2.m0;
import rb.f;

public final class x1<T>
  extends n1
{
  public final l<T> e;
  
  public x1(o1.a parama)
  {
    e = parama;
  }
  
  public final void l(Throwable paramThrowable)
  {
    paramThrowable = m().F();
    l locall;
    if ((paramThrowable instanceof u))
    {
      locall = e;
      paramThrowable = f.a(a);
    }
    else
    {
      locall = e;
      paramThrowable = m0.f0(paramThrowable);
    }
    locall.resumeWith(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     nc.x1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */