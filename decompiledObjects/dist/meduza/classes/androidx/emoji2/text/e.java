package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class e
  extends d.h
{
  public e(d.h paramh, ThreadPoolExecutor paramThreadPoolExecutor) {}
  
  public final void a(Throwable paramThrowable)
  {
    try
    {
      a.a(paramThrowable);
      return;
    }
    finally
    {
      b.shutdown();
    }
  }
  
  public final void b(h paramh)
  {
    try
    {
      a.b(paramh);
      return;
    }
    finally
    {
      b.shutdown();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */