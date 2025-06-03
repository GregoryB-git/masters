package m2;

import java.util.concurrent.Executor;
import n2.d;
import o2.b;

public class v
{
  public final Executor a;
  public final d b;
  public final x c;
  public final b d;
  
  public v(Executor paramExecutor, d paramd, x paramx, b paramb)
  {
    a = paramExecutor;
    b = paramd;
    c = paramx;
    d = paramb;
  }
  
  public void c()
  {
    a.execute(new t(this));
  }
}

/* Location:
 * Qualified Name:     m2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */