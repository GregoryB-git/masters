package v5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import z4.e0;

public final class a0
  implements k
{
  public static final ArrayList b = new ArrayList(50);
  public final Handler a;
  
  public a0(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public static a m()
  {
    synchronized (b)
    {
      a locala;
      if (???.isEmpty())
      {
        locala = new v5/a0$a;
        locala.<init>();
      }
      else
      {
        locala = (a)???.remove(???.size() - 1);
      }
      return locala;
    }
  }
  
  public final boolean a()
  {
    return a.hasMessages(0);
  }
  
  public final a b(int paramInt1, int paramInt2, int paramInt3)
  {
    a locala = m();
    a = a.obtainMessage(paramInt1, paramInt2, paramInt3);
    return locala;
  }
  
  public final boolean c(k.a parama)
  {
    parama = (a)parama;
    ??? = a;
    Message localMessage = a;
    localMessage.getClass();
    boolean bool = ((Handler)???).sendMessageAtFrontOfQueue(localMessage);
    a = null;
    synchronized (b)
    {
      if (((ArrayList)???).size() < 50) {
        ((ArrayList)???).add(parama);
      }
      return bool;
    }
  }
  
  public final a d(e0 parame0, int paramInt)
  {
    a locala = m();
    a = a.obtainMessage(20, 0, paramInt, parame0);
    return locala;
  }
  
  public final boolean e(Runnable paramRunnable)
  {
    return a.post(paramRunnable);
  }
  
  public final a f(int paramInt)
  {
    a locala = m();
    a = a.obtainMessage(paramInt);
    return locala;
  }
  
  public final void g()
  {
    a.removeCallbacksAndMessages(null);
  }
  
  public final boolean h(long paramLong)
  {
    return a.sendEmptyMessageAtTime(2, paramLong);
  }
  
  public final boolean i(int paramInt)
  {
    return a.sendEmptyMessage(paramInt);
  }
  
  public final void j(int paramInt)
  {
    a.removeMessages(paramInt);
  }
  
  public final a k(int paramInt, Object paramObject)
  {
    a locala = m();
    a = a.obtainMessage(paramInt, paramObject);
    return locala;
  }
  
  public final Looper l()
  {
    return a.getLooper();
  }
  
  public static final class a
    implements k.a
  {
    public Message a;
    
    public final void a()
    {
      ??? = a;
      ???.getClass();
      ((Message)???).sendToTarget();
      a = null;
      synchronized (a0.b)
      {
        if (((ArrayList)???).size() < 50) {
          ((ArrayList)???).add(this);
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     v5.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */