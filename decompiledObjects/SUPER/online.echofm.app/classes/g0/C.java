package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public final class C
  implements k
{
  public static final List b = new ArrayList(50);
  public final Handler a;
  
  public C(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public static b m()
  {
    synchronized (b)
    {
      if (???.isEmpty())
      {
        b localb1 = new g0/C$b;
        localb1.<init>(null);
      }
    }
    localb2 = (b)???.remove(???.size() - 1);
    return localb2;
  }
  
  public static void n(b paramb)
  {
    synchronized (b)
    {
      if (???.size() < 50) {
        ???.add(paramb);
      }
    }
  }
  
  public boolean a(int paramInt)
  {
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    return a.hasMessages(paramInt);
  }
  
  public k.a b(int paramInt1, int paramInt2, int paramInt3)
  {
    return m().d(a.obtainMessage(paramInt1, paramInt2, paramInt3), this);
  }
  
  public boolean c(int paramInt)
  {
    return a.sendEmptyMessage(paramInt);
  }
  
  public boolean d(k.a parama)
  {
    return ((b)parama).c(a);
  }
  
  public boolean e(int paramInt, long paramLong)
  {
    return a.sendEmptyMessageAtTime(paramInt, paramLong);
  }
  
  public void f(int paramInt)
  {
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    a.removeMessages(paramInt);
  }
  
  public k.a g(int paramInt, Object paramObject)
  {
    return m().d(a.obtainMessage(paramInt, paramObject), this);
  }
  
  public void h(Object paramObject)
  {
    a.removeCallbacksAndMessages(paramObject);
  }
  
  public Looper i()
  {
    return a.getLooper();
  }
  
  public boolean j(Runnable paramRunnable)
  {
    return a.post(paramRunnable);
  }
  
  public k.a k(int paramInt)
  {
    return m().d(a.obtainMessage(paramInt), this);
  }
  
  public static final class b
    implements k.a
  {
    public Message a;
    public C b;
    
    public void a()
    {
      ((Message)a.e(a)).sendToTarget();
      b();
    }
    
    public final void b()
    {
      a = null;
      b = null;
      C.l(this);
    }
    
    public boolean c(Handler paramHandler)
    {
      boolean bool = paramHandler.sendMessageAtFrontOfQueue((Message)a.e(a));
      b();
      return bool;
    }
    
    public b d(Message paramMessage, C paramC)
    {
      a = paramMessage;
      b = paramC;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     g0.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */