package R3;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public class i$a
  extends Y3.c
{
  public i$a(i parami, c4.c paramc) {}
  
  public void g(final Throwable paramThrowable)
  {
    final String str = Y3.c.h(paramThrowable);
    b.c(str, paramThrowable);
    new Handler(i.h(c).getMainLooper()).post(new a(str, paramThrowable));
    d().shutdownNow();
  }
  
  public class a
    implements Runnable
  {
    public a(String paramString, Throwable paramThrowable) {}
    
    public void run()
    {
      throw new RuntimeException(str, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     R3.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */