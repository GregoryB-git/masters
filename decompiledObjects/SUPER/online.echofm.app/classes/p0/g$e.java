package p0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

public class g$e
  extends Handler
{
  public g$e(g paramg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = (Pair)obj;
    Object localObject2 = first;
    localObject1 = second;
    int i = what;
    if (i != 1)
    {
      if (i == 2) {
        g.l(a, localObject2, localObject1);
      }
    }
    else {
      g.k(a, localObject2, localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     p0.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */