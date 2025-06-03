package p6;

import V5.n;
import V5.n.a;
import V5.o;
import X5.d;

public final class G0
  extends w0
{
  public final m s;
  
  public G0(m paramm)
  {
    s = paramm;
  }
  
  public void v(Throwable paramThrowable)
  {
    paramThrowable = w().b0();
    m localm;
    n.a locala;
    if ((paramThrowable instanceof z))
    {
      localm = s;
      locala = n.o;
    }
    for (paramThrowable = o.a(a);; paramThrowable = y0.h(paramThrowable))
    {
      localm.resumeWith(n.a(paramThrowable));
      break;
      localm = s;
      locala = n.o;
    }
  }
}

/* Location:
 * Qualified Name:     p6.G0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */