package p0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

public class h$d
  extends Handler
{
  public h$d(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = (byte[])obj;
    if (arrayOfByte == null) {
      return;
    }
    Iterator localIterator = h.m(a).iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg.t(arrayOfByte)) {
        localg.B(what);
      }
    }
  }
}

/* Location:
 * Qualified Name:     p0.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */