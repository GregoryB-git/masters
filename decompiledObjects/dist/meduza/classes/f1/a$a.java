package f1;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

public final class a$a
  extends Handler
{
  public a$a(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    a locala;
    if (what != 1) {
      super.handleMessage(paramMessage);
    } else {
      locala = a;
    }
    synchronized (b)
    {
      int i;
      int j;
      do
      {
        i = d.size();
        if (i <= 0) {
          return;
        }
        paramMessage = new a.b[i];
        d.toArray(paramMessage);
        d.clear();
        j = 0;
      } while (j >= i);
      Object localObject2 = paramMessage[j];
      int k = b.size();
      for (int m = 0; m < k; m++)
      {
        ??? = (a.c)b.get(m);
        if (!d) {
          b.onReceive(a, a);
        }
      }
      j++;
    }
  }
}

/* Location:
 * Qualified Name:     f1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */