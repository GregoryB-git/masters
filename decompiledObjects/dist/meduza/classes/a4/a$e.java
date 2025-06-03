package a4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o7.t;
import v5.e0;
import v5.f;

public final class a$e
  extends Handler
{
  public a$e(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject1 = (Pair)obj;
    ??? = first;
    localObject1 = second;
    int i = what;
    if (i != 0)
    {
      if (i == 1)
      {
        paramMessage = a;
        if ((??? == x) && (paramMessage.b()))
        {
          x = null;
          if ((localObject1 instanceof Exception)) {
            paramMessage.d((Exception)localObject1, false);
          } else {
            try
            {
              ??? = (byte[])localObject1;
              if (e == 3)
              {
                localObject1 = b;
                byte[] arrayOfByte = w;
                i = e0.a;
                ((o)localObject1).h(arrayOfByte, (byte[])???);
                localObject1 = i;
                synchronized (a)
                {
                  localObject1 = c;
                  ??? = ((Set)localObject1).iterator();
                  if (!((Iterator)???).hasNext()) {
                    return;
                  }
                  ((g.a)((Iterator)???).next()).b();
                }
              }
              ??? = b.h(v, (byte[])???);
              i = e;
              if (((i == 2) || ((i == 0) && (w != null))) && (??? != null) && (???.length != 0)) {
                w = ((byte[])???);
              }
              p = 4;
              Object localObject3 = i;
              synchronized (a)
              {
                localObject3 = c;
                ??? = ((Set)localObject3).iterator();
                if (!((Iterator)???).hasNext()) {
                  return;
                }
                ((g.a)((Iterator)???).next()).a();
              }
              paramMessage = a;
            }
            catch (Exception localException1)
            {
              paramMessage.d(localException1, true);
            }
          }
        }
      }
    }
    else if ((localException1 == y) && ((p == 2) || (paramMessage.b())))
    {
      y = null;
      Object localObject6;
      if ((localObject4 instanceof Exception))
      {
        paramMessage = c;
        localObject6 = (Exception)localObject4;
        ((b.e)paramMessage).a((Exception)localObject6, false);
      }
      else
      {
        try
        {
          b.i((byte[])localObject4);
          paramMessage = (b.e)c;
          b = null;
          localObject6 = t.p(a);
          a.clear();
          localObject6 = ((t)localObject6).r(0);
          while (((o7.a)localObject6).hasNext())
          {
            paramMessage = (a)((o7.a)localObject6).next();
            if (paramMessage.m()) {
              paramMessage.a(true);
            }
          }
          return;
        }
        catch (Exception localException2)
        {
          ((b.e)c).a(localException2, true);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     a4.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */