package com.yandex.metrica;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

class a$b
{
  @NonNull
  public final ICommonExecutor a;
  @NonNull
  public final a.a b;
  private final long c;
  private boolean d = true;
  private final Runnable e = new a();
  
  public a$b(@NonNull a parama, @NonNull a.a parama1, ICommonExecutor paramICommonExecutor, long paramLong)
  {
    b = parama1;
    a = paramICommonExecutor;
    c = paramLong;
  }
  
  public void a()
  {
    if (!d)
    {
      d = true;
      a.executeDelayed(e, c);
    }
  }
  
  public void b()
  {
    if (d)
    {
      d = false;
      a.remove(e);
      b.b();
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      b.a();
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */