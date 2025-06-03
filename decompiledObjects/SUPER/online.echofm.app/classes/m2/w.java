package m2;

import U5.a;
import java.util.concurrent.Executor;
import n2.d;

public final class w
  implements h2.b
{
  public final a a;
  public final a b;
  public final a c;
  public final a d;
  
  public w(a parama1, a parama2, a parama3, a parama4)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
  }
  
  public static w a(a parama1, a parama2, a parama3, a parama4)
  {
    return new w(parama1, parama2, parama3, parama4);
  }
  
  public static v c(Executor paramExecutor, d paramd, x paramx, o2.b paramb)
  {
    return new v(paramExecutor, paramd, paramx, paramb);
  }
  
  public v b()
  {
    return c((Executor)a.get(), (d)b.get(), (x)c.get(), (o2.b)d.get());
  }
}

/* Location:
 * Qualified Name:     m2.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */