package o4;

import android.media.MediaCodec;
import android.media.MediaCodec.CryptoInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b5.g;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

public final class c
  extends Handler
{
  public c(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject1 = a;
    localObject1.getClass();
    int i = what;
    ??? = null;
    int j;
    long l;
    int k;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          localObject1 = d;
          paramMessage = new IllegalStateException(String.valueOf(what));
          do
          {
            if (((AtomicReference)localObject1).compareAndSet(null, paramMessage))
            {
              paramMessage = (Message)???;
              break;
            }
          } while (((AtomicReference)localObject1).get() == null);
          paramMessage = (Message)???;
        }
        else
        {
          e.a();
          paramMessage = (Message)???;
        }
      }
      else
      {
        paramMessage = (d.a)obj;
        j = a;
        i = b;
        MediaCodec.CryptoInfo localCryptoInfo = d;
        l = e;
        k = f;
        try
        {
          synchronized (d.h)
          {
            a.queueSecureInputBuffer(j, i, localCryptoInfo, l, k);
          }
        }
        catch (RuntimeException localRuntimeException1)
        {
          localObject1 = d;
          do
          {
            if (((AtomicReference)localObject1).compareAndSet(null, localRuntimeException1)) {
              break;
            }
          } while (((AtomicReference)localObject1).get() == null);
        }
      }
    }
    else
    {
      paramMessage = (d.a)obj;
      int m = a;
      i = b;
      k = c;
      l = e;
      j = f;
      try
      {
        a.queueInputBuffer(m, i, k, l, j);
      }
      catch (RuntimeException localRuntimeException2)
      {
        localObject1 = d;
      }
      while ((!((AtomicReference)localObject1).compareAndSet(null, localRuntimeException2)) && (((AtomicReference)localObject1).get() == null)) {}
    }
    if (paramMessage != null) {
      synchronized (d.g)
      {
        ???.add(paramMessage);
      }
    }
  }
}

/* Location:
 * Qualified Name:     o4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */