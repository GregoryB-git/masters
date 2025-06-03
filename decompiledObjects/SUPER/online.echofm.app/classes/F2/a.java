package F2;

import A2.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a
  implements ThreadFactory
{
  public final String a;
  public final ThreadFactory b = Executors.defaultThreadFactory();
  
  public a(String paramString)
  {
    n.j(paramString, "Name must not be null");
    a = paramString;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = b.newThread(new b(paramRunnable, 0));
    paramRunnable.setName(a);
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     F2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */