package t5;

import java.util.concurrent.ThreadFactory;

public class a$b$a
  implements ThreadFactory
{
  public int a = 0;
  
  public a$b$a(a.b paramb) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("flutter-worker-");
    int i = a;
    a = (i + 1);
    localStringBuilder.append(i);
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     t5.a.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */