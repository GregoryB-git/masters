package u;

import java.util.concurrent.locks.LockSupport;

public final class a$h
{
  public static final h c = new h(false);
  public volatile Thread a;
  public volatile h b;
  
  public a$h()
  {
    a.t.e(this, Thread.currentThread());
  }
  
  public a$h(boolean paramBoolean) {}
  
  public void a(h paramh)
  {
    a.t.d(this, paramh);
  }
  
  public void b()
  {
    Thread localThread = a;
    if (localThread != null)
    {
      a = null;
      LockSupport.unpark(localThread);
    }
  }
}

/* Location:
 * Qualified Name:     u.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */